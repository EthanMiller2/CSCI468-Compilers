import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Tiny {
    private final String DECLARATION_ERROR = "DECLARATION ERROR";
    private final String ERROR = "error";
    private ArrayList<String> output;
    private ArrayList<String> ir;
    private LinkedHashMap<String, LinkedHashMap<String,String>> st;

    public Tiny(ArrayList<String> ir, LinkedHashMap<String, LinkedHashMap<String,String>> st){
        this.ir = ir;
        this.st = st;
        output = new ArrayList<>();
    }

    // public interface to start building tiny code.
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

        // loop through entire IR list and generate tiny output.
        // Append this output to the output list
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
                String currentString = ir.get(i);
                currentString = currentString.replace("$T","r");
                String[] currentStringSplit = currentString.split(" ");
                output.add("move "+currentStringSplit[1]+" "+currentStringSplit[2]);
            } else if (ir.get(i).contains("MULI")) { // handle MULI
                String currentString = ir.get(i);
                currentString = currentString.replace("$T","r");
                String[] currentStringSplit = currentString.split(" ");
                output.add("move "+currentStringSplit[1]+" " +
                        currentStringSplit[3]);
                output.add("muli "+currentStringSplit[2]+" " +
                        currentStringSplit[3]);
            } else if (ir.get(i).contains("MULF")) { // handle MULF
                String currentString = ir.get(i);
                currentString = currentString.replace("$T","r");
                String[] currentStringSplit = currentString.split(" ");
                output.add("move "+currentStringSplit[1]+" " +
                        currentStringSplit[3]);
                output.add("mulr "+currentStringSplit[2]+" " +
                        currentStringSplit[3]);
            }else if (ir.get(i).contains("DIVI")) { // handle DIVI
                String currentString = ir.get(i);
                currentString = currentString.replace("$T","r");
                String[] currentStringSplit = currentString.split(" ");
                output.add("move "+currentStringSplit[1]+" " +
                        currentStringSplit[3]);
                output.add("divi "+currentStringSplit[2]+" " +
                        currentStringSplit[3]);
            } else if (ir.get(i).contains("DIVF")) { // handle SUBF
                String currentString = ir.get(i);
                currentString = currentString.replace("$T","r");
                String[] currentStringSplit = currentString.split(" ");
                output.add("move "+currentStringSplit[1]+" " +
                        currentStringSplit[3]);
                output.add("divr "+currentStringSplit[2]+" " +
                        currentStringSplit[3]);
            } else if (ir.get(i).contains("ADDI")) { // handle ADDI
                String currentString = ir.get(i);
                currentString = currentString.replace("$T","r");
                String[] currentStringSplit = currentString.split(" ");
                output.add("move "+currentStringSplit[1]+" " +
                        currentStringSplit[3]);
                output.add("addi "+currentStringSplit[2]+" " +
                        currentStringSplit[3]);
            } else if (ir.get(i).contains("ADDF")) { // handle ADDF
                String currentString = ir.get(i);
                currentString = currentString.replace("$T","r");
                String[] currentStringSplit = currentString.split(" ");
                output.add("move "+currentStringSplit[1]+" " +
                        currentStringSplit[3]);
                output.add("addr "+currentStringSplit[2]+" " +
                        currentStringSplit[3]);
            } else if (ir.get(i).contains("SUBI")) { // handle SUBI
                String currentString = ir.get(i);
                currentString = currentString.replace("$T","r");
                String[] currentStringSplit = currentString.split(" ");
                output.add("move "+currentStringSplit[1]+" " +
                        currentStringSplit[3]);
                output.add("subi "+currentStringSplit[2]+" " +
                        currentStringSplit[3]);
            } else if (ir.get(i).contains("SUBF")) { // handle SUBF
                String currentString = ir.get(i);
                currentString = currentString.replace("$T","r");
                String[] currentStringSplit = currentString.split(" ");
                output.add("move "+currentStringSplit[1]+" " +
                        currentStringSplit[3]);
                output.add("subf "+currentStringSplit[2]+" " +
                        currentStringSplit[3]);
            }
        }
        output.add("sys halt");
        printTiny();
    }

    // print method for the tiny output
    private void printTiny(){
        for(int i = 0; i < output.size(); i++){
            System.out.println(output.get(i));
        }
    }
}
