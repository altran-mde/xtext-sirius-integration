/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.exception;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.altran.general.integration.xtextsirius.runtime.internal.XtextSiriusRuntimePlugin;

/**
 * Any Xtext/Sirius Integration issue related to the entered text.
 */
public abstract class AXtextSiriusIssueException extends RuntimeException {
	private static final long serialVersionUID = -8032537508345508604L;
	
	private final String editText;
	
	public AXtextSiriusIssueException(final String message, final String editText) {
		super(message);
		this.editText = editText;
	}
	
	public String getEditText() {
		return this.editText;
	}
	
	public IStatus toStatus() {
		return new Status(IStatus.ERROR, XtextSiriusRuntimePlugin.PLUGIN_ID, getEditText(), this);
	}
}
