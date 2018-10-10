/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.resource;

import java.util.Objects;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.GlobalResourceDescriptionProvider;
import org.eclipse.xtext.scoping.impl.ResourceSetGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

public class XtextSiriusResourceSetGlobalScopeProvider extends ResourceSetGlobalScopeProvider {
	
	@Inject
	private GlobalResourceDescriptionProvider resourceDecriptionProvider;
	
	@Override
	public void setGlobalResourceDecriptionProvider(
			final GlobalResourceDescriptionProvider resourceDecriptionProvider) {
		this.resourceDecriptionProvider = resourceDecriptionProvider;
	}

	@Override
	protected IScope createScopeWithQualifiedNames(final IScope parent, final Resource resource,
			final Predicate<IEObjectDescription> filter, final ResourceSet resourceSet, final EClass type,
			final boolean ignoreCase) {
		final Iterable<ISelectable> resourceDescriptions = Iterables.filter(
				Iterables.transform(resourceSet.getResources(),
						from -> this.resourceDecriptionProvider.getResourceDescription(from)),
				Objects::nonNull);

		final ISelectable compound = new ResourceSetSelectable(resourceDescriptions);
		return SelectableBasedScope.createScope(parent, compound, filter, type, ignoreCase);
	}
}
