package com.altran.general.integration.xtextsirius.runtime.editor;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public interface IXtextSiriusEditingDecider {
	public @Nullable String initializeText(final @Nullable Object initialValue, final @Nullable String initialText,
			final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor);

	public boolean isNoOp(final @Nullable String text, final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor);
	
	public boolean isDeletion(final @Nullable String text, final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor);
}
