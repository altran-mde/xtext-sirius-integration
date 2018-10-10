package com.altran.general.integration.xtextsirius.runtime.editpart.ui.value;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusValueDescribable;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusValueDescriptor;
import com.altran.general.integration.xtextsirius.runtime.util.StyledTextUtil;

public class XtextSiriusStyledTextCellEditorValue extends AXtextSiriusStyledTextCellEditor
		implements IXtextSiriusValueDescribable {
	
	private final @NonNull EStructuralFeature valueFeature;
	
	public XtextSiriusStyledTextCellEditorValue(
			final @NonNull XtextSiriusValueDescriptor descriptor, final @NonNull EStructuralFeature valueFeature) {
		super(descriptor);
		this.valueFeature = valueFeature;
	}
	
	@Override
	protected void doSetValue(final Object value) {
		if (value instanceof String) {
			String newText = (String) value;
			if (StringUtils.isBlank(newText)) {
				newText = retrieveValueFromModel(newText);
			}
			
			final StringBuffer text = new StringBuffer(newText);
			StyledTextUtil.getInstance().removeNewlinesIfSingleLine(text, 0, text.length(), isMultiLine());
			
			getXtextAdapter().resetVisibleRegion();
			final String prefixText = interpret(getDescriptor().getPrefixTextExpression());
			final String suffixText = interpret(getDescriptor().getSuffixTextExpression());
			super.doSetValue(prefixText + StyledTextUtil.getInstance().guessNewline(text.toString()) + text
					+ suffixText);
			
			getXtextAdapter().setVisibleRegion(prefixText.length() + 1, text.length());
		}
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
	public @Nullable Object getValueToCommit() {
		return getValue();
	}
	
	@Override
	public @NonNull XtextSiriusValueDescriptor getDescriptor() {
		return (@NonNull XtextSiriusValueDescriptor) super.getDescriptor();
	}
	
	protected EStructuralFeature getValueFeature() {
		return this.valueFeature;
	}
}
