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

import org.junit.Test

class TestFowlerdslStateFeature extends ATestFowlerdslModel {
    
    protected override modelText() '''
        state A things t1 1 t2 2 t4 4 end
    '''
    
	@Test
	def void unchanged() {
        assertModelEdit(
            model.states.last,
            "t1 1 t2 2 t4 4",
            null,
            #[
                createThing => [
                    name = 't1'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 1]
                    ]   
                ],
                createThing => [
                    name = 't2'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 2]
                    ]   
                ],
                createThing => [
                    name = 't4'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 4]
                    ]   
                ]
            ]
        )
	}
	
	@Test
	def void empty() {
        assertModelEdit(
            model.states.last,
            "t1 1 t2 2 t4 4",
            null,
            null
        )
	}
	
	@Test
	def void changeFirst() {
		assertModelEdit(
            model.states.last,
            "t1 1 t2 2 t4 4",
            "t3 3 t2 2 t4 4",
            #[
                createThing => [
                    name = 't3'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 3]
                    ]   
                ],
                createThing => [
                    name = 't2'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 2]
                    ]   
                ],
                createThing => [
                    name = 't4'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 4]
                    ]   
                ]
            ]
        )
	}
	
	@Test
	def void changeBoth() {
        assertModelEdit(
            model.states.last,
            "t1 1 t2 2 t4 4",
            "t2 2 t3 3 t4 4",
            #[
                createThing => [
                    name = 't2'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 2]
                    ]   
                ],
                createThing => [
                    name = 't3'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 3]
                    ]   
                ],
                createThing => [
                    name = 't4'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 4]
                    ]   
                ]
            ]
        )
	}
	
	@Test
	def void removeLast() {
        assertModelEdit(
            model.states.last,
            "t1 1 t2 2 t4 4",
            "t1 1 t2 2",
            #[
                createThing => [
                    name = 't1'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 1]
                    ]   
                ],
                createThing => [
                    name = 't2'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 2]
                    ]   
                ]
            ]
        )
	}
	
	@Test
	def void removeFirst() {
        assertModelEdit(
            model.states.last,
            "t1 1 t2 2 t4 4",
            "t2 2 t4 4",
            #[
                createThing => [
                    name = 't2'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 2]
                    ]   
                ],
                createThing => [
                    name = 't4'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 4]
                    ]   
                ]
            ]
        )
	}
	
	@Test
	def void replace() {
        assertModelEdit(
            model.states.last,
            "t1 1 t2 2 t4 4",
            "t3 3",
            #[
                createThing => [
                    name = 't3'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 3]
                    ]   
                ]
            ]
        )
	}
	
	@Test
	def void replaceMove() {
        assertModelEdit(
            model.states.last,
            "t1 1 t2 2 t4 4",
            "t3 3 t1 1",
            #[
                createThing => [
                    name = 't3'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 3]
                    ]   
                ],
                createThing => [
                    name = 't1'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 1]
                    ]   
                ]
            ]
        )
	}
	
	@Test
	def void insertFirst() {
        assertModelEdit(
            model.states.last,
            "t1 1 t2 2 t4 4",
            "t3 3 t1 1 t2 2 t4 4",
            #[
                createThing => [
                    name = 't3'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 3]
                    ]   
                ],
                createThing => [
                    name = 't1'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 1]
                    ]   
                ],
                createThing => [
                    name = 't2'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 2]
                    ]   
                ],
                createThing => [
                    name = 't4'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 4]
                    ]   
                ]
            ]
        )
	}
	
	@Test
	def void insertLast() {
        assertModelEdit(
            model.states.last,
            "t1 1 t2 2 t4 4",
            "t1 1 t2 2 t4 4 t3 3",
            #[
                createThing => [
                    name = 't1'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 1]
                    ]   
                ],
                createThing => [
                    name = 't2'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 2]
                    ]   
                ],
                createThing => [
                    name = 't4'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 4]
                    ]   
                ],
                createThing => [
                    name = 't3'
                    guard = createValueGuard => [
                        cond = createIntLiteral => [value = 3]
                    ]   
                ]
            ]
        )
	}
	
	override protected getFeatureName() {
		"things"
	}
	
}
