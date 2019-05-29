package com.altran.general.integration.xtextsirius.runtime.editor;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class NullNoOpBlankDeletionEditingDecider implements IXtextSiriusEditingDecider {

	private @Nullable String initialText;

	@Override
	public @Nullable String initializeText(final @Nullable Object initialValue, final @Nullable String initialText,
			final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor) {
		this.initialText = initialText;
		
		if (StringUtils.isBlank(initialText)) {
			return null;
		} else {
			return initialText;
		}
	}

	@Override
	public boolean isNoOp(final @Nullable String text, final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor) {
		return text == null || StringUtils.equals(this.initialText, text);
	}

	@Override
	public boolean isDeletion(final @Nullable String text, final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor) {
		return StringUtils.isBlank(text);
	}
}
