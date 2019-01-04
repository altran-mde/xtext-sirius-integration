package com.altran.general.integration.xtextsirius.runtime.descriptor;

import org.eclipse.jdt.annotation.NonNull;


public interface IXtextSiriusValueDescriptor extends IXtextSiriusDescriptor {

	@NonNull
	String getPrefixTextExpression();

	@NonNull
	String getSuffixTextExpression();

}