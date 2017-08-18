package com.altran.general.integration.xtextsirius.eef.internal;

import java.lang.ref.WeakReference;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
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
	
	private @Nullable WeakReference<@Nullable XtextResourceSet> cachedResourceSet;
	private @Nullable WeakReference<@Nullable XtextResource> cachedResource;
	
	
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

		this.cachedResourceSet = new WeakReference<>(resourceSet);
		this.cachedResource = new WeakReference<>(resource);
		
		return resource;
	}

	public void relocateResource(final @NonNull ResourceSet newResourceSet) {
		final XtextResource lastCachedResource = getLastCachedResource();
		if (lastCachedResource != null) {
			newResourceSet.getResources().add(lastCachedResource);
		}
	}
	
	public void resetResource() {
		final XtextResource lastCachedResource = getLastCachedResource();
		final XtextResourceSet lastCachedResourceSet = getLastCachedResourceSet();

		if (lastCachedResource != null && lastCachedResourceSet != null) {
			lastCachedResourceSet.getResources().add(lastCachedResource);
		}
	}

	private @Nullable XtextResource getLastCachedResource() {
		if (this.cachedResource != null) {
			return this.cachedResource.get();
		}
		
		return null;
	}
	
	private @Nullable XtextResourceSet getLastCachedResourceSet() {
		if (this.cachedResourceSet != null) {
			return this.cachedResourceSet.get();
		}
		
		return null;
	}
}