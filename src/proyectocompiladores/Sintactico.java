
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun Dec 20 00:27:44 COT 2015
//----------------------------------------------------

package proyectocompiladores;

import java_cup.runtime.*;
import java.io.FileReader;
import java.util.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun Dec 20 00:27:44 COT 2015
  */
public class Sintactico extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\064\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\015\004\000\002\015\003\000\002\015\004" +
    "\000\002\015\003\000\002\015\004\000\002\015\003\000" +
    "\002\015\004\000\002\015\003\000\002\015\004\000\002" +
    "\015\003\000\002\015\004\000\002\015\003\000\002\021" +
    "\013\000\002\024\013\000\002\025\013\000\002\023\010" +
    "\000\002\022\010\000\002\017\006\000\002\020\003\000" +
    "\002\020\003\000\002\020\003\000\002\041\003\000\002" +
    "\041\003\000\002\042\006\000\002\043\004\000\002\027" +
    "\003\000\002\027\003\000\002\027\003\000\002\027\003" +
    "\000\002\027\003\000\002\027\003\000\002\030\003\000" +
    "\002\030\003\000\002\030\003\000\002\030\003\000\002" +
    "\031\005\000\002\032\005\000\002\033\005\000\002\034" +
    "\005\000\002\014\003\000\002\014\003\000\002\014\003" +
    "\000\002\014\003\000\002\044\010\000\002\045\010\000" +
    "\002\046\010\000\002\047\005\000\002\051\006\000\002" +
    "\013\007" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\174\000\016\013\020\024\010\026\025\027\023\032" +
    "\012\033\005\001\002\000\016\013\ufff7\024\ufff7\026\ufff7" +
    "\027\ufff7\032\ufff7\033\ufff7\001\002\000\004\005\172\001" +
    "\002\000\004\005\167\001\002\000\016\013\ufffb\024\ufffb" +
    "\026\ufffb\027\ufffb\032\ufffb\033\ufffb\001\002\000\004\005" +
    "\uffec\001\002\000\016\013\ufffd\024\ufffd\026\ufffd\027\ufffd" +
    "\032\ufffd\033\ufffd\001\002\000\004\005\162\001\002\000" +
    "\016\013\ufff5\024\ufff5\026\ufff5\027\ufff5\032\ufff5\033\ufff5" +
    "\001\002\000\004\002\uffff\001\002\000\010\002\uffe8\004" +
    "\uffe8\037\uffe8\001\002\000\004\002\161\001\002\000\010" +
    "\002\uffe9\004\uffe9\037\uffe9\001\002\000\030\013\020\014" +
    "\066\024\010\026\025\027\023\032\044\033\035\034\050" +
    "\037\043\040\051\046\061\001\002\000\016\013\020\024" +
    "\010\026\025\027\023\032\012\033\005\001\002\000\016" +
    "\013\ufff9\024\ufff9\026\ufff9\027\ufff9\032\ufff9\033\ufff9\001" +
    "\002\000\004\005\uffea\001\002\000\016\013\ufff3\024\ufff3" +
    "\026\ufff3\027\ufff3\032\ufff3\033\ufff3\001\002\000\004\005" +
    "\uffeb\001\002\000\016\013\ufffa\024\ufffa\026\ufffa\027\ufffa" +
    "\032\ufffa\033\ufffa\001\002\000\004\002\000\001\002\000" +
    "\016\013\ufffc\024\ufffc\026\ufffc\027\ufffc\032\ufffc\033\ufffc" +
    "\001\002\000\016\013\ufff4\024\ufff4\026\ufff4\027\ufff4\032" +
    "\ufff4\033\ufff4\001\002\000\016\013\ufff8\024\ufff8\026\ufff8" +
    "\027\ufff8\032\ufff8\033\ufff8\001\002\000\016\013\ufffe\024" +
    "\ufffe\026\ufffe\027\ufffe\032\ufffe\033\ufffe\001\002\000\016" +
    "\013\ufff6\024\ufff6\026\ufff6\027\ufff6\032\ufff6\033\ufff6\001" +
    "\002\000\004\005\151\001\002\000\004\005\141\001\002" +
    "\000\006\004\uffdc\037\uffdc\001\002\000\004\016\137\001" +
    "\002\000\006\004\uffe2\037\uffe2\001\002\000\006\004\uffe3" +
    "\037\uffe3\001\002\000\004\012\132\001\002\000\004\005" +
    "\122\001\002\000\004\016\120\001\002\000\006\004\uffe1" +
    "\037\uffe1\001\002\000\006\004\uffd6\037\uffd6\001\002\000" +
    "\004\012\113\001\002\000\026\013\020\024\010\026\025" +
    "\027\023\032\044\033\035\034\050\037\043\040\051\046" +
    "\061\001\002\000\006\004\uffdd\037\uffdd\001\002\000\006" +
    "\004\uffdf\037\uffdf\001\002\000\006\004\uffe4\037\uffe4\001" +
    "\002\000\006\004\uffe5\037\uffe5\001\002\000\004\004\101" +
    "\001\002\000\006\004\uffe0\037\uffe0\001\002\000\006\004" +
    "\uffde\037\uffde\001\002\000\006\012\072\016\071\001\002" +
    "\000\006\004\uffd5\037\uffd5\001\002\000\006\004\uffd7\037" +
    "\uffd7\001\002\000\004\016\067\001\002\000\006\004\uffd4" +
    "\037\uffd4\001\002\000\010\002\uffe6\004\uffe6\037\uffe6\001" +
    "\002\000\004\051\070\001\002\000\006\004\uffd8\037\uffd8" +
    "\001\002\000\004\044\100\001\002\000\006\015\074\046" +
    "\073\001\002\000\004\015\076\001\002\000\004\004\075" +
    "\001\002\000\006\004\uffcf\037\uffcf\001\002\000\004\004" +
    "\077\001\002\000\006\004\uffce\037\uffce\001\002\000\006" +
    "\004\uffdb\037\uffdb\001\002\000\004\014\102\001\002\000" +
    "\010\002\uffe7\004\uffe7\037\uffe7\001\002\000\004\037\104" +
    "\001\002\000\004\012\105\001\002\000\004\046\106\001" +
    "\002\000\004\016\111\001\002\000\004\015\110\001\002" +
    "\000\006\004\uffd1\037\uffd1\001\002\000\004\044\112\001" +
    "\002\000\004\015\uffd0\001\002\000\004\046\106\001\002" +
    "\000\004\015\115\001\002\000\004\035\116\001\002\000" +
    "\026\013\020\024\010\026\025\027\023\032\044\033\035" +
    "\034\050\037\043\040\051\046\061\001\002\000\006\004" +
    "\uffd3\037\uffd3\001\002\000\004\050\121\001\002\000\006" +
    "\004\uffd9\037\uffd9\001\002\000\004\046\123\001\002\000" +
    "\004\022\124\001\002\000\004\044\125\001\002\000\004" +
    "\023\126\001\002\000\004\016\127\001\002\000\004\046" +
    "\130\001\002\000\004\004\131\001\002\000\020\013\ufff1" +
    "\016\ufff1\024\ufff1\026\ufff1\027\ufff1\032\ufff1\033\ufff1\001" +
    "\002\000\004\046\106\001\002\000\004\015\134\001\002" +
    "\000\004\040\135\001\002\000\026\013\020\024\010\026" +
    "\025\027\023\032\044\033\035\034\050\037\043\040\051" +
    "\046\061\001\002\000\006\004\uffd2\037\uffd2\001\002\000" +
    "\004\044\140\001\002\000\006\004\uffda\037\uffda\001\002" +
    "\000\004\046\142\001\002\000\004\022\143\001\002\000" +
    "\004\044\144\001\002\000\004\023\145\001\002\000\004" +
    "\016\146\001\002\000\004\044\147\001\002\000\004\004" +
    "\150\001\002\000\020\013\ufff2\016\ufff2\024\ufff2\026\ufff2" +
    "\027\ufff2\032\ufff2\033\ufff2\001\002\000\004\046\152\001" +
    "\002\000\004\022\153\001\002\000\004\044\154\001\002" +
    "\000\004\023\155\001\002\000\004\016\156\001\002\000" +
    "\004\046\157\001\002\000\004\004\160\001\002\000\020" +
    "\013\ufff0\016\ufff0\024\ufff0\026\ufff0\027\ufff0\032\ufff0\033" +
    "\ufff0\001\002\000\004\002\001\001\002\000\004\046\163" +
    "\001\002\000\006\016\164\022\124\001\002\000\004\050" +
    "\165\001\002\000\004\004\166\001\002\000\016\013\uffee" +
    "\024\uffee\026\uffee\027\uffee\032\uffee\033\uffee\001\002\000" +
    "\004\046\170\001\002\000\006\004\171\022\143\001\002" +
    "\000\016\013\uffed\024\uffed\026\uffed\027\uffed\032\uffed\033" +
    "\uffed\001\002\000\004\046\173\001\002\000\006\016\174" +
    "\022\153\001\002\000\004\051\175\001\002\000\004\004" +
    "\176\001\002\000\016\013\uffef\024\uffef\026\uffef\027\uffef" +
    "\032\uffef\033\uffef\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\174\000\032\002\015\015\020\017\010\020\005\021" +
    "\006\022\021\023\003\024\012\025\023\041\013\042\016" +
    "\043\014\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\054\012\040\013\041\014\053\020\035\021\037\024" +
    "\044\025\063\027\055\030\054\031\052\032\057\033\051" +
    "\034\036\035\046\041\045\042\016\043\014\044\062\045" +
    "\061\046\064\051\056\001\001\000\026\017\032\020\005" +
    "\021\027\022\025\023\031\024\033\025\030\041\026\042" +
    "\016\043\014\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\054\012\040\013\041\014" +
    "\053\020\035\021\037\024\044\025\063\027\102\030\054" +
    "\031\052\032\057\033\051\034\036\035\046\041\045\042" +
    "\016\043\014\044\062\045\061\046\064\051\056\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\047\106\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\047\113\001\001\000\002\001" +
    "\001\000\002\001\001\000\054\012\040\013\041\014\053" +
    "\020\035\021\037\024\044\025\063\027\116\030\054\031" +
    "\052\032\057\033\051\034\036\035\046\041\045\042\016" +
    "\043\014\044\062\045\061\046\064\051\056\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\047\132\001\001\000\002\001" +
    "\001\000\002\001\001\000\054\012\040\013\041\014\053" +
    "\020\035\021\037\024\044\025\063\027\135\030\054\031" +
    "\052\032\057\033\051\034\036\035\046\041\045\042\016" +
    "\043\014\044\062\045\061\046\064\051\056\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    /* Reporte de error encontrado. */
    public void report_error(String message, Object info) {
        StringBuilder m = new StringBuilder("Error");
        if (info instanceof java_cup.runtime.Symbol) {
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
            if (s.left >= 0) {                
                m.append(" in line "+(s.left+1));
                if (s.right >= 0)
                    m.append(", column "+(s.right+1));
            }
        }
        m.append(" : "+message);
        System.err.println(m +"\n");
    }
	
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }
	   
    public static void main(String[] args){
        try {
            Sintactico asin = new Sintactico(
                    new Lexico( new FileReader(args[0])));
            Object result = asin.parse().value;
            System.out.println("\n*** Resultados finales ***");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintactico$actions {


   /*Aqui podemos cargar dcodigo asociado a las distintas producciones
 gramaticales, se puede poner metodos y atributos
   */
   
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // entrada ::= IDENTIFICADOR PARENTESISABIERTO IDENTIFICADOR PARENTESISCERRADO TER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("entrada",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // llamadafuncion ::= IDENTIFICADOR PARENTESISABIERTO PARENTESISCERRADO TER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("llamadafuncion",39, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // expresion ::= IDENTIFICADOR EQUAL INTEGER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",37, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // palabrado ::= DO comandosimple WHILE PARENTESISABIERTO expresion PARENTESISCERRADO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("palabrado",36, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // palabrawhile ::= WHILE PARENTESISABIERTO expresion PARENTESISCERRADO DO comandosimple 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("palabrawhile",35, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // palabraif ::= IF PARENTESISABIERTO expresion PARENTESISCERRADO THEN comandosimple 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("palabraif",34, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // controlflujo ::= palabrado 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("controlflujo",10, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // controlflujo ::= palabrawhile 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("controlflujo",10, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // controlflujo ::= palabraelse 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("controlflujo",10, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // controlflujo ::= palabraif 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("controlflujo",10, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // atribucionvecstr ::= vGlobalVectorSTR EQUAL STRING 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("atribucionvecstr",26, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // atribucionveccha ::= vGlobalVectorCHA EQUAL CHAR 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("atribucionveccha",25, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // atribucionsimplevec ::= vGlobalVector EQUAL INTEGER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("atribucionsimplevec",24, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // atribucionsimple ::= IDENTIFICADOR EQUAL INTEGER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("atribucionsimple",23, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // atribucion ::= atribucionvecstr 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("atribucion",22, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // atribucion ::= atribucionveccha 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("atribucion",22, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // atribucion ::= atribucionsimplevec 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("atribucion",22, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // atribucion ::= atribucionsimple 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("atribucion",22, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // comandosimple ::= llamadafuncion 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("comandosimple",21, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // comandosimple ::= bloque 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("comandosimple",21, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // comandosimple ::= salida 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("comandosimple",21, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // comandosimple ::= entrada 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("comandosimple",21, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // comandosimple ::= controlflujo 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("comandosimple",21, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // comandosimple ::= atribucion 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("comandosimple",21, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // bloquecomandossin ::= LLAVEABIERTA LLAVECERRADA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("bloquecomandossin",33, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // bloquecomandos ::= LLAVEABIERTA comandosimple TER LLAVECERRADA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("bloquecomandos",32, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // bloque ::= bloquecomandossin 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("bloque",31, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // bloque ::= bloquecomandos 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("bloque",31, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // tipovariable ::= BOOL 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("tipovariable",14, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // tipovariable ::= FLOA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("tipovariable",14, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // tipovariable ::= INT 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("tipovariable",14, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // variableGlobal1 ::= tipovariable DOSP IDENTIFICADOR TER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("variableGlobal1",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // vGlobalchart ::= CHA DOSP IDENTIFICADOR EQUAL CHAR TER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("vGlobalchart",16, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // vGlobalString ::= string DOSP IDENTIFICADOR EQUAL STRING TER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("vGlobalString",17, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // vGlobalVectorSTR ::= string DOSP IDENTIFICADOR CORCHIZQ INTEGER CORCHDER EQUAL IDENTIFICADOR TER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("vGlobalVectorSTR",19, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-8)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // vGlobalVectorCHA ::= CHA DOSP IDENTIFICADOR CORCHIZQ INTEGER CORCHDER EQUAL IDENTIFICADOR TER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("vGlobalVectorCHA",18, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-8)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // vGlobalVector ::= tipovariable DOSP IDENTIFICADOR CORCHIZQ INTEGER CORCHDER EQUAL INTEGER TER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("vGlobalVector",15, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-8)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // declaracionVariablesGlobales ::= vGlobalVectorSTR 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracionVariablesGlobales",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // declaracionVariablesGlobales ::= declaracionVariablesGlobales vGlobalVectorSTR 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracionVariablesGlobales",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // declaracionVariablesGlobales ::= vGlobalVectorCHA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracionVariablesGlobales",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // declaracionVariablesGlobales ::= declaracionVariablesGlobales vGlobalVectorCHA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracionVariablesGlobales",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // declaracionVariablesGlobales ::= vGlobalString 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracionVariablesGlobales",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // declaracionVariablesGlobales ::= declaracionVariablesGlobales vGlobalString 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracionVariablesGlobales",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // declaracionVariablesGlobales ::= vGlobalchart 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracionVariablesGlobales",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // declaracionVariablesGlobales ::= declaracionVariablesGlobales vGlobalchart 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracionVariablesGlobales",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // declaracionVariablesGlobales ::= vGlobalVector 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracionVariablesGlobales",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // declaracionVariablesGlobales ::= declaracionVariablesGlobales vGlobalVector 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracionVariablesGlobales",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declaracionVariablesGlobales ::= variableGlobal1 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracionVariablesGlobales",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declaracionVariablesGlobales ::= declaracionVariablesGlobales variableGlobal1 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("declaracionVariablesGlobales",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // programa ::= bloque 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // programa ::= declaracionVariablesGlobales bloque 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("programa",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= programa EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
