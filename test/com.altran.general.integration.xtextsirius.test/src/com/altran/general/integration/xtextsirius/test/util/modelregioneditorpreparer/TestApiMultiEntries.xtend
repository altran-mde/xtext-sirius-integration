/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint
import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionEditorPreparer
import org.eclipse.xtext.util.TextRegion
import org.junit.Test

import static org.junit.Assert.*

class TestApiMultiEntries extends AModelRegionEditorPreparer {
	@Test
	def eventOnlyName() {
		val model = parseIntoResource('''
			events
				event0
				event1
				event2
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineDescriptor, event)

		assertEquals('''
			events
				event0
				
			event1
				event2
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(20, 6), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCode() {
		val model = parseIntoResource('''
			events
				event0 1
				event1 2
				event2 3
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineDescriptor, event)

		assertEquals('''
			events
				event0 1
				
			event1 2
				event2 3
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1 2", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(22, 8), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCodeGuard() {
		val model = parseIntoResource('''
			events
				event0 1 [pi..1]
				event1 2 [42]
				event3
			end
			
			constants
				pi 314
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineDescriptor, event)

		assertEquals('''
			events
				event0 1 [pi..1]
				
			event1 2 [42]
				event3
			end
			
			constants
				pi 314
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1 2 [42]",
			preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(30, 13), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventOnlyName_name() {
		val model = parseIntoResource('''
			events
				event0
				event1
				event2
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"name"}), event)

		assertEquals('''
			events
				event0
				
			event1
				event2
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(20, 6), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCode_name() {
		val model = parseIntoResource('''
			events
				event0 123
				event1 234
				event2 345
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"name"}), event)

		assertEquals('''
			events
				event0 123
				
			event1 234
				event2 345
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(24, 6), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCode_nameCode() {
		val model = parseIntoResource('''
			events
				event0 123
				event1 234
				event2 345
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"name", "code"}), event)

		assertEquals('''
			events
				event0 123
				
			event1 234
				event2 345
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1 234", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(24, 10), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameGuard_nameCode() {
		val model = parseIntoResource('''
			events
				event0 [pi..1]
				event1 [42]
				event3
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"name", "code"}), event) 

		assertEquals('''
			events
				event0 [pi..1]
				
			event1 [42]
				event3
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(28, 6), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameGuard_nameGuard() {
		val model = parseIntoResource('''
			events
				event0 [pi..1]
				event1 [42]
				event3
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"name", "guard"}), event) 

		assertEquals('''
			events
				event0 [pi..1]
				
			event1 [42]
				event3
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1 [42]", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(28, 11), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCodeGuard_nameGuard() {
		val model = parseIntoResource('''
			events
				event0 123 [pi..1]
				event1 234 [42]
				event3 345
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"name", "guard"}), event)

		assertEquals('''
			events
				event0 123 [pi..1]
				
			event1 234 [42]
				event3 345
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1 234 [42]",
			preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(32, 15), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventName_nameCode() {
		val model = parseIntoResource('''
			events
				event0
				event1
				event2
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"name", "code"}), event) 

		assertEquals('''
			events
				event0
				
			event1
				event2
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(20, 6), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventName_nameCodeGuard() {
		val model = parseIntoResource('''
			events
				event0
				event1
				event2
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"name", "code", "guard"}), event)

		assertEquals('''
			events
				event0
				
			event1
				event2
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(20, 6), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventName_guard() {
		val model = parseIntoResource('''
			events
				event0
				event1
				event2
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"guard"}), event)

		assertEquals('''
			events
				event0
				event1[
			]
				event2
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(27, 0), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def guard_self() {
		val model = parseIntoResource('''
			events
				event0
				event1
				event2
			end
		''')

		val event = model.events.get(1)

		val preparer = new ModelRegionEditorPreparer(multilineDescriptor, new ModelEntryPoint(null, event, statemachinePackage.event_Guard))

		assertEquals('''
			events
				event0
				event1[
			]
				event2
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(27, 0), preparer.textRegion)

		assertNull(preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCode_singleLine() {
		val model = parseIntoResource('''
			events
				event0
				
				
				1
				event1
				
				
				2
				event2
				
				
				3
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(descriptor, event)

		assertEquals('''
			events
				event0
				
				
				1
				
			event1  	  	  	2
				event2
				
				
				3
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1  	  	  	2", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(30, 16), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameGuard_nameGuard_singleLine() {
		val model = parseIntoResource('''
			events
				event0 		[
			1		  		..
			2               ]
			event1
				[
				    42
				    	] event2
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(editableFeatureDescriptor(#{"name", "guard"}), event) 

		assertEquals('''
			events
				event0 		[
			1		  		..
			2               ]
			
			event1  	[  	    42  	    	] event2
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1  \t[  \t    42  \t    \t]", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(53, 28), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameCode_multiLine() {
		val model = parseIntoResource('''
			events
				event0
				
				
				1
				event1
				
				
				2
				event2
				
				
				3
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineDescriptor, event)

		assertEquals('''
			events
				event0
				
				
				1
				
			event1
				
				
				2
				event2
				
				
				3
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1\r\n\t\r\n\t\r\n\t2", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(30, 16), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def eventNameGuard_nameGuard_multiLine() {
		val model = parseIntoResource('''
			events
				event0 		[
			1		  		..
			2               ]
			event1
				[
				    42
				    	] event2
			end
		''')

		val event = model.events.get(1)

		val preparer = createPreparer(multilineSelectedFeatureDescriptor(#{"name", "guard"}), event)

		assertEquals('''
			events
				event0 		[
			1		  		..
			2               ]
			
			event1
				[
				    42
				    	] event2
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1\r\n\t[\r\n\t    42\r\n\t    \t]", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(53, 28), preparer.textRegion)

		assertSame(event, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def transitionOnlyEvent_eventGuard() {
		val model = parseIntoResource('''
			events
				event0
				event1
				event2
			end
			
			state state0
				event0 => state1
				event1 => state2
				event2 => state2
			end
			
			state state1
			end
			
			state state2
			end
		''')

		val state = model.states.get(0)
		val transition = state.transitions.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"event", "guard"}), transition)

		assertEquals('''
			events
				event0
				event1
				event2
			end
			
			state state0
				event0 => state1
				
			event1 => state2
				event2 => state2
			end
			
			state state1
			end
			
			state state2
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(78, 6), preparer.textRegion)

		assertSame(transition, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def transitionEventGuard_eventGuard() {
		val model = parseIntoResource('''
			events
				event0
				event1
				event2
			end
			
			constants
				const0 23
			end
			
			state state0
				event0 => state1
				event1 [const0] => state2
				event2 => state2
			end
			
			state state1
			end
			
			state state2
			end
		''')

		val state = model.states.get(0)
		val transition = state.transitions.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"event", "guard"}), transition)

		assertEquals('''
			events
				event0
				event1
				event2
			end
			
			constants
				const0 23
			end
			
			state state0
				event0 => state1
				
			event1 [const0] => state2
				event2 => state2
			end
			
			state state1
			end
			
			state state2
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("event1 [const0]", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(108, 15), preparer.textRegion)

		assertSame(transition, preparer.semanticElementLocation.resolve(model.eResource))
	}
	
	@Test
	def commandNameCode_nameCode() {
		val model = parseIntoResource('''
			commands
				cmd0 12
				cmd1 123
				[e.. pi] cmd2 234
			end
			
			constants
				e 271
				pi 314
			end
		''')

		val cmd = model.commands.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"code", "name"}), cmd)

		assertEquals('''
			commands
				cmd0 12
				
			cmd1 123
				[e.. pi] cmd2 234
			end
			
			constants
				e 271
				pi 314
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("cmd1 123", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(23, 8), preparer.textRegion)

		assertSame(cmd, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def commandGuardNameCode_nameCode() {
		val model = parseIntoResource('''
			commands
				cmd0 12
				[123] cmd1 123
				[e.. pi] cmd2 234
			end
			
			constants
				e 271
				pi 314
			end
		''')

		val cmd = model.commands.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"code", "name"}), cmd)

		assertEquals('''
			commands
				cmd0 12
				[123] 
			cmd1 123
				[e.. pi] cmd2 234
			end
			
			constants
				e 271
				pi 314
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("cmd1 123", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(29, 8), preparer.textRegion)

		assertSame(cmd, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def commandGuardNameCode_guardName() {
		val model = parseIntoResource('''
			commands
				cmd0 12
				[123] cmd1 123
				[e.. pi] cmd2 234
			end
			
			constants
				e 271
				pi 314
			end
		''')

		val cmd = model.commands.get(2)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"guard", "name"}), cmd)

		assertEquals('''
			commands
				cmd0 12
				[123] cmd1 123
				
			[e.. pi] cmd2 234
			end
			
			constants
				e 271
				pi 314
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("[e.. pi] cmd2", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(40, 13), preparer.textRegion)

		assertSame(cmd, preparer.semanticElementLocation.resolve(model.eResource))
	}

	@Test
	def commandNameCode_guard() {
		val model = parseIntoResource('''
			commands
				cmd0 12
				cmd1 123
				[e.. pi] cmd2 234
			end
			
			constants
				e 271
				pi 314
			end
		''')

		val cmd = model.commands.get(1)

		val preparer = createPreparer(multilineEditableFeatureDescriptor(#{"guard"}), cmd)

		assertEquals('''
			commands
				cmd0 12
				[
			]cmd1 123
				[e.. pi] cmd2 234
			end
			
			constants
				e 271
				pi 314
			end
		'''.toString, preparer.text)

		val textRegion = preparer.textRegion
		assertEquals("", preparer.text.substring(textRegion.offset, textRegion.offset + textRegion.length))

		assertEquals(new TextRegion(24, 0), preparer.textRegion)

		assertSame(cmd, preparer.semanticElementLocation.resolve(model.eResource))
	}
}
