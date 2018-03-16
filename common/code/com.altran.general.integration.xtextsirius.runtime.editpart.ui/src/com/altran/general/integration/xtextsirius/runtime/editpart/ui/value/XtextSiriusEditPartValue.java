package com.altran.general.integration.xtextsirius.runtime.editpart.ui.value;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusValueDescribable;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusValueDescriptor;

public class XtextSiriusEditPartValue extends AXtextSiriusEditPart implements IXtextSiriusValueDescribable {
	
	public XtextSiriusEditPartValue(final @NonNull XtextSiriusValueDescriptor descriptor,
			final @NonNull View view) {
		super(descriptor, view);
	}
	
	@Override
	protected DirectEditManager createDirectEditManager() {
		final EObject semanticElement = getSemanticElement();
		if (semanticElement != null) {
			return new XtextSiriusDirectEditManagerValue(this, getDescriptor());
		}

		throw new IllegalStateException("Cannot directEdit a non-existing semanticElement");
	}
	
	@Override
	protected void setContext(final Resource arg0) {
		// we don't use this API
	}

	@Override
	public @NonNull XtextSiriusValueDescriptor getDescriptor() {
		return (@NonNull XtextSiriusValueDescriptor) super.getDescriptor();
	}
}
