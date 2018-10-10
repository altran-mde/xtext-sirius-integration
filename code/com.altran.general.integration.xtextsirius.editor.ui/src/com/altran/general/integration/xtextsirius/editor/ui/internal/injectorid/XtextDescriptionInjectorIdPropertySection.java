/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
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
