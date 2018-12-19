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


public class TestAntler {
    public static void main(String[] args) {
       test(CharStreams.fromString("new locomotive loc1"));
       test(CharStreams.fromString("new train tr1 with loc1"));

    }
    private static void test(CharStream lineStream){
        TrainService ts = new TrainService();
        RichRailCli observer = new RichRailCli(ts);// moet de front end opstarten
        ts.addObserver(observer);


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
