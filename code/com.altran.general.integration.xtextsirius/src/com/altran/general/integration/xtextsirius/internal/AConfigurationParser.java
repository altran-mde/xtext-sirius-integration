package com.altran.general.integration.xtextsirius.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import com.google.common.collect.Maps;

public abstract class AConfigurationParser<CONFIG, DESCRIPTOR> {
	public interface Handler<CONF, DESC> {
		public @NonNull DESC handle(
				final @NonNull IConfigurationElement configurationElement,
				final @Nullable String identifier,
				final boolean multiLine,
				final @Nullable CONF config);
	}
	
	private static final String CONFIG_CLASS_ATTRIBUTE = "configClass";
	private static final String MULTI_LINE_ATTRIBUTE = "multiLine";
	private static final String IDENTIFIER_ATTRIBUTE = "identifier";
	private static final String EDITABLE_FEATURE_ELEMENT = "editableFeature";
	private static final String NAME_ATTRIBUTE = "name";
	private static final String PREFIX_TEXT_ATTRIBUTE = "prefixText";
	private static final String SUFFIX_TEXT_ATTRIBUTE = "suffixText";
	
	private final @NonNull String extensionPointId;
	private final Map<@NonNull String, @NonNull Handler<CONFIG, DESCRIPTOR>> handlers = Maps.newLinkedHashMap();
	
	public AConfigurationParser(final @NonNull String extensionPointId) {
		this.extensionPointId = extensionPointId;
	}

	public void addToken(final @NonNull String tokenName, final @NonNull Handler<CONFIG, DESCRIPTOR> handler) {
		this.handlers.put(tokenName, handler);
	}
	
	@SuppressWarnings({ "null", "unchecked", "unused" })
	public @NonNull Stream<@NonNull DESCRIPTOR> parse() {
		return Stream.of(Platform.getExtensionRegistry().getConfigurationElementsFor(this.extensionPointId))
				.filter(e -> e.isValid())
				.filter(e -> this.handlers.keySet().contains(e.getName()))
				.map(e -> {
					CONFIG configuration = null;
					try {
						configuration = (CONFIG) e.createExecutableExtension(CONFIG_CLASS_ATTRIBUTE);
					} catch (final CoreException | ClassCastException ex) {
						// fail silently, will be handled in filter below
					}
					final String identifier = e.getAttribute(IDENTIFIER_ATTRIBUTE);
					final boolean multiLine = Boolean.parseBoolean(e.getAttribute(MULTI_LINE_ATTRIBUTE));
					
					final Handler<CONFIG, DESCRIPTOR> handler = this.handlers.get(e.getName());
					if (handler == null) {
						return null;
					}
					
					return handler.handle(e, identifier, multiLine, configuration);
				})
				.filter(Objects::nonNull)
				.filter(d -> validate(d));
	}
	
	public @NonNull Collection<@Nullable String> collectEditableFeatures(final @NonNull IConfigurationElement e) {
		return Arrays.stream(e.getChildren(EDITABLE_FEATURE_ELEMENT))
				.map(ef -> ef.getAttribute(NAME_ATTRIBUTE))
				.filter(StringUtils::isNotBlank)
				.collect(Collectors.toSet());
	}

	public @Nullable String getPrefixText(final @NonNull IConfigurationElement e) {
		return e.getAttribute(PREFIX_TEXT_ATTRIBUTE);
	}

	public @Nullable String getSuffixText(final @NonNull IConfigurationElement e) {
		return e.getAttribute(SUFFIX_TEXT_ATTRIBUTE);
	}

	protected abstract boolean validate(final @NonNull DESCRIPTOR desc);
}
