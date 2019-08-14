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

import java.util.Collection;
import java.util.stream.Stream;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.TextRegion;

/**
 * Reports syntax error(s) inside the user's entry.
 */
public class XtextSiriusSyntaxErrorException extends AXtextSiriusErrorContentException {
	private static final long serialVersionUID = 7187667853765899743L;
	
	private final Collection<INode> errorNodes;
	
	public XtextSiriusSyntaxErrorException(final String editText, final TextRegion visibleRegion,
			final Collection<INode> errorNodes) {
		super("Syntax error", editText, visibleRegion);
		this.errorNodes = errorNodes;
	}
	
	@Override
	protected String getStatusMessage() {
		return "Entered text is syntactically incorrect.";
	}
	
	@Override
	protected Stream<ErrorMessage> getErrorData() {
		return this.errorNodes.stream()
				.map(n -> new ErrorMessage(n.getSyntaxErrorMessage().getMessage(), n.getTotalOffset()));
	}
}
