/**
 * Created by Alex on 3/20/20.
 */
import java.util.*;

class Listener extends LittleGBaseListener{
    static final String GLOBAL = "GLOBAL";
    static final String BLOCK = "BLOCK ";
    static final String STRING_VALUE = "STRING value ";
    final String DECLARATION_ERROR = "DECLARATION ERROR";
    final String ERROR = "error";
    Stack<LinkedHashMap<String,String>> scopeStack = new Stack<LinkedHashMap<String,String>>();
    LinkedHashMap<String, LinkedHashMap<String,String>> finalTable = new LinkedHashMap<String, LinkedHashMap<String,String>>();
    int currentBlock = 0;
    String errorText = "";

    public LinkedHashMap<String, LinkedHashMap<String, String>> getSymbolTable(){
        if(errorText.isEmpty()){//check if any declaration errors occurred
            return finalTable;
        } else {
            LinkedHashMap<String,String> error = new LinkedHashMap<String,String>();
            LinkedHashMap<String, LinkedHashMap<String,String>> errorTable = new LinkedHashMap<String, LinkedHashMap<String,String>>();
            error.put(ERROR, errorText);
            errorTable.put(DECLARATION_ERROR, error);
            return errorTable;
        }
    }

    /*
    These methods are used when the listener enters a new scope.
    When entering a scope we push the new scope onto the scopestack
    and add our new table entry to the symbol table.
    They include:
        entering the program
        entering a function declaration
        entering an else statement
        entering a while statement
        entering an if statment

     */
    @Override
    public void enterProgram(LittleGParser.ProgramContext ctx){
        scopeStack.push(new LinkedHashMap<String, String>());
        finalTable.put(GLOBAL, scopeStack.peek());
    }

    @Override
    public void enterFunc_decl(LittleGParser.Func_declContext ctx){
        scopeStack.push(new LinkedHashMap<String, String>());
        finalTable.put(ctx.id().getStart().getText(), scopeStack.peek());
    }

    @Override
    public void enterElse_part(LittleGParser.Else_partContext ctx){
        if(0 < ctx.getChildCount()){ // must check children since this is an else statement
            scopeStack.pop();
            scopeStack.push(new LinkedHashMap<String, String>());
            currentBlock++;
            finalTable.put(BLOCK + currentBlock, scopeStack.peek());
        }
    }

    @Override
    public void enterWhile_stmt(LittleGParser.While_stmtContext ctx){
        scopeStack.push(new LinkedHashMap<String, String>());
        currentBlock++;
        finalTable.put(BLOCK + currentBlock, scopeStack.peek());
    }

    @Override
    public void enterIf_stmt(LittleGParser.If_stmtContext ctx){
        scopeStack.push(new LinkedHashMap<String, String>());
        currentBlock++;
        finalTable.put(BLOCK + currentBlock, scopeStack.peek());
    }

    /*
    These methods are used when the listener exits a given scope
    When exiting a scope we pop the top element off of the scope stack
    They include:
        exiting the program
        exiting an else statement
        exiting a function declaration
        exiting a while statement
        exiting an if statment

     */
    @Override
    public void exitProgram(LittleGParser.ProgramContext ctx){
        scopeStack.pop();
    }

    @Override
    public void exitElse_part(LittleGParser.Else_partContext ctx){
        if(0 < ctx.getChildCount()){
            scopeStack.pop();
        }
    }

    @Override
    public void exitFunc_decl(LittleGParser.Func_declContext ctx){
        scopeStack.pop();
    }

    @Override
    public void exitWhile_stmt(LittleGParser.While_stmtContext ctx){
        scopeStack.pop();
    }

    @Override
    public void exitIf_stmt(LittleGParser.If_stmtContext ctx){
        if(!(0 < ctx.else_part().getChildCount())){
            scopeStack.pop();
        }
    }

    /*
    These methods are used to add variables, parameters, and strings to the symbol table
    They include:
        Declaring a variable
        Declaring a parameter
        Declaring a String
     */
    @Override
    public void exitVar_decl(LittleGParser.Var_declContext ctx){
        //peek the current scope so we can add to it
        LinkedHashMap<String, String> currentScope = scopeStack.peek();
        addToScopeTable(currentScope, ctx, ctx.var_type().getStart().getText());
    }

    @Override
    public void exitParam_decl(LittleGParser.Param_declContext ctx){
        //peek the current scope so we can add to it
        LinkedHashMap<String,String> scope = scopeStack.peek();
        addToScopeTable(scope, ctx);
    }

    @Override
    public void exitString_decl(LittleGParser.String_declContext ctx){
        //peek the current scope so we can add to it
        LinkedHashMap<String,String> scope = scopeStack.peek();
        addToScopeTable(scope, ctx);
    }

    /*
    Three overloaded methods will be used to add new strings, functions and parameters to the given scope stack.
     */
    public void addToScopeTable(LinkedHashMap<String,String> currentScope, LittleGParser.Var_declContext ctx, String variableType) {
        LittleGParser.Id_tailContext ctxList = ctx.id_list().id_tail();
        if(currentScope.containsKey(ctx.id_list().getStart().getText())){
            if(errorText.isEmpty()){
                errorText = ctx.id_list().getStart().getText();
            }
        } else if (!(currentScope.containsKey(ctx.id_list().getStart().getText()))){
            currentScope.put(ctx.id_list().getStart().getText(), variableType);
            while(ctxList.getStart().getText().contains(",")){
                //get next variable id's if any exist and not already declared
                if(!(currentScope.containsKey(ctxList.id().getStart().getText()))){
                    currentScope.put(ctxList.id().getStart().getText(), variableType);
                    ctxList = ctxList.id_tail();
                } else{//duplicate declaration found
                    if(errorText.isEmpty()){
                        errorText = ctxList.id().getStart().getText();
                    }
                }
            }
        }
    }

    public void addToScopeTable(LinkedHashMap<String,String> currentScope, LittleGParser.String_declContext ctx) {
        if(!(currentScope.containsKey(ctx.id().getStart().getText()))){
            currentScope.put(ctx.id().getStart().getText(), STRING_VALUE + ctx.str().getStart().getText());
        } else {
            if(errorText == ""){
                errorText = ctx.id().getStart().getText();
            }
        }
    }

    public void addToScopeTable(LinkedHashMap<String,String> currentScope, LittleGParser.Param_declContext ctx) {
        if(!(currentScope.containsKey(ctx.id().getStart().getText()))){
            currentScope.put(ctx.id().getStart().getText(), ctx.var_type().getStart().getText());
        } else {
            if(errorText == ""){
                errorText = ctx.id().getStart().getText();
            }
        }
    }
}