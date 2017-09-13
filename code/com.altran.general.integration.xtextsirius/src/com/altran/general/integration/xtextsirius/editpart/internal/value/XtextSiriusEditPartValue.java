package com.altran.general.integration.xtextsirius.editpart.internal.value;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.description.RepresentationElementMapping;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;

import com.altran.general.integration.xtextsirius.editpart.internal.AXtextSiriusEditPart;

public class XtextSiriusEditPartValue extends AXtextSiriusEditPart {
	private @NonNull final String prefixText;
	private @NonNull final String suffixText;
	
	public XtextSiriusEditPartValue(final @NonNull EditPartDescriptorValue descriptor, final @NonNull View view) {
		super(descriptor, view);
		this.prefixText = descriptor.getPrefixText();
		this.suffixText = descriptor.getSuffixText();
	}
	
	protected @NonNull String getValueFeature() {
		final DSemanticDecorator decorator = resolveSemanticElement();
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
	
	@Override
	protected DirectEditManager createDirectEditManager() {
		final EObject semanticElement = getSemanticElement();
		if (semanticElement != null) {
			return new XtextSiriusDirectEditManagerValue(this, getInjector(), translateToStyle(), isMultiLine(),
					this.prefixText, this.suffixText,
					semanticElement.eClass().getEStructuralFeature(getValueFeature()));
		}

		throw new IllegalStateException("Cannot directEdit a non-existing semanticElement");
	}
	
	@Override
	protected void setContext(final Resource arg0) {
		// TODO Auto-generated method stub

	}
}
