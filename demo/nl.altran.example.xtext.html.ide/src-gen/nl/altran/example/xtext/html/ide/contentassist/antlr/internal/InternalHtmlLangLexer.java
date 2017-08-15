package nl.altran.example.xtext.html.ide.contentassist.antlr.internal;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
// Hack: Use our own Lexer superclass by means of import.
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;

@SuppressWarnings("all")
public class InternalHtmlLangLexer extends Lexer {
	public static final int T__19 = 19;
	public static final int T__15 = 15;
	public static final int T__16 = 16;
	public static final int T__17 = 17;
	public static final int T__18 = 18;
	public static final int T__11 = 11;
	public static final int T__12 = 12;
	public static final int T__13 = 13;
	public static final int T__14 = 14;
	public static final int EOF = -1;
	public static final int T__10 = 10;
	public static final int T__9 = 9;
	public static final int T__8 = 8;
	public static final int T__7 = 7;
	public static final int RULE_WS = 5;
	public static final int RULE_ANY_OTHER = 6;
	public static final int T__26 = 26;
	public static final int RULE_HTMLSTRING = 4;
	public static final int T__22 = 22;
	public static final int T__23 = 23;
	public static final int T__24 = 24;
	public static final int T__25 = 25;
	public static final int T__20 = 20;
	public static final int T__21 = 21;

	// delegates
	// delegators

	public InternalHtmlLangLexer() {
		;
	}

