package org.eclipse.xtext.example.fowlerdsl.viewpoint.xtextsirius;

import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.google.inject.Injector;

import nl.altran.example.xtext.html.ui.internal.HtmlActivator;

public class HtmlLanguageInjector implements IXtextLanguageInjector {

	@Override
	public Injector getInjector() {
		return HtmlActivator.getInstance()
				.getInjector(HtmlActivator.NL_ALTRAN_EXAMPLE_XTEXT_HTML_HTMLLANG);
	}

}
