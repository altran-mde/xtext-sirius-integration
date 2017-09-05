package com.altran.general.integration.xtextsirius.eef.internal.value;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.widgets.Composite;

import com.altran.general.integration.xtextsirius.eef.internal.AXtextSiriusEefLifecycleManager;
import com.altran.general.integration.xtextsirius.eef.internal.XtextSiriusController;

public class XtextSiriusEefLifecycleManagerValue extends AXtextSiriusEefLifecycleManager {
	private final @NonNull String prefixText;
	private final @NonNull String suffixText;
	
	public XtextSiriusEefLifecycleManagerValue(
			final @NonNull PropertyDescriptorValue descriptor,
			final @NonNull EEFTextDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(descriptor, controlDescription, variableManager, interpreter, contextAdapter);
		this.prefixText = descriptor.getPrefixText();
		this.suffixText = descriptor.getSuffixText();
	}

	@Override
	protected void createMainControl(final Composite parent, final IEEFFormContainer formContainer) {
		this.widget = new XtextSiriusWidgetValue(parent, getInjector(), isMultiLine(), getPrefixText(),
				getSuffixText());
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
		persistIfDirty(getWidget().getText());
		super.aboutToBeHidden();
	}
	
	protected @NonNull String getPrefixText() {
		return this.prefixText;
	}
	
	protected @NonNull String getSuffixText() {
		return this.suffixText;
	}
}
