package com.altran.general.integration.xtextsirius.editpart.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.yakindu.base.xtext.utils.gmf.viewers.XtextStyledTextCellEditorEx;

import com.google.inject.Injector;

public class XtextSiriusStyledTextCellEditorModel extends XtextStyledTextCellEditorEx {
	public XtextSiriusStyledTextCellEditorModel(final int style, final Injector injector) {
		super(style, injector);
	}
	
	@Override
	protected void doSetValue(final Object value) {
		final EObject rootElement = getXtextAdapter().getFakeResourceContext().getFakeResource().getContents().get(0);
		
		final ICompositeNode rootNode = NodeModelUtils.getNode(rootElement);
		if (rootNode == null) {
			return;
		}
		super.doSetValue(rootNode.getText());
		
		final INode node = null;

		getXtextAdapter().setVisibleRegion(node.getTotalOffset(), node.getTotalLength());
	}

}
