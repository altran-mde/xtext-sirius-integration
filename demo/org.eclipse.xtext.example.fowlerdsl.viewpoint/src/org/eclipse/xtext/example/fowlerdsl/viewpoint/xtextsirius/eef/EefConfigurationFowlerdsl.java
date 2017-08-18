package org.eclipse.xtext.example.fowlerdsl.viewpoint.xtextsirius.eef;

import org.eclipse.xtext.example.fowlerdsl.ui.internal.StatemachineActivator;

import com.altran.general.integration.xtextsirius.eef.AXtextPropertyConfiguration;
import com.google.inject.Injector;

public class EefConfigurationFowlerdsl extends AXtextPropertyConfiguration {
	
	@Override
	public Injector getInjector() {
		return StatemachineActivator.getInstance()
				.getInjector(StatemachineActivator.ORG_ECLIPSE_XTEXT_EXAMPLE_FOWLERDSL_STATEMACHINE);
	}

}
