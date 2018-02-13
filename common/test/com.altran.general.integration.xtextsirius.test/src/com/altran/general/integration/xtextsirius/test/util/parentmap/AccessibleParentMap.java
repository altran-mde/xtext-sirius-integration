package com.altran.general.integration.xtextsirius.test.util.parentmap;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.AbstractElement;

import com.altran.general.integration.xtextsirius.util.ParentMap;
import com.google.common.collect.Multimap;

public class AccessibleParentMap extends ParentMap {
	
	public AccessibleParentMap(final AbstractElement parent, final AbstractElement base) {
		super(parent, base);
	}
	
	public AccessibleParentMap(final AbstractElement parent, final AbstractElement base,
			final @NonNull Multimap<@NonNull AbstractElement, @NonNull AbstractElement> initialMap) {
		super(parent, base);
		this.map.clear();
		this.map.putAll(initialMap);
	}

	public @NonNull Multimap<@NonNull AbstractElement, @NonNull AbstractElement> getMap() {
		return this.map;
	}

}
