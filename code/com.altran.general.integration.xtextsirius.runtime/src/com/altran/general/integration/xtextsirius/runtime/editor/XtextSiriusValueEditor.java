package com.altran.general.integration.xtextsirius.runtime.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusValueDescriptor;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.util.StyledTextUtil;

public class XtextSiriusValueEditor extends AXtextSiriusEditor<IXtextSiriusValueEditorCallback> {
	public XtextSiriusValueEditor(final IXtextSiriusValueDescriptor descriptor) {
		super(descriptor);
	}

	@Override
	protected @Nullable Object getValueToCommit() throws AXtextSiriusIssueException {
		return getCallback().getValue();
	}

	@Override
	public void doSetValue(final @Nullable Object value, final @Nullable String valueFeatureName) {
		if (value instanceof String) {
			final StringBuffer text = new StringBuffer((String) value);
			final int length = text.length();
			StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 0, length, isMultiLine());

			final String prefixText = interpret(getDescriptor().getPrefixTextExpression());
			final String suffixText = interpret(getDescriptor().getSuffixTextExpression());
			final String editablePart = StyledTextUtil.getInstance().guessNewline(text.toString()) + text;
			
			final int offset = prefixText.length() + 1;
			final String completeText = prefixText + editablePart + suffixText;
			updateCallbackSetValue(completeText, offset, length);
		}
	}

	@Override
	public Object commit(final @NonNull EObject target, final @Nullable String valueFeatureName) {
		final EStructuralFeature valueFeature = enforceValueFeature(target, valueFeatureName);
		final EObject adjustedTarget = adjustTarget(target, valueFeatureName);
		final Object valueToCommit = getValueToCommit();
		adjustedTarget.eSet(valueFeature, valueToCommit);
		return valueToCommit;
	}

	@Override
	protected IXtextSiriusValueDescriptor getDescriptor() {
		return (IXtextSiriusValueDescriptor) super.getDescriptor();
	}
}
