package com.altran.general.integration.xtextsirius.runtime.editor;

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


	public abstract void doSetValue(final @Nullable Object value, final @Nullable EStructuralFeature valueFeature);

	public abstract Object commit(final @NonNull EObject target, final @NonNull EStructuralFeature valueFeature);
	
	protected @Nullable Object getValueToCommit() throws AXtextSiriusIssueException {
		return getCallback().getValue();
	}
	
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
