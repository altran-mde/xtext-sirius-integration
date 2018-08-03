package com.altran.general.integration.xtextsirius.runtime.eef.ui.value;

import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.widgets.Composite;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.AXtextSiriusEefLifecycleManager;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.XtextSiriusController;
import com.google.inject.Injector;

public class XtextSiriusEefLifecycleManagerValue extends AXtextSiriusEefLifecycleManager {
	private final @NonNull String prefixTextExpression;
	private final @NonNull String suffixTextExpression;

	public XtextSiriusEefLifecycleManagerValue(
			final @NonNull Injector injector,
			final boolean shouldUseSpecializedInjector,
			final @NonNull IEefXtextValueDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(injector, shouldUseSpecializedInjector, controlDescription, variableManager, interpreter, contextAdapter);
		
		this.prefixTextExpression = controlDescription.getPrefixTextExpression();
		this.suffixTextExpression = controlDescription.getSuffixTextExpression();
	}

	@Override
	protected void createMainControl(final Composite parent, final IEEFFormContainer formContainer) {
		this.widget = new XtextSiriusWidgetValue(parent, getInjector(), isMultiLine(),
				interpret(getPrefixTextExpression()),
				interpret(getSuffixTextExpression()));
		applyGridData(getWidget().getControl());

		this.controller = new XtextSiriusController(this.controlDescription, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	@Override
	public XtextSiriusWidgetValue getWidget() {
		return (XtextSiriusWidgetValue) super.getWidget();
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.newValueConsumer = (newValue) -> {
			if (newValue instanceof String) {
				getWidget().update((String) newValue);
				updateWidgetUriWithSelf();
			}
		};
		this.controller.onNewValue(this.newValueConsumer);
	}

	@Override
	public void aboutToBeHidden() {
		if (getWidget().isDirty()) {
			commit(getWidget().getText());
		}
		super.aboutToBeHidden();
	}

	protected @NonNull String getPrefixTextExpression() {
		return this.prefixTextExpression;
	}

	protected @NonNull String getSuffixTextExpression() {
		return this.suffixTextExpression;
	}
}
