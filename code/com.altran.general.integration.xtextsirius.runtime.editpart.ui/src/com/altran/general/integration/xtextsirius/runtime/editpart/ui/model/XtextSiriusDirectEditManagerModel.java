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
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusDescribable;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelEditpartDescriptor;

public class XtextSiriusDirectEditManagerModel extends XtextSiriusDirectEditManager
implements IXtextSiriusDescribable {

	public XtextSiriusDirectEditManagerModel(final @NonNull IXtextAwareEditPart editPart,
			final @NonNull XtextSiriusModelEditpartDescriptor descriptor) {
		super(editPart, descriptor);
	}

	@Override
	protected AXtextSiriusStyledTextCellEditor createCellEditor() {
		return new XtextSiriusStyledTextCellEditorModel(getDescriptor());
	}

	@Override
	protected void initCellEditor() {
		super.initCellEditor();

		getCellEditor().updateSelectedRegion();
	}

	@Override
	protected XtextSiriusStyledTextCellEditorModel getCellEditor() {
		return (XtextSiriusStyledTextCellEditorModel) super.getCellEditor();
	}

	@Override
	public @NonNull XtextSiriusModelEditpartDescriptor getDescriptor() {
		return (@NonNull XtextSiriusModelEditpartDescriptor) super.getDescriptor();
	}
}
