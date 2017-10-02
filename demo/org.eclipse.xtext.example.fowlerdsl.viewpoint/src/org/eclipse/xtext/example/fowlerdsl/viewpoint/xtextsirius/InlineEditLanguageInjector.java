package org.eclipse.xtext.example.fowlerdsl.viewpoint.xtextsirius;

import org.eclipse.xtext.example.fowlerdsl.ui.internal.InlineEditActivator;

import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.google.inject.Injector;

public class InlineEditLanguageInjector implements IXtextLanguageInjector {

	@Override
	public Injector getInjector() {
		return InlineEditActivator.getInstance()
				.getInjector(InlineEditActivator.ORG_ECLIPSE_XTEXT_EXAMPLE_FOWLERDSL_INLINEEDIT);
	}
	
}
