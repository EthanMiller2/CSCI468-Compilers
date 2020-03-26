// Generated from LittleG.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LittleGLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, PROGRAM=16, 
		BEGIN=17, END=18, FUNCTION=19, READ=20, WRITE=21, IF=22, ELSE=23, ENDIF=24, 
		WHILE=25, ENDWHILE=26, CONTINUE=27, BREAK=28, RETURN=29, INT=30, VOID=31, 
		STRING=32, FLOAT=33, IDENTIFIER=34, INTLITERAL=35, FLOATLITERAL=36, STRINGLITERAL=37, 
		COMMENT=38, WS=39, OPERATORS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "PROGRAM", "BEGIN", 
			"END", "FUNCTION", "READ", "WRITE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", 
			"CONTINUE", "BREAK", "RETURN", "INT", "VOID", "STRING", "FLOAT", "IDENTIFIER", 
			"INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", "WS", "OPERATORS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':='", "';'", "','", "'('", "')'", "'+'", "'-'", "'*'", "'/'", 
			"'<'", "'>'", "'='", "'!='", "'<='", "'>='", "'PROGRAM'", "'BEGIN'", 
			"'END'", "'FUNCTION'", "'READ'", "'WRITE'", "'IF'", "'ELSE'", "'ENDIF'", 
			"'WHILE'", "'ENDWHILE'", "'CONTINUE'", "'BREAK'", "'RETURN'", "'INT'", 
			"'VOID'", "'STRING'", "'FLOAT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "PROGRAM", "BEGIN", "END", "FUNCTION", "READ", 
			"WRITE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "CONTINUE", "BREAK", 
			"RETURN", "INT", "VOID", "STRING", "FLOAT", "IDENTIFIER", "INTLITERAL", 
			"FLOATLITERAL", "STRINGLITERAL", "COMMENT", "WS", "OPERATORS"
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


	public LittleGLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LittleG.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0127\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\7#\u00e7\n#\f#\16#\u00ea\13#\3$"+
		"\6$\u00ed\n$\r$\16$\u00ee\3%\6%\u00f2\n%\r%\16%\u00f3\3%\3%\6%\u00f8\n"+
		"%\r%\16%\u00f9\3&\3&\7&\u00fe\n&\f&\16&\u0101\13&\3&\3&\3\'\3\'\3\'\3"+
		"\'\7\'\u0109\n\'\f\'\16\'\u010c\13\'\3\'\5\'\u010f\n\'\3\'\3\'\3\'\3\'"+
		"\3(\6(\u0116\n(\r(\16(\u0117\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0126"+
		"\n)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\n\4\2C\\c|\5\2\62;C\\c|\3\2\62;\3"+
		"\2$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\6\2,-//\61\61??\6\2*+..=>@@\2\u0133"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5"+
		"V\3\2\2\2\7X\3\2\2\2\tZ\3\2\2\2\13\\\3\2\2\2\r^\3\2\2\2\17`\3\2\2\2\21"+
		"b\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2"+
		"\35o\3\2\2\2\37r\3\2\2\2!u\3\2\2\2#}\3\2\2\2%\u0083\3\2\2\2\'\u0087\3"+
		"\2\2\2)\u0090\3\2\2\2+\u0095\3\2\2\2-\u009b\3\2\2\2/\u009e\3\2\2\2\61"+
		"\u00a3\3\2\2\2\63\u00a9\3\2\2\2\65\u00af\3\2\2\2\67\u00b8\3\2\2\29\u00c1"+
		"\3\2\2\2;\u00c7\3\2\2\2=\u00ce\3\2\2\2?\u00d2\3\2\2\2A\u00d7\3\2\2\2C"+
		"\u00de\3\2\2\2E\u00e4\3\2\2\2G\u00ec\3\2\2\2I\u00f1\3\2\2\2K\u00fb\3\2"+
		"\2\2M\u0104\3\2\2\2O\u0115\3\2\2\2Q\u0125\3\2\2\2ST\7<\2\2TU\7?\2\2U\4"+
		"\3\2\2\2VW\7=\2\2W\6\3\2\2\2XY\7.\2\2Y\b\3\2\2\2Z[\7*\2\2[\n\3\2\2\2\\"+
		"]\7+\2\2]\f\3\2\2\2^_\7-\2\2_\16\3\2\2\2`a\7/\2\2a\20\3\2\2\2bc\7,\2\2"+
		"c\22\3\2\2\2de\7\61\2\2e\24\3\2\2\2fg\7>\2\2g\26\3\2\2\2hi\7@\2\2i\30"+
		"\3\2\2\2jk\7?\2\2k\32\3\2\2\2lm\7#\2\2mn\7?\2\2n\34\3\2\2\2op\7>\2\2p"+
		"q\7?\2\2q\36\3\2\2\2rs\7@\2\2st\7?\2\2t \3\2\2\2uv\7R\2\2vw\7T\2\2wx\7"+
		"Q\2\2xy\7I\2\2yz\7T\2\2z{\7C\2\2{|\7O\2\2|\"\3\2\2\2}~\7D\2\2~\177\7G"+
		"\2\2\177\u0080\7I\2\2\u0080\u0081\7K\2\2\u0081\u0082\7P\2\2\u0082$\3\2"+
		"\2\2\u0083\u0084\7G\2\2\u0084\u0085\7P\2\2\u0085\u0086\7F\2\2\u0086&\3"+
		"\2\2\2\u0087\u0088\7H\2\2\u0088\u0089\7W\2\2\u0089\u008a\7P\2\2\u008a"+
		"\u008b\7E\2\2\u008b\u008c\7V\2\2\u008c\u008d\7K\2\2\u008d\u008e\7Q\2\2"+
		"\u008e\u008f\7P\2\2\u008f(\3\2\2\2\u0090\u0091\7T\2\2\u0091\u0092\7G\2"+
		"\2\u0092\u0093\7C\2\2\u0093\u0094\7F\2\2\u0094*\3\2\2\2\u0095\u0096\7"+
		"Y\2\2\u0096\u0097\7T\2\2\u0097\u0098\7K\2\2\u0098\u0099\7V\2\2\u0099\u009a"+
		"\7G\2\2\u009a,\3\2\2\2\u009b\u009c\7K\2\2\u009c\u009d\7H\2\2\u009d.\3"+
		"\2\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7N\2\2\u00a0\u00a1\7U\2\2\u00a1"+
		"\u00a2\7G\2\2\u00a2\60\3\2\2\2\u00a3\u00a4\7G\2\2\u00a4\u00a5\7P\2\2\u00a5"+
		"\u00a6\7F\2\2\u00a6\u00a7\7K\2\2\u00a7\u00a8\7H\2\2\u00a8\62\3\2\2\2\u00a9"+
		"\u00aa\7Y\2\2\u00aa\u00ab\7J\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7N\2\2"+
		"\u00ad\u00ae\7G\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7G\2\2\u00b0\u00b1\7"+
		"P\2\2\u00b1\u00b2\7F\2\2\u00b2\u00b3\7Y\2\2\u00b3\u00b4\7J\2\2\u00b4\u00b5"+
		"\7K\2\2\u00b5\u00b6\7N\2\2\u00b6\u00b7\7G\2\2\u00b7\66\3\2\2\2\u00b8\u00b9"+
		"\7E\2\2\u00b9\u00ba\7Q\2\2\u00ba\u00bb\7P\2\2\u00bb\u00bc\7V\2\2\u00bc"+
		"\u00bd\7K\2\2\u00bd\u00be\7P\2\2\u00be\u00bf\7W\2\2\u00bf\u00c0\7G\2\2"+
		"\u00c08\3\2\2\2\u00c1\u00c2\7D\2\2\u00c2\u00c3\7T\2\2\u00c3\u00c4\7G\2"+
		"\2\u00c4\u00c5\7C\2\2\u00c5\u00c6\7M\2\2\u00c6:\3\2\2\2\u00c7\u00c8\7"+
		"T\2\2\u00c8\u00c9\7G\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cb\7W\2\2\u00cb\u00cc"+
		"\7T\2\2\u00cc\u00cd\7P\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7K\2\2\u00cf\u00d0"+
		"\7P\2\2\u00d0\u00d1\7V\2\2\u00d1>\3\2\2\2\u00d2\u00d3\7X\2\2\u00d3\u00d4"+
		"\7Q\2\2\u00d4\u00d5\7K\2\2\u00d5\u00d6\7F\2\2\u00d6@\3\2\2\2\u00d7\u00d8"+
		"\7U\2\2\u00d8\u00d9\7V\2\2\u00d9\u00da\7T\2\2\u00da\u00db\7K\2\2\u00db"+
		"\u00dc\7P\2\2\u00dc\u00dd\7I\2\2\u00ddB\3\2\2\2\u00de\u00df\7H\2\2\u00df"+
		"\u00e0\7N\2\2\u00e0\u00e1\7Q\2\2\u00e1\u00e2\7C\2\2\u00e2\u00e3\7V\2\2"+
		"\u00e3D\3\2\2\2\u00e4\u00e8\t\2\2\2\u00e5\u00e7\t\3\2\2\u00e6\u00e5\3"+
		"\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"F\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\t\4\2\2\u00ec\u00eb\3\2\2\2"+
		"\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efH\3"+
		"\2\2\2\u00f0\u00f2\t\4\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\13"+
		"\2\2\2\u00f6\u00f8\t\4\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00faJ\3\2\2\2\u00fb\u00ff\7$\2\2\u00fc"+
		"\u00fe\n\5\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0103\7$\2\2\u0103L\3\2\2\2\u0104\u0105\7/\2\2\u0105\u0106\7/\2\2\u0106"+
		"\u010a\3\2\2\2\u0107\u0109\n\6\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010d\u010f\7\17\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\f\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\b\'\2\2\u0113N\3\2\2\2\u0114\u0116\t\7\2\2\u0115\u0114\3\2\2\2"+
		"\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011a\b(\2\2\u011aP\3\2\2\2\u011b\u011c\7<\2\2\u011c\u0126"+
		"\7?\2\2\u011d\u0126\t\b\2\2\u011e\u011f\7#\2\2\u011f\u0126\7?\2\2\u0120"+
		"\u0126\t\t\2\2\u0121\u0122\7>\2\2\u0122\u0126\7?\2\2\u0123\u0124\7@\2"+
		"\2\u0124\u0126\7?\2\2\u0125\u011b\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u011e"+
		"\3\2\2\2\u0125\u0120\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"R\3\2\2\2\r\2\u00e6\u00e8\u00ee\u00f3\u00f9\u00ff\u010a\u010e\u0117\u0125"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}