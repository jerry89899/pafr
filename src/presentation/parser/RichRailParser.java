// Generated from C:/Users/Tjibbe/Documents/GitHub/richrail/user-interface/src\RichRail.g4 by ANTLR 4.7
package presentation.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RichRailParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TYPE=9, 
		ID=10, NUMBER=11, Ignore=12;
	public static final int
		RULE_command = 0, RULE_newcommand = 1, RULE_addcommand = 2, RULE_getcommand = 3, 
		RULE_delcommand = 4, RULE_remcommand = 5;
	public static final String[] ruleNames = {
		"command", "newcommand", "addcommand", "getcommand", "delcommand", "remcommand"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'new'", "'numseats'", "'add'", "'to'", "'getnumseats'", "'delete'", 
		"'remove'", "'from'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "TYPE", "ID", "NUMBER", 
		"Ignore"
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

	@Override
	public String getGrammarFileName() { return "RichRail.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RichRailParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandContext extends ParserRuleContext {
		public NewcommandContext newcommand() {
			return getRuleContext(NewcommandContext.class,0);
		}
		public AddcommandContext addcommand() {
			return getRuleContext(AddcommandContext.class,0);
		}
		public GetcommandContext getcommand() {
			return getRuleContext(GetcommandContext.class,0);
		}
		public DelcommandContext delcommand() {
			return getRuleContext(DelcommandContext.class,0);
		}
		public RemcommandContext remcommand() {
			return getRuleContext(RemcommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitCommand(this);
		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RichRailVisitor ) return ((RichRailVisitor<? extends T>)visitor).visitCommand(this);
//			else return visitor.visitChildren(this);
//		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(17);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				newcommand();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				addcommand();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				getcommand();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(15);
				delcommand();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(16);
				remcommand();
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

	public static class NewcommandContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(RichRailParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(RichRailParser.NUMBER, 0); }
		public NewcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewcommand(this);
		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RichRailVisitor ) return ((RichRailVisitor<? extends T>)visitor).visitNewcommand(this);
//			else return visitor.visitChildren(this);
//		}
	}

	public final NewcommandContext newcommand() throws RecognitionException {
		NewcommandContext _localctx = new NewcommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_newcommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__0);
			setState(20);
			match(TYPE);
			setState(21);
			match(ID);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(22);
				match(T__1);
				setState(23);
				match(NUMBER);
				}
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

	public static class AddcommandContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RichRailParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RichRailParser.ID, i);
		}
		public AddcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterAddcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitAddcommand(this);
		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RichRailVisitor ) return ((RichRailVisitor<? extends T>)visitor).visitAddcommand(this);
//			else return visitor.visitChildren(this);
//		}
	}

	public final AddcommandContext addcommand() throws RecognitionException {
		AddcommandContext _localctx = new AddcommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_addcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__2);
			setState(27);
			match(ID);
			setState(28);
			match(T__3);
			setState(29);
			match(ID);
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

	public static class GetcommandContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(RichRailParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public GetcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterGetcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitGetcommand(this);
		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RichRailVisitor ) return ((RichRailVisitor<? extends T>)visitor).visitGetcommand(this);
//			else return visitor.visitChildren(this);
//		}
	}

	public final GetcommandContext getcommand() throws RecognitionException {
		GetcommandContext _localctx = new GetcommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_getcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__4);
			setState(32);
			match(TYPE);
			setState(33);
			match(ID);
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

	public static class DelcommandContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(RichRailParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public DelcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterDelcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitDelcommand(this);
		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RichRailVisitor ) return ((RichRailVisitor<? extends T>)visitor).visitDelcommand(this);
//			else return visitor.visitChildren(this);
//		}
	}

	public final DelcommandContext delcommand() throws RecognitionException {
		DelcommandContext _localctx = new DelcommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_delcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__5);
			setState(36);
			match(TYPE);
			setState(37);
			match(ID);
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

	public static class RemcommandContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RichRailParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RichRailParser.ID, i);
		}
		public RemcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterRemcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitRemcommand(this);
		}
//		@Override
//		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
//			if ( visitor instanceof RichRailVisitor ) return ((RichRailVisitor<? extends T>)visitor).visitRemcommand(this);
//			else return visitor.visitChildren(this);
//		}
	}

	public final RemcommandContext remcommand() throws RecognitionException {
		RemcommandContext _localctx = new RemcommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_remcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__6);
			setState(40);
			match(ID);
			setState(41);
			match(T__7);
			setState(42);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2-\2\23\3\2\2"+
		"\2\4\25\3\2\2\2\6\34\3\2\2\2\b!\3\2\2\2\n%\3\2\2\2\f)\3\2\2\2\16\24\5"+
		"\4\3\2\17\24\5\6\4\2\20\24\5\b\5\2\21\24\5\n\6\2\22\24\5\f\7\2\23\16\3"+
		"\2\2\2\23\17\3\2\2\2\23\20\3\2\2\2\23\21\3\2\2\2\23\22\3\2\2\2\24\3\3"+
		"\2\2\2\25\26\7\3\2\2\26\27\7\13\2\2\27\32\7\f\2\2\30\31\7\4\2\2\31\33"+
		"\7\r\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2\2\34\35\7\5\2\2\35\36"+
		"\7\f\2\2\36\37\7\6\2\2\37 \7\f\2\2 \7\3\2\2\2!\"\7\7\2\2\"#\7\13\2\2#"+
		"$\7\f\2\2$\t\3\2\2\2%&\7\b\2\2&\'\7\13\2\2\'(\7\f\2\2(\13\3\2\2\2)*\7"+
		"\t\2\2*+\7\f\2\2+,\7\n\2\2,-\7\f\2\2-\r\3\2\2\2\4\23\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}