/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestFactory
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.util.EMerger
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EStructuralFeature

abstract class ATestEMerger<T extends IElement<?>> {
	protected extension XtextSiriusTestPackage xtextSiriusTestPackage = XtextSiriusTestPackage::eINSTANCE
	protected extension XtextSiriusTestFactory xtextSiriusTestFactory = XtextSiriusTestFactory::eINSTANCE
	
	protected def createEMerger(T existing, T edited) {
		new EMerger(createDescriptor, existing, URI.createURI("resourceName.xmi#/42"))
	}
	
	protected def createEMerger(T existing, EStructuralFeature feature) {
		new EMerger(createDescriptor, existing, URI.createURI("resourceName.xmi#/42"))
	}
	
	def createDescriptor() {
		createDescriptor(emptySet, emptySet)
	}
	
	def createDescriptor(Set<String> editableFeaturesSet, Set<String> ignoredNestedFeaturesSet) {
		new IXtextSiriusModelDescriptor() {
			
			override getEditableFeatures() {
				editableFeaturesSet
			}
			
			override getIgnoredNestedFeatures() {
				ignoredNestedFeaturesSet
			}
			
			override getPrefixTerminalsExpression() {
				null
			}
			
			override getSelectedFeatures() {
				emptySet
			}
			
			override getSuffixTerminalsExpression() {
				null
			}
			
			override isMultiLine() {
				false
			}
			
			override getInjector() {
				throw new IllegalStateException("Didn't expect this call")
			}
			
			override isCancelOnValidationError() {
				false
			}
			
		}
	}

	def T newElement(int id, String attrValue) {
		createRootElement => [
			changeableAttr = attrValue
		]
	}
	
	protected def T createRootElement() {
		createElement as T
	}
}
