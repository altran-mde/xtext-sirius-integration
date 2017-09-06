package com.altran.general.integration.xtextsirius.test;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.example.fowlerdsl.StatemachineStandaloneSetup;

import com.google.inject.Injector;

public class FowlerdslEnvironment {
	private static FowlerdslEnvironment INSTANCE;

	private final Injector fowlerdslInjector;

	private FowlerdslEnvironment() {
		this.fowlerdslInjector = new StatemachineStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public static @NonNull FowlerdslEnvironment getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new FowlerdslEnvironment();
		}

		return INSTANCE;
	}

	public @NonNull Injector getInjector() {
		return this.fowlerdslInjector;
	}

}
