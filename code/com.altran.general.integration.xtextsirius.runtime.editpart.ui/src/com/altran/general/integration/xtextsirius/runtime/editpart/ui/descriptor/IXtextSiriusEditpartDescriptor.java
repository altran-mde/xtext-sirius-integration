package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.IXtextSiriusAwareLabelEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;


/**
 * Extends {@link IXtextSiriusDescriptor} with Sirius runtime information.
 */
public interface IXtextSiriusEditpartDescriptor extends IXtextSiriusDescriptor {

	public @NonNull XtextSiriusDirectEditManager createDirectEditManager(
			final @NonNull IXtextSiriusAwareLabelEditPart editPart);

	public @Nullable IXtextSiriusAwareLabelEditPart getEditPart();
}