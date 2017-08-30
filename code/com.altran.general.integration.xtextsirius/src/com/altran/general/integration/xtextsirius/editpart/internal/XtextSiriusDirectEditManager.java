package com.altran.general.integration.xtextsirius.editpart.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextDirectEditManager;

import com.google.inject.Injector;

public class XtextSiriusDirectEditManager extends XtextDirectEditManager {
	private final int editorStyles;
	private final Injector injector;
	private final boolean multiLine;

	public XtextSiriusDirectEditManager(
			final @NonNull IXtextAwareEditPart editPart,
			final @NonNull Injector injector,
			final int editorStyles, final boolean multiLine) {
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
	
	public void setSemanticElement(final @Nullable EObject element) {
		final AXtextSiriusStyledTextCellEditor cellEditor = getCellEditor();
		if (cellEditor != null) {
			cellEditor.setSemanticElement(element);
		}
	}
	
	@Override
	protected AXtextSiriusEditPart getEditPart() {
		return (AXtextSiriusEditPart) super.getEditPart();
	}

	@Override
	protected AXtextSiriusStyledTextCellEditor getCellEditor() {
		return (AXtextSiriusStyledTextCellEditor) super.getCellEditor();
	}


	public int getEditorStyles() {
		return this.editorStyles;
	}

	public boolean isMultiLine() {
		return this.multiLine;
	}

	public Injector getInjector() {
		return this.injector;
	}

}
