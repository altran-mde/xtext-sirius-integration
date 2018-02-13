package com.altran.general.integration.xtextsirius.test;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.example.fowlerdsl.InlineEditStandaloneSetup;

import com.google.inject.Injector;

public class InlineFowlerdslEnvironment {
	private static InlineFowlerdslEnvironment INSTANCE;
	
	private final Injector inlineFowlerdslInjector;
	
	private InlineFowlerdslEnvironment() {
		this.inlineFowlerdslInjector = new InlineEditStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	public static @NonNull InlineFowlerdslEnvironment getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new InlineFowlerdslEnvironment();
		}
		
		return INSTANCE;
	}
	
	public @NonNull Injector getInjector() {
		return this.inlineFowlerdslInjector;
	}
	
}
