package com.altran.general.integration.xtextsirius.editpart.internal.value;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextDirectEditManager;

import com.google.inject.Injector;

public class XtextSiriusDirectEditManagerValue extends XtextDirectEditManager {
	private final int editorStyles;
	private final Injector injector;
	private final boolean multiLine;
	private final @NonNull String prefixText;
	private final @NonNull String suffixText;
	
	public XtextSiriusDirectEditManagerValue(
			final @NonNull IXtextAwareEditPart editPart,
			final @NonNull Injector injector,
			final int editorStyles,
			final boolean multiLine,
			final @NonNull String prefixText,
			final @NonNull String suffixText) {
		super(editPart, injector, editorStyles);
		this.injector = injector;
		this.editorStyles = editorStyles;
		this.multiLine = multiLine;
		this.prefixText = prefixText;
		this.suffixText = suffixText;
	}
	
	@Override
	protected @NonNull CellEditor createCellEditorOn(final Composite composite) {
		final Composite parent = new Composite(composite, SWT.None);
		final FillLayout fillLayout = new FillLayout();
		fillLayout.marginWidth = 10;
		parent.setLayout(fillLayout);

		final XtextSiriusStyledTextCellEditorValue editor = new XtextSiriusStyledTextCellEditorValue(this.editorStyles,
				this.injector, this.multiLine, this.prefixText, this.suffixText);
		editor.create(composite);

		return editor;
	}
}
