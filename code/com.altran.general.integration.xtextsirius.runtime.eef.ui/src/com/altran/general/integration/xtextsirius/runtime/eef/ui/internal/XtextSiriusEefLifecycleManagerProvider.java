/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.eef.ui.internal;

import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription;
import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.altran.general.integration.xtextsirius.runtime.XtextLanguageInjectorManager;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusValueDescriptor;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.XtextEditorSwtStyleOverridingModule;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.model.XtextSiriusEefLifecycleManagerModel;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.value.XtextSiriusEefLifecycleManagerValue;
import com.google.inject.Injector;

public class XtextSiriusEefLifecycleManagerProvider implements IEEFLifecycleManagerProvider {

	@Override
	public boolean canHandle(final EEFControlDescription controlDescription) {
		return controlDescription instanceof IEefXtextDescription;
	}

	@Override
	public IEEFLifecycleManager getLifecycleManager(final EEFControlDescription controlDescription,
			final IVariableManager variableManager, final IInterpreter interpreter,
			final EditingContextAdapter contextAdapter) {
		if (controlDescription instanceof IEefXtextDescription) {
			final IEefXtextDescription xtextDescription = (IEefXtextDescription) controlDescription;
			final IXtextLanguageInjector languageInjector = resolveLanguageInjector(xtextDescription);
			final @NonNull Injector injector = createSpecializedInjector(languageInjector, xtextDescription);
			if (xtextDescription instanceof IEefXtextModelDescription) {
				final IEefXtextModelDescription modelDescription = (IEefXtextModelDescription) xtextDescription;
				return new XtextSiriusEefLifecycleManagerModel(
						new XtextSiriusModelDescriptor(injector, modelDescription),
						modelDescription, variableManager, interpreter, contextAdapter);
			} else if (xtextDescription instanceof IEefXtextValueDescription) {
				final IEefXtextValueDescription valueDescription = (IEefXtextValueDescription) xtextDescription;
				return new XtextSiriusEefLifecycleManagerValue(
						new XtextSiriusValueDescriptor(injector, valueDescription),
						valueDescription, variableManager, interpreter, contextAdapter);
			}
		}

		return null;
	}
	
	protected @NonNull Injector createSpecializedInjector(final @NonNull IXtextLanguageInjector languageInjector,
			final @NonNull IEefXtextDescription description) {
		if (languageInjector.useSpecializedInjectorForProperties()) {
			return languageInjector.getInjector().createChildInjector(
					new XtextEditorSwtStyleOverridingModule(translateToStyle(description)));
		} else {
			return languageInjector.getInjector();
		}
	}

	protected int translateToStyle(final IEefXtextDescription description) {
		if (description.isMultiLine()) {
			return SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER;
		} else {
			return SWT.SINGLE | SWT.BORDER;
		}
	}
	
	protected @NonNull IXtextLanguageInjector resolveLanguageInjector(final IEefXtextDescription description) {
		final IXtextLanguageInjector result = XtextLanguageInjectorManager.getInstance()
				.resolveLanguageInjector(description.getInjectorId());

		if (result == null) {
			throw new IllegalArgumentException("Cannot find Xtext Language Injector id=" + description.getInjectorId());
		}

		return result;
	}

}
