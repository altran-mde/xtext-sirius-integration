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

import org.eclipse.jdt.annotation.NonNull;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusDescribable;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusValueEditpartDescriptor;

public class XtextSiriusDirectEditManagerValue extends XtextSiriusDirectEditManager
implements IXtextSiriusDescribable {
	public XtextSiriusDirectEditManagerValue(
			final @NonNull IXtextAwareEditPart editPart,
			final @NonNull XtextSiriusValueEditpartDescriptor descriptor) {
		super(editPart, descriptor);
	}

	@Override
	protected AXtextSiriusStyledTextCellEditor createCellEditor() {
		return new XtextSiriusStyledTextCellEditorValue(getDescriptor(),
				getDescriptor().getValueFeature(getEditPart()));
	}

	@Override
	public @NonNull XtextSiriusValueEditpartDescriptor getDescriptor() {
		return (@NonNull XtextSiriusValueEditpartDescriptor) super.getDescriptor();
	}
}
