package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelDescriptor;

public class XtextSiriusEditPartModel extends AXtextSiriusEditPart implements IXtextSiriusEditPartModel {

	public XtextSiriusEditPartModel(final @NonNull XtextSiriusModelDescriptor descriptor,
			final @NonNull View view) {
		super(descriptor, view);
	}
	
	@Override
	protected @NonNull DirectEditManager createDirectEditManager() {
		return new XtextSiriusDirectEditManagerModel(this, getDescriptor(),
				translateToStyle());
	}
	
	@Override
	protected void setContext(final Resource res) {
		// we don't use this API
	}

	@Override
	public @NonNull XtextSiriusModelDescriptor getDescriptor() {
		return (@NonNull XtextSiriusModelDescriptor) super.getDescriptor();
	}
}
