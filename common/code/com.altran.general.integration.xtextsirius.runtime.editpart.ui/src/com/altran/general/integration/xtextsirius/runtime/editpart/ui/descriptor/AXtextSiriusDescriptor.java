package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.SWT;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.IXtextSiriusAwareLabelEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.google.inject.Injector;

public abstract class AXtextSiriusDescriptor {
	private final @NonNull Injector injector;
	private final boolean multiLine;

	public AXtextSiriusDescriptor(final @NonNull Injector injector, final boolean multiLine) {
		this.injector = injector;
		this.multiLine = multiLine;
	}
	
	public AXtextSiriusDescriptor(final @NonNull Injector injector, final @NonNull IXtextDescription description) {
		this.injector = injector;
		this.multiLine = description.isMultiLine();
	}

	public @NonNull Injector getInjector() {
		return injector;
	}

	public boolean isMultiLine() {
		return multiLine;
	}
	
	public abstract @NonNull XtextSiriusDirectEditManager createDirectEditManager(final @NonNull IXtextSiriusAwareLabelEditPart editPart);
	
	public int translateToStyle() {
		if (isMultiLine()) {
			return SWT.MULTI | SWT.WRAP;
		} else {
			return SWT.SINGLE;
		}
	}

}
