package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.description.RepresentationElementMapping;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;
import org.eclipse.xtext.EcoreUtil2;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.AXtextDirectEditLabel;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextEdgeLabelDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.runtime.XtextLanguageInjectorManager;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusValueDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.model.XtextSiriusBorderEditPartModel;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.model.XtextSiriusEdgeNameEditPartModel;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.model.XtextSiriusEditPartModel;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.value.XtextSiriusEditPartValue;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Injector;

public class XtextSiriusEditPartProvider extends AbstractEditPartProvider {
	@SuppressWarnings("restriction")
	private static final Set<Integer> EDGE_LABEL_EDIT_VISUAL_IDS = ImmutableSet.of(
			org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeBeginNameEditPart.VISUAL_ID,
			org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeNameEditPart.VISUAL_ID,
			org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEndNameEditPart.VISUAL_ID);
	
	@SuppressWarnings("restriction")
	private static final Set<Integer> BORDERED_NODE_EDIT_VISUAL_IDS = ImmutableSet.of(
			org.eclipse.sirius.diagram.ui.internal.edit.parts.DNode4EditPart.VISUAL_ID,
			org.eclipse.sirius.diagram.ui.internal.edit.parts.NotationViewIDs.DNODE_NAME_4_EDIT_PART_VISUAL_ID,
			org.eclipse.sirius.diagram.ui.internal.edit.parts.NotationViewIDs.DNODE_NAME_EDIT_PART_VISUAL_ID);
	
	@SuppressWarnings("restriction")
	private static final Set<Integer> BORDERED_NODE_LABEL_EDIT_VISUAL_IDS = ImmutableSet.of(
			org.eclipse.sirius.diagram.ui.internal.edit.parts.NotationViewIDs.DNODE_NAME_4_EDIT_PART_VISUAL_ID,
			org.eclipse.sirius.diagram.ui.internal.edit.parts.NotationViewIDs.DNODE_NAME_EDIT_PART_VISUAL_ID);
	
	@Override
	public boolean provides(final IOperation operation) {
		final RepresentationElementMapping mapping = extractMapping(operation);
		final View view = ((IEditPartOperation) operation).getView();
		
		if (mapping instanceof AbstractNodeMapping) {
			if (((AbstractNodeMapping) mapping).getLabelDirectEdit() instanceof AXtextDirectEditLabel) {
				if (isBorderNode(view)) {
					return isBorderNodeLabel(view);
				} else {
					return !isBorderNodeLabel(view);
				}
			}
		} else if (mapping instanceof EdgeMapping) {
			if (isEdgeLabelEdit(view)) {
				return searchForEdgeLabelMapping((EdgeMapping) mapping) != null;
			}
		}
		
		return super.provides(operation);
	}
	
	protected boolean isEdgeLabelEdit(final View view) {
		try {
			return EDGE_LABEL_EDIT_VISUAL_IDS.contains(Integer.parseInt(view.getType()));
		} catch (final NumberFormatException e) {
			return false;
		}
	}
	
	protected boolean isBorderNode(final View view) {
		try {
			return BORDERED_NODE_EDIT_VISUAL_IDS.contains(Integer.parseInt(view.getType()));
		} catch (final NumberFormatException e) {
			return false;
		}
	}
	
	protected boolean isBorderNodeLabel(final View view) {
		try {
			return BORDERED_NODE_LABEL_EDIT_VISUAL_IDS.contains(Integer.parseInt(view.getType()));
		} catch (final NumberFormatException e) {
			return false;
		}
	}
	
