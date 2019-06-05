/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextDirectEditManager;

import com.altran.general.integration.xtextsirius.runtime.editor.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusDescribable;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusEditpartDescriptor;

public abstract class XtextSiriusDirectEditManager extends XtextDirectEditManager implements IXtextSiriusDescribable {
	private @NonNull final IXtextSiriusEditpartDescriptor descriptor;

	public XtextSiriusDirectEditManager(
			final @NonNull IXtextAwareEditPart editPart,
			final @NonNull IXtextSiriusEditpartDescriptor descriptor) {
		super(editPart, descriptor.getInjector(), translateToStyle(descriptor));
		this.descriptor = descriptor;
	}

	private static int translateToStyle(final @NonNull IXtextSiriusEditpartDescriptor descriptor) {
		if (descriptor.isMultiLine()) {
			return SWT.MULTI | SWT.WRAP;
		} else {
			return SWT.SINGLE;
		}
	}

	@Override
	protected void initCellEditor() {
		setModelEntryPoint(EditPartHelper.getInstance().getModelEntryPoint(getEditPart()));

		super.initCellEditor();
	}

	@Override
	protected @NonNull CellEditor createCellEditorOn(final Composite composite) {
		final Composite parent = new Composite(composite, SWT.None);
		final FillLayout fillLayout = new FillLayout();
		fillLayout.marginWidth = 10;
		parent.setLayout(fillLayout);

		final AXtextSiriusStyledTextCellEditor editor = createCellEditor();
		editor.create(composite);

		return editor;
	}

	protected abstract AXtextSiriusStyledTextCellEditor createCellEditor();

	protected void setModelEntryPoint(final @NonNull ModelEntryPoint modelEntryPoint) {
		final AXtextSiriusStyledTextCellEditor cellEditor = getCellEditor();
		if (cellEditor != null) {
			cellEditor.setModelEntryPoint(modelEntryPoint);
		}

	}

	// protected void setSemanticElement(final @Nullable EObject element, final
	// @NonNull EObject fallbackContainer) {
	// final AXtextSiriusStyledTextCellEditor cellEditor = getCellEditor();
	// if (cellEditor != null) {
	// cellEditor.setSemanticElement(element);
	// if (element == null) {
	// cellEditor.setFallbackContainer(fallbackContainer);
	// }
	// }
	// }

	@Override
	protected IXtextSiriusAwareLabelEditPart getEditPart() {
		return (IXtextSiriusAwareLabelEditPart) super.getEditPart();
	}

	@Override
	protected AXtextSiriusStyledTextCellEditor getCellEditor() {
		return (AXtextSiriusStyledTextCellEditor) super.getCellEditor();
	}

	@Override
	public @NonNull IXtextSiriusEditpartDescriptor getDescriptor() {
		return this.descriptor;
	}
}
