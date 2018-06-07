package com.altran.general.integration.xtextsirius.runtime.converter;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.properties.core.api.TransformationCache;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefXtextMultiLineModelDescription;
import com.altran.general.integration.xtextsirius.model.eef.eefxtext.EefxtextFactory;
import com.altran.general.integration.xtextsirius.model.properties.propertiesxtext.XtextMultiLineModelDescription;

public class XtextMultiLineModelDescriptionConverter extends AXtextDescriptionConverter {

	@Override
	public boolean canHandle(final EObject description) {
		return description instanceof XtextMultiLineModelDescription;
	}
	
	@Override
	public EObject convert(final EObject description, final Map<String, Object> parameters,
			final TransformationCache cache) {
		if (description instanceof XtextMultiLineModelDescription) {
			final XtextMultiLineModelDescription propertyDescription = (XtextMultiLineModelDescription) description;

			final EefXtextMultiLineModelDescription eefDescription = EefxtextFactory.eINSTANCE
					.createEefXtextMultiLineModelDescription();
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

			eefDescription.getEditableFeatures().addAll(propertyDescription.getEditableFeatures());

			// Let's not forget to populate the cache for the other converters
			// or link resolvers
			cache.put(propertyDescription, eefDescription);

			return eefDescription;
		}
		return null;
	}
}
