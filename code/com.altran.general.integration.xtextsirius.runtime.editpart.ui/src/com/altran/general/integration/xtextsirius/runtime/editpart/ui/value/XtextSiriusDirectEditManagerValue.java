package com.altran.general.integration.xtextsirius.runtime.editpart.ui.value;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.google.inject.Injector;

public class XtextSiriusDirectEditManagerValue extends XtextSiriusDirectEditManager {
	private final @NonNull String prefixText;
	private final @NonNull String suffixText;
	private final @NonNull EStructuralFeature valueFeature;
	
	public XtextSiriusDirectEditManagerValue(
			final @NonNull IXtextAwareEditPart editPart,
			final @NonNull Injector injector,
			final @NonNull IXtextDirectEditValueDescription description,
			final @NonNull EStructuralFeature valueFeature) {
		super(editPart, injector, description);
		this.prefixText = description.getPrefixTextExpression();
		this.suffixText = description.getSuffixTextExpression();
		this.valueFeature = valueFeature;
	}
	
	@Override
	protected @NonNull CellEditor createCellEditorOn(final Composite composite) {
		final Composite parent = new Composite(composite, SWT.None);
		final FillLayout fillLayout = new FillLayout();
		fillLayout.marginWidth = 10;
		parent.setLayout(fillLayout);

		final XtextSiriusStyledTextCellEditorValue editor = new XtextSiriusStyledTextCellEditorValue(getEditorStyles(),
				getInjector(), isMultiLine(), this.prefixText, this.suffixText, this.valueFeature);
		editor.create(composite);

		return editor;
	}
}
