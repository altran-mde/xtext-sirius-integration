package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import java.util.Collections;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.LabelDirectEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.diagram.ui.tools.api.command.GMFCommandWrapper;
import org.eclipse.sirius.tools.api.command.SiriusCommand;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.description.RepresentationElementMapping;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.AXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.task.ReplaceValueParameter;
import com.altran.general.integration.xtextsirius.runtime.task.ReplaceValueTask;

public class XtextSiriusDirectEditPolicy extends LabelDirectEditPolicy {
	@Override
	protected void showCurrentEditValue(final DirectEditRequest request) {
		final String value = (String) request.getCellEditor().getValue();
		((IXtextAwareEditPart) getHost()).setLabelText(value);
	}

	@Override
	protected Command getDirectEditCommand(final DirectEditRequest edit) {
		final CellEditor cellEditor = edit.getCellEditor();
		
		if (cellEditor.isDirty()) {
			if (cellEditor instanceof AXtextSiriusStyledTextCellEditor) {
				final DRepresentationElement representationElement = extractRepresentationElement();

				final ReplaceValueParameter replaceValueParameter = extractReplaceValueParameter(
						(AXtextSiriusStyledTextCellEditor) cellEditor, representationElement);
				
				if (replaceValueParameter != null) {
					final TransactionalEditingDomain editingDomain = TransactionUtil
							.getEditingDomain(replaceValueParameter.getElementToEdit());
					
					final SiriusCommand siriusCommand = new SiriusCommand(editingDomain);
					siriusCommand.getTasks().add(new ReplaceValueTask(replaceValueParameter));
					// siriusCommand.getTasks().add(new
					// RefreshDiagramTask(representationElement));
					
					return new ICommandProxy(new GMFCommandWrapper(editingDomain, siriusCommand));
				}
			}
		}

		return null;
	}
	
	protected ReplaceValueParameter extractReplaceValueParameter(final AXtextSiriusStyledTextCellEditor cellEditor,
			final @Nullable DRepresentationElement representationElement) {
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
			
			final Object newValue = cellEditor.getValueToCommit();
			
			AXtextSiriusDescriptor descriptor = cellEditor.getDescriptor();
			Set<String> editableFeatures = Collections.emptySet();
			if (descriptor instanceof XtextSiriusModelDescriptor) {
				editableFeatures = ((XtextSiriusModelDescriptor) descriptor).getEditableFeatures();
			}
			
			EObject semanticElement = cellEditor.getSemanticElement();
			URI originalUri = semanticElement != null ? EcoreUtil.getURI(semanticElement) : null;
			
			final ReplaceValueParameter result = new ReplaceValueParameter(target, feature, newValue,
					representationElement, editableFeatures, originalUri);

			return result;
		}
		
		return null;
	}

	private @Nullable DRepresentationElement extractRepresentationElement() {
		final EditPart host = getHost();
		if (host instanceof IXtextSiriusAwareLabelEditPart) {
			final Object model = ((IXtextSiriusAwareLabelEditPart) host).getModel();
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