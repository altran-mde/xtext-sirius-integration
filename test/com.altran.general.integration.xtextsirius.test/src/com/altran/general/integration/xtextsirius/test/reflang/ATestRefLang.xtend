package com.altran.general.integration.xtextsirius.test.reflang

import com.altran.general.integration.xtextsirius.test.editor.ATestXtextSiriusModel
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Container
import com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangFactory
import com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage
import com.altran.general.integration.xtextsirius.test.reflang.refLang.SubContainer
import com.google.inject.Injector
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer
import org.junit.BeforeClass

import static org.junit.Assert.*
import java.util.List

abstract class ATestRefLang extends ATestXtextSiriusModel<Container> {
	protected extension RefLangFactory = RefLangFactory::eINSTANCE
	
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
		I {
			J L
		}
		1 -> A / B -> J
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
	def I() {model.contents.get(8) as SubContainer}
	
	override protected resourceName() {
		"test.reflang"
	}
	
	override protected getInjector() {
		injector
	}
	
	override protected analyzeResult(Object expectedResultElement, Object result) {
		super.analyzeResult(expectedResultElement, result)

		val base = switch (result) {
			EObject: #{result}
			List<EObject>: result
		}
			
		CrossReferencer::find(base).forEach[k, v|
			v.forEach[
				val tgt = get(false)
				if (tgt instanceof EObject) {
					assertFalse(tgt.eIsProxy)
					assertEquals(model.eResource, tgt.eResource)
				}
			]
			
		]
		
	}
		
}