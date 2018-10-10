/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;

public abstract class ARegion extends AFowlerdslDefaultModelTest {
	protected ITextRegionAccess getRootRegion(final EObject obj) {
		return ((Serializer) getInjector().getInstance(ISerializer.class))
				.serializeToRegions(EcoreUtil.getRootContainer(obj));
	}
	
	protected StringBuffer getAllText(final ITextRegionAccess rootRegion) {
		return new StringBuffer(rootRegion.regionForDocument().getText());
	}
	
}
