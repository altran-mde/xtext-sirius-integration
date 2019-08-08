/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editpart.ui.value;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusValueEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusValueEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusValueEditpartDescriptor;

public class XtextSiriusStyledTextCellEditorValue extends AXtextSiriusStyledTextCellEditor
implements IXtextSiriusValueEditorCallback {

	private final @NonNull String valueFeatureName;

	public XtextSiriusStyledTextCellEditorValue(
			final @NonNull XtextSiriusValueEditpartDescriptor descriptor, final @NonNull String valueFeatureName) {
		super(descriptor, new XtextSiriusValueEditor(descriptor));
		this.valueFeatureName = valueFeatureName;
	}

	@Override
	protected void doSetValue(final Object value) {
		if (value instanceof String) {
			String newText = (String) value;
			if (StringUtils.isBlank(newText)) {
				newText = retrieveValueFromModel(newText);
			}
			
			super.doSetValue(newText);
		}
	}
	
	protected @Nullable String retrieveValueFromModel(final @Nullable String newText) {
		final EObject semanticElement = getModelEntryPoint().getSemanticElement();
		
		String result = newText;
		if (semanticElement != null) {
			final EStructuralFeature valueFeature = semanticElement.eClass()
					.getEStructuralFeature(getValueFeatureName());
			result = StringUtils.defaultString((String) semanticElement.eGet(valueFeature));
		}
		return result;
	}
	
	
	@Override
	public @NonNull XtextSiriusValueEditpartDescriptor getDescriptor() {
		return (@NonNull XtextSiriusValueEditpartDescriptor) super.getDescriptor();
	}

	@Override
	protected @NonNull String getValueFeatureName() {
		return this.valueFeatureName;
	}
}
