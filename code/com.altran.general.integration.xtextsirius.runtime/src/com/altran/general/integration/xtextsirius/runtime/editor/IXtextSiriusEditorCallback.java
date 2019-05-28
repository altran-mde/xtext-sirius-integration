package com.altran.general.integration.xtextsirius.runtime.editor;

import org.eclipse.jdt.annotation.Nullable;

public interface IXtextSiriusEditorCallback {
	public void callbackInitText(final @Nullable String initialValue, int offset, int length);
	
	public @Nullable String callbackGetText();
}
