package com.altran.general.integration.xtextsirius.internal;

import java.util.Collection;

import org.eclipse.jdt.annotation.NonNull;

public interface IDescriptorModel extends IDescriptor {
	
	public @NonNull Collection<@NonNull String> getEditableFeatures();
	
}
