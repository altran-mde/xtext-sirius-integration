package org.eclipse.xtext.example.fowlerdsl.viewpoint.xtextsirius;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.example.fowlerdsl.ui.internal.StatemachineActivator;

import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.google.inject.Injector;

public class FowlerdslLanguageInjector implements IXtextLanguageInjector {

	@Override
	public @NonNull Injector getInjector() {
		return StatemachineActivator.getInstance()
				.getInjector(StatemachineActivator.ORG_ECLIPSE_XTEXT_EXAMPLE_FOWLERDSL_STATEMACHINE);
	}
	
}
