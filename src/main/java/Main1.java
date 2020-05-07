import cssCalculator.Calculator;
import scss.calculation.lexer.Lexer;
import scss.calculation.lexer.LexerException;
import scss.calculation.node.Node;
import scss.calculation.parser.Parser;
import scss.calculation.parser.ParserException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class Main1 {

    public static final String INPUT_SUFFIX = ".scss";

    public static final String OUTPUT_SUFFIX = "._css";

    public static void main(String[] args) {

        // Check for a single argument

        if (args.length == 0) {
            System.err
                    .println("COMMAND-LINE ERROR: missing filename argument.");
            System.exit(1);
        }
        else if (args.length > 1) {
            System.err.println("COMMAND-LINE ERROR: too many arguments.");
            System.exit(1);
        }

        // Check for proper input filename extension

        String inputFilename = args[0];
        int suffixLengh = INPUT_SUFFIX.length();
        int prefixLength = inputFilename.length() - suffixLengh;
        if (prefixLength < 1 || !inputFilename.substring(prefixLength)
                .equals(INPUT_SUFFIX)) {
            System.err.println(
                    "COMMAND-LINE ERROR: filename must have extension 'scss'.");
            System.exit(1);
        }

        // Calculate output file name

        String outputFilename
                = inputFilename.substring(0, prefixLength) + OUTPUT_SUFFIX;

        try {
            // Create parser

            Parser parser = new Parser(new Lexer(
                    new PushbackReader(new FileReader(args[0]), 1024)));

            // Construct tree
            Node tree = parser.parse();

            // Code generation: generate tinylang with explicit type conversions
            Calculator calculator = new Calculator();
            calculator.calculate(outputFilename, tree);
        }
        catch (FileNotFoundException e) {
            System.err.println("FILE NOT FOUND ERROR: " + e.getMessage() + ".");
            System.exit(1);
        }
        catch (ParserException e) {
            System.err.println("SYNTAX ERROR: " + e.getMessage() + ".");
            System.exit(1);
        }
        catch (LexerException e) {
            System.err.println("LEXER ERROR: " + e.getMessage() + ".");
            System.exit(1);
        }
        catch (IOException e) {
            System.err.println("I/O ERROR: " + e.getMessage() + ".");
            System.exit(1);
        }
    }
}
