package proyectocompiladores;
import static proyectocompiladores.Token.*;
%%
%class Lexico
%type Token
numeros=[0-9]
espacios=[ \t\r\n]
%{
public String lexema;
%}
%%
{espacios} {/* ignore */}
"//"|"/*" [a-z|A-Z][a-z|A-Z|0-9]*|"*/" {/* ignore */}
"int"|"float"|"bool"|"char"|"string"|"if"|"then"|"else"|"while"|"do"|"input"|"output"|"return" {lexema=yytext();return PalabrasReservadas;}
"true"|"false" {lexema=yytext();return LiteralBool;}
"'"[a-z|A-Z][a-z|A-Z|0-9]*"'" {lexema=yytext();return LiteralChar;}
"""[a-z|A-Z][a-z|A-Z|0-9]*""" {lexema=yytext();return LiteralString;}
[a-z][a-z|A-Z|0-9]* {lexema=yytext(); return Identificador;}
[+-]? {numeros}+ {lexema=yytext();return LiteralInt;}
{numeros}*[.]{numeros}+ {lexema=yytext();return LiteralFloat;}
","|";"|":"|"("|")"|"["|"]"|"{"|"}"|"+"|"-"|"*"|"/"|"<"|">"|"="|"!"|"&"|"$" {lexema=yytext();return CaracterEspecial;}
"<="|">="|"=="|"!="|"&&"|"||" {lexema=yytext();return OperadorCompuesto;}
[A-Z][a-z|A-Z|0-9]* {lexema=yytext();return Erro;}
. {return Error;}