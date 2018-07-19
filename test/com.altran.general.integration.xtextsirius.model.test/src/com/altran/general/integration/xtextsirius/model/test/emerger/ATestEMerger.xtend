package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestFactory
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.XtextSiriusTestPackage
import com.altran.general.integration.xtextsirius.util.EMerger
import org.eclipse.emf.common.util.URI

abstract class ATestEMerger {
	protected extension XtextSiriusTestPackage xtextSiriusTestPackage = XtextSiriusTestPackage.eINSTANCE
	protected extension XtextSiriusTestFactory xtextSiriusTestFactory = XtextSiriusTestFactory.eINSTANCE
	
	protected def createEMerger(Element existing, Element edited) {
		new EMerger(existing, edited, emptySet, emptySet, URI.createURI("resourceName.xmi#/42"))
	}
}