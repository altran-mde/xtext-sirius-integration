package com.altran.general.integration.xtextsirius.eef.internal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.google.inject.Inject;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class XtextSiriusWidget {
	@Inject
	EmbeddedEditorFactory embeddedEditorFactory;
	
	private EmbeddedEditor editor;
	private EmbeddedEditorModelAccess editorAccess;

	private final @NonNull Injector injector;
	
	private SemanticElementLocation semanticElementLocation;
	
	private XtextSiriusEditedResourceProvider editedResourceProvider;
	
	public XtextSiriusWidget(final @NonNull Composite parent, final @NonNull Injector injector, final int style) {
		this.injector = injector;
		injector.injectMembers(this);
		
		createEditor(parent);
	}
	
	private void createEditor(final @NonNull Composite parent) {
		this.editedResourceProvider = new XtextSiriusEditedResourceProvider(this.injector);
		this.editor = this.embeddedEditorFactory.newEditor(this.editedResourceProvider)
				.showErrorAndWarningAnnotations()
				.withParent(parent);
		
		this.editorAccess = this.editor.createPartialEditor();
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
	
	public void update(final @NonNull EObject newValue) {
		if (newValue.eResource() instanceof XtextResource) {
			final XtextResource xtextResource = (XtextResource) newValue.eResource();

			this.semanticElementLocation = new SemanticElementLocation(newValue);

			final EObject rootContainer = EcoreUtil.getRootContainer(newValue);
			final String text = xtextResource.getSerializer().serialize(rootContainer,
					SaveOptions.newBuilder().noValidation().format().getOptions());
			
			this.editorAccess.updateModel(text, xtextResource.getURIFragment(newValue));

			this.editedResourceProvider.relocateResource(newValue.eResource().getResourceSet());
		}
	}

	public void cleanup() {
		if (this.editor != null) {
			this.editedResourceProvider.resetResource();
			this.editor.getDocument().set("");
		}
	}
}
