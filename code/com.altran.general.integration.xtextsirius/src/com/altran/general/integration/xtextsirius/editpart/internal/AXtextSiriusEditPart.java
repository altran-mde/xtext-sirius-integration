package com.altran.general.integration.xtextsirius.editpart.internal;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.SWT;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart;

import com.google.inject.Injector;

public abstract class AXtextSiriusEditPart extends XtextLabelEditPart {
	
	private final boolean multiLine;
	private final Injector injector;

	public AXtextSiriusEditPart(final @NonNull AEditPartDescriptor descriptor, final @NonNull View view) {
		super(view);
		this.injector = descriptor.getConfig().getInjector();
		this.multiLine = descriptor.isMultiLine();
	}

	protected int translateToStyle() {
		if (this.isMultiLine()) {
			return SWT.MULTI | SWT.WRAP;
		} else {
			return SWT.SINGLE;
		}
	}

	protected Injector getInjector() {
		return this.injector;
	}
	
	protected boolean isMultiLine() {
		return this.multiLine;
	}
}
