package com.altran.general.integration.xtextsirius.runtime.editor;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.Nullable;

public interface IXtextSiriusEditorCallback {
	public void callbackSetValue(final @Nullable Object value, int offset, int length);

	public @Nullable Object getValue();

	public @Nullable EStructuralFeature getValueFeature();
}
