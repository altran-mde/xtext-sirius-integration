package com.altran.general.integration.xtextsirius.model.test.emerger

class ATestEMergerEReferenceId extends ATestEMergerEReference {
	protected override newElement(int requestedId, String attrValue) {
		createIdElement  => [
			id = "id" + requestedId
			changeableAttr = attrValue
		]
	}
}
