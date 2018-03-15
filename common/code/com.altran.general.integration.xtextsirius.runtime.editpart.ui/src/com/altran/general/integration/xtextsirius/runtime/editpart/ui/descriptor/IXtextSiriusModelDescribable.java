package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import org.eclipse.jdt.annotation.NonNull;

public interface IXtextSiriusModelDescribable extends IXtextSiriusDescribable {
	@Override
	public @NonNull XtextSiriusModelDescriptor getDescriptor();
}
