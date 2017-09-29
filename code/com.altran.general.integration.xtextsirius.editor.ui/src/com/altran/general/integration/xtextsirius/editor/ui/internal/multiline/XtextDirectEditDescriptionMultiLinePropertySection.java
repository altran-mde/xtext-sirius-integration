package com.altran.general.integration.xtextsirius.editor.ui.internal.multiline;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.editor.properties.sections.common.AbstractRadioButtonPropertySection;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;
import com.google.common.collect.ImmutableList;

public class XtextDirectEditDescriptionMultiLinePropertySection extends AbstractRadioButtonPropertySection {

	@Override
	protected List<Boolean> getChoiceOfValues() {
		return ImmutableList.of(Boolean.FALSE, Boolean.TRUE);
	}

	@Override
	protected String getText(final Object object) {
		if (Boolean.TRUE.equals(object)) {
			return "multi-line";
		}
		return "single-line";
	}

	@Override
	protected String getFeatureAsText() {
		return getText(getValue());
	}

	@Override
	protected boolean isEqual(final int index) {
		return getFeatureValue(index).equals(getValue());
	}

	protected Boolean getValue() {
		return (Boolean) this.eObject.eGet(getFeature());
	}
	
	@Override
	protected EStructuralFeature getFeature() {
		return XtextsiriusPackage.eINSTANCE.getIXtextDirectEditDescription_MultiLine();
	}
	
	@Override
	protected Boolean getFeatureValue(final int index) {
		return index > 0;
	}
	
	@Override
	protected String getDefaultLabelText() {
		return "Lines";
	}

	@Override
	protected String getLabelText() {
		return getDefaultLabelText() + ":";
	}
}
