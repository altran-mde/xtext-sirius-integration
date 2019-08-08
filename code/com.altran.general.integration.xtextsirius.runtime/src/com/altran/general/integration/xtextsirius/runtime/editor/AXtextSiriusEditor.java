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

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.decider.IEditingDecider;
import com.altran.general.integration.xtextsirius.runtime.editor.decider.NullNoOpBlankDeletionEditingDecider;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.IModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.util.EvaluateHelper;
import com.google.inject.Injector;

/**
 * Takes care of all Xtext/Sirius Integration magic.
 *
 * @param <C>
 */
public abstract class AXtextSiriusEditor<C extends IXtextSiriusEditorCallback> {
	private final IXtextSiriusDescriptor descriptor;
	
	protected final MinimalModelAdjuster minModelAdjuster = new MinimalModelAdjuster();
	
	private C callback;
	
	private IModelAdjuster modelAdjuster;
	
	private @NonNull IEditingDecider editingDecider = new NullNoOpBlankDeletionEditingDecider();
	
	private @Nullable ModelEntryPoint modelEntryPoint;
	
	public AXtextSiriusEditor(final @NonNull IXtextSiriusDescriptor descriptor) {
		this.descriptor = descriptor;
	}
	
	public abstract void initValue(final @Nullable Object initialValue);
	
	public abstract Object commit(final @NonNull EObject target) throws AXtextSiriusIssueException;
	
	protected abstract @Nullable Object retrieveValueToCommit() throws AXtextSiriusIssueException;
	
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
	
	protected boolean isValueFeatureDefined() {
		return getModelEntryPoint().hasValueFeature();
	}
	
	protected void assertState() {
		Assert.isNotNull(getDescriptor(), "Descriptor is null");
		Assert.isNotNull(getInjector(), "Injector is null");
		Assert.isNotNull(getModelEntryPoint(), "ModelEntryPoint is null");
		Assert.isNotNull(getCallback(), "Callback is null");
		Assert.isNotNull(getFallbackContainer(), "FallbackContainer is null");
		Assert.isNotNull(getEditingDecider(), "EditingDecider is null");
	}
	
	protected void updateCallbackInitText(final @Nullable String value, final int offset, final int length) {
		getCallback().callbackInitText(value, offset, length);
	}
	
	protected @NonNull String interpret(final @NonNull String expression) {
		final EObject self = getModelAdjuster().getSemanticElement(getModelEntryPoint());
		if (self != null) {
			final String result = EvaluateHelper.getInstance().evaluateString(expression, self);
			if (result != null) {
				return result;
			}
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
	
	protected boolean isCancelOnValidationError() {
		return getDescriptor().isCancelOnValidationError();
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
	
	protected @NonNull IModelAdjuster getModelAdjuster() {
		initModelAdjuster();
		return this.modelAdjuster;
	}
	
	protected void initModelAdjuster() {
		if (this.modelAdjuster != null) {
			return;
		}
		
		this.modelAdjuster = determineModelAdjuster();
	}
	
	protected abstract @NonNull IModelAdjuster determineModelAdjuster();
}
