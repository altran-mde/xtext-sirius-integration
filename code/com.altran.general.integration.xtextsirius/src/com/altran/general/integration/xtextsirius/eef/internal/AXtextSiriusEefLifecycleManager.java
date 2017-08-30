package com.altran.general.integration.xtextsirius.eef.internal;

import java.util.Map;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IConsumer;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Control;

import com.google.common.collect.Maps;
import com.google.inject.Injector;

public abstract class AXtextSiriusEefLifecycleManager extends AbstractEEFWidgetLifecycleManager {
	private final APropertyDescriptor descriptor;
	protected final EEFTextDescription controlDescription;
	protected final EditingContextAdapter contextAdapter;

	protected IConsumer<Object> newValueConsumer;
	
	protected AXtextSiriusWidget widget;
	protected XtextSiriusController controller;
	
	protected boolean enabled;

	public AXtextSiriusEefLifecycleManager(
			final @NonNull APropertyDescriptor descriptor,
			final @NonNull EEFTextDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.descriptor = descriptor;
		this.controlDescription = controlDescription;
		this.contextAdapter = contextAdapter;
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
		getWidget().cleanup();
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
	protected @NonNull EEFTextDescription getWidgetDescription() {
		return this.controlDescription;
	}

	protected void applyGridData(final @Nullable Control widgetControl) {
		if (widgetControl != null) {
			final GridData gridData = getDescriptor().getConfig().getLayoutData(translateToGridData());
			// no idea why we're missing one pixel here
			gridData.horizontalIndent = VALIDATION_MARKER_OFFSET - 1;
			widgetControl.setLayoutData(gridData);
		}
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
		if (getWidget() != null) {
			return getWidget().getControl();
		}
		
		return null;
	}

	protected int translateToStyle() {
		if (getDescriptor().isMultiLine()) {
			return SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER;
		} else {
			return SWT.SINGLE | SWT.BORDER;
		}
	}

	protected @NonNull GridData translateToGridData() {
		final GridData result = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		if (getDescriptor().isMultiLine()) {
			// because it's two times the answer
			result.heightHint = 42 * 2;
		}
		
		return result;
	}

	protected @NonNull Injector createSpecializedInjector() {
		return getDescriptor().getConfig().getInjector()
				.createChildInjector(new XtextEditorSwtStyleOverridingModule(
						getDescriptor().getConfig().getSwtWidgetStyle(translateToStyle())));
	}
	
	public @NonNull APropertyDescriptor getDescriptor() {
		return this.descriptor;
	}

	public AXtextSiriusWidget getWidget() {
		return this.widget;
	}
	
	
	protected void persistIfDirty(final Object newValue) {
		if (getWidget().isDirty()) {
			this.contextAdapter.performModelChange(() -> {
				final String editExpression = getWidgetDescription().getEditExpression();
				final EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION;
				
				final Map<String, Object> variables = Maps.newLinkedHashMap();
				variables.putAll(this.variableManager.getVariables());
				variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, newValue);
				
				EvalFactory.of(this.interpreter, variables).logIfBlank(eAttribute).call(editExpression);
			});
		}
	}
}
