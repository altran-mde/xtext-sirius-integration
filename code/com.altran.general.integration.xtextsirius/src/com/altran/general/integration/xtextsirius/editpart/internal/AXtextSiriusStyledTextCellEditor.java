package com.altran.general.integration.xtextsirius.editpart.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.resource.XtextResource;

import com.altran.general.integration.xtextsirius.editpart.internal.fix.XtextStyledTextCellEditorExFix;
import com.altran.general.integration.xtextsirius.util.EcoreHelper;
import com.google.inject.Injector;

public abstract class AXtextSiriusStyledTextCellEditor extends XtextStyledTextCellEditorExFix {
	
	private final boolean multiLine;
	
	private EObject semanticElement;
	
	private EObject fallbackContainer;
	
	public AXtextSiriusStyledTextCellEditor(
			final int style,
			final @NonNull Injector injector,
			final boolean multiLine) {
		super(style, injector);
		this.multiLine = multiLine;
	}
	
	public boolean isMultiLine() {
		return this.multiLine;
	}

	public abstract @Nullable Object getValueToCommit();

	@Override
	protected void doSetValue(final Object value) {
		super.doSetValue(value);
		final EObject element = getSemanticElement();
		final XtextResource fakeResource = getXtextAdapter().getFakeResourceContext().getFakeResource();
		if (element != null) {
			EcoreHelper.updateFakeResourceUri(fakeResource, element.eResource().getURI());
		} else {
			final EObject fallback = getFallbackContainer();
			EcoreHelper.updateFakeResourceUri(fakeResource, fallback.eResource().getURI());
		}
	}

	public void setSemanticElement(final @Nullable EObject element) {
		this.semanticElement = element;
	}

	protected @Nullable EObject getSemanticElement() {
		return this.semanticElement;
	}

	public void setFallbackContainer(final @NonNull EObject fallbackContainer) {
		this.fallbackContainer = fallbackContainer;
	}

	protected EObject getFallbackContainer() {
		return this.fallbackContainer;
	}

}
