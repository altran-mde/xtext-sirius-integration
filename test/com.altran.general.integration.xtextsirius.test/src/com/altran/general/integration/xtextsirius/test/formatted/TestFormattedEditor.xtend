package com.altran.general.integration.xtextsirius.test.formatted

import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.test.editor.ATestXtextSiriusModel
import com.example.ClassesStandaloneSetup
import com.example.classes.ClassModel
import com.example.classes.ClassesFactory
import com.example.classes.ClassesPackage
import com.example.classes.Visibility
import com.google.inject.Injector
import org.junit.BeforeClass
import org.junit.Test

class TestFormattedEditor extends ATestXtextSiriusModel<ClassModel> {
	extension ClassesFactory = ClassesFactory::eINSTANCE

	static Injector injector

	@BeforeClass
	static def void loadEKeyDsl() {
		ClassesPackage::eINSTANCE.nsPrefix
		injector = new ClassesStandaloneSetup().createInjectorAndDoEMFRegistration()
	}

	@Test
	def void noEdit() {
		assertModelEdit(
			model.content.get(1),
			model,
			'''
				class B {
					+ attr : integer [2 ..5]
				}''',
			null,
			createClass => [
				name = "B"
				attributes += createAttribute => [
					name = "attr"
					visibility = Visibility::PUBLIC
					type = createIntegerType
					lowerBound = createIntegerLiteral => [value=2]
					upperBound = createIntegerLiteral => [value=5]
				]
			]
		)
	}
	
	@Test
	def void pseudoEdit() {
		assertModelEdit(
			model.content.get(1),
			model,
			'''
				class B {
					+ attr : integer [2 ..5]
				}''',
			'''
				class B {
					+ attr: integer [2..5]
				}''',
			createClass => [
				name = "B"
				attributes += createAttribute => [
					name = "attr"
					visibility = Visibility::PUBLIC
					type = createIntegerType
					lowerBound = createIntegerLiteral => [value=2]
					upperBound = createIntegerLiteral => [value=5]
				]
			]
		)
	}
	
	@Test
	def void edit() {
		assertModelEdit(
			model.content.get(1),
			model,
			'''
				class B {
					+ attr : integer [2 ..5]
				}''',
			'''
				class B {
					+ attr2: string [2 .. 4]
				}''',
			createClass => [
				name = "B"
				attributes += createAttribute => [
					name = "attr2"
					visibility = Visibility::PUBLIC
					type = createStringType
					lowerBound = createIntegerLiteral => [value=2]
					upperBound = createIntegerLiteral => [value=4]
				]
			]
		)
	}
	
	override protected modelText() '''
		class Aaaaa {}class B { + attr : integer [2 ..5]}association x Aaaaa --> B [ 1 .. 1]
	'''

	override protected resourceName() {
		"test.classes"
	}

	override protected getInjector() {
		injector
	}

	override protected getFeatureName() {
		""
	}

	override protected createModelDescriptor() {
		new XtextSiriusModelDescriptor(injector, createXtextDirectEditModelDescription => [
			multiLine = true
		])	
	}

}
