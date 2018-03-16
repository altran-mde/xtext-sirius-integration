package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeNameEditPart;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.EditPartHelper;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditPolicy;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelDescriptor;

@SuppressWarnings("restriction")
public class XtextSiriusEdgeNameEditPartModel extends DEdgeNameEditPart implements IXtextSiriusEditPartModel {

	private final @NonNull XtextSiriusModelDescriptor descriptor;

	public XtextSiriusEdgeNameEditPartModel(final @NonNull XtextSiriusModelDescriptor descriptor,
			final @NonNull View view) {
		super(view);
		this.descriptor = descriptor;
	}

	/**
	 * This value should never be used. Instead, use {@link #getSemanticElement()}.
	 */
	@Override
	public String getEditText() {
		return "";
	}

	@Override
	public DragTracker getDragTracker(final Request request) {
		return EditPartHelper.getInstance().getDragTracker(this, request, getDescriptor());
	}

	@Override
	public void performDirectEditRequest(final Request request) {
		EditPartHelper.getInstance().performDirectEditRequest(this, request, getDescriptor());
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
