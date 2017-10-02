package com.altran.general.integration.xtextsirius.runtime;

import org.eclipse.jdt.annotation.NonNull;

import com.google.inject.Injector;

public interface IXtextLanguageInjector {
	public static final String EXTENSION_POINT_ID = "com.altran.general.integration.xtextsirius.runtime.xtextLanguageInjector";

	public @NonNull Injector getInjector();

}
