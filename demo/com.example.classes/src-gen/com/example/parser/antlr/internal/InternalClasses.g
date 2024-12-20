/*
 * generated by Xtext 2.22.0
 */
grammar InternalClasses;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.example.services.ClassesGrammarAccess;

}

@parser::members {

 	private ClassesGrammarAccess grammarAccess;

    public InternalClassesParser(TokenStream input, ClassesGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ClassModel";
   	}

   	@Override
   	protected ClassesGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleClassModel
entryRuleClassModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassModelRule()); }
	iv_ruleClassModel=ruleClassModel
	{ $current=$iv_ruleClassModel.current; }
	EOF;

// Rule ClassModel
ruleClassModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getClassModelAccess().getContentContentParserRuleCall_0());
			}
			lv_content_0_0=ruleContent
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getClassModelRule());
				}
				add(
					$current,
					"content",
					lv_content_0_0,
					"com.example.Classes.Content");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleContent
entryRuleContent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContentRule()); }
	iv_ruleContent=ruleContent
	{ $current=$iv_ruleContent.current; }
	EOF;

// Rule Content
ruleContent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getContentAccess().getConstantParserRuleCall_0());
		}
		this_Constant_0=ruleConstant
		{
			$current = $this_Constant_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getContentAccess().getClassParserRuleCall_1());
		}
		this_Class_1=ruleClass
		{
			$current = $this_Class_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getContentAccess().getAssociationParserRuleCall_2());
		}
		this_Association_2=ruleAssociation
		{
			$current = $this_Association_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConstant
entryRuleConstant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstantRule()); }
	iv_ruleConstant=ruleConstant
	{ $current=$iv_ruleConstant.current; }
	EOF;

// Rule Constant
ruleConstant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConstantRule());
				}
				newCompositeNode(grammarAccess.getConstantAccess().getDescriptionParserRuleCall_0());
			}
			this_Description_0=ruleDescription[$current]
			{
				$current = $this_Description_0.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_1='constant'
		{
			newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getConstantKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConstantRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConstantAccess().getInitialValueParserRuleCall_4_0());
				}
				lv_initial_4_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConstantRule());
					}
					set(
						$current,
						"initial",
						lv_initial_4_0,
						"com.example.Classes.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAssociation
entryRuleAssociation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssociationRule()); }
	iv_ruleAssociation=ruleAssociation
	{ $current=$iv_ruleAssociation.current; }
	EOF;

// Rule Association
ruleAssociation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAssociationRule());
				}
				newCompositeNode(grammarAccess.getAssociationAccess().getDescriptionParserRuleCall_0());
			}
			this_Description_0=ruleDescription[$current]
			{
				$current = $this_Description_0.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_1='association'
		{
			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociationRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getSourceClassCrossReference_3_0());
				}
			)
		)
		otherlv_4='-->'
		{
			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociationRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getTargetClassCrossReference_5_0());
				}
			)
		)
		otherlv_6='['
		{
			newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getLowerBoundValueParserRuleCall_7_0());
				}
				lv_lowerBound_7_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					set(
						$current,
						"lowerBound",
						lv_lowerBound_7_0,
						"com.example.Classes.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='..'
		{
			newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getFullStopFullStopKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getUpperBoundValueParserRuleCall_9_0());
				}
				lv_upperBound_9_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					set(
						$current,
						"upperBound",
						lv_upperBound_9_0,
						"com.example.Classes.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10=']'
		{
			newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	iv_ruleClass=ruleClass
	{ $current=$iv_ruleClass.current; }
	EOF;

// Rule Class
ruleClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getClassRule());
				}
				newCompositeNode(grammarAccess.getClassAccess().getDescriptionParserRuleCall_0());
			}
			this_Description_0=ruleDescription[$current]
			{
				$current = $this_Description_0.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_1='class'
		{
			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassAccess().getSubClassesClassParserRuleCall_4_0());
				}
				lv_subClasses_4_0=ruleClass
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassRule());
					}
					add(
						$current,
						"subClasses",
						lv_subClasses_4_0,
						"com.example.Classes.Class");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_5_0());
				}
				lv_attributes_5_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_5_0,
						"com.example.Classes.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAttributeRule());
				}
				newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionParserRuleCall_0());
			}
			this_Description_0=ruleDescription[$current]
			{
				$current = $this_Description_0.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_1_0());
				}
				lv_visibility_1_0=ruleVisibility
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"visibility",
						lv_visibility_1_0,
						"com.example.Classes.Visibility");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_4_0());
				}
				lv_type_4_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"type",
						lv_type_4_0,
						"com.example.Classes.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='['
		{
			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getLowerBoundValueParserRuleCall_6_0());
				}
				lv_lowerBound_6_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"lowerBound",
						lv_lowerBound_6_0,
						"com.example.Classes.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='..'
		{
			newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getFullStopFullStopKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getUpperBoundValueParserRuleCall_8_0());
				}
				lv_upperBound_8_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"upperBound",
						lv_upperBound_8_0,
						"com.example.Classes.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=']'
		{
			newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getBuiltInTypeParserRuleCall_0());
		}
		this_BuiltInType_0=ruleBuiltInType
		{
			$current = $this_BuiltInType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getClassRefParserRuleCall_1());
		}
		this_ClassRef_1=ruleClassRef
		{
			$current = $this_ClassRef_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBuiltInType
entryRuleBuiltInType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBuiltInTypeRule()); }
	iv_ruleBuiltInType=ruleBuiltInType
	{ $current=$iv_ruleBuiltInType.current; }
	EOF;

