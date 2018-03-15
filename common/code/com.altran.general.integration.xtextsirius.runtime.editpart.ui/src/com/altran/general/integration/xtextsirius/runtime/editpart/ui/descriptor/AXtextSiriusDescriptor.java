package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.google.inject.Injector;

public abstract class AXtextSiriusDescriptor {
	private final @NonNull Injector injector;
	private final boolean multiLine;

	public AXtextSiriusDescriptor(final @NonNull Injector injector, final boolean multiLine) {
		this.injector = injector;
		this.multiLine = multiLine;
	}
	
	public AXtextSiriusDescriptor(final @NonNull Injector injector, final @NonNull IXtextDescription description) {
		this.injector = injector;
		this.multiLine = description.isMultiLine();
	}

	public @NonNull Injector getInjector() {
		return injector;
	}

	public boolean isMultiLine() {
		return multiLine;
	}
}
