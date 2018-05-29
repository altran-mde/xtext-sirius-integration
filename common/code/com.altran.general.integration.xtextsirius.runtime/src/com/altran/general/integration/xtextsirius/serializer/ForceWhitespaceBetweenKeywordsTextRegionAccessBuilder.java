package com.altran.general.integration.xtextsirius.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.formatting2.regionaccess.TextRegionAccessBuilder;
import org.eclipse.xtext.formatting2.regionaccess.internal.TextRegionAccessBuildingSequencer;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.ISequenceAcceptor;

/**
 * Workaround for
 * <a href="https://github.com/eclipse/xtext-core/issues/464">Xtext bug 464</a>.
 *
 * @author nstotz
 *
 */
@SuppressWarnings("restriction")
public class ForceWhitespaceBetweenKeywordsTextRegionAccessBuilder extends TextRegionAccessBuilder {
	private TextRegionAccessBuildingSequencer fromSequencer;
	
	@Override
	public ISequenceAcceptor forSequence(final ISerializationContext ctx, final EObject root) {
		return this.fromSequencer = new ForceWhitespaceBetweenKeywordsTextRegionAccessBuildingSequencer().withRoot(ctx,
				root);
	}
	
	@Override
	public ITextRegionAccess create() {
		if (this.fromSequencer != null) {
			return this.fromSequencer.getRegionAccess();
		}
		return super.create();
	}
	
}
