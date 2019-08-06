package com.altran.general.integration.xtextsirius.test.reflang

import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import org.junit.Test

class TestRefLangList extends ATestRefLang {
	@Test
	def void editRefList() {
		val expected = #[
			createLeaf => [ 
				name = "K"
				references += createReference => [ target = A ]
			],
			createLeaf => [ name = "L" ],
			createLeaf => [
				name = "M"
				references += createReference => [ target = B ]
			]
		]

		assertModelEdit(
			I.subContents,
			I,
			"J L",
			"K 1 -> A L M 1 -> B",
			expected
		)
	}
	
	override protected getFeatureName() {
		"subContents"
	}
	
	override protected createModelDescriptor() {
 		new XtextSiriusModelDescriptor(injector, createXtextDirectEditModelDescription => [
 		])
	}
	
}