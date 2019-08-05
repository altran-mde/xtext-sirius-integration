/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.editor

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory
import com.altran.general.integration.xtextsirius.test.FowlerdslEnvironment
import com.altran.general.integration.xtextsirius.test.InlineFowlerdslEnvironment
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory
import org.junit.BeforeClass

abstract class ATestFowlerdsl extends ATestXtextSiriusModel<Statemachine> {
	protected extension DiagramxtextFactory diagramFactory = DiagramxtextFactory::eINSTANCE
	protected extension StatemachineFactory statemachineFactory = StatemachineFactory::eINSTANCE
	
	@BeforeClass
	static def void loadFowlerdsl() {
		FowlerdslEnvironment::getInstance
		InlineFowlerdslEnvironment::getInstance
	}
	
	protected override modelText() '''
		events
		 eventSD 2 [ c2 .. c1 ]
		 event2 3 [ 2 ]
		 event4 3 [ c1 ]
		 event3 4 
		end
		
		commands
		 cmd0 23
		 cmd1 42
		end
		
		constants
		 c1 23
		 c2 42
		end
		
		state A 
			description "<p>This is a deschkriptschion</p>\n"
			event2 => A
			event2 => B
		end
		
		state B
		
		end
		
		state C
			description ""
		end
		
		state D
			description "  "
		end
	'''
	
	override protected resourceName() {
		"test.statemachine"
	}
	
	protected override getInjector() {
		FowlerdslEnvironment::instance.injector
	}
	
	protected def getInlineInjector() {
		InlineFowlerdslEnvironment::instance.injector
	}
}
