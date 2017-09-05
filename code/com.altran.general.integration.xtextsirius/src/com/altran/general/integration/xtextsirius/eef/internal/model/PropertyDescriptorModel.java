package com.altran.general.integration.xtextsirius.eef.internal.model;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

import com.altran.general.integration.xtextsirius.eef.IXtextPropertyConfiguration;
import com.altran.general.integration.xtextsirius.eef.internal.APropertyDescriptor;
import com.altran.general.integration.xtextsirius.eef.internal.AXtextSiriusEefLifecycleManager;
import com.altran.general.integration.xtextsirius.internal.IDescriptorModel;

public class PropertyDescriptorModel extends APropertyDescriptor implements IDescriptorModel {
	private final @NonNull Collection<@Nullable String> editableFeatures;
	
	public PropertyDescriptorModel(
			final @Nullable String identifier,
			final boolean multiLine,
			final @Nullable IXtextPropertyConfiguration config,
			final @NonNull Collection<@Nullable String> editableFeatures) {
		super(identifier, multiLine, config);
		this.editableFeatures = editableFeatures;
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

	@Override
	public @NonNull Collection<@NonNull String> getEditableFeatures() {
		return (Set<@NonNull String>) this.editableFeatures.stream()
				.filter(f -> StringUtils.isNotBlank(f))
				.collect(Collectors.toSet());
	}
}
