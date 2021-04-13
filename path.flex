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
    ";"                  { return newToken(Terminals.SEMI); }
    ","                  { return newToken(Terminals.COMMA); }
    "."                  { return newToken(Terminals.DOT); }
    "&&"                 { return newToken(Terminals.AND); }
    "!"                  { return newToken(Terminals.NOT); }
    "+"                  { return newToken(Terminals.PLUS); }
    "-"                  { return newToken(Terminals.MINUS); }
    "*"                  { return newToken(Terminals.TIMES); }
    "<"                  { return newToken(Terminals.LESS); }
    "="                  { return newToken(Terminals.EQUALS); }
    "("                  { return newToken(Terminals.LPAREN); }
    ")"                  { return newToken(Terminals.RPAREN); }
    "["                  { return newToken(Terminals.LBRACK); }
    "]"                  { return newToken(Terminals.RBRACK); }
    "{"                  { return newToken(Terminals.LBRACE); }
    "}"                  { return newToken(Terminals.RBRACE); }
    "class"              { return newToken(Terminals.CLASS); }
    "public"             { return newToken(Terminals.PUBLIC); }
    "static"             { return newToken(Terminals.STATIC); }
    "void"               { return newToken(Terminals.VOID); }
    "main"               { return newToken(Terminals.MAIN); }
    "return"             { return newToken(Terminals.RETURN); }
    "if"                 { return newToken(Terminals.IF); }
    "else"               { return newToken(Terminals.ELSE); }
    "while"              { return newToken(Terminals.WHILE); }
    "int"                { return newToken(Terminals.INT); }
    "boolean"            { return newToken(Terminals.BOOLEAN); }
    "String"             { return newToken(Terminals.STRING); }
    "true"               { return newToken(Terminals.TRUE); }
    "this"               { return newToken(Terminals.THIS); }
    "new"                { return newToken(Terminals.NEW); }
    "extends"            { return newToken(Terminals.EXTENDS); }
    "System.out.println" { return newToken(Terminals.PRINT); }
    "length"             { return newToken(Terminals.LENGTH); }
    {Integer}            { return newToken(Terminals.INT_LIT, Integer.valueOf(yytext())); }
    {ID}                 { return newToken(Terminals.ID, new Identifier(yytext())); }
    {WhiteSpace}+        { /* ignore */ }
}

[^]                      { throw new Scanner.Exception("unexpected character '" + yytext() + "'"); }
