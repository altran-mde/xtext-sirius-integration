package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextDirectEditManager;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;
import com.google.inject.Injector;

public class XtextSiriusDirectEditManager extends XtextDirectEditManager {
	private final int editorStyles;
	private final Injector injector;
	private final boolean multiLine;

	public XtextSiriusDirectEditManager(
			final @NonNull IXtextAwareEditPart editPart,
			final @NonNull Injector injector,
			final @NonNull IXtextDirectEditDescription description) {
		super(editPart, injector, translateToStyle(description));
		this.injector = injector;
		this.editorStyles = translateToStyle(description);
		this.multiLine = description.isMultiLine();
	}

	protected static int translateToStyle(final @NonNull IXtextDirectEditDescription description) {
		return EditPartHelper.getInstance().translateToStyle(description.isMultiLine());
	}

	@Override
	protected void initCellEditor() {
		setSemanticElement(getEditPart().getSemanticElement(), getEditPart().getClosestExistingSemanticElement());

		super.initCellEditor();
	}
	
	protected void setSemanticElement(final @Nullable EObject element, final @NonNull EObject fallbackContainer) {
		final AXtextSiriusStyledTextCellEditor cellEditor = getCellEditor();
		if (cellEditor != null) {
			cellEditor.setSemanticElement(element);
			if (element == null) {
				cellEditor.setFallbackContainer(fallbackContainer);
			}
		}
	}
	
	@Override
	protected IXtextSiriusAwareLabelEditPart getEditPart() {
		return (IXtextSiriusAwareLabelEditPart) super.getEditPart();
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
