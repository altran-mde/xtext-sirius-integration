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

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.TextRegion;

public class XtextSiriusValidationErrorException extends AXtextSiriusErrorContentException {
	
	private static final long serialVersionUID = 2778272824632490474L;
	private final Diagnostic diagnostic;
	
	public XtextSiriusValidationErrorException(final String editText, final TextRegion visibleRegion,
			final Diagnostic diagnostic) {
		super("Validation Error", editText, visibleRegion);
		this.diagnostic = diagnostic;
	}
	
	@Override
	protected Stream<ErrorMessage> getErrorData() {
		return flatten(this.diagnostic)
				.filter(d -> d.getChildren().isEmpty())
				.filter(d -> d.getData() != null && !d.getData().isEmpty())
				.filter(d -> getFirstData(d) instanceof EObject)
				.filter(d -> getNode(d) != null)
				.map(d -> new ErrorMessage(d.getMessage(), getNode(d).getTotalOffset()));
	}
	
	private Object getFirstData(final Diagnostic diag) {
		return diag.getData().iterator().next();
	}
	
	private INode getNode(final Diagnostic diag) {
		return NodeModelUtils.getNode((EObject) getFirstData(diag));
	}
	
	private Stream<Diagnostic> flatten(final Diagnostic d) {
		return Stream.concat(Stream.of(d), d.getChildren().stream().flatMap(c -> flatten(c)));
	}
	
	@Override
	protected String getStatusMessage() {
		return "Entered text has validation errors";
	}
	
}
