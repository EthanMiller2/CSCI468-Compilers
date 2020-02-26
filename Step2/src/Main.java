import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


import java.io.File;
import java.io.FileInputStream;
public class Main {

    public static void main(String[] args) throws Exception {
        String filePath = "/Users/Alex/Documents/School/CSCI468-Compilers/Step1/inputs/test1.micro";
//        String filePath = args[0];
        File file = new File(filePath);
        FileInputStream inputStream = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        LittleGLexer lexer = new LittleGLexer(input);
        LittleGLexer lexer1 = new LittleGLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LittleGParser parser = new LittleGParser(tokens);
//        parser.removeErrorListeners();
        ParseTree tree = parser.program();

        System.out.println(tree.toStringTree(parser));

//        int numErrors = parser.getNumberOfSyntaxErrors();
//        System.out.println(numErrors);
//        if(numErrors != 0){
//            System.out.println("Not accepted\n");
//
//        } else {
//            System.out.println("Accepted\n");
//        }



//        for (Token t : lexer1.getAllTokens()){
//            System.out.println("Token Type: "+returnType(t.getType()));
//            System.out.println("Value: "+t.getText());
//        }
    }

    public static String returnType(int typeId) {
        if(typeId == 1){
            return "IDENTIFIER";
        } else if (typeId == 2) {
            return "OPERATOR";
        } else if (typeId == 3) {
            return "OPERATOR";
        }else if (typeId == 4) {
            return "STRINGLITERAL";
        }else if (typeId == 5) {
            return "OPERATOR";
        }else if (typeId == 6) {
            return "OPERATOR";
        }else if (typeId == 7) {
            return "OPERATOR";
        }else if (typeId == 8) {
            return "INTLITERAL";
        }else if (typeId == 9) {
            return "FLOATLITERAL";
        }else if (typeId == 10) {
            return "OPERATOR";
        }else if (typeId == 11) {
            return "OPERATOR";
        }else if (typeId == 12) {
            return "OPERATOR";
        }else if (typeId == 13) {
            return "OPERATOR";
        }else if (typeId == 14) {
            return "OPERATOR";
        }else if (typeId == 15) {
            return "OPERATOR";
        }else if (typeId == 16) {
            return "OPERATOR";
        }else if (typeId == 17) {
            return "OPERATOR";
        }else if (typeId == 18) {
            return "OPERATOR";
        }else if (typeId == 19) {
            return "OPERATOR";
        }else if (typeId == 20) {
            return "KEYWORD";
        }else if (typeId == 21) {
            return "KEYWORD";
        }else if (typeId == 22) {
            return "KEYWORD";
        }else if (typeId == 23) {
            return "KEYWORD";
        }else if (typeId == 24) {
            return "KEYWORD";
        }else if (typeId == 25) {
            return "KEYWORD";
        }else if (typeId == 26) {
            return "KEYWORD";
        }else if (typeId == 27) {
            return "KEYWORD";
        }else if (typeId == 28) {
            return "KEYWORD";
        }else if (typeId == 29) {
            return "KEYWORD";
        }else if (typeId == 30) {
            return "KEYWORD";
        }else if (typeId == 31) {
            return "KEYWORD";
        }else if (typeId == 32) {
            return "KEYWORD";
        }else if (typeId == 33) {
            return "KEYWORD";
        }else if (typeId == 34) {
            return "KEYWORD";
        }else if (typeId == 35) {
            return "KEYWORD";
        }else if (typeId == 36) {
            return "KEYWORD";
        }else if (typeId == 37) {
            return "KEYWORD";
        }else if (typeId == 38) {
            return "IDENTIFIER";
        }else if (typeId == 39) {
            return "INTLITERAL";
        }else if (typeId == 40) {
            return "FLOATLITERAL";
        }else if (typeId == 41) {
            return "STRINGLITERAL";
        }else if (typeId == 42) {
            return "COMMENT";
        }
        return "Unknown";
    }
}

