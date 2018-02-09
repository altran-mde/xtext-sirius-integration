package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.graphics.Color;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.ExtractedXtextSiriusEditPart;
import com.google.inject.Injector;

public class XtextSiriusCompartmentEditPart extends CompartmentEditPart {
	private final @NonNull ExtractedXtextSiriusEditPart delegate;

	public XtextSiriusCompartmentEditPart(final @NonNull View view,
			final @NonNull Injector injector, final @NonNull IXtextDirectEditDescription description) {
		super(view);
		this.delegate = new ExtractedXtextSiriusEditPart(this, injector, description);
	}
	
	@Override
	public EObject resolveSemanticElement() {
		return delegate.resolveSemanticElement();
	}
	
	protected void refreshVisuals() {
		delegate.refreshVisuals();
	}
	
	@Override
	protected void handleNotificationEvent(Notification event) {
		delegate.handleNotificationEvent(event);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		delegate.createDefaultEditPolicies();
	}
	
	@Override
	protected IFigure createFigure() {
		return delegate.createFigure();
	}
	
//	@Override
//	public IFigure getFigure() {
//		return delegate.getFigure();
//	}
	
	@Override
	protected void setFontColor(Color color) {
		delegate.setFontColor(color);
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		return delegate.getDragTracker(request);
	}
	
	@Override
	protected void performDirectEditRequest(Request request) {
		delegate.performDirectEditRequest(request);
	}
}
