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

import com.google.inject.Injector
import org.apache.commons.lang.StringUtils
import org.eclipse.emf.ecore.EObject

import static org.junit.Assert.*
import org.espilce.commons.lang.StringUtils2

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
		val text = initialValue.substring(offset, offset + length)
		this.initialValue = initialValue
		this.offset = offset;
		this.length = length;
		assertEquals('''doesn't match''', expectedText, StringUtils2::normalizeNewline(text))
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
