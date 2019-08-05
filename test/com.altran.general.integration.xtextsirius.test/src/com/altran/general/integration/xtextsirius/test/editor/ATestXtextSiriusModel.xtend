package com.altran.general.integration.xtextsirius.test.editor

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster
import com.altran.general.integration.xtextsirius.test.editor.model.AssertingXtextSiriusEditorCallback
import com.altran.general.integration.xtextsirius.test.editor.model.TestXtextSiriusModelEditorAdapter
import com.google.inject.Injector
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.espilce.commons.emf.testsupport.AModelLoader
import org.espilce.commons.lang.StringUtils2
import org.junit.After
import org.junit.Before

import static org.espilce.commons.emf.testsupport.AssertEmf.*

abstract class ATestXtextSiriusModel<M extends EObject> {
	
	protected extension AModelLoader modelLoader = new AModelLoader() {
		override provideResourceSet() {
			new ResourceSetImpl()
		}
	}
	
	protected M model

	@Before
	def void loadModel() {
		model = parseModel()
	}
	
	@After
	def void unloadModel() {
		model?.eResource?.unload
	}
	
	protected def CharSequence modelText()

	protected def String resourceName()

	protected def Injector getInjector()

	protected def String getFeatureName()
	
	protected def M parseModel() {
		val result = StringUtils2::normalizeNewline(modelText.toString).parseModel(resourceName())
		EcoreUtil::resolveAll(result)
		return result as M
	}
	
	protected def void assertModelEdit(EObject elementToEdit, String expectedText, String newText, Object expectedResultElement) {
		assertModelEdit(elementToEdit, elementToEdit, getFeatureName(), expectedText, newText, expectedResultElement)
	}
	
	protected def void assertModelEdit(Object elementToEdit, EObject fallbackContainer, String expectedText, String newText, Object expectedResultElement) {
		assertModelEdit(elementToEdit, fallbackContainer, getFeatureName(), expectedText, newText, expectedResultElement)
	}
	
	protected def void assertModelEdit(Object elementToEdit, EObject fallbackContainer, String valueFeatureName, String expectedText, String newText, Object expectedResultElement) {
		val descriptor = createModelDescriptor()
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

	protected def IXtextSiriusModelDescriptor createModelDescriptor()
}