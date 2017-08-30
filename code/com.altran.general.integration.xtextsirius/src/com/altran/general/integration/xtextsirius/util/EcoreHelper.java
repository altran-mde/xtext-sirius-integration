package com.altran.general.integration.xtextsirius.util;

import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

public class EcoreHelper {
	private static final String SYNTHETIC_URI_PREFIX = "__synthetic__";
	
	public static void updateFakeResourceUri(final @NonNull Resource fakeResource, final @NonNull URI origResourceUri) {
		final URI newUri = origResourceUri.trimSegments(1)
				.appendSegment(SYNTHETIC_URI_PREFIX + origResourceUri.lastSegment());
		fakeResource.setURI(newUri);
	}

	public static <T extends EObject> T cloneAndProxify(final @NonNull T obj) {
		// return proxify(EcoreUtil.copy(obj), EcoreUtil.getURI(obj));
		return proxify(obj, EcoreUtil.getURI(obj));
	}
	
	public static <T extends EObject> T proxify(final @NonNull T semanticElement, final @NonNull URI originalUri) {
		final Set<EObject> allReferencedObjects = collectAllReferencedObjectsRecursive(semanticElement)
				.collect(Collectors.toSet());

		final URI semanticResourceUri = originalUri.trimFragment();
		
		for (final EObject next : allReferencedObjects) {
			if (!EcoreUtil.isAncestor(semanticElement, next)) {
				final URI targetUri = EcoreUtil.getURI(next);
				URI createURI = targetUri;
				if (targetUri.trimFragment().equals(semanticResourceUri)) {
					final String fragment = targetUri.fragment();
					createURI = URI.createHierarchicalURI(new String[0], null, fragment);
				}
				// EcoreUtil.remove(next);
				// final Iterator<Adapter> iter = next.eAdapters().iterator();
				// while (iter.hasNext()) {
				// if (iter.next() instanceof INode) {
				// iter.remove();
				// }
				// }
				((InternalEObject) next).eSetProxyURI(createURI);
			}
		}
		
		return semanticElement;
	}
	
	private static Stream<EObject> collectAllReferencedObjectsRecursive(final @NonNull EObject base) {
		return Stream.concat(Stream.of(base), StreamSupport.stream(Spliterators
				.spliteratorUnknownSize(EcoreUtil.<EObject> getAllContents(base, false), Spliterator.NONNULL), false))
				.flatMap(obj -> collectAllReferencedObjects(obj));
	}

	private static Stream<EObject> collectAllReferencedObjects(final EObject base) {
		return base.eClass().getEAllReferences().stream()
				.filter(ref -> !ref.isContainment())
				.flatMap(ref -> {
					final Object eGet = base.eGet(ref);
					if (eGet instanceof List) {
						@SuppressWarnings("unchecked")
						final List<EObject> tmp = (List<EObject>) eGet;
						return tmp.stream();
					} else {
						return Stream.of((EObject) eGet);
					}
				});
	}
}
