package org.eclipse.xtext.example.fowlerdsl.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.formatting2.regionaccess.TextRegionAccessBuilder;
import org.eclipse.xtext.formatting2.regionaccess.internal.TextRegionAccessBuildingSequencer;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.ISequenceAcceptor;
import org.eclipse.xtext.util.Strings;

/**
 * Workaround for
 * <a href="https://github.com/eclipse/xtext-core/issues/464">Xtext bug 464</a>.
 *
 * @author nstotz
 *
 */
@SuppressWarnings("restriction")
public class InlineTextRegionAccessBuilder extends TextRegionAccessBuilder {
	private TextRegionAccessBuildingSequencer fromSequencer;
	
	@Override
	public ISequenceAcceptor forSequence(final ISerializationContext ctx, final EObject root) {
		return this.fromSequencer = new TextRegionAccessBuildingSequencer() {
			@Override
			public void acceptWhitespace(final org.eclipse.xtext.AbstractRule rule, final String token,
					final org.eclipse.xtext.nodemodel.ILeafNode node) {
				if (!Strings.isEmpty(token)) {
					super.acceptWhitespace(rule, token, node);
				} else {
					super.acceptWhitespace(rule, GrammarUtil.containedKeywords(rule).iterator().next().getValue(),
							node);
				}
			};

		}.withRoot(ctx, root);
	}
	
	@Override
	public ITextRegionAccess create() {
		if (this.fromSequencer != null) {
			return this.fromSequencer.getRegionAccess();
		}
		return super.create();
	}

}
