package com.altran.general.integration.xtextsirius.test;

import org.eclipse.jdt.annotation.NonNull;
import org.junit.BeforeClass;

import com.google.inject.Injector;

public abstract class AFowlerdslTest extends AXtextTest {
	@BeforeClass
	public static void loadFowlerds() {
		FowlerdslEnvironment.getInstance();
	}
	
	@Override
	protected @NonNull Injector getInjector() {
		return FowlerdslEnvironment.getInstance().getInjector();
	}
}
