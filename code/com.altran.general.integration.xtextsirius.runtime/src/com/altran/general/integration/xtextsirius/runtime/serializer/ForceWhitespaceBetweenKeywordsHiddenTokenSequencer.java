package com.altran.general.integration.xtextsirius.runtime.serializer;

import java.util.List;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.sequencer.HiddenTokenSequencer;

/**
 * Workaround for
 * <a href="https://github.com/eclipse/xtext-core/issues/464">Xtext bug 464</a>.
 *
 * @author nstotz
 *
 */
@SuppressWarnings("restriction")
public class ForceWhitespaceBetweenKeywordsHiddenTokenSequencer extends HiddenTokenSequencer {
	@Override
	protected void emitHiddenTokens(final List<INode> hiddens) {
		if (hiddens != null) {
			super.emitHiddenTokens(hiddens);
		} else {
			this.delegate.acceptWhitespace(this.hiddenTokenHelper.getWhitespaceRuleFor(null, ""), "", null);
		}
	}
	
}
