package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element

class TestEMergerContainment extends ATestEMergerContainmentMixed<Element> {
	override Element newElement(int id, String attrValue) {
		super.newElement(id, attrValue) as Element
	}
}
