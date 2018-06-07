package com.altran.general.integration.xtextsirius.runtime.editpart.ui.value;

import org.eclipse.jdt.annotation.NonNull;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusValueDescribable;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusValueDescriptor;

public class XtextSiriusDirectEditManagerValue extends XtextSiriusDirectEditManager
		implements IXtextSiriusValueDescribable {
	public XtextSiriusDirectEditManagerValue(
			final @NonNull IXtextAwareEditPart editPart,
			final @NonNull XtextSiriusValueDescriptor descriptor) {
		super(editPart, descriptor);
	}
	
	@Override
	protected AXtextSiriusStyledTextCellEditor createCellEditor() {
		return new XtextSiriusStyledTextCellEditorValue(getDescriptor(),
				getDescriptor().getValueFeature(getEditPart()));
	}
	
	@Override
	public @NonNull XtextSiriusValueDescriptor getDescriptor() {
		return (@NonNull XtextSiriusValueDescriptor) super.getDescriptor();
	}
}
