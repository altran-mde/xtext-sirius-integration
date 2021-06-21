/*
 * generated by Xtext 2.22.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.edit.services;

import com.altran.general.integration.xtextsirius.test.reflang.services.RefLangGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RefLangEditGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class XContainerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.altran.general.integration.xtextsirius.test.reflang.edit.RefLangEdit.XContainer");
		private final RuleCall cContainerParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//XContainer Container:
		//	Container;
		@Override public ParserRule getRule() { return rule; }
		
		//Container
		public RuleCall getContainerParserRuleCall() { return cContainerParserRuleCall; }
	}
	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.altran.general.integration.xtextsirius.test.reflang.edit.RefLangEdit.Reference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTargetAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cTargetIContainerContentCrossReference_1_0 = (CrossReference)cTargetAssignment_1.eContents().get(0);
		private final RuleCall cTargetIContainerContentQIDParserRuleCall_1_0_1 = (RuleCall)cTargetIContainerContentCrossReference_1_0.eContents().get(1);
		
		//@Override
		//Reference:
		//	'->' target=[IContainerContent|QID];
		@Override public ParserRule getRule() { return rule; }
		
		//'->' target=[IContainerContent|QID]
		public Group getGroup() { return cGroup; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_0() { return cHyphenMinusGreaterThanSignKeyword_0; }
		
		//target=[IContainerContent|QID]
		public Assignment getTargetAssignment_1() { return cTargetAssignment_1; }
		
		//[IContainerContent|QID]
		public CrossReference getTargetIContainerContentCrossReference_1_0() { return cTargetIContainerContentCrossReference_1_0; }
		
		//QID
		public RuleCall getTargetIContainerContentQIDParserRuleCall_1_0_1() { return cTargetIContainerContentQIDParserRuleCall_1_0_1; }
	}
	
	
	private final XContainerElements pXContainer;
	private final ReferenceElements pReference;
	
	private final Grammar grammar;
	
	private final RefLangGrammarAccess gaRefLang;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RefLangEditGrammarAccess(GrammarProvider grammarProvider,
			RefLangGrammarAccess gaRefLang,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaRefLang = gaRefLang;
		this.gaTerminals = gaTerminals;
		this.pXContainer = new XContainerElements();
		this.pReference = new ReferenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.altran.general.integration.xtextsirius.test.reflang.edit.RefLangEdit".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public RefLangGrammarAccess getRefLangGrammarAccess() {
		return gaRefLang;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//XContainer Container:
	//	Container;
	public XContainerElements getXContainerAccess() {
		return pXContainer;
	}
	
	public ParserRule getXContainerRule() {
		return getXContainerAccess().getRule();
	}
	
	//@Override
	//Reference:
	//	'->' target=[IContainerContent|QID];
	public ReferenceElements getReferenceAccess() {
		return pReference;
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}
	
	//Container:
	//	contents+=IContainerContent*;
	public RefLangGrammarAccess.ContainerElements getContainerAccess() {
		return gaRefLang.getContainerAccess();
	}
	
	public ParserRule getContainerRule() {
		return getContainerAccess().getRule();
	}
	
	//IContainerContent:
	//	SubContainer
	//	| Leaf;
	public RefLangGrammarAccess.IContainerContentElements getIContainerContentAccess() {
		return gaRefLang.getIContainerContentAccess();
	}
	
	public ParserRule getIContainerContentRule() {
		return getIContainerContentAccess().getRule();
	}
	
	//SubContainer:
	//	name=ID '{'
	//	subContents+=IContainerContent*
	//	'}'
	//	References?
	//	References2?
	//	References3?;
	public RefLangGrammarAccess.SubContainerElements getSubContainerAccess() {
		return gaRefLang.getSubContainerAccess();
	}
	
	public ParserRule getSubContainerRule() {
		return getSubContainerAccess().getRule();
	}
	
	//Leaf:
	//	name=ID
	//	References?
	//	References2?
	//	References3?;
	public RefLangGrammarAccess.LeafElements getLeafAccess() {
		return gaRefLang.getLeafAccess();
	}
	
	public ParserRule getLeafRule() {
		return getLeafAccess().getRule();
	}
	
	//fragment References:
	//	'1' references+=super::Reference*;
	public RefLangGrammarAccess.ReferencesElements getReferencesAccess() {
		return gaRefLang.getReferencesAccess();
	}
	
	public ParserRule getReferencesRule() {
		return getReferencesAccess().getRule();
	}
	
	//fragment References2:
	//	'2' references2+=super::Reference*;
	public RefLangGrammarAccess.References2Elements getReferences2Access() {
		return gaRefLang.getReferences2Access();
	}
	
	public ParserRule getReferences2Rule() {
		return getReferences2Access().getRule();
	}
	
	//fragment References3:
	//	'3' references3+=Reference3*;
	public RefLangGrammarAccess.References3Elements getReferences3Access() {
		return gaRefLang.getReferences3Access();
	}
	
	public ParserRule getReferences3Rule() {
		return getReferences3Access().getRule();
	}
	
	//Reference3:
	//	'->' target3=[IContainerContent|QID];
	public RefLangGrammarAccess.Reference3Elements getReference3Access() {
		return gaRefLang.getReference3Access();
	}
	
	public ParserRule getReference3Rule() {
		return getReference3Access().getRule();
	}
	
	//QID:
	//	ID ('.' ID)*;
	public RefLangGrammarAccess.QIDElements getQIDAccess() {
		return gaRefLang.getQIDAccess();
	}
	
	public ParserRule getQIDRule() {
		return getQIDAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
