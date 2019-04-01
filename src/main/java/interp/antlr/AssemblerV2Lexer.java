// Generated from /Users/zac-tse/Development/github/playground/src/main/resources/interp/AssemblerV2.g4 by ANTLR 4.7.2
package interp.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerV2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, REG=8, ID=9, FUNC=10, 
		INT=11, CHAR=12, STRING=13, FLOAT=14, WS=15, NEWLINE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "REG", "ID", 
			"FUNC", "LETTER", "INT", "CHAR", "STRING", "STR_CHARS", "FLOAT", "WS", 
			"NEWLINE"
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


	public AssemblerV2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AssemblerV2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\7\nN\n\n\f\n\16\nQ\13\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\5\rZ\n\r\3\r\6\r]\n\r\r\r\16\r^\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\7\20j\n\20\f\20\16\20m\13\20\3\21\3\21\3\21\7"+
		"\21r\n\21\f\21\16\21u\13\21\3\21\3\21\6\21y\n\21\r\21\16\21z\5\21}\n\21"+
		"\3\22\6\22\u0080\n\22\r\22\16\22\u0081\3\22\3\22\3\23\3\23\7\23\u0088"+
		"\n\23\f\23\16\23\u008b\13\23\5\23\u008d\n\23\3\23\5\23\u0090\n\23\3\23"+
		"\3\23\3\u0089\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2"+
		"\31\r\33\16\35\17\37\2!\20#\21%\22\3\2\5\4\2C\\c|\3\2$$\4\2\13\13\"\""+
		"\2\u009c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3"+
		"\'\3\2\2\2\5\60\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\13<\3\2\2\2\r>\3\2\2"+
		"\2\17@\3\2\2\2\21G\3\2\2\2\23J\3\2\2\2\25R\3\2\2\2\27V\3\2\2\2\31Y\3\2"+
		"\2\2\33`\3\2\2\2\35d\3\2\2\2\37k\3\2\2\2!|\3\2\2\2#\177\3\2\2\2%\u008c"+
		"\3\2\2\2\'(\7\60\2\2()\7i\2\2)*\7n\2\2*+\7q\2\2+,\7d\2\2,-\7c\2\2-.\7"+
		"n\2\2./\7u\2\2/\4\3\2\2\2\60\61\7\60\2\2\61\62\7f\2\2\62\63\7g\2\2\63"+
		"\64\7h\2\2\64\6\3\2\2\2\65\66\7<\2\2\66\b\3\2\2\2\678\7c\2\289\7t\2\2"+
		"9:\7i\2\2:;\7u\2\2;\n\3\2\2\2<=\7?\2\2=\f\3\2\2\2>?\7.\2\2?\16\3\2\2\2"+
		"@A\7n\2\2AB\7q\2\2BC\7e\2\2CD\7c\2\2DE\7n\2\2EF\7u\2\2F\20\3\2\2\2GH\7"+
		"t\2\2HI\5\31\r\2I\22\3\2\2\2JO\5\27\f\2KN\5\27\f\2LN\4\62;\2MK\3\2\2\2"+
		"ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\24\3\2\2\2QO\3\2\2\2RS\5\23"+
		"\n\2ST\7*\2\2TU\7+\2\2U\26\3\2\2\2VW\t\2\2\2W\30\3\2\2\2XZ\7/\2\2YX\3"+
		"\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[]\4\62;\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2"+
		"^_\3\2\2\2_\32\3\2\2\2`a\7)\2\2ab\13\2\2\2bc\7)\2\2c\34\3\2\2\2de\7$\2"+
		"\2ef\5\37\20\2fg\7$\2\2g\36\3\2\2\2hj\n\3\2\2ih\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2l \3\2\2\2mk\3\2\2\2no\5\31\r\2os\7\60\2\2pr\5\31\r\2"+
		"qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t}\3\2\2\2us\3\2\2\2vx\7\60\2"+
		"\2wy\5\31\r\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|n\3\2"+
		"\2\2|v\3\2\2\2}\"\3\2\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\b\22\2\2\u0084$\3\2\2\2\u0085\u0089\7=\2\2\u0086\u0088\13\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008a\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u0085\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0090\7\17\2\2\u008f\u008e\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\f\2\2\u0092"+
		"&\3\2\2\2\17\2MOY^ksz|\u0081\u0089\u008c\u008f\3\3\22\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}