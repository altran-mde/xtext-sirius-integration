package com.altran.general.integration.xtextsirius.eef.internal;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class XtextSiriusController extends AbstractEEFWidgetController {
	
	private final EEFTextDescription controlDescription;
	private IConsumer<Object> newValueConsumer;

	public XtextSiriusController(final @NonNull EEFTextDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.controlDescription = controlDescription;
	}

	@Override
	protected @NonNull EEFTextDescription getDescription() {
		return this.controlDescription;
	}
	
	@Override
	public void refresh() {
		super.refresh();
		this.newEval().call(getDescription().getValueExpression(), this.newValueConsumer);
	}
	
	public void onNewValue(final @NonNull IConsumer<Object> newValueConsumer) {
		this.newValueConsumer = newValueConsumer;
	}
	
	public void removeValueConsumer() {
		this.newValueConsumer = null;
	}
}
