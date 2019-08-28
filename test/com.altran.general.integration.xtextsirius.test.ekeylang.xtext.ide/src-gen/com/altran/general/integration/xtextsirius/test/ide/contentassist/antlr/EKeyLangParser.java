/*
 * generated by Xtext 2.18.0.M3
 */
package com.altran.general.integration.xtextsirius.test.ide.contentassist.antlr;

import com.altran.general.integration.xtextsirius.test.ide.contentassist.antlr.internal.InternalEKeyLangParser;
import com.altran.general.integration.xtextsirius.test.services.EKeyLangGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class EKeyLangParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(EKeyLangGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EKeyLangGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getIContainerContentAccess().getAlternatives(), "rule__IContainerContent__Alternatives");
			builder.put(grammarAccess.getContainerAccess().getGroup(), "rule__Container__Group__0");
			builder.put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
			builder.put(grammarAccess.getLeafAccess().getGroup(), "rule__Leaf__Group__0");
			builder.put(grammarAccess.getContainerAccess().getNameAssignment_2(), "rule__Container__NameAssignment_2");
			builder.put(grammarAccess.getContainerAccess().getContentsAssignment_3(), "rule__Container__ContentsAssignment_3");
			builder.put(grammarAccess.getGroupAccess().getNameAssignment_1(), "rule__Group__NameAssignment_1");
			builder.put(grammarAccess.getGroupAccess().getLeafsAssignment_3(), "rule__Group__LeafsAssignment_3");
			builder.put(grammarAccess.getLeafAccess().getNameAssignment_0(), "rule__Leaf__NameAssignment_0");
			builder.put(grammarAccess.getLeafAccess().getNumberAssignment_1(), "rule__Leaf__NumberAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private EKeyLangGrammarAccess grammarAccess;

	@Override
	protected InternalEKeyLangParser createParser() {
		InternalEKeyLangParser result = new InternalEKeyLangParser(null);
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

	public EKeyLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EKeyLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
