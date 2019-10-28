package com.altran.general.integration.xtextsirius.test.reflang

import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.test.reflang.refLang.IContainerContent
import org.junit.Test

import static org.junit.Assert.*

class TestRefLang extends ATestRefLang {
	@Test
	def void noEdit() {
		assertModelEdit(
			E,
			model,
			"E 1 -> A / B -> B / A",
			"E 1 -> A / C -> B / D",
			createLeaf => [
				name = "E"
				references += createReference => [
					target = A
					target2 = B
				]
				
				references += createReference => [
					target = B
					target2 = A
				]
			]
		)
	}
	
	@Test
	def void edit() {
		assertModelEdit(
			E,
			model,
			"E 1 -> A / B -> B / A",
			"E 1 -> B / C -> A / D",
			createLeaf => [
				name = "E"
				references += createReference => [
					target = B
					target2 = B
				]
				
				references += createReference => [
					target = A
					target2 = A
				]
			]
		)
	}
	
	@Test
	def void selfRef() {
		val expected = createLeaf => [
			name = "G"
			references += createReference => [ target = A ]
			references += createReference => [ target = B ]
		]
		expected.references2 += createReference => [ target = expected ]

		assertModelEdit(
			G,
			model,
			"G 1 -> G",
			"G 1 -> A -> B 2 -> G",
			expected
		)
	}
	
	@Test
	def void mixedRef() {
		val sub = createLeaf => [ name = "K"]
		val sub2 = createLeaf => [ name = "L"]
		val expected = createSubContainer => [
			name = "I"
			subContents += sub
			subContents += sub2
			references += createReference => [ 
				target = sub
				target2 = B
			]
			references += createReference => [ target = sub2 ]
			references2 += createReference => [ 
				target = C
				target2 = A
			]
		]
		expected.references2 += createReference => [ target = expected ]

		assertModelEdit(
			I,
			model,
			"I { 	J L } 1 -> A / B -> J 2 -> B / A",
			"I { K L } 1 -> K / B -> L 2 -> C / A -> I",
			expected
		)
	}
	
	override protected getFeatureName() {
		""
	}
	
	override protected createModelDescriptor() {
 		new XtextSiriusModelDescriptor(injector, createXtextDirectEditModelDescription => [
 			ignoredNestedFeatures += "references.target2"
 		])
	}

	override protected analyzeResult(Object expectedResultElement, Object result) {
		super.analyzeResult(expectedResultElement, result)
		
		assertTrue(result instanceof IContainerContent)
	}
		
}