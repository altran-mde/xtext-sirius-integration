package com.altran.general.integration.xtextsirius.runtime.descriptor;

import org.eclipse.jdt.annotation.NonNull;

import com.google.inject.Injector;


/**
 * Complete configuration for one Xtext/Sirius Integration editor.
 *
 * This interface is deliberately not integrated into the EMF world (that would
 * be
 * {@link com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription})
 * to avoid stale EMF resources, memory leaks, and issues with EMF transactions.
 */
public interface IXtextSiriusDescriptor {
	
	public @NonNull Injector getInjector();
	
	boolean isMultiLine();
	
}