package org.eclipse.xtext.example.fowlerdsl.viewpoint.xtextsirius.editPart;

import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.google.inject.Injector;

import nl.altran.example.xtext.html.ui.internal.HtmlActivator;

public class EditPartConfigurationHtml implements IXtextDirectEditConfiguration {
	
	@Override
	public @NonNull Injector getInjector() {
		return HtmlActivator.getInstance()
				.getInjector(HtmlActivator.NL_ALTRAN_EXAMPLE_XTEXT_HTML_HTMLLANG);
	}
	
}
