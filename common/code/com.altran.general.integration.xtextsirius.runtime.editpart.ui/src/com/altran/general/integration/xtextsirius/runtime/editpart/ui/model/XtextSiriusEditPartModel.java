package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusEditPart;
import com.google.inject.Injector;

public class XtextSiriusEditPartModel extends AXtextSiriusEditPart implements IXtextSiriusEditPartModel {
	private final Collection<@NonNull String> editableFeatures;

	public XtextSiriusEditPartModel(final @NonNull IXtextDirectEditModelDescription description,
			final @NonNull Injector injector,
			final @NonNull View view) {
		super(description, injector, view);
		this.editableFeatures = description.getEditableFeatures();
	}
	
	@Override
	protected @NonNull DirectEditManager createDirectEditManager() {
		return new XtextSiriusDirectEditManagerModel(this, getInjector(),
				translateToStyle(), isMultiLine(), getEditableFeatures());
	}
	
	@Override
	protected void setContext(final Resource res) {
		// we don't use this API
	}

	@Override
	public @NonNull Collection<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}
}
