package com.altran.general.integration.xtextsirius.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;

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
			final String result = SessionManager.INSTANCE.getSession(semanticObject).getInterpreter().evaluateString(
					semanticObject,
					expression);
			return result;
		} catch (final EvaluationException e) {
			return "";
		}
	}
}
