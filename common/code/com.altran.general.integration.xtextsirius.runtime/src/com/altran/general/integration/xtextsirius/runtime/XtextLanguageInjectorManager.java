package com.altran.general.integration.xtextsirius.runtime;

import java.util.Collection;
import java.util.Map;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.common.tools.api.util.EclipseUtil;

import com.google.inject.Injector;

public class XtextLanguageInjectorManager {
	/**
	 * Extension point attribute for the injector class.
	 */
	private static final String CLASS_ATTRIBUTE = "class"; //$NON-NLS-1$
	
	private static final String ID_ATTRIBUTE = "id";
	
	private static XtextLanguageInjectorManager instance;
	
	public static @NonNull XtextLanguageInjectorManager getInstance() {
		if (instance == null) {
			instance = new XtextLanguageInjectorManager();
		}
		
		return instance;
	}
	
	protected XtextLanguageInjectorManager() {
		
	}
	
	public @Nullable Injector resolveInjectorId(final @NonNull String injectorId) {
		final Map<@NonNull String, Collection<@NonNull IXtextLanguageInjector>> injectors = collectInjectors();
		return injectors.keySet().stream()
				.filter(id -> injectorId.equals(id))
				.map(id -> (@Nullable Injector) injectors.get(id).iterator().next().getInjector())
				.findAny()
				.orElse(null);
	}
	
	
	protected @NonNull Map<@NonNull String, Collection<@NonNull IXtextLanguageInjector>> collectInjectors() {
		return EclipseUtil.getExtensionPluginsByKey(IXtextLanguageInjector.class,
				IXtextLanguageInjector.EXTENSION_POINT_ID,
				XtextLanguageInjectorManager.CLASS_ATTRIBUTE, XtextLanguageInjectorManager.ID_ATTRIBUTE);
	}
}
