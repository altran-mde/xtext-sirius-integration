/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.editor.value

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusValueDescriptor
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusValueEditorCallback
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusValueEditor
import com.altran.general.integration.xtextsirius.test.editor.ATestFowlerdsl
import com.google.inject.Injector
import nl.altran.example.xtext.html.HtmlLangStandaloneSetup
import org.eclipse.emf.ecore.EObject
import org.junit.BeforeClass
import org.junit.Test

import static org.junit.Assert.*

class TestFowlerdslStateDescription extends ATestFowlerdsl {
	static Injector htmlInjector

	@BeforeClass
	static def void loadHtml() {
		htmlInjector = new HtmlLangStandaloneSetup().createInjectorAndDoEMFRegistration()
	}

	protected def createValueDescriptor() {
		new XtextSiriusValueDescriptor(htmlInjector, createXtextDirectEditValueDescription)
	}

	@Test
	def void existingEdit() {
		assertValueEdit(
			model.states.head,
			null,
			"<p>This is a deschkriptschion</p>\n",
			"<p>This is a <b>desch</b>kriptschion</p>\n",
			"<p>This is a <b>desch</b>kriptschion</p>\n"
		)
	}

	@Test
	def void existingInitEdit() {
		assertValueEdit(
			model.states.head,
			"<p>T",
			"<p>T",
			"<p>T",
			"<p>T"
		)
	}

	@Test
	def void existingNoOp() {
		assertValueEdit(
			model.states.head,
			null,
			"<p>This is a deschkriptschion</p>\n",
			null,
			"<p>This is a deschkriptschion</p>\n"
		)
	}

	@Test
	def void existingDelete() {
		assertValueEdit(
			model.states.head,
			null,
			"<p>This is a deschkriptschion</p>\n",
			"",
			null
		)
	}

	@Test
	def void nullEdit() {
		assertValueEdit(
			model.states.get(1),
			null,
			"",
			"<p>This is a <b>desch</b>kriptschion</p>\n",
			"<p>This is a <b>desch</b>kriptschion</p>\n"
		)
	}

	@Test
	def void nullInitEdit() {
		assertValueEdit(
			model.states.get(1),
			"<p>T",
			"<p>T",
			"<p>T",
			"<p>T"
		)
	}

	@Test
	def void nullNoOp() {
		assertValueEdit(
			model.states.get(1),
			null,
			"",
			null,
			null
		)
	}

	@Test
	def void nullDelete() {
		assertValueEdit(
			model.states.get(1),
			null,
			"",
			"",
			null
		)
	}

	@Test
	def void emptyEdit() {
		assertValueEdit(
			model.states.get(2),
			null,
			"",
			"<p>This is a <b>desch</b>kriptschion</p>\n",
			"<p>This is a <b>desch</b>kriptschion</p>\n"
		)
	}

	@Test
	def void emptyInitEdit() {
		assertValueEdit(
			model.states.get(2),
			"<p>T",
			"<p>T",
			"<p>T",
			"<p>T"
		)
	}

	@Test
	def void emptyNoOp() {
		assertValueEdit(
			model.states.get(2),
			null,
			"",
			null,
			""
		)
	}

	@Test
	def void emptyDelete() {
		assertValueEdit(
			model.states.get(2),
			null,
			"",
			"",
			null
		)
	}

	@Test
	def void blankEdit() {
		assertValueEdit(
			model.states.last,
			null,
			"  ",
			"<p>This is a <b>desch</b>kriptschion</p>\n",
			"<p>This is a <b>desch</b>kriptschion</p>\n"
		)
	}

	@Test
	def void blankInitEdit() {
		assertValueEdit(
			model.states.last,
			"<p>T",
			"<p>T",
			"<p>T",
			"<p>T"
		)
	}

	@Test
	def void blankNoOp() {
		assertValueEdit(
			model.states.last,
			null,
			"  ",
			null,
			"  "
		)
	}

	@Test
	def void blankDelete() {
		assertValueEdit(
			model.states.last,
			null,
			"  ",
			"",
			null
		)
	}

	protected def void assertValueEdit(EObject container, String initialValue, String expectedText, String changedText,
		String expectedResult) {
		val descriptor = createValueDescriptor()
		val editor = new XtextSiriusValueEditor(descriptor)

		editor.callback = new IXtextSiriusValueEditorCallback() {
			override callbackGetText() {
				changedText
			}

			override callbackInitText(String initialValue, int offset, int length) {
				val text = initialValue.substring(offset, offset + length)
				assertEquals('''doesn't match''', expectedText, text)
			}
		}

		val mep = createModelEntryPoint(container)
		editor.modelEntryPoint = mep

		editor.initValue(initialValue)

		val result = editor.commit(container)

		assertEquals(expectedResult, result)
	}
	
	protected def ModelEntryPoint createModelEntryPoint(EObject container) {
		new ModelEntryPoint(null, container, featureName)
	}

	override protected getFeatureName() {
		"description"
	}
	
	override protected createModelDescriptor() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}
