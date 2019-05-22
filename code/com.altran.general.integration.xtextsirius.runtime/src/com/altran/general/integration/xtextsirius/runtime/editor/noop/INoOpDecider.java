package com.altran.general.integration.xtextsirius.runtime.editor.noop;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.AXtextSiriusEditor;

public interface INoOpDecider {
	public boolean isNoOp(final @Nullable Object value, final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor);
}
