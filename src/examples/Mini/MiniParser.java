/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
/* Generated By:JJTree&JavaCC: Do not edit this line. MiniParser.java */
package Mini;

public class MiniParser/*@bgen(jjtree)*/implements MiniParserTreeConstants, MiniParserConstants {/*@bgen(jjtree)*/
  protected static JJTMiniParserState jjtree = new JJTMiniParserState();private static Token expr_token;

  final static void jjtreeOpenNodeScope(Node n) {}
  final static void jjtreeCloseNodeScope(Node n) {((SimpleNode)n).closeNode();}

/* A program consists of a number of function declarations with a
 * distinguished function `main' that starts the program.
 */
  static public void Program() throws ParseException {
                  /*@bgen(jjtree) Program */
  ASTProgram jjtn000 = new ASTProgram(JJTPROGRAM);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);
    try {
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 9:
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        FunDecl();
      }
      jj_consume_token(0);
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof ParseException) {
            {if (true) {
                throw (ParseException)jjte000;
            }}
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) {
                throw (RuntimeException)jjte000;
            }}
          }
          {if (true) {
            throw (Error)jjte000;
        }}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtreeCloseNodeScope(jjtn000);
          }
    }
  }

/* "FUN" Ident() "(" NameList() ")" = Expr()
 */
  static public void FunDecl() throws ParseException {
 /*@bgen(jjtree) FunDecl */
  ASTFunDecl jjtn000 = new ASTFunDecl(JJTFUNDECL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);Token    t;
    try {
      t = jj_consume_token(9);
                     jjtn000.setPosition(t.beginLine, t.beginColumn);
      Ident();
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case FALSE:
      case TRUE:
      case READ:
      case WRITE:
      case IDENT:
        Ident();
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case COMMA:
            break;
          default:
            jj_la1[1] = jj_gen;
            break label_2;
          }
          jj_consume_token(COMMA);
          Ident();
        }
        break;
      default:
        jj_la1[2] = jj_gen;
      }
      jj_consume_token(RPAREN);
      jj_consume_token(ASSIGN);
      Expr();
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof ParseException) {
            {if (true) {
                throw (ParseException)jjte000;
            }}
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) {
                throw (RuntimeException)jjte000;
            }}
          }
          {if (true) {
            throw (Error)jjte000;
        }}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtreeCloseNodeScope(jjtn000);
          }
    }
  }

  static public void Expr() throws ParseException {
 /*@bgen(jjtree) Expr */
  ASTExpr jjtn000 = new ASTExpr(JJTEXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);int kind=-1;
  int un_op=-1;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 10:
        IfExpr();
        break;
      case 14:
        LetExpr();
        break;
      case FALSE:
      case TRUE:
      case LPAREN:
      case READ:
      case WRITE:
      case IDENT:
      case INTEGER:
        Term();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case OR:
        case PLUS:
        case MINUS:
          kind = AddOp();
          Expr();
                                        jjtn000.setKind(kind);
          break;
        default:
          jj_la1[3] = jj_gen;
        }
        break;
      case NOT:
      case MINUS:
        un_op = UnOp();
                         jjtn000.setUnOp(un_op);
        Expr();
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof ParseException) {
            {if (true) {
                throw (ParseException)jjte000;
            }}
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) {
                throw (RuntimeException)jjte000;
            }}
          }
          {if (true) {
            throw (Error)jjte000;
        }}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtreeCloseNodeScope(jjtn000);
          }
    }
  }

