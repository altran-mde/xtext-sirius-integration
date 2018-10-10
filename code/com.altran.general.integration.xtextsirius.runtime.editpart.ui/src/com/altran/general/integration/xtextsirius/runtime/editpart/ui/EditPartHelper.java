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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.tools.internal.command.builders.DirectEditCommandBuilder;
import org.eclipse.sirius.viewpoint.DMappingBased;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextDirectEditManager;

/**
 * We had to move some code here because we need to adhere to several lines of
 * inheritance
 * ({@link org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart} vs.
 * {@link org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeNameEditPart}).
 *
 */
@SuppressWarnings("restriction")
public class EditPartHelper {
	private final class ICellEditorValidatorImplementation implements ICellEditorValidator {
		public ICellEditorValidatorImplementation() {
			System.out.println("tach");
		}

		@Override
		public String isValid(final Object value) {
			return null;
		}
	}
	
	private static EditPartHelper INSTANCE;
	
	public static EditPartHelper getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new EditPartHelper();
		}
		
		return INSTANCE;
	}
	
	protected EditPartHelper() {
		
	}
	
	public @NonNull EObject findClosestExistingSemanticElementRecursive(
			final @NonNull DSemanticDecorator decorator) {
		final EObject target = decorator.getTarget();
		if (target != null) {
			return target;
		}
		
		final EObject eContainer = decorator.eContainer();
		if (eContainer instanceof DSemanticDecorator) {
			return findClosestExistingSemanticElementRecursive((DSemanticDecorator) eContainer);
		} else {
			throw new RuntimeException("cannot find any semantic element");
		}
	}
	
	/**
	 * Copied from
	 * {@link org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart}
	 * and adjusted to Sirius
	 */
	public void performDirectEditRequest(final IXtextSiriusAwareLabelEditPart editPart, final Request request) {
		if (!isDirectEditEnabled(editPart)) {
			return;
		}

		final XtextDirectEditManager manager = editPart.getDescriptor().createDirectEditManager(editPart);
		final Request theRequest = request;
		try {
			editPart.getEditingDomain().runExclusive(new Runnable() {
				
				@Override
				public void run() {
					if (editPart.isActive()) {
						if (theRequest.getExtendedData()
								.get(RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR) instanceof Character) {
							final Character initialChar = (Character) theRequest.getExtendedData()
									.get(RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR);
							manager.show(initialChar);
						} else {
							manager.show();
						}
					}
				}
			});
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Copied from
	 * {@link org.eclipse.sirius.diagram.ui.edit.api.part.AbstractDiagramNameEditPart#isDirectEditEnabled()}
	 */
	protected boolean isDirectEditEnabled(final IXtextSiriusAwareLabelEditPart editPart) {
		boolean directEditEnabled = false;
		final EObject eObj = editPart.resolveSemanticElement();
		if (eObj instanceof DMappingBased) {
			final DMappingBased mappingBasedObject = (DMappingBased) eObj;
			if (mappingBasedObject.getMapping() != null && mappingBasedObject instanceof DDiagramElement
					&& ((DDiagramElement) mappingBasedObject).getDiagramElementMapping().getLabelDirectEdit() != null) {
				// check precondition
				final DirectEditLabel labelDirectEdit = ((DDiagramElement) mappingBasedObject)
						.getDiagramElementMapping().getLabelDirectEdit();
				final DirectEditCommandBuilder builder = new DirectEditCommandBuilder(
						(DDiagramElement) mappingBasedObject, labelDirectEdit, null);
				directEditEnabled = builder.canDirectEdit();
			}
		}
		return directEditEnabled;
	}


	/**
	 * Copied from
	 * {@link org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart}
	 */
	public DragTracker getDragTracker(final IXtextSiriusAwareLabelEditPart editPart, final Request request) {
		return new DragEditPartsTrackerEx(editPart) {
			@Override
			protected boolean isMove() {
				return true;
			}
			
			@Override
			protected boolean handleDoubleClick(final int button) {
				performDirectEditRequest(editPart, request);
				return true;
			}
		};
	}
	
	public DSemanticDecorator resolveSemanticElement(final IXtextSiriusAwareLabelEditPart editPart) {
		return (DSemanticDecorator) editPart.resolveSemanticElement();
	}
	
	public @Nullable EObject getSemanticElement(final IXtextSiriusAwareLabelEditPart editPart) {
		return ((DSemanticDecorator) editPart.resolveSemanticElement()).getTarget();
	}
	
	/**
	 * This value should never be used. Instead, use
	 * {@link #getSemanticElement()}.
	 */
	public @Nullable String getEditText(final IXtextSiriusAwareLabelEditPart editPart) {
		return "";
	}
	
	public void createDefaultEditPolicies(final IXtextSiriusAwareLabelEditPart editPart) {
		editPart.installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new XtextSiriusDirectEditPolicy());
	}
	
	public @NonNull EObject getClosestExistingSemanticElement(final IXtextSiriusAwareLabelEditPart editPart) {
		return findClosestExistingSemanticElementRecursive(resolveSemanticElement(editPart));
	}
	
	public void setLabelText(final IXtextSiriusAwareLabelEditPart editPart, final String newText) {
		
	}

	public ICellEditorValidator getEditTextValidator(final IXtextSiriusAwareLabelEditPart editPart) {
		return new ICellEditorValidatorImplementation();
	}
	
	
}
