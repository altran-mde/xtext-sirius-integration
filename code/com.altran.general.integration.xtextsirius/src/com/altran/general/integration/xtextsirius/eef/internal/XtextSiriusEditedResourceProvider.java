package com.altran.general.integration.xtextsirius.eef.internal;

import java.lang.ref.WeakReference;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
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
	
	// @Inject
	// private EclipseProjectConfigProvider projectConfigProvider;
	//
	// @Inject
	// private void setContributions(final ISharedStateContributionRegistry
	// contributionRegistry) {
	// this.initializers =
	// contributionRegistry.getContributedInstances(IResourceSetInitializer.class);
	// }
	//
	// private ImmutableList<? extends IResourceSetInitializer> initializers =
	// ImmutableList.of();
	//
	// private int counter;
	// private int lastUpdatedCounter;
	// private final Object counterLock = new Object();
	
	private @Nullable WeakReference<@Nullable XtextResourceSet> cachedResourceSet;
	private @Nullable WeakReference<@Nullable XtextResource> cachedResource;
	
	
	public XtextSiriusEditedResourceProvider(final @NonNull Injector injector) {
		injector.injectMembers(this);
	}
	
	@Override
	public XtextResource createResource() {
		// synchronized (this.counterLock) {
		final XtextResourceSet resourceSet = this.resourceSetProvider.get();
		resourceSet.setClasspathURIContext(getClass());
		
		final XtextResource resource = (XtextResource) this.resourceFactory
				.createResource(URI.createURI("_synthetic." + this.fileExtension));
		resourceSet.getResources().add(resource);
		
		this.cachedResourceSet = new WeakReference<>(resourceSet);
		this.cachedResource = new WeakReference<>(resource);
		// this.counter++;
		
		return resource;
		// }
	}

	public void relocateResource(final @NonNull ResourceSet newResourceSet) {
		// synchronized (this.counterLock) {
		// if (this.counter == this.lastUpdatedCounter) {
		// return;
		// }
		//
		// final XtextResourceSet lastCachedResourceSet =
		// getLastCachedResourceSet();
		// if (lastCachedResourceSet != null) {
		// final IProjectConfig projectConfig =
		// this.projectConfigProvider.getProjectConfig(newResourceSet);
		// if (projectConfig != null) {
		// ProjectConfigAdapter.install(lastCachedResourceSet,
		// projectConfig);
		// final IProject project = ResourcesPlugin.getWorkspace().getRoot()
		// .getProject(projectConfig.getName());
		// for (final IResourceSetInitializer initialzer :
		// this.initializers) {
		// initialzer.initialize(lastCachedResourceSet, project);
		// }
		// }
		// }
		//
		
		final XtextResource lastCachedResource = getLastCachedResource();
		if (lastCachedResource != null) {
			final URI uri = lastCachedResource.getURI();
			final URI normalizedUri = newResourceSet.getURIConverter().normalize(uri);
			final Resource alreadyRegisteredResource = newResourceSet.getResource(normalizedUri, false);
			if (alreadyRegisteredResource != null) {
				// if (alreadyRegisteredResource == lastCachedResource) {
				// return;
				// }
				
				newResourceSet.getResources().remove(alreadyRegisteredResource);
				if (newResourceSet instanceof XtextResourceSet) {
					final XtextResourceSet xtextResourceSet = (XtextResourceSet) newResourceSet;
					xtextResourceSet.getURIResourceMap().remove(uri);
					xtextResourceSet.getURIResourceMap().remove(normalizedUri);
				}
			}
			
			newResourceSet.getResources().add(lastCachedResource);
			System.err.println("relocate: " + lastCachedResource.getResourceSet());
			
			// this.lastUpdatedCounter = this.counter;
			// }
		}
	}
	
	public void resetResource() {
		final XtextResource lastCachedResource = getLastCachedResource();
		final XtextResourceSet lastCachedResourceSet = getLastCachedResourceSet();
		
		if (lastCachedResource != null && lastCachedResourceSet != null) {
			lastCachedResourceSet.getResources().add(lastCachedResource);
			System.err.println("reset: " + lastCachedResource.getResourceSet());
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