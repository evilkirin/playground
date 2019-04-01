// Generated from /Users/zac-tse/Development/github/playground/src/main/resources/interp/AssemblerV2.g4 by ANTLR 4.7.2
package interp.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerV2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, REG=8, ID=9, FUNC=10, 
		INT=11, CHAR=12, STRING=13, FLOAT=14, WS=15, NEWLINE=16;
	public static final int
		RULE_program = 0, RULE_globals = 1, RULE_functionDeclaration = 2, RULE_instr = 3, 
		RULE_operand = 4, RULE_label = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "globals", "functionDeclaration", "instr", "operand", "label"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.globals'", "'.def'", "':'", "'args'", "'='", "','", "'locals'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "REG", "ID", "FUNC", 
			"INT", "CHAR", "STRING", "FLOAT", "WS", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AssemblerV2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssemblerV2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public GlobalsContext globals() {
			return getRuleContext(GlobalsContext.class,0);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AssemblerV2Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssemblerV2Parser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerV2Visitor ) return ((AssemblerV2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(12);
				globals();
				}
				break;
			}
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(19);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(15);
					functionDeclaration();
					}
					break;
				case 2:
					{
					setState(16);
					instr();
					}
					break;
				case 3:
					{
					setState(17);
					label();
					}
					break;
				case 4:
					{
					setState(18);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ID) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AssemblerV2Parser.INT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(AssemblerV2Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AssemblerV2Parser.NEWLINE, i);
		}
		public GlobalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).enterGlobals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).exitGlobals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerV2Visitor ) return ((AssemblerV2Visitor<? extends T>)visitor).visitGlobals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalsContext globals() throws RecognitionException {
		GlobalsContext _localctx = new GlobalsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_globals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(23);
				match(NEWLINE);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(T__0);
			setState(30);
			match(INT);
			setState(31);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AssemblerV2Parser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(AssemblerV2Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(AssemblerV2Parser.INT, i);
		}
		public TerminalNode NEWLINE() { return getToken(AssemblerV2Parser.NEWLINE, 0); }
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerV2Visitor ) return ((AssemblerV2Visitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__1);
			setState(34);
			match(ID);
			setState(35);
			match(T__2);
			setState(36);
			match(T__3);
			setState(37);
			match(T__4);
			setState(38);
			match(INT);
			setState(39);
			match(T__5);
			setState(40);
			match(T__6);
			setState(41);
			match(T__4);
			setState(42);
			match(INT);
			setState(43);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrContext extends ParserRuleContext {
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
	 
		public InstrContext() { }
		public void copyFrom(InstrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NoArgInstContext extends InstrContext {
		public TerminalNode ID() { return getToken(AssemblerV2Parser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(AssemblerV2Parser.NEWLINE, 0); }
		public NoArgInstContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).enterNoArgInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).exitNoArgInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerV2Visitor ) return ((AssemblerV2Visitor<? extends T>)visitor).visitNoArgInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThreeArgsInstContext extends InstrContext {
		public TerminalNode ID() { return getToken(AssemblerV2Parser.ID, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(AssemblerV2Parser.NEWLINE, 0); }
		public ThreeArgsInstContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).enterThreeArgsInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).exitThreeArgsInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerV2Visitor ) return ((AssemblerV2Visitor<? extends T>)visitor).visitThreeArgsInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TwoArgsInstContext extends InstrContext {
		public TerminalNode ID() { return getToken(AssemblerV2Parser.ID, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(AssemblerV2Parser.NEWLINE, 0); }
		public TwoArgsInstContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).enterTwoArgsInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).exitTwoArgsInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerV2Visitor ) return ((AssemblerV2Visitor<? extends T>)visitor).visitTwoArgsInst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleArgInstContext extends InstrContext {
		public TerminalNode ID() { return getToken(AssemblerV2Parser.ID, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AssemblerV2Parser.NEWLINE, 0); }
		public SingleArgInstContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).enterSingleArgInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).exitSingleArgInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerV2Visitor ) return ((AssemblerV2Visitor<? extends T>)visitor).visitSingleArgInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instr);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new NoArgInstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(ID);
				setState(46);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new SingleArgInstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(ID);
				setState(48);
				operand();
				setState(49);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new TwoArgsInstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(ID);
				setState(52);
				operand();
				setState(53);
				match(T__5);
				setState(54);
				operand();
				setState(55);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new ThreeArgsInstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(ID);
				setState(58);
				operand();
				setState(59);
				match(T__5);
				setState(60);
				operand();
				setState(61);
				match(T__5);
				setState(62);
				operand();
				setState(63);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AssemblerV2Parser.ID, 0); }
		public TerminalNode REG() { return getToken(AssemblerV2Parser.REG, 0); }
		public TerminalNode FUNC() { return getToken(AssemblerV2Parser.FUNC, 0); }
		public TerminalNode INT() { return getToken(AssemblerV2Parser.INT, 0); }
		public TerminalNode CHAR() { return getToken(AssemblerV2Parser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(AssemblerV2Parser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(AssemblerV2Parser.FLOAT, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerV2Visitor ) return ((AssemblerV2Visitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REG) | (1L << ID) | (1L << FUNC) | (1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << FLOAT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AssemblerV2Parser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerV2Listener ) ((AssemblerV2Listener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerV2Visitor ) return ((AssemblerV2Visitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\5\2\20\n\2\3\2\3\2\3\2\3\2\6\2"+
		"\26\n\2\r\2\16\2\27\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\n\20\2M\2\17\3\2\2\2\4"+
		"\34\3\2\2\2\6#\3\2\2\2\bC\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16\20\5\4\3\2"+
		"\17\16\3\2\2\2\17\20\3\2\2\2\20\25\3\2\2\2\21\26\5\6\4\2\22\26\5\b\5\2"+
		"\23\26\5\f\7\2\24\26\7\22\2\2\25\21\3\2\2\2\25\22\3\2\2\2\25\23\3\2\2"+
		"\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2"+
		"\2\31\33\7\22\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2"+
		"\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\3\2\2 !\7\r\2\2!\"\7\22\2\2\"\5"+
		"\3\2\2\2#$\7\4\2\2$%\7\13\2\2%&\7\5\2\2&\'\7\6\2\2\'(\7\7\2\2()\7\r\2"+
		"\2)*\7\b\2\2*+\7\t\2\2+,\7\7\2\2,-\7\r\2\2-.\7\22\2\2.\7\3\2\2\2/\60\7"+
		"\13\2\2\60D\7\22\2\2\61\62\7\13\2\2\62\63\5\n\6\2\63\64\7\22\2\2\64D\3"+
		"\2\2\2\65\66\7\13\2\2\66\67\5\n\6\2\678\7\b\2\289\5\n\6\29:\7\22\2\2:"+
		"D\3\2\2\2;<\7\13\2\2<=\5\n\6\2=>\7\b\2\2>?\5\n\6\2?@\7\b\2\2@A\5\n\6\2"+
		"AB\7\22\2\2BD\3\2\2\2C/\3\2\2\2C\61\3\2\2\2C\65\3\2\2\2C;\3\2\2\2D\t\3"+
		"\2\2\2EF\t\2\2\2F\13\3\2\2\2GH\7\13\2\2HI\7\5\2\2I\r\3\2\2\2\7\17\25\27"+
		"\34C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}