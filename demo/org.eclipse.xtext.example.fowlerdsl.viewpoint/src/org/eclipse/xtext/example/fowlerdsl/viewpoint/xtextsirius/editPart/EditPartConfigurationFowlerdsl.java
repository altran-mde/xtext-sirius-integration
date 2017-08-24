package org.eclipse.xtext.example.fowlerdsl.viewpoint.xtextsirius.editPart;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.example.fowlerdsl.ui.internal.StatemachineActivator;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.google.inject.Injector;

public class EditPartConfigurationFowlerdsl implements IXtextDirectEditConfiguration {
	
	@Override
	public @NonNull Injector getInjector() {
		return StatemachineActivator.getInstance()
				.getInjector(StatemachineActivator.ORG_ECLIPSE_XTEXT_EXAMPLE_FOWLERDSL_STATEMACHINE);
	}

}
