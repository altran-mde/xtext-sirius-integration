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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusValueDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.ElementFeatureModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.IModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.util.StyledTextUtil;

/**
 * Central entry point for value-based Xtext/Sirius Integration edits.
 * 
 * <p>
 * <i>Value-based</i> refers to the edited element being stored in an
 * EAttribute. The opposite is {@linkplain XtextSiriusModelEditor
 * <i>model-based}, where the edited element is part of the model itself.
 */
public class XtextSiriusValueEditor extends AXtextSiriusEditor<IXtextSiriusValueEditorCallback> {
	public XtextSiriusValueEditor(final IXtextSiriusValueDescriptor descriptor) {
		super(descriptor);
	}
	
	@Override
	protected @Nullable Object retrieveValueToCommit() throws AXtextSiriusIssueException {
		return getCallback().callbackGetText();
	}
	
	@Override
	public void initValue(final @Nullable Object initialValue) {
		assertState();
		
		if (initialValue == null || !(initialValue instanceof String)) {
			return;
		}
		
		final StringBuffer text = new StringBuffer((String) initialValue);
		final int length = text.length();
		StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 0, length, isMultiLine());
		
		final String prefixText = interpret(getDescriptor().getPrefixTextExpression());
		final String suffixText = interpret(getDescriptor().getSuffixTextExpression());
		final String editablePart = initializeText(initialValue,
				StyledTextUtil.getInstance().guessNewline(text.toString()) + text);
		
		final int offset = prefixText.length() + 1;
		final String completeText = prefixText + editablePart + suffixText;
		updateCallbackInitText(completeText, offset, length);
	}
	
	@Override
	public Object commit(final @NonNull EObject target) {
		assertState();
		
		final EStructuralFeature valueFeature = getModelAdjuster().getStructuralFeature(getModelEntryPoint());
		final ModelEntryPoint targetMep = new ModelEntryPoint(target, getValueFeatureName());
		final EObject adjustedTarget = getModelAdjuster().getClosestElement(targetMep);
		
		final String editedText = getCallback().callbackGetText();
		
		if (isNoOp(editedText)) {
			return adjustedTarget.eGet(valueFeature);
		}
		
		final Object valueToCommit;
		if (isDeletion(editedText)) {
			valueToCommit = null;
		} else {
			valueToCommit = retrieveValueToCommit();
		}
		
		adjustedTarget.eSet(valueFeature, valueToCommit);
		return valueToCommit;
	}
	
	@Override
	public IXtextSiriusValueDescriptor getDescriptor() {
		return (IXtextSiriusValueDescriptor) super.getDescriptor();
	}
	
	@Override
	protected @NonNull IModelAdjuster determineModelAdjuster() {
		if (!isValueFeatureDefined()) {
			throw new IllegalStateException("valueFeature required");
		}
		
		if (getSemanticElement() == null) {
			return new MinimalModelAdjuster();
		} else {
			return new ElementFeatureModelAdjuster();
		}
	}
}