// Rule BuiltInType
ruleBuiltInType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getBuiltInTypeAccess().getStringTypeParserRuleCall_0());
		}
		this_StringType_0=ruleStringType
		{
			$current = $this_StringType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBuiltInTypeAccess().getIntegerTypeParserRuleCall_1());
		}
		this_IntegerType_1=ruleIntegerType
		{
			$current = $this_IntegerType_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStringType
entryRuleStringType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringTypeRule()); }
	iv_ruleStringType=ruleStringType
	{ $current=$iv_ruleStringType.current; }
	EOF;

// Rule StringType
ruleStringType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
					$current);
			}
		)
		otherlv_1='string'
		{
			newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
		}
	)
;

// Entry rule entryRuleIntegerType
entryRuleIntegerType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerTypeRule()); }
	iv_ruleIntegerType=ruleIntegerType
	{ $current=$iv_ruleIntegerType.current; }
	EOF;

// Rule IntegerType
ruleIntegerType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
					$current);
			}
		)
		otherlv_1='integer'
		{
			newLeafNode(otherlv_1, grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1());
		}
	)
;

// Entry rule entryRuleClassRef
entryRuleClassRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassRefRule()); }
	iv_ruleClassRef=ruleClassRef
	{ $current=$iv_ruleClassRef.current; }
	EOF;

// Rule ClassRef
ruleClassRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getClassRefRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getClassRefAccess().getTargetClassCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getValueAccess().getIntegerLiteralParserRuleCall_0());
		}
		this_IntegerLiteral_0=ruleIntegerLiteral
		{
			$current = $this_IntegerLiteral_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getConstantRefParserRuleCall_1());
		}
		this_ConstantRef_1=ruleConstantRef
		{
			$current = $this_ConstantRef_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerLiteralRule()); }
	iv_ruleIntegerLiteral=ruleIntegerLiteral
	{ $current=$iv_ruleIntegerLiteral.current; }
	EOF;

// Rule IntegerLiteral
ruleIntegerLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntegerLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleConstantRef
entryRuleConstantRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstantRefRule()); }
	iv_ruleConstantRef=ruleConstantRef
	{ $current=$iv_ruleConstantRef.current; }
	EOF;

// Rule ConstantRef
ruleConstantRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getConstantRefRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getConstantRefAccess().getTargetConstantCrossReference_0());
			}
		)
	)
;


// Rule Description
ruleDescription[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_description_0_0=RULE_DESCRIPTION_TEXT
			{
				newLeafNode(lv_description_0_0, grammarAccess.getDescriptionAccess().getDescriptionDESCRIPTION_TEXTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDescriptionRule());
				}
				setWithLastConsumed(
					$current,
					"description",
					lv_description_0_0,
					"com.example.Classes.DESCRIPTION_TEXT");
			}
		)
	)
;

// Rule Visibility
ruleVisibility returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='+'
			{
				$current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='public'
			{
				$current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='#'
			{
				$current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='protected'
			{
				$current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='-'
			{
				$current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='private'
			{
				$current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_5());
			}
		)
	)
;

RULE_DESCRIPTION_TEXT : '[[[' ( options {greedy=false;} : . )*']]]';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
