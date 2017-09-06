package com.altran.general.integration.xtextsirius.internal;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.helper.task.AbstractCommandTask;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.FeatureNotFoundException;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.MetaClassNotFoundException;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

public class RefreshDiagramTask extends AbstractCommandTask {
	private final DRepresentationElement representationElement;

	public RefreshDiagramTask(final DRepresentationElement representationElement) {
		this.representationElement = representationElement;
	}
	
	@Override
	public String getLabel() {
		return "Refresh diagram";
	}

	@Override
	public void execute() throws MetaClassNotFoundException, FeatureNotFoundException {
		EcoreUtil.resolveAll(this.representationElement.getTarget());
		
		this.representationElement.refresh();
	}
}