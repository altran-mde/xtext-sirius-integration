package com.altran.general.integration.xtextsirius.test.integration

import com.google.inject.Injector
import org.apache.commons.lang.StringUtils
import org.eclipse.emf.ecore.EObject

import static org.junit.Assert.*

class AssertingXtextSiriusEditorCallback extends TestXtextSiriusEditorCallbackAdapter {
	val String newText
	val String expectedText

	String initialValue
	int offset
	int length

	new(Injector injector, EObject model, String newText, String expectedText) {
		super(injector, model)
		this.newText = newText
		this.expectedText = expectedText
	}

	override callbackInitText(String initialValue, int offset, int length) {
		val text = (initialValue as String).substring(offset, offset + length)
		this.initialValue = initialValue
		this.offset = offset;
		this.length = length;
		assertEquals('''doesn't match''', expectedText, text)
		super.callbackInitText(initialValue, offset, length)
	}

	override getXtextParseResult() {
		val overlay = StringUtils.overlay(initialValue, newText, offset, offset + length)
		updateEditedText(overlay)
		super.xtextParseResult
	}

	override callbackGetText() {
		this.newText
	}
}
