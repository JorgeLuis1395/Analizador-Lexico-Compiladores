/*Integrantes: Edison Iles, Armando Tapia*/
/*Seccion de codigo de usuario*/
/*Definimos las librerias*/
package analizadorlex;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//clase de los token devueltos, esta clase devolvera los datos del token encontrados

class Yytoken {
        Yytoken (int numToken, String token, String tipo, int linea){
		//Contador para el número de tokens reconocidos
        this.numToken = numToken;	
		//String del token reconocido
        this.token = new String(token);
        //Tipo de componente léxico encontrado
        this.tipo = tipo;
        //Número de linea
        this.linea = linea;
        //Columna donde empieza el primer carácter del token
        //this.columna = columna;
    }
	
    //Métodos de los atributos de la clase
    public int numToken;
    public String token;
    public String tipo;
    public int linea;
	
    //Metodo que devuelve los datos necesarios que escribiremos en un archive de salida
	// se usa una arroba, para que se guarde de forma correcta
    public String toString() {
    
		return "< "+token+" : "+tipo+" >"+" linea del token :"+(linea+1) +",";	
    }
}
//La parte de aqui arriba se copia literalmente al la clase generada

//DIRECTIVAS JLEX
/* Seccion de opciones y declaraciones de JFlex */
%% //inicio de opciones

//Cambiamos el nombre la funcion para el siguiente token por nextToken
%function nextToken

//Clase publica
%public

//Especifica el nombre de la clase generada como salida de JFLEX
%class AnalizadorLexico

//Agregamos soporte a unicode
%unicode


//Codigo java que se pega tal cual, pero este va dentro de nuestra clase 
//Aqui tenemos el metodo que escribe en el archivo csv 
%{
	
    private int contador;
    private ArrayList<Yytoken> tokens;

	private void escribeOutputFile() throws IOException{
			String filename = "salida.csv";
			BufferedWriter out = new BufferedWriter(
				new FileWriter(filename));
            System.out.println("\n*** Tokens guardados correctamente en archivo ***\n");
			for(Yytoken t: this.tokens){
				System.out.println(t);
				out.write(t + "\n");
			}
			out.close();
	}
%}

//Creamos un contador para los tokens, codigo que se coloca en el constructor de analizador lexixo
%init{
    contador = 0;
	tokens = new ArrayList<Yytoken>();
%init}


//Cuando se alcanza el fin del archivo de entrada se ejecuta el siguiente codigo 
%eof{
	try{
		this.escribeOutputFile();
        System.exit(0);
	}catch(IOException ioe){
		ioe.printStackTrace();
	}
%eof}

//Activar el contador de lineas, variable yyline
%line

//Fin de la parte del codigo, que escogemos, se generara

//Expresiones regulares
//Declaraciones
EXP_ALPHA=[A-Za-z]
EXP_DIGITO=[0-9] 
EXP_ALPHANUMERIC={EXP_ALPHA}|{EXP_DIGITO}
INTEGERR= "-"?({EXP_DIGITO})+
NUMFLOAT= "-"?{EXP_DIGITO}*"."{EXP_DIGITO}+ 
IDENTIFICADOR={EXP_ALPHA}({EXP_ALPHANUMERIC})*
ESPACIO=" "
SALTO=\n|\r|\r\n
COMENTARIO= (\/\* ( {EXP_ALPHANUMERIC}|{SALTO}|{ESPACIO} |{ESPECIAL} |{INTEGERR} | {NUMFLOAT} |{IDENTIFICADOR}| {COMPUESTOS} |{OBOOL})* \*\/ ) 
| ("//"({EXP_ALPHANUMERIC}|{ESPACIO} |{ESPECIAL} |{INTEGERR} | {NUMFLOAT} |{IDENTIFICADOR}| {COMPUESTOS} |{OBOOL} )*)
ESPECIAL=  ","| ";"| ":"| "("| ")"| "["| "]"| "{"| "}"| "+"| "-"| "*"| "/"| "<"| ">"| "="| "!"| "&"| "$"
COMPUESTOS= "<="|">="|"=="|"!="| "&&"|"||" 
OBOOL= true|false 
CHARR= \' ({EXP_ALPHANUMERIC}|{ESPECIAL}){1} \'
STRINGG= \" ({EXP_ALPHANUMERIC} |{ESPECIAL} |{INTEGERR} | {NUMFLOAT} |{IDENTIFICADOR} |{ESPACIO} | {COMPUESTOS} |{OBOOL})* \"

/* Seccion de reglas lexicas, fin declaraciones */
%% 

//Regla{Acciones}
{INTEGERR}    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"integer",yyline);
    tokens.add(t);
    return t;
}
{NUMFLOAT}    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"num float",yyline);
    tokens.add(t);
    return t;
}

{CHARR}    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"char",yyline);
    tokens.add(t);
    return t;
}

{STRINGG}    {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"String",yyline);
    tokens.add(t);
    return t;
}


"int"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"entero",yyline);
    tokens.add(t);
    return t;
}

"float"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"flotante",yyline);
    tokens.add(t);
    return t;
}

"bool"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"bool",yyline);
    tokens.add(t);
    return t;
}

"char"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"char",yyline);
    tokens.add(t);
    return t;
}

"string"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"string",yyline);
    tokens.add(t);
    return t;
}

"if"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"if",yyline);
    tokens.add(t);
    return t;
}

"then"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"then",yyline);
    tokens.add(t);
    return t;
}

"else"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"else",yyline);
    tokens.add(t);
    return t;
}

"while"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"while",yyline);
    tokens.add(t);
    return t;
}

"do"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"do",yyline);
    tokens.add(t);
    return t;
}

"input"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"input",yyline);
    tokens.add(t);
    return t;
}

"output"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"output",yyline);
    tokens.add(t);
    return t;
}

"return"   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"return",yyline);
    tokens.add(t);
    return t;
}
// se declaran antes de el IDENTIFICADOR las palabras reservadas por que, dichas palabras 
// en la mayoria de los lenguajes de programacion son aceptadas como validas

{OBOOL}   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"valorBolean",yyline);
    tokens.add(t);
    return t;
}

{IDENTIFICADOR}   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"id",yyline);
    tokens.add(t);
    return t;
}

{COMENTARIO}   {

}

// operadores compuestos
{COMPUESTOS}   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"Operador Compuesto",yyline);
    tokens.add(t);
    return t;
}

//caracteres Especiales
{ESPECIAL}   {
    contador++;
    Yytoken t = new Yytoken(contador,yytext(),"Caracter Especial",yyline);
    tokens.add(t);
    return t;
}


/*Los metacaracteres es necesario usar la secuencia de escape -> \ */
{ESPACIO} {}
{SALTO} {}
(.|\n) { 
contador++;
   Yytoken t = new Yytoken(contador,yytext(),"error_lexico",yyline);
    tokens.add(t);
   return t;
 }

