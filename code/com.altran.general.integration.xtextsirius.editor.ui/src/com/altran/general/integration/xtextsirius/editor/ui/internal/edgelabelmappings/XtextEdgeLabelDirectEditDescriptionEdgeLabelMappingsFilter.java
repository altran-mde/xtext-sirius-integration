package com.altran.general.integration.xtextsirius.editor.ui.internal.edgelabelmappings;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.editor.properties.filters.common.ViewpointPropertyFilter;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.IXtextEdgeLabelDirectEditDescription;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextPackage;

public class XtextEdgeLabelDirectEditDescriptionEdgeLabelMappingsFilter extends ViewpointPropertyFilter {
	
	@Override
	protected EStructuralFeature getFeature() {
		return ViewpointxtextPackage.eINSTANCE.getIXtextEdgeLabelDirectEditDescription_EdgeLabelMappings();
	}
	
	@Override
	protected boolean isRightInputType(final Object arg0) {
		return arg0 instanceof IXtextEdgeLabelDirectEditDescription;
	}
	
}
