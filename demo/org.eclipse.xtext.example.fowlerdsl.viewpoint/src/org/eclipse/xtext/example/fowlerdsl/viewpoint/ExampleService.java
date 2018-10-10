/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.example.fowlerdsl.viewpoint;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public class ExampleService implements IExternalJavaAction {

	public ExampleService() {
		System.out.println("I'm here");
	}

	@Override
	public boolean canExecute(final Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(final Collection<? extends EObject> arg0, final Map<String, Object> arg1) {
		System.out.println("Hello, World!");
	}
	
}
