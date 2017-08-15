package com.altran.general.integration.xtextsirius.eef.internal;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.altran.general.integration.xtextsirius.eef.IXtextPropertyConfiguration;
import com.google.inject.Injector;

public class XtextSiriusEefLifecycleManager extends AbstractEEFWidgetLifecycleManager {
	private final IXtextPropertyConfiguration config;
	private final EEFCustomWidgetDescription controlDescription;
	private final EditingContextAdapter contextAdapter;
	
	private XtextSiriusWidget widget;
	private XtextSiriusController controller;

	private boolean enabled;
	
	public XtextSiriusEefLifecycleManager(final IXtextPropertyConfiguration config,
			final EEFCustomWidgetDescription controlDescription, final IVariableManager variableManager,
			final IInterpreter interpreter, final EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.config = config;
		this.controlDescription = controlDescription;
		this.contextAdapter = contextAdapter;
	}


	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		// TODO Auto-generated method stub

	}
	
	@Override
	public void refresh() {
		super.refresh();
		this.controller.refresh();
	}
	
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		// TODO Auto-generated method stub

	}
	
	@Override
	public void dispose() {
		super.dispose();
		// TODO Auto-generated method stub

	}
	
	
	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}
	
	
	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return this.controlDescription;
	}
	
	
	@Override
	protected void createMainControl(final Composite parent, final IEEFFormContainer formContainer) {
		final Injector injector = this.config.getInjector();
		
		this.widget = new XtextSiriusWidget(parent, injector, this.config.getSwtWidgetStyle());
		final GridData gridData = this.config.getLayoutData();
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		this.widget.getControl().setLayoutData(gridData);

		this.controller = new XtextSiriusController(this.controlDescription, this.variableManager, this.interpreter,
				this.contextAdapter);
	}
	
	
	@Override
	protected void setEnabled(final boolean isEnabled) {
		this.enabled = isEnabled;
	}

	@Override
	protected boolean isEnabled() {
		return this.enabled;
	}
	
	
	@Override
	protected Control getValidationControl() {
		return this.widget.getControl();
	}

}