/*
 * The disambiguating algorithm of JavaCC automatically binds dangling
 * else's to the innermost if statement. The LOOKAHEAD specification
 * is to tell JavaCC that we know what we are doing.
 */
  static public void IfExpr() throws ParseException {
 /*@bgen(jjtree) IfExpr */
  ASTIfExpr jjtn000 = new ASTIfExpr(JJTIFEXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);Token t=null;
    try {
      t = jj_consume_token(10);
                    jjtn000.setPosition(t.beginLine, t.beginColumn);
      Expr();
      jj_consume_token(11);
      Expr();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 12:
        jj_consume_token(12);
        Expr();
        break;
      default:
        jj_la1[5] = jj_gen;
      }
      jj_consume_token(13);
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof ParseException) {
            {if (true) {
                throw (ParseException)jjte000;
            }}
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) {
                throw (RuntimeException)jjte000;
            }}
          }
          {if (true) {
            throw (Error)jjte000;
        }}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtreeCloseNodeScope(jjtn000);
          }
    }
  }

  static public void LetExpr() throws ParseException {
 /*@bgen(jjtree) LetExpr */
  ASTLetExpr jjtn000 = new ASTLetExpr(JJTLETEXPR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);Token t=null;
    try {
      t = jj_consume_token(14);
                    jjtn000.setPosition(t.beginLine, t.beginColumn);
      label_3:
      while (true) {
        Ident();
        jj_consume_token(ASSIGN);
        Expr();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case FALSE:
        case TRUE:
        case READ:
        case WRITE:
        case IDENT:
          break;
        default:
          jj_la1[6] = jj_gen;
          break label_3;
        }
      }
      jj_consume_token(15);
      Expr();
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof ParseException) {
            {if (true) {
                throw (ParseException)jjte000;
            }}
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) {
                throw (RuntimeException)jjte000;
            }}
          }
          {if (true) {
            throw (Error)jjte000;
        }}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtreeCloseNodeScope(jjtn000);
          }
    }
  }

  static public Token FunAppl() throws ParseException {
 /*@bgen(jjtree) FunAppl */
  ASTFunAppl jjtn000 = new ASTFunAppl(JJTFUNAPPL);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);Token t=null;
    try {
      t = Ident();
                      jjtn000.setPosition(t.beginLine, t.beginColumn);
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 10:
      case 14:
      case NOT:
      case FALSE:
      case TRUE:
      case MINUS:
      case LPAREN:
      case READ:
      case WRITE:
      case IDENT:
      case INTEGER:
        Expr();
        label_4:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case COMMA:
            break;
          default:
            jj_la1[7] = jj_gen;
            break label_4;
          }
          jj_consume_token(COMMA);
          Expr();
        }
        break;
      default:
        jj_la1[8] = jj_gen;
      }
      jj_consume_token(RPAREN);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtreeCloseNodeScope(jjtn000);
          {if (true) {
            return t;
        }}
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof ParseException) {
            {if (true) {
                throw (ParseException)jjte000;
            }}
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) {
                throw (RuntimeException)jjte000;
            }}
          }
          {if (true) {
            throw (Error)jjte000;
        }}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtreeCloseNodeScope(jjtn000);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static public void Term() throws ParseException {
 /*@bgen(jjtree) Term */
  ASTTerm jjtn000 = new ASTTerm(JJTTERM);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);int kind=-1;
    try {
      Factor();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
      case MULT:
      case MOD:
      case DIV:
        kind = MultOp();
                                    jjtn000.setKind(kind);
        Term();
        break;
      default:
        jj_la1[9] = jj_gen;
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtreeCloseNodeScope(jjtn000);
          jjtn000.setPosition(expr_token.beginLine, expr_token.beginColumn);
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof ParseException) {
            {if (true) {
                throw (ParseException)jjte000;
            }}
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) {
                throw (RuntimeException)jjte000;
            }}
          }
          {if (true) {
            throw (Error)jjte000;
        }}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtreeCloseNodeScope(jjtn000);
          }
    }
  }

  static public void Factor() throws ParseException {
 /*@bgen(jjtree) Factor */
  ASTFactor jjtn000 = new ASTFactor(JJTFACTOR);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);int kind=-1;
    try {
      Element();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case GT:
      case LT:
      case GEQ:
      case LEQ:
      case EQ:
      case NEQ:
        kind = CmpOp();
                                    jjtn000.setKind(kind);
        Factor();
        break;
      default:
        jj_la1[10] = jj_gen;
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtreeCloseNodeScope(jjtn000);
          jjtn000.setPosition(expr_token.beginLine, expr_token.beginColumn);
    } catch (Throwable jjte000) {
          if (jjtc000) {
            jjtree.clearNodeScope(jjtn000);
            jjtc000 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte000 instanceof ParseException) {
            {if (true) {
                throw (ParseException)jjte000;
            }}
          }
          if (jjte000 instanceof RuntimeException) {
            {if (true) {
                throw (RuntimeException)jjte000;
            }}
          }
          {if (true) {
            throw (Error)jjte000;
        }}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtreeCloseNodeScope(jjtn000);
          }
    }
  }

  static public void Element() throws ParseException {
    if (jj_2_1(2)) {
      expr_token = FunAppl();
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case FALSE:
      case TRUE:
      case READ:
      case WRITE:
      case IDENT:
        expr_token = Ident();
        break;
      case INTEGER:
        expr_token = Integer();
        break;
      case LPAREN:
        expr_token = jj_consume_token(LPAREN);
        Expr();
        jj_consume_token(RPAREN);
        break;
      default:
        jj_la1[11] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static public Token Integer() throws ParseException {
 /*@bgen(jjtree) Integer */
  ASTInteger jjtn000 = new ASTInteger(JJTINTEGER);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(INTEGER);
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtreeCloseNodeScope(jjtn000);
          jjtn000.setValue(Integer.parseInt(t.image));
          jjtn000.setPosition(t.beginLine, t.beginColumn);
          {if (true) {
            return t;
        }}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtreeCloseNodeScope(jjtn000);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static public Token Ident() throws ParseException {
 /*@bgen(jjtree) Ident */
  ASTIdent jjtn000 = new ASTIdent(JJTIDENT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtreeOpenNodeScope(jjtn000);Token t;
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TRUE:
        t = jj_consume_token(TRUE);
        break;
      case FALSE:
        t = jj_consume_token(FALSE);
        break;
      case READ:
        t = jj_consume_token(READ);
        break;
      case WRITE:
        t = jj_consume_token(WRITE);
        break;
      case IDENT:
        t = jj_consume_token(IDENT);
        break;
      default:
        jj_la1[12] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
          jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
          jjtreeCloseNodeScope(jjtn000);
          jjtn000.setName(t.image);
          jjtn000.setPosition(t.beginLine, t.beginColumn);
          {if (true) {
            return t;
        }}
    } finally {
          if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
            jjtreeCloseNodeScope(jjtn000);
          }
    }
    throw new Error("Missing return statement in function");
  }

  static public int AddOp() throws ParseException {
  Token t=null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PLUS:
      t = jj_consume_token(PLUS);
      break;
    case MINUS:
      t = jj_consume_token(MINUS);
      break;
    case OR:
      t = jj_consume_token(OR);
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) {
        return t.kind;
    }}
    throw new Error("Missing return statement in function");
  }

  static public int MultOp() throws ParseException {
  Token t=null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MULT:
      t = jj_consume_token(MULT);
      break;
    case DIV:
      t = jj_consume_token(DIV);
      break;
    case MOD:
      t = jj_consume_token(MOD);
      break;
    case AND:
      t = jj_consume_token(AND);
      break;
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) {
        return t.kind;
    }}
    throw new Error("Missing return statement in function");
  }

  static public int CmpOp() throws ParseException {
  Token t=null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EQ:
      t = jj_consume_token(EQ);
      break;
    case NEQ:
      t = jj_consume_token(NEQ);
      break;
    case LEQ:
      t = jj_consume_token(LEQ);
      break;
    case GEQ:
      t = jj_consume_token(GEQ);
      break;
    case GT:
      t = jj_consume_token(GT);
      break;
    case LT:
      t = jj_consume_token(LT);
      break;
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) {
        return t.kind;
    }}
    throw new Error("Missing return statement in function");
  }

  static final public int UnOp() throws ParseException {
  Token t=null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MINUS:
      t = jj_consume_token(MINUS);
      break;
    case NOT:
      t = jj_consume_token(NOT);
      break;
    default:
      jj_la1[16] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    {if (true) {
        return t.kind;
    }}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    boolean retval = !jj_3_1();
    jj_save(0, xla);
    return retval;
  }

  static private boolean jj_3R_8() {
    if (jj_scan_token(FALSE)) {
        return true;
    }
    if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    return false;
  }

  static private boolean jj_3R_11() {
    if (jj_scan_token(IDENT)) {
        return true;
    }
    if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    return false;
  }

  static private boolean jj_3R_7() {
    if (jj_scan_token(TRUE)) {
        return true;
    }
    if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    return false;
  }

  static private boolean jj_3R_6() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_7()) {
    jj_scanpos = xsp;
    if (jj_3R_8()) {
    jj_scanpos = xsp;
    if (jj_3R_9()) {
    jj_scanpos = xsp;
    if (jj_3R_10()) {
    jj_scanpos = xsp;
    if (jj_3R_11()) {
        return true;
    }
    if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    } else if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_3R_5()) {
        return true;
    }
    if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    return false;
  }

  static private boolean jj_3R_5() {
    if (jj_3R_6()) {
        return true;
    }
    if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    if (jj_scan_token(LPAREN)) {
        return true;
    }
    if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    return false;
  }

  static private boolean jj_3R_10() {
    if (jj_scan_token(WRITE)) {
        return true;
    }
    if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    return false;
  }

  static private boolean jj_3R_9() {
    if (jj_scan_token(READ)) {
        return true;
    }
    if (jj_la == 0 && jj_scanpos == jj_lastpos) {
        return false;
    }
    return false;
  }

  static private boolean jj_initialized_once = false;
  static public MiniParserTokenManager token_source;
  static ASCII_CharStream jj_input_stream;
  static public Token token, jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static public boolean lookingAhead = false;
//  static private boolean jj_semLA;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[17];
  static final private int[] jj_la1_0 = {0x200,0x0,0x1800000,0x1c000000,0x11c04400,0x1000,0x1800000,0x0,0x11c04400,0xe2000000,0x3f0000,0x1800000,0x1800000,0x1c000000,0xe2000000,0x3f0000,0x10400000,};
  static final private int[] jj_la1_1 = {0x0,0x8,0x130,0x0,0x331,0x0,0x130,0x8,0x331,0x0,0x0,0x331,0x130,0x0,0x0,0x0,0x0,};
  static final private JJCalls[] jj_2_rtns = new JJCalls[1];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  public MiniParser(java.io.InputStream stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  You must");
      System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new ASCII_CharStream(stream, 1, 1);
    token_source = new MiniParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) {
        jj_la1[i] = -1;
    }
    for (int i = 0; i < jj_2_rtns.length; i++) {
        jj_2_rtns[i] = new JJCalls();
    }
  }

  static public void ReInit(java.io.InputStream stream) {
    ASCII_CharStream.ReInit(stream, 1, 1);
    MiniParserTokenManager.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 17; i++) {
        jj_la1[i] = -1;
    }
    for (int i = 0; i < jj_2_rtns.length; i++) {
        jj_2_rtns[i] = new JJCalls();
    }
  }

  public MiniParser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  You must");
      System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new ASCII_CharStream(stream, 1, 1);
    token_source = new MiniParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) {
        jj_la1[i] = -1;
    }
    for (int i = 0; i < jj_2_rtns.length; i++) {
        jj_2_rtns[i] = new JJCalls();
    }
  }

  static public void ReInit(java.io.Reader stream) {
    ASCII_CharStream.ReInit(stream, 1, 1);
    MiniParserTokenManager.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 17; i++) {
        jj_la1[i] = -1;
    }
    for (int i = 0; i < jj_2_rtns.length; i++) {
        jj_2_rtns[i] = new JJCalls();
    }
  }

  public MiniParser(MiniParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  You must");
      System.out.println("       either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) {
        jj_la1[i] = -1;
    }
    for (int i = 0; i < jj_2_rtns.length; i++) {
        jj_2_rtns[i] = new JJCalls();
    }
  }

  public void ReInit(MiniParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 17; i++) {
        jj_la1[i] = -1;
    }
    for (int i = 0; i < jj_2_rtns.length; i++) {
        jj_2_rtns[i] = new JJCalls();
    }
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) {
        token = token.next;
    } else {
        token = token.next = MiniParserTokenManager.getNextToken();
    }
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) {
                c.first = null;
            }
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = MiniParserTokenManager.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) {
        jj_add_error_token(kind, i);
    }
    }
    return (jj_scanpos.kind != kind);
  }

  static public Token getNextToken() {
    if (token.next != null) {
        token = token.next;
    } else {
        token = token.next = MiniParserTokenManager.getNextToken();
    }
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  static public Token getToken(int index) {
    Token t = lookingAhead ? jj_scanpos : token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) {
        t = t.next;
    } else {
        t = t.next = MiniParserTokenManager.getNextToken();
    }
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null) {
        return (jj_ntk = (token.next=MiniParserTokenManager.getNextToken()).kind);
    } else {
        return (jj_ntk = jj_nt.kind);
    }
  }

  static private java.util.Vector<int[]> jj_expentries = new java.util.Vector<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) {
        return;
    }
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Enumeration<int[]> e = jj_expentries.elements(); e.hasMoreElements();) {
        int[] oldentry = (e.nextElement());
        if (oldentry.length == jj_expentry.length) {
          exists = true;
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) {
            break;
        }
        }
      }
      if (!exists) {
        jj_expentries.addElement(jj_expentry);
    }
      if (pos != 0) {
        jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
    }
  }

  static public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[43];
    for (int i = 0; i < 43; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 17; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 43; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  static public void enable_tracing() {
  }

  static public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 1; i++) {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
          }
        }
        p = p.next;
      } while (p != null);
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  private static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
