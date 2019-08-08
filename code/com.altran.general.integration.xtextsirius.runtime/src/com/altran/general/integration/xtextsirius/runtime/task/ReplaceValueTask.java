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

import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.business.api.helper.task.AbstractCommandTask;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.FeatureNotFoundException;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.MetaClassNotFoundException;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

public class ReplaceValueTask extends AbstractCommandTask {
	private final DRepresentationElement representationElement;
	private final Function<EObject, Object> committer;

	public ReplaceValueTask(final @NonNull DRepresentationElement representationElement,
			final @NonNull Function<EObject, Object> committer) {
		this.representationElement = representationElement;
		this.committer = committer;
	}
	
	@Override
	public String getLabel() {
		return "Replace value";
	}
	
	@Override
	public void execute() throws MetaClassNotFoundException, FeatureNotFoundException {
		final EObject representationTarget = this.representationElement.getTarget();
		
		final Object updateRepresentation = this.committer.apply(representationTarget);
		
		if (updateRepresentation instanceof EObject
				&& representationTarget instanceof EObject
				&& !EcoreUtil.isAncestor((EObject) updateRepresentation, (EObject) representationTarget)) {
			this.representationElement.setTarget((EObject) updateRepresentation);
		}
	}
}
