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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, emptySet, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, emptySet, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, emptySet, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #{"name"}, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #{"name"}, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #{"name", "code"}, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #{"name", "code"}, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #{"name", "guard"}, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #{"name", "guard"}, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #{"name", "code"}, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #{"name", "code", "guard"}, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #{"guard"}, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(null, event, injector, true, #{"guard"}, emptySet, statemachinePackage.event_Guard)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, false, emptySet, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, false, #{"name", "guard"}, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, emptySet, emptySet)

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

		val preparer = new ModelRegionEditorPreparer(event, injector, true, #{"name", "guard"}, emptySet)

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

	@Test
	def transitionOnlyEvent_eventGuard() {
		val model = parseIntoResource('''
			events
				event0
			end
			
			state state0
				event0 => state0
			end
		''')

		val state = model.states.get(0)
		val transition = state.transitions.get(0)

		val preparer = new ModelRegionEditorPreparer(transition, injector, true, #{"event", "guard"}, emptySet)

		assertEquals('''
			events
				event0
			end
			
			state state0
				
			event0 => state0
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(41, 6), preparer.textRegion)

		assertSame(transition, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def transitionEventGuard_eventGuard() {
		val model = parseIntoResource('''
			events
				event0
			end
			
			state state0
				event0 [123] => state0
			end
		''')

		val state = model.states.get(0)
		val transition = state.transitions.get(0)

		val preparer = new ModelRegionEditorPreparer(transition, injector, true, #{"event", "guard"}, emptySet)

		assertEquals('''
			events
				event0
			end
			
			state state0
				
			event0 [123] => state0
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event0 [123]", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(41, 12), preparer.textRegion)

		assertSame(transition, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def commandNameCode_nameCode() {
		val model = parseIntoResource('''
			commands
				cmd1 123
			end
		''')

		val cmd = model.commands.get(0)

		val preparer = new ModelRegionEditorPreparer(cmd, injector, true, #{"code", "name"}, emptySet)

		assertEquals('''
			commands
				
			cmd1 123
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("cmd1 123", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(13, 8), preparer.textRegion)

		assertSame(cmd, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def commandGuardNameCode_nameCode() {
		val model = parseIntoResource('''
			commands
				[123]cmd1 123
			end
		''')

		val cmd = model.commands.get(0)

		val preparer = new ModelRegionEditorPreparer(cmd, injector, true, #{"code", "name"}, emptySet)

		assertEquals('''
			commands
				[123]
			cmd1 123
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("cmd1 123", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(18, 8), preparer.textRegion)

		assertSame(cmd, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def commandGuardNameCode_guardName() {
		val model = parseIntoResource('''
			commands
				[123]cmd1 123
			end
		''')

		val cmd = model.commands.get(0)

		val preparer = new ModelRegionEditorPreparer(cmd, injector, true, #{"guard", "name"}, emptySet)

		assertEquals('''
			commands
				
			[123]cmd1 123
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("[123]cmd1", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(13, 9), preparer.textRegion)

		assertSame(cmd, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def commandNameCode_guard() {
		val model = parseIntoResource('''
			commands
				cmd1 123
			end
		''')

		val cmd = model.commands.get(0)

		val preparer = new ModelRegionEditorPreparer(cmd, injector, true, #{"guard"}, emptySet)

		assertEquals('''
			commands
				[
			]cmd1 123
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(14, 0), preparer.textRegion)

		assertSame(cmd, preparer.semanticElementLocation.resolve(model.eResource))
	}

}
