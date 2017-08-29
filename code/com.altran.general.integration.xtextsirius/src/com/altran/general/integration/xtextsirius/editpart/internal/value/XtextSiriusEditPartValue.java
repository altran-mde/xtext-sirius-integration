package com.altran.general.integration.xtextsirius.editpart.internal.value;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import com.altran.general.integration.xtextsirius.editpart.internal.AXtextSiriusEditPart;

public class XtextSiriusEditPartValue extends AXtextSiriusEditPart {
	private @NonNull final String prefixText;
	private @NonNull final String suffixText;
	private String labelText;
	
	public XtextSiriusEditPartValue(final @NonNull EditPartDescriptorValue descriptor, final @NonNull View view) {
		super(descriptor, view);
		this.prefixText = descriptor.getPrefixText();
		this.suffixText = descriptor.getSuffixText();
	}
	
	@Override
	public String getEditText() {
		// this seems not right, but we get update issues otherwise
		if (this.labelText != null) {
			final String name = this.labelText;
			return name;
		}
		
		final EObject semanticElement = resolveSemanticElement();
		if (semanticElement instanceof DRepresentationElement) {
			final DRepresentationElement representationElement = (DRepresentationElement) semanticElement;
			final String name = representationElement.getName();
			return name;
		}
		
		return null;
		
	}

	@Override
	public void setLabelText(final String text) {
		this.labelText = text;
		super.setLabelText(text);
	}
	
	@Override
	protected DirectEditManager createDirectEditManager() {
		return new XtextSiriusDirectEditManagerValue(this, getInjector(), translateToStyle(), isMultiLine(),
				this.prefixText, this.suffixText);
	}
	
	@Override
	protected void setContext(final Resource arg0) {
		// TODO Auto-generated method stub

	}
}
