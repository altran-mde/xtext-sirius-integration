package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestFactory
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage
import com.altran.general.integration.xtextsirius.runtime.util.EMerger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EStructuralFeature

abstract class ATestEMerger<T extends IElement<?>> {
	protected extension XtextSiriusTestPackage xtextSiriusTestPackage = XtextSiriusTestPackage.eINSTANCE
	protected extension XtextSiriusTestFactory xtextSiriusTestFactory = XtextSiriusTestFactory.eINSTANCE
	
	protected def createEMerger(T existing, T edited) {
		new EMerger(existing, emptySet, emptySet, URI.createURI("resourceName.xmi#/42"))
	}
	
	protected def createEMerger(T existing, EStructuralFeature feature) {
		new EMerger(existing, emptySet, emptySet, URI.createURI("resourceName.xmi#/42"))
	}

	public def T newElement(int id, String attrValue) {
		createRootElement => [
			changeableAttr = attrValue
		]
	}
	
	protected def T createRootElement() {
		createElement as T
	}
}
