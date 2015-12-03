package proyectocompiladores;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Token {
        Token (int numToken, String token, String tipo, int linea){
        this.numToken = numToken;	
        this.token = new String(token);
        this.tipo = tipo;
        this.linea = linea;
       
    }
 public int numToken;
    public String token;
    public String tipo;
    public int linea;

    public String toString() {
    
		return token+" : "+tipo+ " linea :    "+(linea+1) +",";	
    }
}
%%
%function nextToken
%public
%class Lexico
%unicode
%{
	
    private int contador;
    private ArrayList<Token> tokens;

	private void Salida() throws IOException{
			String filename = "salida.csv";
			BufferedWriter out = new BufferedWriter(
				new FileWriter(filename));
            System.out.println("\n EXITOSAMENTE GENERADO\n");
			for(Token lexico: this.tokens){
			out.write(lexico + "\n");
			}
			out.close();
	}
%}
%init{
    contador = 0;
	tokens = new ArrayList<Token>();
%init}

%eof{
	try{
		this.Salida();
        System.exit(0);
	}catch(IOException ioe){
		ioe.printStackTrace();
	}
%eof}
%line

numeros=[0-9]
espacio=" "
salto=\n|\r|\r\n
CH= "'"[a-z|A-Z][a-z|A-Z|0-9] "'"
CADENA= """ [a-z|A-Z][a-z|A-Z|0-9]* """

%{
public String lexema;
%}
%%
{espacio} {}
("//"([a-z|A-Z][a-z|A-Z|0-9]* )*) {}
"/*" [a-z|A-Z][a-z|A-Z|0-9]*|[a-z|A-Z|0-9]* "*/" {}
"int"|"float"|"bool"|"char"|"string"|"if"|"then"|"else"|"while"|"do"|"input"|"output"|"return" {
contador++;
Token lexico = new Token(contador,yytext(),"PalabraReservada",yyline);
tokens.add(lexico);
return lexico;
}
"true"|"false" {
contador++;
Token lexico = new Token(contador,yytext(),"Booleano",yyline);
tokens.add(lexico);
return lexico;
}

'([a-z|A-Z][a-z|A-Z|0-9]*)' {
contador++;
Token lexico = new Token(contador,yytext(),"Char",yyline);
tokens.add(lexico);
return lexico;
}

"""([a-z|A-Z][a-z|A-Z|0-9]*)""" {
contador++;
Token lexico = new Token(contador,yytext(),"String",yyline);
tokens.add(lexico);
return lexico;
}
[a-z][a-z|A-Z|0-9]* {
contador++;
Token lexico = new Token(contador,yytext(),"Identificador",yyline);
tokens.add(lexico);
return lexico;
}
[+-]? {numeros}+ {
contador++;
Token lexico = new Token(contador,yytext(),"Integer",yyline);
tokens.add(lexico);
return lexico;
}
{numeros}*[.]{numeros}+ {
contador++;
Token lexico = new Token(contador,yytext(),"Flotante",yyline);
tokens.add(lexico);
return lexico;
}
","|";"|":"|"("|")"|"["|"]"|"{"|"}"|"+"|"-"|"*"|"/"|"<"|">"|"="|"!"|"&"|"$" {
contador++;
Token lexico = new Token(contador,yytext(),"CaracterEspecial",yyline);
tokens.add(lexico);
return lexico;
}
"<="|">="|"=="|"!="|"&&"|"||" {
contador++;
Token lexico = new Token(contador,yytext(),"OperadorCompuesto",yyline);
tokens.add(lexico);
return lexico;
}
[A-Z][a-z|A-Z|0-9]* {contador++;
Token lexico = new Token(contador,yytext(),"ERROR",yyline);
tokens.add(lexico);
return lexico;
}
{salto} {}
(.|\n) { 
contador++;
   Token lexico = new Token(contador,yytext(),"error_lexico",yyline);
    tokens.add(lexico);
   return lexico;
 }
