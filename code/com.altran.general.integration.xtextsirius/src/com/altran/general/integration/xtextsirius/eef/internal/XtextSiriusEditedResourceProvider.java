package com.altran.general.integration.xtextsirius.eef.internal;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.name.Named;

@SuppressWarnings("restriction")
public class XtextSiriusEditedResourceProvider implements IEditedResourceProvider {
	
	@Inject
	private Provider<XtextResourceSet> resourceSetProvider;
	
	@Inject
	private IResourceFactory resourceFactory;

	@Inject
	@Named(Constants.FILE_EXTENSIONS)
	private String fileExtension;
	
	public XtextSiriusEditedResourceProvider(final @NonNull Injector injector) {
		injector.injectMembers(this);
	}
	
	@Override
	public XtextResource createResource() {
		final XtextResourceSet resourceSet = this.resourceSetProvider.get();
		resourceSet.setClasspathURIContext(getClass());
		
		final XtextResource resource = (XtextResource) this.resourceFactory
				.createResource(URI.createURI("_synthetic." + this.fileExtension));
		resourceSet.getResources().add(resource);
		
		return resource;
	}
}