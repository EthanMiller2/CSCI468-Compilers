import java.util.*;

/**
 * Created by Alex on 4/17/20.
 */
public class IR {
    private final String LABEL = "LABEL ";
    private final String LINK = "LINK";
    private final String READ = "READ";
    private final String WRITE = "WRITE";
    private final String STORE = "STORE";
    private ArrayList<String> ir = new ArrayList<String>();
    private LinkedHashMap<String, LinkedHashMap<String,String>> st;
    private int currentRegister = 1;
    private boolean expr = false;
    private boolean notInMulOrAdd = true;
    private String dataType;

    private ArrayList<String> expressionStack;
    private ArrayList<String> postFixRep;
    private String currentPrimary = "";

    public IR(LinkedHashMap<String, LinkedHashMap<String,String>> st){
        this.st = st;
        ir.add("IR code");
        expressionStack = new ArrayList<String>();
        postFixRep = new ArrayList<String>();
    }

    public void exitProgram(){
        ir.add("RET");
        ir.add("tiny code");
        printIR();
    }

    public void enterFunction(String functionName){
        ir.add(LABEL + functionName);
        ir.add(LINK);
    }

    public void exitRead(String s){
        String[] readVars = s.split(",");
        for(int i = 0; i < readVars.length; i++){
            String variableType = findKeyType(readVars[i]);;
            ir.add(READ+variableType+" "+readVars[i]);
        }
    }

    public void exitWrite(String s){
        String[] writeVars = s.split(",");
        for(int i = 0; i < writeVars.length; i++){
            String variableType = findKeyType(writeVars[i]);;
            ir.add(WRITE+variableType+" "+writeVars[i]);
        }

    }

    public void enterExpression() {
        expr = true;
        expressionStack.add(0,"(");
    }

    public void exitExpression() {
        expressionStack.add(0,")");
        clearExpressionStack();
    }

    public void addElement(String element) {
        if (!expr) return;
        postFixRep.add(element);
    }

    public void addOperator(String operator) {
        notInMulOrAdd = false;

        if(operator.equals("+") || operator.equals("-")){
            if (expressionStack.get(0).equals("(") || expressionStack.isEmpty()) {
                expressionStack.add(0,operator);
            } else {
                postFixRep.add(expressionStack.remove(0));
                addOperator(operator);
            }
        } else {
            if (expressionStack.get(0).equals("*") || expressionStack.get(0).equals("/")) {
                postFixRep.add(expressionStack.remove(0));
                addOperator(operator);
            } else {
                expressionStack.add(0, operator);
            }
        }
    }

    private void clearExpressionStack() {
        if (postFixRep.size() == 1) {
            expressionStack.add(0, postFixRep.get(0));
        } else {
            expr = false;
            while (!expressionStack.isEmpty()) {
                if (!expressionStack.get(0).equals(")") && !expressionStack.get(0).equals("(")) {
                    postFixRep.add(expressionStack.remove(0));
                } else {
                    expressionStack.remove(0);
                }
            }
            expressionToIRRep();
        }
        postFixRep.clear();
    }

    private String elementToIR(String element) {
        if (isNumber(element)) {
            if(element.contains(".")){
                dataType = "F";
            } else {
                dataType = "I";
            }

            ir.add(STORE + dataType + " " + element + " $T" + currentRegister);
            element = "$T" + (currentRegister-1);
        }
        return element;
    }


    private void expressionToIRRep() {
        if (isNumber(postFixRep.get(0))) {
            if(postFixRep.get(0).contains(".")){
                dataType = "F";
            } else {
                dataType = "I";
            }
        } else {
            dataType = findKeyType(postFixRep.get(0));
        }


        for (String element : postFixRep) {
            if (element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/")) {
                if(element.equals("+")){
                    expressionStack.add(0,"$T"+currentRegister);
                    ir.add("ADD"+dataType+" "+elementToIR(expressionStack.remove(1))+" "+elementToIR(expressionStack.remove(0))+ " $T"+currentRegister++);
                } else if(element.equals("-")){
                    expressionStack.add(0,"$T"+currentRegister);
                    ir.add("SUB"+dataType+" "+elementToIR(expressionStack.remove(1))+" "+elementToIR(expressionStack.remove(0))+ " $T"+currentRegister++);
                } else if(element.equals("*")){
                    expressionStack.add(0,"$T"+currentRegister);
                    ir.add("MUL"+dataType+" "+elementToIR(expressionStack.remove(1))+" "+elementToIR(expressionStack.remove(0))+ " $T"+currentRegister++);
                } else {
                    expressionStack.add(0,"$T"+currentRegister);
                    ir.add("DIV"+dataType+" "+elementToIR(expressionStack.remove(1))+" "+elementToIR(expressionStack.remove(0))+ " $T"+currentRegister++);
                }
            } else {
                expressionStack.add(0, element);
            }
        }
    }

    public void addPrimary(String primary){
        this.currentPrimary = primary;
    }

    public void exitAssignment(String s){
        if(notInMulOrAdd) {
            ir.add(STORE + findKeyType(s) + " " + currentPrimary + " $T" + currentRegister);
            ir.add(STORE + findKeyType(s) + " $T" + currentRegister + " " + s);
            currentRegister++;

        } else {
            notInMulOrAdd = true;
            ir.add(STORE + findKeyType(s) + " $T" + (currentRegister-1) + " " + s);
        }
        reset();
    }

    public void updateSymbolTable(LinkedHashMap<String, LinkedHashMap<String,String>> st){
        this.st = st;
    }

    private String findKeyType(String targetKey){
        for (Map.Entry<String, LinkedHashMap<String, String>> scope : st.entrySet()) {
            for (Map.Entry<String, String> scopeTable : scope.getValue().entrySet()) {
                if(scopeTable.getKey().equals(targetKey)){
                    return scopeTable.getValue().substring(0, 1);
                }
            }
        }
        return null;
    }

    private boolean isNumber(String number) {
        return number.matches("[0-9]*(\\.[0-9]+)");
    }

    private void printIR(){
        for(int i = 0; i < ir.size(); i++){
            System.out.println(";"+ir.get(i));
        }
    }

    private void reset(){
        expressionStack.clear();
        postFixRep.clear();
    }
}
