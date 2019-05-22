package com.altran.general.integration.xtextsirius.runtime.editor.deletion;

import java.util.Optional;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.AXtextSiriusEditor;

public class BlankDeletionDecider implements IDeletionDecider {
	
	@Override
	public @NonNull Optional<String> isDeletion(final @Nullable Object value,
			final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor) {
		if (value == null || (value instanceof String && StringUtils.isBlank((String) value))) {
			return Optional.of("");
		} else {
			return Optional.empty();
		}
	}
	
}
