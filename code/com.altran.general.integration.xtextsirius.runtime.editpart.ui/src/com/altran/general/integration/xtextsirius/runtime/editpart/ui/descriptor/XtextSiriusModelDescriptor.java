/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.IXtextSiriusAwareLabelEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.model.XtextSiriusDirectEditManagerModel;
import com.google.inject.Injector;

public class XtextSiriusModelDescriptor extends AXtextSiriusDescriptor {

	private final @NonNull Set<@NonNull String> editableFeatures;
	private final @NonNull Set<@NonNull String> selectedFeatures;
	private final @NonNull Set<@NonNull String> ignoredNestedFeatures;
	
	private final @Nullable String prefixTerminalsExpression;
	private final @Nullable String suffixTerminalsExpression;

	public XtextSiriusModelDescriptor(final @NonNull Injector injector,
			final @NonNull IXtextDirectEditModelDescription description) {
		super(injector, description);
		this.editableFeatures = convertFeatureNames(description.getEditableFeatures());
		this.selectedFeatures = convertFeatureNames(description.getSelectedFeatures());
		this.ignoredNestedFeatures = description.getIgnoredNestedFeatures().stream()
				.filter(StringUtils::isNotBlank)
				.collect(Collectors.toSet());
		this.prefixTerminalsExpression = description.getPrefixTerminalsExpression();
		this.suffixTerminalsExpression = description.getSuffixTerminalsExpression();
	}
	
	protected Set<@NonNull String> convertFeatureNames(final Collection<String> featureNames) {
		return featureNames.stream()
				.filter(StringUtils::isNotBlank)
				.map(f -> StringUtils.substringAfterLast(f, "."))
				.collect(Collectors.toSet());
	}

	public @NonNull Set<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}

	public @NonNull Set<@NonNull String> getSelectedFeatures() {
		return this.selectedFeatures;
	}

	public @NonNull Set<@NonNull String> getIgnoredNestedFeatures() {
		return this.ignoredNestedFeatures;
	}
	
	@Override
	public @NonNull XtextSiriusDirectEditManager createDirectEditManager(
			final @NonNull IXtextSiriusAwareLabelEditPart editPart) {
		return new XtextSiriusDirectEditManagerModel(editPart, this);
	}
	
	public String getPrefixTerminalsExpression() {
		return this.prefixTerminalsExpression;
	}
	
	public String getSuffixTerminalsExpression() {
		return this.suffixTerminalsExpression;
	}
}
