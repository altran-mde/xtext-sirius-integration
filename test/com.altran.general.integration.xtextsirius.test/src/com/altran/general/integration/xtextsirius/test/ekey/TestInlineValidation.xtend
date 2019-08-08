package com.altran.general.integration.xtextsirius.test.ekey

import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusValidationErrorException
import com.altran.general.integration.xtextsirius.test.EKeyLang.Container
import com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangFactory
import com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage
import com.altran.general.integration.xtextsirius.test.EKeyLang.Group
import com.altran.general.integration.xtextsirius.test.EKeyLangStandaloneSetup
import com.altran.general.integration.xtextsirius.test.editor.ATestXtextSiriusModel
import com.google.inject.Injector
import org.junit.BeforeClass
import org.junit.Test

class TestInlineValidation extends ATestXtextSiriusModel<Container> {
	extension EKeyLangFactory = EKeyLangFactory::eINSTANCE
	
	static Injector injector
	
	@BeforeClass
	static def void loadEKeyDsl() {
		EKeyLangPackage::eINSTANCE.nsPrefix
		injector = new EKeyLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	@Test
	def void validEdit() {
		val group = model.contents.filter(Group).head 
		
		assertModelEdit(
			group.leafs,
			group,
			'''
				b 2
					c 4
					d 0815''',
			'''
				b 22
					e 44
					d 08155''',
			#[
				createLeaf => [
					name = "b"
					number = 22
				],
				createLeaf => [
					name = "e"
					number = 44
				],
				createLeaf => [
					name = "d"
					number = 08155
				]
			]
		)
		
	}
	
	@Test(expected=XtextSiriusValidationErrorException)
	def void invalidEdit() {
		val group = model.contents.filter(Group).head 
		
		assertModelEdit(
			group.leafs,
			group,
			'''
				b 2
					c 4
					d 0815''',
			'''
				b 22
					b 44
					d 08155''',
			null
		)
		
	}
	
	@Test(expected=XtextSiriusSyntaxErrorException)
	def void syntaxErrorEdit() {
		val group = model.contents.filter(Group).head 
		
		assertModelEdit(
			group.leafs,
			group,
			'''
				b 2
					c 4
					d 0815''',
			'''
				whatever''',
			null
		)
	}
	
	override protected modelText() '''
		Container test
		
		group1 {
			b 2
			c 4
			d 0815
		}
	'''
	
	override protected resourceName() {
		"test.ekeylang"
	}
	
	override protected getInjector() {
		injector
	}
	
	override protected getFeatureName() {
		"leafs"
	}
	
	override protected createModelDescriptor() {
 		new XtextSiriusModelDescriptor(injector, createXtextDirectEditModelDescription => [
 			multiLine = true
 			cancelOnValidationError = true
 		])
	}
	
}