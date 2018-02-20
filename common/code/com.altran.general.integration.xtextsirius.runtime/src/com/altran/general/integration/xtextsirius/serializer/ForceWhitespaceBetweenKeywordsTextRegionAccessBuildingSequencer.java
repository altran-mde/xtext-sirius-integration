package com.altran.general.integration.xtextsirius.serializer;

import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.formatting2.regionaccess.internal.TextRegionAccessBuildingSequencer;
import org.eclipse.xtext.util.Strings;

/**
 * Workaround for
 * <a href="https://github.com/eclipse/xtext-core/issues/464">Xtext bug 464</a>.
 *
 * @author nstotz
 *
 */
@SuppressWarnings("restriction")
public class ForceWhitespaceBetweenKeywordsTextRegionAccessBuildingSequencer extends TextRegionAccessBuildingSequencer {
	@Override
	public void acceptWhitespace(final org.eclipse.xtext.AbstractRule rule, final String token,
			final org.eclipse.xtext.nodemodel.ILeafNode node) {
		if (!Strings.isEmpty(token)) {
			super.acceptWhitespace(rule, token, node);
		} else {
			super.acceptWhitespace(rule, GrammarUtil.containedKeywords(rule).iterator().next().getValue(),
					node);
		}
	}
}