grammar Exercicio01;

begin: expr EOF;

expr: '(' expr+? ')' | A;

A: 'a';
WS: [ \t\n]+ -> skip;