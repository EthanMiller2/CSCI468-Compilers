import java.util.*;

/**
 * Created by Alex on 4/17/20.
 */
public class IR {
    private final String LABEL = "LABEL ";
    private final String LINK = "LINK";
    private final String READ = "READ";
    private final String WRITE = "WRITE";
    private ArrayList<String> ir = new ArrayList<String>();
    private LinkedHashMap<String, LinkedHashMap<String,String>> st;
    private int currentRegister = 1;
    private boolean expr = false;

    public IR(LinkedHashMap<String, LinkedHashMap<String,String>> st){
        this.st = st;
        ir.add("IR code");
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

    public void exitAssignment(String s){

        System.out.println(s + " "+currentRegister);
        System.out.println("exiting assingment");

        currentRegister++;
    }

    public void addOperator(String op){
        System.out.println("adding op "+ op);
    }

    public void addPrimary(String primary){
        System.out.println("adding primary "+ primary);
    }




















    public void setExpression(boolean expr){
        this.expr = expr;
        System.out.println("Setting in expression " + this.expr);
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

    private void printIR(){
        for(int i = 0; i < ir.size(); i++){
            System.out.println(";"+ir.get(i));
        }
    }

}
