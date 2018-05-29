package com.altran.general.integration.xtextsirius.runtime.converter;

import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.properties.ControlDescription;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;

public interface ICompatibleDescriptionConverter {
	/**
	 * Indicates if the converter can handle the given description.
	 *
	 * @param description
	 *            An EObject used in the Sirius model
	 * @return <code>true</code> if the converter can handle it, or
	 *         <code>false</code> otherwise
	 */
	boolean canHandle(final EObject description);
	
	/**
	 * Converts the description EObject used in the Sirius model to an EObject
	 * for the EEF model. The objects created for the given description should
	 * be entered in the cache by the creator of the object.
	 *
	 * @param description
	 *            The EObject used in the Sirius model
	 * @param parameters
	 *            Additional parameters that can be used during the
	 *            transformation
	 * @param cache
	 *            The cache of the object created for the given description.
	 * @return An EObject to be used in the EEF description
	 */
	EObject convert(EObject description, Map<String, Object> parameters, ICompatibleCache cache,
			Function<ControlDescription, String> identifierGetter,
			Function<InitialOperation, String> expressionForOperationGetter);
	
}
