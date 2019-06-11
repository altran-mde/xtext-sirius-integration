/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.description.RepresentationElementMapping;
import org.eclipse.sirius.viewpoint.description.tool.InitialOperation;
import org.eclipse.sirius.viewpoint.description.tool.ModelOperation;
import org.eclipse.sirius.viewpoint.description.tool.SetValue;
import org.eclipse.swt.SWT;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.resource.XtextResource;
import org.yakindu.base.xtext.utils.gmf.viewers.XtextStyledTextCellEditorEx;
import org.yakindu.base.xtext.utils.jface.viewers.context.IXtextFakeContextResourcesProvider;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.editor.AXtextSiriusEditor;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusDescribable;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusEditpartDescriptor;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;

public abstract class AXtextSiriusStyledTextCellEditor extends XtextStyledTextCellEditorEx
implements IXtextSiriusDescribable, IXtextSiriusEditorCallback {
	private final IXtextSiriusEditpartDescriptor descriptor;
	@SuppressWarnings("rawtypes")
	private final AXtextSiriusEditor editor;

	private long modificationStamp = IDocumentExtension4.UNKNOWN_MODIFICATION_STAMP;

	@SuppressWarnings("unchecked")
	public AXtextSiriusStyledTextCellEditor(
			final @NonNull IXtextSiriusEditpartDescriptor descriptor,
			@SuppressWarnings("rawtypes") final @NonNull AXtextSiriusEditor editor) {
		super(translateToStyle(descriptor), descriptor.getInjector());
		this.descriptor = descriptor;
		this.editor = editor;
		editor.setCallback(this);
	}

	private static int translateToStyle(final @NonNull IXtextSiriusEditpartDescriptor descriptor) {
		if (descriptor.isMultiLine()) {
			return SWT.MULTI | SWT.WRAP;
		} else {
			return SWT.SINGLE;
		}
	}

	public @Nullable Object commit(final @NonNull EObject representationTarget) {
		try {
			return getEditor().commit(representationTarget);
		} catch (final AXtextSiriusIssueException e) {
			StatusManager.getManager().handle(e.toStatus(), StatusManager.SHOW);
			return null;
		}
	}

	@Override
	protected XtextSiriusStyledTextXtextAdapter createXtextAdapter() {
		return new XtextSiriusStyledTextXtextAdapter(getInjector(),
				getContextFakeResourceProvider() == null ? IXtextFakeContextResourcesProvider.NULL_CONTEXT_PROVIDER
						: getContextFakeResourceProvider());
	}
	
	@Override
	public void callbackInitText(final @Nullable String initialValue, final int offset, final int length) {
		super.doSetValue(initialValue);
		getXtextAdapter().resetVisibleRegion();
		setVisibleRegion(offset, length);
		final ModelEntryPoint mep = getModelEntryPoint();
		final EObject element = new MinimalModelAdjuster().getClosestElement(mep);
		final XtextResource fakeResource = getXtextAdapter().getFakeResourceContext().getFakeResource();
		FakeResourceUtil.getInstance().updateFakeResourceUri(fakeResource, element.eResource().getURI());
		
		getXtextAdapter().getFakeResourceContext().updateFakeResourceContext(createXtextFakeContextResourcesProvider());

		resetDirty();
	}

	@Override
	public @Nullable String callbackGetText() {
		final Object value = getValue();
		if (value instanceof String) {
			return (String) value;
		}

		return null;
	}
	
	protected IXtextFakeContextResourcesProvider createXtextFakeContextResourcesProvider() {
		final ResourceSetFakeContextResourcesProvider result = new ResourceSetFakeContextResourcesProvider(this);
		getInjector().injectMembers(result);
		return result;
	}

	@Override
	public XtextSiriusStyledTextXtextAdapter getXtextAdapter() {
		return (XtextSiriusStyledTextXtextAdapter) super.getXtextAdapter();
	}

	@Override
	protected void doSetValue(final Object value) {
		getEditor().initValue(value);
	}

	protected @Nullable String getValueFeatureName() {
		final @Nullable DRepresentationElement representationElement = extractRepresentationElement();
		final SetValue setValue = extractSetValue(representationElement);
		
		if (representationElement != null && setValue != null) {
			return setValue.getFeatureName();
		}

		return null;
	}
	
	private @Nullable DRepresentationElement extractRepresentationElement() {
		final @Nullable IXtextSiriusAwareLabelEditPart editPart = getDescriptor().getEditPart();
		if (editPart != null) {
			final Object model = editPart.getModel();
			if (model instanceof View) {
				final EObject element = ((View) model).getElement();
				if (element instanceof DRepresentationElement) {
					return (DRepresentationElement) element;
				}
			}
		}
		
		return null;
	}
	
	private @Nullable SetValue extractSetValue(final @Nullable DRepresentationElement representationElement) {
		if (representationElement != null) {
			final RepresentationElementMapping mapping = representationElement.getMapping();
			if (mapping instanceof DiagramElementMapping) {
				final DirectEditLabel labelDirectEdit = ((DiagramElementMapping) mapping).getLabelDirectEdit();
				if (labelDirectEdit != null) {
					final InitialOperation initialOperation = labelDirectEdit.getInitialOperation();
					if (initialOperation != null) {
						final ModelOperation firstModelOperation = initialOperation.getFirstModelOperations();
						if (firstModelOperation instanceof SetValue) {
							return (@Nullable SetValue) firstModelOperation;
						}
					}
				}
			}
		}
		
		return null;
	}
	
	protected void setModelEntryPoint(final @NonNull ModelEntryPoint modelEntryPoint) {
		modelEntryPoint.setValueFeatureName(getValueFeatureName());
		getEditor().setModelEntryPoint(modelEntryPoint);
	}
	
	public @NonNull ModelEntryPoint getModelEntryPoint() {
		return getEditor().getModelEntryPoint();
	}
	
	protected void resetDirty() {
		this.modificationStamp = retrieveModificationStamp();
	}

	protected long retrieveModificationStamp() {
		return getXtextAdapter().getModificationStamp();
	}

	@Override
	public boolean isDirty() {
		return this.modificationStamp != retrieveModificationStamp();
	}

	@Override
	public @NonNull IXtextSiriusEditpartDescriptor getDescriptor() {
		return this.descriptor;
	}
	
	@SuppressWarnings("rawtypes")
	protected AXtextSiriusEditor getEditor() {
		return this.editor;
	}
}
