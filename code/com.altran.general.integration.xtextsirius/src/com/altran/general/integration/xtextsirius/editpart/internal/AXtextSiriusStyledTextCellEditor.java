package com.altran.general.integration.xtextsirius.editpart.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.editpart.internal.fix.XtextStyledTextCellEditorExFix;
import com.altran.general.integration.xtextsirius.util.EcoreHelper;
import com.google.inject.Injector;

public abstract class AXtextSiriusStyledTextCellEditor extends XtextStyledTextCellEditorExFix {
	
	private final boolean multiLine;
	
	private EObject semanticElement;
	
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
		if (element != null) {
			EcoreHelper.updateFakeResourceUri(getXtextAdapter().getFakeResourceContext().getFakeResource(),
					element.eResource().getURI());
		}
	}

	public void setSemanticElement(final @Nullable EObject element) {
		this.semanticElement = element;
	}

	protected @Nullable EObject getSemanticElement() {
		return this.semanticElement;
	}
}
