/* The following code was generated by JFlex 1.5.0-SNAPSHOT */

package proyectocompiladores;
import java_cup.runtime.*;
import java.io.Reader;
      

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.0-SNAPSHOT
 * from the specification file <tt>C:/Users/USER/Documents/NetBeansProjects/PROYECTOcOMPILADORES/src/proyectocompiladores/Lexico.flex</tt>
 */
class Lexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\4\1\0\1\5\1\3\22\0\1\5\6\0\1\52"+
    "\1\16\1\20\1\11\1\7\1\15\1\10\1\61\1\12\1\6\10\2"+
    "\1\57\1\13\1\14\1\23\1\22\1\24\2\0\1\55\21\1\1\44"+
    "\6\1\1\56\1\25\1\0\1\26\3\0\1\40\1\41\1\42\1\47"+
    "\1\35\1\36\1\45\1\33\1\27\2\60\1\34\1\60\1\30\1\37"+
    "\1\50\1\60\1\43\1\46\1\31\1\51\1\60\1\32\2\60\1\54"+
    "\1\17\1\53\1\21\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\12\24\1\1\1\24\2\1"+
    "\1\0\1\25\1\0\1\24\1\26\12\24\1\0\1\27"+
    "\1\0\1\30\1\0\1\31\13\24\1\0\1\32\1\0"+
    "\1\24\1\33\1\34\1\24\1\35\2\24\1\36\1\37"+
    "\1\24\2\0\1\40\1\41\1\42\2\24\2\0\1\43"+
    "\1\44\1\45\22\0\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[111];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\62\0\310\0\144\0\62"+
    "\0\62\0\62\0\62\0\62\0\372\0\62\0\62\0\62"+
    "\0\62\0\62\0\62\0\62\0\62\0\u012c\0\u015e\0\u0190"+
    "\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\u02ee\0\u0320"+
    "\0\u0352\0\u0384\0\u03b6\0\u03b6\0\62\0\u03e8\0\u041a\0\u015e"+
    "\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514\0\u0546\0\u0578\0\u05aa"+
    "\0\u05dc\0\u060e\0\u0640\0\u015e\0\u0672\0\u03b6\0\u06a4\0\u015e"+
    "\0\u06d6\0\u0708\0\u073a\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834"+
    "\0\u0866\0\u0898\0\u08ca\0\u08fc\0\62\0\u092e\0\u0960\0\u015e"+
    "\0\u015e\0\u0992\0\u015e\0\u09c4\0\u09f6\0\u015e\0\u015e\0\u0a28"+
    "\0\u0a5a\0\u0a8c\0\u015e\0\u015e\0\u015e\0\u0abe\0\u0af0\0\u0b22"+
    "\0\u0b54\0\u015e\0\u015e\0\62\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c"+
    "\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac"+
    "\0\u0dde\0\u0e10\0\u0e42\0\u0e74\0\u0ea6\0\u0ed8\0\62";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[111];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\2\5\1\3\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\2\27\1\32\1\33\1\34\1\27\1\35\1\36"+
    "\1\37\1\40\2\27\1\41\2\27\1\42\1\2\1\27"+
    "\2\2\1\3\1\27\1\43\64\0\1\3\3\0\1\3"+
    "\50\0\1\3\1\0\1\44\4\0\1\5\57\0\1\3"+
    "\3\0\1\3\1\45\47\0\1\3\1\0\1\44\25\0"+
    "\1\46\35\0\2\27\3\0\1\27\20\0\1\27\1\47"+
    "\5\27\1\50\13\27\1\0\6\27\2\0\2\27\3\0"+
    "\1\27\20\0\23\27\1\0\6\27\2\0\2\27\3\0"+
    "\1\27\20\0\4\27\1\51\7\27\1\52\6\27\1\0"+
    "\6\27\2\0\2\27\3\0\1\27\20\0\4\27\1\53"+
    "\16\27\1\0\6\27\2\0\2\27\3\0\1\27\20\0"+
    "\5\27\1\54\15\27\1\0\6\27\2\0\2\27\3\0"+
    "\1\27\20\0\5\27\1\55\3\27\1\56\11\27\1\0"+
    "\6\27\2\0\2\27\3\0\1\27\20\0\22\27\1\57"+
    "\1\0\6\27\2\0\2\27\3\0\1\27\20\0\10\27"+
    "\1\60\12\27\1\0\6\27\2\0\2\27\3\0\1\27"+
    "\20\0\4\27\1\61\16\27\1\0\6\27\2\0\2\27"+
    "\3\0\1\27\20\0\6\27\1\62\14\27\1\0\6\27"+
    "\32\0\1\63\31\0\2\27\3\0\1\27\20\0\10\27"+
    "\1\64\12\27\1\0\6\27\2\0\1\65\25\0\23\65"+
    "\1\0\4\65\1\0\1\65\3\0\1\66\3\0\1\66"+
    "\50\0\1\66\42\0\1\67\22\0\2\27\3\0\1\27"+
    "\20\0\2\27\1\70\16\27\1\71\1\27\1\0\6\27"+
    "\2\0\2\27\3\0\1\27\20\0\6\27\1\72\14\27"+
    "\1\0\6\27\2\0\2\27\3\0\1\27\20\0\22\27"+
    "\1\73\1\0\6\27\2\0\2\27\3\0\1\27\20\0"+
    "\1\74\22\27\1\0\6\27\2\0\2\27\3\0\1\27"+
    "\20\0\17\27\1\75\3\27\1\0\6\27\2\0\2\27"+
    "\3\0\1\27\20\0\10\27\1\76\12\27\1\0\6\27"+
    "\2\0\2\27\3\0\1\27\20\0\5\27\1\77\15\27"+
    "\1\0\6\27\2\0\2\27\3\0\1\27\20\0\2\27"+
    "\1\100\20\27\1\0\6\27\2\0\2\27\3\0\1\27"+
    "\20\0\10\27\1\101\12\27\1\0\6\27\2\0\2\27"+
    "\3\0\1\27\20\0\11\27\1\102\11\27\1\0\6\27"+
    "\2\0\2\27\3\0\1\27\20\0\2\27\1\103\20\27"+
    "\1\0\6\27\44\0\1\104\17\0\2\65\3\0\1\65"+
    "\20\0\23\65\1\105\6\65\11\0\1\106\52\0\2\27"+
    "\3\0\1\27\20\0\22\27\1\107\1\0\6\27\2\0"+
    "\2\27\3\0\1\27\20\0\1\27\1\110\21\27\1\0"+
    "\6\27\2\0\2\27\3\0\1\27\20\0\6\27\1\111"+
    "\14\27\1\0\6\27\2\0\2\27\3\0\1\27\20\0"+
    "\5\27\1\112\15\27\1\0\6\27\2\0\2\27\3\0"+
    "\1\27\20\0\6\27\1\113\14\27\1\0\6\27\2\0"+
    "\2\27\3\0\1\27\20\0\11\27\1\114\11\27\1\0"+
    "\6\27\2\0\2\27\3\0\1\27\20\0\17\27\1\73"+
    "\3\27\1\0\6\27\2\0\2\27\3\0\1\27\20\0"+
    "\21\27\1\115\1\27\1\0\6\27\2\0\2\27\3\0"+
    "\1\27\20\0\5\27\1\116\15\27\1\0\6\27\2\0"+
    "\2\27\3\0\1\27\20\0\14\27\1\117\6\27\1\0"+
    "\6\27\2\0\2\27\3\0\1\27\20\0\22\27\1\120"+
    "\1\0\6\27\30\0\1\121\106\0\1\122\6\0\2\27"+
    "\3\0\1\27\20\0\2\27\1\123\20\27\1\0\6\27"+
    "\2\0\2\27\3\0\1\27\20\0\6\27\1\124\14\27"+
    "\1\0\6\27\2\0\2\27\3\0\1\27\20\0\2\27"+
    "\1\125\20\27\1\0\6\27\2\0\2\27\3\0\1\27"+
    "\20\0\22\27\1\126\1\0\6\27\2\0\2\27\3\0"+
    "\1\27\20\0\14\27\1\127\6\27\1\0\6\27\31\0"+
    "\1\130\104\0\1\131\7\0\2\27\3\0\1\27\20\0"+
    "\2\27\1\132\20\27\1\0\6\27\2\0\2\27\3\0"+
    "\1\27\20\0\1\27\1\133\21\27\1\0\6\27\46\0"+
    "\1\134\71\0\1\135\14\0\1\136\127\0\1\137\31\0"+
    "\1\140\60\0\1\141\74\0\1\142\31\0\1\143\125\0"+
    "\1\144\60\0\1\145\63\0\1\146\14\0\1\147\127\0"+
    "\1\150\56\0\1\151\14\0\1\152\63\0\1\153\130\0"+
    "\1\154\30\0\1\155\44\0\1\156\70\0\1\157\41\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3850];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\2\1\5\11\1\1\10\11"+
    "\16\1\1\0\1\11\1\0\14\1\1\0\1\1\1\0"+
    "\1\1\1\0\14\1\1\0\1\11\1\0\12\1\2\0"+
    "\5\1\2\0\2\1\1\11\22\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[111];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 128) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { throw new Error("Caracter ilegal <"+yytext()+">");
          }
        case 39: break;
        case 2: 
          { System.out.print(yytext()); 
                      return symbol(sym.INTEGER, new Integer(yytext()));
          }
        case 40: break;
        case 3: 
          { /* ignora el espacio */
          }
        case 41: break;
        case 4: 
          { System.out.print(" + ");
                          return symbol(sym.SUMA);
          }
        case 42: break;
        case 5: 
          { System.out.print(" - ");
                          return symbol(sym.RESTA);
          }
        case 43: break;
        case 6: 
          { System.out.print(" * ");
                          return symbol(sym.MULT);
          }
        case 44: break;
        case 7: 
          { System.out.print(" / ");
                          return symbol(sym.DIV);
          }
        case 45: break;
        case 8: 
          { System.out.print(" : ");
                          return symbol(sym.DOSP);
          }
        case 46: break;
        case 9: 
          { System.out.print(" ; " + "\n");
                          return symbol(sym.TER);
          }
        case 47: break;
        case 10: 
          { System.out.print(" , ");
                          return symbol(sym.COMA);
          }
        case 48: break;
        case 11: 
          { System.out.print(" ( ");
                          return symbol(sym.PARENTESISABIERTO);
          }
        case 49: break;
        case 12: 
          { System.out.print(" { " + "\n");
                          return symbol(sym.LLAVEABIERTA);
          }
        case 50: break;
        case 13: 
          { System.out.print(" ) " + "\n");
                          return symbol(sym.PARENTESISCERRADO);
          }
        case 51: break;
        case 14: 
          { System.out.print(" } " + "\n");
                          return symbol(sym.LLAVECERRADA);
          }
        case 52: break;
        case 15: 
          { System.out.print(" = ");
                          return symbol(sym.EQUAL);
          }
        case 53: break;
        case 16: 
          { System.out.print(" < ");
                          return symbol(sym.MENOR);
          }
        case 54: break;
        case 17: 
          { System.out.print(" > ");
                          return symbol(sym.MAYOR);
          }
        case 55: break;
        case 18: 
          { System.out.print(" [ ");
                          return symbol(sym.CORCHIZQ);
          }
        case 56: break;
        case 19: 
          { System.out.print(" ] ");
                          return symbol(sym.CORCHDER);
          }
        case 57: break;
        case 20: 
          { System.out.print(yytext()); 
return symbol(sym.IDENTIFICADOR, new String(yytext()));
          }
        case 58: break;
        case 21: 
          { System.out.print(" ++ ");
                          return symbol(sym.INCREMENTO);
          }
        case 59: break;
        case 22: 
          { System.out.print("if"); 
                      return symbol(sym.IF);
          }
        case 60: break;
        case 23: 
          { System.out.print("do"); 
                      return symbol(sym.DO);
          }
        case 61: break;
        case 24: 
          { System.out.print(yytext()); 
return symbol(sym.FLOTANTE, new Integer(yytext()));
          }
        case 62: break;
        case 25: 
          { System.out.print(" int ");
                      return symbol(sym.INT);
          }
        case 63: break;
        case 26: 
          { System.out.print(yytext()); 
return symbol(sym.CHAR, new String (yytext()));
          }
        case 64: break;
        case 27: 
          { System.out.print("then  "); 
                      return symbol(sym.THEN);
          }
        case 65: break;
        case 28: 
          { System.out.print(yytext()); 
                      return symbol(sym.BOOLEANO);
          }
        case 66: break;
        case 29: 
          { System.out.print("else"); 
                      return symbol(sym.PELSE);
          }
        case 67: break;
        case 30: 
          { System.out.print("bool"); 
                      return symbol(sym.BOOL);
          }
        case 68: break;
        case 31: 
          { System.out.print("char"); 
                      return symbol(sym.CHA);
          }
        case 69: break;
        case 32: 
          { System.out.print("input"); 
                      return symbol(sym.INPUT);
          }
        case 70: break;
        case 33: 
          { System.out.print(" while") ; 
                      return symbol(sym.while);
          }
        case 71: break;
        case 34: 
          { System.out.print(yytext()); 
                      return symbol(sym.FLOA, new Integer(yytext()));
          }
        case 72: break;
        case 35: 
          { System.out.print("output"); 
                      return symbol(sym.OUTPUT);
          }
        case 73: break;
        case 36: 
          { System.out.print("return"); 
                      return symbol(sym.RET);
          }
        case 74: break;
        case 37: 
          { System.out.print("String"); 
                      return symbol(sym.string);
          }
        case 75: break;
        case 38: 
          { System.out.print(yytext()); 
                      return symbol(sym.STRING, new String(yytext()));
          }
        case 76: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
