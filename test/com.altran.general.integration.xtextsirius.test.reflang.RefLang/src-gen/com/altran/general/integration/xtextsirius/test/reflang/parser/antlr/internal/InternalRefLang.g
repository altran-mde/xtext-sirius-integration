/*
 * generated by Xtext 2.22.0
 */
grammar InternalRefLang;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.altran.general.integration.xtextsirius.test.reflang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.altran.general.integration.xtextsirius.test.reflang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.altran.general.integration.xtextsirius.test.reflang.services.RefLangGrammarAccess;

}

@parser::members {

 	private RefLangGrammarAccess grammarAccess;

    public InternalRefLangParser(TokenStream input, RefLangGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Container";
   	}

   	@Override
   	protected RefLangGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleContainer
entryRuleContainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContainerRule()); }
	iv_ruleContainer=ruleContainer
	{ $current=$iv_ruleContainer.current; }
	EOF;

// Rule Container
ruleContainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getContainerAccess().getContentsIContainerContentParserRuleCall_0());
			}
			lv_contents_0_0=ruleIContainerContent
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getContainerRule());
				}
				add(
					$current,
					"contents",
					lv_contents_0_0,
					"com.altran.general.integration.xtextsirius.test.reflang.RefLang.IContainerContent");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleIContainerContent
entryRuleIContainerContent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIContainerContentRule()); }
	iv_ruleIContainerContent=ruleIContainerContent
	{ $current=$iv_ruleIContainerContent.current; }
	EOF;

// Rule IContainerContent
ruleIContainerContent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getIContainerContentAccess().getSubContainerParserRuleCall_0());
		}
		this_SubContainer_0=ruleSubContainer
		{
			$current = $this_SubContainer_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getIContainerContentAccess().getLeafParserRuleCall_1());
		}
		this_Leaf_1=ruleLeaf
		{
			$current = $this_Leaf_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSubContainer
entryRuleSubContainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubContainerRule()); }
	iv_ruleSubContainer=ruleSubContainer
	{ $current=$iv_ruleSubContainer.current; }
	EOF;

// Rule SubContainer
ruleSubContainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getSubContainerAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubContainerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getSubContainerAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSubContainerAccess().getSubContentsIContainerContentParserRuleCall_2_0());
				}
				lv_subContents_2_0=ruleIContainerContent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubContainerRule());
					}
					add(
						$current,
						"subContents",
						lv_subContents_2_0,
						"com.altran.general.integration.xtextsirius.test.reflang.RefLang.IContainerContent");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getSubContainerAccess().getRightCurlyBracketKeyword_3());
		}
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSubContainerRule());
				}
				newCompositeNode(grammarAccess.getSubContainerAccess().getReferencesParserRuleCall_4());
			}
			this_References_4=ruleReferences[$current]
			{
				$current = $this_References_4.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSubContainerRule());
				}
				newCompositeNode(grammarAccess.getSubContainerAccess().getReferences2ParserRuleCall_5());
			}
			this_References2_5=ruleReferences2[$current]
			{
				$current = $this_References2_5.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSubContainerRule());
				}
				newCompositeNode(grammarAccess.getSubContainerAccess().getReferences3ParserRuleCall_6());
			}
			this_References3_6=ruleReferences3[$current]
			{
				$current = $this_References3_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleLeaf
entryRuleLeaf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLeafRule()); }
	iv_ruleLeaf=ruleLeaf
	{ $current=$iv_ruleLeaf.current; }
	EOF;

// Rule Leaf
ruleLeaf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getLeafAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLeafRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLeafRule());
				}
				newCompositeNode(grammarAccess.getLeafAccess().getReferencesParserRuleCall_1());
			}
			this_References_1=ruleReferences[$current]
			{
				$current = $this_References_1.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLeafRule());
				}
				newCompositeNode(grammarAccess.getLeafAccess().getReferences2ParserRuleCall_2());
			}
			this_References2_2=ruleReferences2[$current]
			{
				$current = $this_References2_2.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLeafRule());
				}
				newCompositeNode(grammarAccess.getLeafAccess().getReferences3ParserRuleCall_3());
			}
			this_References3_3=ruleReferences3[$current]
			{
				$current = $this_References3_3.current;
				afterParserOrEnumRuleCall();
			}
		)?
	)
;


// Rule References
ruleReferences[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='1'
		{
			newLeafNode(otherlv_0, grammarAccess.getReferencesAccess().getDigitOneKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getReferencesAccess().getReferencesReferenceParserRuleCall_1_0());
				}
				lv_references_1_0=ruleReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferencesRule());
					}
					add(
						$current,
						"references",
						lv_references_1_0,
						"com.altran.general.integration.xtextsirius.test.reflang.RefLang.Reference");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleReference
entryRuleReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	iv_ruleReference=ruleReference
	{ $current=$iv_ruleReference.current; }
	EOF;

// Rule Reference
ruleReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='->'
		{
			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getHyphenMinusGreaterThanSignKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferenceRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReferenceAccess().getTargetIContainerContentCrossReference_1_0());
				}
				ruleQID
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='/'
			{
				newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getSolidusKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getReferenceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getReferenceAccess().getTarget2IContainerContentCrossReference_2_1_0());
					}
					ruleQID
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;


// Rule References2
ruleReferences2[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='2'
		{
			newLeafNode(otherlv_0, grammarAccess.getReferences2Access().getDigitTwoKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getReferences2Access().getReferences2ReferenceParserRuleCall_1_0());
				}
				lv_references2_1_0=ruleReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferences2Rule());
					}
					add(
						$current,
						"references2",
						lv_references2_1_0,
						"com.altran.general.integration.xtextsirius.test.reflang.RefLang.Reference");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;


// Rule References3
ruleReferences3[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='3'
		{
			newLeafNode(otherlv_0, grammarAccess.getReferences3Access().getDigitThreeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getReferences3Access().getReferences3Reference3ParserRuleCall_1_0());
				}
				lv_references3_1_0=ruleReference3
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReferences3Rule());
					}
					add(
						$current,
						"references3",
						lv_references3_1_0,
						"com.altran.general.integration.xtextsirius.test.reflang.RefLang.Reference3");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleReference3
entryRuleReference3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReference3Rule()); }
	iv_ruleReference3=ruleReference3
	{ $current=$iv_ruleReference3.current; }
	EOF;

// Rule Reference3
ruleReference3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='->'
		{
			newLeafNode(otherlv_0, grammarAccess.getReference3Access().getHyphenMinusGreaterThanSignKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReference3Rule());
					}
				}
				{
					newCompositeNode(grammarAccess.getReference3Access().getTarget3IContainerContentCrossReference_1_0());
				}
				ruleQID
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQID
entryRuleQID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQIDRule()); }
	iv_ruleQID=ruleQID
	{ $current=$iv_ruleQID.current.getText(); }
	EOF;

// Rule QID
ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQIDAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
