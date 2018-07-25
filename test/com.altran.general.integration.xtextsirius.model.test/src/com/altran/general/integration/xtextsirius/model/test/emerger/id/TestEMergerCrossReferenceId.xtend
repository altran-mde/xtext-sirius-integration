package com.altran.general.integration.xtextsirius.model.test.emerger.id

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IdElement
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerEReference

class TestEMergerCrossReferenceId extends ATestEMergerEReference<IdElement> {
	override newElement(int requestedId, String attrValue) {
		createIdElement  => [
			id = "id" + requestedId
			changeableAttr = attrValue
		]
	}
	
	override protected createRootElement() {
		createIdElement
	}
}
