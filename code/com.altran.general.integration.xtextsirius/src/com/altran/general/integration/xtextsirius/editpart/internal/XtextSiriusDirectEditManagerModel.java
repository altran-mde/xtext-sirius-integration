package com.altran.general.integration.xtextsirius.editpart.internal;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextDirectEditManager;

import com.google.inject.Injector;

public class XtextSiriusDirectEditManagerModel extends XtextDirectEditManager {
	private final int editorStyles;
	private final Injector injector;
	
	public XtextSiriusDirectEditManagerModel(final IXtextAwareEditPart editPart, final Injector injector,
			final int editorStyles) {
		super(editPart, injector, editorStyles);
		this.injector = injector;
		this.editorStyles = editorStyles;
	}

	@Override
	protected CellEditor createCellEditorOn(final Composite composite) {
		final Composite parent = new Composite(composite, SWT.None);
		final FillLayout fillLayout = new FillLayout();
		fillLayout.marginWidth = 10;
		parent.setLayout(fillLayout);

		final XtextSiriusStyledTextCellEditorModel editor = new XtextSiriusStyledTextCellEditorModel(this.editorStyles,
				this.injector);
		editor.create(composite);

		return editor;
	}
}
