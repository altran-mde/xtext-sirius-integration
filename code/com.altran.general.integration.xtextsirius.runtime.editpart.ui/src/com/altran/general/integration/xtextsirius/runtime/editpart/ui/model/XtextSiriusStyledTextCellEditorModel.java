/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelEditpartDescriptor;

public class XtextSiriusStyledTextCellEditorModel extends AXtextSiriusStyledTextCellEditor {

	public XtextSiriusStyledTextCellEditorModel(final @NonNull XtextSiriusModelEditpartDescriptor descriptor) {
		super(descriptor, new XtextSiriusModelEditor(descriptor));
	}

	@Override
	protected void focusLost() {
		super.focusLost();
		getEditor().removeAllIgnoredFeatureAdapters();
	}

	public void updateSelectedRegion() {
		final TextRegion selectedRegion = getEditor().getSelectedRegion();
		if (selectedRegion != null) {
			getXtextAdapter().getXtextSourceViewer().setSelectedRange(selectedRegion.getOffset(),
					selectedRegion.getLength());
		}
	}

	@Override
	public @NonNull XtextSiriusModelEditpartDescriptor getDescriptor() {
		return (@NonNull XtextSiriusModelEditpartDescriptor) super.getDescriptor();
	}
	
	@Override
	protected XtextSiriusModelEditor getEditor() {
		return (XtextSiriusModelEditor) super.getEditor();
	}
}
