/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.editor.ui.internal.cancelvalidationerror;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.sirius.editor.properties.sections.common.AbstractCheckBoxPropertySection;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

public class XtextDescriptionCancelOnValidationErrorPropertySection extends AbstractCheckBoxPropertySection {
	
	@Override
	protected String getFeatureAsText() {
		String value = new String();
		if (this.eObject.eGet(getFeature()) != null) {
			value = toBoolean(this.eObject.eGet(getFeature()).toString()).toString();
		}
		return value;
	}
	
	@Override
	protected EAttribute getFeature() {
		return XtextsiriusPackage.eINSTANCE.getIXtextDescription_CancelOnValidationError();
	}
	
	@Override
	protected String getDefaultLabelText() {
		return "Cancel on Validation Error";
	}
	
	@Override
	protected String getLabelText() {
		return getDefaultLabelText() + ":";
	}
	
	@Override
	protected boolean isEqual(final String newText) {
		boolean equal = true;
		if (toBoolean(newText) != null) {
			equal = getFeatureAsText().equals(toBoolean(newText).toString());
		} else {
			refresh();
		}
		return equal;
	}
	
	@Override
	protected Object getFeatureValue(final String newText) {
		return toBoolean(newText);
	}
	
	/**
	 * Converts the given text to the boolean it represents if applicable.
	 *
	 * @return The boolean the given text represents if applicable,
	 *         <code>null</code> otherwise.
	 */
	private Boolean toBoolean(final String text) {
		Boolean booleanValue = null;
		if (text.toLowerCase().matches("true|false")) {
			booleanValue = Boolean.parseBoolean(text);
		}
		return booleanValue;
	}
}
