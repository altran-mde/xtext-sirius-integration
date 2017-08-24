package com.altran.general.integration.xtextsirius.editpart.internal.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextDirectEditManager;

import com.google.inject.Injector;

public class XtextSiriusDirectEditManagerModel extends XtextDirectEditManager {
	private final int editorStyles;
	private final Injector injector;
	private final boolean multiLine;

	public XtextSiriusDirectEditManagerModel(
			final @NonNull IXtextAwareEditPartModel editPart,
			final @NonNull Injector injector,
			final int editorStyles,
			final boolean multiLine) {
		super(editPart, injector, editorStyles);
		this.injector = injector;
		this.editorStyles = editorStyles;
		this.multiLine = multiLine;
	}
	
	@Override
	protected void initCellEditor() {
		setSemanticElement(getEditPart().getSemanticElement());

		super.initCellEditor();
	}

	public void setSemanticElement(final @NonNull EObject element) {
		final XtextSiriusStyledTextCellEditorModel cellEditor = getCellEditor();
		if (cellEditor == null) {
			return;
		}

		cellEditor.setSemanticElement(element);
	}

	@Override
	protected IXtextAwareEditPartModel getEditPart() {
		return (IXtextAwareEditPartModel) super.getEditPart();
	}

	@Override
	protected XtextSiriusStyledTextCellEditorModel getCellEditor() {
		return (XtextSiriusStyledTextCellEditorModel) super.getCellEditor();
	}

	@Override
	protected @NonNull CellEditor createCellEditorOn(final Composite composite) {
		final Composite parent = new Composite(composite, SWT.None);
		final FillLayout fillLayout = new FillLayout();
		fillLayout.marginWidth = 10;
		parent.setLayout(fillLayout);
		
		final XtextSiriusStyledTextCellEditorModel editor = new XtextSiriusStyledTextCellEditorModel(this.editorStyles,
				this.injector, this.multiLine);
		editor.create(composite);
		
		return editor;
	}
}