	@Override
	public IGraphicalEditPart createGraphicEditPart(final View view) {
		final RepresentationElementMapping mapping = extractMapping(view);
		
		if (mapping instanceof AbstractNodeMapping) {
			final DirectEditLabel labelDirectEdit = ((AbstractNodeMapping) mapping).getLabelDirectEdit();
			
			if (labelDirectEdit instanceof IXtextDirectEditModelDescription) {
				final IXtextDirectEditModelDescription modelNodeDescription = (IXtextDirectEditModelDescription) labelDirectEdit;
				XtextSiriusModelDescriptor descriptor = new XtextSiriusModelDescriptor(resolveLanguageInjector(modelNodeDescription), modelNodeDescription);
				if (isBorderNode(view)) {
					if (isBorderNodeLabel(view)) {
						return new XtextSiriusBorderEditPartModel(descriptor, view);
					}
				} else {
					if (!isBorderNodeLabel(view)) {
						return new XtextSiriusEditPartModel(descriptor, view);
					}
				}
				
			} else if (labelDirectEdit instanceof IXtextDirectEditValueDescription) {
				final IXtextDirectEditValueDescription valueNodeDescription = (IXtextDirectEditValueDescription) labelDirectEdit;
				XtextSiriusValueDescriptor descriptor = new XtextSiriusValueDescriptor(resolveLanguageInjector(valueNodeDescription), valueNodeDescription);
				return new XtextSiriusEditPartValue(descriptor, view);
			}
			
		} else if (mapping instanceof EdgeMapping && isEdgeLabelEdit(view)) {
			final IXtextEdgeLabelDirectEditDescription edgeLabelMapping = searchForEdgeLabelMapping(
					(EdgeMapping) mapping);
			
			if (edgeLabelMapping instanceof XtextEdgeLabelDirectEditModelDescription) {
				final IXtextDirectEditModelDescription modelEdgeDescription = (IXtextDirectEditModelDescription) edgeLabelMapping;
				XtextSiriusModelDescriptor descriptor = new XtextSiriusModelDescriptor(resolveLanguageInjector(modelEdgeDescription), modelEdgeDescription);
				return new XtextSiriusEdgeNameEditPartModel(descriptor, view);
				
			} else if (edgeLabelMapping instanceof XtextEdgeLabelDirectEditValueDescription) {
				final XtextEdgeLabelDirectEditValueDescription valueEdgeDescription = (XtextEdgeLabelDirectEditValueDescription) edgeLabelMapping;
				XtextSiriusValueDescriptor descriptor = new XtextSiriusValueDescriptor(resolveLanguageInjector(valueEdgeDescription), valueEdgeDescription);
				return new XtextSiriusEditPartValue(descriptor, view);
			}
		}
		
		return super.createGraphicEditPart(view);
	}
	
	protected @Nullable RepresentationElementMapping extractMapping(final IOperation operation) {
		if (operation instanceof CreateGraphicEditPartOperation) {
			final View view = ((IEditPartOperation) operation).getView();
			return extractMapping(view);
		}
		
		return null;
	}
	
	protected RepresentationElementMapping extractMapping(final View view) {
		if (view.getElement() instanceof DRepresentationElement) {
			final DRepresentationElement representationElement = (DRepresentationElement) view.getElement();
			final RepresentationElementMapping mapping = representationElement.getMapping();
			return mapping;
		}
		
		return null;
	}
	
	protected @Nullable IXtextEdgeLabelDirectEditDescription searchForEdgeLabelMapping(final EdgeMapping mapping) {
		final List<@NonNull BasicLabelStyleDescription> edgeLabelStyles = EcoreUtil2.getAllContentsOfType(mapping,
				BasicLabelStyleDescription.class);
		
		if (!edgeLabelStyles.isEmpty()) {
			final List<@NonNull IXtextEdgeLabelDirectEditDescription> xtextEdgeLabelDirectEdits = EcoreUtil2
					.getAllContentsOfType(EcoreUtil.getRootContainer(mapping),
							IXtextEdgeLabelDirectEditDescription.class);
			
			final Optional<@NonNull IXtextEdgeLabelDirectEditDescription> result = xtextEdgeLabelDirectEdits.stream()
					.filter(elde -> elde.getEdgeLabelMappings().stream()
							.anyMatch(labelMappings -> edgeLabelStyles.contains(labelMappings)))
					.findAny();
			
			if (result.isPresent()) {
				return result.get();
			}
			
			return null;
		}
		
		return null;
	}
	
	protected @NonNull Injector resolveLanguageInjector(final IXtextDirectEditDescription description) {
		final Injector result = XtextLanguageInjectorManager.getInstance()
				.resolveInjectorId(description.getInjectorId());
		
		if (result == null) {
			throw new IllegalArgumentException("Cannot find Xtext Language Injector id=" + description.getInjectorId());
		}
		
		return result;
	}
}
