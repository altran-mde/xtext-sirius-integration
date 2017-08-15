package com.altran.general.integration.xtextsirius.editpart.internal;

import java.util.function.Predicate;
import java.util.stream.Stream;

import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.altran.general.integration.xtextsirius.eef.IXtextPropertyConfiguration;

public class XtextSiriusEditPartProvider extends AbstractEditPartProvider {
	private static final String EXTENSION_POINT_ID = "com.altran.general.integration.xtextsirius.xtextDirectEdit";
	private static final String XTEXT_DIRECT_EDIT_MODEL_ELEMENT = "xtextDirectEditModel";
	private static final String CONFIG_CLASS_ATTRIBUTE = "configClass";
	private static final String SEMANTIC_TYPE_ATTRIBUTE = "semanticType";
	private static final String SINGLE_LINE_ATTRIBUTE = "singleLine";
	
	@Inject
	private IExtensionRegistry registry;
	
	
	@Override
	public IGraphicalEditPart createGraphicEditPart(final View view) {
		final String className = extractTargetName(view);
		if (className != null) {
			return collectXtextDirectEditConfigurations()
					.filter(providesFilter(className))
					.findAny()
					.map(d -> new XtextSiriusEditPartModel(d.getConfig().getInjector(), d.isSingleLine(), view))
					.orElseThrow(
							() -> new IllegalStateException(
									"Cannot find IXtextDirectEditConfiguration for semanticType "
											+ className));
		}


		return super.createGraphicEditPart(view);
	}

	private String extractTargetName(final View view) {
		final EObject viewElement = view.getElement();
		if (viewElement instanceof DSemanticDecorator) {
			final DSemanticDecorator semanticDecorator = (DSemanticDecorator) viewElement;
			final EObject target = semanticDecorator.getTarget();
			if (target != null) {
				return target.getClass().getName();
			}
		}

		return null;
	}


	@Override
	public boolean provides(final IOperation operation) {
		if (operation instanceof CreateGraphicEditPartOperation) {
			final View view = ((IEditPartOperation) operation).getView();
			final String className = extractTargetName(view);
			if (className != null) {
				return collectXtextDirectEditConfigurations()
						.anyMatch(providesFilter(className));
			}
		}
		
		return super.provides(operation);
	}

	private Predicate<? super EditPartDescriptor> providesFilter(
			final String className) {
		return d -> className.equals(d.getSemanticType());
	}
	
	private Stream<EditPartDescriptor> collectXtextDirectEditConfigurations() {
		return Stream.of(this.registry.getConfigurationElementsFor(EXTENSION_POINT_ID))
				.filter(e -> e.isValid())
				.filter(e -> XTEXT_DIRECT_EDIT_MODEL_ELEMENT.equals(e.getName()))
				.map(e -> {
					IXtextDirectEditConfiguration executableExtension = null;
					try {
						executableExtension = (IXtextDirectEditConfiguration) e
								.createExecutableExtension(CONFIG_CLASS_ATTRIBUTE);
					} catch (final CoreException | ClassCastException ex) {
						// fail silently, will be handled in filter below
					}
					return new EditPartDescriptor(e.getAttribute(SEMANTIC_TYPE_ATTRIBUTE),
							Boolean.parseBoolean(e.getAttribute(SINGLE_LINE_ATTRIBUTE)), executableExtension);
				})
				.filter(d -> StringUtils.isNotBlank(d.getSemanticType())
						&& d.getConfig() instanceof IXtextPropertyConfiguration);
	}
	
}
