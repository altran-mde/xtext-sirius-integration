package com.altran.general.integration.xtextsirius.editpart.internal;

import java.util.function.Predicate;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import com.altran.general.integration.xtextsirius.editpart.IXtextDirectEditConfiguration;
import com.altran.general.integration.xtextsirius.editpart.internal.model.EditPartDescriptorModel;
import com.altran.general.integration.xtextsirius.editpart.internal.value.EditPartDescriptorValue;
import com.altran.general.integration.xtextsirius.internal.AConfigurationParser;

public class XtextSiriusEditPartProvider extends AbstractEditPartProvider {
	private static final String EXTENSION_POINT_ID = "com.altran.general.integration.xtextsirius.xtextDirectEdit";
	private static final String XTEXT_DIRECT_EDIT_MODEL_ELEMENT = "xtextDirectEditModel";
	private static final String XTEXT_DIRECT_EDIT_VALUE_ELEMENT = "xtextDirectEditValue";
	private static final String EDGE_LABEL_POSITION_ATTRIBUTE = "edgeLabelPosition";
	
	private AConfigurationParser<IXtextDirectEditConfiguration, AEditPartDescriptor> parser;
	
	public XtextSiriusEditPartProvider() {
		super();
		createParser();
	}

	private void createParser() {
		this.parser = new AConfigurationParser<IXtextDirectEditConfiguration, AEditPartDescriptor>(EXTENSION_POINT_ID) {

			@Override
			protected boolean validate(@NonNull final AEditPartDescriptor desc) {
				return desc.isValid();
			}
		};

		this.parser.addToken(XTEXT_DIRECT_EDIT_MODEL_ELEMENT,
				(e, identifier, multiLine, config) -> new EditPartDescriptorModel(identifier, multiLine, config,
						e.getAttribute(EDGE_LABEL_POSITION_ATTRIBUTE),
						this.parser.collectEditableFeatures(e)));
		
		this.parser.addToken(XTEXT_DIRECT_EDIT_VALUE_ELEMENT,
				(e, identifier, multiLine, config) -> new EditPartDescriptorValue(identifier, multiLine, config,
						this.parser.getPrefixText(e), this.parser.getSuffixText(e)));
	}
	
	@Override
	public boolean provides(final IOperation operation) {
		if (operation instanceof CreateGraphicEditPartOperation) {
			final View view = ((IEditPartOperation) operation).getView();
			if (view instanceof Node) {
				final String targetIdentifier = extractIdentifier(view);
				if (targetIdentifier != null) {
					return collectXtextDirectEditConfigurations()
							.anyMatch(providesFilter(targetIdentifier, view));
				}
			}
		}
		
		return super.provides(operation);
	}
	
	@Override
	public @NonNull IGraphicalEditPart createGraphicEditPart(final View view) {
		final String identifier = extractIdentifier(view);
		if (identifier != null) {
			return collectXtextDirectEditConfigurations()
					.filter(providesFilter(identifier, view))
					.findAny()
					.map(d -> d.createEditPart(view))
					.orElseThrow(
							() -> new IllegalStateException(
									"Cannot find IXtextDirectEditConfiguration for identifier "
											+ identifier));
		}


		return super.createGraphicEditPart(view);
	}

	private @Nullable String extractIdentifier(final @NonNull View view) {
		final EObject viewElement = view.getElement();
		if (viewElement instanceof DRepresentationElement) {
			final DRepresentationElement representationElement = (DRepresentationElement) viewElement;
			return representationElement.getMapping().getName();
		}

		return null;
	}


	private @NonNull Predicate<? super AEditPartDescriptor> providesFilter(
			final @NonNull String identifier,
			final @NonNull View view) {
		return d -> identifier.equals(d.getIdentifier()) && d.matches(view);
	}
	
	private @NonNull Stream<@NonNull AEditPartDescriptor> collectXtextDirectEditConfigurations() {
		return this.parser.parse();
	}
}
