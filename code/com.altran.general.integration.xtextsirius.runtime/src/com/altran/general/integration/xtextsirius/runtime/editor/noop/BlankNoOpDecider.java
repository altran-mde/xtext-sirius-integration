package com.altran.general.integration.xtextsirius.runtime.editor.noop;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.editor.AXtextSiriusEditor;

public class BlankNoOpDecider implements INoOpDecider {
	
	@Override
	public boolean isNoOp(final @Nullable Object value, final @NonNull AXtextSiriusEditor<?> xtextSiriusEditor) {
		return value == null || (value instanceof String && StringUtils.isBlank((String) value));
	}
	
}
