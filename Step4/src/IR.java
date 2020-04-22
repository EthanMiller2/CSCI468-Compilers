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
    private boolean inAnExpression = false;
    private boolean notInMulOrAdd = true;
    private String dataType;
    private String infixString;
    private ArrayList<String> infixExpression;
    private Stack<Character> stack;
    private String postfixRep;
    private String currentPrimary = "";
    private int nestedExpression = 0;

    public IR(LinkedHashMap<String, LinkedHashMap<String,String>> st){
        this.st = st;
        ir.add("IR code");

        stack = new Stack<Character>();
        infixExpression = new ArrayList<String>();
    }

    public void exitProgram(){
        ir.add("RET");
        ir.add("tiny code");
        printIR();
        Tiny tiny = new Tiny(ir, st);
//        tiny.buildTiny();
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
        inAnExpression = true;
        System.out.println("we are now in an expression");
        System.out.println();
        infixExpression.add("(");
    }

    public void exitExpression() {
        infixExpression.add(")");
        inAnExpression = false;
        System.out.println("we have just left an expression");
    }

    public void addElement(String element) {
        if(!element.contains("(")){
            System.out.println("adding element "+element);
            infixExpression.add(element);
        }
    }

    public void addOperator(String operator) {
        System.out.println("adding operator " +operator);
        notInMulOrAdd = false;
        infixExpression.add(operator);
    }

    public void exitAssignment(String s){
        // this is where we will store the last assignemnt
        System.out.println("Below is the infix expression");
        infixString = "";
        for (String s1 : infixExpression) {
            System.out.print(s1);
            infixString += s1;
        }
        infixExpression.clear();
        System.out.println();
        System.out.println("we will now convert the expression to postfix");
        postfixRep = "";
        stack.clear();
        convertInfixToPostfix();
        System.out.println("now printing postfix rep");
        System.out.println(postfixRep);

        System.out.println();
        System.out.println("Assigning expression to " +s);

    }
    public void convertPostfixToIR(){

    }

    public void convertInfixToPostfix(){
        for (int i = 0; i < infixString.length(); i++) {
            char x = infixString.charAt(i);
            
            if (Character.isLetterOrDigit(x)){
                postfixRep += x;
            } else if (x == '('){
                stack.push(x);
            } else if (x == ')') {
                while (!stack.isEmpty() && stack.peek() != '('){
                    postfixRep += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(x) <= precedence(stack.peek())){
                    postfixRep += stack.pop();
                }
                stack.push(x);
            }
        }
    }















    public int precedence(char symbol)
    {
        if(symbol == '*' || symbol == '/') {
            return(2);
        } else if(symbol == '+' || symbol == '-'){
            return(1);
        } else {
            return(0);
        }
    }









    public void addPrimary(String primary){
        if(inAnExpression==false) {
//            System.out.println("adding primary "+primary);
//            this.currentPrimary = primary;
        }
//        System.out.println("adding primary "+primary);

    }
    // various helper methods
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


    private boolean isThisVar(String var) {
        return var.matches("([a-zA-Z])([a-zA-Z])*");
    }

    private boolean isThisOp(String x) {
        return x.equals("*") || x.equals("/") || x.equals("+") || x.equals("-");
    }

    private void printIR(){
        for(int i = 0; i < ir.size(); i++){
            System.out.println(";"+ir.get(i));
        }
    }

    private void reset(){
        infixExpression.clear();
    }
}
