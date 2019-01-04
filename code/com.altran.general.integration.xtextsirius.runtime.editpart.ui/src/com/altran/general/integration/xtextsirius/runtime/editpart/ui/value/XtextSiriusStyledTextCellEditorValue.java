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

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusValueEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusDescribable;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusValueEditpartDescriptor;

public class XtextSiriusStyledTextCellEditorValue extends AXtextSiriusStyledTextCellEditor
		implements IXtextSiriusDescribable {
	
	private final @NonNull EStructuralFeature valueFeature;
	
	public XtextSiriusStyledTextCellEditorValue(
			final @NonNull XtextSiriusValueEditpartDescriptor descriptor, final @NonNull EStructuralFeature valueFeature) {
		super(descriptor, new XtextSiriusValueEditor(descriptor, valueFeature));
		this.valueFeature = valueFeature;
	}
	
	@Override
	public @NonNull XtextSiriusValueEditpartDescriptor getDescriptor() {
		return (@NonNull XtextSiriusValueEditpartDescriptor) super.getDescriptor();
	}
	
	protected EStructuralFeature getValueFeature() {
		return this.valueFeature;
	}
}
