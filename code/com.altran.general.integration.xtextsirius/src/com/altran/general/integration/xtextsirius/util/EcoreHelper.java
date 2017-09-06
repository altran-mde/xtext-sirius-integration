package com.altran.general.integration.xtextsirius.util;

import java.util.List;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

public class EcoreHelper {
	private static final String SYNTHETIC_URI_PREFIX = "__synthetic__";

	public static void updateFakeResourceUri(final @NonNull Resource fakeResource, final @NonNull URI origResourceUri) {
		final URI newUri = insertSynthetic(origResourceUri);
		fakeResource.setURI(newUri);
	}
	
	protected static @NonNull URI insertSynthetic(final @NonNull URI uri) {
		return uri.trimSegments(1)
				.appendSegment(SYNTHETIC_URI_PREFIX + uri.lastSegment());
	}

	protected static @NonNull URI removeSynthetic(final @NonNull URI uri) {
		final String lastSegment = uri.lastSegment();

		if (StringUtils.startsWith(lastSegment, SYNTHETIC_URI_PREFIX)) {
			return uri.trimSegments(1).appendSegment(StringUtils.substring(lastSegment, SYNTHETIC_URI_PREFIX.length()));
		}

		return uri;
	}
	
	public static <T extends EObject> T proxify(final @NonNull T semanticElement, final @NonNull URI originalResourceUri) {
		final Set<EObject> allReferencedObjects = collectAllReferencedObjectsDeep(semanticElement)
				.collect(Collectors.toSet());
		
		final URI semanticResourceUri = originalResourceUri.trimFragment();

		for (final EObject next : allReferencedObjects) {
			if (!EcoreUtil.isAncestor(semanticElement, next)) {
				final URI targetUri = EcoreUtil.getURI(next);
				URI createURI = targetUri;
				if (equalsDisregardingSynthetic(targetUri.trimFragment(), semanticResourceUri)) {
					final String fragment = targetUri.fragment();
					createURI = semanticResourceUri.appendFragment(fragment);
				}
				((InternalEObject) next).eSetProxyURI(createURI);
			}
		}

		return semanticElement;
	}

	protected static boolean equalsDisregardingSynthetic(final @NonNull URI a, final @NonNull URI b) {
		return a.equals(b) ||
				a.equals(removeSynthetic(b)) ||
				removeSynthetic(a).equals(b);
	}

	protected static Stream<EObject> collectAllReferencedObjectsDeep(final @NonNull EObject base) {
		return Stream.concat(Stream.of(base), StreamSupport.stream(Spliterators
				.spliteratorUnknownSize(EcoreUtil.<EObject> getAllContents(base, false), Spliterator.NONNULL), false))
				.flatMap(obj -> collectAllReferencedObjects(obj));
	}
	
	protected static Stream<EObject> collectAllReferencedObjects(final @NonNull EObject base) {
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
