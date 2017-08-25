package com.altran.general.integration.xtextsirius.eef.internal.model;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.widgets.Composite;

import com.altran.general.integration.xtextsirius.eef.internal.AXtextSiriusEefLifecycleManager;
import com.altran.general.integration.xtextsirius.eef.internal.XtextSiriusController;
import com.altran.general.integration.xtextsirius.util.EcoreHelper;
import com.google.inject.Injector;

public class XtextSiriusEefLifecycleManagerModel extends AXtextSiriusEefLifecycleManager {
	public XtextSiriusEefLifecycleManagerModel(
			final @NonNull PropertyDescriptorModel descriptor,
			final @NonNull EEFTextDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(descriptor, controlDescription, variableManager, interpreter, contextAdapter);
	}
	
	@Override
	protected void createMainControl(final Composite parent, final IEEFFormContainer formContainer) {
		final Injector injector = createSpecializedInjector();

		this.widget = new XtextSiriusWidgetModel(parent, injector, getDescriptor().isMultiLine());
		applyGridData(this.getWidget().getControl());

		this.controller = new XtextSiriusController(this.controlDescription, this.variableManager, this.interpreter,
				this.contextAdapter);
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();

		this.newValueConsumer = (newValue) -> {
			if (newValue instanceof EObject) {
				this.getWidget().update((EObject) newValue);
			}
		};
		this.controller.onNewValue(this.newValueConsumer);
	}

	@Override
	public void aboutToBeHidden() {
		EObject semanticElement = getWidget().getSemanticElement();
		if (semanticElement != null) {
			semanticElement = EcoreHelper.cloneAndProxify(semanticElement);
		}
		persistIfDirty(semanticElement);
		super.aboutToBeHidden();
	}

	@Override
	public XtextSiriusWidgetModel getWidget() {
		return (XtextSiriusWidgetModel) super.getWidget();
	}
}
