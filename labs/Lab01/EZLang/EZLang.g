lexer grammar EZLang;

WS: [ \t\n]+ -> skip;

// Palavras Reservadas

BEGIN: 'begin';
BOOL: 'bool';
ELSE: 'else';
END: 'end';
FALSE: 'false';
IF: 'if';
INT: 'int';
PROGRAM: 'program';
READ: 'read';
REAL: 'real';
REPEAT: 'repeat';
STRING: 'string';
THEN: 'then';
TRUE: 'true';
UNTIL: 'until';
VAR: 'var';
WRITE: 'write';

// Símbolos Especiais

ASSIGN: ':=';
EQUALS: '=';
LT: '<';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
O_PAR: '(';
C_PAR: ')';
SEMICOLON: ';';

// Strings, Variáveis e Comentários

STR: '"' ~["]* '"';
ID: [a-zA-Z]+;
COMMENT: '{' ~[}]* '}';