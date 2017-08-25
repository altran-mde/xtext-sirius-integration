package com.altran.general.integration.xtextsirius.eef.internal.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.eef.internal.AXtextSiriusWidget;
import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.util.TextUtil;
import com.google.inject.Injector;

public class XtextSiriusWidgetModel extends AXtextSiriusWidget {
	private SemanticElementLocation semanticElementLocation;

	public XtextSiriusWidgetModel(final @NonNull Composite parent, final @NonNull Injector injector,
			final boolean multiLine) {
		super(parent, injector, multiLine);
	}
	
	@SuppressWarnings("restriction")
	public void update(final @NonNull EObject newValue) {
		if (newValue.eResource() instanceof XtextResource) {
			this.semanticElementLocation = new SemanticElementLocation(newValue);

			final ICompositeNode node = NodeModelUtils.findActualNodeFor(newValue);
			if (node != null) {
				final StringBuffer text = new StringBuffer(node.getRootNode().getTotalLength());
				final TextRegion textRegion = TextUtil.calculateAndAdjustEditorOffset(node, text, isMultiLine());
				this.editorAccess.updateModel(text.toString(), state -> textRegion);
			}
		}
	}

	@SuppressWarnings("restriction")
	public @Nullable EObject getSemanticElement() {
		final SemanticElementLocation location = getSemanticElementLocation();
		if (location != null) {
			return this.editor.getDocument().readOnly(state -> {
				return location.resolve(state);
			});
		}
		
		return null;
	}
	
	public @Nullable SemanticElementLocation getSemanticElementLocation() {
		return this.semanticElementLocation;
	}
}
