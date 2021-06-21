/*
 * generated by Xtext 2.22.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.edit.ide.contentassist.antlr;

import com.altran.general.integration.xtextsirius.test.reflang.edit.ide.contentassist.antlr.internal.InternalRefLangEditParser;
import com.altran.general.integration.xtextsirius.test.reflang.edit.services.RefLangEditGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class RefLangEditParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RefLangEditGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RefLangEditGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getIContainerContentAccess().getAlternatives(), "rule__IContainerContent__Alternatives");
			builder.put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
			builder.put(grammarAccess.getSubContainerAccess().getGroup(), "rule__SubContainer__Group__0");
			builder.put(grammarAccess.getLeafAccess().getGroup(), "rule__Leaf__Group__0");
			builder.put(grammarAccess.getReferencesAccess().getGroup(), "rule__References__Group__0");
			builder.put(grammarAccess.getReferences2Access().getGroup(), "rule__References2__Group__0");
			builder.put(grammarAccess.getReferences3Access().getGroup(), "rule__References3__Group__0");
			builder.put(grammarAccess.getReference3Access().getGroup(), "rule__Reference3__Group__0");
			builder.put(grammarAccess.getQIDAccess().getGroup(), "rule__QID__Group__0");
			builder.put(grammarAccess.getQIDAccess().getGroup_1(), "rule__QID__Group_1__0");
			builder.put(grammarAccess.getReferenceAccess().getTargetAssignment_1(), "rule__Reference__TargetAssignment_1");
			builder.put(grammarAccess.getContainerAccess().getContentsAssignment(), "rule__Container__ContentsAssignment");
			builder.put(grammarAccess.getSubContainerAccess().getNameAssignment_0(), "rule__SubContainer__NameAssignment_0");
			builder.put(grammarAccess.getSubContainerAccess().getSubContentsAssignment_2(), "rule__SubContainer__SubContentsAssignment_2");
			builder.put(grammarAccess.getLeafAccess().getNameAssignment_0(), "rule__Leaf__NameAssignment_0");
			builder.put(grammarAccess.getReferencesAccess().getReferencesAssignment_1(), "rule__References__ReferencesAssignment_1");
			builder.put(grammarAccess.getReferences2Access().getReferences2Assignment_1(), "rule__References2__References2Assignment_1");
			builder.put(grammarAccess.getReferences3Access().getReferences3Assignment_1(), "rule__References3__References3Assignment_1");
			builder.put(grammarAccess.getReference3Access().getTarget3Assignment_1(), "rule__Reference3__Target3Assignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RefLangEditGrammarAccess grammarAccess;

	@Override
	protected InternalRefLangEditParser createParser() {
		InternalRefLangEditParser result = new InternalRefLangEditParser(null);
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

	public RefLangEditGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RefLangEditGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
