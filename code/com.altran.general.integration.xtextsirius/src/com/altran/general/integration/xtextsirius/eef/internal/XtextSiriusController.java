package com.altran.general.integration.xtextsirius.eef.internal;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class XtextSiriusController extends AbstractEEFCustomWidgetController {
	
	private final EEFCustomWidgetDescription controlDescription;
	private IConsumer<Object> newValueConsumer;
	
	public XtextSiriusController(final @NonNull EEFCustomWidgetDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(controlDescription, variableManager, interpreter, contextAdapter);
		this.controlDescription = controlDescription;
	}
	
	@Override
	protected @NonNull EEFCustomWidgetDescription getDescription() {
		return this.controlDescription;
	}

	@Override
	public void refresh() {
		super.refresh();
		this.newEval().call("var:self", this.newValueConsumer);
	}

	public void onNewValue(final @NonNull IConsumer<Object> newValueConsumer) {
		this.newValueConsumer = newValueConsumer;
	}

	public void removeValueConsumer() {
		this.newValueConsumer = null;
	}
}
