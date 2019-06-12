/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.editor.model

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster
import com.altran.general.integration.xtextsirius.test.editor.ATestFowlerdsl
import java.util.List
import org.eclipse.emf.ecore.EObject

import static org.espilce.commons.emf.testsupport.AssertEmf.*

abstract class ATestFowlerdslModel extends ATestFowlerdsl {
	
	protected def void assertEdit(EObject elementToEdit, String expectedText, String newText, Object expectedResultElement) {
		assertEdit(elementToEdit, elementToEdit, getFeatureName(), expectedText, newText, expectedResultElement)
	}
	
	protected def void assertEdit(Object elementToEdit, EObject fallbackContainer, String expectedText, String newText, Object expectedResultElement) {
		assertEdit(elementToEdit, fallbackContainer, getFeatureName(), expectedText, newText, expectedResultElement)
	}
	
	protected def void assertEdit(Object elementToEdit, EObject fallbackContainer, String valueFeatureName, String expectedText, String newText, Object expectedResultElement) {
		val descriptor = createDescriptor()
		val editor = new TestXtextSiriusModelEditorAdapter(descriptor)
		
		var callback = new AssertingXtextSiriusEditorCallback(injector, model, newText, expectedText)
		editor.callback = callback
		
		val mep = new ModelEntryPoint(if (elementToEdit instanceof EObject) elementToEdit else null, fallbackContainer, valueFeatureName)
		editor.modelEntryPoint = mep
		editor.initValue(elementToEdit)
		
		val commitTarget = new MinimalModelAdjuster().getClosestElement(mep)
		val result = editor.commit(commitTarget)
		if (expectedResultElement instanceof EObject) {
			assertModelEquals(expectedResultElement, result as EObject)
		} else if (expectedResultElement instanceof List) {
			assertModelEquals(expectedResultElement, result as List<EObject>)
		}
	}

	protected def createDescriptor() {
		new XtextSiriusModelDescriptor(inlineInjector, createXtextDirectEditModelDescription)
	}
}
