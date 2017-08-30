package com.altran.general.integration.xtextsirius.editpart.internal.value;

import org.apache.commons.lang.StringUtils;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.altran.general.integration.xtextsirius.editpart.internal.AEditPartDescriptor;

public class EditPartDescriptorValue extends AEditPartDescriptor {
	private final @Nullable String prefixText;
	private final @Nullable String suffixText;

	public EditPartDescriptorValue(
			final @Nullable String identifier,
			final boolean multiLine,
			final @Nullable IXtextDirectEditConfiguration config,
			final @Nullable String prefixText,
			final @Nullable String suffixText) {
		super(identifier, multiLine, config);
		this.prefixText = prefixText;
		this.suffixText = suffixText;
	}
	
	@Override
	public @NonNull XtextLabelEditPart createEditPart(final @NonNull View view) {
		return new XtextSiriusEditPartValue(this, view);
	}

	public @NonNull String getPrefixText() {
		return StringUtils.defaultString(this.prefixText);
	}
	
	public @NonNull String getSuffixText() {
		return StringUtils.defaultString(this.suffixText);
	}
}
