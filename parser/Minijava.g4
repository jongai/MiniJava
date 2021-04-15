grammar Minijava;

program
:
    mainClass classDeclList
;

classDeclList
:
    classDeclList classDecl
    |
;

mainClass
:
    CLASS ID LBRACE PUBLIC STATIC VOID MAIN LPAREN STRING LBRACK RBRACK ID
    RPAREN LBRACE statement* RBRACE RBRACE
;

classDecl
:
    CLASS ID LBRACE varDeclList methodDeclList RBRACE
    | CLASS ID EXTENDS ID LBRACE varDeclList methodDeclList RBRACE
;

varDecl
:
    type ID SEMI
;

varDeclList
:
    varDeclList varDecl
    |
;

methodDecl
:
    PUBLIC type ID LPAREN formalList RPAREN LBRACE varDeclList statement*
    RETURN exp SEMI RBRACE
;

methodDeclList
:
    methodDeclList methodDecl
    |
;

formalList
:
    type ID formalRest*
    |
;

formalRest
:
    COMMA type ID
;

type
:
    INT LBRACK RBRACK
    | BOOLEAN
    | INT
    | ID
;

statement
:
    LBRACE statement* RBRACE
    | IF LPAREN exp RPAREN statement ELSE statement
    | WHILE LPAREN exp RPAREN statement
    | PRINT LPAREN exp RPAREN SEMI
    | ID EQUALS exp SEMI
    | ID LBRACK exp RBRACK EQUALS exp SEMI
;

exp
:
    exp TIMES exp
    | exp PLUS exp
    | exp MINUS exp
    | exp LESS exp
    | exp AND exp
    | exp LBRACK exp RBRACK
    | exp DOT LENGTH
    | exp DOT ID LPAREN expList RPAREN
    | INTEGER
    | TRUE
    | FALSE
    | ID
    | THIS
    | NEW INT LBRACK exp RBRACK
    | NEW ID LPAREN RPAREN
    | NOT exp
    | LPAREN exp RPAREN
;

expList
:
    exp expRest*
    |
;

expRest
:
    COMMA exp
;

SEMI
:
    ';'
;

COMMA
:
    ','
;

DOT
:
    '.'
;

NOT
:
    '!'
;

PLUS
:
    '+'
;

MINUS
:
    '-'
;

TIMES
:
    '*'
;

LESS
:
    '<'
;

AND
:
    '&&'
;

EQUALS
:
    '='
;

LPAREN
:
    '('
;

RPAREN
:
    ')'
;

LBRACK
:
    '['
;

RBRACK
:
    ']'
;

LBRACE
:
    '{'
;

RBRACE
:
    '}'
;

CLASS
:
    'class'
;

PUBLIC
:
    'public'
;

STATIC
:
    'static'
;

VOID
:
    'void'
;

MAIN
:
    'main'
;

RETURN
:
    'return'
;

IF
:
    'if'
;

ELSE
:
    'else'
;

WHILE
:
    'while'
;

INT
:
    'int'
;

BOOLEAN
:
    'boolean'
;

STRING
:
    'String'
;

TRUE
:
    'true'
;

FALSE
:
    'false'
;

THIS
:
    'this'
;

NEW
:
    'new'
;

EXTENDS
:
    'extends'
;

PRINT
:
    'System.out.println'
;

LENGTH
:
    'length'
;

INTEGER
:
    '0'
    | [1-9] [0-9]*
;

ID
:
    [A-Za-z_] [A-Za-z_0-9]*
;

WHITESPACE
:
    (
        ' '
        | '\t'
        | '\f'
    ) -> skip
;

LINETERM
:
    (
        '\r'
        | '\n'
    ) -> skip
;

COMMENTS
:
    (
        (
            '/*'
            (
                ~[*]
                |
                (
                    '*'+ ~[*/]
                )
            )* '*'+ '/'
        )
        |
        (
            '//' ~[\r\n]*
        )
    ) -> skip
;