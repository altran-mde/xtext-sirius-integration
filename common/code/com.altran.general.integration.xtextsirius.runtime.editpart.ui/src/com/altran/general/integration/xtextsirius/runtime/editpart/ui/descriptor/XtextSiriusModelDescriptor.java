package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import java.util.Collection;

import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.IXtextSiriusAwareLabelEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.model.XtextSiriusDirectEditManagerModel;
import com.google.common.collect.Lists;
import com.google.inject.Injector;

public class XtextSiriusModelDescriptor extends AXtextSiriusDescriptor {

	private final @NonNull Collection<@NonNull String> editableFeatures;

	public XtextSiriusModelDescriptor(final @NonNull Injector injector, final boolean multiLine, final @NonNull Collection<@NonNull String> editableFeatures) {
		super(injector, multiLine);
		this.editableFeatures = editableFeatures;
	}
	
	public XtextSiriusModelDescriptor(final @NonNull Injector injector, final @NonNull IXtextDirectEditModelDescription description) {
		super(injector, description);
		this.editableFeatures = Lists.newArrayList(description.getEditableFeatures());
	}

	public @NonNull Collection<@NonNull String> getEditableFeatures() {
		return editableFeatures;
	}

	@Override
	public @NonNull XtextSiriusDirectEditManager createDirectEditManager(final @NonNull IXtextSiriusAwareLabelEditPart editPart) {
		return new XtextSiriusDirectEditManagerModel(editPart, this);
	}
}
