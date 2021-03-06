import java.util.*;

public class IR {
    private ArrayList<String> ir;
    private LinkedHashMap<String, LinkedHashMap<String,String>> st;
    private int currentRegister = 1;
    private boolean notInMulOrAdd = true;
    private String infixString;
    private ArrayList<String> infixExpression;
    private ArrayList<String> postfixExpression;
    private Stack<Character> stack;
    private Stack<String> irStack;
    private String postfixString;
    private String currentPrimary = "";

    // IR constructor
    public IR(LinkedHashMap<String, LinkedHashMap<String,String>> st){
        this.st = st;
        ir = new ArrayList<String>();
        stack = new Stack<Character>();
        irStack = new Stack<String>();
        infixExpression = new ArrayList<String>();
        postfixExpression = new ArrayList<String>();
        ir.add("IR code");
    }
    // called when the listener exits the function
    public void exitProgram(){
        ir.add("RET");
        ir.add("tiny code");
        printIR();
        Tiny tiny = new Tiny(ir, st);
        tiny.buildTiny();
    }
    // called when the listener encounters a new function
    public void enterFunction(String functionName){
        ir.add("LABEL " + functionName);
        ir.add("LINK");
    }

    // called when the listener encounters a read statement
    public void exitRead(String s){
        String[] readVars = s.split(",");
        for(int i = 0; i < readVars.length; i++){
            String variableType = findKeyType(readVars[i]);;
            ir.add("READ"+variableType+" "+readVars[i]);
        }
    }

    // called when the listener encounters a write statement
    public void exitWrite(String s){
        String[] writeVars = s.split(",");
        for(int i = 0; i < writeVars.length; i++){
            String variableType = findKeyType(writeVars[i]);;
            ir.add("WRITE"+variableType+" "+writeVars[i]);
        }
    }

    // called when the listener encounters a primary
    public void addPrimary(String primary){
        currentPrimary = primary;
    }

    // called when the listener enters an expression
    public void enterExpression() {
        infixExpression.add("(");
    }

    // called when the listener exits an expression
    public void exitExpression() {
        infixExpression.add(")");
    }

    // called when the listener encounters an element
    public void addElement(String element) {
        if(!element.contains("(")){
            infixExpression.add(element);
        }
    }

    // called when the listener encounters an operator
    public void addOperator(String operator) {
        notInMulOrAdd = false;
        infixExpression.add(operator);
    }

    // Assumes the responsibility of adding most STORE lines of the IR code.
    // calls for all infix expressions be converted to postfix and subsequently
    // converts the postfix expressions into IR
    public void exitAssignment(String s){
        infixString = "";
        for (String s1 : infixExpression) {
            infixString += s1;
        }
        infixExpression.clear();
        postfixString = "";
        stack.clear();
        convertInfixToPostfix();
        convertPostfixToIR();
        if(notInMulOrAdd) {
            ir.add("STORE" + findKeyType(s) + " " + currentPrimary + " $T" + currentRegister);
            ir.add("STORE" + findKeyType(s) + " $T" + currentRegister + " " + s);
            currentRegister++;

        } else {
            notInMulOrAdd = true;
            ir.add("STORE" + findKeyType(s) + " $T" + (currentRegister-1) + " " + s);
        }
    }

    // converts the postfix expression generated into IR code and appends it to the IR list
    private void convertPostfixToIR(){
        String dataType = findDataType(postfixExpression.get(0));

        for (String pfe : postfixExpression) {
            if (pfe.equals("+") || pfe.equals("-") || pfe.equals("*") || pfe.equals("/")) {
                String operand2 = pfeToIR(irStack.remove(0));
                String operand1 = pfeToIR(irStack.remove(0));
                if(pfe.equals("*")){
                    irStack.add(0,"$T"+currentRegister);
                    ir.add("MULT"+dataType+" "+operand1+" "+operand2+ " $T"+currentRegister++);
                } else if (pfe.equals("/")){
                    irStack.add(0,"$T"+currentRegister);
                    ir.add("DIV"+dataType+" "+operand1+" "+operand2+ " $T"+currentRegister++);
                } else if(pfe.equals("+")){
                    irStack.add(0,"$T"+currentRegister);
                    ir.add("ADD"+dataType+" "+operand1+" "+operand2+ " $T"+currentRegister++);
                } else if(pfe.equals("-")){
                    irStack.add(0,"$T"+currentRegister);
                    ir.add("SUB"+dataType+" "+operand1+" "+operand2+ " $T"+currentRegister++);
                }
            } else {
                irStack.add(0, pfe);
            }
        }
    }

    // converts and infix string to postfix notation to be easily converted later on
    public void convertInfixToPostfix(){
        for (int i = 0; i < infixString.length(); i++) {
            char x = infixString.charAt(i);

            if (Character.isLetterOrDigit(x)){
                postfixString += x;
            } else if (x == '('){
                stack.push(x);
            } else if (x == ')') {
                while (!stack.isEmpty() && stack.peek() != '('){
                    postfixString += stack.pop();
                }
                if(!stack.isEmpty())
                    stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(x) <= precedence(stack.peek())){
                    postfixString += stack.pop();
                }
                stack.push(x);
            }
        }
        postfixExpression.clear();
        for(int i = 0; i < postfixString.length(); i++){
            postfixExpression.add(postfixString.charAt(i)+"");
        }
    }
    // Helper method to convert a given post fix expression into IR
    private String pfeToIR(String pfe) {
        String dataType;
        if (isThisANumber(pfe)) {
            if(pfe.contains(".")){
                dataType = "F";
            } else {
                dataType = "I";
            }
            pfe = "$T" + (currentRegister-1);
            ir.add("STORE" + dataType + " " + pfe + " $T" + currentRegister);

        }
        return pfe;
    }

    // various helper methods
    public void updateSymbolTable(LinkedHashMap<String, LinkedHashMap<String,String>> st){
        this.st = st;
    }

    // returns the precedence for a given operator
    private int precedence(char symbol) {
        if(symbol == '*' || symbol == '/') {
            return(2);
        } else if(symbol == '+' || symbol == '-'){
            return(1);
        } else {
            return(0);
        }
    }

    // finds the data type of a given string
    private String findDataType(String s){
        String dataType;
        if (isThisANumber(s)) {
            if(s.contains(".")){
                dataType = "F";
            } else {
                dataType = "I";
            }
        } else {
            dataType = findKeyType(s);
        }

        return dataType;
    }

    // finds the data type of a given key
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

    // returns true if the parameter is a number false otherwise
    private boolean isThisANumber(String number) {
        return number.matches("[0-9]*(\\.[0-9]+)");
    }

    // print method to quickly print out the IR list
    private void printIR(){
        for(int i = 0; i < ir.size(); i++){
            System.out.println(";"+ir.get(i));
        }
    }
}
