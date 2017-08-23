package org.eclipse.xtext.example.fowlerdsl.viewpoint.xtextsirius.eef;

import com.altran.general.integration.xtextsirius.eef.AXtextPropertyConfiguration;
import com.google.inject.Injector;

import nl.altran.example.xtext.html.ui.internal.HtmlActivator;

public class EefConfigurationHtml extends AXtextPropertyConfiguration {
	
	@Override
	public Injector getInjector() {
		return HtmlActivator.getInstance()
				.getInjector(HtmlActivator.NL_ALTRAN_EXAMPLE_XTEXT_HTML_HTMLLANG);
	}
	
}
