package nl.altran.example.xtext.html.ide.contentassist.antlr.internal;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import nl.altran.example.xtext.html.services.HtmlLangGrammarAccess;

@SuppressWarnings("all")
public class InternalHtmlLangParser extends AbstractInternalContentAssistParser {
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

	public void setGrammarAccess(final HtmlLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return this.grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(final String tokenName) {
		return tokenName;
	}



	// $ANTLR start "entryRuleHtml"
	// InternalHtmlLang.g:53:1: entryRuleHtml : ruleHtml EOF ;
	public final void entryRuleHtml() throws RecognitionException {
		try {
			// InternalHtmlLang.g:54:1: ( ruleHtml EOF )
			// InternalHtmlLang.g:55:1: ruleHtml EOF
			{
				before(this.grammarAccess.getHtmlRule());
				pushFollow(FOLLOW_1);
				ruleHtml();

				this.state._fsp--;

				after(this.grammarAccess.getHtmlRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleHtml"


	// $ANTLR start "ruleHtml"
	// InternalHtmlLang.g:62:1: ruleHtml : ( ( rule__Html__Group__0 ) ) ;
	public final void ruleHtml() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:66:2: ( ( ( rule__Html__Group__0 ) ) )
			// InternalHtmlLang.g:67:2: ( ( rule__Html__Group__0 ) )
			{
				// InternalHtmlLang.g:67:2: ( ( rule__Html__Group__0 ) )
				// InternalHtmlLang.g:68:3: ( rule__Html__Group__0 )
				{
					before(this.grammarAccess.getHtmlAccess().getGroup());
					// InternalHtmlLang.g:69:3: ( rule__Html__Group__0 )
					// InternalHtmlLang.g:69:4: rule__Html__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Html__Group__0();

						this.state._fsp--;


					}

					after(this.grammarAccess.getHtmlAccess().getGroup());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleHtml"


	// $ANTLR start "entryRuleHead"
	// InternalHtmlLang.g:78:1: entryRuleHead : ruleHead EOF ;
	public final void entryRuleHead() throws RecognitionException {
		try {
			// InternalHtmlLang.g:79:1: ( ruleHead EOF )
			// InternalHtmlLang.g:80:1: ruleHead EOF
			{
				before(this.grammarAccess.getHeadRule());
				pushFollow(FOLLOW_1);
				ruleHead();

				this.state._fsp--;

				after(this.grammarAccess.getHeadRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleHead"


	// $ANTLR start "ruleHead"
	// InternalHtmlLang.g:87:1: ruleHead : ( ( rule__Head__Group__0 ) ) ;
	public final void ruleHead() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:91:2: ( ( ( rule__Head__Group__0 ) ) )
			// InternalHtmlLang.g:92:2: ( ( rule__Head__Group__0 ) )
			{
				// InternalHtmlLang.g:92:2: ( ( rule__Head__Group__0 ) )
				// InternalHtmlLang.g:93:3: ( rule__Head__Group__0 )
				{
					before(this.grammarAccess.getHeadAccess().getGroup());
					// InternalHtmlLang.g:94:3: ( rule__Head__Group__0 )
					// InternalHtmlLang.g:94:4: rule__Head__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Head__Group__0();

						this.state._fsp--;


					}

					after(this.grammarAccess.getHeadAccess().getGroup());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleHead"


	// $ANTLR start "entryRuleHeader"
	// InternalHtmlLang.g:103:1: entryRuleHeader : ruleHeader EOF ;
	public final void entryRuleHeader() throws RecognitionException {
		try {
			// InternalHtmlLang.g:104:1: ( ruleHeader EOF )
			// InternalHtmlLang.g:105:1: ruleHeader EOF
			{
				before(this.grammarAccess.getHeaderRule());
				pushFollow(FOLLOW_1);
				ruleHeader();

				this.state._fsp--;

				after(this.grammarAccess.getHeaderRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleHeader"


	// $ANTLR start "ruleHeader"
	// InternalHtmlLang.g:112:1: ruleHeader : ( ( rule__Header__Alternatives ) )
	// ;
	public final void ruleHeader() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:116:2: ( ( ( rule__Header__Alternatives ) ) )
			// InternalHtmlLang.g:117:2: ( ( rule__Header__Alternatives ) )
			{
				// InternalHtmlLang.g:117:2: ( ( rule__Header__Alternatives ) )
				// InternalHtmlLang.g:118:3: ( rule__Header__Alternatives )
				{
					before(this.grammarAccess.getHeaderAccess().getAlternatives());
					// InternalHtmlLang.g:119:3: ( rule__Header__Alternatives )
					// InternalHtmlLang.g:119:4: rule__Header__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__Header__Alternatives();

						this.state._fsp--;


					}

					after(this.grammarAccess.getHeaderAccess().getAlternatives());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleHeader"


	// $ANTLR start "entryRuleTitle"
	// InternalHtmlLang.g:128:1: entryRuleTitle : ruleTitle EOF ;
	public final void entryRuleTitle() throws RecognitionException {
		try {
			// InternalHtmlLang.g:129:1: ( ruleTitle EOF )
			// InternalHtmlLang.g:130:1: ruleTitle EOF
			{
				before(this.grammarAccess.getTitleRule());
				pushFollow(FOLLOW_1);
				ruleTitle();

				this.state._fsp--;

				after(this.grammarAccess.getTitleRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleTitle"


	// $ANTLR start "ruleTitle"
	// InternalHtmlLang.g:137:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
	public final void ruleTitle() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:141:2: ( ( ( rule__Title__Group__0 ) ) )
			// InternalHtmlLang.g:142:2: ( ( rule__Title__Group__0 ) )
			{
				// InternalHtmlLang.g:142:2: ( ( rule__Title__Group__0 ) )
				// InternalHtmlLang.g:143:3: ( rule__Title__Group__0 )
				{
					before(this.grammarAccess.getTitleAccess().getGroup());
					// InternalHtmlLang.g:144:3: ( rule__Title__Group__0 )
					// InternalHtmlLang.g:144:4: rule__Title__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Title__Group__0();

						this.state._fsp--;


					}

					after(this.grammarAccess.getTitleAccess().getGroup());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleTitle"


	// $ANTLR start "entryRuleStyle"
	// InternalHtmlLang.g:153:1: entryRuleStyle : ruleStyle EOF ;
	public final void entryRuleStyle() throws RecognitionException {
		try {
			// InternalHtmlLang.g:154:1: ( ruleStyle EOF )
			// InternalHtmlLang.g:155:1: ruleStyle EOF
			{
				before(this.grammarAccess.getStyleRule());
				pushFollow(FOLLOW_1);
				ruleStyle();

				this.state._fsp--;

				after(this.grammarAccess.getStyleRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleStyle"


	// $ANTLR start "ruleStyle"
	// InternalHtmlLang.g:162:1: ruleStyle : ( ( rule__Style__Group__0 ) ) ;
	public final void ruleStyle() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:166:2: ( ( ( rule__Style__Group__0 ) ) )
			// InternalHtmlLang.g:167:2: ( ( rule__Style__Group__0 ) )
			{
				// InternalHtmlLang.g:167:2: ( ( rule__Style__Group__0 ) )
				// InternalHtmlLang.g:168:3: ( rule__Style__Group__0 )
				{
					before(this.grammarAccess.getStyleAccess().getGroup());
					// InternalHtmlLang.g:169:3: ( rule__Style__Group__0 )
					// InternalHtmlLang.g:169:4: rule__Style__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Style__Group__0();

						this.state._fsp--;


					}

					after(this.grammarAccess.getStyleAccess().getGroup());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleStyle"


	// $ANTLR start "entryRuleBody"
	// InternalHtmlLang.g:178:1: entryRuleBody : ruleBody EOF ;
	public final void entryRuleBody() throws RecognitionException {
		try {
			// InternalHtmlLang.g:179:1: ( ruleBody EOF )
			// InternalHtmlLang.g:180:1: ruleBody EOF
			{
				before(this.grammarAccess.getBodyRule());
				pushFollow(FOLLOW_1);
				ruleBody();

				this.state._fsp--;

				after(this.grammarAccess.getBodyRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleBody"


	// $ANTLR start "ruleBody"
	// InternalHtmlLang.g:187:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
	public final void ruleBody() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:191:2: ( ( ( rule__Body__Group__0 ) ) )
			// InternalHtmlLang.g:192:2: ( ( rule__Body__Group__0 ) )
			{
				// InternalHtmlLang.g:192:2: ( ( rule__Body__Group__0 ) )
				// InternalHtmlLang.g:193:3: ( rule__Body__Group__0 )
				{
					before(this.grammarAccess.getBodyAccess().getGroup());
					// InternalHtmlLang.g:194:3: ( rule__Body__Group__0 )
					// InternalHtmlLang.g:194:4: rule__Body__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Body__Group__0();

						this.state._fsp--;


					}

					after(this.grammarAccess.getBodyAccess().getGroup());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleBody"


	// $ANTLR start "entryRuleBodyContents"
	// InternalHtmlLang.g:203:1: entryRuleBodyContents : ruleBodyContents EOF ;
	public final void entryRuleBodyContents() throws RecognitionException {
		try {
			// InternalHtmlLang.g:204:1: ( ruleBodyContents EOF )
			// InternalHtmlLang.g:205:1: ruleBodyContents EOF
			{
				before(this.grammarAccess.getBodyContentsRule());
				pushFollow(FOLLOW_1);
				ruleBodyContents();

				this.state._fsp--;

				after(this.grammarAccess.getBodyContentsRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleBodyContents"


	// $ANTLR start "ruleBodyContents"
	// InternalHtmlLang.g:212:1: ruleBodyContents : ( (
	// rule__BodyContents__Alternatives ) ) ;
	public final void ruleBodyContents() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:216:2: ( ( ( rule__BodyContents__Alternatives
			// ) ) )
			// InternalHtmlLang.g:217:2: ( ( rule__BodyContents__Alternatives )
			// )
			{
				// InternalHtmlLang.g:217:2: ( (
				// rule__BodyContents__Alternatives ) )
				// InternalHtmlLang.g:218:3: ( rule__BodyContents__Alternatives
				// )
				{
					before(this.grammarAccess.getBodyContentsAccess().getAlternatives());
					// InternalHtmlLang.g:219:3: (
					// rule__BodyContents__Alternatives )
					// InternalHtmlLang.g:219:4:
					// rule__BodyContents__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__BodyContents__Alternatives();

						this.state._fsp--;


					}

					after(this.grammarAccess.getBodyContentsAccess().getAlternatives());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleBodyContents"


	// $ANTLR start "entryRuleParagraph"
	// InternalHtmlLang.g:228:1: entryRuleParagraph : ruleParagraph EOF ;
	public final void entryRuleParagraph() throws RecognitionException {
		try {
			// InternalHtmlLang.g:229:1: ( ruleParagraph EOF )
			// InternalHtmlLang.g:230:1: ruleParagraph EOF
			{
				before(this.grammarAccess.getParagraphRule());
				pushFollow(FOLLOW_1);
				ruleParagraph();

				this.state._fsp--;

				after(this.grammarAccess.getParagraphRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleParagraph"


	// $ANTLR start "ruleParagraph"
	// InternalHtmlLang.g:237:1: ruleParagraph : ( ( rule__Paragraph__Group__0 )
	// ) ;
	public final void ruleParagraph() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:241:2: ( ( ( rule__Paragraph__Group__0 ) ) )
			// InternalHtmlLang.g:242:2: ( ( rule__Paragraph__Group__0 ) )
			{
				// InternalHtmlLang.g:242:2: ( ( rule__Paragraph__Group__0 ) )
				// InternalHtmlLang.g:243:3: ( rule__Paragraph__Group__0 )
				{
					before(this.grammarAccess.getParagraphAccess().getGroup());
					// InternalHtmlLang.g:244:3: ( rule__Paragraph__Group__0 )
					// InternalHtmlLang.g:244:4: rule__Paragraph__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Paragraph__Group__0();

						this.state._fsp--;


					}

					after(this.grammarAccess.getParagraphAccess().getGroup());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleParagraph"


	// $ANTLR start "entryRuleUnorderedList"
	// InternalHtmlLang.g:253:1: entryRuleUnorderedList : ruleUnorderedList EOF
	// ;
	public final void entryRuleUnorderedList() throws RecognitionException {
		try {
			// InternalHtmlLang.g:254:1: ( ruleUnorderedList EOF )
			// InternalHtmlLang.g:255:1: ruleUnorderedList EOF
			{
				before(this.grammarAccess.getUnorderedListRule());
				pushFollow(FOLLOW_1);
				ruleUnorderedList();

				this.state._fsp--;

				after(this.grammarAccess.getUnorderedListRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleUnorderedList"


	// $ANTLR start "ruleUnorderedList"
	// InternalHtmlLang.g:262:1: ruleUnorderedList : ( (
	// rule__UnorderedList__Group__0 ) ) ;
	public final void ruleUnorderedList() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:266:2: ( ( ( rule__UnorderedList__Group__0 ) )
			// )
			// InternalHtmlLang.g:267:2: ( ( rule__UnorderedList__Group__0 ) )
			{
				// InternalHtmlLang.g:267:2: ( ( rule__UnorderedList__Group__0 )
				// )
				// InternalHtmlLang.g:268:3: ( rule__UnorderedList__Group__0 )
				{
					before(this.grammarAccess.getUnorderedListAccess().getGroup());
					// InternalHtmlLang.g:269:3: ( rule__UnorderedList__Group__0
					// )
					// InternalHtmlLang.g:269:4: rule__UnorderedList__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__UnorderedList__Group__0();

						this.state._fsp--;


					}

					after(this.grammarAccess.getUnorderedListAccess().getGroup());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleUnorderedList"


	// $ANTLR start "entryRuleListItem"
	// InternalHtmlLang.g:278:1: entryRuleListItem : ruleListItem EOF ;
	public final void entryRuleListItem() throws RecognitionException {
		try {
			// InternalHtmlLang.g:279:1: ( ruleListItem EOF )
			// InternalHtmlLang.g:280:1: ruleListItem EOF
			{
				before(this.grammarAccess.getListItemRule());
				pushFollow(FOLLOW_1);
				ruleListItem();

				this.state._fsp--;

				after(this.grammarAccess.getListItemRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleListItem"


	// $ANTLR start "ruleListItem"
	// InternalHtmlLang.g:287:1: ruleListItem : ( ( rule__ListItem__Group__0 ) )
	// ;
	public final void ruleListItem() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:291:2: ( ( ( rule__ListItem__Group__0 ) ) )
			// InternalHtmlLang.g:292:2: ( ( rule__ListItem__Group__0 ) )
			{
				// InternalHtmlLang.g:292:2: ( ( rule__ListItem__Group__0 ) )
				// InternalHtmlLang.g:293:3: ( rule__ListItem__Group__0 )
				{
					before(this.grammarAccess.getListItemAccess().getGroup());
					// InternalHtmlLang.g:294:3: ( rule__ListItem__Group__0 )
					// InternalHtmlLang.g:294:4: rule__ListItem__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__ListItem__Group__0();

						this.state._fsp--;


					}

					after(this.grammarAccess.getListItemAccess().getGroup());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleListItem"


	// $ANTLR start "entryRuleTextElement"
	// InternalHtmlLang.g:303:1: entryRuleTextElement : ruleTextElement EOF ;
	public final void entryRuleTextElement() throws RecognitionException {
		try {
			// InternalHtmlLang.g:304:1: ( ruleTextElement EOF )
			// InternalHtmlLang.g:305:1: ruleTextElement EOF
			{
				before(this.grammarAccess.getTextElementRule());
				pushFollow(FOLLOW_1);
				ruleTextElement();

				this.state._fsp--;

				after(this.grammarAccess.getTextElementRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleTextElement"


	// $ANTLR start "ruleTextElement"
	// InternalHtmlLang.g:312:1: ruleTextElement : ( (
	// rule__TextElement__Alternatives ) ) ;
	public final void ruleTextElement() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:316:2: ( ( ( rule__TextElement__Alternatives )
			// ) )
			// InternalHtmlLang.g:317:2: ( ( rule__TextElement__Alternatives ) )
			{
				// InternalHtmlLang.g:317:2: ( ( rule__TextElement__Alternatives
				// ) )
				// InternalHtmlLang.g:318:3: ( rule__TextElement__Alternatives )
				{
					before(this.grammarAccess.getTextElementAccess().getAlternatives());
					// InternalHtmlLang.g:319:3: (
					// rule__TextElement__Alternatives )
					// InternalHtmlLang.g:319:4: rule__TextElement__Alternatives
					{
						pushFollow(FOLLOW_2);
						rule__TextElement__Alternatives();

						this.state._fsp--;


					}

					after(this.grammarAccess.getTextElementAccess().getAlternatives());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleTextElement"


	// $ANTLR start "entryRuleFreeformText"
	// InternalHtmlLang.g:328:1: entryRuleFreeformText : ruleFreeformText EOF ;
	public final void entryRuleFreeformText() throws RecognitionException {
		try {
			// InternalHtmlLang.g:329:1: ( ruleFreeformText EOF )
			// InternalHtmlLang.g:330:1: ruleFreeformText EOF
			{
				before(this.grammarAccess.getFreeformTextRule());
				pushFollow(FOLLOW_1);
				ruleFreeformText();

				this.state._fsp--;

				after(this.grammarAccess.getFreeformTextRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleFreeformText"


	// $ANTLR start "ruleFreeformText"
	// InternalHtmlLang.g:337:1: ruleFreeformText : ( (
	// rule__FreeformText__TextAssignment ) ) ;
	public final void ruleFreeformText() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:341:2: ( ( (
			// rule__FreeformText__TextAssignment ) ) )
			// InternalHtmlLang.g:342:2: ( ( rule__FreeformText__TextAssignment
			// ) )
			{
				// InternalHtmlLang.g:342:2: ( (
				// rule__FreeformText__TextAssignment ) )
				// InternalHtmlLang.g:343:3: (
				// rule__FreeformText__TextAssignment )
				{
					before(this.grammarAccess.getFreeformTextAccess().getTextAssignment());
					// InternalHtmlLang.g:344:3: (
					// rule__FreeformText__TextAssignment )
					// InternalHtmlLang.g:344:4:
					// rule__FreeformText__TextAssignment
					{
						pushFollow(FOLLOW_2);
						rule__FreeformText__TextAssignment();

						this.state._fsp--;


					}

					after(this.grammarAccess.getFreeformTextAccess().getTextAssignment());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleFreeformText"


	// $ANTLR start "entryRuleBold"
	// InternalHtmlLang.g:353:1: entryRuleBold : ruleBold EOF ;
	public final void entryRuleBold() throws RecognitionException {
		try {
			// InternalHtmlLang.g:354:1: ( ruleBold EOF )
			// InternalHtmlLang.g:355:1: ruleBold EOF
			{
				before(this.grammarAccess.getBoldRule());
				pushFollow(FOLLOW_1);
				ruleBold();

				this.state._fsp--;

				after(this.grammarAccess.getBoldRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleBold"


	// $ANTLR start "ruleBold"
	// InternalHtmlLang.g:362:1: ruleBold : ( ( rule__Bold__Group__0 ) ) ;
	public final void ruleBold() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:366:2: ( ( ( rule__Bold__Group__0 ) ) )
			// InternalHtmlLang.g:367:2: ( ( rule__Bold__Group__0 ) )
			{
				// InternalHtmlLang.g:367:2: ( ( rule__Bold__Group__0 ) )
				// InternalHtmlLang.g:368:3: ( rule__Bold__Group__0 )
				{
					before(this.grammarAccess.getBoldAccess().getGroup());
					// InternalHtmlLang.g:369:3: ( rule__Bold__Group__0 )
					// InternalHtmlLang.g:369:4: rule__Bold__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Bold__Group__0();

						this.state._fsp--;


					}

					after(this.grammarAccess.getBoldAccess().getGroup());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleBold"


	// $ANTLR start "entryRuleItalics"
	// InternalHtmlLang.g:378:1: entryRuleItalics : ruleItalics EOF ;
	public final void entryRuleItalics() throws RecognitionException {
		try {
			// InternalHtmlLang.g:379:1: ( ruleItalics EOF )
			// InternalHtmlLang.g:380:1: ruleItalics EOF
			{
				before(this.grammarAccess.getItalicsRule());
				pushFollow(FOLLOW_1);
				ruleItalics();

				this.state._fsp--;

				after(this.grammarAccess.getItalicsRule());
				match(this.input, EOF, FOLLOW_2);

			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
		}
		return;
	}
	// $ANTLR end "entryRuleItalics"


	// $ANTLR start "ruleItalics"
	// InternalHtmlLang.g:387:1: ruleItalics : ( ( rule__Italics__Group__0 ) ) ;
	public final void ruleItalics() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:391:2: ( ( ( rule__Italics__Group__0 ) ) )
			// InternalHtmlLang.g:392:2: ( ( rule__Italics__Group__0 ) )
			{
				// InternalHtmlLang.g:392:2: ( ( rule__Italics__Group__0 ) )
				// InternalHtmlLang.g:393:3: ( rule__Italics__Group__0 )
				{
					before(this.grammarAccess.getItalicsAccess().getGroup());
					// InternalHtmlLang.g:394:3: ( rule__Italics__Group__0 )
					// InternalHtmlLang.g:394:4: rule__Italics__Group__0
					{
						pushFollow(FOLLOW_2);
						rule__Italics__Group__0();

						this.state._fsp--;


					}

					after(this.grammarAccess.getItalicsAccess().getGroup());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "ruleItalics"


	// $ANTLR start "rule__Header__Alternatives"
	// InternalHtmlLang.g:402:1: rule__Header__Alternatives : ( ( ruleTitle ) |
	// ( ruleStyle ) );
	public final void rule__Header__Alternatives() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:406:1: ( ( ruleTitle ) | ( ruleStyle ) )
			int alt1 = 2;
			final int LA1_0 = this.input.LA(1);

			if ((LA1_0 == 11)) {
				alt1 = 1;
			} else if ((LA1_0 == 13)) {
				alt1 = 2;
			} else {
				final NoViableAltException nvae = new NoViableAltException("", 1, 0, this.input);

				throw nvae;
			}
			switch (alt1) {
				case 1:
				// InternalHtmlLang.g:407:2: ( ruleTitle )
				{
					// InternalHtmlLang.g:407:2: ( ruleTitle )
					// InternalHtmlLang.g:408:3: ruleTitle
					{
						before(this.grammarAccess.getHeaderAccess().getTitleParserRuleCall_0());
						pushFollow(FOLLOW_2);
						ruleTitle();

						this.state._fsp--;

						after(this.grammarAccess.getHeaderAccess().getTitleParserRuleCall_0());

					}


				}
					break;
				case 2:
				// InternalHtmlLang.g:413:2: ( ruleStyle )
				{
					// InternalHtmlLang.g:413:2: ( ruleStyle )
					// InternalHtmlLang.g:414:3: ruleStyle
					{
						before(this.grammarAccess.getHeaderAccess().getStyleParserRuleCall_1());
						pushFollow(FOLLOW_2);
						ruleStyle();

						this.state._fsp--;

						after(this.grammarAccess.getHeaderAccess().getStyleParserRuleCall_1());

					}


				}
					break;
				
			}
		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Header__Alternatives"


	// $ANTLR start "rule__BodyContents__Alternatives"
	// InternalHtmlLang.g:423:1: rule__BodyContents__Alternatives : ( (
	// ruleParagraph ) | ( ruleUnorderedList ) );
	public final void rule__BodyContents__Alternatives() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:427:1: ( ( ruleParagraph ) | (
			// ruleUnorderedList ) )
			int alt2 = 2;
			final int LA2_0 = this.input.LA(1);

			if ((LA2_0 == 17)) {
				alt2 = 1;
			} else if ((LA2_0 == 19)) {
				alt2 = 2;
			} else {
				final NoViableAltException nvae = new NoViableAltException("", 2, 0, this.input);

				throw nvae;
			}
			switch (alt2) {
				case 1:
				// InternalHtmlLang.g:428:2: ( ruleParagraph )
				{
					// InternalHtmlLang.g:428:2: ( ruleParagraph )
					// InternalHtmlLang.g:429:3: ruleParagraph
					{
						before(this.grammarAccess.getBodyContentsAccess().getParagraphParserRuleCall_0());
						pushFollow(FOLLOW_2);
						ruleParagraph();

						this.state._fsp--;

						after(this.grammarAccess.getBodyContentsAccess().getParagraphParserRuleCall_0());

					}


				}
					break;
				case 2:
				// InternalHtmlLang.g:434:2: ( ruleUnorderedList )
				{
					// InternalHtmlLang.g:434:2: ( ruleUnorderedList )
					// InternalHtmlLang.g:435:3: ruleUnorderedList
					{
						before(this.grammarAccess.getBodyContentsAccess().getUnorderedListParserRuleCall_1());
						pushFollow(FOLLOW_2);
						ruleUnorderedList();

						this.state._fsp--;

						after(this.grammarAccess.getBodyContentsAccess().getUnorderedListParserRuleCall_1());

					}


				}
					break;
				
			}
		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__BodyContents__Alternatives"


	// $ANTLR start "rule__TextElement__Alternatives"
	// InternalHtmlLang.g:444:1: rule__TextElement__Alternatives : ( (
	// ruleFreeformText ) | ( ruleBold ) | ( ruleItalics ) );
	public final void rule__TextElement__Alternatives() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:448:1: ( ( ruleFreeformText ) | ( ruleBold ) |
			// ( ruleItalics ) )
			int alt3 = 3;
			switch (this.input.LA(1)) {
				case RULE_HTMLSTRING: {
					alt3 = 1;
				}
					break;
				case 23: {
					alt3 = 2;
				}
					break;
				case 25: {
					alt3 = 3;
				}
					break;
				default:
					final NoViableAltException nvae = new NoViableAltException("", 3, 0, this.input);

					throw nvae;
			}

			switch (alt3) {
				case 1:
				// InternalHtmlLang.g:449:2: ( ruleFreeformText )
				{
					// InternalHtmlLang.g:449:2: ( ruleFreeformText )
					// InternalHtmlLang.g:450:3: ruleFreeformText
					{
						before(this.grammarAccess.getTextElementAccess().getFreeformTextParserRuleCall_0());
						pushFollow(FOLLOW_2);
						ruleFreeformText();

						this.state._fsp--;

						after(this.grammarAccess.getTextElementAccess().getFreeformTextParserRuleCall_0());

					}


				}
					break;
				case 2:
				// InternalHtmlLang.g:455:2: ( ruleBold )
				{
					// InternalHtmlLang.g:455:2: ( ruleBold )
					// InternalHtmlLang.g:456:3: ruleBold
					{
						before(this.grammarAccess.getTextElementAccess().getBoldParserRuleCall_1());
						pushFollow(FOLLOW_2);
						ruleBold();

						this.state._fsp--;

						after(this.grammarAccess.getTextElementAccess().getBoldParserRuleCall_1());

					}


				}
					break;
				case 3:
				// InternalHtmlLang.g:461:2: ( ruleItalics )
				{
					// InternalHtmlLang.g:461:2: ( ruleItalics )
					// InternalHtmlLang.g:462:3: ruleItalics
					{
						before(this.grammarAccess.getTextElementAccess().getItalicsParserRuleCall_2());
						pushFollow(FOLLOW_2);
						ruleItalics();

						this.state._fsp--;

						after(this.grammarAccess.getTextElementAccess().getItalicsParserRuleCall_2());

					}


				}
					break;
				
			}
		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__TextElement__Alternatives"


	// $ANTLR start "rule__Html__Group__0"
	// InternalHtmlLang.g:471:1: rule__Html__Group__0 :
	// rule__Html__Group__0__Impl rule__Html__Group__1 ;
	public final void rule__Html__Group__0() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:475:1: ( rule__Html__Group__0__Impl
			// rule__Html__Group__1 )
			// InternalHtmlLang.g:476:2: rule__Html__Group__0__Impl
			// rule__Html__Group__1
			{
				pushFollow(FOLLOW_3);
				rule__Html__Group__0__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Html__Group__1();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Html__Group__0"


	// $ANTLR start "rule__Html__Group__0__Impl"
	// InternalHtmlLang.g:483:1: rule__Html__Group__0__Impl : ( '<html>' ) ;
	public final void rule__Html__Group__0__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:487:1: ( ( '<html>' ) )
			// InternalHtmlLang.g:488:1: ( '<html>' )
			{
				// InternalHtmlLang.g:488:1: ( '<html>' )
				// InternalHtmlLang.g:489:2: '<html>'
				{
					before(this.grammarAccess.getHtmlAccess().getHtmlKeyword_0());
					match(this.input, 7, FOLLOW_2);
					after(this.grammarAccess.getHtmlAccess().getHtmlKeyword_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Html__Group__0__Impl"


	// $ANTLR start "rule__Html__Group__1"
	// InternalHtmlLang.g:498:1: rule__Html__Group__1 :
	// rule__Html__Group__1__Impl rule__Html__Group__2 ;
	public final void rule__Html__Group__1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:502:1: ( rule__Html__Group__1__Impl
			// rule__Html__Group__2 )
			// InternalHtmlLang.g:503:2: rule__Html__Group__1__Impl
			// rule__Html__Group__2
			{
				pushFollow(FOLLOW_4);
				rule__Html__Group__1__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Html__Group__2();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Html__Group__1"


	// $ANTLR start "rule__Html__Group__1__Impl"
	// InternalHtmlLang.g:510:1: rule__Html__Group__1__Impl : ( (
	// rule__Html__HeadAssignment_1 ) ) ;
	public final void rule__Html__Group__1__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:514:1: ( ( ( rule__Html__HeadAssignment_1 ) )
			// )
			// InternalHtmlLang.g:515:1: ( ( rule__Html__HeadAssignment_1 ) )
			{
				// InternalHtmlLang.g:515:1: ( ( rule__Html__HeadAssignment_1 )
				// )
				// InternalHtmlLang.g:516:2: ( rule__Html__HeadAssignment_1 )
				{
					before(this.grammarAccess.getHtmlAccess().getHeadAssignment_1());
					// InternalHtmlLang.g:517:2: ( rule__Html__HeadAssignment_1
					// )
					// InternalHtmlLang.g:517:3: rule__Html__HeadAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__Html__HeadAssignment_1();

						this.state._fsp--;


					}

					after(this.grammarAccess.getHtmlAccess().getHeadAssignment_1());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Html__Group__1__Impl"


	// $ANTLR start "rule__Html__Group__2"
	// InternalHtmlLang.g:525:1: rule__Html__Group__2 :
	// rule__Html__Group__2__Impl rule__Html__Group__3 ;
	public final void rule__Html__Group__2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:529:1: ( rule__Html__Group__2__Impl
			// rule__Html__Group__3 )
			// InternalHtmlLang.g:530:2: rule__Html__Group__2__Impl
			// rule__Html__Group__3
			{
				pushFollow(FOLLOW_5);
				rule__Html__Group__2__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Html__Group__3();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Html__Group__2"


	// $ANTLR start "rule__Html__Group__2__Impl"
	// InternalHtmlLang.g:537:1: rule__Html__Group__2__Impl : ( (
	// rule__Html__BodyAssignment_2 ) ) ;
	public final void rule__Html__Group__2__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:541:1: ( ( ( rule__Html__BodyAssignment_2 ) )
			// )
			// InternalHtmlLang.g:542:1: ( ( rule__Html__BodyAssignment_2 ) )
			{
				// InternalHtmlLang.g:542:1: ( ( rule__Html__BodyAssignment_2 )
				// )
				// InternalHtmlLang.g:543:2: ( rule__Html__BodyAssignment_2 )
				{
					before(this.grammarAccess.getHtmlAccess().getBodyAssignment_2());
					// InternalHtmlLang.g:544:2: ( rule__Html__BodyAssignment_2
					// )
					// InternalHtmlLang.g:544:3: rule__Html__BodyAssignment_2
					{
						pushFollow(FOLLOW_2);
						rule__Html__BodyAssignment_2();

						this.state._fsp--;


					}

					after(this.grammarAccess.getHtmlAccess().getBodyAssignment_2());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Html__Group__2__Impl"


	// $ANTLR start "rule__Html__Group__3"
	// InternalHtmlLang.g:552:1: rule__Html__Group__3 :
	// rule__Html__Group__3__Impl ;
	public final void rule__Html__Group__3() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:556:1: ( rule__Html__Group__3__Impl )
			// InternalHtmlLang.g:557:2: rule__Html__Group__3__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Html__Group__3__Impl();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Html__Group__3"


	// $ANTLR start "rule__Html__Group__3__Impl"
	// InternalHtmlLang.g:563:1: rule__Html__Group__3__Impl : ( '</html>' ) ;
	public final void rule__Html__Group__3__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:567:1: ( ( '</html>' ) )
			// InternalHtmlLang.g:568:1: ( '</html>' )
			{
				// InternalHtmlLang.g:568:1: ( '</html>' )
				// InternalHtmlLang.g:569:2: '</html>'
				{
					before(this.grammarAccess.getHtmlAccess().getHtmlKeyword_3());
					match(this.input, 8, FOLLOW_2);
					after(this.grammarAccess.getHtmlAccess().getHtmlKeyword_3());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Html__Group__3__Impl"


	// $ANTLR start "rule__Head__Group__0"
	// InternalHtmlLang.g:579:1: rule__Head__Group__0 :
	// rule__Head__Group__0__Impl rule__Head__Group__1 ;
	public final void rule__Head__Group__0() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:583:1: ( rule__Head__Group__0__Impl
			// rule__Head__Group__1 )
			// InternalHtmlLang.g:584:2: rule__Head__Group__0__Impl
			// rule__Head__Group__1
			{
				pushFollow(FOLLOW_3);
				rule__Head__Group__0__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Head__Group__1();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Head__Group__0"


	// $ANTLR start "rule__Head__Group__0__Impl"
	// InternalHtmlLang.g:591:1: rule__Head__Group__0__Impl : ( () ) ;
	public final void rule__Head__Group__0__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:595:1: ( ( () ) )
			// InternalHtmlLang.g:596:1: ( () )
			{
				// InternalHtmlLang.g:596:1: ( () )
				// InternalHtmlLang.g:597:2: ()
				{
					before(this.grammarAccess.getHeadAccess().getHeadAction_0());
					// InternalHtmlLang.g:598:2: ()
					// InternalHtmlLang.g:598:3:
					{
					}

					after(this.grammarAccess.getHeadAccess().getHeadAction_0());

				}


			}

		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Head__Group__0__Impl"


	// $ANTLR start "rule__Head__Group__1"
	// InternalHtmlLang.g:606:1: rule__Head__Group__1 :
	// rule__Head__Group__1__Impl rule__Head__Group__2 ;
	public final void rule__Head__Group__1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:610:1: ( rule__Head__Group__1__Impl
			// rule__Head__Group__2 )
			// InternalHtmlLang.g:611:2: rule__Head__Group__1__Impl
			// rule__Head__Group__2
			{
				pushFollow(FOLLOW_6);
				rule__Head__Group__1__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Head__Group__2();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Head__Group__1"


	// $ANTLR start "rule__Head__Group__1__Impl"
	// InternalHtmlLang.g:618:1: rule__Head__Group__1__Impl : ( '<head>' ) ;
	public final void rule__Head__Group__1__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:622:1: ( ( '<head>' ) )
			// InternalHtmlLang.g:623:1: ( '<head>' )
			{
				// InternalHtmlLang.g:623:1: ( '<head>' )
				// InternalHtmlLang.g:624:2: '<head>'
				{
					before(this.grammarAccess.getHeadAccess().getHeadKeyword_1());
					match(this.input, 9, FOLLOW_2);
					after(this.grammarAccess.getHeadAccess().getHeadKeyword_1());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Head__Group__1__Impl"


	// $ANTLR start "rule__Head__Group__2"
	// InternalHtmlLang.g:633:1: rule__Head__Group__2 :
	// rule__Head__Group__2__Impl rule__Head__Group__3 ;
	public final void rule__Head__Group__2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:637:1: ( rule__Head__Group__2__Impl
			// rule__Head__Group__3 )
			// InternalHtmlLang.g:638:2: rule__Head__Group__2__Impl
			// rule__Head__Group__3
			{
				pushFollow(FOLLOW_6);
				rule__Head__Group__2__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Head__Group__3();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Head__Group__2"


	// $ANTLR start "rule__Head__Group__2__Impl"
	// InternalHtmlLang.g:645:1: rule__Head__Group__2__Impl : ( (
	// rule__Head__HeadersAssignment_2 )* ) ;
	public final void rule__Head__Group__2__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:649:1: ( ( ( rule__Head__HeadersAssignment_2
			// )* ) )
			// InternalHtmlLang.g:650:1: ( ( rule__Head__HeadersAssignment_2 )*
			// )
			{
				// InternalHtmlLang.g:650:1: ( ( rule__Head__HeadersAssignment_2
				// )* )
				// InternalHtmlLang.g:651:2: ( rule__Head__HeadersAssignment_2
				// )*
				{
					before(this.grammarAccess.getHeadAccess().getHeadersAssignment_2());
					// InternalHtmlLang.g:652:2: (
					// rule__Head__HeadersAssignment_2 )*
					loop4: do {
						int alt4 = 2;
						final int LA4_0 = this.input.LA(1);

						if ((LA4_0 == 11 || LA4_0 == 13)) {
							alt4 = 1;
						}


						switch (alt4) {
							case 1:
							// InternalHtmlLang.g:652:3:
							// rule__Head__HeadersAssignment_2
							{
								pushFollow(FOLLOW_7);
								rule__Head__HeadersAssignment_2();

								this.state._fsp--;


							}
								break;
							
							default:
								break loop4;
						}
					} while (true);

					after(this.grammarAccess.getHeadAccess().getHeadersAssignment_2());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Head__Group__2__Impl"


	// $ANTLR start "rule__Head__Group__3"
	// InternalHtmlLang.g:660:1: rule__Head__Group__3 :
	// rule__Head__Group__3__Impl ;
	public final void rule__Head__Group__3() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:664:1: ( rule__Head__Group__3__Impl )
			// InternalHtmlLang.g:665:2: rule__Head__Group__3__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Head__Group__3__Impl();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Head__Group__3"


	// $ANTLR start "rule__Head__Group__3__Impl"
	// InternalHtmlLang.g:671:1: rule__Head__Group__3__Impl : ( '</head>' ) ;
	public final void rule__Head__Group__3__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:675:1: ( ( '</head>' ) )
			// InternalHtmlLang.g:676:1: ( '</head>' )
			{
				// InternalHtmlLang.g:676:1: ( '</head>' )
				// InternalHtmlLang.g:677:2: '</head>'
				{
					before(this.grammarAccess.getHeadAccess().getHeadKeyword_3());
					match(this.input, 10, FOLLOW_2);
					after(this.grammarAccess.getHeadAccess().getHeadKeyword_3());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Head__Group__3__Impl"


	// $ANTLR start "rule__Title__Group__0"
	// InternalHtmlLang.g:687:1: rule__Title__Group__0 :
	// rule__Title__Group__0__Impl rule__Title__Group__1 ;
	public final void rule__Title__Group__0() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:691:1: ( rule__Title__Group__0__Impl
			// rule__Title__Group__1 )
			// InternalHtmlLang.g:692:2: rule__Title__Group__0__Impl
			// rule__Title__Group__1
			{
				pushFollow(FOLLOW_8);
				rule__Title__Group__0__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Title__Group__1();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Title__Group__0"


	// $ANTLR start "rule__Title__Group__0__Impl"
	// InternalHtmlLang.g:699:1: rule__Title__Group__0__Impl : ( '<title>' ) ;
	public final void rule__Title__Group__0__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:703:1: ( ( '<title>' ) )
			// InternalHtmlLang.g:704:1: ( '<title>' )
			{
				// InternalHtmlLang.g:704:1: ( '<title>' )
				// InternalHtmlLang.g:705:2: '<title>'
				{
					before(this.grammarAccess.getTitleAccess().getTitleKeyword_0());
					match(this.input, 11, FOLLOW_2);
					after(this.grammarAccess.getTitleAccess().getTitleKeyword_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Title__Group__0__Impl"


	// $ANTLR start "rule__Title__Group__1"
	// InternalHtmlLang.g:714:1: rule__Title__Group__1 :
	// rule__Title__Group__1__Impl rule__Title__Group__2 ;
	public final void rule__Title__Group__1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:718:1: ( rule__Title__Group__1__Impl
			// rule__Title__Group__2 )
			// InternalHtmlLang.g:719:2: rule__Title__Group__1__Impl
			// rule__Title__Group__2
			{
				pushFollow(FOLLOW_9);
				rule__Title__Group__1__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Title__Group__2();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Title__Group__1"


	// $ANTLR start "rule__Title__Group__1__Impl"
	// InternalHtmlLang.g:726:1: rule__Title__Group__1__Impl : ( (
	// rule__Title__NameAssignment_1 ) ) ;
	public final void rule__Title__Group__1__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:730:1: ( ( ( rule__Title__NameAssignment_1 ) )
			// )
			// InternalHtmlLang.g:731:1: ( ( rule__Title__NameAssignment_1 ) )
			{
				// InternalHtmlLang.g:731:1: ( ( rule__Title__NameAssignment_1 )
				// )
				// InternalHtmlLang.g:732:2: ( rule__Title__NameAssignment_1 )
				{
					before(this.grammarAccess.getTitleAccess().getNameAssignment_1());
					// InternalHtmlLang.g:733:2: ( rule__Title__NameAssignment_1
					// )
					// InternalHtmlLang.g:733:3: rule__Title__NameAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__Title__NameAssignment_1();

						this.state._fsp--;


					}

					after(this.grammarAccess.getTitleAccess().getNameAssignment_1());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Title__Group__1__Impl"


	// $ANTLR start "rule__Title__Group__2"
	// InternalHtmlLang.g:741:1: rule__Title__Group__2 :
	// rule__Title__Group__2__Impl ;
	public final void rule__Title__Group__2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:745:1: ( rule__Title__Group__2__Impl )
			// InternalHtmlLang.g:746:2: rule__Title__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Title__Group__2__Impl();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Title__Group__2"


	// $ANTLR start "rule__Title__Group__2__Impl"
	// InternalHtmlLang.g:752:1: rule__Title__Group__2__Impl : ( '</title>' ) ;
	public final void rule__Title__Group__2__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:756:1: ( ( '</title>' ) )
			// InternalHtmlLang.g:757:1: ( '</title>' )
			{
				// InternalHtmlLang.g:757:1: ( '</title>' )
				// InternalHtmlLang.g:758:2: '</title>'
				{
					before(this.grammarAccess.getTitleAccess().getTitleKeyword_2());
					match(this.input, 12, FOLLOW_2);
					after(this.grammarAccess.getTitleAccess().getTitleKeyword_2());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Title__Group__2__Impl"


	// $ANTLR start "rule__Style__Group__0"
	// InternalHtmlLang.g:768:1: rule__Style__Group__0 :
	// rule__Style__Group__0__Impl rule__Style__Group__1 ;
	public final void rule__Style__Group__0() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:772:1: ( rule__Style__Group__0__Impl
			// rule__Style__Group__1 )
			// InternalHtmlLang.g:773:2: rule__Style__Group__0__Impl
			// rule__Style__Group__1
			{
				pushFollow(FOLLOW_8);
				rule__Style__Group__0__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Style__Group__1();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Style__Group__0"


	// $ANTLR start "rule__Style__Group__0__Impl"
	// InternalHtmlLang.g:780:1: rule__Style__Group__0__Impl : ( '<style>' ) ;
	public final void rule__Style__Group__0__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:784:1: ( ( '<style>' ) )
			// InternalHtmlLang.g:785:1: ( '<style>' )
			{
				// InternalHtmlLang.g:785:1: ( '<style>' )
				// InternalHtmlLang.g:786:2: '<style>'
				{
					before(this.grammarAccess.getStyleAccess().getStyleKeyword_0());
					match(this.input, 13, FOLLOW_2);
					after(this.grammarAccess.getStyleAccess().getStyleKeyword_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Style__Group__0__Impl"


	// $ANTLR start "rule__Style__Group__1"
	// InternalHtmlLang.g:795:1: rule__Style__Group__1 :
	// rule__Style__Group__1__Impl rule__Style__Group__2 ;
	public final void rule__Style__Group__1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:799:1: ( rule__Style__Group__1__Impl
			// rule__Style__Group__2 )
			// InternalHtmlLang.g:800:2: rule__Style__Group__1__Impl
			// rule__Style__Group__2
			{
				pushFollow(FOLLOW_10);
				rule__Style__Group__1__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Style__Group__2();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Style__Group__1"


	// $ANTLR start "rule__Style__Group__1__Impl"
	// InternalHtmlLang.g:807:1: rule__Style__Group__1__Impl : ( (
	// rule__Style__StylesAssignment_1 ) ) ;
	public final void rule__Style__Group__1__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:811:1: ( ( ( rule__Style__StylesAssignment_1 )
			// ) )
			// InternalHtmlLang.g:812:1: ( ( rule__Style__StylesAssignment_1 ) )
			{
				// InternalHtmlLang.g:812:1: ( ( rule__Style__StylesAssignment_1
				// ) )
				// InternalHtmlLang.g:813:2: ( rule__Style__StylesAssignment_1 )
				{
					before(this.grammarAccess.getStyleAccess().getStylesAssignment_1());
					// InternalHtmlLang.g:814:2: (
					// rule__Style__StylesAssignment_1 )
					// InternalHtmlLang.g:814:3: rule__Style__StylesAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__Style__StylesAssignment_1();

						this.state._fsp--;


					}

					after(this.grammarAccess.getStyleAccess().getStylesAssignment_1());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Style__Group__1__Impl"


	// $ANTLR start "rule__Style__Group__2"
	// InternalHtmlLang.g:822:1: rule__Style__Group__2 :
	// rule__Style__Group__2__Impl ;
	public final void rule__Style__Group__2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:826:1: ( rule__Style__Group__2__Impl )
			// InternalHtmlLang.g:827:2: rule__Style__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Style__Group__2__Impl();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Style__Group__2"


	// $ANTLR start "rule__Style__Group__2__Impl"
	// InternalHtmlLang.g:833:1: rule__Style__Group__2__Impl : ( '</style>' ) ;
	public final void rule__Style__Group__2__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:837:1: ( ( '</style>' ) )
			// InternalHtmlLang.g:838:1: ( '</style>' )
			{
				// InternalHtmlLang.g:838:1: ( '</style>' )
				// InternalHtmlLang.g:839:2: '</style>'
				{
					before(this.grammarAccess.getStyleAccess().getStyleKeyword_2());
					match(this.input, 14, FOLLOW_2);
					after(this.grammarAccess.getStyleAccess().getStyleKeyword_2());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Style__Group__2__Impl"


	// $ANTLR start "rule__Body__Group__0"
	// InternalHtmlLang.g:849:1: rule__Body__Group__0 :
	// rule__Body__Group__0__Impl rule__Body__Group__1 ;
	public final void rule__Body__Group__0() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:853:1: ( rule__Body__Group__0__Impl
			// rule__Body__Group__1 )
			// InternalHtmlLang.g:854:2: rule__Body__Group__0__Impl
			// rule__Body__Group__1
			{
				pushFollow(FOLLOW_4);
				rule__Body__Group__0__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Body__Group__1();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Body__Group__0"


	// $ANTLR start "rule__Body__Group__0__Impl"
	// InternalHtmlLang.g:861:1: rule__Body__Group__0__Impl : ( () ) ;
	public final void rule__Body__Group__0__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:865:1: ( ( () ) )
			// InternalHtmlLang.g:866:1: ( () )
			{
				// InternalHtmlLang.g:866:1: ( () )
				// InternalHtmlLang.g:867:2: ()
				{
					before(this.grammarAccess.getBodyAccess().getBodyAction_0());
					// InternalHtmlLang.g:868:2: ()
					// InternalHtmlLang.g:868:3:
					{
					}

					after(this.grammarAccess.getBodyAccess().getBodyAction_0());

				}


			}

		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Body__Group__0__Impl"


	// $ANTLR start "rule__Body__Group__1"
	// InternalHtmlLang.g:876:1: rule__Body__Group__1 :
	// rule__Body__Group__1__Impl rule__Body__Group__2 ;
	public final void rule__Body__Group__1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:880:1: ( rule__Body__Group__1__Impl
			// rule__Body__Group__2 )
			// InternalHtmlLang.g:881:2: rule__Body__Group__1__Impl
			// rule__Body__Group__2
			{
				pushFollow(FOLLOW_11);
				rule__Body__Group__1__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Body__Group__2();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Body__Group__1"


	// $ANTLR start "rule__Body__Group__1__Impl"
	// InternalHtmlLang.g:888:1: rule__Body__Group__1__Impl : ( '<body>' ) ;
	public final void rule__Body__Group__1__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:892:1: ( ( '<body>' ) )
			// InternalHtmlLang.g:893:1: ( '<body>' )
			{
				// InternalHtmlLang.g:893:1: ( '<body>' )
				// InternalHtmlLang.g:894:2: '<body>'
				{
					before(this.grammarAccess.getBodyAccess().getBodyKeyword_1());
					match(this.input, 15, FOLLOW_2);
					after(this.grammarAccess.getBodyAccess().getBodyKeyword_1());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Body__Group__1__Impl"


	// $ANTLR start "rule__Body__Group__2"
	// InternalHtmlLang.g:903:1: rule__Body__Group__2 :
	// rule__Body__Group__2__Impl rule__Body__Group__3 ;
	public final void rule__Body__Group__2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:907:1: ( rule__Body__Group__2__Impl
			// rule__Body__Group__3 )
			// InternalHtmlLang.g:908:2: rule__Body__Group__2__Impl
			// rule__Body__Group__3
			{
				pushFollow(FOLLOW_11);
				rule__Body__Group__2__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Body__Group__3();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Body__Group__2"


	// $ANTLR start "rule__Body__Group__2__Impl"
	// InternalHtmlLang.g:915:1: rule__Body__Group__2__Impl : ( (
	// rule__Body__ContentsAssignment_2 )* ) ;
	public final void rule__Body__Group__2__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:919:1: ( ( ( rule__Body__ContentsAssignment_2
			// )* ) )
			// InternalHtmlLang.g:920:1: ( ( rule__Body__ContentsAssignment_2 )*
			// )
			{
				// InternalHtmlLang.g:920:1: ( (
				// rule__Body__ContentsAssignment_2 )* )
				// InternalHtmlLang.g:921:2: ( rule__Body__ContentsAssignment_2
				// )*
				{
					before(this.grammarAccess.getBodyAccess().getContentsAssignment_2());
					// InternalHtmlLang.g:922:2: (
					// rule__Body__ContentsAssignment_2 )*
					loop5: do {
						int alt5 = 2;
						final int LA5_0 = this.input.LA(1);

						if ((LA5_0 == 17 || LA5_0 == 19)) {
							alt5 = 1;
						}


						switch (alt5) {
							case 1:
							// InternalHtmlLang.g:922:3:
							// rule__Body__ContentsAssignment_2
							{
								pushFollow(FOLLOW_12);
								rule__Body__ContentsAssignment_2();

								this.state._fsp--;


							}
								break;
							
							default:
								break loop5;
						}
					} while (true);

					after(this.grammarAccess.getBodyAccess().getContentsAssignment_2());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Body__Group__2__Impl"


	// $ANTLR start "rule__Body__Group__3"
	// InternalHtmlLang.g:930:1: rule__Body__Group__3 :
	// rule__Body__Group__3__Impl ;
	public final void rule__Body__Group__3() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:934:1: ( rule__Body__Group__3__Impl )
			// InternalHtmlLang.g:935:2: rule__Body__Group__3__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Body__Group__3__Impl();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Body__Group__3"


	// $ANTLR start "rule__Body__Group__3__Impl"
	// InternalHtmlLang.g:941:1: rule__Body__Group__3__Impl : ( '</body>' ) ;
	public final void rule__Body__Group__3__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:945:1: ( ( '</body>' ) )
			// InternalHtmlLang.g:946:1: ( '</body>' )
			{
				// InternalHtmlLang.g:946:1: ( '</body>' )
				// InternalHtmlLang.g:947:2: '</body>'
				{
					before(this.grammarAccess.getBodyAccess().getBodyKeyword_3());
					match(this.input, 16, FOLLOW_2);
					after(this.grammarAccess.getBodyAccess().getBodyKeyword_3());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Body__Group__3__Impl"


	// $ANTLR start "rule__Paragraph__Group__0"
	// InternalHtmlLang.g:957:1: rule__Paragraph__Group__0 :
	// rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
	public final void rule__Paragraph__Group__0() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:961:1: ( rule__Paragraph__Group__0__Impl
			// rule__Paragraph__Group__1 )
			// InternalHtmlLang.g:962:2: rule__Paragraph__Group__0__Impl
			// rule__Paragraph__Group__1
			{
				pushFollow(FOLLOW_13);
				rule__Paragraph__Group__0__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Paragraph__Group__1();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Paragraph__Group__0"


	// $ANTLR start "rule__Paragraph__Group__0__Impl"
	// InternalHtmlLang.g:969:1: rule__Paragraph__Group__0__Impl : ( () ) ;
	public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:973:1: ( ( () ) )
			// InternalHtmlLang.g:974:1: ( () )
			{
				// InternalHtmlLang.g:974:1: ( () )
				// InternalHtmlLang.g:975:2: ()
				{
					before(this.grammarAccess.getParagraphAccess().getParagraphAction_0());
					// InternalHtmlLang.g:976:2: ()
					// InternalHtmlLang.g:976:3:
					{
					}

					after(this.grammarAccess.getParagraphAccess().getParagraphAction_0());

				}


			}

		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Paragraph__Group__0__Impl"


	// $ANTLR start "rule__Paragraph__Group__1"
	// InternalHtmlLang.g:984:1: rule__Paragraph__Group__1 :
	// rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2 ;
	public final void rule__Paragraph__Group__1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:988:1: ( rule__Paragraph__Group__1__Impl
			// rule__Paragraph__Group__2 )
			// InternalHtmlLang.g:989:2: rule__Paragraph__Group__1__Impl
			// rule__Paragraph__Group__2
			{
				pushFollow(FOLLOW_14);
				rule__Paragraph__Group__1__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Paragraph__Group__2();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Paragraph__Group__1"


	// $ANTLR start "rule__Paragraph__Group__1__Impl"
	// InternalHtmlLang.g:996:1: rule__Paragraph__Group__1__Impl : ( '<p>' ) ;
	public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1000:1: ( ( '<p>' ) )
			// InternalHtmlLang.g:1001:1: ( '<p>' )
			{
				// InternalHtmlLang.g:1001:1: ( '<p>' )
				// InternalHtmlLang.g:1002:2: '<p>'
				{
					before(this.grammarAccess.getParagraphAccess().getPKeyword_1());
					match(this.input, 17, FOLLOW_2);
					after(this.grammarAccess.getParagraphAccess().getPKeyword_1());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Paragraph__Group__1__Impl"


	// $ANTLR start "rule__Paragraph__Group__2"
	// InternalHtmlLang.g:1011:1: rule__Paragraph__Group__2 :
	// rule__Paragraph__Group__2__Impl rule__Paragraph__Group__3 ;
	public final void rule__Paragraph__Group__2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1015:1: ( rule__Paragraph__Group__2__Impl
			// rule__Paragraph__Group__3 )
			// InternalHtmlLang.g:1016:2: rule__Paragraph__Group__2__Impl
			// rule__Paragraph__Group__3
			{
				pushFollow(FOLLOW_14);
				rule__Paragraph__Group__2__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Paragraph__Group__3();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Paragraph__Group__2"


	// $ANTLR start "rule__Paragraph__Group__2__Impl"
	// InternalHtmlLang.g:1023:1: rule__Paragraph__Group__2__Impl : ( (
	// rule__Paragraph__ContentsAssignment_2 )* ) ;
	public final void rule__Paragraph__Group__2__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1027:1: ( ( (
			// rule__Paragraph__ContentsAssignment_2 )* ) )
			// InternalHtmlLang.g:1028:1: ( (
			// rule__Paragraph__ContentsAssignment_2 )* )
			{
				// InternalHtmlLang.g:1028:1: ( (
				// rule__Paragraph__ContentsAssignment_2 )* )
				// InternalHtmlLang.g:1029:2: (
				// rule__Paragraph__ContentsAssignment_2 )*
				{
					before(this.grammarAccess.getParagraphAccess().getContentsAssignment_2());
					// InternalHtmlLang.g:1030:2: (
					// rule__Paragraph__ContentsAssignment_2 )*
					loop6: do {
						int alt6 = 2;
						final int LA6_0 = this.input.LA(1);

						if ((LA6_0 == RULE_HTMLSTRING || LA6_0 == 23 || LA6_0 == 25)) {
							alt6 = 1;
						}


						switch (alt6) {
							case 1:
							// InternalHtmlLang.g:1030:3:
							// rule__Paragraph__ContentsAssignment_2
							{
								pushFollow(FOLLOW_15);
								rule__Paragraph__ContentsAssignment_2();

								this.state._fsp--;


							}
								break;
							
							default:
								break loop6;
						}
					} while (true);

					after(this.grammarAccess.getParagraphAccess().getContentsAssignment_2());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Paragraph__Group__2__Impl"


	// $ANTLR start "rule__Paragraph__Group__3"
	// InternalHtmlLang.g:1038:1: rule__Paragraph__Group__3 :
	// rule__Paragraph__Group__3__Impl ;
	public final void rule__Paragraph__Group__3() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1042:1: ( rule__Paragraph__Group__3__Impl )
			// InternalHtmlLang.g:1043:2: rule__Paragraph__Group__3__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Paragraph__Group__3__Impl();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Paragraph__Group__3"


	// $ANTLR start "rule__Paragraph__Group__3__Impl"
	// InternalHtmlLang.g:1049:1: rule__Paragraph__Group__3__Impl : ( '</p>' ) ;
	public final void rule__Paragraph__Group__3__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1053:1: ( ( '</p>' ) )
			// InternalHtmlLang.g:1054:1: ( '</p>' )
			{
				// InternalHtmlLang.g:1054:1: ( '</p>' )
				// InternalHtmlLang.g:1055:2: '</p>'
				{
					before(this.grammarAccess.getParagraphAccess().getPKeyword_3());
					match(this.input, 18, FOLLOW_2);
					after(this.grammarAccess.getParagraphAccess().getPKeyword_3());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Paragraph__Group__3__Impl"


	// $ANTLR start "rule__UnorderedList__Group__0"
	// InternalHtmlLang.g:1065:1: rule__UnorderedList__Group__0 :
	// rule__UnorderedList__Group__0__Impl rule__UnorderedList__Group__1 ;
	public final void rule__UnorderedList__Group__0() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1069:1: ( rule__UnorderedList__Group__0__Impl
			// rule__UnorderedList__Group__1 )
			// InternalHtmlLang.g:1070:2: rule__UnorderedList__Group__0__Impl
			// rule__UnorderedList__Group__1
			{
				pushFollow(FOLLOW_16);
				rule__UnorderedList__Group__0__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__UnorderedList__Group__1();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UnorderedList__Group__0"


	// $ANTLR start "rule__UnorderedList__Group__0__Impl"
	// InternalHtmlLang.g:1077:1: rule__UnorderedList__Group__0__Impl : ( '<ul>'
	// ) ;
	public final void rule__UnorderedList__Group__0__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1081:1: ( ( '<ul>' ) )
			// InternalHtmlLang.g:1082:1: ( '<ul>' )
			{
				// InternalHtmlLang.g:1082:1: ( '<ul>' )
				// InternalHtmlLang.g:1083:2: '<ul>'
				{
					before(this.grammarAccess.getUnorderedListAccess().getUlKeyword_0());
					match(this.input, 19, FOLLOW_2);
					after(this.grammarAccess.getUnorderedListAccess().getUlKeyword_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UnorderedList__Group__0__Impl"


	// $ANTLR start "rule__UnorderedList__Group__1"
	// InternalHtmlLang.g:1092:1: rule__UnorderedList__Group__1 :
	// rule__UnorderedList__Group__1__Impl rule__UnorderedList__Group__2 ;
	public final void rule__UnorderedList__Group__1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1096:1: ( rule__UnorderedList__Group__1__Impl
			// rule__UnorderedList__Group__2 )
			// InternalHtmlLang.g:1097:2: rule__UnorderedList__Group__1__Impl
			// rule__UnorderedList__Group__2
			{
				pushFollow(FOLLOW_17);
				rule__UnorderedList__Group__1__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__UnorderedList__Group__2();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UnorderedList__Group__1"


	// $ANTLR start "rule__UnorderedList__Group__1__Impl"
	// InternalHtmlLang.g:1104:1: rule__UnorderedList__Group__1__Impl : ( ( (
	// rule__UnorderedList__ItemsAssignment_1 ) ) ( (
	// rule__UnorderedList__ItemsAssignment_1 )* ) ) ;
	public final void rule__UnorderedList__Group__1__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1108:1: ( ( ( (
			// rule__UnorderedList__ItemsAssignment_1 ) ) ( (
			// rule__UnorderedList__ItemsAssignment_1 )* ) ) )
			// InternalHtmlLang.g:1109:1: ( ( (
			// rule__UnorderedList__ItemsAssignment_1 ) ) ( (
			// rule__UnorderedList__ItemsAssignment_1 )* ) )
			{
				// InternalHtmlLang.g:1109:1: ( ( (
				// rule__UnorderedList__ItemsAssignment_1 ) ) ( (
				// rule__UnorderedList__ItemsAssignment_1 )* ) )
				// InternalHtmlLang.g:1110:2: ( (
				// rule__UnorderedList__ItemsAssignment_1 ) ) ( (
				// rule__UnorderedList__ItemsAssignment_1 )* )
				{
					// InternalHtmlLang.g:1110:2: ( (
					// rule__UnorderedList__ItemsAssignment_1 ) )
					// InternalHtmlLang.g:1111:3: (
					// rule__UnorderedList__ItemsAssignment_1 )
					{
						before(this.grammarAccess.getUnorderedListAccess().getItemsAssignment_1());
						// InternalHtmlLang.g:1112:3: (
						// rule__UnorderedList__ItemsAssignment_1 )
						// InternalHtmlLang.g:1112:4:
						// rule__UnorderedList__ItemsAssignment_1
						{
							pushFollow(FOLLOW_18);
							rule__UnorderedList__ItemsAssignment_1();

							this.state._fsp--;


						}

						after(this.grammarAccess.getUnorderedListAccess().getItemsAssignment_1());

					}

					// InternalHtmlLang.g:1115:2: ( (
					// rule__UnorderedList__ItemsAssignment_1 )* )
					// InternalHtmlLang.g:1116:3: (
					// rule__UnorderedList__ItemsAssignment_1 )*
					{
						before(this.grammarAccess.getUnorderedListAccess().getItemsAssignment_1());
						// InternalHtmlLang.g:1117:3: (
						// rule__UnorderedList__ItemsAssignment_1 )*
						loop7: do {
							int alt7 = 2;
							final int LA7_0 = this.input.LA(1);

							if ((LA7_0 == 21)) {
								alt7 = 1;
							}


							switch (alt7) {
								case 1:
								// InternalHtmlLang.g:1117:4:
								// rule__UnorderedList__ItemsAssignment_1
								{
									pushFollow(FOLLOW_18);
									rule__UnorderedList__ItemsAssignment_1();

									this.state._fsp--;


								}
									break;
								
								default:
									break loop7;
							}
						} while (true);

						after(this.grammarAccess.getUnorderedListAccess().getItemsAssignment_1());

					}


				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UnorderedList__Group__1__Impl"


	// $ANTLR start "rule__UnorderedList__Group__2"
	// InternalHtmlLang.g:1126:1: rule__UnorderedList__Group__2 :
	// rule__UnorderedList__Group__2__Impl ;
	public final void rule__UnorderedList__Group__2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1130:1: ( rule__UnorderedList__Group__2__Impl
			// )
			// InternalHtmlLang.g:1131:2: rule__UnorderedList__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__UnorderedList__Group__2__Impl();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UnorderedList__Group__2"


	// $ANTLR start "rule__UnorderedList__Group__2__Impl"
	// InternalHtmlLang.g:1137:1: rule__UnorderedList__Group__2__Impl : (
	// '</ul>' ) ;
	public final void rule__UnorderedList__Group__2__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1141:1: ( ( '</ul>' ) )
			// InternalHtmlLang.g:1142:1: ( '</ul>' )
			{
				// InternalHtmlLang.g:1142:1: ( '</ul>' )
				// InternalHtmlLang.g:1143:2: '</ul>'
				{
					before(this.grammarAccess.getUnorderedListAccess().getUlKeyword_2());
					match(this.input, 20, FOLLOW_2);
					after(this.grammarAccess.getUnorderedListAccess().getUlKeyword_2());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UnorderedList__Group__2__Impl"


	// $ANTLR start "rule__ListItem__Group__0"
	// InternalHtmlLang.g:1153:1: rule__ListItem__Group__0 :
	// rule__ListItem__Group__0__Impl rule__ListItem__Group__1 ;
	public final void rule__ListItem__Group__0() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1157:1: ( rule__ListItem__Group__0__Impl
			// rule__ListItem__Group__1 )
			// InternalHtmlLang.g:1158:2: rule__ListItem__Group__0__Impl
			// rule__ListItem__Group__1
			{
				pushFollow(FOLLOW_16);
				rule__ListItem__Group__0__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__ListItem__Group__1();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ListItem__Group__0"


	// $ANTLR start "rule__ListItem__Group__0__Impl"
	// InternalHtmlLang.g:1165:1: rule__ListItem__Group__0__Impl : ( () ) ;
	public final void rule__ListItem__Group__0__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1169:1: ( ( () ) )
			// InternalHtmlLang.g:1170:1: ( () )
			{
				// InternalHtmlLang.g:1170:1: ( () )
				// InternalHtmlLang.g:1171:2: ()
				{
					before(this.grammarAccess.getListItemAccess().getListItemAction_0());
					// InternalHtmlLang.g:1172:2: ()
					// InternalHtmlLang.g:1172:3:
					{
					}

					after(this.grammarAccess.getListItemAccess().getListItemAction_0());

				}


			}

		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ListItem__Group__0__Impl"


	// $ANTLR start "rule__ListItem__Group__1"
	// InternalHtmlLang.g:1180:1: rule__ListItem__Group__1 :
	// rule__ListItem__Group__1__Impl rule__ListItem__Group__2 ;
	public final void rule__ListItem__Group__1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1184:1: ( rule__ListItem__Group__1__Impl
			// rule__ListItem__Group__2 )
			// InternalHtmlLang.g:1185:2: rule__ListItem__Group__1__Impl
			// rule__ListItem__Group__2
			{
				pushFollow(FOLLOW_19);
				rule__ListItem__Group__1__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__ListItem__Group__2();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ListItem__Group__1"


	// $ANTLR start "rule__ListItem__Group__1__Impl"
	// InternalHtmlLang.g:1192:1: rule__ListItem__Group__1__Impl : ( '<li>' ) ;
	public final void rule__ListItem__Group__1__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1196:1: ( ( '<li>' ) )
			// InternalHtmlLang.g:1197:1: ( '<li>' )
			{
				// InternalHtmlLang.g:1197:1: ( '<li>' )
				// InternalHtmlLang.g:1198:2: '<li>'
				{
					before(this.grammarAccess.getListItemAccess().getLiKeyword_1());
					match(this.input, 21, FOLLOW_2);
					after(this.grammarAccess.getListItemAccess().getLiKeyword_1());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ListItem__Group__1__Impl"


	// $ANTLR start "rule__ListItem__Group__2"
	// InternalHtmlLang.g:1207:1: rule__ListItem__Group__2 :
	// rule__ListItem__Group__2__Impl rule__ListItem__Group__3 ;
	public final void rule__ListItem__Group__2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1211:1: ( rule__ListItem__Group__2__Impl
			// rule__ListItem__Group__3 )
			// InternalHtmlLang.g:1212:2: rule__ListItem__Group__2__Impl
			// rule__ListItem__Group__3
			{
				pushFollow(FOLLOW_19);
				rule__ListItem__Group__2__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__ListItem__Group__3();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ListItem__Group__2"


	// $ANTLR start "rule__ListItem__Group__2__Impl"
	// InternalHtmlLang.g:1219:1: rule__ListItem__Group__2__Impl : ( (
	// rule__ListItem__ContentsAssignment_2 )* ) ;
	public final void rule__ListItem__Group__2__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1223:1: ( ( (
			// rule__ListItem__ContentsAssignment_2 )* ) )
			// InternalHtmlLang.g:1224:1: ( (
			// rule__ListItem__ContentsAssignment_2 )* )
			{
				// InternalHtmlLang.g:1224:1: ( (
				// rule__ListItem__ContentsAssignment_2 )* )
				// InternalHtmlLang.g:1225:2: (
				// rule__ListItem__ContentsAssignment_2 )*
				{
					before(this.grammarAccess.getListItemAccess().getContentsAssignment_2());
					// InternalHtmlLang.g:1226:2: (
					// rule__ListItem__ContentsAssignment_2 )*
					loop8: do {
						int alt8 = 2;
						final int LA8_0 = this.input.LA(1);

						if ((LA8_0 == RULE_HTMLSTRING || LA8_0 == 23 || LA8_0 == 25)) {
							alt8 = 1;
						}


						switch (alt8) {
							case 1:
							// InternalHtmlLang.g:1226:3:
							// rule__ListItem__ContentsAssignment_2
							{
								pushFollow(FOLLOW_15);
								rule__ListItem__ContentsAssignment_2();

								this.state._fsp--;


							}
								break;
							
							default:
								break loop8;
						}
					} while (true);

					after(this.grammarAccess.getListItemAccess().getContentsAssignment_2());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ListItem__Group__2__Impl"


	// $ANTLR start "rule__ListItem__Group__3"
	// InternalHtmlLang.g:1234:1: rule__ListItem__Group__3 :
	// rule__ListItem__Group__3__Impl ;
	public final void rule__ListItem__Group__3() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1238:1: ( rule__ListItem__Group__3__Impl )
			// InternalHtmlLang.g:1239:2: rule__ListItem__Group__3__Impl
			{
				pushFollow(FOLLOW_2);
				rule__ListItem__Group__3__Impl();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ListItem__Group__3"


	// $ANTLR start "rule__ListItem__Group__3__Impl"
	// InternalHtmlLang.g:1245:1: rule__ListItem__Group__3__Impl : ( '</li>' ) ;
	public final void rule__ListItem__Group__3__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1249:1: ( ( '</li>' ) )
			// InternalHtmlLang.g:1250:1: ( '</li>' )
			{
				// InternalHtmlLang.g:1250:1: ( '</li>' )
				// InternalHtmlLang.g:1251:2: '</li>'
				{
					before(this.grammarAccess.getListItemAccess().getLiKeyword_3());
					match(this.input, 22, FOLLOW_2);
					after(this.grammarAccess.getListItemAccess().getLiKeyword_3());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ListItem__Group__3__Impl"


	// $ANTLR start "rule__Bold__Group__0"
	// InternalHtmlLang.g:1261:1: rule__Bold__Group__0 :
	// rule__Bold__Group__0__Impl rule__Bold__Group__1 ;
	public final void rule__Bold__Group__0() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1265:1: ( rule__Bold__Group__0__Impl
			// rule__Bold__Group__1 )
			// InternalHtmlLang.g:1266:2: rule__Bold__Group__0__Impl
			// rule__Bold__Group__1
			{
				pushFollow(FOLLOW_8);
				rule__Bold__Group__0__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Bold__Group__1();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Bold__Group__0"


	// $ANTLR start "rule__Bold__Group__0__Impl"
	// InternalHtmlLang.g:1273:1: rule__Bold__Group__0__Impl : ( '<b>' ) ;
	public final void rule__Bold__Group__0__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1277:1: ( ( '<b>' ) )
			// InternalHtmlLang.g:1278:1: ( '<b>' )
			{
				// InternalHtmlLang.g:1278:1: ( '<b>' )
				// InternalHtmlLang.g:1279:2: '<b>'
				{
					before(this.grammarAccess.getBoldAccess().getBKeyword_0());
					match(this.input, 23, FOLLOW_2);
					after(this.grammarAccess.getBoldAccess().getBKeyword_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Bold__Group__0__Impl"


	// $ANTLR start "rule__Bold__Group__1"
	// InternalHtmlLang.g:1288:1: rule__Bold__Group__1 :
	// rule__Bold__Group__1__Impl rule__Bold__Group__2 ;
	public final void rule__Bold__Group__1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1292:1: ( rule__Bold__Group__1__Impl
			// rule__Bold__Group__2 )
			// InternalHtmlLang.g:1293:2: rule__Bold__Group__1__Impl
			// rule__Bold__Group__2
			{
				pushFollow(FOLLOW_20);
				rule__Bold__Group__1__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Bold__Group__2();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Bold__Group__1"


	// $ANTLR start "rule__Bold__Group__1__Impl"
	// InternalHtmlLang.g:1300:1: rule__Bold__Group__1__Impl : ( (
	// rule__Bold__TextAssignment_1 ) ) ;
	public final void rule__Bold__Group__1__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1304:1: ( ( ( rule__Bold__TextAssignment_1 ) )
			// )
			// InternalHtmlLang.g:1305:1: ( ( rule__Bold__TextAssignment_1 ) )
			{
				// InternalHtmlLang.g:1305:1: ( ( rule__Bold__TextAssignment_1 )
				// )
				// InternalHtmlLang.g:1306:2: ( rule__Bold__TextAssignment_1 )
				{
					before(this.grammarAccess.getBoldAccess().getTextAssignment_1());
					// InternalHtmlLang.g:1307:2: ( rule__Bold__TextAssignment_1
					// )
					// InternalHtmlLang.g:1307:3: rule__Bold__TextAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__Bold__TextAssignment_1();

						this.state._fsp--;


					}

					after(this.grammarAccess.getBoldAccess().getTextAssignment_1());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Bold__Group__1__Impl"


	// $ANTLR start "rule__Bold__Group__2"
	// InternalHtmlLang.g:1315:1: rule__Bold__Group__2 :
	// rule__Bold__Group__2__Impl ;
	public final void rule__Bold__Group__2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1319:1: ( rule__Bold__Group__2__Impl )
			// InternalHtmlLang.g:1320:2: rule__Bold__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Bold__Group__2__Impl();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Bold__Group__2"


	// $ANTLR start "rule__Bold__Group__2__Impl"
	// InternalHtmlLang.g:1326:1: rule__Bold__Group__2__Impl : ( '</b>' ) ;
	public final void rule__Bold__Group__2__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1330:1: ( ( '</b>' ) )
			// InternalHtmlLang.g:1331:1: ( '</b>' )
			{
				// InternalHtmlLang.g:1331:1: ( '</b>' )
				// InternalHtmlLang.g:1332:2: '</b>'
				{
					before(this.grammarAccess.getBoldAccess().getBKeyword_2());
					match(this.input, 24, FOLLOW_2);
					after(this.grammarAccess.getBoldAccess().getBKeyword_2());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Bold__Group__2__Impl"


	// $ANTLR start "rule__Italics__Group__0"
	// InternalHtmlLang.g:1342:1: rule__Italics__Group__0 :
	// rule__Italics__Group__0__Impl rule__Italics__Group__1 ;
	public final void rule__Italics__Group__0() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1346:1: ( rule__Italics__Group__0__Impl
			// rule__Italics__Group__1 )
			// InternalHtmlLang.g:1347:2: rule__Italics__Group__0__Impl
			// rule__Italics__Group__1
			{
				pushFollow(FOLLOW_8);
				rule__Italics__Group__0__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Italics__Group__1();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Italics__Group__0"


	// $ANTLR start "rule__Italics__Group__0__Impl"
	// InternalHtmlLang.g:1354:1: rule__Italics__Group__0__Impl : ( '<i>' ) ;
	public final void rule__Italics__Group__0__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1358:1: ( ( '<i>' ) )
			// InternalHtmlLang.g:1359:1: ( '<i>' )
			{
				// InternalHtmlLang.g:1359:1: ( '<i>' )
				// InternalHtmlLang.g:1360:2: '<i>'
				{
					before(this.grammarAccess.getItalicsAccess().getIKeyword_0());
					match(this.input, 25, FOLLOW_2);
					after(this.grammarAccess.getItalicsAccess().getIKeyword_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Italics__Group__0__Impl"


	// $ANTLR start "rule__Italics__Group__1"
	// InternalHtmlLang.g:1369:1: rule__Italics__Group__1 :
	// rule__Italics__Group__1__Impl rule__Italics__Group__2 ;
	public final void rule__Italics__Group__1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1373:1: ( rule__Italics__Group__1__Impl
			// rule__Italics__Group__2 )
			// InternalHtmlLang.g:1374:2: rule__Italics__Group__1__Impl
			// rule__Italics__Group__2
			{
				pushFollow(FOLLOW_21);
				rule__Italics__Group__1__Impl();

				this.state._fsp--;

				pushFollow(FOLLOW_2);
				rule__Italics__Group__2();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Italics__Group__1"


	// $ANTLR start "rule__Italics__Group__1__Impl"
	// InternalHtmlLang.g:1381:1: rule__Italics__Group__1__Impl : ( (
	// rule__Italics__TextAssignment_1 ) ) ;
	public final void rule__Italics__Group__1__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1385:1: ( ( ( rule__Italics__TextAssignment_1
			// ) ) )
			// InternalHtmlLang.g:1386:1: ( ( rule__Italics__TextAssignment_1 )
			// )
			{
				// InternalHtmlLang.g:1386:1: ( (
				// rule__Italics__TextAssignment_1 ) )
				// InternalHtmlLang.g:1387:2: ( rule__Italics__TextAssignment_1
				// )
				{
					before(this.grammarAccess.getItalicsAccess().getTextAssignment_1());
					// InternalHtmlLang.g:1388:2: (
					// rule__Italics__TextAssignment_1 )
					// InternalHtmlLang.g:1388:3:
					// rule__Italics__TextAssignment_1
					{
						pushFollow(FOLLOW_2);
						rule__Italics__TextAssignment_1();

						this.state._fsp--;


					}

					after(this.grammarAccess.getItalicsAccess().getTextAssignment_1());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Italics__Group__1__Impl"


	// $ANTLR start "rule__Italics__Group__2"
	// InternalHtmlLang.g:1396:1: rule__Italics__Group__2 :
	// rule__Italics__Group__2__Impl ;
	public final void rule__Italics__Group__2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1400:1: ( rule__Italics__Group__2__Impl )
			// InternalHtmlLang.g:1401:2: rule__Italics__Group__2__Impl
			{
				pushFollow(FOLLOW_2);
				rule__Italics__Group__2__Impl();

				this.state._fsp--;


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Italics__Group__2"


	// $ANTLR start "rule__Italics__Group__2__Impl"
	// InternalHtmlLang.g:1407:1: rule__Italics__Group__2__Impl : ( '</i>' ) ;
	public final void rule__Italics__Group__2__Impl() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1411:1: ( ( '</i>' ) )
			// InternalHtmlLang.g:1412:1: ( '</i>' )
			{
				// InternalHtmlLang.g:1412:1: ( '</i>' )
				// InternalHtmlLang.g:1413:2: '</i>'
				{
					before(this.grammarAccess.getItalicsAccess().getIKeyword_2());
					match(this.input, 26, FOLLOW_2);
					after(this.grammarAccess.getItalicsAccess().getIKeyword_2());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Italics__Group__2__Impl"


	// $ANTLR start "rule__Html__HeadAssignment_1"
	// InternalHtmlLang.g:1423:1: rule__Html__HeadAssignment_1 : ( ruleHead ) ;
	public final void rule__Html__HeadAssignment_1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1427:1: ( ( ruleHead ) )
			// InternalHtmlLang.g:1428:2: ( ruleHead )
			{
				// InternalHtmlLang.g:1428:2: ( ruleHead )
				// InternalHtmlLang.g:1429:3: ruleHead
				{
					before(this.grammarAccess.getHtmlAccess().getHeadHeadParserRuleCall_1_0());
					pushFollow(FOLLOW_2);
					ruleHead();

					this.state._fsp--;

					after(this.grammarAccess.getHtmlAccess().getHeadHeadParserRuleCall_1_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Html__HeadAssignment_1"


	// $ANTLR start "rule__Html__BodyAssignment_2"
	// InternalHtmlLang.g:1438:1: rule__Html__BodyAssignment_2 : ( ruleBody ) ;
	public final void rule__Html__BodyAssignment_2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1442:1: ( ( ruleBody ) )
			// InternalHtmlLang.g:1443:2: ( ruleBody )
			{
				// InternalHtmlLang.g:1443:2: ( ruleBody )
				// InternalHtmlLang.g:1444:3: ruleBody
				{
					before(this.grammarAccess.getHtmlAccess().getBodyBodyParserRuleCall_2_0());
					pushFollow(FOLLOW_2);
					ruleBody();

					this.state._fsp--;

					after(this.grammarAccess.getHtmlAccess().getBodyBodyParserRuleCall_2_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Html__BodyAssignment_2"


	// $ANTLR start "rule__Head__HeadersAssignment_2"
	// InternalHtmlLang.g:1453:1: rule__Head__HeadersAssignment_2 : ( ruleHeader
	// ) ;
	public final void rule__Head__HeadersAssignment_2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1457:1: ( ( ruleHeader ) )
			// InternalHtmlLang.g:1458:2: ( ruleHeader )
			{
				// InternalHtmlLang.g:1458:2: ( ruleHeader )
				// InternalHtmlLang.g:1459:3: ruleHeader
				{
					before(this.grammarAccess.getHeadAccess().getHeadersHeaderParserRuleCall_2_0());
					pushFollow(FOLLOW_2);
					ruleHeader();

					this.state._fsp--;

					after(this.grammarAccess.getHeadAccess().getHeadersHeaderParserRuleCall_2_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Head__HeadersAssignment_2"


	// $ANTLR start "rule__Title__NameAssignment_1"
	// InternalHtmlLang.g:1468:1: rule__Title__NameAssignment_1 : (
	// RULE_HTMLSTRING ) ;
	public final void rule__Title__NameAssignment_1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1472:1: ( ( RULE_HTMLSTRING ) )
			// InternalHtmlLang.g:1473:2: ( RULE_HTMLSTRING )
			{
				// InternalHtmlLang.g:1473:2: ( RULE_HTMLSTRING )
				// InternalHtmlLang.g:1474:3: RULE_HTMLSTRING
				{
					before(this.grammarAccess.getTitleAccess().getNameHTMLSTRINGTerminalRuleCall_1_0());
					match(this.input, RULE_HTMLSTRING, FOLLOW_2);
					after(this.grammarAccess.getTitleAccess().getNameHTMLSTRINGTerminalRuleCall_1_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Title__NameAssignment_1"


	// $ANTLR start "rule__Style__StylesAssignment_1"
	// InternalHtmlLang.g:1483:1: rule__Style__StylesAssignment_1 : (
	// RULE_HTMLSTRING ) ;
	public final void rule__Style__StylesAssignment_1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1487:1: ( ( RULE_HTMLSTRING ) )
			// InternalHtmlLang.g:1488:2: ( RULE_HTMLSTRING )
			{
				// InternalHtmlLang.g:1488:2: ( RULE_HTMLSTRING )
				// InternalHtmlLang.g:1489:3: RULE_HTMLSTRING
				{
					before(this.grammarAccess.getStyleAccess().getStylesHTMLSTRINGTerminalRuleCall_1_0());
					match(this.input, RULE_HTMLSTRING, FOLLOW_2);
					after(this.grammarAccess.getStyleAccess().getStylesHTMLSTRINGTerminalRuleCall_1_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Style__StylesAssignment_1"


	// $ANTLR start "rule__Body__ContentsAssignment_2"
	// InternalHtmlLang.g:1498:1: rule__Body__ContentsAssignment_2 : (
	// ruleBodyContents ) ;
	public final void rule__Body__ContentsAssignment_2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1502:1: ( ( ruleBodyContents ) )
			// InternalHtmlLang.g:1503:2: ( ruleBodyContents )
			{
				// InternalHtmlLang.g:1503:2: ( ruleBodyContents )
				// InternalHtmlLang.g:1504:3: ruleBodyContents
				{
					before(this.grammarAccess.getBodyAccess().getContentsBodyContentsParserRuleCall_2_0());
					pushFollow(FOLLOW_2);
					ruleBodyContents();

					this.state._fsp--;

					after(this.grammarAccess.getBodyAccess().getContentsBodyContentsParserRuleCall_2_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Body__ContentsAssignment_2"


	// $ANTLR start "rule__Paragraph__ContentsAssignment_2"
	// InternalHtmlLang.g:1513:1: rule__Paragraph__ContentsAssignment_2 : (
	// ruleTextElement ) ;
	public final void rule__Paragraph__ContentsAssignment_2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1517:1: ( ( ruleTextElement ) )
			// InternalHtmlLang.g:1518:2: ( ruleTextElement )
			{
				// InternalHtmlLang.g:1518:2: ( ruleTextElement )
				// InternalHtmlLang.g:1519:3: ruleTextElement
				{
					before(this.grammarAccess.getParagraphAccess().getContentsTextElementParserRuleCall_2_0());
					pushFollow(FOLLOW_2);
					ruleTextElement();

					this.state._fsp--;

					after(this.grammarAccess.getParagraphAccess().getContentsTextElementParserRuleCall_2_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Paragraph__ContentsAssignment_2"


	// $ANTLR start "rule__UnorderedList__ItemsAssignment_1"
	// InternalHtmlLang.g:1528:1: rule__UnorderedList__ItemsAssignment_1 : (
	// ruleListItem ) ;
	public final void rule__UnorderedList__ItemsAssignment_1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1532:1: ( ( ruleListItem ) )
			// InternalHtmlLang.g:1533:2: ( ruleListItem )
			{
				// InternalHtmlLang.g:1533:2: ( ruleListItem )
				// InternalHtmlLang.g:1534:3: ruleListItem
				{
					before(this.grammarAccess.getUnorderedListAccess().getItemsListItemParserRuleCall_1_0());
					pushFollow(FOLLOW_2);
					ruleListItem();

					this.state._fsp--;

					after(this.grammarAccess.getUnorderedListAccess().getItemsListItemParserRuleCall_1_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__UnorderedList__ItemsAssignment_1"


	// $ANTLR start "rule__ListItem__ContentsAssignment_2"
	// InternalHtmlLang.g:1543:1: rule__ListItem__ContentsAssignment_2 : (
	// ruleTextElement ) ;
	public final void rule__ListItem__ContentsAssignment_2() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1547:1: ( ( ruleTextElement ) )
			// InternalHtmlLang.g:1548:2: ( ruleTextElement )
			{
				// InternalHtmlLang.g:1548:2: ( ruleTextElement )
				// InternalHtmlLang.g:1549:3: ruleTextElement
				{
					before(this.grammarAccess.getListItemAccess().getContentsTextElementParserRuleCall_2_0());
					pushFollow(FOLLOW_2);
					ruleTextElement();

					this.state._fsp--;

					after(this.grammarAccess.getListItemAccess().getContentsTextElementParserRuleCall_2_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__ListItem__ContentsAssignment_2"


	// $ANTLR start "rule__FreeformText__TextAssignment"
	// InternalHtmlLang.g:1558:1: rule__FreeformText__TextAssignment : (
	// RULE_HTMLSTRING ) ;
	public final void rule__FreeformText__TextAssignment() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1562:1: ( ( RULE_HTMLSTRING ) )
			// InternalHtmlLang.g:1563:2: ( RULE_HTMLSTRING )
			{
				// InternalHtmlLang.g:1563:2: ( RULE_HTMLSTRING )
				// InternalHtmlLang.g:1564:3: RULE_HTMLSTRING
				{
					before(this.grammarAccess.getFreeformTextAccess().getTextHTMLSTRINGTerminalRuleCall_0());
					match(this.input, RULE_HTMLSTRING, FOLLOW_2);
					after(this.grammarAccess.getFreeformTextAccess().getTextHTMLSTRINGTerminalRuleCall_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__FreeformText__TextAssignment"


	// $ANTLR start "rule__Bold__TextAssignment_1"
	// InternalHtmlLang.g:1573:1: rule__Bold__TextAssignment_1 : (
	// RULE_HTMLSTRING ) ;
	public final void rule__Bold__TextAssignment_1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1577:1: ( ( RULE_HTMLSTRING ) )
			// InternalHtmlLang.g:1578:2: ( RULE_HTMLSTRING )
			{
				// InternalHtmlLang.g:1578:2: ( RULE_HTMLSTRING )
				// InternalHtmlLang.g:1579:3: RULE_HTMLSTRING
				{
					before(this.grammarAccess.getBoldAccess().getTextHTMLSTRINGTerminalRuleCall_1_0());
					match(this.input, RULE_HTMLSTRING, FOLLOW_2);
					after(this.grammarAccess.getBoldAccess().getTextHTMLSTRINGTerminalRuleCall_1_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Bold__TextAssignment_1"


	// $ANTLR start "rule__Italics__TextAssignment_1"
	// InternalHtmlLang.g:1588:1: rule__Italics__TextAssignment_1 : (
	// RULE_HTMLSTRING ) ;
	public final void rule__Italics__TextAssignment_1() throws RecognitionException {
		
		final int stackSize = keepStackSize();

		try {
			// InternalHtmlLang.g:1592:1: ( ( RULE_HTMLSTRING ) )
			// InternalHtmlLang.g:1593:2: ( RULE_HTMLSTRING )
			{
				// InternalHtmlLang.g:1593:2: ( RULE_HTMLSTRING )
				// InternalHtmlLang.g:1594:3: RULE_HTMLSTRING
				{
					before(this.grammarAccess.getItalicsAccess().getTextHTMLSTRINGTerminalRuleCall_1_0());
					match(this.input, RULE_HTMLSTRING, FOLLOW_2);
					after(this.grammarAccess.getItalicsAccess().getTextHTMLSTRINGTerminalRuleCall_1_0());

				}


			}

		} catch (final RecognitionException re) {
			reportError(re);
			recover(this.input, re);
		} finally {
			
			restoreStackSize(stackSize);

		}
		return;
	}
	// $ANTLR end "rule__Italics__TextAssignment_1"

	// Delegated rules



	public static final BitSet FOLLOW_1 = new BitSet(new long[] { 0x0000000000000000L });
	public static final BitSet FOLLOW_2 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_3 = new BitSet(new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_4 = new BitSet(new long[] { 0x0000000000008000L });
	public static final BitSet FOLLOW_5 = new BitSet(new long[] { 0x0000000000000100L });
	public static final BitSet FOLLOW_6 = new BitSet(new long[] { 0x0000000000002C00L });
	public static final BitSet FOLLOW_7 = new BitSet(new long[] { 0x0000000000002802L });
	public static final BitSet FOLLOW_8 = new BitSet(new long[] { 0x0000000000000010L });
	public static final BitSet FOLLOW_9 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_10 = new BitSet(new long[] { 0x0000000000004000L });
	public static final BitSet FOLLOW_11 = new BitSet(new long[] { 0x00000000000B0000L });
	public static final BitSet FOLLOW_12 = new BitSet(new long[] { 0x00000000000A0002L });
	public static final BitSet FOLLOW_13 = new BitSet(new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_14 = new BitSet(new long[] { 0x0000000002840010L });
	public static final BitSet FOLLOW_15 = new BitSet(new long[] { 0x0000000002800012L });
	public static final BitSet FOLLOW_16 = new BitSet(new long[] { 0x0000000000200000L });
	public static final BitSet FOLLOW_17 = new BitSet(new long[] { 0x0000000000100000L });
	public static final BitSet FOLLOW_18 = new BitSet(new long[] { 0x0000000000200002L });
	public static final BitSet FOLLOW_19 = new BitSet(new long[] { 0x0000000002C00010L });
	public static final BitSet FOLLOW_20 = new BitSet(new long[] { 0x0000000001000000L });
	public static final BitSet FOLLOW_21 = new BitSet(new long[] { 0x0000000004000000L });

}