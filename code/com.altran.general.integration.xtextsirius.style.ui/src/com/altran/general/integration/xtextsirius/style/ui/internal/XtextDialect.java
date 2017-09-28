package com.altran.general.integration.xtextsirius.style.ui.internal;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.business.api.dialect.AbstractRepresentationDialectServices;
import org.eclipse.sirius.business.api.dialect.Dialect;
import org.eclipse.sirius.business.api.dialect.DialectServices;
import org.eclipse.sirius.business.api.dialect.description.IInterpretedExpressionQuery;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.RepresentationExtensionDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

public class XtextDialect implements Dialect {
	
	@Override
	public String getName() {
		return "XtextDialect";
	}
	
	@Override
	public DialectServices getServices() {
		return new AbstractRepresentationDialectServices() {

			@Override
			public void refresh(final DRepresentation representation, final boolean fullRefresh,
					final IProgressMonitor monitor) {
				// TODO Auto-generated method stub

			}

			@Override
			public void initRepresentations(final Viewpoint vp, final EObject semantic,
					final IProgressMonitor monitor) {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean handles(final RepresentationExtensionDescription representationExtensionDescription) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean handles(final RepresentationDescription representationDescription) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public RepresentationDescription getDescription(final DRepresentation representation) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public IInterpretedExpressionQuery createInterpretedExpressionQuery(final EObject target,
					final EStructuralFeature feature) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean canCreate(final EObject semantic, final RepresentationDescription desc) {
				return false;
			}

			@Override
			protected boolean isSupported(final RepresentationDescription description) {
				return description instanceof DiagramDescription;
			}

			@Override
			protected boolean isSupported(final DRepresentationDescriptor representationDescriptor) {
				return representationDescriptor.getDescription() instanceof DiagramDescription;
			}

			@Override
			protected boolean isSupported(final DRepresentation representation) {
				return representation instanceof DDiagram;
			}

			@Override
			protected <T extends RepresentationDescription> void initRepresentationForElement(
					final T representationDescription,
					final EObject semanticElement, final IProgressMonitor monitor) {
				// TODO Auto-generated method stub

			}

			@Override
			protected DRepresentation createRepresentation(final String name, final EObject semantic,
					final RepresentationDescription description,
					final IProgressMonitor monitor) {
				return null;
			}
		};
	}

}
