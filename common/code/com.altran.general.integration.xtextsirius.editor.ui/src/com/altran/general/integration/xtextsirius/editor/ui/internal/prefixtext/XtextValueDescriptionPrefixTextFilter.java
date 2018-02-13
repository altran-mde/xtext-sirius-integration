package com.altran.general.integration.xtextsirius.editor.ui.internal.prefixtext;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.editor.properties.filters.common.ViewpointPropertyFilter;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.XtextsiriusPackage;

public class XtextValueDescriptionPrefixTextFilter extends ViewpointPropertyFilter {
	
	@Override
	protected EStructuralFeature getFeature() {
		return XtextsiriusPackage.eINSTANCE.getIXtextValueDescription_PrefixTextExpression();
	}
	
	@Override
	protected boolean isRightInputType(final Object arg0) {
		return arg0 instanceof IXtextValueDescription;
	}

}
