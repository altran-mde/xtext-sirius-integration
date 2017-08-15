package com.altran.general.integration.xtextsirius.eef.internal;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

public class XtextSiriusController extends AbstractEEFCustomWidgetController {
	
	private final EEFCustomWidgetDescription controlDescription;
	
	public XtextSiriusController(final EEFCustomWidgetDescription controlDescription,
			final IVariableManager variableManager,
			final IInterpreter interpreter, final EditingContextAdapter contextAdapter) {
		super(controlDescription, variableManager, interpreter, contextAdapter);
		this.controlDescription = controlDescription;
	}
	
	@Override
	protected EEFCustomWidgetDescription getDescription() {
		return this.controlDescription;
	}

}
