package com.altran.general.integration.xtextsirius.eef.internal;

import java.util.function.Predicate;
import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;
import org.eclipse.eef.EEFControlDescription;
import org.eclipse.eef.EEFTextDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManager;
import org.eclipse.eef.ide.ui.api.widgets.IEEFLifecycleManagerProvider;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;

import com.altran.general.integration.xtextsirius.eef.IXtextPropertyConfiguration;
import com.altran.general.integration.xtextsirius.eef.internal.model.PropertyDescriptorModel;
import com.altran.general.integration.xtextsirius.eef.internal.value.PropertyDescriptorValue;
import com.altran.general.integration.xtextsirius.internal.AConfigurationParser;

public class XtextSiriusEefLifecycleManagerProvider implements IEEFLifecycleManagerProvider {
	
	private static final String EXTENSION_POINT_ID = "com.altran.general.integration.xtextsirius.xtextProperty";
	private static final String XTEXT_PROPERTY_MODEL_ELEMENT = "xtextPropertyModel";
	private static final String XTEXT_PROPERTY_VALUE_ELEMENT = "xtextPropertyValue";
	
	private AConfigurationParser<IXtextPropertyConfiguration, APropertyDescriptor> parser;
	
	public XtextSiriusEefLifecycleManagerProvider() {
		createParser();
	}

	private void createParser() {
		this.parser = new AConfigurationParser<IXtextPropertyConfiguration, APropertyDescriptor>(EXTENSION_POINT_ID) {

			@Override
			protected boolean validate(@NonNull final APropertyDescriptor desc) {
				return desc.isValid();
			}
		};

		this.parser.addToken(XTEXT_PROPERTY_MODEL_ELEMENT,
				(e, identifier, multiLine, config) -> new PropertyDescriptorModel(identifier, multiLine, config,
						this.parser.collectEditableFeatures(e)));
		
		this.parser.addToken(XTEXT_PROPERTY_VALUE_ELEMENT,
				(e, identifier, multiLine, config) -> new PropertyDescriptorValue(identifier, multiLine, config,
						this.parser.getPrefixText(e), this.parser.getSuffixText(e)));
	}

	@Override
	public boolean canHandle(final EEFControlDescription controlDescription) {
		return collectXtextPropertyConfigurations()
				.anyMatch(createIdentifierFilter(controlDescription));
	}

	@Override
	public @NonNull IEEFLifecycleManager getLifecycleManager(final EEFControlDescription controlDescription,
			final IVariableManager variableManager, final IInterpreter interpreter,
			final EditingContextAdapter contextAdapter) {
		if (controlDescription instanceof EEFTextDescription) {
			return collectXtextPropertyConfigurations()
					.filter(createIdentifierFilter(controlDescription))
					.findAny()
					.map(e -> e.createEefLifecycleManager((EEFTextDescription) controlDescription, variableManager,
							interpreter, contextAdapter))
					.orElseThrow(
							() -> new IllegalStateException("Cannot find IXtextPropertyConfiguration for identifier "
									+ controlDescription.getIdentifier()));
		}
		
		throw new IllegalArgumentException("controlDescription is not of type EEFTextDescription");
	}

	private @NonNull Stream<@NonNull APropertyDescriptor> collectXtextPropertyConfigurations() {
		return this.parser.parse();
	}

	private @NonNull Predicate<? super @NonNull APropertyDescriptor> createIdentifierFilter(
			final @NonNull EEFControlDescription controlDescription) {
		return e -> StringUtils.equals(controlDescription.getIdentifier(), e.getIdentifier());
	}

}
