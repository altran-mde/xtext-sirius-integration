package org.eclipse.xtext.example.fowlerdsl.viewpoint.xtextsirius.editPart;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.example.fowlerdsl.ui.internal.InlineEditActivator;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.google.inject.Injector;

public class EditPartConfigurationFowlerdslInlineEdit implements IXtextDirectEditConfiguration {

	@Override
	public @NonNull Injector getInjector() {
		return InlineEditActivator.getInstance()
				.getInjector(InlineEditActivator.ORG_ECLIPSE_XTEXT_EXAMPLE_FOWLERDSL_INLINEEDIT);
	}
	
}
