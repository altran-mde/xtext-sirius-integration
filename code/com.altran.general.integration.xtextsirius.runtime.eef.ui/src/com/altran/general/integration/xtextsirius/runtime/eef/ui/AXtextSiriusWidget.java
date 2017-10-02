package com.altran.general.integration.xtextsirius.runtime.eef.ui;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import com.altran.general.integration.xtextsirius.util.FakeResourceUtil;
import com.google.inject.Inject;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public abstract class AXtextSiriusWidget {
	
	@Inject
	private EmbeddedEditorFactory embeddedEditorFactory;
	
	private final Injector injector;
	private final boolean multiLine;
	
	protected EmbeddedEditor editor;
	protected EmbeddedEditorModelAccess editorAccess;
	
	protected XtextSiriusEditedResourceProvider editedResourceProvider;
	
	private long modificationStamp = IDocumentExtension4.UNKNOWN_MODIFICATION_STAMP;
	
	public AXtextSiriusWidget(final @NonNull Composite parent, final @NonNull Injector injector,
			final boolean multiLine) {
		this.injector = injector;
		this.multiLine = multiLine;
		injector.injectMembers(this);
		
		createEditor(parent);
	}
	
	private void createEditor(final @NonNull Composite parent) {
		this.editedResourceProvider = new XtextSiriusEditedResourceProvider(getInjector());
		this.editor = this.embeddedEditorFactory.newEditor(this.editedResourceProvider)
				.withParent(parent);
		
		this.editorAccess = this.editor.createPartialEditor(true);
	}
	
	public @Nullable Control getControl() {
		if (this.editor != null) {
			return this.editor.getViewer().getControl();
		}
		
		return null;
	}
	
	public @Nullable StyledText getTextWidget() {
		if (this.editor != null) {
			return this.editor.getViewer().getTextWidget();
		}
		
		return null;
	}
	
	public void cleanup() {
		if (this.editor != null) {
			this.editor.getDocument().set("");
		}
	}
	
	protected boolean isMultiLine() {
		return this.multiLine;
	}

	protected void resetDirty() {
		this.modificationStamp = retrieveModificationStamp();
	}

	protected long retrieveModificationStamp() {
		return this.editor.getDocument().getModificationStamp();
	}
	
	public boolean isDirty() {
		return this.modificationStamp != retrieveModificationStamp();
	}
	
	public void updateUri(final @NonNull URI resourceUri) {
		this.editor.getDocument()
				.modify(res -> {
					FakeResourceUtil.getInstance().updateFakeResourceUri(res, resourceUri);
					return null;
				});
		
	}
	
	protected Injector getInjector() {
		return this.injector;
	}
}
