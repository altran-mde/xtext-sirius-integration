package com.altran.general.integration.xtextsirius.runtime.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.resource.XtextResource;

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.util.EvaluateHelper;
import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;
import com.google.inject.Injector;

public abstract class AXtextSiriusEditor {
	private final @NonNull IXtextSiriusDescriptor descriptor;
	private IXtextSiriusEditorCallback callback;

	private EObject semanticElement;
	private EObject fallbackContainer;


	public AXtextSiriusEditor(final @NonNull IXtextSiriusDescriptor descriptor) {
		this.descriptor = descriptor;
	}

	public void doSetValue(final Object value) {
		getCallback().callbackSetValue(value);
		final EObject element = getSemanticElement();
		final XtextResource fakeResource = getCallback().getFakeResource();
		if (element != null) {
			FakeResourceUtil.getInstance().updateFakeResourceUri(fakeResource, element.eResource().getURI());
		} else {
			final EObject fallback = getFallbackContainer();
			FakeResourceUtil.getInstance().updateFakeResourceUri(fakeResource, fallback.eResource().getURI());
		}
		
		getCallback().updateFakeResourceContext();

		getCallback().resetDirty();
		
		return;
	}

	public abstract @Nullable Object getValueToCommit() throws AXtextSiriusIssueException;

	protected @NonNull String interpret(final @NonNull String expression) {
		final EObject self = getSemanticElement();
		if (self != null) {
			return EvaluateHelper.getInstance().evaluateString(expression, self);
		}

		return "";
	}

	public Injector getInjector() {
		return getDescriptor().getInjector();
	}

	public boolean isMultiLine() {
		return getDescriptor().isMultiLine();
	}

	public void setSemanticElement(final @Nullable EObject element) {
		this.semanticElement = element;
	}

	public @Nullable EObject getSemanticElement() {
		return this.semanticElement;
	}

	public void setFallbackContainer(final @NonNull EObject fallbackContainer) {
		this.fallbackContainer = fallbackContainer;
	}

	public EObject getFallbackContainer() {
		return this.fallbackContainer;
	}
	
	public IXtextSiriusDescriptor getDescriptor() {
		return this.descriptor;
	}

	protected IXtextSiriusEditorCallback getCallback() {
		return this.callback;
	}
	
	public void setCallback(final IXtextSiriusEditorCallback callback) {
		this.callback = callback;
	}
}
