package com.altran.general.integration.xtextsirius.editpart.internal.model;

import java.util.Collection;

import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.editpart.internal.IXtextSiriusAwareLabelEditPart;

public interface IXtextSiriusEditPartModel extends IXtextSiriusAwareLabelEditPart {
	public @NonNull Collection<@NonNull String> getEditableFeatures();

}
