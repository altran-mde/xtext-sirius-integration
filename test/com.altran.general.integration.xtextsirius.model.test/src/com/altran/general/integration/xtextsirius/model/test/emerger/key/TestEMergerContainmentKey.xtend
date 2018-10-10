/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
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
