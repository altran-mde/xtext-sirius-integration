package com.altran.general.integration.xtextsirius.editpart.internal.model;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.altran.general.integration.xtextsirius.editpart.internal.AEditPartDescriptor;

public class EditPartDescriptorModel extends AEditPartDescriptor {
	public EditPartDescriptorModel(
			final @Nullable String identifier,
			final boolean multiLine,
			final @Nullable IXtextDirectEditConfiguration config) {
		super(identifier, multiLine, config);
	}
	
	@Override
	public @NonNull XtextLabelEditPart createEditPart(final @NonNull View view) {
		return new XtextSiriusEditPartModel(this, view);
	}
}
