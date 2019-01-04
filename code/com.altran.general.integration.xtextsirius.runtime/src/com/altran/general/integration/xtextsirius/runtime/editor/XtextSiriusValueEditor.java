package com.altran.general.integration.xtextsirius.runtime.editor;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusValueDescriptor;
import com.altran.general.integration.xtextsirius.runtime.util.StyledTextUtil;

public class XtextSiriusValueEditor extends AXtextSiriusEditor {
	private final @NonNull EStructuralFeature valueFeature;

	public XtextSiriusValueEditor(final IXtextSiriusValueDescriptor descriptor,
			final @NonNull EStructuralFeature valueFeature) {
		super(descriptor);
		this.valueFeature = valueFeature;
	}
	
	@Override
	public void doSetValue(final Object value) {
		if (value instanceof String) {
			String newText = (String) value;
			if (StringUtils.isBlank(newText)) {
				newText = retrieveValueFromModel(newText);
			}
			
			final StringBuffer text = new StringBuffer(newText);
			StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 0, text.length(), isMultiLine());
			
			getCallback().resetVisibleRegion();
			final String prefixText = interpret(getDescriptor().getPrefixTextExpression());
			final String suffixText = interpret(getDescriptor().getSuffixTextExpression());
			super.doSetValue(prefixText + StyledTextUtil.getInstance().guessNewline(text.toString()) + text
					+ suffixText);
			
			getCallback().setVisibleRegion(prefixText.length() + 1, text.length());
		}
	}
	
	@Override
	public @Nullable Object getValueToCommit() {
		return getCallback().getValue();
	}
	
	protected @Nullable String retrieveValueFromModel(final @Nullable String newText) {
		final EObject semanticElement = getSemanticElement();

		String result = newText;
		if (semanticElement != null) {
			result = StringUtils.defaultString((String) semanticElement.eGet(getValueFeature()));
		}
		return result;
	}
	
	@Override
	public IXtextSiriusValueDescriptor getDescriptor() {
		return (IXtextSiriusValueDescriptor) super.getDescriptor();
	}
	
	protected EStructuralFeature getValueFeature() {
		return this.valueFeature;
	}
}
