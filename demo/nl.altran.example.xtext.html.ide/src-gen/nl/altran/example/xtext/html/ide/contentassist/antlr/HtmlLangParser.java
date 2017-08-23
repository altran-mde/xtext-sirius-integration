/*
 * generated by Xtext 2.12.0
 */
package nl.altran.example.xtext.html.ide.contentassist.antlr;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

import com.google.inject.Inject;

import nl.altran.example.xtext.html.ide.contentassist.antlr.internal.InternalHtmlLangParser;
import nl.altran.example.xtext.html.services.HtmlLangGrammarAccess;

public class HtmlLangParser extends AbstractContentAssistParser {
	
	@Inject
	private HtmlLangGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalHtmlLangParser createParser() {
		final InternalHtmlLangParser result = new InternalHtmlLangParser(null);
		result.setGrammarAccess(this.grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(final AbstractElement element) {
		if (this.nameMappings == null) {
			this.nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(HtmlLangParser.this.grammarAccess.getHeaderAccess().getAlternatives(),
							"rule__Header__Alternatives");
					put(HtmlLangParser.this.grammarAccess.getBodyContentsAccess().getAlternatives(),
							"rule__BodyContents__Alternatives");
					put(HtmlLangParser.this.grammarAccess.getTextElementAccess().getAlternatives(),
							"rule__TextElement__Alternatives");
					put(HtmlLangParser.this.grammarAccess.getHtmlAccess().getGroup(), "rule__Html__Group__0");
					put(HtmlLangParser.this.grammarAccess.getHeadAccess().getGroup(), "rule__Head__Group__0");
					put(HtmlLangParser.this.grammarAccess.getTitleAccess().getGroup(), "rule__Title__Group__0");
					put(HtmlLangParser.this.grammarAccess.getStyleAccess().getGroup(), "rule__Style__Group__0");
					put(HtmlLangParser.this.grammarAccess.getBodyAccess().getGroup(), "rule__Body__Group__0");
					put(HtmlLangParser.this.grammarAccess.getParagraphAccess().getGroup(), "rule__Paragraph__Group__0");
					put(HtmlLangParser.this.grammarAccess.getUnorderedListAccess().getGroup(),
							"rule__UnorderedList__Group__0");
					put(HtmlLangParser.this.grammarAccess.getListItemAccess().getGroup(), "rule__ListItem__Group__0");
					put(HtmlLangParser.this.grammarAccess.getBoldAccess().getGroup(), "rule__Bold__Group__0");
					put(HtmlLangParser.this.grammarAccess.getItalicsAccess().getGroup(), "rule__Italics__Group__0");
					put(HtmlLangParser.this.grammarAccess.getHtmlAccess().getHeadAssignment_1(),
							"rule__Html__HeadAssignment_1");
					put(HtmlLangParser.this.grammarAccess.getHtmlAccess().getBodyAssignment_2(),
							"rule__Html__BodyAssignment_2");
					put(HtmlLangParser.this.grammarAccess.getHeadAccess().getHeadersAssignment_2(),
							"rule__Head__HeadersAssignment_2");
					put(HtmlLangParser.this.grammarAccess.getTitleAccess().getNameAssignment_1(),
							"rule__Title__NameAssignment_1");
					put(HtmlLangParser.this.grammarAccess.getStyleAccess().getStylesAssignment_1(),
							"rule__Style__StylesAssignment_1");
					put(HtmlLangParser.this.grammarAccess.getBodyAccess().getContentsAssignment_2(),
							"rule__Body__ContentsAssignment_2");
					put(HtmlLangParser.this.grammarAccess.getParagraphAccess().getContentsAssignment_2(),
							"rule__Paragraph__ContentsAssignment_2");
					put(HtmlLangParser.this.grammarAccess.getUnorderedListAccess().getItemsAssignment_1(),
							"rule__UnorderedList__ItemsAssignment_1");
					put(HtmlLangParser.this.grammarAccess.getListItemAccess().getContentsAssignment_2(),
							"rule__ListItem__ContentsAssignment_2");
					put(HtmlLangParser.this.grammarAccess.getFreeformTextAccess().getTextAssignment(),
							"rule__FreeformText__TextAssignment");
					put(HtmlLangParser.this.grammarAccess.getBoldAccess().getTextAssignment_1(),
							"rule__Bold__TextAssignment_1");
					put(HtmlLangParser.this.grammarAccess.getItalicsAccess().getTextAssignment_1(),
							"rule__Italics__TextAssignment_1");
				}
			};
		}
		return this.nameMappings.get(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS" };
	}

	public HtmlLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(final HtmlLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}