package com.altran.general.integration.xtextsirius.runtime.descriptor;

import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;


public interface IXtextSiriusModelDescriptor extends IXtextSiriusDescriptor {

	public @NonNull Set<@NonNull String> getEditableFeatures();

	public @NonNull Set<@NonNull String> getSelectedFeatures();

	public @NonNull Set<@NonNull String> getIgnoredNestedFeatures();

	public @NonNull String getPrefixTerminalsExpression();

	public @NonNull String getSuffixTerminalsExpression();
}