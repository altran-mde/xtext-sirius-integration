/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.serializer;

import java.util.List;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.sequencer.HiddenTokenSequencer;

/**
 * Workaround for
 * <a href="https://github.com/eclipse/xtext-core/issues/464">Xtext bug 464</a>.
 *
 * @author nstotz
 *
 */
@SuppressWarnings("restriction")
public class ForceWhitespaceBetweenKeywordsHiddenTokenSequencer extends HiddenTokenSequencer {
	@Override
	protected void emitHiddenTokens(final List<INode> hiddens) {
		if (hiddens != null) {
			super.emitHiddenTokens(hiddens);
		} else {
			this.delegate.acceptWhitespace(this.hiddenTokenHelper.getWhitespaceRuleFor(null, ""), "", null);
		}
	}
	
}
