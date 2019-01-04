package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.IXtextSiriusAwareLabelEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;


public interface IXtextSiriusEditpartDescriptor extends IXtextSiriusDescriptor {

	@NonNull
	XtextSiriusDirectEditManager createDirectEditManager(
			@NonNull IXtextSiriusAwareLabelEditPart editPart);
}