package com.altran.general.integration.xtextsirius.runtime.editpart.ui.value;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.util.EvaluateHelper;
import com.altran.general.integration.xtextsirius.util.StyledTextUtil;
import com.google.inject.Injector;

public class XtextSiriusStyledTextCellEditorValue extends AXtextSiriusStyledTextCellEditor {
	private final @NonNull String prefixTextExpression;
	private final @NonNull String suffixTextExpression;
	private final EStructuralFeature valueFeature;
	
	public XtextSiriusStyledTextCellEditorValue(
			final int style,
			final @NonNull Injector injector,
			final boolean multiLine,
			final @NonNull String prefixTextExpression,
			final @NonNull String suffixTextExpression,
			final @NonNull EStructuralFeature valueFeature) {
		super(style, injector, multiLine);
		this.prefixTextExpression = prefixTextExpression;
		this.suffixTextExpression = suffixTextExpression;
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
			final String prefixText = interpret(this.prefixTextExpression);
			final String suffixText = interpret(this.suffixTextExpression);
			super.doSetValue(prefixText + StyledTextUtil.getInstance().guessNewline(text.toString()) + text
					+ suffixText);

			getXtextAdapter().setVisibleRegion(prefixText.length() + 1, text.length());
		}
	}

	protected @NonNull String interpret(final @NonNull String expression) {
		final EObject self = getSemanticElement();
		if (self != null) {
			return EvaluateHelper.getInstance().evaluateString(expression, self);
		}
		
		return "";
	}
	
	
	protected @Nullable String retrieveValueFromModel(final @Nullable String newText) {
		final EObject semanticElement = getSemanticElement();
		
		String result = newText;
		if (semanticElement != null) {
			result = StringUtils.defaultString((String) semanticElement.eGet(getValueFeature()));
		}
		return result;
	}
	
	protected @NonNull EStructuralFeature getValueFeature() {
		return this.valueFeature;
	}
	
	@Override
	public @Nullable Object getValueToCommit() {
		return getValue();
	}
}
