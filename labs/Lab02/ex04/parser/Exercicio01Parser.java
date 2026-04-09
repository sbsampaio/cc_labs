// Generated from Exercicio01.g by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Exercicio01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, A=3, WS=4;
	public static final int
		RULE_begin = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'a'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "A", "WS"
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
	public String getGrammarFileName() { return "Exercicio01.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Exercicio01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BeginContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Exercicio01Parser.EOF, 0); }
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expr();
			setState(5);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode A() { return getToken(Exercicio01Parser.A, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			int _alt;
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(T__0);
				setState(9); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(8);
						expr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(11); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(13);
				match(T__1);
				}
				break;
			case A:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(A);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\u0004\u0001\u0004\u0013\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\n\b\u0001\u000b\u0001\f\u0001\u000b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0011\b\u0001\u0001\u0001\u0001\u000b\u0000\u0002\u0000\u0002"+
		"\u0000\u0000\u0012\u0000\u0004\u0001\u0000\u0000\u0000\u0002\u0010\u0001"+
		"\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001\u0000\u0005\u0006\u0005"+
		"\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000\u0000\u0007\t\u0005\u0001"+
		"\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n"+
		"\u000b\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\u000b\t"+
		"\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000\r\u000e\u0005\u0002"+
		"\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f\u0011\u0005\u0003"+
		"\u0000\u0000\u0010\u0007\u0001\u0000\u0000\u0000\u0010\u000f\u0001\u0000"+
		"\u0000\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0002\u000b\u0010";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}