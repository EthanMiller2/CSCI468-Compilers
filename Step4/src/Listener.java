/**
 * Created by Alex on 3/20/20.
 */
import java.util.*;

class Listener extends LittleGBaseListener{
    private static final String GLOBAL = "GLOBAL";
    private static final String BLOCK = "BLOCK ";
    private static final String STRING_VALUE = "STRING value ";
    private final String DECLARATION_ERROR = "DECLARATION ERROR";
    private final String ERROR = "error";
    private Stack<LinkedHashMap<String,String>> scopeStack = new Stack<LinkedHashMap<String,String>>();
    private LinkedHashMap<String, LinkedHashMap<String,String>> finalTable = new LinkedHashMap<String, LinkedHashMap<String,String>>();
    private int currentBlock = 0;
    private String errorText = "";
    private IR ir;

    public LinkedHashMap<String, LinkedHashMap<String, String>> getSymbolTable(){
        if(errorText.isEmpty()){
            return finalTable;
        } else {
            LinkedHashMap<String,String> error = new LinkedHashMap<String,String>();
            LinkedHashMap<String, LinkedHashMap<String,String>> errorTable = new LinkedHashMap<String, LinkedHashMap<String,String>>();
            error.put(ERROR, errorText);
            errorTable.put(DECLARATION_ERROR, error);
            return errorTable;
        }
    }

    @Override public void exitRead_stmt(LittleGParser.Read_stmtContext ctx) {
        ir.exitRead(ctx.getChild(2).getText());
    }

    @Override public void exitWrite_stmt(LittleGParser.Write_stmtContext ctx) {
        ir.exitWrite(ctx.getChild(2).getText());
    }

    @Override public void enterExpr(LittleGParser.ExprContext ctx) {
        ir.enterExpression();
    }

    @Override public void exitExpr(LittleGParser.ExprContext ctx) {
        ir.exitExpression();
    }

    @Override public void exitAssign_expr(LittleGParser.Assign_exprContext ctx) {
        ir.exitAssignment(ctx.getChild(0).getText());
        ir.addPrimary(ctx.getChild(0).getText());
    }

    @Override public void exitAddop(LittleGParser.AddopContext ctx) {
        ir.addOperator(ctx.getText());
    }

    @Override public void exitMulop(LittleGParser.MulopContext ctx) {
        ir.addOperator(ctx.getText());
    }

    @Override public void exitPrimary(LittleGParser.PrimaryContext ctx) {
        ir.addPrimary(ctx.getText());
        ir.addElement(ctx.getText());
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
        ir = new IR(finalTable);
    }

    @Override
    public void enterFunc_decl(LittleGParser.Func_declContext ctx){
        scopeStack.push(new LinkedHashMap<String, String>());
        finalTable.put(ctx.id().getStart().getText(), scopeStack.peek());
        ir.enterFunction(ctx.id().getStart().getText());
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
        ir.exitProgram();
    }

    @Override
    public void exitFunc_decl(LittleGParser.Func_declContext ctx){
        scopeStack.pop();
        ir.updateSymbolTable(finalTable);
    }

    @Override
    public void exitElse_part(LittleGParser.Else_partContext ctx){
        if(0 < ctx.getChildCount()){
            scopeStack.pop();
        }
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
                if(!(currentScope.containsKey(ctxList.id().getStart().getText()))){
                    currentScope.put(ctxList.id().getStart().getText(), variableType);
                    ctxList = ctxList.id_tail();
                } else{
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
        if (!(currentScope.containsKey(ctx.id().getStart().getText()))) {
            currentScope.put(ctx.id().getStart().getText(), ctx.var_type().getStart().getText());
        } else {
            if (errorText == "") {
                errorText = ctx.id().getStart().getText();
            }
        }
    }
}