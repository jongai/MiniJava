// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: path.flex

import beaver.Symbol;
import beaver.Scanner;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer extends Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\2\1\1\0\2\1\22\0\1\1\1\2\4\0"+
    "\1\3\1\0\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\0\1\13\11\14\1\0\1\15\1\16\1\17"+
    "\3\0\22\20\1\21\7\20\1\22\1\0\1\23\1\0"+
    "\1\20\1\0\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\2\20\1\35\1\36\1\37\1\40"+
    "\1\41\1\20\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\20\1\52\1\0\1\53\u0182\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\2\13\1\14\1\15\1\16"+
    "\2\17\1\20\1\21\15\17\1\22\1\23\1\24\6\17"+
    "\1\25\21\17\1\26\2\17\1\27\13\17\1\30\2\17"+
    "\1\31\3\17\1\32\1\33\1\34\4\17\1\35\5\17"+
    "\1\36\1\37\3\17\1\40\1\41\1\42\1\43\1\0"+
    "\1\44\1\45\12\0\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[119];
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
    "\0\0\0\54\0\130\0\54\0\204\0\54\0\54\0\54"+
    "\0\54\0\54\0\54\0\54\0\54\0\260\0\54\0\54"+
    "\0\54\0\334\0\u0108\0\54\0\54\0\u0134\0\u0160\0\u018c"+
    "\0\u01b8\0\u01e4\0\u0210\0\u023c\0\u0268\0\u0294\0\u02c0\0\u02ec"+
    "\0\u0318\0\u0344\0\54\0\54\0\54\0\u0370\0\u039c\0\u03c8"+
    "\0\u03f4\0\u0420\0\u044c\0\334\0\u0478\0\u04a4\0\u04d0\0\u04fc"+
    "\0\u0528\0\u0554\0\u0580\0\u05ac\0\u05d8\0\u0604\0\u0630\0\u065c"+
    "\0\u0688\0\u06b4\0\u06e0\0\u070c\0\u0738\0\334\0\u0764\0\u0790"+
    "\0\334\0\u07bc\0\u07e8\0\u0814\0\u0840\0\u086c\0\u0898\0\u08c4"+
    "\0\u08f0\0\u091c\0\u0948\0\u0974\0\334\0\u09a0\0\u09cc\0\334"+
    "\0\u09f8\0\u0a24\0\u0a50\0\334\0\334\0\334\0\u0a7c\0\u0aa8"+
    "\0\u0ad4\0\u0b00\0\334\0\u0b2c\0\u0b58\0\u0b84\0\u0bb0\0\u0bdc"+
    "\0\334\0\334\0\u0c08\0\u0c34\0\u0c60\0\334\0\334\0\334"+
    "\0\334\0\u0c8c\0\334\0\334\0\u0cb8\0\u0ce4\0\u0d10\0\u0d3c"+
    "\0\u0d68\0\u0d94\0\u0dc0\0\u0dec\0\u0e18\0\u0e44\0\54";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[119];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\22\1\26\1\27\1\22"+
    "\1\30\3\22\1\31\1\32\1\33\1\34\1\22\1\35"+
    "\1\36\1\37\1\40\1\22\1\41\1\42\2\22\1\43"+
    "\1\44\55\0\1\3\55\0\1\45\63\0\2\16\52\0"+
    "\2\22\3\0\2\22\2\0\26\22\15\0\2\22\3\0"+
    "\2\22\2\0\20\22\1\46\4\22\1\47\15\0\2\22"+
    "\3\0\2\22\2\0\14\22\1\50\11\22\15\0\2\22"+
    "\3\0\2\22\2\0\11\22\1\51\14\22\15\0\2\22"+
    "\3\0\2\22\2\0\11\22\1\52\12\22\1\53\1\22"+
    "\15\0\2\22\3\0\2\22\2\0\5\22\1\54\5\22"+
    "\1\55\12\22\15\0\2\22\3\0\2\22\2\0\4\22"+
    "\1\56\21\22\15\0\2\22\3\0\2\22\2\0\1\57"+
    "\25\22\15\0\2\22\3\0\2\22\2\0\4\22\1\60"+
    "\21\22\15\0\2\22\3\0\2\22\2\0\21\22\1\61"+
    "\4\22\15\0\2\22\3\0\2\22\2\0\4\22\1\62"+
    "\21\22\15\0\2\22\3\0\2\22\2\0\20\22\1\63"+
    "\5\22\15\0\2\22\3\0\2\22\2\0\7\22\1\64"+
    "\6\22\1\65\7\22\15\0\2\22\3\0\2\22\2\0"+
    "\14\22\1\66\11\22\15\0\2\22\3\0\2\22\2\0"+
    "\7\22\1\67\16\22\15\0\2\22\3\0\2\22\2\0"+
    "\16\22\1\70\7\22\15\0\2\22\3\0\2\22\2\0"+
    "\17\22\1\71\6\22\15\0\2\22\3\0\2\22\2\0"+
    "\14\22\1\72\11\22\15\0\2\22\3\0\2\22\2\0"+
    "\1\73\25\22\15\0\2\22\3\0\2\22\2\0\17\22"+
    "\1\74\6\22\15\0\2\22\3\0\2\22\2\0\20\22"+
    "\1\75\5\22\15\0\2\22\3\0\2\22\2\0\20\22"+
    "\1\76\5\22\15\0\2\22\3\0\2\22\2\0\13\22"+
    "\1\77\12\22\15\0\2\22\3\0\2\22\2\0\10\22"+
    "\1\100\15\22\15\0\2\22\3\0\2\22\2\0\23\22"+
    "\1\101\2\22\15\0\2\22\3\0\2\22\2\0\1\22"+
    "\1\102\24\22\15\0\2\22\3\0\2\22\2\0\20\22"+
    "\1\103\5\22\15\0\2\22\3\0\2\22\2\0\1\104"+
    "\25\22\15\0\2\22\3\0\2\22\2\0\10\22\1\105"+
    "\15\22\15\0\2\22\3\0\2\22\2\0\21\22\1\106"+
    "\4\22\15\0\2\22\3\0\2\22\2\0\10\22\1\107"+
    "\15\22\15\0\2\22\3\0\2\22\2\0\10\22\1\110"+
    "\15\22\15\0\2\22\3\0\2\22\2\0\10\22\1\111"+
    "\15\22\15\0\2\22\3\0\2\22\2\0\20\22\1\112"+
    "\5\22\15\0\2\22\3\0\2\22\2\0\11\22\1\113"+
    "\14\22\15\0\2\22\3\0\2\22\2\0\17\22\1\114"+
    "\6\22\15\0\2\22\3\0\2\22\2\0\4\22\1\115"+
    "\21\22\15\0\2\22\3\0\2\22\2\0\4\22\1\116"+
    "\21\22\15\0\2\22\3\0\2\22\2\0\6\22\1\117"+
    "\17\22\15\0\2\22\3\0\2\22\2\0\13\22\1\120"+
    "\12\22\15\0\2\22\3\0\2\22\2\0\11\22\1\121"+
    "\14\22\15\0\2\22\3\0\2\22\2\0\21\22\1\122"+
    "\4\22\15\0\2\22\3\0\2\22\2\0\20\22\1\123"+
    "\5\22\15\0\2\22\3\0\2\22\2\0\17\22\1\124"+
    "\6\22\15\0\2\22\3\0\2\22\2\0\4\22\1\125"+
    "\21\22\15\0\2\22\3\0\2\22\2\0\3\22\1\126"+
    "\22\22\15\0\2\22\3\0\2\22\2\0\11\22\1\127"+
    "\14\22\15\0\2\22\3\0\2\22\2\0\13\22\1\130"+
    "\12\22\15\0\2\22\3\0\2\22\2\0\4\22\1\131"+
    "\21\22\15\0\2\22\3\0\2\22\2\0\4\22\1\132"+
    "\21\22\15\0\2\22\3\0\2\22\2\0\17\22\1\133"+
    "\6\22\15\0\2\22\3\0\2\22\2\0\13\22\1\134"+
    "\12\22\15\0\2\22\3\0\2\22\2\0\20\22\1\135"+
    "\5\22\15\0\2\22\3\0\2\22\2\0\10\22\1\136"+
    "\15\22\15\0\2\22\3\0\2\22\2\0\16\22\1\137"+
    "\7\22\15\0\2\22\3\0\2\22\2\0\10\22\1\140"+
    "\15\22\15\0\2\22\3\0\2\22\2\0\4\22\1\141"+
    "\21\22\15\0\2\22\3\0\2\22\2\0\6\22\1\142"+
    "\17\22\15\0\2\22\3\0\2\22\2\0\12\22\1\143"+
    "\13\22\15\0\2\22\3\0\2\22\2\0\1\144\25\22"+
    "\15\0\2\22\3\0\2\22\2\0\3\22\1\145\22\22"+
    "\15\0\2\22\3\0\2\22\2\0\7\22\1\146\16\22"+
    "\15\0\2\22\3\0\2\22\2\0\2\22\1\147\23\22"+
    "\15\0\2\22\3\0\2\22\2\0\13\22\1\150\12\22"+
    "\15\0\2\22\3\0\2\22\2\0\2\22\1\151\23\22"+
    "\14\0\1\152\2\22\3\0\2\22\2\0\26\22\15\0"+
    "\2\22\3\0\2\22\2\0\13\22\1\153\12\22\15\0"+
    "\2\22\3\0\2\22\2\0\17\22\1\154\6\22\42\0"+
    "\1\155\60\0\1\156\52\0\1\157\21\0\1\160\102\0"+
    "\1\161\54\0\1\162\45\0\1\163\56\0\1\164\60\0"+
    "\1\165\44\0\1\166\55\0\1\167\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3696];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\1\1\10\11\1\1\3\11"+
    "\2\1\2\11\15\1\3\11\104\1\1\0\2\1\12\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[119];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
	private Symbol newToken(short id)
	{
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength());
	}

	private Symbol newToken(short id, Object value)
	{
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), value);
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Symbol nextToken() throws java.io.IOException, Scanner.Exception {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
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

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          { 	return newToken(Terminals.EOF, "end-of-file");
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new Scanner.Exception("unexpected character '" + yytext() + "'");
            }
            // fall through
          case 39: break;
          case 2:
            { /* ignore */
            }
            // fall through
          case 40: break;
          case 3:
            { System.out.print(" ! "); return newToken(Terminals.NOT);
            }
            // fall through
          case 41: break;
          case 4:
            { System.out.print(" ( "); return newToken(Terminals.LPAREN);
            }
            // fall through
          case 42: break;
          case 5:
            { System.out.print(" ) "); return newToken(Terminals.RPAREN);
            }
            // fall through
          case 43: break;
          case 6:
            { System.out.print(" * "); return newToken(Terminals.TIMES);
            }
            // fall through
          case 44: break;
          case 7:
            { System.out.print(" + "); return newToken(Terminals.PLUS);
            }
            // fall through
          case 45: break;
          case 8:
            { System.out.print(" , "); return newToken(Terminals.COMMA);
            }
            // fall through
          case 46: break;
          case 9:
            { System.out.print(" - "); return newToken(Terminals.MINUS);
            }
            // fall through
          case 47: break;
          case 10:
            { System.out.print(" . "); return newToken(Terminals.DOT);
            }
            // fall through
          case 48: break;
          case 11:
            { System.out.print(" INT_LIT(" + yytext() + ") "); return newToken(Terminals.INT_LIT, Integer.valueOf(yytext()));
            }
            // fall through
          case 49: break;
          case 12:
            { System.out.print(" ; "); return newToken(Terminals.SEMI);
            }
            // fall through
          case 50: break;
          case 13:
            { System.out.print(" < "); return newToken(Terminals.LESS);
            }
            // fall through
          case 51: break;
          case 14:
            { System.out.print(" = "); return newToken(Terminals.EQUALS);
            }
            // fall through
          case 52: break;
          case 15:
            { System.out.print(" ID(" + yytext() + ") "); return newToken(Terminals.ID, new Identifier(yytext()));
            }
            // fall through
          case 53: break;
          case 16:
            { System.out.print(" [ "); return newToken(Terminals.LBRACK);
            }
            // fall through
          case 54: break;
          case 17:
            { System.out.print(" ] "); return newToken(Terminals.RBRACK);
            }
            // fall through
          case 55: break;
          case 18:
            { System.out.print(" { "); return newToken(Terminals.LBRACE);
            }
            // fall through
          case 56: break;
          case 19:
            { System.out.print(" } "); return newToken(Terminals.RBRACE);
            }
            // fall through
          case 57: break;
          case 20:
            { System.out.print(" && "); return newToken(Terminals.AND);
            }
            // fall through
          case 58: break;
          case 21:
            { System.out.print(" if "); return newToken(Terminals.IF);
            }
            // fall through
          case 59: break;
          case 22:
            { System.out.print(" int "); return newToken(Terminals.INT);
            }
            // fall through
          case 60: break;
          case 23:
            { System.out.print(" new "); return newToken(Terminals.NEW);
            }
            // fall through
          case 61: break;
          case 24:
            { System.out.print(" else "); return newToken(Terminals.ELSE);
            }
            // fall through
          case 62: break;
          case 25:
            { System.out.print(" main "); return newToken(Terminals.MAIN);
            }
            // fall through
          case 63: break;
          case 26:
            { System.out.print(" this "); return newToken(Terminals.THIS);
            }
            // fall through
          case 64: break;
          case 27:
            { System.out.print(" true "); return newToken(Terminals.TRUE);
            }
            // fall through
          case 65: break;
          case 28:
            { System.out.print(" void "); return newToken(Terminals.VOID);
            }
            // fall through
          case 66: break;
          case 29:
            { System.out.print(" class "); return newToken(Terminals.CLASS);
            }
            // fall through
          case 67: break;
          case 30:
            { System.out.print(" while "); return newToken(Terminals.WHILE);
            }
            // fall through
          case 68: break;
          case 31:
            { System.out.print(" String "); return newToken(Terminals.STRING);
            }
            // fall through
          case 69: break;
          case 32:
            { System.out.print(" length "); return newToken(Terminals.LENGTH);
            }
            // fall through
          case 70: break;
          case 33:
            { System.out.print(" public "); return newToken(Terminals.PUBLIC);
            }
            // fall through
          case 71: break;
          case 34:
            { System.out.print(" return "); return newToken(Terminals.RETURN);
            }
            // fall through
          case 72: break;
          case 35:
            { System.out.print(" static "); return newToken(Terminals.STATIC);
            }
            // fall through
          case 73: break;
          case 36:
            { System.out.print(" boolean "); return newToken(Terminals.BOOLEAN);
            }
            // fall through
          case 74: break;
          case 37:
            { System.out.print(" extends "); return newToken(Terminals.EXTENDS);
            }
            // fall through
          case 75: break;
          case 38:
            { System.out.print(" System.out.println "); return newToken(Terminals.PRINT);
            }
            // fall through
          case 76: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
