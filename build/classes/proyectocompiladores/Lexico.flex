package proyectocompiladores;
import static proyectocompiladores.Token.*;
%%
%class Lexico
%type Token
Letras=[a-zA-Z]
numeros=[0-9]

espacios=[ \t\r\n]

%{
public String lexema;

%}
%%

{espacios} {/* ignore */}
"//"|"/*"{Letras}|{numeros}*|"*/" {/* ignore */}
"int"|"float"|"bool"|"char"|"string"|"if"|"then"|"else"|"while"|"do"|"input"|"output"|"return" {lexema=yytext();return PalabrasReservadas;}
"true"|"false" {lexema=yytext();return LiteralBool;}
"'"{Letras}"'" {lexema=yytext();return LiteralChar;}
"""{Letras}""" {lexema=yytext();return LiteralString;}
[a-z][a-z|A-Z|0-9]* {lexema=yytext(); return Identificador;}
[+-]? {numeros}+ {lexema=yytext();return LiteralInt;}
{numeros}[.]{numeros} {lexema=yytext();return LiteralFloat;}
","|";"|":"|"("|")"|"["|"]"|"{"|"}"|"+"|"-"|"*"|"/"|"<"|">"|"="|"!"|"&"|"$" {lexema=yytext();return CaracterEspecial;}
"<="|">="|"=="|"!="|"&&"|"||" {lexema=yytext();return OperadorCompuesto;}

. {return Error;}