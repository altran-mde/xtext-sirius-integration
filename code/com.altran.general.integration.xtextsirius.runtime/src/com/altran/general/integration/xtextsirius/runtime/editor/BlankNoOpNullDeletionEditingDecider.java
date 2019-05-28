package com.altran.general.integration.xtextsirius.runtime.editor;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class BlankNoOpNullDeletionEditingDecider implements IXtextSiriusEditingDecider {
	
	private @Nullable String initialText;
	
	@Override
	public void setInitialValue(final @Nullable Object initialValue, final @Nullable String initialText,
			final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor) {
		this.initialText = initialText;
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
