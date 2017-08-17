package com.altran.general.integration.xtextsirius.editpart.internal;

import org.apache.commons.lang.StringUtils;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;

public abstract class AEditPartDescriptor {
	
	private final String identifier;
	private final boolean singleLine;
	private final IXtextDirectEditConfiguration config;

	public AEditPartDescriptor(final @Nullable String identifier, final boolean singleLine,
			final @Nullable IXtextDirectEditConfiguration config) {
		this.identifier = identifier;
		this.singleLine = singleLine;
		this.config = config;
	}

	public @NonNull String getIdentifier() {
		return this.identifier;
	}

	public boolean isSingleLine() {
		return this.singleLine;
	}

	public @NonNull IXtextDirectEditConfiguration getConfig() {
		return this.config;
	}

	public boolean isValid() {
		return StringUtils.isNotBlank(getIdentifier()) &&
				getConfig() instanceof IXtextDirectEditConfiguration;
	}
	
	public abstract @NonNull XtextLabelEditPart createEditPart(final @NonNull View view);
}
