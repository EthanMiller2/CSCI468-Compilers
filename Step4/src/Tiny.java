import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * Created by Alex on 4/21/20.
 */
public class Tiny {

    final String DECLARATION_ERROR = "DECLARATION ERROR";
    final String ERROR = "error";

    private ArrayList<String> output;
    private ArrayList<String> ir;
    private LinkedHashMap<String, LinkedHashMap<String,String>> st;

    public Tiny(ArrayList<String> ir, LinkedHashMap<String, LinkedHashMap<String,String>> st){
        this.ir = ir;
        this.st = st;
        output = new ArrayList<String>();
    }

    public void buildTiny(){
        try {
            String errorMessage = st.get(DECLARATION_ERROR).get(ERROR);
            System.out.println(DECLARATION_ERROR + " " + errorMessage);
        } catch (Exception e) {
            st.forEach((key, value) -> {
                value.forEach((name, type) -> {
                    if(type.equals("INT") || type.equals("FLOAT")){
                        output.add("var " + name);
                    } else {
                        output.add("str " +name + type.replace("STRING value", ""));
                    }
                });
            });
        }
        int currentReg = 0;
        for(int i = 0; i < ir.size(); i++) {
            String[] currentIR = ir.get(i).split(" ");
            // handle WRITE and READ
            if (ir.get(i).contains("WRITEI")) {
                output.add("sys writei " + currentIR[1]);
            } else if (ir.get(i).contains("WRITEF")) {
                output.add("sys writer " + currentIR[1]);
            } else if (ir.get(i).contains("WRITES")) {
                output.add("sys writes " + currentIR[1]);
            } else if (ir.get(i).contains("READI")) {
                output.add("sys readi " + currentIR[1]);  // handle STORE
            } else if(ir.get(i).contains("STOREI") || ir.get(i).contains("STOREF")){
                if(currentIR[1].contains("$")){
                    String[] parsedStore = currentIR[1].split("T");
                    output.add("move r"+ (Integer.parseInt(parsedStore[1])-1) + " " + currentIR[2]);
                } else {
                    String[] parsedStore = currentIR[2].split("T");
                    output.add("move "+ currentIR[1]+ " r"+(Integer.parseInt(parsedStore[1])-1));
                }
            } else if (ir.get(i).contains("MULTI")) { // handle MULT

            }
        }





        output.add("sys halt");
        printTiny();
    }

    private void printTiny(){
        for(int i = 0; i < output.size(); i++){
            System.out.println(output.get(i));
        }
    }
}
