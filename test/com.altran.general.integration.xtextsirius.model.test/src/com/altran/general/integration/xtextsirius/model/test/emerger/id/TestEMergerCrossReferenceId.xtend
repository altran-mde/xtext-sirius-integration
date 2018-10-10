/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
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
