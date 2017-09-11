package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import com.altran.general.integration.xtextsirius.util.ModelRegionEditorPreparer
import org.eclipse.xtext.util.TextRegion
import org.junit.Test

import static org.junit.Assert.*

class TestApiSingleEntry extends AModelRegionEditorPreparer {
	@Test
	def eventOnlyName() {
		val model = parseIntoResource('''
			events
				event0
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, emptyList)

		assertEquals('''
			events
				
			event0
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 6), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCode() {
		val model = parseIntoResource('''
			events
				event0 1
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, emptyList)

		assertEquals('''
			events
				
			event0 1
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0 1", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 8), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCodeGuard() {
		val model = parseIntoResource('''
			events
				event0 1 [1..pi]
			end
			
			constants
				pi 314
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, emptyList)

		assertEquals('''
			events
				
			event0 1 [1..pi]
			end
			
			constants
				pi 314
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0 1 [1..pi]",
			preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 16), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventOnlyName_name() {
		val model = parseIntoResource('''
			events
				event0
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #["name"])

		assertEquals('''
			events
				
			event0
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 6), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCode_name() {
		val model = parseIntoResource('''
			events
				event0 123
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #["name"])

		assertEquals('''
			events
				
			event0 123
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 6), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCode_nameCode() {
		val model = parseIntoResource('''
			events
				event0 123
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #["name", "code"])

		assertEquals('''
			events
				
			event0 123
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0 123", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 10), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameGuard_nameCode() {
		val model = parseIntoResource('''
			events
				event0 [1..2]
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #["name", "code"])

		assertEquals('''
			events
				
			event0 [1..2]
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 6), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameGuard_nameGuard() {
		val model = parseIntoResource('''
			events
				event0 [1..2]
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #["name", "guard"])

		assertEquals('''
			events
				
			event0 [1..2]
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0 [1..2]", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 13), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCodeGuard_nameGuard() {
		val model = parseIntoResource('''
			events
				event0 123 [1..2]
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #["name", "guard"])

		assertEquals('''
			events
				
			event0 123 [1..2]
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0 123 [1..2]",
			preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 17), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventName_nameCode() {
		val model = parseIntoResource('''
			events
				event0
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #["name", "code"])

		assertEquals('''
			events
				
			event0
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 6), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventName_nameCodeGuard() {
		val model = parseIntoResource('''
			events
				event0
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #["name", "code", "guard"])

		assertEquals('''
			events
				
			event0
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 6), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventName_guard() {
		val model = parseIntoResource('''
			events
				event0
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #["guard"])

		assertEquals('''
			events
				event0[
			]
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(18, 0), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def guard_self() {
		val model = parseIntoResource('''
			events
				event0
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(null, event, injector, true, #["guard"], statemachinePackage.event_Guard)

		assertEquals('''
			events
				event0[
			]
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(18, 0), preparer.textRegion)

		assertNull(preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCode_singleLine() {
		val model = parseIntoResource('''
			events
				event0
				
				
				1
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, false, emptyList)

		assertEquals('''
			events
				
			event0  	  	  	1
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0  	  	  	1", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 16), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameGuard_nameGuard_singleLine() {
		val model = parseIntoResource('''
			events
				event0 		[
			1		  		..
			2               ]
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, false, #["name", "guard"])

		assertEquals('''
			events
				
			event0 		[  1		  		..  2               ]
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0 \t\t[  1\t\t  \t\t..  2               ]", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 40), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCode_multiLine() {
		val model = parseIntoResource('''
			events
				event0
				
				
				1
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, emptyList)

		assertEquals('''
			events
				
			event0
				
				
				1
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0\r\n\t\r\n\t\r\n\t1", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 16), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameGuard_nameGuard_multiLine() {
		val model = parseIntoResource('''
			events
				event0 		[
			1		  		..
			2               ]
			end
		''')

		val event = model.events.get(0)

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #["name", "guard"])

		assertEquals('''
			events
				
			event0 		[
			1		  		..
			2               ]
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0 \t\t[\r\n1\t\t  \t\t..\r\n2               ]", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(11, 40), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

}
