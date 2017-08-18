package com.altran.general.integration.xtextsirius.eef.internal;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.altran.general.integration.xtextsirius.eef.IXtextPropertyConfiguration;
import com.google.inject.Injector;

public class XtextSiriusEefLifecycleManager extends AbstractEEFWidgetLifecycleManager {
	private final IXtextPropertyConfiguration config;
	private final EEFTextDescription controlDescription;
	private final EditingContextAdapter contextAdapter;
	
	private IConsumer<Object> newValueConsumer;

	private XtextSiriusWidget widget;
	private XtextSiriusController controller;

	private boolean enabled;
	
	public XtextSiriusEefLifecycleManager(final @NonNull IXtextPropertyConfiguration config,
			final @NonNull EEFTextDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.config = config;
		this.controlDescription = controlDescription;
		this.contextAdapter = contextAdapter;
	}


	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		
		this.newValueConsumer = (newValue) -> {
			if (newValue instanceof EObject) {
				this.widget.update((EObject) newValue);
			}
		};
		this.controller.onNewValue(this.newValueConsumer);
	}
	
	@Override
	public void refresh() {
		super.refresh();
		this.controller.refresh();
	}
	
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		this.controller.removeValueConsumer();
		this.newValueConsumer = null;
		this.widget.cleanup();
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
	
	
	@Override
	protected @Nullable IEEFWidgetController getController() {
		return this.controller;
	}
	
	
	@Override
	protected @NonNull EEFWidgetDescription getWidgetDescription() {
		return this.controlDescription;
	}
	
	
	@Override
	protected void createMainControl(final Composite parent, final IEEFFormContainer formContainer) {
		final Injector injector = this.config.getInjector();
		
		this.widget = new XtextSiriusWidget(parent, injector, this.config.getSwtWidgetStyle());
		final GridData gridData = this.config.getLayoutData();
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		final @Nullable Control widgetControl = this.widget.getControl();
		if (widgetControl != null) {
			widgetControl.setLayoutData(gridData);
		}

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
	protected @Nullable Control getValidationControl() {
		if (this.widget != null) {
			return this.widget.getControl();
		}
		
		return null;
	}

}
