package com.altran.general.integration.xtextsirius.runtime.exception;

public class XtextSiriusErrorException extends AXtextSiriusIssueException {
	private static final long serialVersionUID = -8700540650952694796L;

	public XtextSiriusErrorException(final String message, final String editText) {
		super(message, editText);
	}
}
