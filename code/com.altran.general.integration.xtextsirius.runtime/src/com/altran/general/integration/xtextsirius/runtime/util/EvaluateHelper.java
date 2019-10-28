/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.interpreter.CompoundInterpreter;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;

/**
 * Easy access to Sirius' interpreters.
 */
public class EvaluateHelper {
	
	private static EvaluateHelper instance;
	
	protected EvaluateHelper() {
		
	}
	
	public static @NonNull EvaluateHelper getInstance() {
		if (instance == null) {
			instance = new EvaluateHelper();
		}
		
		return instance;
	}
	
	public @NonNull String evaluateString(final @NonNull String expression, final @NonNull EObject semanticObject) {
		try {
			final Session session = SessionManager.INSTANCE.getSession(semanticObject);
			String result;
			if (session != null) {
				result = session.getInterpreter().evaluateString(
						semanticObject,
						expression);
				return result;
			} else {
				result = CompoundInterpreter.createGenericInterpreter().evaluateString(semanticObject, expression);
			}
			return result;
		} catch (final EvaluationException e) {
			return "";
		}
	}
}
