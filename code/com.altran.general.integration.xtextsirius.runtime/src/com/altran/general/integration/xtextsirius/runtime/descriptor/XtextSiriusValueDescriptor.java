/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.descriptor;

import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription;
import com.altran.general.integration.xtextsirius.model.xtext.xtextsirius.IXtextDirectEditValueDescription;
import com.google.inject.Injector;

public class XtextSiriusValueDescriptor extends AXtextSiriusDescriptor implements IXtextSiriusValueDescriptor {

	private final @NonNull String prefixTextExpression;
	private final @NonNull String suffixTextExpression;
	
	public XtextSiriusValueDescriptor(final @NonNull Injector injector,
			final @NonNull IXtextDirectEditValueDescription description) {
		super(injector, description);
		this.prefixTextExpression = description.getPrefixTextExpression();
		this.suffixTextExpression = description.getSuffixTextExpression();
	}

	public XtextSiriusValueDescriptor(final @NonNull Injector injector,
			final @NonNull IEefXtextValueDescription description) {
		super(injector, description);
		this.prefixTextExpression = description.getPrefixTextExpression();
		this.suffixTextExpression = description.getSuffixTextExpression();
	}

	@Override
	public String getPrefixTextExpression() {
		return this.prefixTextExpression;
	}
	
	@Override
	public String getSuffixTextExpression() {
		return this.suffixTextExpression;
	}
}
