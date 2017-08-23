package com.altran.general.integration.xtextsirius.eef.internal;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
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

public class XtextSiriusEefLifecycleManagerProvider implements IEEFLifecycleManagerProvider {
	
	private static final String EXTENSION_POINT_ID = "com.altran.general.integration.xtextsirius.xtextProperty";
	private static final String CONFIG_CLASS_ATTRIBUTE = "configClass";
	private static final String MULTI_LINE_ATTRIBUTE = "multiLine";
	private static final String IDENTIFIER_ATTRIBUTE = "identifier";
	private static final String XTEXT_PROPERTY_MODEL_ELEMENT = "xtextPropertyModel";
	private static final String XTEXT_PROPERTY_VALUE_ELEMENT = "xtextPropertyValue";
	private static final String PREFIX_TEXT_ATTRIBUTE = "prefixText";
	private static final String SUFFIX_TEXT_ATTRIBUTE = "suffixText";
	
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
		return Stream.of(Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_ID))
				.filter(e -> e.isValid())
				.filter(e -> XTEXT_PROPERTY_MODEL_ELEMENT.equals(e.getName())
						|| XTEXT_PROPERTY_VALUE_ELEMENT.equals(e.getName()))
				.map(e -> {
					IXtextPropertyConfiguration configuration = null;
					try {
						configuration = (IXtextPropertyConfiguration) e
								.createExecutableExtension(CONFIG_CLASS_ATTRIBUTE);
					} catch (final CoreException | ClassCastException ex) {
						// fail silently, will be handled in filter below
					}
					final String identifier = e.getAttribute(IDENTIFIER_ATTRIBUTE);
					final boolean multiLine = Boolean.parseBoolean(e.getAttribute(MULTI_LINE_ATTRIBUTE));
					switch (e.getName()) {
						case XTEXT_PROPERTY_MODEL_ELEMENT:
							return new PropertyDescriptorModel(identifier, multiLine, configuration);
						case XTEXT_PROPERTY_VALUE_ELEMENT:
							return new PropertyDescriptorValue(identifier, multiLine, configuration,
									e.getAttribute(PREFIX_TEXT_ATTRIBUTE), e.getAttribute(SUFFIX_TEXT_ATTRIBUTE));
						default:
							return null;
					}
				})
				.filter(Objects::nonNull)
				.filter(d -> d.isValid());
	}
	
	private @NonNull Predicate<? super @NonNull APropertyDescriptor> createIdentifierFilter(
			final @NonNull EEFControlDescription controlDescription) {
		return e -> StringUtils.equals(controlDescription.getIdentifier(), e.getIdentifier());
	}
}
