/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.eef.ui;

import java.util.Map;
import java.util.function.Consumer;

import org.apache.commons.lang.StringUtils;
import org.eclipse.eef.EefPackage;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.utils.EvalFactory;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.AXtextSiriusEditor;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusEditorCallback;
import com.google.common.collect.Maps;
import com.google.inject.Injector;

public abstract class AXtextSiriusEefLifecycleManager<C extends IXtextSiriusEditorCallback, E extends AXtextSiriusEditor<C>>
extends AbstractEEFWidgetLifecycleManager
implements IXtextSiriusEditorCallback {
	private final E editor;
	private final Injector injector;
	private final IEefXtextDescription controlDescription;

	private XtextSiriusController controller;
	private XtextSiriusWidget widget;
	private Consumer<Object> newValueConsumer;
	private boolean enabled;
	

	@SuppressWarnings("unchecked")
	public AXtextSiriusEefLifecycleManager(
			final @NonNull E editor,
			final @NonNull IXtextSiriusDescriptor descriptor,
			final @NonNull IEefXtextDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.editor = editor;
		this.injector = descriptor.getInjector();
		editor.setCallback((C) this);
		this.controlDescription = controlDescription;
	}
	
	protected abstract XtextSiriusWidget createXtextSiriusWidget(final Composite parent);
	protected abstract Consumer<Object> createNewValueConsumer();

	@Override
	public void refresh() {
		super.refresh();
		getController().refresh();
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		
		this.newValueConsumer = createNewValueConsumer();
		getController().onNewValue(this.newValueConsumer);
	}
	
	@Override
	public void aboutToBeHidden() {
		if (getWidget().isDirty()) {
			commit();
		}

		super.aboutToBeHidden();
		getController().removeValueConsumer();
		this.newValueConsumer = null;
		getWidget().cleanup();
	}

	@Override
	public void callbackSetValue(final Object value, final int offset, final int length) {
		if (value instanceof String) {
			getWidget().update((String) value, new TextRegion(offset, length));
			updateWidgetUriWithSelf();
		}
	}

	protected @Nullable Object getValue() {
		final StyledText textWidget = getWidget().getTextWidget();
		if (textWidget != null) {
			final String text = textWidget.getText();
			return text;
		}

		return null;
	}

	protected @Nullable String getValueFeature() {
		@SuppressWarnings("restriction")
		final String PREFIX = org.eclipse.sirius.common.tools.internal.interpreter.FeatureInterpreter.PREFIX;

		// we're using valueExpression (instead of EditExpression) as there is
		// no field to explicitly set the editExpression in odesign model.
		final String valueExpression = getWidgetDescription().getValueExpression();
		if (StringUtils.startsWith(valueExpression, PREFIX)) {
			return valueExpression.substring(PREFIX.length());
		}

		return null;
	}
	
	public XtextSiriusWidget getWidget() {
		return this.widget;
	}

	@Override
	protected void createMainControl(final Composite parent, final IEEFFormContainer formContainer) {
		this.widget = createXtextSiriusWidget(parent);
		applyGridData(getWidget().getControl());
		
		this.controller = new XtextSiriusController(getWidgetDescription(), getVariableManager(), getInterpreter(),
				getContextAdapter());
	}

	@Override
	protected @Nullable XtextSiriusController getController() {
		return this.controller;
	}

	@Override
	protected @NonNull IEefXtextDescription getWidgetDescription() {
		return this.controlDescription;
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

	protected @NonNull EditingContextAdapter getContextAdapter() {
		return this.editingContextAdapter;
	}
	
	protected @NonNull IVariableManager getVariableManager() {
		return this.variableManager;
	}
	
	protected @NonNull IInterpreter getInterpreter() {
		return this.interpreter;
	}

	protected void applyGridData(final @Nullable Control widgetControl) {
		if (widgetControl != null) {
			final GridData gridData = translateToGridData();
			// no idea why we're missing one pixel here
			gridData.horizontalIndent = VALIDATION_MARKER_OFFSET - 1;
			widgetControl.setLayoutData(gridData);
		}
	}

	protected @NonNull GridData translateToGridData() {
		final GridData result = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		if (getWidgetDescription().isMultiLine()) {
			// because it's two times the answer
			result.heightHint = 42 * 2;
		}

		return result;
	}

	protected void commit() {
		getContextAdapter().performModelChange(() -> {
			final String editExpression = getWidgetDescription().getEditExpression();
			final EAttribute eAttribute = EefPackage.Literals.EEF_TEXT_DESCRIPTION__EDIT_EXPRESSION;

			final Map<String, Object> variables = Maps.newLinkedHashMap();
			variables.putAll(getVariableManager().getVariables());
			final Object newValue = getEditor().commit(getSelf());
			variables.put(EEFExpressionUtils.EEFText.NEW_VALUE, newValue);

			EvalFactory.of(getInterpreter(), variables).logIfBlank(eAttribute).call(editExpression);
		});
	}

	protected void updateWidgetUriWithSelf() {
		final EObject self = getSelf();
		if (self != null) {
			getWidget().updateUri(self.eResource().getURI());
		}
	}

	protected @Nullable EObject getSelf() {
		final Object self = getVariableManager().getVariables().get(EEFExpressionUtils.SELF);
		if (self instanceof EObject) {
			return (EObject) self;
		}

		return null;

	}

	protected E getEditor() {
		return this.editor;
	}
	
	protected Injector getInjector() {
		return this.injector;
	}
}
