package com.altran.general.integration.xtextsirius.editpart.internal.value;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.editpart.internal.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.util.StyledTextUtil;
import com.google.inject.Injector;

public class XtextSiriusStyledTextCellEditorValue extends AXtextSiriusStyledTextCellEditor {
	private final @NonNull String prefixText;
	private final @NonNull String suffixText;
	private final EStructuralFeature valueFeature;

	public XtextSiriusStyledTextCellEditorValue(
			final int style,
			final @NonNull Injector injector,
			final boolean multiLine,
			final @NonNull String prefixText,
			final @NonNull String suffixText,
			final @NonNull EStructuralFeature valueFeature) {
		super(style, injector, multiLine);
		this.prefixText = prefixText;
		this.suffixText = suffixText;
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
			super.doSetValue(this.prefixText + StyledTextUtil.getInstance().guessNewline(text.toString()) + text
					+ this.suffixText);
			
			getXtextAdapter().setVisibleRegion(this.prefixText.length() + 1, text.length());
		}
	}

	protected String retrieveValueFromModel(String newText) {
		final EObject semanticElement = getSemanticElement();
		if (semanticElement != null) {
			newText = StringUtils.defaultString((String) semanticElement.eGet(getValueFeature()));
		}
		return newText;
	}

	protected @NonNull EStructuralFeature getValueFeature() {
		return this.valueFeature;
	}

	@Override
	public @Nullable Object getValueToCommit() {
		return getValue();
	}
}
