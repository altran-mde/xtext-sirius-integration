package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import org.eclipse.jdt.annotation.NonNull;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelDescriptor;

public class XtextSiriusDirectEditManagerModel extends XtextSiriusDirectEditManager {
	
	public XtextSiriusDirectEditManagerModel(final @NonNull IXtextAwareEditPart editPart,
			final @NonNull XtextSiriusModelDescriptor descriptor) {
		super(editPart, descriptor);
	}
	
	@Override
	protected AXtextSiriusStyledTextCellEditor createCellEditor() {
		return new XtextSiriusStyledTextCellEditorModel(getDescriptor());
	}
	
	@Override
	public @NonNull XtextSiriusModelDescriptor getDescriptor() {
		return (@NonNull XtextSiriusModelDescriptor) super.getDescriptor();
	}
}
