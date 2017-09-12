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
import com.altran.general.integration.xtextsirius.internal.IDescriptorModel;

public class EditPartDescriptorModel extends AEditPartDescriptor implements IDescriptorModel {
	@SuppressWarnings("restriction")
	public static enum EdgeLabelPosition {
		BEGIN(org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeBeginNameEditPart.VISUAL_ID),
		CENTER(org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeNameEditPart.VISUAL_ID),
		END(org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEndNameEditPart.VISUAL_ID);

		private final int visualId;

		EdgeLabelPosition(final int visualId) {
			this.visualId = visualId;
		}
		
		public int getVisualId() {
			return this.visualId;
		}
		
		public static @Nullable EdgeLabelPosition resolveByVisualId(final int visualId) {
			for (final EdgeLabelPosition pos : values()) {
				if (pos.getVisualId() == visualId) {
					return pos;
				}
			}

			return null;
		}
	}

	private final Collection<@Nullable String> editableFeatures;
	private final String edgeLabelPositionString;
	private EdgeLabelPosition edgeLabelPosition = null;

	public EditPartDescriptorModel(
			final @Nullable String identifier,
			final boolean multiLine,
			final @Nullable IXtextDirectEditConfiguration config,
			final @Nullable String edgeLabelPosition,
			final @NonNull Collection<@Nullable String> editableFeatures) {
		super(identifier, multiLine, config);
		this.edgeLabelPositionString = edgeLabelPosition;
		this.editableFeatures = editableFeatures;
	}

	@Override
	public @NonNull IXtextAwareEditPart createEditPart(final @NonNull View view) {
		if (view.getElement() instanceof DEdge) {
			return new XtextSiriusEdgeNameEditPartModel(this, view);
		}

		return new XtextSiriusEditPartModel(this, view);
	}

	@Override
	public @NonNull Collection<@NonNull String> getEditableFeatures() {
		return (Set<@NonNull String>) this.editableFeatures.stream()
				.filter(f -> StringUtils.isNotBlank(f))
				.collect(Collectors.toSet());
	}
	
	public EdgeLabelPosition getEdgeLabelPosition() {
		parseEdgeLabelPosition();
		return this.edgeLabelPosition;
	}

	@Override
	public boolean isValid() {
		try {
			parseEdgeLabelPosition();
		} catch (final IllegalArgumentException e) {
			return false;
		}

		return super.isValid();
	}
	
	@Override
	public boolean matches(@NonNull final View view) {
		return super.matches(view) && Integer.toString(getEdgeLabelPosition().getVisualId()).equals(view.getType());
	}

	protected void parseEdgeLabelPosition() {
		if (this.edgeLabelPosition == null) {
			if (StringUtils.isBlank(this.edgeLabelPositionString)) {
				this.edgeLabelPosition = EdgeLabelPosition.CENTER;
			} else {
				this.edgeLabelPosition = EdgeLabelPosition.valueOf(this.edgeLabelPositionString.toUpperCase());
			}
		}
	}
}
