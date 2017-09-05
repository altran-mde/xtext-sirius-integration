package com.altran.general.integration.xtextsirius.eef.internal.model;

import java.util.Collection;

import org.apache.commons.lang.StringUtils;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.widgets.Composite;

import com.altran.general.integration.xtextsirius.eef.internal.AXtextSiriusEefLifecycleManager;
import com.altran.general.integration.xtextsirius.eef.internal.XtextSiriusController;
import com.altran.general.integration.xtextsirius.util.ModelRegionEditorPreparer;

public class XtextSiriusEefLifecycleManagerModel extends AXtextSiriusEefLifecycleManager {
	private final Collection<@NonNull String> editableFeatures;
	
	public XtextSiriusEefLifecycleManagerModel(
			final @NonNull PropertyDescriptorModel descriptor,
			final @NonNull EEFTextDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(descriptor, controlDescription, variableManager, interpreter, contextAdapter);
		this.editableFeatures = descriptor.getEditableFeatures();
	}
	
	@Override
	protected void createMainControl(final Composite parent, final IEEFFormContainer formContainer) {
		this.widget = new XtextSiriusWidgetModel(parent, getInjector(), isMultiLine());
		applyGridData(getWidget().getControl());
		
		this.controller = new XtextSiriusController(this.controlDescription, this.variableManager, this.interpreter,
				this.contextAdapter);
	}
	
	private Object oldValue;
	
	@Override
	public void dispose() {
		this.oldValue = null;
		super.dispose();
	}
	
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		
		this.newValueConsumer = (newValue) -> {
			if (newValue == this.oldValue) {
				return;
			}
			this.oldValue = newValue;
			
			ModelRegionEditorPreparer preparer = null;
			URI resourceUri = null;

			if (newValue instanceof EObject) {
				final EObject semanticElement = (EObject) newValue;
				preparer = new ModelRegionEditorPreparer(semanticElement, getInjector(), isMultiLine(),
						getEditableFeatures());

				resourceUri = semanticElement.eResource().getURI();

			} else if (newValue == null) {
				final EObject self = getSelf();
				if (self != null) {
					final EStructuralFeature feature = getEditFeature(self);
					if (feature != null) {
						preparer = new ModelRegionEditorPreparer(null, self, getInjector(), isMultiLine(),
								getEditableFeatures(),
								feature);

						resourceUri = self.eResource().getURI();
					}
				}
			}

			if (preparer != null && resourceUri != null) {
				getWidget().updateUri(resourceUri);
				getWidget().update(preparer.getText(), preparer.getSemanticElementLocation(), preparer.getTextRegion());
			}

		};
		this.controller.onNewValue(this.newValueConsumer);
		
	}
	
	private @NonNull Collection<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}
	
	@SuppressWarnings("restriction")
	protected EStructuralFeature getEditFeature(final @NonNull EObject self) {
		final String PREFIX = org.eclipse.sirius.common.tools.internal.interpreter.FeatureInterpreter.PREFIX;

		// we're using valueExpression (instead of EditExpression) as there is
		// no field to explicitly set the editExpression in odesign model.
		final String valueExpression = getWidgetDescription().getValueExpression();
		if (StringUtils.startsWith(valueExpression, PREFIX)) {
			final String featureName = valueExpression.substring(PREFIX.length());
			final EStructuralFeature feature = self.eClass().getEStructuralFeature(featureName);
			return feature;
		}

		return null;
	}
	
	
	@Override
	public void aboutToBeHidden() {
		final EObject semanticElement = getWidget().getSemanticElement();
		persistIfDirty(semanticElement);
		super.aboutToBeHidden();
	}
	
	@Override
	public XtextSiriusWidgetModel getWidget() {
		return (XtextSiriusWidgetModel) super.getWidget();
	}
}
