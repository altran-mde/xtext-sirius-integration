package com.altran.general.integration.xtextsirius.internal;

import org.eclipse.jdt.annotation.NonNull;

public interface IDescriptorValue extends IDescriptor {
	
	public @NonNull String getSuffixText();
	
	public @NonNull String getPrefixText();
}
