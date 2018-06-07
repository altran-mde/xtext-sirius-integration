package com.altran.general.integration.xtextsirius.runtime.converter;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.properties.core.api.TransformationCache;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextFactory;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineModelDescription;

public class XtextSingleLineModelDescriptionConverter extends AXtextDescriptionConverter {

	@Override
	public boolean canHandle(final EObject description) {
		return description instanceof XtextSingleLineModelDescription;
	}

	@Override
	public EObject convert(final EObject description, final Map<String, Object> parameters,
			final TransformationCache cache) {
		if (description instanceof XtextSingleLineModelDescription) {
			final XtextSingleLineModelDescription propertyDescription = (XtextSingleLineModelDescription) description;
			
			final EefXtextSingleLineModelDescription eefDescription = EefxtextFactory.eINSTANCE
					.createEefXtextSingleLineModelDescription();
			eefDescription.setIdentifier(propertyDescription.getName());
			eefDescription.setHelpExpression(propertyDescription.getHelpExpression());
			eefDescription.setIsEnabledExpression(propertyDescription.getIsEnabledExpression());
			eefDescription.setLabelExpression(propertyDescription.getLabelExpression());
			
			eefDescription.setValueExpression(propertyDescription.getValueExpression());
			
			final InitialOperation initialOperation = propertyDescription.getInitialOperation();
			eefDescription.setEditExpression(getExpressionForOperation(initialOperation));
			
			eefDescription.setLineCount(1);
			
			eefDescription.setInjectorId(propertyDescription.getInjectorId());
			eefDescription.setMultiLine(propertyDescription.isMultiLine());
			
			eefDescription.getEditableFeatures().addAll(propertyDescription.getEditableFeatures());
			
			// Let's not forget to populate the cache for the other converters
			// or link resolvers
			cache.put(propertyDescription, eefDescription);
			
			return eefDescription;
		}
		return null;
	}
}
