package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextDirectEditManager;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.AXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusDescribable;

public abstract class XtextSiriusDirectEditManager extends XtextDirectEditManager implements IXtextSiriusDescribable {
	private @NonNull final AXtextSiriusDescriptor descriptor;
	
	public XtextSiriusDirectEditManager(
			final @NonNull IXtextAwareEditPart editPart,
			final @NonNull AXtextSiriusDescriptor descriptor) {
		super(editPart, descriptor.getInjector(), descriptor.translateToStyle());
		this.descriptor = descriptor;
	}
	
	@Override
	protected void initCellEditor() {
		setSemanticElement(EditPartHelper.getInstance().getSemanticElement(getEditPart()),
				EditPartHelper.getInstance().getClosestExistingSemanticElement(getEditPart()));
		
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
	
	@Override
	public @NonNull AXtextSiriusDescriptor getDescriptor() {
		return this.descriptor;
	}
}
