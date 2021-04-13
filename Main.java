import beaver.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner lexer = new Lexer(new FileReader(args[0]));
		Parser parser = new Parser();
		Program a = (Program) parser.parse(lexer);
		System.out.println(a.m);
	}
}
