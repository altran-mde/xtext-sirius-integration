package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeNameEditPart;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.EditPartHelper;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.IXtextSiriusAwareLabelEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.AXtextSiriusDescriptor;

@SuppressWarnings("restriction")
public class XtextSiriusBorderEditPart extends DNodeNameEditPart implements IXtextSiriusAwareLabelEditPart {

	private @NonNull AXtextSiriusDescriptor descriptor;
	
	public XtextSiriusBorderEditPart(
			final @NonNull AXtextSiriusDescriptor descriptor,
			final @NonNull View view) {
		super(view);
		this.descriptor = descriptor;
	}

	@Override
	public String getEditText() {
		return EditPartHelper.getInstance().getEditText(this);
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
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		EditPartHelper.getInstance().createDefaultEditPolicies(this);
	}

	@Override
	public @NonNull AXtextSiriusDescriptor getDescriptor() {
		return this.descriptor;
	}
	
//	@Override
//	public @Nullable EObject getSemanticElement() {
//		return EditPartHelper.getInstance().getSemanticElement(this);
//	}
//
//	@Override
//	public @NonNull EObject getClosestExistingSemanticElement() {
//		return EditPartHelper.getInstance().findClosestExistingSemanticElementRecursive(resolveSemanticElement());
//	}

	@Override
	public void setLabelText(final String text) {
		// getFigure().setText(text);
	}
}
