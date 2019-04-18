package com.altran.general.integration.xtextsirius.runtime.editor;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.util.EMerger;
import com.altran.general.integration.xtextsirius.runtime.util.EvaluateHelper;
import com.google.inject.Injector;

/**
 * Takes care of all Xtext/Sirius Integration magic except {@linkplain EMerger}
 *
 * @param <C>
 */
public abstract class AXtextSiriusEditor<C extends IXtextSiriusEditorCallback> {
	private final IXtextSiriusDescriptor descriptor;
	private C callback;

	private @Nullable EObject semanticElement;
	private @Nullable EObject fallbackContainer;


	public AXtextSiriusEditor(final @NonNull IXtextSiriusDescriptor descriptor) {
		this.descriptor = descriptor;
	}


	public abstract void doSetValue(final @Nullable Object value, final @Nullable String valueFeature);

	public abstract Object commit(final @NonNull EObject target, final @Nullable String valueFeature);
	
	protected abstract @Nullable Object getValueToCommit() throws AXtextSiriusIssueException;

	public void setCallback(final C callback) {
		this.callback = callback;
	}

	public void setSemanticElement(final @Nullable EObject element) {
		this.semanticElement = element;
	}

	public void setFallbackContainer(final @NonNull EObject fallbackContainer) {
		this.fallbackContainer = fallbackContainer;
	}

	public @Nullable EObject getSemanticElement() {
		return this.semanticElement;
	}

	public EObject getFallbackContainer() {
		return this.fallbackContainer;
	}
	
	protected void updateCallbackSetValue(final @Nullable Object value, final int offset, final int length) {
		getCallback().callbackSetValue(value, offset, length);
	}

	protected @Nullable EStructuralFeature convertValueFeature(final @Nullable String featureName) {
		return convertValueFeature(getSemanticElement(), featureName);
	}

	protected @Nullable EStructuralFeature convertValueFeature(final @Nullable EObject element,
			final @Nullable String featureName) {
		if (element != null) {
			if (StringUtils.isNotBlank(featureName)) {
				final EStructuralFeature result = element.eClass().getEStructuralFeature(featureName);
				if (result != null) {
					return result;
				}
			}
			return element.eContainingFeature();
		} else {
			final EObject parent = getFallbackContainer();
			if (StringUtils.isNotBlank(featureName)) {
				return parent.eClass().getEStructuralFeature(featureName);
			}
		}

		return null;
	}
	
	protected @NonNull EStructuralFeature enforceValueFeature(final @NonNull EObject fallback,
			final @Nullable String featureName) {
		final EStructuralFeature converted = convertValueFeature(featureName);
		if (converted != null) {
			return converted;
		}
		
		final EStructuralFeature fallbackFeature = convertValueFeature(fallback, featureName);
		if (fallbackFeature != null) {
			return fallbackFeature;
		}
		
		throw new IllegalArgumentException("Cannot find valueFeature " + featureName + " for " + fallback);
	}
	
	protected @NonNull EObject adjustTarget(final @NonNull EObject target, final @Nullable String valueFeatureName) {
		if (StringUtils.isBlank(valueFeatureName) || target.eClass().getEStructuralFeature(valueFeatureName) == null) {
			return target.eContainer();
		}

		return target;
	}

	protected @NonNull String interpret(final @NonNull String expression) {
		final EObject self = getSemanticElement();
		if (self != null) {
			return EvaluateHelper.getInstance().evaluateString(expression, self);
		}

		return "";
	}

	protected Injector getInjector() {
		return getDescriptor().getInjector();
	}

	protected boolean isMultiLine() {
		return getDescriptor().isMultiLine();
	}

	protected IXtextSiriusDescriptor getDescriptor() {
		return this.descriptor;
	}

	protected C getCallback() {
		return this.callback;
	}
}
