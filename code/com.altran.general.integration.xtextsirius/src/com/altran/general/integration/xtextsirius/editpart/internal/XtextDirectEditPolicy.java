package com.altran.general.integration.xtextsirius.editpart.internal;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.LabelDirectEditPolicy;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.description.RepresentationElementMapping;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;

public class XtextDirectEditPolicy extends LabelDirectEditPolicy {
	
	@Override
	protected Command getDirectEditCommand(final DirectEditRequest edit) {
		final CellEditor cellEditor = edit.getCellEditor();
		if (cellEditor.isDirty()) {
			if (cellEditor instanceof AXtextSiriusStyledTextCellEditor) {
				final Object newValue = ((AXtextSiriusStyledTextCellEditor) cellEditor).getValueToCommit();
				
				final DRepresentationElement representationElement = extractRepresentationElement();
				final SetValue setValue = extractSetValue(representationElement);
				
				if (representationElement != null && setValue != null) {
					EObject target = representationElement.getTarget();
					final String featureName = setValue.getFeatureName();

					final EStructuralFeature feature;
					
					if (StringUtils.isNotBlank(featureName)) {
						feature = target.eClass().getEStructuralFeature(featureName);
					} else {
						feature = target.eContainingFeature();
						target = target.eContainer();
					}
					
					return new ICommandProxy(new ReplaceValueCommand(new SetRequest(target, feature, newValue)));
				}
			}
		}
		
		return null;
	}
	
	private @Nullable DRepresentationElement extractRepresentationElement() {
		final EditPart host = getHost();
		if (host instanceof AXtextSiriusEditPart) {
			final Object model = ((AXtextSiriusEditPart) host).getModel();
			if (model instanceof View) {
				final EObject element = ((View) model).getElement();
				if (element instanceof DRepresentationElement) {
					return (DRepresentationElement) element;
				}
			}
		}
		
		return null;
	}
	
	private @Nullable SetValue extractSetValue(final @Nullable DRepresentationElement representationElement) {
		if (representationElement != null) {
			final RepresentationElementMapping mapping = representationElement.getMapping();
			if (mapping instanceof DiagramElementMapping) {
				final DirectEditLabel labelDirectEdit = ((DiagramElementMapping) mapping).getLabelDirectEdit();
				if (labelDirectEdit != null) {
					final InitialOperation initialOperation = labelDirectEdit.getInitialOperation();
					if (initialOperation != null) {
						final ModelOperation firstModelOperation = initialOperation.getFirstModelOperations();
						if (firstModelOperation instanceof SetValue) {
							return (@Nullable SetValue) firstModelOperation;
						}
					}
				}
			}
		}
		
		return null;
	}

}