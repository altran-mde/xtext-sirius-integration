package com.altran.general.integration.xtextsirius.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.junit.BeforeClass;

import com.google.inject.Injector;

public abstract class AFowlerdslTest {
	
	@BeforeClass
	public static void loadFowlerds() {
		FowlerdslEnvironment.getInstance();
	}
	
	protected static Injector getInjector() {
		return FowlerdslEnvironment.getInstance().getInjector();
	}

	protected static @NonNull Statemachine parse(final @NonNull String modelText) {
		final IParser parser = getInjector().getInstance(IParser.class);
		final IParseResult parseResult = parser.parse(new StringReader(modelText));

		assertFalse(parseResult.getSyntaxErrors().toString(), parseResult.hasSyntaxErrors());
		assertTrue("Root object in model is no statemachine", parseResult.getRootASTElement() instanceof Statemachine);

		return (Statemachine) parseResult.getRootASTElement();
	}
}
