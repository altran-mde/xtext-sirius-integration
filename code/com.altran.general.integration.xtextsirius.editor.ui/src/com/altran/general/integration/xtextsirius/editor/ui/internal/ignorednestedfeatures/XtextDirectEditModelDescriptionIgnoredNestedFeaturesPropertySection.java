/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.editor.ui.internal.ignorednestedfeatures;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.sirius.editor.properties.sections.common.AbstractEditorDialogPropertySection;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

public class XtextDirectEditModelDescriptionIgnoredNestedFeaturesPropertySection
extends AbstractEditorDialogPropertySection {
	
	@Override
	protected boolean isEqual(final List<?> newList) {
		return newList.equals(getValue());
	}
	
	@Override
	protected EStructuralFeature getFeature() {
		return XtextsiriusPackage.eINSTANCE.getIXtextModelDescription_IgnoredNestedFeatures();
	}
	
	protected List<?> getValue() {
		return (List<?>) this.eObject.eGet(getFeature());
	}
	
	@Override
	protected List<String> getChoiceOfValues(final List<?> currentValues) {
		return null;
	}
	
	@Override
	protected void handleFeatureModified(final List result) {
		final boolean equals = isEqual(result);
		
		if (!equals) {
			final EditingDomain editingDomain = ((IEditingDomainProvider) getPart()).getEditingDomain();
			final Object value = result;
			
			if (this.eObjectList.size() == 1) {
				// apply the property change to single selected object
				editingDomain.getCommandStack()
				.execute(SetCommand.create(editingDomain, this.eObject, getFeature(), value));
			} else {
				final CompoundCommand compoundCommand = new CompoundCommand();
				/* apply the property change to all selected elements */
				for (final Iterator<EObject> i = this.eObjectList.iterator(); i.hasNext();) {
					final EObject nextObject = i.next();
					compoundCommand.append(SetCommand.create(editingDomain, nextObject, getFeature(), value));
				}
				editingDomain.getCommandStack().execute(compoundCommand);
			}
		}
	}
	
	
	@Override
	protected String getLabelText() {
		return super.getLabelText() + ":";
	}
	
	@Override
	protected String getDefaultLabelText() {
		return "Ignored nested features";
	}
}
