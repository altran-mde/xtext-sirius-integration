package com.altran.general.integration.xtextsirius.eef.internal.value;

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

public class PropertyDescriptorValue extends APropertyDescriptor {
	
	private final @Nullable String prefixText;
	private final @Nullable String suffixText;
	
	public PropertyDescriptorValue(
			final @Nullable String identifier,
			final boolean multiLine,
			final @Nullable IXtextPropertyConfiguration config,
			final @Nullable String prefixText,
			final @Nullable String suffixText) {
		super(identifier, multiLine, config);
		this.prefixText = prefixText;
		this.suffixText = suffixText;
	}
	
	@Override
	public @NonNull AXtextSiriusEefLifecycleManager createEefLifecycleManager(
			final @NonNull EEFTextDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		return new XtextSiriusEefLifecycleManagerValue(this, controlDescription, variableManager, interpreter,
				contextAdapter);
	}

	public @NonNull String getPrefixText() {
		return StringUtils.defaultString(this.prefixText);
	}

	public @NonNull String getSuffixText() {
		return StringUtils.defaultString(this.suffixText);
	}
}
