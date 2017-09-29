package com.altran.general.integration.xtextsirius.coverter.ui.internal;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.ui.properties.api.AbstractDescriptionConverter;
import org.eclipse.sirius.ui.properties.api.DescriptionCache;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextSingleLineValueDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextFactory;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextSingleLineValueDescription;

public class XtextSingleLineValueDescriptionConverter extends AbstractDescriptionConverter {
	
	@Override
	public boolean canHandle(final EObject description) {
		return description instanceof XtextSingleLineValueDescription;
	}
	
	@Override
	public EObject convert(final EObject description, final Map<String, Object> parameters,
			final DescriptionCache cache) {
		if (description instanceof XtextSingleLineValueDescription) {
			final XtextSingleLineValueDescription propertyDescription = (XtextSingleLineValueDescription) description;
			
			final EefXtextSingleLineValueDescription eefDescription = EefxtextFactory.eINSTANCE
					.createEefXtextSingleLineValueDescription();
			eefDescription.setIdentifier(propertyDescription.getIdentifier());
			eefDescription.setHelpExpression(propertyDescription.getHelpExpression());
			eefDescription.setIsEnabledExpression(propertyDescription.getIsEnabledExpression());
			eefDescription.setLabelExpression(propertyDescription.getLabelExpression());
			
			eefDescription.setValueExpression(propertyDescription.getValueExpression());

			final InitialOperation initialOperation = propertyDescription.getInitialOperation();
			eefDescription.setEditExpression(this.getExpressionForOperation(initialOperation));

			eefDescription.setLineCount(1);

			eefDescription.setInjectorId(propertyDescription.getInjectorId());
			
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
