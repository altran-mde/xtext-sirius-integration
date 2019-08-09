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

/**
 * Thrown if Xtext/Sirius Integration cannot complete.
 */
public class XtextSiriusErrorException extends AXtextSiriusIssueException {
	private static final long serialVersionUID = -8700540650952694796L;
	
	public XtextSiriusErrorException(final String message, final String editText) {
		super(message, editText);
	}
}
