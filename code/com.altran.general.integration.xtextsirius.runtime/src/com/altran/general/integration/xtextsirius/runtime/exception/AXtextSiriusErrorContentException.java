/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.exception;

import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.internal.XtextSiriusRuntimePlugin;

public abstract class AXtextSiriusErrorContentException extends XtextSiriusErrorException {
	private static final long serialVersionUID = 4375669064609239168L;
	
	private final TextRegion visibleRegion;
	
	public AXtextSiriusErrorContentException(final String message, final String editText,
			final TextRegion visibleRegion) {
		super(message, editText);
		this.visibleRegion = visibleRegion;
	}
	
	protected abstract String getStatusMessage();
	
	protected abstract Stream<ErrorMessage> getErrorData();
	
	@Override
	public IStatus toStatus() {
		final MultiStatus result = new MultiStatus(XtextSiriusRuntimePlugin.PLUGIN_ID, IStatus.ERROR,
				getStatusMessage(),
				null);
		
		result.add(new Status(IStatus.INFO, XtextSiriusRuntimePlugin.PLUGIN_ID,
				"Complete entered text:\n\n" + getEditText()));
		
		final String normalizedEditText = normalizeEditText();
		
		getErrorData().sorted().forEachOrdered(errorMessage -> {
			result.add(new Status(IStatus.ERROR, XtextSiriusRuntimePlugin.PLUGIN_ID,
					errorMessage.getCompiledMessage(normalizedEditText, this.visibleRegion.getOffset())));
		});
		
		return result;
	}
	
	private String normalizeEditText() {
		return StringUtils.replaceEach(getEditText(), new String[] { "\t", "\r\n", "\r" },
				new String[] { " ", " \n", " " });
	}
	
}
