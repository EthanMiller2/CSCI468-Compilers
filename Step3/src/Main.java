import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        final String GLOBAL = "GLOBAL";
        final String NAME = "name ";
        final String TYPE = " type ";
        final String DECLARATION_ERROR = "DECLARATION ERROR";
        final String ERROR = "error";
        final String ST = "Symbol table ";
        String filePath = "/Users/Alex/Documents/School/CSCI468-Compilers/Step3/src/inputs/test6.micro";
//        String filePath = args[0];
        File file = new File(filePath);
        FileInputStream inputStream = new FileInputStream(file);
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        LittleGLexer lexer = new LittleGLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LittleGParser parser = new LittleGParser(tokens);
        Listener listener = new Listener();
        new ParseTreeWalker().walk(listener, parser.program());
        LinkedHashMap<String, LinkedHashMap<String, String>> symbolTable = listener.getSymbolTable();

        try {
            String errorMessage = symbolTable.get(DECLARATION_ERROR).get(ERROR);
            System.out.println(DECLARATION_ERROR + " " + errorMessage);
        } catch (Exception e) {
            symbolTable.forEach((key, value) -> {
                if(key != GLOBAL)
                    System.out.println();

                System.out.println(ST + key);
                value.forEach((name, type) -> {
                    System.out.println(NAME + name + TYPE + type);
                });
            });
        }


    }
}


