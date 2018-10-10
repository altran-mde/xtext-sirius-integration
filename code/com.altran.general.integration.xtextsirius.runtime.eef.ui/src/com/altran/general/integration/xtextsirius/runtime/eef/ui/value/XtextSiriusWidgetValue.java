/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.eef.ui.value;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;

import com.altran.general.integration.xtextsirius.runtime.eef.ui.AXtextSiriusWidget;
import com.altran.general.integration.xtextsirius.runtime.util.StyledTextUtil;
import com.google.inject.Injector;

public class XtextSiriusWidgetValue extends AXtextSiriusWidget {
	private final @NonNull String prefixTextExpression;
	private final @NonNull String suffixTextExpression;
	
	public XtextSiriusWidgetValue(
			final @NonNull Composite parent,
			final @NonNull Injector injector,
			final boolean multiLine,
			final @NonNull String prefixTextExpression,
			final @NonNull String suffixTextExpression) {
		super(parent, injector, multiLine);
		this.prefixTextExpression = prefixTextExpression;
		this.suffixTextExpression = suffixTextExpression;
	}
	
	@SuppressWarnings("restriction")
	public void update(final @NonNull String newValue) {
		this.editorAccess.updateModel(this.prefixTextExpression,
				StyledTextUtil.getInstance()
						.removeNewlinesIfSingleLine(new StringBuffer(newValue), 0, newValue.length(), isMultiLine())
						.toString(),
				this.suffixTextExpression);
		resetDirty();
	}
	
	public @Nullable String getText() {
		final StyledText textWidget = getTextWidget();
		if (textWidget != null) {
			return textWidget.getText();
		}
		
		return null;
	}
}
