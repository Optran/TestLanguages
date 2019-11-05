// Generated from Json.g4 by ANTLR 4.7.2

package com.optran.languageref.testlanguages.json;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, TRUE=4, FALSE=5, STRING=6, NUMBER=7, O_CURL=8, 
		C_CURL=9, O_SQUARE=10, C_SQUARE=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "TRUE", "FALSE", "STRING", "STRINGCHARACTER", 
			"ESCAPE_SEQ", "STR_UNICODE", "NUMBER", "O_CURL", "C_CURL", "O_SQUARE", 
			"C_SQUARE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "'null'", "'true'", "'false'", null, null, "'{'", 
			"'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "TRUE", "FALSE", "STRING", "NUMBER", "O_CURL", 
			"C_CURL", "O_SQUARE", "C_SQUARE", "WS"
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


	public JsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Json.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\7"+
		"\78\n\7\f\7\16\7;\13\7\3\7\3\7\3\b\3\b\5\bA\n\b\3\t\3\t\3\t\5\tF\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\5\13O\n\13\3\13\6\13R\n\13\r\13\16\13S\3\13"+
		"\3\13\6\13X\n\13\r\13\16\13Y\5\13\\\n\13\3\13\3\13\3\13\6\13a\n\13\r\13"+
		"\16\13b\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20n\n\20\r\20\16\20"+
		"o\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\t\27\n\31"+
		"\13\33\f\35\r\37\16\3\2\b\4\2$$^^\7\2$$hhppttvv\3\2\62;\4\2--//\4\2GG"+
		"gg\5\2\13\f\17\17\"\"\2x\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t"+
		"*\3\2\2\2\13/\3\2\2\2\r\65\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23G\3\2\2\2"+
		"\25N\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37m\3\2\2"+
		"\2!\"\7.\2\2\"\4\3\2\2\2#$\7<\2\2$\6\3\2\2\2%&\7p\2\2&\'\7w\2\2\'(\7n"+
		"\2\2()\7n\2\2)\b\3\2\2\2*+\7v\2\2+,\7t\2\2,-\7w\2\2-.\7g\2\2.\n\3\2\2"+
		"\2/\60\7h\2\2\60\61\7c\2\2\61\62\7n\2\2\62\63\7u\2\2\63\64\7g\2\2\64\f"+
		"\3\2\2\2\659\7$\2\2\668\5\17\b\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29"+
		":\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7$\2\2=\16\3\2\2\2>A\n\2\2\2?A\5\21\t"+
		"\2@>\3\2\2\2@?\3\2\2\2A\20\3\2\2\2BE\7^\2\2CF\t\3\2\2DF\5\23\n\2EC\3\2"+
		"\2\2ED\3\2\2\2F\22\3\2\2\2GH\7w\2\2HI\t\4\2\2IJ\t\4\2\2JK\t\4\2\2KL\t"+
		"\4\2\2L\24\3\2\2\2MO\t\5\2\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\t\4\2\2Q"+
		"P\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T[\3\2\2\2UW\7\60\2\2VX\t\4\2\2"+
		"WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[U\3\2\2\2[\\\3\2\2"+
		"\2\\]\3\2\2\2]^\t\6\2\2^`\t\5\2\2_a\t\4\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2"+
		"\2\2bc\3\2\2\2c\26\3\2\2\2de\7}\2\2e\30\3\2\2\2fg\7\177\2\2g\32\3\2\2"+
		"\2hi\7]\2\2i\34\3\2\2\2jk\7_\2\2k\36\3\2\2\2ln\t\7\2\2ml\3\2\2\2no\3\2"+
		"\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\b\20\2\2r \3\2\2\2\f\29@ENSY[bo\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}