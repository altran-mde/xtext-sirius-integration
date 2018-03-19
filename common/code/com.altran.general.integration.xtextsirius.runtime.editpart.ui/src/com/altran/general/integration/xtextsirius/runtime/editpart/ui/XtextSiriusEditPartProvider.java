package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiFunction;

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
import org.eclipse.sirius.diagram.ui.graphical.edit.part.specific.BracketEdgeEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.BundledImageEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.CustomStyleEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DDiagramEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeBeginNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeEndNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNode2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNode3EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNode4EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainer2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerName2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerViewNodeContainerCompartment2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeContainerViewNodeContainerCompartmentEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeList2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeListEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeListElementEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeListName2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeListNameEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeListViewNodeListCompartment2EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNodeListViewNodeListCompartmentEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DotEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.EllipseEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.GaugeCompositeEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.LozengeEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.NotationViewIDs;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.NoteEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.SquareEditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.WorkspaceImageEditPart;
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
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusBracketEdgeEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusBundledImageEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusCustomStyleEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusDiagramEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusDotEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusEdgeBeginNameEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusEdgeEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusEdgeEndNameEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusEllipseEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusGaugeCompositeEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusLozengeEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNode2EditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNode3EditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNode4EditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeContainer2EditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeContainerEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeContainerName2EditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeContainerNameEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeContainerViewNodeContainerCompartment2EditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeContainerViewNodeContainerCompartmentEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeList2EditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeListEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeListElementEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeListName2EditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeListNameEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeListViewNodeListCompartment2EditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeListViewNodeListCompartmentEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNodeNameEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusNoteEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusSquareEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusWorkspaceImageEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.AXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusValueDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.model.XtextSiriusEdgeNameEditPart;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class XtextSiriusEditPartProvider extends AbstractEditPartProvider {
	// @formatter:off
	private static final Map<Integer, BiFunction<@NonNull View, @NonNull AXtextSiriusDescriptor, @NonNull IGraphicalEditPart>> EDIT_PARTS = 
		ImmutableMap.<Integer, BiFunction<@NonNull View, @NonNull AXtextSiriusDescriptor, @NonNull IGraphicalEditPart>>builder()
			.put(DEdgeEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusEdgeEditPart(view, descriptor))
			.put(BracketEdgeEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusBracketEdgeEditPart(view, descriptor))
			.put(DNodeListEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeListEditPart(view, descriptor))
			.put(DNodeList2EditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeList2EditPart(view, descriptor))
			.put(DNodeContainerEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeContainerEditPart(view, descriptor))
			.put(DNodeContainer2EditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeContainer2EditPart(view, descriptor))
			.put(DNodeEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeEditPart(view, descriptor))
			.put(DNode3EditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNode3EditPart(view, descriptor))
			.put(DNode2EditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNode2EditPart(view, descriptor))
			.put(DNode4EditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNode4EditPart(view, descriptor))
			.put(DotEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusDotEditPart(view, descriptor))
			.put(SquareEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusSquareEditPart(view, descriptor))
			.put(BundledImageEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusBundledImageEditPart(view, descriptor))
			.put(WorkspaceImageEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusWorkspaceImageEditPart(view, descriptor))
			.put(GaugeCompositeEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusGaugeCompositeEditPart(view, descriptor))
			.put(NoteEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNoteEditPart(view, descriptor))
			.put(CustomStyleEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusCustomStyleEditPart(view, descriptor))
			.put(EllipseEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusEllipseEditPart(view, descriptor))
			.put(LozengeEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusLozengeEditPart(view, descriptor))
			.put(NotationViewIDs.DNODE_NAME_EDIT_PART_VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeNameEditPart(view, descriptor))
			.put(NotationViewIDs.DNODE_NAME_2_EDIT_PART_VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeNameEditPart(view, descriptor))
			.put(NotationViewIDs.DNODE_NAME_3_EDIT_PART_VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeNameEditPart(view, descriptor))
			.put(NotationViewIDs.DNODE_NAME_4_EDIT_PART_VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeNameEditPart(view, descriptor))
			.put(DNodeListElementEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeListElementEditPart(view, descriptor))
			.put(DNodeListNameEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeListNameEditPart(view, descriptor))
			.put(DNodeListName2EditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeListName2EditPart(view, descriptor))
			.put(DNodeContainerNameEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeContainerNameEditPart(view, descriptor))
			.put(DNodeContainerName2EditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeContainerName2EditPart(view, descriptor))
			.put(DEdgeNameEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusEdgeNameEditPart(view, descriptor))
			.put(DEdgeBeginNameEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusEdgeBeginNameEditPart(view, descriptor))
			.put(DEdgeEndNameEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusEdgeEndNameEditPart(view, descriptor))
			.put(DDiagramEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusDiagramEditPart(view, descriptor))
			.put(DNodeContainerViewNodeContainerCompartmentEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeContainerViewNodeContainerCompartmentEditPart(view, descriptor))
			.put(DNodeContainerViewNodeContainerCompartment2EditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeContainerViewNodeContainerCompartment2EditPart(view, descriptor))
			.put(DNodeListViewNodeListCompartmentEditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeListViewNodeListCompartmentEditPart(view, descriptor))
			.put(DNodeListViewNodeListCompartment2EditPart.VISUAL_ID, (@NonNull View view, @NonNull AXtextSiriusDescriptor descriptor) -> new XtextSiriusNodeListViewNodeListCompartment2EditPart(view, descriptor))
			.build();
	// @formatter:on

	private static final Set<Integer> EDGE_LABEL_EDIT_VISUAL_IDS = ImmutableSet.of(
			DEdgeBeginNameEditPart.VISUAL_ID,
			DEdgeNameEditPart.VISUAL_ID,
			DEdgeEndNameEditPart.VISUAL_ID);

	@Override
	public boolean provides(final IOperation operation) {
		final RepresentationElementMapping mapping = extractMapping(operation);
		final View view = ((IEditPartOperation) operation).getView();
		Integer viewType = Integer.parseInt(view.getType());
		
		if (mapping instanceof AbstractNodeMapping) {
			if (((AbstractNodeMapping) mapping).getLabelDirectEdit() instanceof AXtextDirectEditLabel) {
				return EDIT_PARTS.containsKey(viewType);
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
	
	@Override
	public IGraphicalEditPart createGraphicEditPart(final View view) {
		final RepresentationElementMapping mapping = extractMapping(view);
		Integer viewType = Integer.parseInt(view.getType());
		
		if (mapping instanceof AbstractNodeMapping) {
			final DirectEditLabel labelDirectEdit = ((AbstractNodeMapping) mapping).getLabelDirectEdit();
			
			if (labelDirectEdit instanceof IXtextDirectEditModelDescription) {
				final IXtextDirectEditModelDescription modelNodeDescription = (IXtextDirectEditModelDescription) labelDirectEdit;
				XtextSiriusModelDescriptor descriptor = new XtextSiriusModelDescriptor(resolveLanguageInjector(modelNodeDescription), modelNodeDescription);
				
				if (EDIT_PARTS.containsKey(viewType)) {
					return EDIT_PARTS.get(viewType).apply(view, descriptor);
				}
				
			} else if (labelDirectEdit instanceof IXtextDirectEditValueDescription) {
				final IXtextDirectEditValueDescription valueNodeDescription = (IXtextDirectEditValueDescription) labelDirectEdit;
				XtextSiriusValueDescriptor descriptor = new XtextSiriusValueDescriptor(resolveLanguageInjector(valueNodeDescription), valueNodeDescription);

				if (EDIT_PARTS.containsKey(viewType)) {
					return EDIT_PARTS.get(viewType).apply(view, descriptor);
				}
			}
			
		} else if (mapping instanceof EdgeMapping && isEdgeLabelEdit(view)) {
			final IXtextEdgeLabelDirectEditDescription edgeLabelMapping = searchForEdgeLabelMapping(
					(EdgeMapping) mapping);
			
			if (edgeLabelMapping instanceof XtextEdgeLabelDirectEditModelDescription) {
				final IXtextDirectEditModelDescription modelEdgeDescription = (IXtextDirectEditModelDescription) edgeLabelMapping;
				XtextSiriusModelDescriptor descriptor = new XtextSiriusModelDescriptor(resolveLanguageInjector(modelEdgeDescription), modelEdgeDescription);
				return new XtextSiriusEdgeNameEditPart(descriptor, view);
				
			} else if (edgeLabelMapping instanceof XtextEdgeLabelDirectEditValueDescription) {
				final XtextEdgeLabelDirectEditValueDescription valueEdgeDescription = (XtextEdgeLabelDirectEditValueDescription) edgeLabelMapping;
				XtextSiriusValueDescriptor descriptor = new XtextSiriusValueDescriptor(resolveLanguageInjector(valueEdgeDescription), valueEdgeDescription);

				if (EDIT_PARTS.containsKey(viewType)) {
					return EDIT_PARTS.get(viewType).apply(view, descriptor);
				}
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
