package com.altran.general.integration.xtextsirius.runtime.editpart.ui.value;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusValueDescribable;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusValueDescriptor;

public class XtextSiriusDirectEditManagerValue extends XtextSiriusDirectEditManager implements IXtextSiriusValueDescribable {
	private final @NonNull EStructuralFeature valueFeature;
	
	public XtextSiriusDirectEditManagerValue(
			final @NonNull IXtextAwareEditPart editPart,
			final @NonNull XtextSiriusValueDescriptor descriptor,
			final int editorStyles,
			final @NonNull EStructuralFeature valueFeature) {
		super(editPart, descriptor, editorStyles);
		this.valueFeature = valueFeature;
	}
	
	@Override
	protected @NonNull CellEditor createCellEditorOn(final Composite composite) {
		final Composite parent = new Composite(composite, SWT.None);
		final FillLayout fillLayout = new FillLayout();
		fillLayout.marginWidth = 10;
		parent.setLayout(fillLayout);

		final XtextSiriusStyledTextCellEditorValue editor = new XtextSiriusStyledTextCellEditorValue(getEditorStyles(),
				getDescriptor(), this.valueFeature);
		editor.create(composite);

		return editor;
	}

	@Override
	public @NonNull XtextSiriusValueDescriptor getDescriptor() {
		return (@NonNull XtextSiriusValueDescriptor) super.getDescriptor();
	}
}
