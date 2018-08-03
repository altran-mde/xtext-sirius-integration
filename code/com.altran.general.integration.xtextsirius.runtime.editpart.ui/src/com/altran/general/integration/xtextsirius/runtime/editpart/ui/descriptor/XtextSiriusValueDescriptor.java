package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.viewpoint.description.RepresentationElementMapping;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.EditPartHelper;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.IXtextSiriusAwareLabelEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.value.XtextSiriusDirectEditManagerValue;
import com.google.inject.Injector;

public class XtextSiriusValueDescriptor extends AXtextSiriusDescriptor {

	private final @NonNull String prefixTextExpression;
	private final @NonNull String suffixTextExpression;
	
	public XtextSiriusValueDescriptor(final @NonNull Injector injector,
			final @NonNull IXtextDirectEditValueDescription description) {
		super(injector, description);
		this.prefixTextExpression = description.getPrefixTextExpression();
		this.suffixTextExpression = description.getSuffixTextExpression();
	}

	@Override
	public @NonNull XtextSiriusDirectEditManager createDirectEditManager(
			final @NonNull IXtextSiriusAwareLabelEditPart editPart) {
		return new XtextSiriusDirectEditManagerValue(editPart, this);
	}

	public @NonNull EStructuralFeature getValueFeature(final IXtextSiriusAwareLabelEditPart editPart) {
		final EObject semanticElement = EditPartHelper.getInstance().getSemanticElement(editPart);
		if (semanticElement != null) {
			return semanticElement.eClass().getEStructuralFeature(getValueFeatureName(editPart));
		}

		throw new IllegalStateException("Cannot directEdit a non-existing semanticElement");
	}

	public @NonNull String getValueFeatureName(final IXtextSiriusAwareLabelEditPart editPart) {
		final EObject decorator = editPart.resolveSemanticElement();
		if (decorator instanceof DDiagramElement) {
			final RepresentationElementMapping mapping = ((DDiagramElement) decorator).getMapping();
			;
			if (mapping instanceof DiagramElementMapping) {
				final DirectEditLabel directEdit = ((DiagramElementMapping) mapping).getLabelDirectEdit();
				final InitialOperation initialOperation = directEdit.getInitialOperation();
				if (initialOperation != null) {
					final ModelOperation modelOperation = initialOperation.getFirstModelOperations();
					if (modelOperation instanceof SetValue) {
						return ((SetValue) modelOperation).getFeatureName();
					}
				}
			}
		}

		throw new IllegalStateException("Cannot find SetValue operation for directEdit " + this);
	}
	
	public @NonNull String getPrefixTextExpression() {
		return this.prefixTextExpression;
	}
	
	public @NonNull String getSuffixTextExpression() {
		return this.suffixTextExpression;
	}
}
