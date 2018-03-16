package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeNameEditPart;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.EditPartHelper;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditPolicy;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelDescriptor;

@SuppressWarnings("restriction")
public class XtextSiriusBorderEditPartModel extends DNodeNameEditPart implements IXtextSiriusEditPartModel {

	private @NonNull XtextSiriusModelDescriptor descriptor;
	
	public XtextSiriusBorderEditPartModel(
			final @NonNull XtextSiriusModelDescriptor descriptor,
			final @NonNull View view) {
		super(view);
		this.descriptor = descriptor;
	}

	@Override
	public void performDirectEditRequest(final Request request) {
		EditPartHelper.getInstance().performDirectEditRequest(this, request, getDescriptor());
	}
	
	/**
	 * This value should never be used. Instead, use
	 * {@link #getSemanticElement()}.
	 */
	@Override
	@NonNull
	public String getEditText() {
		return "";
	}
	
	@Override
	public void setLabelText(final String text) {
		// getFigure().setText(text);
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
		return EditPartHelper.getInstance().findClosestExistingSemanticElementRecursive(resolveSemanticElement());
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new XtextSiriusDirectEditPolicy());
	}
	
	@Override
	public @NonNull XtextSiriusModelDescriptor getDescriptor() {
		return this.descriptor;
	}
}
