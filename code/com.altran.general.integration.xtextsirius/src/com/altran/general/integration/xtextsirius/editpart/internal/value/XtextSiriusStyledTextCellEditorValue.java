package com.altran.general.integration.xtextsirius.editpart.internal.value;

import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.editpart.internal.fix.XtextStyledTextCellEditorExFix;
import com.altran.general.integration.xtextsirius.util.TextUtil;
import com.google.inject.Injector;

public class XtextSiriusStyledTextCellEditorValue extends XtextStyledTextCellEditorExFix {
	private final boolean multiLine;
	private final @NonNull String prefixText;
	private final @NonNull String suffixText;

	public XtextSiriusStyledTextCellEditorValue(
			final int style,
			final @NonNull Injector injector,
			final boolean multiLine,
			final @NonNull String prefixText,
			final @NonNull String suffixText) {
		super(style, injector);
		this.multiLine = multiLine;
		this.prefixText = prefixText;
		this.suffixText = suffixText;
	}

	@Override
	protected void doSetValue(final Object value) {
		if (value instanceof String) {
			final StringBuffer text = new StringBuffer((String) value);
			TextUtil.removeNewlinesIfSingleLine(text, 0, text.length(), this.multiLine);

			super.doSetValue(this.prefixText + "\n" + text + this.suffixText);
			
			getXtextAdapter().resetVisibleRegion();
			getXtextAdapter().setVisibleRegion(this.prefixText.length() + 1, text.length());
		}
	}
}
