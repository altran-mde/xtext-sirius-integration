package com.altran.general.integration.xtextsirius.resource;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.ProjectDescriptionBasedContainerManager;
import org.eclipse.xtext.resource.impl.ChunkedResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsBasedContainer;

public class SiriusProjectDescriptionBasedContainerManager extends ProjectDescriptionBasedContainerManager {
	@Override
	public boolean shouldUseProjectDescriptionBasedContainers(final IResourceDescriptions resourceDescriptions) {
		return true;
	}

	@Override
	public IContainer getContainer(final IResourceDescription desc, final IResourceDescriptions resourceDescriptions) {
		return super.getContainer(desc, resourceDescriptions);
	}

	@Override
	public List<IContainer> getVisibleContainers(final IResourceDescription desc,
			final IResourceDescriptions resourceDescriptions) {
		final Session session = SessionManager.INSTANCE.getExistingSession(desc.getURI());
		
		if (session == null || !(resourceDescriptions instanceof ChunkedResourceDescriptions)) {
			return super.getVisibleContainers(desc, resourceDescriptions);
		}
		
		final ChunkedResourceDescriptions chunked = (ChunkedResourceDescriptions) resourceDescriptions;
		
		return session.getAllSessionResources().stream()
				.map(r -> chunked.getContainer(r.getURI()))
				.map(d -> new ResourceDescriptionsBasedContainer(d))
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
	}
}
