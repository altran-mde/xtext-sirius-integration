package com.altran.general.integration.xtextsirius.test;

import org.eclipse.jdt.annotation.NonNull;
import org.junit.BeforeClass;

import com.google.inject.Injector;

public abstract class AInlineFowlerdslTest extends AXtextTest {
	@BeforeClass
	public static void loadFowlerds() {
		InlineFowlerdslEnvironment.getInstance();
	}
	
	@Override
	protected @NonNull Injector getInjector() {
		return InlineFowlerdslEnvironment.getInstance().getInjector();
	}
}
