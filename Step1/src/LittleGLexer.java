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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, PROGRAM=20, BEGIN=21, END=22, FUNCTION=23, READ=24, 
		WRITE=25, IF=26, ELSE=27, ENDIF=28, WHILE=29, ENDWHILE=30, CONTINUE=31, 
		BREAK=32, RETURN=33, INT=34, VOID=35, STRING=36, FLOAT=37, IDENTIFIER=38, 
		INTLITERAL=39, FLOATLITERAL=40, STRINGLITERAL=41, COMMENT=42, WS=43, OPERATORS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "PROGRAM", "BEGIN", "END", "FUNCTION", "READ", "WRITE", 
			"IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "CONTINUE", "BREAK", "RETURN", 
			"INT", "VOID", "STRING", "FLOAT", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", 
			"STRINGLITERAL", "COMMENT", "WS", "OPERATORS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'IDENTIFIER'", "':='", "';'", "'STRINGLITERAL'", "','", "'('", 
			"')'", "'INTLITERAL'", "'FLOATLITERAL'", "'+'", "'-'", "'*'", "'/'", 
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
			null, null, null, null, null, null, null, null, "PROGRAM", "BEGIN", "END", 
			"FUNCTION", "READ", "WRITE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", 
			"CONTINUE", "BREAK", "RETURN", "INT", "VOID", "STRING", "FLOAT", "IDENTIFIER", 
			"INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", "WS", "OPERATORS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0163\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\7\'\u0120\n\'\f\'\16\'\u0123\13\'\3(\3(\6(\u0127\n(\r(\16(\u0128\5"+
		"(\u012b\n(\3)\6)\u012e\n)\r)\16)\u012f\3)\3)\6)\u0134\n)\r)\16)\u0135"+
		"\3*\3*\7*\u013a\n*\f*\16*\u013d\13*\3*\3*\3+\3+\3+\3+\7+\u0145\n+\f+\16"+
		"+\u0148\13+\3+\5+\u014b\n+\3+\3+\3+\3+\3,\6,\u0152\n,\r,\16,\u0153\3,"+
		"\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0162\n-\2\2.\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.\3\2\n\4\2C\\c|\5\2\62;C\\c|\3\2\62;\3\2$$\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\6\2,-//\61\61??\6\2*+..=>@@\2\u0170\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5f\3\2\2\2\7i\3\2\2\2\tk\3\2\2\2\13y\3\2"+
		"\2\2\r{\3\2\2\2\17}\3\2\2\2\21\177\3\2\2\2\23\u008a\3\2\2\2\25\u0097\3"+
		"\2\2\2\27\u0099\3\2\2\2\31\u009b\3\2\2\2\33\u009d\3\2\2\2\35\u009f\3\2"+
		"\2\2\37\u00a1\3\2\2\2!\u00a3\3\2\2\2#\u00a5\3\2\2\2%\u00a8\3\2\2\2\'\u00ab"+
		"\3\2\2\2)\u00ae\3\2\2\2+\u00b6\3\2\2\2-\u00bc\3\2\2\2/\u00c0\3\2\2\2\61"+
		"\u00c9\3\2\2\2\63\u00ce\3\2\2\2\65\u00d4\3\2\2\2\67\u00d7\3\2\2\29\u00dc"+
		"\3\2\2\2;\u00e2\3\2\2\2=\u00e8\3\2\2\2?\u00f1\3\2\2\2A\u00fa\3\2\2\2C"+
		"\u0100\3\2\2\2E\u0107\3\2\2\2G\u010b\3\2\2\2I\u0110\3\2\2\2K\u0117\3\2"+
		"\2\2M\u011d\3\2\2\2O\u012a\3\2\2\2Q\u012d\3\2\2\2S\u0137\3\2\2\2U\u0140"+
		"\3\2\2\2W\u0151\3\2\2\2Y\u0161\3\2\2\2[\\\7K\2\2\\]\7F\2\2]^\7G\2\2^_"+
		"\7P\2\2_`\7V\2\2`a\7K\2\2ab\7H\2\2bc\7K\2\2cd\7G\2\2de\7T\2\2e\4\3\2\2"+
		"\2fg\7<\2\2gh\7?\2\2h\6\3\2\2\2ij\7=\2\2j\b\3\2\2\2kl\7U\2\2lm\7V\2\2"+
		"mn\7T\2\2no\7K\2\2op\7P\2\2pq\7I\2\2qr\7N\2\2rs\7K\2\2st\7V\2\2tu\7G\2"+
		"\2uv\7T\2\2vw\7C\2\2wx\7N\2\2x\n\3\2\2\2yz\7.\2\2z\f\3\2\2\2{|\7*\2\2"+
		"|\16\3\2\2\2}~\7+\2\2~\20\3\2\2\2\177\u0080\7K\2\2\u0080\u0081\7P\2\2"+
		"\u0081\u0082\7V\2\2\u0082\u0083\7N\2\2\u0083\u0084\7K\2\2\u0084\u0085"+
		"\7V\2\2\u0085\u0086\7G\2\2\u0086\u0087\7T\2\2\u0087\u0088\7C\2\2\u0088"+
		"\u0089\7N\2\2\u0089\22\3\2\2\2\u008a\u008b\7H\2\2\u008b\u008c\7N\2\2\u008c"+
		"\u008d\7Q\2\2\u008d\u008e\7C\2\2\u008e\u008f\7V\2\2\u008f\u0090\7N\2\2"+
		"\u0090\u0091\7K\2\2\u0091\u0092\7V\2\2\u0092\u0093\7G\2\2\u0093\u0094"+
		"\7T\2\2\u0094\u0095\7C\2\2\u0095\u0096\7N\2\2\u0096\24\3\2\2\2\u0097\u0098"+
		"\7-\2\2\u0098\26\3\2\2\2\u0099\u009a\7/\2\2\u009a\30\3\2\2\2\u009b\u009c"+
		"\7,\2\2\u009c\32\3\2\2\2\u009d\u009e\7\61\2\2\u009e\34\3\2\2\2\u009f\u00a0"+
		"\7>\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2 \3\2\2\2\u00a3\u00a4"+
		"\7?\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\7?\2\2\u00a7$\3"+
		"\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa\7?\2\2\u00aa&\3\2\2\2\u00ab\u00ac"+
		"\7@\2\2\u00ac\u00ad\7?\2\2\u00ad(\3\2\2\2\u00ae\u00af\7R\2\2\u00af\u00b0"+
		"\7T\2\2\u00b0\u00b1\7Q\2\2\u00b1\u00b2\7I\2\2\u00b2\u00b3\7T\2\2\u00b3"+
		"\u00b4\7C\2\2\u00b4\u00b5\7O\2\2\u00b5*\3\2\2\2\u00b6\u00b7\7D\2\2\u00b7"+
		"\u00b8\7G\2\2\u00b8\u00b9\7I\2\2\u00b9\u00ba\7K\2\2\u00ba\u00bb\7P\2\2"+
		"\u00bb,\3\2\2\2\u00bc\u00bd\7G\2\2\u00bd\u00be\7P\2\2\u00be\u00bf\7F\2"+
		"\2\u00bf.\3\2\2\2\u00c0\u00c1\7H\2\2\u00c1\u00c2\7W\2\2\u00c2\u00c3\7"+
		"P\2\2\u00c3\u00c4\7E\2\2\u00c4\u00c5\7V\2\2\u00c5\u00c6\7K\2\2\u00c6\u00c7"+
		"\7Q\2\2\u00c7\u00c8\7P\2\2\u00c8\60\3\2\2\2\u00c9\u00ca\7T\2\2\u00ca\u00cb"+
		"\7G\2\2\u00cb\u00cc\7C\2\2\u00cc\u00cd\7F\2\2\u00cd\62\3\2\2\2\u00ce\u00cf"+
		"\7Y\2\2\u00cf\u00d0\7T\2\2\u00d0\u00d1\7K\2\2\u00d1\u00d2\7V\2\2\u00d2"+
		"\u00d3\7G\2\2\u00d3\64\3\2\2\2\u00d4\u00d5\7K\2\2\u00d5\u00d6\7H\2\2\u00d6"+
		"\66\3\2\2\2\u00d7\u00d8\7G\2\2\u00d8\u00d9\7N\2\2\u00d9\u00da\7U\2\2\u00da"+
		"\u00db\7G\2\2\u00db8\3\2\2\2\u00dc\u00dd\7G\2\2\u00dd\u00de\7P\2\2\u00de"+
		"\u00df\7F\2\2\u00df\u00e0\7K\2\2\u00e0\u00e1\7H\2\2\u00e1:\3\2\2\2\u00e2"+
		"\u00e3\7Y\2\2\u00e3\u00e4\7J\2\2\u00e4\u00e5\7K\2\2\u00e5\u00e6\7N\2\2"+
		"\u00e6\u00e7\7G\2\2\u00e7<\3\2\2\2\u00e8\u00e9\7G\2\2\u00e9\u00ea\7P\2"+
		"\2\u00ea\u00eb\7F\2\2\u00eb\u00ec\7Y\2\2\u00ec\u00ed\7J\2\2\u00ed\u00ee"+
		"\7K\2\2\u00ee\u00ef\7N\2\2\u00ef\u00f0\7G\2\2\u00f0>\3\2\2\2\u00f1\u00f2"+
		"\7E\2\2\u00f2\u00f3\7Q\2\2\u00f3\u00f4\7P\2\2\u00f4\u00f5\7V\2\2\u00f5"+
		"\u00f6\7K\2\2\u00f6\u00f7\7P\2\2\u00f7\u00f8\7W\2\2\u00f8\u00f9\7G\2\2"+
		"\u00f9@\3\2\2\2\u00fa\u00fb\7D\2\2\u00fb\u00fc\7T\2\2\u00fc\u00fd\7G\2"+
		"\2\u00fd\u00fe\7C\2\2\u00fe\u00ff\7M\2\2\u00ffB\3\2\2\2\u0100\u0101\7"+
		"T\2\2\u0101\u0102\7G\2\2\u0102\u0103\7V\2\2\u0103\u0104\7W\2\2\u0104\u0105"+
		"\7T\2\2\u0105\u0106\7P\2\2\u0106D\3\2\2\2\u0107\u0108\7K\2\2\u0108\u0109"+
		"\7P\2\2\u0109\u010a\7V\2\2\u010aF\3\2\2\2\u010b\u010c\7X\2\2\u010c\u010d"+
		"\7Q\2\2\u010d\u010e\7K\2\2\u010e\u010f\7F\2\2\u010fH\3\2\2\2\u0110\u0111"+
		"\7U\2\2\u0111\u0112\7V\2\2\u0112\u0113\7T\2\2\u0113\u0114\7K\2\2\u0114"+
		"\u0115\7P\2\2\u0115\u0116\7I\2\2\u0116J\3\2\2\2\u0117\u0118\7H\2\2\u0118"+
		"\u0119\7N\2\2\u0119\u011a\7Q\2\2\u011a\u011b\7C\2\2\u011b\u011c\7V\2\2"+
		"\u011cL\3\2\2\2\u011d\u0121\t\2\2\2\u011e\u0120\t\3\2\2\u011f\u011e\3"+
		"\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"N\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u012b\7\62\2\2\u0125\u0127\t\4\2\2"+
		"\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0126\3\2\2\2\u012b"+
		"P\3\2\2\2\u012c\u012e\t\4\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133"+
		"\13\2\2\2\u0132\u0134\t\4\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2"+
		"\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136R\3\2\2\2\u0137\u013b\7"+
		"$\2\2\u0138\u013a\n\5\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013e\u013f\7$\2\2\u013fT\3\2\2\2\u0140\u0141\7/\2\2\u0141\u0142"+
		"\7/\2\2\u0142\u0146\3\2\2\2\u0143\u0145\n\6\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014b\7\17\2\2\u014a\u0149\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\f\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014f\b+\2\2\u014fV\3\2\2\2\u0150\u0152\t\7\2\2\u0151\u0150"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0156\b,\2\2\u0156X\3\2\2\2\u0157\u0158\7<\2\2\u0158"+
		"\u0162\7?\2\2\u0159\u0162\t\b\2\2\u015a\u015b\7#\2\2\u015b\u0162\7?\2"+
		"\2\u015c\u0162\t\t\2\2\u015d\u015e\7>\2\2\u015e\u0162\7?\2\2\u015f\u0160"+
		"\7@\2\2\u0160\u0162\7?\2\2\u0161\u0157\3\2\2\2\u0161\u0159\3\2\2\2\u0161"+
		"\u015a\3\2\2\2\u0161\u015c\3\2\2\2\u0161\u015d\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0162Z\3\2\2\2\16\2\u011f\u0121\u0128\u012a\u012f\u0135\u013b\u0146"+
		"\u014a\u0153\u0161\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}