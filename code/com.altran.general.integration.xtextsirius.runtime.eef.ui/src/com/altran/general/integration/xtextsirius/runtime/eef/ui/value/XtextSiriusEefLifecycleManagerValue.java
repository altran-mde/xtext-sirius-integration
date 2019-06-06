/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.eef.ui.value;

import java.util.function.Consumer;

import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.widgets.Composite;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextValueDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusValueDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusValueEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusValueEditor;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.AXtextSiriusEefLifecycleManager;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.XtextSiriusWidget;

public class XtextSiriusEefLifecycleManagerValue
extends AXtextSiriusEefLifecycleManager<IXtextSiriusValueEditorCallback, XtextSiriusValueEditor>
implements IXtextSiriusValueEditorCallback {
	public XtextSiriusEefLifecycleManagerValue(
			final @NonNull IXtextSiriusValueDescriptor descriptor,
			final @NonNull IEefXtextValueDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(new XtextSiriusValueEditor(descriptor), descriptor, controlDescription, variableManager, interpreter,
				contextAdapter);
	}
	
	@Override
	public @Nullable String callbackGetText() {
		return super.callbackGetText();
	}

	@Override
	protected Consumer<Object> createNewValueConsumer() {
		return (newValue) -> {
			final ModelEntryPoint modelEntryPoint = new ModelEntryPoint(getSelf(), null, getValueFeature());
			getEditor().setModelEntryPoint(modelEntryPoint);
			getEditor().initValue(newValue);
		};
	}
	
	@Override
	protected XtextSiriusWidget createXtextSiriusWidget(final Composite parent) {
		return new XtextSiriusWidgetValue(parent, getInjector());
	}
}
