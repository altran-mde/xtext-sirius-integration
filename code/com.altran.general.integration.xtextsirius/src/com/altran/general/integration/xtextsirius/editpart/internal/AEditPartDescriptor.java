package com.altran.general.integration.xtextsirius.editpart.internal;

import org.apache.commons.lang.StringUtils;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.altran.general.integration.xtextsirius.internal.IDescriptor;

public abstract class AEditPartDescriptor implements IDescriptor {
	
	private final String identifier;
	private final boolean multiLine;
	private final IXtextDirectEditConfiguration config;

	public AEditPartDescriptor(
			final @Nullable String identifier,
			final boolean multiLine,
			final @Nullable IXtextDirectEditConfiguration config) {
		this.identifier = identifier;
		this.multiLine = multiLine;
		this.config = config;
	}

	@Override
	public @NonNull String getIdentifier() {
		return this.identifier;
	}

	@Override
	public boolean isMultiLine() {
		return this.multiLine;
	}

	public @NonNull IXtextDirectEditConfiguration getConfig() {
		return this.config;
	}

	@Override
	public boolean isValid() {
		return StringUtils.isNotBlank(getIdentifier()) && getConfig() != null;
	}
	
	public abstract @NonNull IXtextAwareEditPart createEditPart(final @NonNull View view);
}
