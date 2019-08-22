package com.altran.general.integration.xtextsirius.test.formatted

import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.test.editor.ATestXtextSiriusModel
import com.example.ClassesStandaloneSetup
import com.example.classes.ClassModel
import com.example.classes.ClassesFactory
import com.example.classes.ClassesPackage
import com.google.inject.Injector
import org.junit.BeforeClass
import org.junit.Test
import com.example.classes.Visibility

class TestFormattedIgnoreNested extends ATestXtextSiriusModel<ClassModel>{
	extension ClassesFactory = ClassesFactory::eINSTANCE

	static Injector injector

	@BeforeClass
	static def void loadEKeyDsl() {
		ClassesPackage::eINSTANCE.nsPrefix
		injector = new ClassesStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	@Test
	def void changeNested() {
		assertModelEdit(
			model.content.last,
			model,
			'''
				class D {
					class A {
						class B {
							+ inB: C[0..1]
						}
						+ inA: C[0..1]
					}
				}''',
			'''
				class D {
					class A {
						class B {
							+ inB: E[0..1]
						}
						+ inA: E[0..1]
					}
				}''',
			createClass => [
				name = "D"
				subClasses += createClass => [
					name = "A"
					attributes += createAttribute => [
						name = "inA"
						visibility = Visibility::PUBLIC
						type = createClassRef => [target = model.content.head as com.example.classes.Class]
						lowerBound = createIntegerLiteral => [value = 0]
						upperBound = createIntegerLiteral => [value = 1]
					]
					subClasses += createClass => [
						name = "B"
						attributes += createAttribute => [
							name = "inB"
							visibility = Visibility::PUBLIC
							type = createClassRef => [target = model.content.get(1) as com.example.classes.Class]
							lowerBound = createIntegerLiteral => [value = 0]
							upperBound = createIntegerLiteral => [value = 1]
						]
					]
				]
			]
		)
	}
	
	override protected modelText() '''
		class C {
			
		}
		
		class E {
			
		}
		
		class D {
			class A {
				class B {
					+ inB: C[0..1]
				}
				+ inA: C[0..1]
			}
		}
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
			ignoredNestedFeatures += "subClasses.attributes"
		])	
	}
}