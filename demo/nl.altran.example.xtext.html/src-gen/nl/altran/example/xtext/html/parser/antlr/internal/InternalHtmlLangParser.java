package nl.altran.example.xtext.html.parser.antlr.internal;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;

import nl.altran.example.xtext.html.services.HtmlLangGrammarAccess;

@SuppressWarnings("all")
public class InternalHtmlLangParser extends AbstractInternalAntlrParser {
	public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HTMLSTRING",
			"RULE_WS", "RULE_ANY_OTHER", "'<html>'", "'</html>'", "'<head>'", "'</head>'", "'<title>'", "'</title>'",
			"'<style>'", "'</style>'", "'<body>'", "'</body>'", "'<p>'", "'</p>'", "'<ul>'", "'</ul>'", "'<li>'",
			"'</li>'", "'<b>'", "'</b>'", "'<i>'", "'</i>'" };
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


	public InternalHtmlLangParser(final TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public InternalHtmlLangParser(final TokenStream input, final RecognizerSharedState state) {
		super(input, state);

	}


	@Override
	public String[] getTokenNames() {
		return InternalHtmlLangParser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "InternalHtmlLang.g";
	}



	private HtmlLangGrammarAccess grammarAccess;

	public InternalHtmlLangParser(final TokenStream input, final HtmlLangGrammarAccess grammarAccess) {
		this(input);
		this.grammarAccess = grammarAccess;
		registerRules(grammarAccess.getGrammar());
	}

	@Override
	protected String getFirstRuleName() {
		return "Html";
	}

	@Override
	protected HtmlLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}



	// $ANTLR start "entryRuleHtml"
	// InternalHtmlLang.g:64:1: entryRuleHtml returns [EObject current=null] :
	// iv_ruleHtml= ruleHtml EOF ;
	public final EObject entryRuleHtml() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleHtml = null;


		try {
			// InternalHtmlLang.g:64:45: (iv_ruleHtml= ruleHtml EOF )
			// InternalHtmlLang.g:65:2: iv_ruleHtml= ruleHtml EOF
			{
				newCompositeNode(this.grammarAccess.getHtmlRule());
				pushFollow(FOLLOW_1);
				iv_ruleHtml = ruleHtml();

				this.state._fsp--;

				current = iv_ruleHtml;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleHtml"


	// $ANTLR start "ruleHtml"
	// InternalHtmlLang.g:71:1: ruleHtml returns [EObject current=null] :
	// (otherlv_0= '<html>' ( (lv_head_1_0= ruleHead ) ) ( (lv_body_2_0=
	// ruleBody ) ) otherlv_3= '</html>' ) ;
	public final EObject ruleHtml() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_3 = null;
		EObject lv_head_1_0 = null;

		EObject lv_body_2_0 = null;



		enterRule();

		try {
			// InternalHtmlLang.g:77:2: ( (otherlv_0= '<html>' ( (lv_head_1_0=
			// ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) otherlv_3= '</html>' )
			// )
			// InternalHtmlLang.g:78:2: (otherlv_0= '<html>' ( (lv_head_1_0=
			// ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) otherlv_3= '</html>' )
			{
				// InternalHtmlLang.g:78:2: (otherlv_0= '<html>' ( (lv_head_1_0=
				// ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) otherlv_3=
				// '</html>' )
				// InternalHtmlLang.g:79:3: otherlv_0= '<html>' ( (lv_head_1_0=
				// ruleHead ) ) ( (lv_body_2_0= ruleBody ) ) otherlv_3=
				// '</html>'
				{
					otherlv_0 = (Token) match(this.input, 7, FOLLOW_3);

					newLeafNode(otherlv_0, this.grammarAccess.getHtmlAccess().getHtmlKeyword_0());

					// InternalHtmlLang.g:83:3: ( (lv_head_1_0= ruleHead ) )
					// InternalHtmlLang.g:84:4: (lv_head_1_0= ruleHead )
					{
						// InternalHtmlLang.g:84:4: (lv_head_1_0= ruleHead )
						// InternalHtmlLang.g:85:5: lv_head_1_0= ruleHead
						{
							
							newCompositeNode(this.grammarAccess.getHtmlAccess().getHeadHeadParserRuleCall_1_0());

							pushFollow(FOLLOW_4);
							lv_head_1_0 = ruleHead();

							this.state._fsp--;


							if (current == null) {
								current = createModelElementForParent(this.grammarAccess.getHtmlRule());
							}
							set(current, "head", lv_head_1_0, "nl.altran.example.xtext.html.HtmlLang.Head");
							afterParserOrEnumRuleCall();


						}


					}

					// InternalHtmlLang.g:102:3: ( (lv_body_2_0= ruleBody ) )
					// InternalHtmlLang.g:103:4: (lv_body_2_0= ruleBody )
					{
						// InternalHtmlLang.g:103:4: (lv_body_2_0= ruleBody )
						// InternalHtmlLang.g:104:5: lv_body_2_0= ruleBody
						{
							
							newCompositeNode(this.grammarAccess.getHtmlAccess().getBodyBodyParserRuleCall_2_0());

							pushFollow(FOLLOW_5);
							lv_body_2_0 = ruleBody();

							this.state._fsp--;


							if (current == null) {
								current = createModelElementForParent(this.grammarAccess.getHtmlRule());
							}
							set(current, "body", lv_body_2_0, "nl.altran.example.xtext.html.HtmlLang.Body");
							afterParserOrEnumRuleCall();


						}


					}

					otherlv_3 = (Token) match(this.input, 8, FOLLOW_2);

					newLeafNode(otherlv_3, this.grammarAccess.getHtmlAccess().getHtmlKeyword_3());


				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleHtml"


	// $ANTLR start "entryRuleHead"
	// InternalHtmlLang.g:129:1: entryRuleHead returns [EObject current=null] :
	// iv_ruleHead= ruleHead EOF ;
	public final EObject entryRuleHead() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleHead = null;


		try {
			// InternalHtmlLang.g:129:45: (iv_ruleHead= ruleHead EOF )
			// InternalHtmlLang.g:130:2: iv_ruleHead= ruleHead EOF
			{
				newCompositeNode(this.grammarAccess.getHeadRule());
				pushFollow(FOLLOW_1);
				iv_ruleHead = ruleHead();

				this.state._fsp--;

				current = iv_ruleHead;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleHead"


	// $ANTLR start "ruleHead"
	// InternalHtmlLang.g:136:1: ruleHead returns [EObject current=null] : ( ()
	// otherlv_1= '<head>' ( (lv_headers_2_0= ruleHeader ) )* otherlv_3=
	// '</head>' ) ;
	public final EObject ruleHead() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		EObject lv_headers_2_0 = null;



		enterRule();

		try {
			// InternalHtmlLang.g:142:2: ( ( () otherlv_1= '<head>' (
			// (lv_headers_2_0= ruleHeader ) )* otherlv_3= '</head>' ) )
			// InternalHtmlLang.g:143:2: ( () otherlv_1= '<head>' (
			// (lv_headers_2_0= ruleHeader ) )* otherlv_3= '</head>' )
			{
				// InternalHtmlLang.g:143:2: ( () otherlv_1= '<head>' (
				// (lv_headers_2_0= ruleHeader ) )* otherlv_3= '</head>' )
				// InternalHtmlLang.g:144:3: () otherlv_1= '<head>' (
				// (lv_headers_2_0= ruleHeader ) )* otherlv_3= '</head>'
				{
					// InternalHtmlLang.g:144:3: ()
					// InternalHtmlLang.g:145:4:
					{
						
						current = forceCreateModelElement(this.grammarAccess.getHeadAccess().getHeadAction_0(),
								current);


					}

					otherlv_1 = (Token) match(this.input, 9, FOLLOW_6);

					newLeafNode(otherlv_1, this.grammarAccess.getHeadAccess().getHeadKeyword_1());

					// InternalHtmlLang.g:155:3: ( (lv_headers_2_0= ruleHeader )
					// )*
					loop1: do {
						int alt1 = 2;
						final int LA1_0 = this.input.LA(1);

						if ((LA1_0 == 11 || LA1_0 == 13)) {
							alt1 = 1;
						}


						switch (alt1) {
							case 1:
							// InternalHtmlLang.g:156:4: (lv_headers_2_0=
							// ruleHeader )
							{
								// InternalHtmlLang.g:156:4: (lv_headers_2_0=
								// ruleHeader )
								// InternalHtmlLang.g:157:5: lv_headers_2_0=
								// ruleHeader
								{
									
									newCompositeNode(
											this.grammarAccess.getHeadAccess().getHeadersHeaderParserRuleCall_2_0());

									pushFollow(FOLLOW_6);
									lv_headers_2_0 = ruleHeader();

									this.state._fsp--;


									if (current == null) {
										current = createModelElementForParent(this.grammarAccess.getHeadRule());
									}
									add(current, "headers", lv_headers_2_0,
											"nl.altran.example.xtext.html.HtmlLang.Header");
									afterParserOrEnumRuleCall();


								}


							}
								break;
							
							default:
								break loop1;
						}
					} while (true);

					otherlv_3 = (Token) match(this.input, 10, FOLLOW_2);

					newLeafNode(otherlv_3, this.grammarAccess.getHeadAccess().getHeadKeyword_3());


				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleHead"


	// $ANTLR start "entryRuleHeader"
	// InternalHtmlLang.g:182:1: entryRuleHeader returns [EObject current=null]
	// : iv_ruleHeader= ruleHeader EOF ;
	public final EObject entryRuleHeader() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleHeader = null;


		try {
			// InternalHtmlLang.g:182:47: (iv_ruleHeader= ruleHeader EOF )
			// InternalHtmlLang.g:183:2: iv_ruleHeader= ruleHeader EOF
			{
				newCompositeNode(this.grammarAccess.getHeaderRule());
				pushFollow(FOLLOW_1);
				iv_ruleHeader = ruleHeader();

				this.state._fsp--;

				current = iv_ruleHeader;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleHeader"


	// $ANTLR start "ruleHeader"
	// InternalHtmlLang.g:189:1: ruleHeader returns [EObject current=null] :
	// (this_Title_0= ruleTitle | this_Style_1= ruleStyle ) ;
	public final EObject ruleHeader() throws RecognitionException {
		EObject current = null;

		EObject this_Title_0 = null;

		EObject this_Style_1 = null;



		enterRule();

		try {
			// InternalHtmlLang.g:195:2: ( (this_Title_0= ruleTitle |
			// this_Style_1= ruleStyle ) )
			// InternalHtmlLang.g:196:2: (this_Title_0= ruleTitle |
			// this_Style_1= ruleStyle )
			{
				// InternalHtmlLang.g:196:2: (this_Title_0= ruleTitle |
				// this_Style_1= ruleStyle )
				int alt2 = 2;
				final int LA2_0 = this.input.LA(1);

				if ((LA2_0 == 11)) {
					alt2 = 1;
				} else if ((LA2_0 == 13)) {
					alt2 = 2;
				} else {
					final NoViableAltException nvae = new NoViableAltException("", 2, 0, this.input);

					throw nvae;
				}
				switch (alt2) {
					case 1:
					// InternalHtmlLang.g:197:3: this_Title_0= ruleTitle
					{
						
						newCompositeNode(this.grammarAccess.getHeaderAccess().getTitleParserRuleCall_0());

						pushFollow(FOLLOW_2);
						this_Title_0 = ruleTitle();

						this.state._fsp--;


						current = this_Title_0;
						afterParserOrEnumRuleCall();


					}
						break;
					case 2:
					// InternalHtmlLang.g:206:3: this_Style_1= ruleStyle
					{
						
						newCompositeNode(this.grammarAccess.getHeaderAccess().getStyleParserRuleCall_1());

						pushFollow(FOLLOW_2);
						this_Style_1 = ruleStyle();

						this.state._fsp--;


						current = this_Style_1;
						afterParserOrEnumRuleCall();


					}
						break;
					
				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleHeader"


	// $ANTLR start "entryRuleTitle"
	// InternalHtmlLang.g:218:1: entryRuleTitle returns [EObject current=null] :
	// iv_ruleTitle= ruleTitle EOF ;
	public final EObject entryRuleTitle() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleTitle = null;


		try {
			// InternalHtmlLang.g:218:46: (iv_ruleTitle= ruleTitle EOF )
			// InternalHtmlLang.g:219:2: iv_ruleTitle= ruleTitle EOF
			{
				newCompositeNode(this.grammarAccess.getTitleRule());
				pushFollow(FOLLOW_1);
				iv_ruleTitle = ruleTitle();

				this.state._fsp--;

				current = iv_ruleTitle;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleTitle"


	// $ANTLR start "ruleTitle"
	// InternalHtmlLang.g:225:1: ruleTitle returns [EObject current=null] :
	// (otherlv_0= '<title>' ( (lv_name_1_0= RULE_HTMLSTRING ) ) otherlv_2=
	// '</title>' ) ;
	public final EObject ruleTitle() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_name_1_0 = null;
		Token otherlv_2 = null;


		enterRule();

		try {
			// InternalHtmlLang.g:231:2: ( (otherlv_0= '<title>' ( (lv_name_1_0=
			// RULE_HTMLSTRING ) ) otherlv_2= '</title>' ) )
			// InternalHtmlLang.g:232:2: (otherlv_0= '<title>' ( (lv_name_1_0=
			// RULE_HTMLSTRING ) ) otherlv_2= '</title>' )
			{
				// InternalHtmlLang.g:232:2: (otherlv_0= '<title>' (
				// (lv_name_1_0= RULE_HTMLSTRING ) ) otherlv_2= '</title>' )
				// InternalHtmlLang.g:233:3: otherlv_0= '<title>' (
				// (lv_name_1_0= RULE_HTMLSTRING ) ) otherlv_2= '</title>'
				{
					otherlv_0 = (Token) match(this.input, 11, FOLLOW_7);

					newLeafNode(otherlv_0, this.grammarAccess.getTitleAccess().getTitleKeyword_0());

					// InternalHtmlLang.g:237:3: ( (lv_name_1_0= RULE_HTMLSTRING
					// ) )
					// InternalHtmlLang.g:238:4: (lv_name_1_0= RULE_HTMLSTRING )
					{
						// InternalHtmlLang.g:238:4: (lv_name_1_0=
						// RULE_HTMLSTRING )
						// InternalHtmlLang.g:239:5: lv_name_1_0=
						// RULE_HTMLSTRING
						{
							lv_name_1_0 = (Token) match(this.input, RULE_HTMLSTRING, FOLLOW_8);

							newLeafNode(lv_name_1_0,
									this.grammarAccess.getTitleAccess().getNameHTMLSTRINGTerminalRuleCall_1_0());


							if (current == null) {
								current = createModelElement(this.grammarAccess.getTitleRule());
							}
							setWithLastConsumed(current, "name", lv_name_1_0,
									"nl.altran.example.xtext.html.HtmlLang.HTMLSTRING");


						}


					}

					otherlv_2 = (Token) match(this.input, 12, FOLLOW_2);

					newLeafNode(otherlv_2, this.grammarAccess.getTitleAccess().getTitleKeyword_2());


				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleTitle"


	// $ANTLR start "entryRuleStyle"
	// InternalHtmlLang.g:263:1: entryRuleStyle returns [EObject current=null] :
	// iv_ruleStyle= ruleStyle EOF ;
	public final EObject entryRuleStyle() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleStyle = null;


		try {
			// InternalHtmlLang.g:263:46: (iv_ruleStyle= ruleStyle EOF )
			// InternalHtmlLang.g:264:2: iv_ruleStyle= ruleStyle EOF
			{
				newCompositeNode(this.grammarAccess.getStyleRule());
				pushFollow(FOLLOW_1);
				iv_ruleStyle = ruleStyle();

				this.state._fsp--;

				current = iv_ruleStyle;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleStyle"


	// $ANTLR start "ruleStyle"
	// InternalHtmlLang.g:270:1: ruleStyle returns [EObject current=null] :
	// (otherlv_0= '<style>' ( (lv_styles_1_0= RULE_HTMLSTRING ) ) otherlv_2=
	// '</style>' ) ;
	public final EObject ruleStyle() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_styles_1_0 = null;
		Token otherlv_2 = null;


		enterRule();

		try {
			// InternalHtmlLang.g:276:2: ( (otherlv_0= '<style>' (
			// (lv_styles_1_0= RULE_HTMLSTRING ) ) otherlv_2= '</style>' ) )
			// InternalHtmlLang.g:277:2: (otherlv_0= '<style>' ( (lv_styles_1_0=
			// RULE_HTMLSTRING ) ) otherlv_2= '</style>' )
			{
				// InternalHtmlLang.g:277:2: (otherlv_0= '<style>' (
				// (lv_styles_1_0= RULE_HTMLSTRING ) ) otherlv_2= '</style>' )
				// InternalHtmlLang.g:278:3: otherlv_0= '<style>' (
				// (lv_styles_1_0= RULE_HTMLSTRING ) ) otherlv_2= '</style>'
				{
					otherlv_0 = (Token) match(this.input, 13, FOLLOW_7);

					newLeafNode(otherlv_0, this.grammarAccess.getStyleAccess().getStyleKeyword_0());

					// InternalHtmlLang.g:282:3: ( (lv_styles_1_0=
					// RULE_HTMLSTRING ) )
					// InternalHtmlLang.g:283:4: (lv_styles_1_0= RULE_HTMLSTRING
					// )
					{
						// InternalHtmlLang.g:283:4: (lv_styles_1_0=
						// RULE_HTMLSTRING )
						// InternalHtmlLang.g:284:5: lv_styles_1_0=
						// RULE_HTMLSTRING
						{
							lv_styles_1_0 = (Token) match(this.input, RULE_HTMLSTRING, FOLLOW_9);

							newLeafNode(lv_styles_1_0,
									this.grammarAccess.getStyleAccess().getStylesHTMLSTRINGTerminalRuleCall_1_0());


							if (current == null) {
								current = createModelElement(this.grammarAccess.getStyleRule());
							}
							setWithLastConsumed(current, "styles", lv_styles_1_0,
									"nl.altran.example.xtext.html.HtmlLang.HTMLSTRING");


						}


					}

					otherlv_2 = (Token) match(this.input, 14, FOLLOW_2);

					newLeafNode(otherlv_2, this.grammarAccess.getStyleAccess().getStyleKeyword_2());


				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleStyle"


	// $ANTLR start "entryRuleBody"
	// InternalHtmlLang.g:308:1: entryRuleBody returns [EObject current=null] :
	// iv_ruleBody= ruleBody EOF ;
	public final EObject entryRuleBody() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleBody = null;


		try {
			// InternalHtmlLang.g:308:45: (iv_ruleBody= ruleBody EOF )
			// InternalHtmlLang.g:309:2: iv_ruleBody= ruleBody EOF
			{
				newCompositeNode(this.grammarAccess.getBodyRule());
				pushFollow(FOLLOW_1);
				iv_ruleBody = ruleBody();

				this.state._fsp--;

				current = iv_ruleBody;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleBody"


	// $ANTLR start "ruleBody"
	// InternalHtmlLang.g:315:1: ruleBody returns [EObject current=null] : ( ()
	// otherlv_1= '<body>' ( (lv_contents_2_0= ruleBodyContents ) )* otherlv_3=
	// '</body>' ) ;
	public final EObject ruleBody() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		EObject lv_contents_2_0 = null;



		enterRule();

		try {
			// InternalHtmlLang.g:321:2: ( ( () otherlv_1= '<body>' (
			// (lv_contents_2_0= ruleBodyContents ) )* otherlv_3= '</body>' ) )
			// InternalHtmlLang.g:322:2: ( () otherlv_1= '<body>' (
			// (lv_contents_2_0= ruleBodyContents ) )* otherlv_3= '</body>' )
			{
				// InternalHtmlLang.g:322:2: ( () otherlv_1= '<body>' (
				// (lv_contents_2_0= ruleBodyContents ) )* otherlv_3= '</body>'
				// )
				// InternalHtmlLang.g:323:3: () otherlv_1= '<body>' (
				// (lv_contents_2_0= ruleBodyContents ) )* otherlv_3= '</body>'
				{
					// InternalHtmlLang.g:323:3: ()
					// InternalHtmlLang.g:324:4:
					{
						
						current = forceCreateModelElement(this.grammarAccess.getBodyAccess().getBodyAction_0(),
								current);


					}

					otherlv_1 = (Token) match(this.input, 15, FOLLOW_10);

					newLeafNode(otherlv_1, this.grammarAccess.getBodyAccess().getBodyKeyword_1());

					// InternalHtmlLang.g:334:3: ( (lv_contents_2_0=
					// ruleBodyContents ) )*
					loop3: do {
						int alt3 = 2;
						final int LA3_0 = this.input.LA(1);

						if ((LA3_0 == 17 || LA3_0 == 19)) {
							alt3 = 1;
						}


						switch (alt3) {
							case 1:
							// InternalHtmlLang.g:335:4: (lv_contents_2_0=
							// ruleBodyContents )
							{
								// InternalHtmlLang.g:335:4: (lv_contents_2_0=
								// ruleBodyContents )
								// InternalHtmlLang.g:336:5: lv_contents_2_0=
								// ruleBodyContents
								{
									
									newCompositeNode(this.grammarAccess.getBodyAccess()
											.getContentsBodyContentsParserRuleCall_2_0());

									pushFollow(FOLLOW_10);
									lv_contents_2_0 = ruleBodyContents();

									this.state._fsp--;


									if (current == null) {
										current = createModelElementForParent(this.grammarAccess.getBodyRule());
									}
									add(current, "contents", lv_contents_2_0,
											"nl.altran.example.xtext.html.HtmlLang.BodyContents");
									afterParserOrEnumRuleCall();


								}


							}
								break;
							
							default:
								break loop3;
						}
					} while (true);

					otherlv_3 = (Token) match(this.input, 16, FOLLOW_2);

					newLeafNode(otherlv_3, this.grammarAccess.getBodyAccess().getBodyKeyword_3());


				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleBody"


	// $ANTLR start "entryRuleBodyContents"
	// InternalHtmlLang.g:361:1: entryRuleBodyContents returns [EObject
	// current=null] : iv_ruleBodyContents= ruleBodyContents EOF ;
	public final EObject entryRuleBodyContents() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleBodyContents = null;


		try {
			// InternalHtmlLang.g:361:53: (iv_ruleBodyContents= ruleBodyContents
			// EOF )
			// InternalHtmlLang.g:362:2: iv_ruleBodyContents= ruleBodyContents
			// EOF
			{
				newCompositeNode(this.grammarAccess.getBodyContentsRule());
				pushFollow(FOLLOW_1);
				iv_ruleBodyContents = ruleBodyContents();

				this.state._fsp--;

				current = iv_ruleBodyContents;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleBodyContents"


	// $ANTLR start "ruleBodyContents"
	// InternalHtmlLang.g:368:1: ruleBodyContents returns [EObject current=null]
	// : (this_Paragraph_0= ruleParagraph | this_UnorderedList_1=
	// ruleUnorderedList ) ;
	public final EObject ruleBodyContents() throws RecognitionException {
		EObject current = null;

		EObject this_Paragraph_0 = null;

		EObject this_UnorderedList_1 = null;



		enterRule();

		try {
			// InternalHtmlLang.g:374:2: ( (this_Paragraph_0= ruleParagraph |
			// this_UnorderedList_1= ruleUnorderedList ) )
			// InternalHtmlLang.g:375:2: (this_Paragraph_0= ruleParagraph |
			// this_UnorderedList_1= ruleUnorderedList )
			{
				// InternalHtmlLang.g:375:2: (this_Paragraph_0= ruleParagraph |
				// this_UnorderedList_1= ruleUnorderedList )
				int alt4 = 2;
				final int LA4_0 = this.input.LA(1);

				if ((LA4_0 == 17)) {
					alt4 = 1;
				} else if ((LA4_0 == 19)) {
					alt4 = 2;
				} else {
					final NoViableAltException nvae = new NoViableAltException("", 4, 0, this.input);

					throw nvae;
				}
				switch (alt4) {
					case 1:
					// InternalHtmlLang.g:376:3: this_Paragraph_0= ruleParagraph
					{
						
						newCompositeNode(this.grammarAccess.getBodyContentsAccess().getParagraphParserRuleCall_0());

						pushFollow(FOLLOW_2);
						this_Paragraph_0 = ruleParagraph();

						this.state._fsp--;


						current = this_Paragraph_0;
						afterParserOrEnumRuleCall();


					}
						break;
					case 2:
					// InternalHtmlLang.g:385:3: this_UnorderedList_1=
					// ruleUnorderedList
					{
						
						newCompositeNode(this.grammarAccess.getBodyContentsAccess().getUnorderedListParserRuleCall_1());

						pushFollow(FOLLOW_2);
						this_UnorderedList_1 = ruleUnorderedList();

						this.state._fsp--;


						current = this_UnorderedList_1;
						afterParserOrEnumRuleCall();


					}
						break;
					
				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleBodyContents"


	// $ANTLR start "entryRuleParagraph"
	// InternalHtmlLang.g:397:1: entryRuleParagraph returns [EObject
	// current=null] : iv_ruleParagraph= ruleParagraph EOF ;
	public final EObject entryRuleParagraph() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleParagraph = null;


		try {
			// InternalHtmlLang.g:397:50: (iv_ruleParagraph= ruleParagraph EOF )
			// InternalHtmlLang.g:398:2: iv_ruleParagraph= ruleParagraph EOF
			{
				newCompositeNode(this.grammarAccess.getParagraphRule());
				pushFollow(FOLLOW_1);
				iv_ruleParagraph = ruleParagraph();

				this.state._fsp--;

				current = iv_ruleParagraph;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleParagraph"


	// $ANTLR start "ruleParagraph"
	// InternalHtmlLang.g:404:1: ruleParagraph returns [EObject current=null] :
	// ( () otherlv_1= '<p>' ( (lv_contents_2_0= ruleTextElement ) )* otherlv_3=
	// '</p>' ) ;
	public final EObject ruleParagraph() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		EObject lv_contents_2_0 = null;



		enterRule();

		try {
			// InternalHtmlLang.g:410:2: ( ( () otherlv_1= '<p>' (
			// (lv_contents_2_0= ruleTextElement ) )* otherlv_3= '</p>' ) )
			// InternalHtmlLang.g:411:2: ( () otherlv_1= '<p>' (
			// (lv_contents_2_0= ruleTextElement ) )* otherlv_3= '</p>' )
			{
				// InternalHtmlLang.g:411:2: ( () otherlv_1= '<p>' (
				// (lv_contents_2_0= ruleTextElement ) )* otherlv_3= '</p>' )
				// InternalHtmlLang.g:412:3: () otherlv_1= '<p>' (
				// (lv_contents_2_0= ruleTextElement ) )* otherlv_3= '</p>'
				{
					// InternalHtmlLang.g:412:3: ()
					// InternalHtmlLang.g:413:4:
					{
						
						current = forceCreateModelElement(
								this.grammarAccess.getParagraphAccess().getParagraphAction_0(), current);


					}

					otherlv_1 = (Token) match(this.input, 17, FOLLOW_11);

					newLeafNode(otherlv_1, this.grammarAccess.getParagraphAccess().getPKeyword_1());

					// InternalHtmlLang.g:423:3: ( (lv_contents_2_0=
					// ruleTextElement ) )*
					loop5: do {
						int alt5 = 2;
						final int LA5_0 = this.input.LA(1);

						if ((LA5_0 == RULE_HTMLSTRING || LA5_0 == 23 || LA5_0 == 25)) {
							alt5 = 1;
						}


						switch (alt5) {
							case 1:
							// InternalHtmlLang.g:424:4: (lv_contents_2_0=
							// ruleTextElement )
							{
								// InternalHtmlLang.g:424:4: (lv_contents_2_0=
								// ruleTextElement )
								// InternalHtmlLang.g:425:5: lv_contents_2_0=
								// ruleTextElement
								{
									
									newCompositeNode(this.grammarAccess.getParagraphAccess()
											.getContentsTextElementParserRuleCall_2_0());

									pushFollow(FOLLOW_11);
									lv_contents_2_0 = ruleTextElement();

									this.state._fsp--;


									if (current == null) {
										current = createModelElementForParent(this.grammarAccess.getParagraphRule());
									}
									add(current, "contents", lv_contents_2_0,
											"nl.altran.example.xtext.html.HtmlLang.TextElement");
									afterParserOrEnumRuleCall();


								}


							}
								break;
							
							default:
								break loop5;
						}
					} while (true);

					otherlv_3 = (Token) match(this.input, 18, FOLLOW_2);

					newLeafNode(otherlv_3, this.grammarAccess.getParagraphAccess().getPKeyword_3());


				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleParagraph"


	// $ANTLR start "entryRuleUnorderedList"
	// InternalHtmlLang.g:450:1: entryRuleUnorderedList returns [EObject
	// current=null] : iv_ruleUnorderedList= ruleUnorderedList EOF ;
	public final EObject entryRuleUnorderedList() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleUnorderedList = null;


		try {
			// InternalHtmlLang.g:450:54: (iv_ruleUnorderedList=
			// ruleUnorderedList EOF )
			// InternalHtmlLang.g:451:2: iv_ruleUnorderedList= ruleUnorderedList
			// EOF
			{
				newCompositeNode(this.grammarAccess.getUnorderedListRule());
				pushFollow(FOLLOW_1);
				iv_ruleUnorderedList = ruleUnorderedList();

				this.state._fsp--;

				current = iv_ruleUnorderedList;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleUnorderedList"


	// $ANTLR start "ruleUnorderedList"
	// InternalHtmlLang.g:457:1: ruleUnorderedList returns [EObject
	// current=null] : (otherlv_0= '<ul>' ( (lv_items_1_0= ruleListItem ) )+
	// otherlv_2= '</ul>' ) ;
	public final EObject ruleUnorderedList() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token otherlv_2 = null;
		EObject lv_items_1_0 = null;



		enterRule();

		try {
			// InternalHtmlLang.g:463:2: ( (otherlv_0= '<ul>' ( (lv_items_1_0=
			// ruleListItem ) )+ otherlv_2= '</ul>' ) )
			// InternalHtmlLang.g:464:2: (otherlv_0= '<ul>' ( (lv_items_1_0=
			// ruleListItem ) )+ otherlv_2= '</ul>' )
			{
				// InternalHtmlLang.g:464:2: (otherlv_0= '<ul>' ( (lv_items_1_0=
				// ruleListItem ) )+ otherlv_2= '</ul>' )
				// InternalHtmlLang.g:465:3: otherlv_0= '<ul>' ( (lv_items_1_0=
				// ruleListItem ) )+ otherlv_2= '</ul>'
				{
					otherlv_0 = (Token) match(this.input, 19, FOLLOW_12);

					newLeafNode(otherlv_0, this.grammarAccess.getUnorderedListAccess().getUlKeyword_0());

					// InternalHtmlLang.g:469:3: ( (lv_items_1_0= ruleListItem )
					// )+
					int cnt6 = 0;
					loop6: do {
						int alt6 = 2;
						final int LA6_0 = this.input.LA(1);

						if ((LA6_0 == 21)) {
							alt6 = 1;
						}


						switch (alt6) {
							case 1:
							// InternalHtmlLang.g:470:4: (lv_items_1_0=
							// ruleListItem )
							{
								// InternalHtmlLang.g:470:4: (lv_items_1_0=
								// ruleListItem )
								// InternalHtmlLang.g:471:5: lv_items_1_0=
								// ruleListItem
								{
									
									newCompositeNode(this.grammarAccess.getUnorderedListAccess()
											.getItemsListItemParserRuleCall_1_0());

									pushFollow(FOLLOW_13);
									lv_items_1_0 = ruleListItem();

									this.state._fsp--;


									if (current == null) {
										current = createModelElementForParent(
												this.grammarAccess.getUnorderedListRule());
									}
									add(current, "items", lv_items_1_0,
											"nl.altran.example.xtext.html.HtmlLang.ListItem");
									afterParserOrEnumRuleCall();


								}


							}
								break;
							
							default:
								if (cnt6 >= 1) {
									break loop6;
								}
								final EarlyExitException eee = new EarlyExitException(6, this.input);
								throw eee;
						}
						cnt6++;
					} while (true);

					otherlv_2 = (Token) match(this.input, 20, FOLLOW_2);

					newLeafNode(otherlv_2, this.grammarAccess.getUnorderedListAccess().getUlKeyword_2());


				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleUnorderedList"


	// $ANTLR start "entryRuleListItem"
	// InternalHtmlLang.g:496:1: entryRuleListItem returns [EObject
	// current=null] : iv_ruleListItem= ruleListItem EOF ;
	public final EObject entryRuleListItem() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleListItem = null;


		try {
			// InternalHtmlLang.g:496:49: (iv_ruleListItem= ruleListItem EOF )
			// InternalHtmlLang.g:497:2: iv_ruleListItem= ruleListItem EOF
			{
				newCompositeNode(this.grammarAccess.getListItemRule());
				pushFollow(FOLLOW_1);
				iv_ruleListItem = ruleListItem();

				this.state._fsp--;

				current = iv_ruleListItem;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleListItem"


	// $ANTLR start "ruleListItem"
	// InternalHtmlLang.g:503:1: ruleListItem returns [EObject current=null] : (
	// () otherlv_1= '<li>' ( (lv_contents_2_0= ruleTextElement ) )* otherlv_3=
	// '</li>' ) ;
	public final EObject ruleListItem() throws RecognitionException {
		EObject current = null;

		Token otherlv_1 = null;
		Token otherlv_3 = null;
		EObject lv_contents_2_0 = null;



		enterRule();

		try {
			// InternalHtmlLang.g:509:2: ( ( () otherlv_1= '<li>' (
			// (lv_contents_2_0= ruleTextElement ) )* otherlv_3= '</li>' ) )
			// InternalHtmlLang.g:510:2: ( () otherlv_1= '<li>' (
			// (lv_contents_2_0= ruleTextElement ) )* otherlv_3= '</li>' )
			{
				// InternalHtmlLang.g:510:2: ( () otherlv_1= '<li>' (
				// (lv_contents_2_0= ruleTextElement ) )* otherlv_3= '</li>' )
				// InternalHtmlLang.g:511:3: () otherlv_1= '<li>' (
				// (lv_contents_2_0= ruleTextElement ) )* otherlv_3= '</li>'
				{
					// InternalHtmlLang.g:511:3: ()
					// InternalHtmlLang.g:512:4:
					{
						
						current = forceCreateModelElement(this.grammarAccess.getListItemAccess().getListItemAction_0(),
								current);


					}

					otherlv_1 = (Token) match(this.input, 21, FOLLOW_14);

					newLeafNode(otherlv_1, this.grammarAccess.getListItemAccess().getLiKeyword_1());

					// InternalHtmlLang.g:522:3: ( (lv_contents_2_0=
					// ruleTextElement ) )*
					loop7: do {
						int alt7 = 2;
						final int LA7_0 = this.input.LA(1);

						if ((LA7_0 == RULE_HTMLSTRING || LA7_0 == 23 || LA7_0 == 25)) {
							alt7 = 1;
						}


						switch (alt7) {
							case 1:
							// InternalHtmlLang.g:523:4: (lv_contents_2_0=
							// ruleTextElement )
							{
								// InternalHtmlLang.g:523:4: (lv_contents_2_0=
								// ruleTextElement )
								// InternalHtmlLang.g:524:5: lv_contents_2_0=
								// ruleTextElement
								{
									
									newCompositeNode(this.grammarAccess.getListItemAccess()
											.getContentsTextElementParserRuleCall_2_0());

									pushFollow(FOLLOW_14);
									lv_contents_2_0 = ruleTextElement();

									this.state._fsp--;


									if (current == null) {
										current = createModelElementForParent(this.grammarAccess.getListItemRule());
									}
									add(current, "contents", lv_contents_2_0,
											"nl.altran.example.xtext.html.HtmlLang.TextElement");
									afterParserOrEnumRuleCall();


								}


							}
								break;
							
							default:
								break loop7;
						}
					} while (true);

					otherlv_3 = (Token) match(this.input, 22, FOLLOW_2);

					newLeafNode(otherlv_3, this.grammarAccess.getListItemAccess().getLiKeyword_3());


				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleListItem"


	// $ANTLR start "entryRuleTextElement"
	// InternalHtmlLang.g:549:1: entryRuleTextElement returns [EObject
	// current=null] : iv_ruleTextElement= ruleTextElement EOF ;
	public final EObject entryRuleTextElement() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleTextElement = null;


		try {
			// InternalHtmlLang.g:549:52: (iv_ruleTextElement= ruleTextElement
			// EOF )
			// InternalHtmlLang.g:550:2: iv_ruleTextElement= ruleTextElement EOF
			{
				newCompositeNode(this.grammarAccess.getTextElementRule());
				pushFollow(FOLLOW_1);
				iv_ruleTextElement = ruleTextElement();

				this.state._fsp--;

				current = iv_ruleTextElement;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleTextElement"


	// $ANTLR start "ruleTextElement"
	// InternalHtmlLang.g:556:1: ruleTextElement returns [EObject current=null]
	// : (this_FreeformText_0= ruleFreeformText | this_Bold_1= ruleBold |
	// this_Italics_2= ruleItalics ) ;
	public final EObject ruleTextElement() throws RecognitionException {
		EObject current = null;

		EObject this_FreeformText_0 = null;

		EObject this_Bold_1 = null;

		EObject this_Italics_2 = null;



		enterRule();

		try {
			// InternalHtmlLang.g:562:2: ( (this_FreeformText_0=
			// ruleFreeformText | this_Bold_1= ruleBold | this_Italics_2=
			// ruleItalics ) )
			// InternalHtmlLang.g:563:2: (this_FreeformText_0= ruleFreeformText
			// | this_Bold_1= ruleBold | this_Italics_2= ruleItalics )
			{
				// InternalHtmlLang.g:563:2: (this_FreeformText_0=
				// ruleFreeformText | this_Bold_1= ruleBold | this_Italics_2=
				// ruleItalics )
				int alt8 = 3;
				switch (this.input.LA(1)) {
					case RULE_HTMLSTRING: {
						alt8 = 1;
					}
						break;
					case 23: {
						alt8 = 2;
					}
						break;
					case 25: {
						alt8 = 3;
					}
						break;
					default:
						final NoViableAltException nvae = new NoViableAltException("", 8, 0, this.input);

						throw nvae;
				}

				switch (alt8) {
					case 1:
					// InternalHtmlLang.g:564:3: this_FreeformText_0=
					// ruleFreeformText
					{
						
						newCompositeNode(this.grammarAccess.getTextElementAccess().getFreeformTextParserRuleCall_0());

						pushFollow(FOLLOW_2);
						this_FreeformText_0 = ruleFreeformText();

						this.state._fsp--;


						current = this_FreeformText_0;
						afterParserOrEnumRuleCall();


					}
						break;
					case 2:
					// InternalHtmlLang.g:573:3: this_Bold_1= ruleBold
					{
						
						newCompositeNode(this.grammarAccess.getTextElementAccess().getBoldParserRuleCall_1());

						pushFollow(FOLLOW_2);
						this_Bold_1 = ruleBold();

						this.state._fsp--;


						current = this_Bold_1;
						afterParserOrEnumRuleCall();


					}
						break;
					case 3:
					// InternalHtmlLang.g:582:3: this_Italics_2= ruleItalics
					{
						
						newCompositeNode(this.grammarAccess.getTextElementAccess().getItalicsParserRuleCall_2());

						pushFollow(FOLLOW_2);
						this_Italics_2 = ruleItalics();

						this.state._fsp--;


						current = this_Italics_2;
						afterParserOrEnumRuleCall();


					}
						break;
					
				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleTextElement"


	// $ANTLR start "entryRuleFreeformText"
	// InternalHtmlLang.g:594:1: entryRuleFreeformText returns [EObject
	// current=null] : iv_ruleFreeformText= ruleFreeformText EOF ;
	public final EObject entryRuleFreeformText() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleFreeformText = null;


		try {
			// InternalHtmlLang.g:594:53: (iv_ruleFreeformText= ruleFreeformText
			// EOF )
			// InternalHtmlLang.g:595:2: iv_ruleFreeformText= ruleFreeformText
			// EOF
			{
				newCompositeNode(this.grammarAccess.getFreeformTextRule());
				pushFollow(FOLLOW_1);
				iv_ruleFreeformText = ruleFreeformText();

				this.state._fsp--;

				current = iv_ruleFreeformText;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleFreeformText"


	// $ANTLR start "ruleFreeformText"
	// InternalHtmlLang.g:601:1: ruleFreeformText returns [EObject current=null]
	// : ( (lv_text_0_0= RULE_HTMLSTRING ) ) ;
	public final EObject ruleFreeformText() throws RecognitionException {
		EObject current = null;

		Token lv_text_0_0 = null;


		enterRule();

		try {
			// InternalHtmlLang.g:607:2: ( ( (lv_text_0_0= RULE_HTMLSTRING ) ) )
			// InternalHtmlLang.g:608:2: ( (lv_text_0_0= RULE_HTMLSTRING ) )
			{
				// InternalHtmlLang.g:608:2: ( (lv_text_0_0= RULE_HTMLSTRING ) )
				// InternalHtmlLang.g:609:3: (lv_text_0_0= RULE_HTMLSTRING )
				{
					// InternalHtmlLang.g:609:3: (lv_text_0_0= RULE_HTMLSTRING )
					// InternalHtmlLang.g:610:4: lv_text_0_0= RULE_HTMLSTRING
					{
						lv_text_0_0 = (Token) match(this.input, RULE_HTMLSTRING, FOLLOW_2);

						newLeafNode(lv_text_0_0,
								this.grammarAccess.getFreeformTextAccess().getTextHTMLSTRINGTerminalRuleCall_0());


						if (current == null) {
							current = createModelElement(this.grammarAccess.getFreeformTextRule());
						}
						setWithLastConsumed(current, "text", lv_text_0_0,
								"nl.altran.example.xtext.html.HtmlLang.HTMLSTRING");


					}


				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleFreeformText"


	// $ANTLR start "entryRuleBold"
	// InternalHtmlLang.g:629:1: entryRuleBold returns [EObject current=null] :
	// iv_ruleBold= ruleBold EOF ;
	public final EObject entryRuleBold() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleBold = null;


		try {
			// InternalHtmlLang.g:629:45: (iv_ruleBold= ruleBold EOF )
			// InternalHtmlLang.g:630:2: iv_ruleBold= ruleBold EOF
			{
				newCompositeNode(this.grammarAccess.getBoldRule());
				pushFollow(FOLLOW_1);
				iv_ruleBold = ruleBold();

				this.state._fsp--;

				current = iv_ruleBold;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleBold"


	// $ANTLR start "ruleBold"
	// InternalHtmlLang.g:636:1: ruleBold returns [EObject current=null] :
	// (otherlv_0= '<b>' ( (lv_text_1_0= RULE_HTMLSTRING ) ) otherlv_2= '</b>' )
	// ;
	public final EObject ruleBold() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_text_1_0 = null;
		Token otherlv_2 = null;


		enterRule();

		try {
			// InternalHtmlLang.g:642:2: ( (otherlv_0= '<b>' ( (lv_text_1_0=
			// RULE_HTMLSTRING ) ) otherlv_2= '</b>' ) )
			// InternalHtmlLang.g:643:2: (otherlv_0= '<b>' ( (lv_text_1_0=
			// RULE_HTMLSTRING ) ) otherlv_2= '</b>' )
			{
				// InternalHtmlLang.g:643:2: (otherlv_0= '<b>' ( (lv_text_1_0=
				// RULE_HTMLSTRING ) ) otherlv_2= '</b>' )
				// InternalHtmlLang.g:644:3: otherlv_0= '<b>' ( (lv_text_1_0=
				// RULE_HTMLSTRING ) ) otherlv_2= '</b>'
				{
					otherlv_0 = (Token) match(this.input, 23, FOLLOW_7);

					newLeafNode(otherlv_0, this.grammarAccess.getBoldAccess().getBKeyword_0());

					// InternalHtmlLang.g:648:3: ( (lv_text_1_0= RULE_HTMLSTRING
					// ) )
					// InternalHtmlLang.g:649:4: (lv_text_1_0= RULE_HTMLSTRING )
					{
						// InternalHtmlLang.g:649:4: (lv_text_1_0=
						// RULE_HTMLSTRING )
						// InternalHtmlLang.g:650:5: lv_text_1_0=
						// RULE_HTMLSTRING
						{
							lv_text_1_0 = (Token) match(this.input, RULE_HTMLSTRING, FOLLOW_15);

							newLeafNode(lv_text_1_0,
									this.grammarAccess.getBoldAccess().getTextHTMLSTRINGTerminalRuleCall_1_0());


							if (current == null) {
								current = createModelElement(this.grammarAccess.getBoldRule());
							}
							setWithLastConsumed(current, "text", lv_text_1_0,
									"nl.altran.example.xtext.html.HtmlLang.HTMLSTRING");


						}


					}

					otherlv_2 = (Token) match(this.input, 24, FOLLOW_2);

					newLeafNode(otherlv_2, this.grammarAccess.getBoldAccess().getBKeyword_2());


				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleBold"


	// $ANTLR start "entryRuleItalics"
	// InternalHtmlLang.g:674:1: entryRuleItalics returns [EObject current=null]
	// : iv_ruleItalics= ruleItalics EOF ;
	public final EObject entryRuleItalics() throws RecognitionException {
		EObject current = null;

		EObject iv_ruleItalics = null;


		try {
			// InternalHtmlLang.g:674:48: (iv_ruleItalics= ruleItalics EOF )
			// InternalHtmlLang.g:675:2: iv_ruleItalics= ruleItalics EOF
			{
				newCompositeNode(this.grammarAccess.getItalicsRule());
				pushFollow(FOLLOW_1);
				iv_ruleItalics = ruleItalics();

				this.state._fsp--;

				current = iv_ruleItalics;
				match(this.input, EOF, FOLLOW_2);

			}

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "entryRuleItalics"


	// $ANTLR start "ruleItalics"
	// InternalHtmlLang.g:681:1: ruleItalics returns [EObject current=null] :
	// (otherlv_0= '<i>' ( (lv_text_1_0= RULE_HTMLSTRING ) ) otherlv_2= '</i>' )
	// ;
	public final EObject ruleItalics() throws RecognitionException {
		EObject current = null;

		Token otherlv_0 = null;
		Token lv_text_1_0 = null;
		Token otherlv_2 = null;


		enterRule();

		try {
			// InternalHtmlLang.g:687:2: ( (otherlv_0= '<i>' ( (lv_text_1_0=
			// RULE_HTMLSTRING ) ) otherlv_2= '</i>' ) )
			// InternalHtmlLang.g:688:2: (otherlv_0= '<i>' ( (lv_text_1_0=
			// RULE_HTMLSTRING ) ) otherlv_2= '</i>' )
			{
				// InternalHtmlLang.g:688:2: (otherlv_0= '<i>' ( (lv_text_1_0=
				// RULE_HTMLSTRING ) ) otherlv_2= '</i>' )
				// InternalHtmlLang.g:689:3: otherlv_0= '<i>' ( (lv_text_1_0=
				// RULE_HTMLSTRING ) ) otherlv_2= '</i>'
				{
					otherlv_0 = (Token) match(this.input, 25, FOLLOW_7);

					newLeafNode(otherlv_0, this.grammarAccess.getItalicsAccess().getIKeyword_0());

					// InternalHtmlLang.g:693:3: ( (lv_text_1_0= RULE_HTMLSTRING
					// ) )
					// InternalHtmlLang.g:694:4: (lv_text_1_0= RULE_HTMLSTRING )
					{
						// InternalHtmlLang.g:694:4: (lv_text_1_0=
						// RULE_HTMLSTRING )
						// InternalHtmlLang.g:695:5: lv_text_1_0=
						// RULE_HTMLSTRING
						{
							lv_text_1_0 = (Token) match(this.input, RULE_HTMLSTRING, FOLLOW_16);

							newLeafNode(lv_text_1_0,
									this.grammarAccess.getItalicsAccess().getTextHTMLSTRINGTerminalRuleCall_1_0());


							if (current == null) {
								current = createModelElement(this.grammarAccess.getItalicsRule());
							}
							setWithLastConsumed(current, "text", lv_text_1_0,
									"nl.altran.example.xtext.html.HtmlLang.HTMLSTRING");


						}


					}

					otherlv_2 = (Token) match(this.input, 26, FOLLOW_2);

					newLeafNode(otherlv_2, this.grammarAccess.getItalicsAccess().getIKeyword_2());


				}


			}


			leaveRule();

		}

		catch (final RecognitionException re) {
			recover(this.input, re);
			appendSkippedTokens();
		} finally {
		}
		return current;
	}
	// $ANTLR end "ruleItalics"

	// Delegated rules



	public static final BitSet FOLLOW_1 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_2 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_3 = new BitSet(new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_4 = new BitSet(new long[] { 0x0000000000008000L });
	public static final BitSet FOLLOW_5 = new BitSet(new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_6 = new BitSet(new long[] { 0x0000000000002C00L });
	public static final BitSet FOLLOW_7 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_8 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_9 = new BitSet(new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_10 = new BitSet(new long[] { 0x00000000000B0000L });
	public static final BitSet FOLLOW_11 = new BitSet(new long[] { 0x0000000002840010L });
	public static final BitSet FOLLOW_12 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_13 = new BitSet(new long[] { 0x0000000000300000L });
	public static final BitSet FOLLOW_14 = new BitSet(new long[] { 0x0000000002C00010L });
	public static final BitSet FOLLOW_15 = new BitSet(new long[] { 0x0000000001000000L });
	public static final BitSet FOLLOW_16 = new BitSet(new long[] { 0x0000000004000000L });

}