package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import org.eclipse.jdt.annotation.NonNull;

public interface IXtextSiriusValueDescribable extends IXtextSiriusDescribable {
	@Override
	public @NonNull XtextSiriusValueDescriptor getDescriptor();
}