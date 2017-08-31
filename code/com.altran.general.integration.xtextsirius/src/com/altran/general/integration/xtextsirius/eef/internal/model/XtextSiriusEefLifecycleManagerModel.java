package com.altran.general.integration.xtextsirius.eef.internal.model;

import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EEFExpressionUtils;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.sirius.common.tools.internal.interpreter.FeatureInterpreter;
import org.eclipse.swt.widgets.Composite;

import com.altran.general.integration.xtextsirius.eef.internal.AXtextSiriusEefLifecycleManager;
import com.altran.general.integration.xtextsirius.eef.internal.XtextSiriusController;
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
		applyGridData(getWidget().getControl());
		
		this.controller = new XtextSiriusController(this.controlDescription, this.variableManager, this.interpreter,
				this.contextAdapter);
	}
	
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		
		this.newValueConsumer = (newValue) -> {
			if (newValue instanceof EObject) {
				final EObject eObject = (EObject) newValue;
				getWidget().update(eObject);
				getWidget().updateUri(eObject.eResource().getURI());
			} else {
				final String valueExpression = getWidgetDescription().getValueExpression();
				if (valueExpression.startsWith(FeatureInterpreter.PREFIX)) {
					final String featureName = valueExpression.substring(FeatureInterpreter.PREFIX.length());
					final Object self = this.variableManager.getVariables().get(EEFExpressionUtils.SELF);
					if (self instanceof EObject) {
						final EObject eSelf = (EObject) self;
						getWidget().update(eSelf);
						// final EStructuralFeature feature =
						// eSelf.eClass().getEStructuralFeature(featureName);
						// final EClassifier eType = feature.getEType();
						// if (eType instanceof EClass) {
						// final EObject root =
						// EcoreUtil.getRootContainer(eSelf);
						// final EObject rootClone = EcoreUtil.copy(root);
						// final EObject selfClone =
						// EcoreUtil.getEObject(rootClone,
						// EcoreUtil.getRelativeURIFragmentPath(root, eSelf));
						// final EObject newInstance =
						// eType.getEPackage().getEFactoryInstance()
						// .create((EClass) eType);
						// selfClone.eSet(feature, newInstance);
						// final XtextResource cloneResource = new
						// XtextResource(eSelf.eResource().getURI());
						// cloneResource.getContents().add(rootClone);
						// getWidget().update(newInstance);
						// }
					}
				}
				updateWidgetUriWithSelf();
			}
		};
		this.controller.onNewValue(this.newValueConsumer);
	}
	
	@Override
	public void aboutToBeHidden() {
		final EObject semanticElement = getWidget().getSemanticElement();
		// if (semanticElement != null) {
		// semanticElement = EcoreHelper.cloneAndProxify(semanticElement);
		// }
		persistIfDirty(semanticElement);
		super.aboutToBeHidden();
	}
	
	@Override
	public XtextSiriusWidgetModel getWidget() {
		return (XtextSiriusWidgetModel) super.getWidget();
	}
}
