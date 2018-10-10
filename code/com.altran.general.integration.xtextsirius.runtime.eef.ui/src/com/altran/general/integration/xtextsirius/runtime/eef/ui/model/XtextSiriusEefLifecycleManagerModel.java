/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.eef.ui.model;

import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.widgets.Composite;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextModelDescription;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.AXtextSiriusEefLifecycleManager;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.XtextSiriusController;
import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;
import com.google.inject.Injector;

public class XtextSiriusEefLifecycleManagerModel extends AXtextSiriusEefLifecycleManager {
	private final Set<@NonNull String> editableFeatures;
	private final Set<@NonNull String> ignoredNestedFeatuers;
	
	private final @Nullable String prefixTerminalsExpression;
	private final @Nullable String suffixTerminalsExpression;
	
	public XtextSiriusEefLifecycleManagerModel(
			final @NonNull Injector injector,
			final boolean shouldUseSpecializedInjector,
			final @NonNull IEefXtextModelDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(injector, shouldUseSpecializedInjector, controlDescription, variableManager, interpreter, contextAdapter);
		
		this.editableFeatures = controlDescription.getEditableFeatures().stream()
				.filter(StringUtils::isNotBlank)
				.map(e -> StringUtils.substringAfterLast(e, "."))
				.collect(Collectors.toSet());

		this.ignoredNestedFeatuers = controlDescription.getIgnoredNestedFeatures().stream()
				.filter(StringUtils::isNotBlank)
				.collect(Collectors.toSet());
		
		
		this.prefixTerminalsExpression = controlDescription.getPrefixTerminalsExpression();
		this.suffixTerminalsExpression = controlDescription.getSuffixTerminalsExpression();
	}
	
	@Override
	protected void createMainControl(final Composite parent, final IEEFFormContainer formContainer) {
		this.widget = new XtextSiriusWidgetModel(parent, getInjector(), isMultiLine());
		applyGridData(getWidget().getControl());
		
		this.controller = new XtextSiriusController(this.controlDescription, this.variableManager, this.interpreter,
				this.contextAdapter);
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
	
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		
		this.newValueConsumer = (newValue) -> {
			ModelRegionEditorPreparer preparer = null;
			URI resourceUri = null;
			
			if (newValue instanceof EObject) {
				final EObject semanticElement = (EObject) newValue;
				preparer = new ModelRegionEditorPreparer(getInjector(), semanticElement);
				
				resourceUri = semanticElement.eResource().getURI();
				
			} else if (newValue == null) {
				final EObject self = getSelf();
				if (self != null) {
					final EStructuralFeature feature = getEditFeature(self);
					if (feature != null) {
						preparer = new ModelRegionEditorPreparer(getInjector(), null, self, feature);
						
						resourceUri = self.eResource().getURI();
					}
				}
			}
			
			if (preparer != null && resourceUri != null) {
				preparer.setMultiLine(isMultiLine());
				preparer.setEditableFeatures(getEditableFeatures());
				preparer.setIgnoredNestedFeatures(getIgnoredNestedFeatures());
				
				final String prefixText = interpret(getPrefixTerminalsExpression());
				preparer.setPrefixText(prefixText);
				final String suffixText = interpret(getSuffixTerminalsExpression());
				preparer.setSuffixText(suffixText);

				getWidget().updateUri(resourceUri);
				getWidget().update(preparer.getText(), preparer.getSemanticElementLocation(), preparer.getTextRegion());
			}
			
		};
		this.controller.onNewValue(this.newValueConsumer);
		
	}
	
	private @NonNull Set<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}
	
	private @NonNull Set<@NonNull String> getIgnoredNestedFeatures() {
		return this.ignoredNestedFeatuers;
	}
	
	@SuppressWarnings("restriction")
	protected EStructuralFeature getEditFeature(final @NonNull EObject self) {
		final String PREFIX = org.eclipse.sirius.common.tools.internal.interpreter.FeatureInterpreter.PREFIX;
		
		// we're using valueExpression (instead of EditExpression) as there is
		// no field to explicitly set the editExpression in odesign model.
		final String valueExpression = getWidgetDescription().getValueExpression();
		if (StringUtils.startsWith(valueExpression, PREFIX)) {
			final String featureName = valueExpression.substring(PREFIX.length());
			final EStructuralFeature feature = self.eClass().getEStructuralFeature(featureName);
			return feature;
		}
		
		return null;
	}
	
	
	@Override
	public void aboutToBeHidden() {
		if (getWidget().isDirty()) {
			EObject semanticElement = getWidget().getSemanticElement();
			if (semanticElement != null) {
				semanticElement = FakeResourceUtil.getInstance().proxify(semanticElement, EcoreUtil.getURI(getSelf()));
			}
			
			commit(semanticElement);
		}
		super.aboutToBeHidden();
	}
	
	@Override
	public XtextSiriusWidgetModel getWidget() {
		return (XtextSiriusWidgetModel) super.getWidget();
	}
	
	protected String getPrefixTerminalsExpression() {
		return this.prefixTerminalsExpression;
	}
	
	protected String getSuffixTerminalsExpression() {
		return this.suffixTerminalsExpression;
	}
}
