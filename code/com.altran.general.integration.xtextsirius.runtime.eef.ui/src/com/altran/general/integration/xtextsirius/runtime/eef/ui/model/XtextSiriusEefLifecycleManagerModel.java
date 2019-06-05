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
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.model.eef.eefxtext.IEefXtextDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusModelEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.AXtextSiriusEefLifecycleManager;
import com.altran.general.integration.xtextsirius.runtime.eef.ui.XtextSiriusWidget;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;
import com.google.common.collect.Lists;

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
		return document.readOnly(state -> state.getParseResult());
	}

	@Override
	public XtextSiriusSyntaxErrorException handleSyntaxErrors(final IParseResult parseResult) {
		final IRegion visibleRegionJFace = getWidget().getViewer().getVisibleRegion();
		final TextRegion visibleRegion = new TextRegion(visibleRegionJFace.getOffset(), visibleRegionJFace.getLength());
		return handleXtextSiriusIssueException(new XtextSiriusSyntaxErrorException((String) callbackGetText(), visibleRegion,
				Lists.newArrayList(parseResult.getSyntaxErrors())));
	}
	
	@Override
	public XtextSiriusErrorException handleUnresolvableProxies() {
		return handleXtextSiriusIssueException(
				new XtextSiriusErrorException("Entered text contains unresolvable references", (String) callbackGetText()));
	}

	@Override
	protected Consumer<Object> createNewValueConsumer() {
		return (newValue) -> {
			URI resourceUri = null;
			final ModelEntryPoint modelEntryPoint = new ModelEntryPoint();
			if (newValue instanceof EObject) {
				final EObject semanticElement = (EObject) newValue;

				resourceUri = semanticElement.eResource().getURI();
				modelEntryPoint.setSemanticElement(semanticElement);
			} else if (newValue == null) {
				final EObject self = getSelf();
				if (self != null) {
					resourceUri = self.eResource().getURI();
					modelEntryPoint.setFallbackContainer(self);
				}
			}

			modelEntryPoint.setValueFeatureName(getValueFeature());

			getEditor().setModelEntryPoint(modelEntryPoint);
			getEditor().initValue(newValue);
			
			getWidget().updateUri(resourceUri);
		};
	}
	
	@Override
	protected XtextSiriusWidget createXtextSiriusWidget(final Composite parent) {
		return new XtextSiriusWidgetModel(parent, getInjector());
	}
	
	protected <E extends AXtextSiriusIssueException> E handleXtextSiriusIssueException(final E exception) {
		StatusManager.getManager().handle(exception.toStatus(), StatusManager.SHOW);
		return exception;
	}
}
