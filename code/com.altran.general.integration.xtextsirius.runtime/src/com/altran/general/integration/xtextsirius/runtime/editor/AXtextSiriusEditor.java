/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editor;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.decider.IEditingDecider;
import com.altran.general.integration.xtextsirius.runtime.editor.decider.NullNoOpBlankDeletionEditingDecider;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.util.EcoreNavigationUtil;
import com.altran.general.integration.xtextsirius.runtime.util.EvaluateHelper;
import com.google.inject.Injector;

/**
 * Takes care of all Xtext/Sirius Integration magic.
 *
 * @param <C>
 */
public abstract class AXtextSiriusEditor<C extends IXtextSiriusEditorCallback> {
	private final MinimalModelAdjuster minModelAdjuster = new MinimalModelAdjuster();

	private final IXtextSiriusDescriptor descriptor;
	private C callback;
	
	private @NonNull IEditingDecider editingDecider = new NullNoOpBlankDeletionEditingDecider();
	
	private @Nullable ModelEntryPoint modelEntryPoint;

	public AXtextSiriusEditor(final @NonNull IXtextSiriusDescriptor descriptor) {
		this.descriptor = descriptor;
	}
	
	public abstract void initValue(final @Nullable Object initialValue);
	
	public abstract Object commit(final @NonNull EObject target) throws AXtextSiriusIssueException;

	protected abstract @Nullable Object getValueToCommit() throws AXtextSiriusIssueException;
	
	public void setCallback(final C callback) {
		this.callback = callback;
	}
	
	public void setModelEntryPoint(final @NonNull ModelEntryPoint modelEntryPoint) {
		this.modelEntryPoint = modelEntryPoint;
	}
	
	public void setEditingDecider(final @NonNull IEditingDecider editingDecider) {
		this.editingDecider = editingDecider;
	}

	public ModelEntryPoint getModelEntryPoint() {
		return this.modelEntryPoint;
	}
	
	public @NonNull IEditingDecider getEditingDecider() {
		return this.editingDecider;
	}
	
	public IXtextSiriusDescriptor getDescriptor() {
		return this.descriptor;
	}
	
	protected @Nullable EObject getSemanticElement() {
		return this.minModelAdjuster.getSemanticElement(getModelEntryPoint());
	}
	
	protected @NonNull EObject getFallbackContainer() {
		return this.minModelAdjuster.getFallbackContainer(getModelEntryPoint());
	}
	
	protected @Nullable String getValueFeatureName() {
		return getModelEntryPoint().getValueFeatureName();
	}
	
	protected void assertState() {
		Assert.isNotNull(getDescriptor(), "Descriptor is null");
		Assert.isNotNull(getInjector(), "Injector is null");
		Assert.isNotNull(getCallback(), "Callback is null");
		Assert.isNotNull(getFallbackContainer(), "FallbackContainer is null");
	}

	protected void updateCallbackInitText(final @Nullable String value, final int offset, final int length) {
		getCallback().callbackInitText(value, offset, length);
	}
	
	@Deprecated
	protected @Nullable EStructuralFeature convertValueFeature(final @Nullable String featureName) {
		return convertValueFeature(getSemanticElement(), featureName);
	}
	
	@Deprecated
	protected @Nullable EStructuralFeature convertValueFeature(final @Nullable EObject element,
			final @Nullable String featureName) {
		if (element != null) {
			if (StringUtils.isNotBlank(featureName)) {
				final EStructuralFeature result = element.eClass().getEStructuralFeature(featureName);
				if (result != null) {
					return result;
				}
			}
			return element.eContainingFeature();
		} else {
			final EObject parent = getFallbackContainer();
			if (StringUtils.isNotBlank(featureName)) {
				return parent.eClass().getEStructuralFeature(featureName);
			}
		}
		
		return null;
	}

	@Deprecated
	protected @NonNull EStructuralFeature enforceValueFeature(final @NonNull EObject fallback,
			final @Nullable String featureName) {
		final EStructuralFeature converted = convertValueFeature(featureName);
		if (converted != null) {
			return converted;
		}

		final EStructuralFeature fallbackFeature = convertValueFeature(fallback, featureName);
		if (fallbackFeature != null) {
			return fallbackFeature;
		}

		throw new IllegalArgumentException("Cannot find valueFeature " + featureName + " for " + fallback);
	}

	@Deprecated
	protected @NonNull EObject adjustTarget(final @NonNull EObject target, final @Nullable String valueFeatureName) {
		if (StringUtils.isBlank(valueFeatureName) || target.eClass().getEStructuralFeature(valueFeatureName) == null) {
			return EcoreNavigationUtil.eContainerIfExists(target);
		}
		
		return target;
	}
	
	protected @NonNull String interpret(final @NonNull String expression) {
		final EObject self = getSemanticElement();
		if (self != null) {
			return EvaluateHelper.getInstance().evaluateString(expression, self);
		}
		
		return "";
	}
	
	protected Injector getInjector() {
		return getDescriptor().getInjector();
	}
	
	protected boolean isMultiLine() {
		return getDescriptor().isMultiLine();
	}
	
	protected C getCallback() {
		return this.callback;
	}
	
	protected @Nullable String initializeText(final @Nullable Object initialValue, final @Nullable String textValue) {
		return getEditingDecider().initializeText(initialValue, textValue, this);
	}

	protected boolean isNoOp(final @Nullable String editedText) {
		return getEditingDecider().isNoOp(editedText, this);
	}
	
	protected boolean isDeletion(final @Nullable String editedText) {
		return getEditingDecider().isDeletion(editedText, this);
	}
}
