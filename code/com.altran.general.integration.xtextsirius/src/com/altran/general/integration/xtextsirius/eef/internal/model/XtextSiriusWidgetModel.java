package com.altran.general.integration.xtextsirius.eef.internal.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.eef.internal.AXtextSiriusWidget;
import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.google.inject.Injector;

public class XtextSiriusWidgetModel extends AXtextSiriusWidget {
	private SemanticElementLocation semanticElementLocation;

	public XtextSiriusWidgetModel(final @NonNull Composite parent, final @NonNull Injector injector) {
		super(parent, injector);
	}
	
	@SuppressWarnings("restriction")
	public void update(final @NonNull EObject newValue) {
		if (newValue.eResource() instanceof XtextResource) {
			final XtextResource xtextResource = (XtextResource) newValue.eResource();
			final ResourceSet resourceSet = xtextResource.getResourceSet();

			this.semanticElementLocation = new SemanticElementLocation(newValue);

			final ICompositeNode node = NodeModelUtils.findActualNodeFor(newValue);
			if (node != null) {
				final StringBuffer text = new StringBuffer(node.getRootNode().getTotalLength());
				final TextRegion textRegion = calculateAndAdjustEditorOffset(node, text);
				this.editorAccess.updateModel(text.toString(), state -> textRegion);
			}
		}
	}
	
	private TextRegion calculateAndAdjustEditorOffset(final ICompositeNode node, final StringBuffer text) {
		text.append(node.getRootNode().getText());

		int offset = node.getOffset();
		final int totalLength = node.getLength();

		// we need to add a newline before node, because StyledTextEditor can
		// only edit regions starting at column 0
		final String newline = "\n";
		text.insert(offset, newline);
		// this should account for different line endings
		offset += newline.length();

		return new TextRegion(offset, totalLength);
	}


}
