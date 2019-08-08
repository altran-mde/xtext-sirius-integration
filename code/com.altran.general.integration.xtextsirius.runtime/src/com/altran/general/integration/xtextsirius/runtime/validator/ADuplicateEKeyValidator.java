/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.validator;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class ADuplicateEKeyValidator extends AbstractDeclarativeValidator {
	public static final String DUPLICATE_EKEY = "duplicateEKey";
	
	protected void checkDuplicateEKey(final EObject eObject) {
		if (eObject == null) {
			return;
		}
		
		final EReference containmentFeature = eObject.eContainmentFeature();
		if (containmentFeature == null) {
			return;
		}
		
		final EList<EAttribute> eKeys = containmentFeature.getEKeys();
		if (eKeys == null || eKeys.isEmpty()) {
			return;
		}
		
		final EObject container = eObject.eContainer();
		if (container == null) {
			return;
		}
		
		final List<Object> refKeyValues = getKeyValues(eObject, eKeys);
		
		final Object values = container.eGet(containmentFeature, false);
		if (!(values instanceof List)) {
			return;
		}
		
		final List<?> elements = (List<?>) values;
		
		final List<Object> sameKeys = elements.stream()
				.filter(EObject.class::isInstance)
				.filter(e -> !eObject.equals(e))
				.filter(e -> refKeyValues.equals(getKeyValues((EObject) e, eKeys)))
				.collect(Collectors.toList());
		
		if (sameKeys.isEmpty()) {
			return;
		}
		
		final int index = elements.indexOf(eObject);
		
		final List<String> keyValuePairs = eKeys.stream()
				.map(k -> {
					Object value = eObject.eGet(k);
					if (value instanceof CharSequence) {
						value = "\'" + value + "\'";
					}
					
					return k.getName() + "=" + value;
				})
				.collect(Collectors.toList());
		
		
		final List<String> positions = sameKeys.stream()
				.map(s -> elements.indexOf(s))
				.map(i -> Integer.toString(i))
				.collect(Collectors.toList());
		
		final String plural = positions.size() > 1 ? "s" : "";
		
		final String message = "Same key [" + String.join(", ", keyValuePairs) + "] as element" + plural
				+ " in position" + plural + " " + String.join(", ", positions);
		
		error(message, container, containmentFeature, index, ADuplicateEKeyValidator.DUPLICATE_EKEY);
	}
	
	@Override
	protected List<EPackage> getEPackages() {
		return Collections.singletonList(EcorePackage.eINSTANCE);
	}
	
	protected List<Object> getKeyValues(final EObject eObject, final List<EAttribute> eKeys) {
		return eKeys.stream()
				.map(k -> eObject.eGet(k))
				.collect(Collectors.toList());
	}
}
