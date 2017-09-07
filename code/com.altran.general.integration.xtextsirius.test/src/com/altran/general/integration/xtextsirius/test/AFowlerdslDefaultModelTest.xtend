package com.altran.general.integration.xtextsirius.test

import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory

abstract class AFowlerdslDefaultModelTest extends AFowlerdslTest {
	protected static extension StatemachineFactory statemachineFactory = StatemachineFactory.eINSTANCE
	
	def protected getDefaultModel() {
		parseIntoResource('''
			events
				event1X aaa
				event2X bbb [123]
				event3X ccc [constant1X]
				event4X ddd [constant2X .. 234]
			end
			
			constants
				constant1X 42
				constant2X 23
				constant3X constant1X
			end
		''', "/proj/other.statemachine")
		
		parseIntoResource('''
			
					
			
			     
			
			events
				event1 aaa
				event2 bbb [123]
				event3
			ccc	 	[
			constant1			]    
			
				event4 ddd [constant2X]
				event5 eee [constant3X .. constant2]
			end
			
			constants
				constant1 42
				constant2 constant1
				constant3 constant1X
			end
			
			state State1
				event1 => State2
			end
			
			state State2
				description "asdf"
			end
			
			state State3
				event2 => State32
				event3 => State33
				event5 => State35
			end
			
			state State32
			
			end
			
			state State33
			
			end
			
			state State35
			
			end
		''')
	}
	
	def protected <T extends EObject> T findFirstByName(Collection<T> collection, String name) {
		collection.findFirst[it.eGet(it.eClass.getEStructuralFeature("name")) == name]
	}
}