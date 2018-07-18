package com.altran.general.integration.xtextsirius.runtime.exception;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.altran.general.integration.xtextsirius.runtime.internal.XtextSiriusRuntimePlugin;

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
