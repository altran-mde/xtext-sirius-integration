/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.integration

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory
import com.altran.general.integration.xtextsirius.test.FowlerdslEnvironment
import com.altran.general.integration.xtextsirius.test.InlineFowlerdslEnvironment
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory
import org.espilce.commons.emf.testsupport.AModelLoader
import org.junit.After
import org.junit.Before
import org.junit.BeforeClass

abstract class ATestFowlerdsl {
	protected extension AModelLoader modelLoader = new AModelLoader() {
		override provideResourceSet() {
			new ResourceSetImpl()
		}
	}
	
	protected extension DiagramxtextFactory diagramFactory = DiagramxtextFactory::eINSTANCE
	protected extension StatemachineFactory statemachineFactory = StatemachineFactory::eINSTANCE
	
	protected Statemachine model
	
	@BeforeClass
	static def void loadFowlerds() {
		FowlerdslEnvironment::getInstance
		InlineFowlerdslEnvironment::getInstance
	}
	
	protected def String modelText()
	
	protected def parseModel() {
		val result = modelText.parseModel("test.statemachine") as Statemachine
		EcoreUtil::resolveAll(result)
		return result
	}

	@Before
	def void loadModel() {
		model = parseModel()
	}
	
	@After
	def void unloadModel() {
		model.eResource.unload
	}
	
	
	protected def getInjector() {
		FowlerdslEnvironment::instance.injector
	}
	
	protected def getInlineInjector() {
		InlineFowlerdslEnvironment::instance.injector
	}
}
