package com.altran.general.integration.xtextsirius.runtime.editor.deletion;

import java.util.Optional;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.AXtextSiriusEditor;

public class NullDeletionDecider implements IDeletionDecider {
	
	@Override
	public @NonNull Optional<String> isDeletion(final @Nullable Object value,
			final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor) {
		if (value == null) {
			return Optional.of("");
		} else {
			return Optional.empty();
		}
	}
	
}
