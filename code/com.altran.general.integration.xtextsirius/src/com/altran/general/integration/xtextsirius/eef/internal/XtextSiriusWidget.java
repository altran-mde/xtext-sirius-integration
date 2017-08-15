package com.altran.general.integration.xtextsirius.eef.internal;

import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

import com.google.inject.Inject;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class XtextSiriusWidget {
	@Inject
	EmbeddedEditorFactory embeddedEditorFactory;
	
	private EmbeddedEditor editor;
	private EmbeddedEditorModelAccess editorAccess;

	public XtextSiriusWidget(final Composite parent, final Injector injector, final int style) {
		injector.injectMembers(this);

		createEditor(parent);
	}

	private void createEditor(final Composite parent) {
		this.editor = this.embeddedEditorFactory.newEditor(new IEditedResourceProvider() {
			
			@Override
			public XtextResource createResource() {
				// TODO Auto-generated method stub
				return null;
			}
		})
				.showErrorAndWarningAnnotations()
				.withParent(parent);
		
		this.editorAccess = this.editor.createPartialEditor();
	}
	
	public Control getControl() {
		return this.editor.getViewer().getControl();
	}
	
	public StyledText getTextWidget() {
		return this.editor.getViewer().getTextWidget();
	}


}
