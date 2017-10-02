package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import java.util.Collection;

import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.IXtextSiriusAwareLabelEditPart;

public interface IXtextSiriusEditPartModel extends IXtextSiriusAwareLabelEditPart {
	public @NonNull Collection<@NonNull String> getEditableFeatures();

}
