/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.modelregion;

import org.apache.commons.lang.StringUtils;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor;

/**
 * Replaces the visible text in the serialized model with initial text, if any.
 * Example: User starts direct edit action by typing text (i.e. not pressing F2
 * or double-clicking).
 */
public class TextOverlayer {
	private final @NonNull XtextSiriusModelEditor xtextSiriusEditor;
	private final @NonNull ModelRegionEditorPreparer preparer;
	private final @Nullable Object initialValue;
	
	private String text;
	private TextRegion textRegion;
	
	public TextOverlayer(final @NonNull XtextSiriusModelEditor xtextSiriusEditor,
			final @NonNull ModelRegionEditorPreparer preparer, final @Nullable Object initialValue) {
		this.xtextSiriusEditor = xtextSiriusEditor;
		this.preparer = preparer;
		this.initialValue = initialValue;
	}
	
	public @NonNull String getText() {
		overlay();
		return this.text;
	}
	
	public @NonNull TextRegion getTextRegion() {
		overlay();
		return this.textRegion;
	}
	
	protected void overlay() {
		if (this.text != null) {
			return;
		}
		
		this.text = this.preparer.getText();
		this.textRegion = this.preparer.getTextRegion();
		
		final int textOffset = this.textRegion.getOffset();
		final int textLength = this.textRegion.getLength();
		final int textEndOffset = textOffset + textLength;
		
		final String initialText = this.text.substring(textOffset, textEndOffset);
		
		final @Nullable String textValue = initializeText(this.initialValue, initialText);
		
		if (textValue != null) {
			this.text = StringUtils.overlay(this.text, textValue, textOffset, textEndOffset);
			this.textRegion = new TextRegion(textOffset, textValue.length());
		}
	}
	
	protected @Nullable String initializeText(final @Nullable Object initialValue, final @NonNull String textValue) {
		return this.xtextSiriusEditor.getEditingDecider().initializeText(initialValue, textValue,
				this.xtextSiriusEditor);
	}
	
}
