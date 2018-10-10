/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import java.util.Map;
import java.util.function.BiFunction;

import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
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

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.AXtextDirectEditLabel;
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
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.delegate.XtextSiriusEdgeNameEditPart;
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
import com.google.common.collect.ImmutableMap;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class XtextSiriusEditPartProvider extends AbstractEditPartProvider {
	// @formatter:off
	private static final Map<Integer, BiFunction<@NonNull View, @NonNull AXtextSiriusDescriptor, @NonNull IGraphicalEditPart>> EDIT_PARTS =
		ImmutableMap.<Integer, BiFunction<@NonNull View, @NonNull AXtextSiriusDescriptor, @NonNull IGraphicalEditPart>>builder()
			.put(DEdgeEditPart.VISUAL_ID,                                        (v, d) -> new XtextSiriusEdgeEditPart(v, d))
			.put(BracketEdgeEditPart.VISUAL_ID,                                  (v, d) -> new XtextSiriusBracketEdgeEditPart(v, d))
			.put(DNodeListEditPart.VISUAL_ID,                                    (v, d) -> new XtextSiriusNodeListEditPart(v, d))
			.put(DNodeList2EditPart.VISUAL_ID,                                   (v, d) -> new XtextSiriusNodeList2EditPart(v, d))
			.put(DNodeContainerEditPart.VISUAL_ID,                               (v, d) -> new XtextSiriusNodeContainerEditPart(v, d))
			.put(DNodeContainer2EditPart.VISUAL_ID,                              (v, d) -> new XtextSiriusNodeContainer2EditPart(v, d))
			.put(DNodeEditPart.VISUAL_ID,                                        (v, d) -> new XtextSiriusNodeEditPart(v, d))
			.put(DNode3EditPart.VISUAL_ID,                                       (v, d) -> new XtextSiriusNode3EditPart(v, d))
			.put(DNode2EditPart.VISUAL_ID,                                       (v, d) -> new XtextSiriusNode2EditPart(v, d))
			.put(DNode4EditPart.VISUAL_ID,                                       (v, d) -> new XtextSiriusNode4EditPart(v, d))
			.put(DotEditPart.VISUAL_ID,                                          (v, d) -> new XtextSiriusDotEditPart(v, d))
			.put(SquareEditPart.VISUAL_ID,                                       (v, d) -> new XtextSiriusSquareEditPart(v, d))
			.put(BundledImageEditPart.VISUAL_ID,                                 (v, d) -> new XtextSiriusBundledImageEditPart(v, d))
			.put(WorkspaceImageEditPart.VISUAL_ID,                               (v, d) -> new XtextSiriusWorkspaceImageEditPart(v, d))
			.put(GaugeCompositeEditPart.VISUAL_ID,                               (v, d) -> new XtextSiriusGaugeCompositeEditPart(v, d))
			.put(NoteEditPart.VISUAL_ID,                                         (v, d) -> new XtextSiriusNoteEditPart(v, d))
			.put(CustomStyleEditPart.VISUAL_ID,                                  (v, d) -> new XtextSiriusCustomStyleEditPart(v, d))
			.put(EllipseEditPart.VISUAL_ID,                                      (v, d) -> new XtextSiriusEllipseEditPart(v, d))
			.put(LozengeEditPart.VISUAL_ID,                                      (v, d) -> new XtextSiriusLozengeEditPart(v, d))
			.put(NotationViewIDs.DNODE_NAME_EDIT_PART_VISUAL_ID,                 (v, d) -> new XtextSiriusNodeNameEditPart(v, d))
			.put(NotationViewIDs.DNODE_NAME_2_EDIT_PART_VISUAL_ID,               (v, d) -> new XtextSiriusNodeNameEditPart(v, d))
			.put(NotationViewIDs.DNODE_NAME_3_EDIT_PART_VISUAL_ID,               (v, d) -> new XtextSiriusNodeNameEditPart(v, d))
			.put(NotationViewIDs.DNODE_NAME_4_EDIT_PART_VISUAL_ID,               (v, d) -> new XtextSiriusNodeNameEditPart(v, d))
			.put(DNodeListElementEditPart.VISUAL_ID,                             (v, d) -> new XtextSiriusNodeListElementEditPart(v, d))
			.put(DNodeListNameEditPart.VISUAL_ID,                                (v, d) -> new XtextSiriusNodeListNameEditPart(v, d))
			.put(DNodeListName2EditPart.VISUAL_ID,                               (v, d) -> new XtextSiriusNodeListName2EditPart(v, d))
			.put(DNodeContainerNameEditPart.VISUAL_ID,                           (v, d) -> new XtextSiriusNodeContainerNameEditPart(v, d))
			.put(DNodeContainerName2EditPart.VISUAL_ID,                          (v, d) -> new XtextSiriusNodeContainerName2EditPart(v, d))
			.put(DEdgeNameEditPart.VISUAL_ID,                                    (v, d) -> new XtextSiriusEdgeNameEditPart(v, d))
			.put(DEdgeBeginNameEditPart.VISUAL_ID,                               (v, d) -> new XtextSiriusEdgeBeginNameEditPart(v, d))
			.put(DEdgeEndNameEditPart.VISUAL_ID,                                 (v, d) -> new XtextSiriusEdgeEndNameEditPart(v, d))
			.put(DDiagramEditPart.VISUAL_ID,                                     (v, d) -> new XtextSiriusDiagramEditPart(v, d))
			.put(DNodeContainerViewNodeContainerCompartmentEditPart.VISUAL_ID,   (v, d) -> new XtextSiriusNodeContainerViewNodeContainerCompartmentEditPart(v, d))
			.put(DNodeContainerViewNodeContainerCompartment2EditPart.VISUAL_ID,  (v, d) -> new XtextSiriusNodeContainerViewNodeContainerCompartment2EditPart(v, d))
			.put(DNodeListViewNodeListCompartmentEditPart.VISUAL_ID,             (v, d) -> new XtextSiriusNodeListViewNodeListCompartmentEditPart(v, d))
			.put(DNodeListViewNodeListCompartment2EditPart.VISUAL_ID,            (v, d) -> new XtextSiriusNodeListViewNodeListCompartment2EditPart(v, d))
			.build();
	// @formatter:on
	
	@Override
	public boolean provides(final IOperation operation) {
		final RepresentationElementMapping mapping = extractMapping(operation);
		final View view = ((IEditPartOperation) operation).getView();
		final Integer viewType = extractViewType(view);
		
		if (mapping instanceof DiagramElementMapping) {
			if (((DiagramElementMapping) mapping).getLabelDirectEdit() instanceof AXtextDirectEditLabel) {
				return EDIT_PARTS.containsKey(viewType);
			}
		}
		
		return super.provides(operation);
	}
	
	@Override
	public IGraphicalEditPart createGraphicEditPart(final View view) {
		final RepresentationElementMapping mapping = extractMapping(view);
		final Integer viewType = extractViewType(view);
		
		if (mapping instanceof DiagramElementMapping) {
			final DirectEditLabel labelDirectEdit = ((DiagramElementMapping) mapping).getLabelDirectEdit();
			
			if (labelDirectEdit instanceof IXtextDirectEditModelDescription) {
				final IXtextDirectEditModelDescription modelNodeDescription = (IXtextDirectEditModelDescription) labelDirectEdit;
				final XtextSiriusModelDescriptor descriptor = new XtextSiriusModelDescriptor(
						resolveLanguageInjector(modelNodeDescription), modelNodeDescription);
				
				if (EDIT_PARTS.containsKey(viewType)) {
					return EDIT_PARTS.get(viewType).apply(view, descriptor);
				}
				
			} else if (labelDirectEdit instanceof IXtextDirectEditValueDescription) {
				final IXtextDirectEditValueDescription valueNodeDescription = (IXtextDirectEditValueDescription) labelDirectEdit;
				final XtextSiriusValueDescriptor descriptor = new XtextSiriusValueDescriptor(
						resolveLanguageInjector(valueNodeDescription), valueNodeDescription);
				
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
	
	protected Integer extractViewType(final View view) {
		try {
			return Integer.valueOf(view.getType());
		} catch (final NumberFormatException e) {
			return 0;
		}
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
