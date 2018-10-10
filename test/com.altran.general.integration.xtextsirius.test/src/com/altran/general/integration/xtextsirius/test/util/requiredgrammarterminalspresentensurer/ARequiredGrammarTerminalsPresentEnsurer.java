/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.requiredgrammarterminalspresentensurer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.formatting2.regionaccess.IEObjectRegion;
import org.eclipse.xtext.formatting2.regionaccess.ILineRegion;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionExtensions;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionRewriter;
import org.eclipse.xtext.formatting2.regionaccess.ITextSegment;
import org.eclipse.xtext.resource.XtextResource;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.ARegion;

public abstract class ARequiredGrammarTerminalsPresentEnsurer extends ARegion {
	protected @NonNull AccessibleRequiredGrammarTerminalsPresentEnsurer getFakeEnsurer() {
		final EObject element = AFowlerdslDefaultModelTest.statemachineFactory.createEvent();
		return new AccessibleRequiredGrammarTerminalsPresentEnsurer(element,
				AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getStatemachine_Events(),
				new ITextRegionAccess() {
					
					@Override
					public String textForOffset(final int offset, final int length) {
						return null;
					}
					
					@Override
					public IEObjectRegion regionForRootEObject() {
						return null;
					}
					
					@Override
					public ITextSegment regionForOffset(final int offset, final int length) {
						return null;
					}
					
					@Override
					public ILineRegion regionForLineAtOffset(final int offset) {
						return null;
					}
					
					@Override
					public IEObjectRegion regionForEObject(final EObject object) {
						return null;
					}
					
					@Override
					public ITextSegment regionForDocument() {
						return null;
					}
					
					@Override
					public boolean hasSyntaxError() {
						return false;
					}
					
					@Override
					public ITextRegionRewriter getRewriter() {
						return null;
					}
					
					@Override
					public XtextResource getResource() {
						return null;
					}
					
					@Override
					public ITextRegionExtensions getExtensions() {
						return null;
					}
				},
				new StringBuffer());
	}
}
