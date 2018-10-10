/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
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

	public @Nullable IXtextLanguageInjector resolveLanguageInjector(final @NonNull String injectorId) {
		final Map<@NonNull String, Collection<@NonNull IXtextLanguageInjector>> injectors = collectInjectors();
		return injectors.keySet().stream()
				.filter(id -> injectorId.equals(id))
				.map(id -> (IXtextLanguageInjector) injectors.get(id).iterator().next())
				.findAny()
				.orElse(null);
	}

	public @Nullable Injector resolveInjectorId(final @NonNull String injectorId) {
		final IXtextLanguageInjector languageInjector = resolveLanguageInjector(injectorId);

		if (languageInjector != null) {
			return languageInjector.getInjector();
		} else {
			return null;
		}
	}

	protected @NonNull Map<@NonNull String, Collection<@NonNull IXtextLanguageInjector>> collectInjectors() {
		return EclipseUtil.getExtensionPluginsByKey(IXtextLanguageInjector.class,
				IXtextLanguageInjector.EXTENSION_POINT_ID,
				XtextLanguageInjectorManager.CLASS_ATTRIBUTE, XtextLanguageInjectorManager.ID_ATTRIBUTE);
	}
}
