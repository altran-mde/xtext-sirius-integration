/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.eef.ui.model;

import java.util.function.Consumer;

import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.text.IRegion;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription;
import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusModelEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.AXtextSiriusEefLifecycleManager;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.XtextSiriusWidget;

public class XtextSiriusEefLifecycleManagerModel
		extends AXtextSiriusEefLifecycleManager<IXtextSiriusModelEditorCallback, XtextSiriusModelEditor>
		implements IXtextSiriusModelEditorCallback {
	public XtextSiriusEefLifecycleManagerModel(
			final @NonNull IXtextSiriusModelDescriptor descriptor,
			final @NonNull IEefXtextDescription controlDescription,
			final @NonNull IVariableManager variableManager,
			final @NonNull IInterpreter interpreter,
			final @NonNull EditingContextAdapter contextAdapter) {
		super(new XtextSiriusModelEditor(descriptor), descriptor, controlDescription, variableManager, interpreter,
				contextAdapter);
	}
	
	@Override
	public XtextSiriusWidgetModel getWidget() {
		return (XtextSiriusWidgetModel) super.getWidget();
	}
	
	@Override
	public IParseResult getXtextParseResult() {
		final XtextDocument document = getWidget().getDocument();
		if (document == null) {
			throw new IllegalStateException("No document available");
		}
		
		return document.readOnly(state -> state.getParseResult());
	}
	
	@Override
	public @NonNull TextRegion callbackGetVisibleRegion() {
		final XtextSourceViewer viewer = getWidget().getViewer();
		if (viewer == null) {
			throw new IllegalStateException("No viewer available");
		}
		
		final IRegion visibleRegionJFace = viewer.getVisibleRegion();
		final TextRegion visibleRegion = new TextRegion(visibleRegionJFace.getOffset(), visibleRegionJFace.getLength());
		return visibleRegion;
	}
	
	@Override
	protected Consumer<Object> createNewValueConsumer() {
		return (newValue) -> {
			URI resourceUri = null;
			final EObject self = getSelf();
			
			final ModelEntryPoint modelEntryPoint;
			if (newValue instanceof EObject) {
				final EObject semanticElement = (EObject) newValue;
				modelEntryPoint = new ModelEntryPoint(semanticElement, self, getValueFeature());
				
				resourceUri = semanticElement.eResource().getURI();
			} else {
				if (self == null) {
					throw new IllegalStateException("Cannot dermine self EObject");
				}
				modelEntryPoint = new ModelEntryPoint(null, self, getValueFeature());
				
				resourceUri = self.eResource().getURI();
			}
			
			getEditor().setModelEntryPoint(modelEntryPoint);
			getEditor().initValue(newValue);
			
			getWidget().updateUri(resourceUri);
		};
	}
	
	@Override
	protected XtextSiriusWidget createXtextSiriusWidget(final Composite parent) {
		return new XtextSiriusWidgetModel(parent, getInjector());
	}
}
