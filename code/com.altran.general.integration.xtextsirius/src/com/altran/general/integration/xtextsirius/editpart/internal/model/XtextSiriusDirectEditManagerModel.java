package com.altran.general.integration.xtextsirius.editpart.internal.model;

import java.util.Collection;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

import com.altran.general.integration.xtextsirius.editpart.internal.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.editpart.internal.XtextSiriusDirectEditManager;
import com.google.inject.Injector;

public class XtextSiriusDirectEditManagerModel extends XtextSiriusDirectEditManager {
	private final Collection<@NonNull String> editableFeatures;

	public XtextSiriusDirectEditManagerModel(
			final @NonNull IXtextAwareEditPart editPart,
			final @NonNull Injector injector,
			final int editorStyles,
			final boolean multiLine, final Collection<@NonNull String> editableFeatures) {
		super(editPart, injector, editorStyles, multiLine);
		this.editableFeatures = editableFeatures;
	}
	
	@Override
	protected @NonNull CellEditor createCellEditorOn(final Composite composite) {
		final Composite parent = new Composite(composite, SWT.None);
		final FillLayout fillLayout = new FillLayout();
		fillLayout.marginWidth = 10;
		parent.setLayout(fillLayout);
		
		final XtextSiriusStyledTextCellEditorModel editor = new XtextSiriusStyledTextCellEditorModel(getEditorStyles(),
				getInjector(), isMultiLine(), getEditableFeatures());
		editor.create(composite);
		
		return editor;
	}

	private Collection<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}

	@Override
	protected AXtextSiriusStyledTextCellEditor getCellEditor() {
		return super.getCellEditor();
	}
}
