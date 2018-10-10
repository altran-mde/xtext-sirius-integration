/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.task;

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
		this.representationElement.refresh();
	}
}
