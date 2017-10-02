package com.altran.general.integration.xtextsirius.runtime.eef.ui;

import java.util.function.Consumer;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFWidgetController;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class XtextSiriusController extends AbstractEEFWidgetController {
	
	private final EEFTextDescription controlDescription;
	private Consumer<Object> newValueConsumer;
	
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
		newEval().call(getDescription().getValueExpression(), t -> this.newValueConsumer.accept(t));
	}

	public void onNewValue(final @NonNull Consumer<Object> newValueConsumer) {
		this.newValueConsumer = newValueConsumer;
	}

	public void removeValueConsumer() {
		this.newValueConsumer = null;
	}
}
