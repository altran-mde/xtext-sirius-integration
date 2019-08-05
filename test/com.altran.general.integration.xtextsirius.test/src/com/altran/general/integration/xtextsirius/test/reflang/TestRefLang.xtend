package com.altran.general.integration.xtextsirius.test.reflang

import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.test.editor.ATestXtextSiriusModel
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Container
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Leaf
import com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangFactory
import com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage
import com.google.inject.Injector
import org.junit.BeforeClass
import org.junit.Test

import static org.junit.Assert.*
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer
import org.eclipse.emf.ecore.EObject

class TestRefLang extends ATestXtextSiriusModel<Container>{
	extension RefLangFactory = RefLangFactory::eINSTANCE
	
	static Injector injector
	
	@BeforeClass
	static def void loadEKeyDsl() {
		RefLangPackage::eINSTANCE.nsPrefix
		injector = new RefLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override protected modelText() '''
		// 0
		A
		
		// 1
		B
		
		// 2
		C
		1 -> A
		
		// 3
		D
		1 -> A / B
		
		// 4
		E
		1 -> A / B -> B / A
		
		// 5
		F
		1 -> A -> A / A
		
		// 6
		G
		1 -> G
		
		// 7
		H
		1 -> A / G
		
		// 8
		I
		1 -> A / B
		2 -> B / A
	'''
	
	def A() {model.contents.get(0)}
	def B() {model.contents.get(1)}
	def C() {model.contents.get(2)}
	def D() {model.contents.get(3)}
	def E() {model.contents.get(4)}
	def F() {model.contents.get(5)}
	def G() {model.contents.get(6)}
	def H() {model.contents.get(7)}
	def I() {model.contents.get(8)}
	
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
	
	override protected analyzeResult(Object expectedResultElement, Object result) {
		super.analyzeResult(expectedResultElement, result)
		
		assertTrue(result instanceof Leaf)
		
		val leaf = result as Leaf
		
		CrossReferencer::find(#{leaf}).forEach[k, v|
			v.forEach[
				val tgt = get(false)
				if (tgt instanceof EObject) {
					assertFalse(tgt.eIsProxy)
					assertEquals(model.eResource, tgt.eResource)
				}
			]
			
		]
	}
		
	override protected resourceName() {
		"test.reflang"
	}
	
	override protected getInjector() {
		injector
	}
	
	override protected getFeatureName() {
		""
	}
	
	override protected createModelDescriptor() {
 		new XtextSiriusModelDescriptor(injector, createXtextDirectEditModelDescription => [
 			ignoredNestedFeatures += "references.target2"
 		])
	}
}