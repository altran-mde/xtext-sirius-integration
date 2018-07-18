package com.altran.general.integration.xtextsirius.runtime.converter;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.properties.core.api.TransformationCache;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineValueDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextFactory;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineValueDescription;

public class XtextMultiLineValueDescriptionConverter extends AXtextDescriptionConverter {
	
	@Override
	public boolean canHandle(final EObject description) {
		return description instanceof XtextMultiLineValueDescription;
	}

	@Override
	public EObject convert(final EObject description, final Map<String, Object> parameters,
			final TransformationCache cache) {
		if (description instanceof XtextMultiLineValueDescription) {
			final XtextMultiLineValueDescription propertyDescription = (XtextMultiLineValueDescription) description;

			final EefXtextMultiLineValueDescription eefDescription = EefxtextFactory.eINSTANCE
					.createEefXtextMultiLineValueDescription();
			eefDescription.setIdentifier(propertyDescription.getName());
			eefDescription.setHelpExpression(propertyDescription.getHelpExpression());
			eefDescription.setIsEnabledExpression(propertyDescription.getIsEnabledExpression());
			eefDescription.setLabelExpression(propertyDescription.getLabelExpression());

			eefDescription.setValueExpression(propertyDescription.getValueExpression());

			final InitialOperation initialOperation = propertyDescription.getInitialOperation();
			eefDescription.setEditExpression(getExpressionForOperation(initialOperation));

			eefDescription.setLineCount(propertyDescription.getLineCount());

			eefDescription.setInjectorId(propertyDescription.getInjectorId());
			eefDescription.setMultiLine(propertyDescription.isMultiLine());

			eefDescription.setPrefixTextExpression(propertyDescription.getPrefixTextExpression());
			eefDescription.setSuffixTextExpression(propertyDescription.getSuffixTextExpression());

			// Let's not forget to populate the cache for the other converters
			// or link resolvers
			cache.put(propertyDescription, eefDescription);

			return eefDescription;
		}
		return null;
	}
}