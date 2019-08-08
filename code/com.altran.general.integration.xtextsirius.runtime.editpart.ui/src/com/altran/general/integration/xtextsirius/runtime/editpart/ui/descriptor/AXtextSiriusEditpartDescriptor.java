/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor;

import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.AXtextSiriusDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.IXtextSiriusAwareLabelEditPart;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditManager;
import com.google.inject.Injector;

public abstract class AXtextSiriusEditpartDescriptor extends AXtextSiriusDescriptor implements IXtextSiriusEditpartDescriptor {
	
	public AXtextSiriusEditpartDescriptor(final @NonNull Injector injector, final @NonNull IXtextDescription description) {
		super(injector, description);
	}
	
	@Override
	public abstract @NonNull XtextSiriusDirectEditManager createDirectEditManager(
			final @NonNull IXtextSiriusAwareLabelEditPart editPart);
}
