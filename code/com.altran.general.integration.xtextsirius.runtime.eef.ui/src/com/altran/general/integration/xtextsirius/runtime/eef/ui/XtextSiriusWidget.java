/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.eef.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;
import com.google.inject.Inject;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class XtextSiriusWidget {
	private final EmbeddedEditor embeddedEditor;
	private final EmbeddedEditorModelAccess editorAccess;
	private final XtextSiriusEditedResourceProvider editedResourceProvider;
	
	@Inject
	private EmbeddedEditorFactory embeddedEditorFactory;
	
	private long modificationStamp = IDocumentExtension4.UNKNOWN_MODIFICATION_STAMP;
	
	public XtextSiriusWidget(final @NonNull Composite parent, final @NonNull Injector injector) {
		injector.injectMembers(this);
		
		this.editedResourceProvider = new XtextSiriusEditedResourceProvider(injector);
		this.embeddedEditor = this.embeddedEditorFactory.newEditor(this.getEditedResourceProvider())
				.withParent(parent);
		this.editorAccess = this.getEmbeddedEditor().createPartialEditor(true);
	}
	
	public @Nullable Control getControl() {
		if (this.getEmbeddedEditor() != null) {
			return this.getEmbeddedEditor().getViewer().getControl();
		}
		
		return null;
	}
	
	public @Nullable StyledText getTextWidget() {
		if (this.getEmbeddedEditor() != null) {
			return this.getEmbeddedEditor().getViewer().getTextWidget();
		}
		
		return null;
	}

	public @Nullable XtextSourceViewer getViewer() {
		if (this.getEmbeddedEditor() != null) {
			return this.getEmbeddedEditor().getViewer();
		}
		
		return null;
	}
	
	public @Nullable XtextDocument getDocument() {
		if (this.getEmbeddedEditor() != null) {
			return this.getEmbeddedEditor().getDocument();
		}
		
		return null;
	}
	
	public void cleanup() {
		if (this.getEmbeddedEditor() != null) {
			this.getEmbeddedEditor().getDocument().set("");
		}
	}
	
	public void update(final @NonNull String completeText, final @NonNull TextRegion textRegion) {
		this.getEditorAccess().updateModel(completeText, state -> textRegion);
		resetDirty();
	}
	
	protected void resetDirty() {
		this.modificationStamp = retrieveModificationStamp();
	}
	
	protected long retrieveModificationStamp() {
		return this.getEmbeddedEditor().getDocument().getModificationStamp();
	}
	
	public boolean isDirty() {
		return this.modificationStamp != retrieveModificationStamp();
	}
	
	public void updateUri(final @NonNull URI resourceUri) {
		this.getEmbeddedEditor().getDocument()
		.modify(res -> {
			FakeResourceUtil.getInstance().updateFakeResourceUri(res, resourceUri);
			return null;
		});
		
	}
	
	protected EmbeddedEditor getEmbeddedEditor() {
		return this.embeddedEditor;
	}
	
	protected EmbeddedEditorModelAccess getEditorAccess() {
		return this.editorAccess;
	}
	
	protected XtextSiriusEditedResourceProvider getEditedResourceProvider() {
		return this.editedResourceProvider;
	}
}
