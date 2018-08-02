package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.SWT;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.IXtextSiriusAwareLabelEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.google.inject.Injector;

public abstract class AXtextSiriusDescriptor {
	private final @NonNull Injector injector;
	private final boolean multiLine;

	private final @NonNull String prefixTextExpression;
	private final @NonNull String suffixTextExpression;
	
	// public AXtextSiriusDescriptor(final @NonNull Injector injector, final
	// boolean multiLine) {
	// this.injector = injector;
	// this.multiLine = multiLine;
	// }

	public AXtextSiriusDescriptor(final @NonNull Injector injector, final @NonNull IXtextDescription description) {
		this.injector = injector;
		this.multiLine = description.isMultiLine();
		this.prefixTextExpression = description.getPrefixTextExpression();
		this.suffixTextExpression = description.getSuffixTextExpression();
	}

	public @NonNull Injector getInjector() {
		return this.injector;
	}

	public boolean isMultiLine() {
		return this.multiLine;
	}

	public @NonNull String getPrefixTextExpression() {
		return this.prefixTextExpression;
	}

	public @NonNull String getSuffixTextExpression() {
		return this.suffixTextExpression;
	}

	public abstract @NonNull XtextSiriusDirectEditManager createDirectEditManager(
			final @NonNull IXtextSiriusAwareLabelEditPart editPart);

	public int translateToStyle() {
		if (isMultiLine()) {
			return SWT.MULTI | SWT.WRAP;
		} else {
			return SWT.SINGLE;
		}
	}

}
