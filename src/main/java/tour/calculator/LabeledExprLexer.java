// Generated from /Users/zac-tse/Development/github/playground/src/main/resources/tour/LabeledExpr.g4 by ANTLR 4.7
package tour.calculator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, ID=5, INT=6, NEWLINE=7, WS=8, MUL=9, DIV=10, 
		ADD=11, SUB=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "ID", "INT", "NEWLINE", "WS", "MUL", "DIV", 
		"ADD", "SUB"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'clear'", "'('", "')'", null, null, null, null, "'*'", "'/'", 
		"'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "ID", "INT", "NEWLINE", "WS", "MUL", "DIV", 
		"ADD", "SUB"
	};
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


	public LabeledExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16E\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\6\6)\n\6\r\6\16\6*\3\7\6\7.\n\7\r\7\16\7/\3\b\5\b\63\n\b\3\b\3\b\3"+
		"\t\6\t8\n\t\r\t\16\t9\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\2\2\16"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\5\4\2C\\"+
		"c|\3\2\62;\4\2\13\13\"\"\2H\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7#\3"+
		"\2\2\2\t%\3\2\2\2\13(\3\2\2\2\r-\3\2\2\2\17\62\3\2\2\2\21\67\3\2\2\2\23"+
		"=\3\2\2\2\25?\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33\34\7?\2\2\34\4\3\2\2"+
		"\2\35\36\7e\2\2\36\37\7n\2\2\37 \7g\2\2 !\7c\2\2!\"\7t\2\2\"\6\3\2\2\2"+
		"#$\7*\2\2$\b\3\2\2\2%&\7+\2\2&\n\3\2\2\2\')\t\2\2\2(\'\3\2\2\2)*\3\2\2"+
		"\2*(\3\2\2\2*+\3\2\2\2+\f\3\2\2\2,.\t\3\2\2-,\3\2\2\2./\3\2\2\2/-\3\2"+
		"\2\2/\60\3\2\2\2\60\16\3\2\2\2\61\63\7\17\2\2\62\61\3\2\2\2\62\63\3\2"+
		"\2\2\63\64\3\2\2\2\64\65\7\f\2\2\65\20\3\2\2\2\668\t\4\2\2\67\66\3\2\2"+
		"\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\b\t\2\2<\22\3\2\2\2=>\7"+
		",\2\2>\24\3\2\2\2?@\7\61\2\2@\26\3\2\2\2AB\7-\2\2B\30\3\2\2\2CD\7/\2\2"+
		"D\32\3\2\2\2\7\2*/\629\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}