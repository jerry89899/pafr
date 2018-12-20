package main;


import Application.TrainService;
import main.antlr4.RichRailLexer;
import main.antlr4.RichRailListener;
import main.antlr4.RichRailParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.RichRailCli;

import java.util.Scanner;


public class TestAntler {
    public static void main(String[] args) {
        TrainService ts = new TrainService();
        RichRailCli observer = new RichRailCli(ts);// moet de front end opstarten
        ts.addObserver(observer);

        executeCommand(CharStreams.fromString("new firstclasswagon fc1"),observer);
        executeCommand(CharStreams.fromString("new secondclasswagon sc1"),observer);
        executeCommand(CharStreams.fromString("new cargowagon cw1 20"),observer);
        executeCommand(CharStreams.fromString("new locomotive loc1 10"),observer);

        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        while(true) {


            try
            {
                System.out.print("Enter Command: ");
                String input = scanner.nextLine();
                input = input.toLowerCase();
                System.out.println(input);
                executeCommand(CharStreams.fromString(input),observer);

            }
            catch (java.lang.NullPointerException exception) {
                System.out.println(exception.getMessage());
            }

        }


    }
    private static void executeCommand(CharStream lineStream, RichRailCli observer){



        // Tokenize / Lexical analysis
        Lexer lexer = new RichRailLexer(lineStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create Parse Tree
        RichRailParser parser = new RichRailParser(tokens);
        ParseTree tree = parser.command();

        // Create ParseTreeWalker and Custom Listener
        ParseTreeWalker walker = new ParseTreeWalker();
        RichRailListener listener = observer;

        // Walk over ParseTree using Custom Listener that listens to enter/exit events
        walker.walk(listener, tree);
    }
}
