package com.altran.general.integration.xtextsirius.eef.internal.model;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

import com.altran.general.integration.xtextsirius.eef.IXtextPropertyConfiguration;
import com.altran.general.integration.xtextsirius.eef.internal.APropertyDescriptor;
import com.altran.general.integration.xtextsirius.eef.internal.AXtextSiriusEefLifecycleManager;

public class PropertyDescriptorModel extends APropertyDescriptor {
	
	public PropertyDescriptorModel(
			final @Nullable String identifier,
			final boolean multiLine,
			final @Nullable IXtextPropertyConfiguration config) {
		super(identifier, multiLine, config);
	}
	
	@Override
	public @NonNull AXtextSiriusEefLifecycleManager createEefLifecycleManager(
			final @NonNull EEFTextDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		return new XtextSiriusEefLifecycleManagerModel(this, controlDescription, variableManager, interpreter,
				contextAdapter);
	}
}
