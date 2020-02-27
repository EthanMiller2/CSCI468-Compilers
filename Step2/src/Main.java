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
        parser.removeErrorListeners();
        ParseTree tree = parser.program();

//        System.out.println(tree.toStringTree(parser));
        
        int numErrors = parser.getNumberOfSyntaxErrors();
        System.out.println(numErrors);
        if(numErrors != 0){
            System.out.println("Not accepted\n");

        } else {
            System.out.println("Accepted\n");
        }

    }

}

