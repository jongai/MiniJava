import beaver.Symbol;
import beaver.Scanner;

%%

%class Lexer
%extends Scanner
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
	return newToken(Terminals.EOF, "end-of-file");
%eofval}
%unicode
%line
%column
%{
	private Symbol newToken(short id)
	{
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength());
	}

	private Symbol newToken(short id, Object value)
	{
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), value);
	}
%}
LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]

Integer        = 0 | [1-9][0-9]*
ID             = [A-Za-z_][A-Za-z_0-9]*

%%
<YYINITIAL> {
	";"                  { System.out.print(" ; "); return newToken(Terminals.SEMI); }
    ","                  { System.out.print(" , "); return newToken(Terminals.COMMA); }
    "."                  { System.out.print(" . "); return newToken(Terminals.DOT); }
    "&&"                 { System.out.print(" && "); return newToken(Terminals.AND); }
    "!"                  { System.out.print(" ! "); return newToken(Terminals.NOT); }
    "+"                  { System.out.print(" + "); return newToken(Terminals.PLUS); }
    "-"                  { System.out.print(" - "); return newToken(Terminals.MINUS); }
    "*"                  { System.out.print(" * "); return newToken(Terminals.TIMES); }
    "<"                  { System.out.print(" < "); return newToken(Terminals.LESS); }
    "="                  { System.out.print(" = "); return newToken(Terminals.EQUALS); }
    "("                  { System.out.print(" ( "); return newToken(Terminals.LPAREN); }
    ")"                  { System.out.print(" ) "); return newToken(Terminals.RPAREN); }
    "["                  { System.out.print(" [ "); return newToken(Terminals.LBRACK); }
    "]"                  { System.out.print(" ] "); return newToken(Terminals.RBRACK); }
    "{"                  { System.out.print(" { "); return newToken(Terminals.LBRACE); }
    "}"                  { System.out.print(" } "); return newToken(Terminals.RBRACE); }
    "class"              { System.out.print(" class "); return newToken(Terminals.CLASS); }
    "public"             { System.out.print(" public "); return newToken(Terminals.PUBLIC); }
    "static"             { System.out.print(" static "); return newToken(Terminals.STATIC); }
    "void"               { System.out.print(" void "); return newToken(Terminals.VOID); }
    "main"               { System.out.print(" main "); return newToken(Terminals.MAIN); }
    "return"             { System.out.print(" return "); return newToken(Terminals.RETURN); }
    "if"                 { System.out.print(" if "); return newToken(Terminals.IF); }
    "else"               { System.out.print(" else "); return newToken(Terminals.ELSE); }
    "while"              { System.out.print(" while "); return newToken(Terminals.WHILE); }
    "int"                { System.out.print(" int "); return newToken(Terminals.INT); }
    "boolean"            { System.out.print(" boolean "); return newToken(Terminals.BOOLEAN); }
    "String"             { System.out.print(" String "); return newToken(Terminals.STRING); }
    "true"               { System.out.print(" true "); return newToken(Terminals.TRUE); }
    "this"               { System.out.print(" this "); return newToken(Terminals.THIS); }
    "new"                { System.out.print(" new "); return newToken(Terminals.NEW); }
    "extends"            { System.out.print(" extends "); return newToken(Terminals.EXTENDS); }
    "System.out.println" { System.out.print(" System.out.println "); return newToken(Terminals.PRINT); }
    "length"             { System.out.print(" length "); return newToken(Terminals.LENGTH); }
	{Integer}            { System.out.print(" INT_LIT(" + yytext() + ") "); return newToken(Terminals.INT_LIT); }
	{ID}                 { System.out.print(" ID(" + yytext() + ") "); return newToken(Terminals.ID); }
	{WhiteSpace}+        { /* ignore */ }
}

[^]                    { throw new Scanner.Exception("unexpected character '" + yytext() + "'"); }
