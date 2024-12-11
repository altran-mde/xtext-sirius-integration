/*
 * generated by Xtext 2.22.0
 */
package com.example.classes.ide.contentassist.antlr;

import com.example.classes.ide.contentassist.antlr.internal.InternalInlineeditParser;
import com.example.classes.services.InlineeditGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class InlineeditParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(InlineeditGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, InlineeditGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getContentAccess().getAlternatives(), "rule__Content__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getBuiltInTypeAccess().getAlternatives(), "rule__BuiltInType__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
			builder.put(grammarAccess.getVisibilityAccess().getAlternatives(), "rule__Visibility__Alternatives");
			builder.put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
			builder.put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
			builder.put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getStringTypeAccess().getGroup(), "rule__StringType__Group__0");
			builder.put(grammarAccess.getIntegerTypeAccess().getGroup(), "rule__IntegerType__Group__0");
			builder.put(grammarAccess.getAssociationAccess().getNameAssignment_2(), "rule__Association__NameAssignment_2");
			builder.put(grammarAccess.getAssociationAccess().getLowerBoundAssignment_4(), "rule__Association__LowerBoundAssignment_4");
			builder.put(grammarAccess.getAssociationAccess().getUpperBoundAssignment_6(), "rule__Association__UpperBoundAssignment_6");
			builder.put(grammarAccess.getAssociationAccess().getSourceAssignment_8(), "rule__Association__SourceAssignment_8");
			builder.put(grammarAccess.getAssociationAccess().getTargetAssignment_10(), "rule__Association__TargetAssignment_10");
			builder.put(grammarAccess.getClassModelAccess().getContentAssignment(), "rule__ClassModel__ContentAssignment");
			builder.put(grammarAccess.getConstantAccess().getNameAssignment_2(), "rule__Constant__NameAssignment_2");
			builder.put(grammarAccess.getConstantAccess().getInitialAssignment_4(), "rule__Constant__InitialAssignment_4");
			builder.put(grammarAccess.getClassAccess().getNameAssignment_2(), "rule__Class__NameAssignment_2");
			builder.put(grammarAccess.getClassAccess().getSubClassesAssignment_4(), "rule__Class__SubClassesAssignment_4");
			builder.put(grammarAccess.getClassAccess().getAttributesAssignment_5(), "rule__Class__AttributesAssignment_5");
			builder.put(grammarAccess.getAttributeAccess().getVisibilityAssignment_1(), "rule__Attribute__VisibilityAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_2(), "rule__Attribute__NameAssignment_2");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_4(), "rule__Attribute__TypeAssignment_4");
			builder.put(grammarAccess.getAttributeAccess().getLowerBoundAssignment_6(), "rule__Attribute__LowerBoundAssignment_6");
			builder.put(grammarAccess.getAttributeAccess().getUpperBoundAssignment_8(), "rule__Attribute__UpperBoundAssignment_8");
			builder.put(grammarAccess.getClassRefAccess().getTargetAssignment(), "rule__ClassRef__TargetAssignment");
			builder.put(grammarAccess.getIntegerLiteralAccess().getValueAssignment(), "rule__IntegerLiteral__ValueAssignment");
			builder.put(grammarAccess.getConstantRefAccess().getTargetAssignment(), "rule__ConstantRef__TargetAssignment");
			builder.put(grammarAccess.getDescriptionAccess().getDescriptionAssignment(), "rule__Description__DescriptionAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private InlineeditGrammarAccess grammarAccess;

	@Override
	protected InternalInlineeditParser createParser() {
		InternalInlineeditParser result = new InternalInlineeditParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public InlineeditGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(InlineeditGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}