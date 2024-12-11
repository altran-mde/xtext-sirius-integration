/*
 * generated by Xtext 2.22.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.parser.antlr;

import com.altran.general.integration.xtextsirius.test.reflang.parser.antlr.internal.InternalRefLangParser;
import com.altran.general.integration.xtextsirius.test.reflang.services.RefLangGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class RefLangParser extends AbstractAntlrParser {

	@Inject
	private RefLangGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRefLangParser createParser(XtextTokenStream stream) {
		return new InternalRefLangParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Container";
	}

	public RefLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RefLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
