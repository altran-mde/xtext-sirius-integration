package com.altran.general.integration.xtextsirius.editpart.internal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart;

import com.google.inject.Injector;

public abstract class AXtextSiriusEditPart extends XtextLabelEditPart implements IXtextSiriusAwareLabelEditPart {
	private final boolean multiLine;
	private final Injector injector;
	
	public AXtextSiriusEditPart(final @NonNull AEditPartDescriptor descriptor, final @NonNull View view) {
		super(view);
		this.injector = descriptor.getConfig().getInjector();
		this.multiLine = descriptor.isMultiLine();
	}
	
	protected int translateToStyle() {
		return EditPartHelper.translateToStyle(isMultiLine());
	}
	
	protected Injector getInjector() {
		return this.injector;
	}

	protected boolean isMultiLine() {
		return this.multiLine;
	}

	@Override
	public DSemanticDecorator resolveSemanticElement() {
		return (DSemanticDecorator) super.resolveSemanticElement();
	}
	
	@Override
	public @Nullable EObject getSemanticElement() {
		return resolveSemanticElement().getTarget();
	}
	
	@Override
	public @NonNull EObject getClosestExistingSemanticElement() {
		return EditPartHelper.findClosestExistingSemanticElementRecursive(resolveSemanticElement());
	}
	
	@Override
	protected void handleNotificationEvent(final Notification notification) {
		if (notification.getFeature().equals(ViewpointPackage.eINSTANCE.getDRepresentationElement_Name())) {
			updateLabelText();
		}
		super.handleNotificationEvent(notification);
	}
	
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new XtextSiriusDirectEditPolicy());
	}
}
