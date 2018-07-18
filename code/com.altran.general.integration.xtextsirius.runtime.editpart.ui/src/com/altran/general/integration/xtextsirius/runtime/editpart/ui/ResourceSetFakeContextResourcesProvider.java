package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.xtext.resource.XtextResource;
import org.yakindu.base.xtext.utils.jface.viewers.context.IXtextFakeContextResourcesProvider;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class ResourceSetFakeContextResourcesProvider implements IXtextFakeContextResourcesProvider {
	private final AXtextSiriusStyledTextCellEditor xtextSiriusStyledTextCellEditor;
	
	ResourceSetFakeContextResourcesProvider(final AXtextSiriusStyledTextCellEditor aXtextSiriusStyledTextCellEditor) {
		this.xtextSiriusStyledTextCellEditor = aXtextSiriusStyledTextCellEditor;
	}
	
	@Override
	public void populateFakeResourceSet(final ResourceSet fakeResourceSet, final XtextResource fakeResource) {
		final EObject semanticElement = this.xtextSiriusStyledTextCellEditor.getSemanticElement();
		final EObject container = semanticElement != null ? semanticElement
				: this.xtextSiriusStyledTextCellEditor.getFallbackContainer();

		if (container == null) {
			return;
		}
		
		final Session session = SessionManager.INSTANCE.getSession(container);
		if (session == null) {
			return;
		}
		final Set<Resource> otherSessionResources = Sets
				.newLinkedHashSet(session.getSemanticResources());
		otherSessionResources.remove(container.eResource());

		final Map<Resource, Resource> resourcesMap = Maps.newLinkedHashMap();
		final Set<EObject> eObjects = Sets.newLinkedHashSet();

		for (final Resource res : otherSessionResources) {
			eObjects.addAll(res.getContents());

			final Resource clonedRes = fakeResourceSet.createResource(res.getURI());

			resourcesMap.put(res, clonedRes);
		}
		
		final EcoreUtil.Copier copier = new EcoreUtil.Copier(false);
		copier.copyAll(eObjects);

		for (final EObject org : eObjects) {
			final EObject clone = copier.get(org);
			final Resource cloneRes = resourcesMap.get(org.eResource());
			cloneRes.getContents().add(clone);
		}
	}
}