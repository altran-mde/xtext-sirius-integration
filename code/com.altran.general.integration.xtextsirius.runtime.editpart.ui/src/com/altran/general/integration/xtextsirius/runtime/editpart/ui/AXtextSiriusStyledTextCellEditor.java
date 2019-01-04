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
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.jface.text.IRegion;
import org.eclipse.swt.SWT;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.TextRegion;
import org.yakindu.base.xtext.utils.gmf.viewers.XtextStyledTextCellEditorEx;
import org.yakindu.base.xtext.utils.jface.viewers.context.IXtextFakeContextResourcesProvider;

import com.altran.general.integration.xtextsirius.runtime.editor.AXtextSiriusEditor;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusDescribable;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.IXtextSiriusEditpartDescriptor;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;
import com.google.common.collect.Lists;

public abstract class AXtextSiriusStyledTextCellEditor extends XtextStyledTextCellEditorEx
implements IXtextSiriusDescribable, IXtextSiriusEditorCallback {
	private final IXtextSiriusEditpartDescriptor descriptor;
	private final AXtextSiriusEditor editor;
	
	private long modificationStamp = IDocumentExtension4.UNKNOWN_MODIFICATION_STAMP;
	
	public AXtextSiriusStyledTextCellEditor(
			final @NonNull IXtextSiriusEditpartDescriptor descriptor, final @NonNull AXtextSiriusEditor editor) {
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
	
	public @Nullable Object getValueToCommit() throws AXtextSiriusIssueException {
		return getEditor().getValueToCommit();
	}
	
	@Override
	protected XtextSiriusStyledTextXtextAdapter createXtextAdapter() {
		return new XtextSiriusStyledTextXtextAdapter(getInjector(),
				getContextFakeResourceProvider() == null ? IXtextFakeContextResourcesProvider.NULL_CONTEXT_PROVIDER
						: getContextFakeResourceProvider());
	}

	@Override
	public void callbackSetValue(final Object value) {
		super.doSetValue(value);
	}

	@Override
	public void resetVisibleRegion() {
		getXtextAdapter().resetVisibleRegion();
	}

	@Override
	public XtextResource getFakeResource() {
		return getXtextAdapter().getFakeResourceContext().getFakeResource();
	}
	
	@Override
	public void updateFakeResourceContext() {
		getXtextAdapter().getFakeResourceContext().updateFakeResourceContext(createXtextFakeContextResourcesProvider());
	}

	@Override
	public IParseResult getXtextParseResult() {
		return getXtextAdapter().getXtextParseResult();
	}
	
	@Override
	public XtextSiriusSyntaxErrorException handleSyntaxErrors(final IParseResult parseResult) {
		final IRegion visibleRegionJFace = getXtextAdapter().getVisibleRegion();
		final TextRegion visibleRegion = new TextRegion(visibleRegionJFace.getOffset(), visibleRegionJFace.getLength());
		return new XtextSiriusSyntaxErrorException((String) getValue(), visibleRegion,
				Lists.newArrayList(parseResult.getSyntaxErrors()));
	}
	
	@Override
	public XtextSiriusErrorException handleUnresolvableProxies() {
		return new XtextSiriusErrorException("Entered text contains unresolvable references", (String) getValue());
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
		getEditor().doSetValue(value);
	}
	
	protected void setSemanticElement(final @Nullable EObject element) {
		getEditor().setSemanticElement(element);
	}
	
	public @Nullable EObject getSemanticElement() {
		return getEditor().getSemanticElement();
	}
	
	protected void setFallbackContainer(final @NonNull EObject fallbackContainer) {
		getEditor().setFallbackContainer(fallbackContainer);
	}
	
	protected EObject getFallbackContainer() {
		return getEditor().getFallbackContainer();
	}
	
	@Override
	public void resetDirty() {
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

	protected AXtextSiriusEditor getEditor() {
		return this.editor;
	}
}
