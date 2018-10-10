/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.parentmap;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.AbstractElement;

import com.altran.general.integration.xtextsirius.runtime.modelregion.ParentMap;
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
