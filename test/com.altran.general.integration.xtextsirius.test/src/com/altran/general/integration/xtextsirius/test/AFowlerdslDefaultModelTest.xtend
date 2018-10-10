/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test

import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory

abstract class AFowlerdslDefaultModelTest extends AFowlerdslTest {
	protected static extension StatemachineFactory statemachineFactory = StatemachineFactory.eINSTANCE
	
	def protected getDefaultModel() {
		parseIntoResource('''
			events
				event1X 111
				event2X 222 [123]
				event3X 333 [constant1X]
				event4X 444 [constant2X .. 234]
			end
			
			constants
				constant1X 42
				constant2X 23
				constant3X constant1X
			end
		''', "/proj/other.statemachine")
		
		parseIntoResource('''
			
					
			
			     
			
			events
				event1 111
				event2 222 [123]
				event3
			333	 	[
			constant1			]    
			
				event4 444 [constant2X]
				event5 555 [constant3X .. constant2]
			end
			
			commands
				command1 123
				[123] command2 234
				[constant2X..constant1] command3 345
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
