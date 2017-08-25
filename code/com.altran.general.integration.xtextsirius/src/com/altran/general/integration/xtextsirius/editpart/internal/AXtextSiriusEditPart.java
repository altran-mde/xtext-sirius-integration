package com.altran.general.integration.xtextsirius.editpart.internal;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.DirectEditRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.LabelDirectEditPolicy;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.description.RepresentationElementMapping;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.eclipse.swt.SWT;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart;

import com.google.inject.Injector;

public abstract class AXtextSiriusEditPart extends XtextLabelEditPart {
	
	private final boolean multiLine;
	private final Injector injector;

	public AXtextSiriusEditPart(final @NonNull AEditPartDescriptor descriptor, final @NonNull View view) {
		super(view);
		this.injector = descriptor.getConfig().getInjector();
		this.multiLine = descriptor.isMultiLine();
	}

	protected int translateToStyle() {
		if (this.isMultiLine()) {
			return SWT.MULTI | SWT.WRAP;
		} else {
			return SWT.SINGLE;
		}
	}

	protected Injector getInjector() {
		return this.injector;
	}
	
	protected boolean isMultiLine() {
		return this.multiLine;
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new LabelDirectEditPolicy() {
			@Override
			protected Command getDirectEditCommand(final DirectEditRequest edit) {
				final CellEditor cellEditor = edit.getCellEditor();
				if (cellEditor.isDirty()) {
					if (cellEditor instanceof AXtextSiriusStyledTextCellEditor) {
						final Object newValue = ((AXtextSiriusStyledTextCellEditor) cellEditor).getValueToCommit();

						final EditPart host = getHost();
						if (host instanceof AXtextSiriusEditPart) {
							final AXtextSiriusEditPart editPart = (AXtextSiriusEditPart) host;
							final EObject model = (EObject) editPart.getModel();
							if (model instanceof View) {
								final EObject element = ((View) model).getElement();
								if (element instanceof DRepresentationElement) {
									final DRepresentationElement representationElement = (DRepresentationElement) element;
									final RepresentationElementMapping mapping = representationElement.getMapping();
									if (mapping instanceof DiagramElementMapping) {
										final DirectEditLabel labelDirectEdit = ((DiagramElementMapping) mapping)
												.getLabelDirectEdit();
										if (labelDirectEdit != null) {
											final InitialOperation initialOperation = labelDirectEdit
													.getInitialOperation();
											if (initialOperation != null) {
												final ModelOperation firstModelOperation = initialOperation
														.getFirstModelOperations();
												if (firstModelOperation instanceof SetValue) {
													EObject target = representationElement.getTarget();
													final String featureName = ((SetValue) firstModelOperation)
															.getFeatureName();
													final EStructuralFeature feature;
													if (StringUtils.isNotBlank(featureName)) {
														feature = target.eClass()
																.getEStructuralFeature(featureName);
													} else {
														feature = target.eContainingFeature();
														target = target.eContainer();
													}
													return new ICommandProxy(new ReplaceValueCommand(
															new SetRequest(target, feature, newValue)));
												}
											}
										}
									}
								}
							}
						}
					}
				}

				return null;
			}
		});
	}
}
