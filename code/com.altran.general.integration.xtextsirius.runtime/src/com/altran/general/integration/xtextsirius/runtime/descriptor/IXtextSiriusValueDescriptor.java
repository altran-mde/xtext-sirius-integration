package com.altran.general.integration.xtextsirius.runtime.descriptor;

import org.eclipse.jdt.annotation.NonNull;


public interface IXtextSiriusValueDescriptor extends IXtextSiriusDescriptor {

	public @NonNull String getPrefixTextExpression();

	public @NonNull String getSuffixTextExpression();

}