package com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeNameEditPart;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.EditPartHelper;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.IXtextSiriusAwareLabelEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.AXtextSiriusDescriptor;

@SuppressWarnings("restriction")
public class XtextSiriusNodeNameEditPart extends DNodeNameEditPart implements IXtextSiriusAwareLabelEditPart {
	private final @NonNull AXtextSiriusDescriptor descriptor;
	
	public XtextSiriusNodeNameEditPart(final @NonNull View view, final @NonNull AXtextSiriusDescriptor descriptor) {
		super(view);
		this.descriptor = descriptor;
	}
	
	@Override
	public String getEditText() {
		return EditPartHelper.getInstance().getEditText(this);
	}
	
	@Override
	public void setLabelText(final String newText) {
		EditPartHelper.getInstance().setLabelText(this, newText);
	}
	
	@Override
	public DragTracker getDragTracker(final Request request) {
		return EditPartHelper.getInstance().getDragTracker(this, request);
	}
	
	@Override
	public void performDirectEditRequest(final Request request) {
		EditPartHelper.getInstance().performDirectEditRequest(this, request);
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
}
