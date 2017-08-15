package com.altran.general.integration.xtextsirius.editpart.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.SWT;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart;

import com.google.inject.Injector;

public class XtextSiriusEditPartModel extends XtextLabelEditPart {
	
	private final boolean singleLine;
	private final Injector injector;

	public XtextSiriusEditPartModel(final Injector injector, final boolean singleLine, final View view) {
		super(view);
		this.injector = injector;
		this.singleLine = singleLine;
	}
	
	@Override
	public String getEditText() {
		final INode node = getSemanticNode();
		if (node != null) {
			return node.getText();
		}
		
		return "(empty)";
	}

	protected INode getSemanticNode() {
		final EObject semanticElement = resolveSemanticElement();
		if (semanticElement == null) {
			return null;
		}
		
		return NodeModelUtils.getNode(semanticElement);
	}
	
	@Override
	public EObject resolveSemanticElement() {
		return ((DSemanticDecorator) super.resolveSemanticElement()).getTarget();
	}
	
	@Override
	protected DirectEditManager createDirectEditManager() {
		return new XtextSiriusDirectEditManagerModel(this, this.injector,
				translateSingleLineToStyle());
	}
	
	private int translateSingleLineToStyle() {
		if (this.singleLine) {
			return (SWT.SINGLE);
		} else {
			return (SWT.MULTI | SWT.WRAP);
		}
	}
	
	@Override
	protected void setContext(final Resource arg0) {
		// TODO Auto-generated method stub

	}
	
}
