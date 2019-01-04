package com.altran.general.integration.xtextsirius.runtime.descriptor;

import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;


public interface IXtextSiriusModelDescriptor extends IXtextSiriusDescriptor {

	@NonNull
	Set<@NonNull String> getEditableFeatures();

	@NonNull
	Set<@NonNull String> getSelectedFeatures();

	@NonNull
	Set<@NonNull String> getIgnoredNestedFeatures();

	String getPrefixTerminalsExpression();

	String getSuffixTerminalsExpression();

}