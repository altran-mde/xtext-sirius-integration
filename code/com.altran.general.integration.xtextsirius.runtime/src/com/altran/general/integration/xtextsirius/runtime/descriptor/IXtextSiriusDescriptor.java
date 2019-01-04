package com.altran.general.integration.xtextsirius.runtime.descriptor;

import org.eclipse.jdt.annotation.NonNull;

import com.google.inject.Injector;


public interface IXtextSiriusDescriptor {

	public @NonNull Injector getInjector();

	boolean isMultiLine();

}