	public InternalHtmlLangLexer(final CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public InternalHtmlLangLexer(final CharStream input, final RecognizerSharedState state) {
		super(input, state);

	}

	@Override
	public String getGrammarFileName() {
		return "InternalHtmlLang.g";
	}

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			final int _type = T__7;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:11:6: ( '<html>' )
			// InternalHtmlLang.g:11:8: '<html>'
			{
				match("<html>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			final int _type = T__8;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:12:6: ( '</html>' )
			// InternalHtmlLang.g:12:8: '</html>'
			{
				match("</html>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			final int _type = T__9;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:13:6: ( '<head>' )
			// InternalHtmlLang.g:13:8: '<head>'
			{
				match("<head>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			final int _type = T__10;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:14:7: ( '</head>' )
			// InternalHtmlLang.g:14:9: '</head>'
			{
				match("</head>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			final int _type = T__11;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:15:7: ( '<title>' )
			// InternalHtmlLang.g:15:9: '<title>'
			{
				match("<title>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			final int _type = T__12;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:16:7: ( '</title>' )
			// InternalHtmlLang.g:16:9: '</title>'
			{
				match("</title>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			final int _type = T__13;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:17:7: ( '<style>' )
			// InternalHtmlLang.g:17:9: '<style>'
			{
				match("<style>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			final int _type = T__14;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:18:7: ( '</style>' )
			// InternalHtmlLang.g:18:9: '</style>'
			{
				match("</style>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			final int _type = T__15;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:19:7: ( '<body>' )
			// InternalHtmlLang.g:19:9: '<body>'
			{
				match("<body>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			final int _type = T__16;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:20:7: ( '</body>' )
			// InternalHtmlLang.g:20:9: '</body>'
			{
				match("</body>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			final int _type = T__17;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:21:7: ( '<p>' )
			// InternalHtmlLang.g:21:9: '<p>'
			{
				match("<p>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			final int _type = T__18;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:22:7: ( '</p>' )
			// InternalHtmlLang.g:22:9: '</p>'
			{
				match("</p>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			final int _type = T__19;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:23:7: ( '<ul>' )
			// InternalHtmlLang.g:23:9: '<ul>'
			{
				match("<ul>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			final int _type = T__20;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:24:7: ( '</ul>' )
			// InternalHtmlLang.g:24:9: '</ul>'
			{
				match("</ul>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			final int _type = T__21;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:25:7: ( '<li>' )
			// InternalHtmlLang.g:25:9: '<li>'
			{
				match("<li>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			final int _type = T__22;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:26:7: ( '</li>' )
			// InternalHtmlLang.g:26:9: '</li>'
			{
				match("</li>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			final int _type = T__23;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:27:7: ( '<b>' )
			// InternalHtmlLang.g:27:9: '<b>'
			{
				match("<b>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			final int _type = T__24;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:28:7: ( '</b>' )
			// InternalHtmlLang.g:28:9: '</b>'
			{
				match("</b>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			final int _type = T__25;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:29:7: ( '<i>' )
			// InternalHtmlLang.g:29:9: '<i>'
			{
				match("<i>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			final int _type = T__26;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:30:7: ( '</i>' )
			// InternalHtmlLang.g:30:9: '</i>'
			{
				match("</i>");


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "RULE_HTMLSTRING"
	public final void mRULE_HTMLSTRING() throws RecognitionException {
		try {
			final int _type = RULE_HTMLSTRING;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:1603:17: ( (~ ( ( '<' | '>' | '\\t' | '\\r' |
			// '\\n' ) ) )* )
			// InternalHtmlLang.g:1603:19: (~ ( ( '<' | '>' | '\\t' | '\\r' |
			// '\\n' ) ) )*
			{
				// InternalHtmlLang.g:1603:19: (~ ( ( '<' | '>' | '\\t' | '\\r'
				// | '\\n' ) ) )*
				loop1: do {
					int alt1 = 2;
					final int LA1_0 = this.input.LA(1);

					if (((LA1_0 >= '\u0000' && LA1_0 <= '\b') || (LA1_0 >= '\u000B' && LA1_0 <= '\f')
							|| (LA1_0 >= '\u000E' && LA1_0 <= ';') || LA1_0 == '='
							|| (LA1_0 >= '?' && LA1_0 <= '\uFFFF'))) {
						alt1 = 1;
					}


					switch (alt1) {
						case 1:
						// InternalHtmlLang.g:1603:19: ~ ( ( '<' | '>' | '\\t' |
						// '\\r' | '\\n' ) )
						{
							if ((this.input.LA(1) >= '\u0000' && this.input.LA(1) <= '\b')
									|| (this.input.LA(1) >= '\u000B' && this.input.LA(1) <= '\f')
									|| (this.input.LA(1) >= '\u000E' && this.input.LA(1) <= ';')
									|| this.input.LA(1) == '='
									|| (this.input.LA(1) >= '?' && this.input.LA(1) <= '\uFFFF')) {
								this.input.consume();

							} else {
								final MismatchedSetException mse = new MismatchedSetException(null, this.input);
								recover(mse);
								throw mse;
							}


						}
							break;
						
						default:
							break loop1;
					}
				} while (true);


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "RULE_HTMLSTRING"

	// $ANTLR start "RULE_WS"
	public final void mRULE_WS() throws RecognitionException {
		try {
			final int _type = RULE_WS;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:1605:9: ( ( '\\t' | '\\r' | '\\n' )+ )
			// InternalHtmlLang.g:1605:11: ( '\\t' | '\\r' | '\\n' )+
			{
				// InternalHtmlLang.g:1605:11: ( '\\t' | '\\r' | '\\n' )+
				int cnt2 = 0;
				loop2: do {
					int alt2 = 2;
					final int LA2_0 = this.input.LA(1);

					if (((LA2_0 >= '\t' && LA2_0 <= '\n') || LA2_0 == '\r')) {
						alt2 = 1;
					}


					switch (alt2) {
						case 1:
						// InternalHtmlLang.g:
						{
							if ((this.input.LA(1) >= '\t' && this.input.LA(1) <= '\n') || this.input.LA(1) == '\r') {
								this.input.consume();

							} else {
								final MismatchedSetException mse = new MismatchedSetException(null, this.input);
								recover(mse);
								throw mse;
							}


						}
							break;
						
						default:
							if (cnt2 >= 1) {
								break loop2;
							}
							final EarlyExitException eee = new EarlyExitException(2, this.input);
							throw eee;
					}
					cnt2++;
				} while (true);


			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "RULE_WS"

	// $ANTLR start "RULE_ANY_OTHER"
	public final void mRULE_ANY_OTHER() throws RecognitionException {
		try {
			final int _type = RULE_ANY_OTHER;
			final int _channel = DEFAULT_TOKEN_CHANNEL;
			// InternalHtmlLang.g:1607:16: ( . )
			// InternalHtmlLang.g:1607:18: .
			{
				matchAny();

			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}
	// $ANTLR end "RULE_ANY_OTHER"

	@Override
	public void mTokens() throws RecognitionException {
		// InternalHtmlLang.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12
		// | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 |
		// T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_HTMLSTRING |
		// RULE_WS | RULE_ANY_OTHER )
		int alt3 = 23;
		alt3 = this.dfa3.predict(this.input);
		switch (alt3) {
			case 1:
			// InternalHtmlLang.g:1:10: T__7
			{
				mT__7();

			}
				break;
			case 2:
			// InternalHtmlLang.g:1:15: T__8
			{
				mT__8();

			}
				break;
			case 3:
			// InternalHtmlLang.g:1:20: T__9
			{
				mT__9();

			}
				break;
			case 4:
			// InternalHtmlLang.g:1:25: T__10
			{
				mT__10();

			}
				break;
			case 5:
			// InternalHtmlLang.g:1:31: T__11
			{
				mT__11();

			}
				break;
			case 6:
			// InternalHtmlLang.g:1:37: T__12
			{
				mT__12();

			}
				break;
			case 7:
			// InternalHtmlLang.g:1:43: T__13
			{
				mT__13();

			}
				break;
			case 8:
			// InternalHtmlLang.g:1:49: T__14
			{
				mT__14();

			}
				break;
			case 9:
			// InternalHtmlLang.g:1:55: T__15
			{
				mT__15();

			}
				break;
			case 10:
			// InternalHtmlLang.g:1:61: T__16
			{
				mT__16();

			}
				break;
			case 11:
			// InternalHtmlLang.g:1:67: T__17
			{
				mT__17();

			}
				break;
			case 12:
			// InternalHtmlLang.g:1:73: T__18
			{
				mT__18();

			}
				break;
			case 13:
			// InternalHtmlLang.g:1:79: T__19
			{
				mT__19();

			}
				break;
			case 14:
			// InternalHtmlLang.g:1:85: T__20
			{
				mT__20();

			}
				break;
			case 15:
			// InternalHtmlLang.g:1:91: T__21
			{
				mT__21();

			}
				break;
			case 16:
			// InternalHtmlLang.g:1:97: T__22
			{
				mT__22();

			}
				break;
			case 17:
			// InternalHtmlLang.g:1:103: T__23
			{
				mT__23();

			}
				break;
			case 18:
			// InternalHtmlLang.g:1:109: T__24
			{
				mT__24();

			}
				break;
			case 19:
			// InternalHtmlLang.g:1:115: T__25
			{
				mT__25();

			}
				break;
			case 20:
			// InternalHtmlLang.g:1:121: T__26
			{
				mT__26();

			}
				break;
			case 21:
			// InternalHtmlLang.g:1:127: RULE_HTMLSTRING
			{
				mRULE_HTMLSTRING();

			}
				break;
			case 22:
			// InternalHtmlLang.g:1:143: RULE_WS
			{
				mRULE_WS();

			}
				break;
			case 23:
			// InternalHtmlLang.g:1:151: RULE_ANY_OTHER
			{
				mRULE_ANY_OTHER();

			}
				break;
			
		}

	}


	protected DFA3 dfa3 = new DFA3(this);
	static final String DFA3_eotS = "\1\3\1\5\36\uffff";
	static final String DFA3_eofS = "\40\uffff";
	static final String DFA3_minS = "\1\0\1\57\4\uffff\1\145\1\142\2\uffff\1\76\7\uffff\1\145\2\uffff\1\76\12\uffff";
	static final String DFA3_maxS = "\1\uffff\1\165\4\uffff\1\164\1\165\2\uffff\1\157\7\uffff\1\164\2\uffff\1\157\12\uffff";
	static final String DFA3_acceptS = "\2\uffff\2\25\1\26\1\27\2\uffff\1\5\1\7\1\uffff\1\13\1\15\1\17\1\23\1\26\1\1\1\3\1\uffff\1\6\1\10\1\uffff\1\14\1\16\1\20\1\24\1\11\1\21\1\2\1\4\1\12\1\22";
	static final String DFA3_specialS = "\1\0\37\uffff}>";
	static final String[] DFA3_transitionS = { "\11\2\2\4\2\2\1\4\56\2\1\1\1\2\1\5\uffc1\2",
			"\1\7\62\uffff\1\12\5\uffff\1\6\1\16\2\uffff\1\15\3\uffff\1\13\2\uffff\1\11\1\10\1\14", "", "", "", "",
			"\1\21\16\uffff\1\20", "\1\25\5\uffff\1\22\1\31\2\uffff\1\30\3\uffff\1\26\2\uffff\1\24\1\23\1\27", "", "",
			"\1\33\60\uffff\1\32", "", "", "", "", "", "", "", "\1\35\16\uffff\1\34", "", "", "\1\37\60\uffff\1\36", "",
			"", "", "", "", "", "", "", "", "" };

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		final int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	class DFA3 extends DFA {
		
		public DFA3(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}

		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_HTMLSTRING | RULE_WS | RULE_ANY_OTHER );";
		}

		@Override
		public int specialStateTransition(int s, final IntStream _input) throws NoViableAltException {
			final IntStream input = _input;
			final int _s = s;
			switch (s) {
				case 0:
					final int LA3_0 = input.LA(1);

					s = -1;
					if ((LA3_0 == '<')) {
						s = 1;
					}

					else if (((LA3_0 >= '\u0000' && LA3_0 <= '\b') || (LA3_0 >= '\u000B' && LA3_0 <= '\f')
							|| (LA3_0 >= '\u000E' && LA3_0 <= ';') || LA3_0 == '='
							|| (LA3_0 >= '?' && LA3_0 <= '\uFFFF'))) {
						s = 2;
					}

					else if (((LA3_0 >= '\t' && LA3_0 <= '\n') || LA3_0 == '\r')) {
						s = 4;
					}

					else if ((LA3_0 == '>')) {
						s = 5;
					} else {
						s = 3;
					}

					if (s >= 0) {
						return s;
					}
					break;
			}
			final NoViableAltException nvae = new NoViableAltException(getDescription(), 3, _s, input);
			error(nvae);
			throw nvae;
		}
	}


}