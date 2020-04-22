import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String filePath = "/Users/Alex/Documents/School/CSCI468-Compilers/Step4/src/inputs/test_mult.micro";
//        String filePath = args[0];
        CharStream input = CharStreams.fromFileName(filePath);
        LittleGLexer lexer = new LittleGLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LittleGParser parser = new LittleGParser(tokens);
        Listener listener = new Listener();
        new ParseTreeWalker().walk(listener, parser.program());
        LinkedHashMap<String, LinkedHashMap<String, String>> symbolTable = listener.getSymbolTable();
    }
}


