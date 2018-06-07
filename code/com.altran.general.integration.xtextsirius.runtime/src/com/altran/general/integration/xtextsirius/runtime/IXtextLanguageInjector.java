package com.altran.general.integration.xtextsirius.runtime;

import com.google.inject.Injector;

public interface IXtextLanguageInjector {
	public static final String EXTENSION_POINT_ID = "com.altran.general.integration.xtextsirius.runtime.xtextLanguageInjector";
	
	public Injector getInjector();

	/**
	 * Whether we should use a specialized injector that avoids mandatory
	 * horizontal and vertical scrollbars.
	 *
	 * <p>
	 * By default, the Xtext embedded editor always shows horizontal and
	 * vertical scrollbars; they are disabled (greyed out) if not required. We
	 * can hide unnecessary scrollbars, but this requires a specialized injector
	 * that binds its own implementation for
	 * <tt>{@link com.google.inject.Provider Provider}<{@link org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory.Builder EmbeddedEditorFactory.Builder}></tt>.
	 * This fails if the injector already has a binding for this type.
	 * </p>
	 *
	 * @return {@code true} if we should use a specialized constructor,
	 *         {@code false} otherwise.
	 */
	default boolean useSpecializedInjectorForProperties() {
		return true;
	}
	
}
