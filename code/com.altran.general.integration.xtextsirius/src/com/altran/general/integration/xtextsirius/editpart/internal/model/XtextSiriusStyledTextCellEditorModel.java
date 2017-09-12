package com.altran.general.integration.xtextsirius.editpart.internal.model;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.altran.general.integration.xtextsirius.editpart.internal.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.util.FakeResourceUtil;
import com.altran.general.integration.xtextsirius.util.ModelRegionEditorPreparer;
import com.google.inject.Injector;

public class XtextSiriusStyledTextCellEditorModel extends AXtextSiriusStyledTextCellEditor {
	private SemanticElementLocation semanticElementLocation;
	
	private final Collection<@NonNull String> editableFeatures;
	
	public XtextSiriusStyledTextCellEditorModel(
			final int style,
			final @NonNull Injector injector,
			final boolean multiLine,
			final @NonNull Collection<@NonNull String> editableFeatures) {
		super(style, injector, multiLine);
		this.editableFeatures = editableFeatures;
	}
	
	@Override
	protected void doSetValue(final Object value) {
		final EObject semanticElement = getSemanticElement();

		if (semanticElement == null) {
			return;
		}

		final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(semanticElement, getInjector(),
				isMultiLine(), getEditableFeatures());

		super.doSetValue(preparer.getText());
		
		this.semanticElementLocation = preparer.getSemanticElementLocation();
		
		getXtextAdapter().resetVisibleRegion();
		getXtextAdapter().setVisibleRegion(preparer.getTextRegion().getOffset(), preparer.getTextRegion().getLength());
	}
	
	protected @Nullable SemanticElementLocation getSemanticElementLocation() {
		return this.semanticElementLocation;
	}

	@Override
	public @Nullable Object getValueToCommit() {
		final SemanticElementLocation location = getSemanticElementLocation();
		if (location != null) {
			final EObject element = location
					.resolve(getXtextAdapter().getXtextParseResult().getRootASTElement().eResource());
			if (element != null) {
				return FakeResourceUtil.getInstance().proxify(element, EcoreUtil.getURI(getSemanticElement()));
			}
		}
		
		return null;
	}

	public Collection<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}
}
