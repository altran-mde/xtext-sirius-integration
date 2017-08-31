package com.altran.general.integration.xtextsirius.editpart.internal.model;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.DEdge;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.altran.general.integration.xtextsirius.editpart.internal.AEditPartDescriptor;

public class EditPartDescriptorModel extends AEditPartDescriptor {
	private final @NonNull Collection<@Nullable String> editableFeatures;

	public EditPartDescriptorModel(
			final @Nullable String identifier,
			final boolean multiLine,
			final @Nullable IXtextDirectEditConfiguration config,
			final @NonNull Collection<@Nullable String> editableFeatures) {
		super(identifier, multiLine, config);
		this.editableFeatures = editableFeatures;
	}

	@Override
	public @NonNull IXtextAwareEditPart createEditPart(final @NonNull View view) {
		if (view.getElement() instanceof DEdge) {
			return new XtextSiriusEdgeNameEditPartModel(this, view);
		}

		return new XtextSiriusEditPartModel(this, view);
	}

	public Collection<@NonNull String> getEditableFeatures() {
		return (Set<@NonNull String>) this.editableFeatures.stream()
				.filter(f -> StringUtils.isNotBlank(f))
				.collect(Collectors.toSet());
	}
}
