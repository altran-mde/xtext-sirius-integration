package com.altran.general.integration.xtextsirius.editpart.internal.model;

import org.apache.commons.lang.StringUtils;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.altran.general.integration.xtextsirius.editpart.internal.AEditPartDescriptor;

public class EditPartDescriptorModel extends AEditPartDescriptor {
	private final String semanticType;

	public EditPartDescriptorModel(
			final @Nullable String identifier,
			final boolean multiLine,
			final @Nullable IXtextDirectEditConfiguration config,
			final @Nullable String semanticType) {
		super(identifier, multiLine, config);
		this.semanticType = semanticType;
	}
	
	public String getSemanticType() {
		return this.semanticType;
	}
	
	@Override
	public boolean isValid() {
		return StringUtils.isNotBlank(getSemanticType()) && super.isValid();
	}
	
	@Override
	public @NonNull XtextLabelEditPart createEditPart(final @NonNull View view) {
		return new XtextSiriusEditPartModel(this, view);
	}
}
