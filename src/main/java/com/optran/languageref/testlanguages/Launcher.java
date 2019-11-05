package com.optran.languageref.testlanguages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

import com.optran.languageref.testlanguages.json.JsonLexer;
import com.optran.languageref.testlanguages.json.JsonParser;
import com.optran.languageref.testlanguages.json.impl.JsonListenerImpl;

public class Launcher {
	public static void main(String[] args) {
		try {
			CharStream chStream = CharStreams.fromStream(new FileInputStream(new File("C:\\Users\\Ashutosh Wad\\Desktop\\Antlr\\antlrlanguages\\Json\\Data.txt")));
			JsonLexer lexer = new JsonLexer(chStream);
			CommonTokenStream cts = new CommonTokenStream(lexer);
			JsonParser parser = new JsonParser(cts);
			JsonListenerImpl parseListener = new JsonListenerImpl();
			parser.addParseListener(parseListener);
			ParseTree tree = parser.start();
			
			System.out.println(parseListener);
			System.out.println();
			parseListener.popall();
			//guiDisplay(parser, tree);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void guiDisplay(Parser parser, ParseTree tree) {
		JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);//scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
	}
}
