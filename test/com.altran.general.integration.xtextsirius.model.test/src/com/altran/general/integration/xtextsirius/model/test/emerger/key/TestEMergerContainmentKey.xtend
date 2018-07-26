package com.altran.general.integration.xtextsirius.model.test.emerger.key

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.KeyElement
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMergerContainmentIdentity

class TestEMergerContainmentKey extends ATestEMergerContainmentIdentity<KeyElement> {
	override protected changeableSetContFeature() {
		keyElement_ChangeableSetCont
	}
	
	override protected changeableUniqueListContFeature() {
		keyElement_ChangeableUniqueListCont
	} 

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
