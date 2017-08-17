package com.altran.general.integration.xtextsirius.editpart.internal.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.yakindu.base.xtext.utils.gmf.viewers.XtextStyledTextCellEditorEx;

import com.google.inject.Injector;

public class XtextSiriusStyledTextCellEditorModel extends XtextStyledTextCellEditorEx {
	private @Nullable EObject semanticElement;
	
	public XtextSiriusStyledTextCellEditorModel(final int style, final @NonNull Injector injector) {
		super(style, injector);
	}

	@Override
	protected void doSetValue(final Object value) {
		final EObject element = getSemanticElement();

		if (element == null) {
			return;
		}

		final INode node = NodeModelUtils.getNode(element);
		if (node == null) {
			return;
		}
		final ICompositeNode rootNode = node.getRootNode();
		super.doSetValue(rootNode.getText());

		getXtextAdapter().setVisibleRegion(node.getTotalOffset(), node.getTotalLength());
	}

	public void setSemanticElement(final @NonNull EObject element) {
		this.semanticElement = element;
	}
	
	protected @Nullable EObject getSemanticElement() {
		return this.semanticElement;
	}
}
