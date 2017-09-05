package com.altran.general.integration.xtextsirius.internal;

import org.eclipse.jdt.annotation.NonNull;

public interface IDescriptor {
	
	boolean isValid();
	
	boolean isMultiLine();
	
	public @NonNull String getIdentifier();

}
