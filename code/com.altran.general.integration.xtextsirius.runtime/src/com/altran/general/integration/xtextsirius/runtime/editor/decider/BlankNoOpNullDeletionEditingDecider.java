package com.altran.general.integration.xtextsirius.runtime.editor.decider;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.AXtextSiriusEditor;

public class BlankNoOpNullDeletionEditingDecider implements IXtextSiriusEditingDecider {

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
		return StringUtils.isBlank(text) || StringUtils.equals(this.initialText, text);
	}

	@Override
	public boolean isDeletion(final @Nullable String text, final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor) {
		return text == null;
	}
}
