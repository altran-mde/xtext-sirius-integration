package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextDirectEditManager;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.AXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusDescribable;

public class XtextSiriusDirectEditManager extends XtextDirectEditManager implements IXtextSiriusDescribable {
	private final int editorStyles;
	private @NonNull AXtextSiriusDescriptor descriptor;

	public XtextSiriusDirectEditManager(
			final @NonNull IXtextAwareEditPart editPart,
			final @NonNull AXtextSiriusDescriptor descriptor,
			final int editorStyles) {
		super(editPart, descriptor.getInjector(), editorStyles);
		this.descriptor = descriptor;
		this.editorStyles = editorStyles;
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

	@Override
	public @NonNull AXtextSiriusDescriptor getDescriptor() {
		return this.descriptor;
	}
}
