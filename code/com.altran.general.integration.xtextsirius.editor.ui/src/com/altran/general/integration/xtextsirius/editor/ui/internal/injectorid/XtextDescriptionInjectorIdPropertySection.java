package com.altran.general.integration.xtextsirius.editor.ui.internal.injectorid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.editor.properties.sections.common.AbstractTextPropertySection;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

public class XtextDescriptionInjectorIdPropertySection extends AbstractTextPropertySection {
	
	@Override
	public EAttribute getFeature() {
		return XtextsiriusPackage.eINSTANCE.getIXtextDescription_InjectorId();
	}
	
	@Override
	protected String getDefaultLabelText() {
		return "Injector ID";
	}
	
	@Override
	protected String getLabelText() {
		return super.getLabelText() + ":";
	}
	
	@Override
	protected boolean isEqual(final String newText) {
		return getFeatureAsText().equals(newText);
	}
	
	@Override
	protected String getPropertyDescription() {
		return "";
	}
	
	@Override
	protected Object getFeatureValue(final String newText) {
		return newText;
	}
}
