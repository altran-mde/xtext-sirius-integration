package com.altran.general.integration.xtextsirius.model.test.emerger.key

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerEReference

class ATestEMergerEReferenceKey extends ATestEMergerEReference<KeyElement> {
	override newElement(int requestedId, String attrValue) {
		createKeyElement  => [
			keyId = "keyId" + requestedId
			changeableAttr = attrValue
		]
	}
	
	override protected createRootElement() {
		createKeyElement
	}
}
