package com.altran.general.integration.xtextsirius.util;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;

import com.google.common.collect.patch.Streams;

/**
 * Utilities to work with fake resources (i.e. temporary copies of existing
 * resources to be edited).
 *
 * <p>
 * We mainly deal with a <b>fake resource identifier.</b> We try to keep the
 * original URI as close as possible, but add the <i>fake resource
 * identifier</i> to create a unique URI.
 * </p>
 *
 * @author nstotz
 *
 */
public class FakeResourceUtil {
	private static final String SYNTHETIC_URI_PREFIX = "__synthetic__";

	private static FakeResourceUtil INSTANCE;

	public static FakeResourceUtil getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new FakeResourceUtil();
		}

		return INSTANCE;
	}

	protected FakeResourceUtil() {

	}

	/**
	 * Updates the {@link URI} of {@code fakeResource} to match
	 * {@code origResourceUri} including a fake resource identifier, while
	 * maintaining the fileExtension.
	 *
	 * @param fakeResource
	 *            Resource to update.
	 * @param origResourceUri
	 *            URI to base the fake URI on.
	 */
	public void updateFakeResourceUri(final @NonNull Resource fakeResource, final @NonNull URI origResourceUri) {
		final String fakeFileExtension = fakeResource.getURI().fileExtension();
		URI newUri = insertSynthetic(origResourceUri);
		final String orgFileExtension = newUri.fileExtension();
		if (!fakeFileExtension.equals(orgFileExtension)) {
			newUri = newUri.trimFileExtension().appendFileExtension(fakeFileExtension);
		}
		fakeResource.setURI(newUri);
	}

	protected @NonNull URI insertSynthetic(final @NonNull URI uri) {
		return uri.trimSegments(1)
				.appendSegment(SYNTHETIC_URI_PREFIX + uri.lastSegment());
	}

	protected @NonNull URI removeSynthetic(final @NonNull URI uri) {
		final String lastSegment = uri.lastSegment();

		if (StringUtils.startsWith(lastSegment, SYNTHETIC_URI_PREFIX)) {
			return uri.trimSegments(1).appendSegment(StringUtils.substring(lastSegment, SYNTHETIC_URI_PREFIX.length()));
		}

		return uri;
	}

	/**
	 * Turns all {@link EObject}s referenced, but not contained by
	 * {@code semanticElement} into EMF proxies.
	 *
	 * <p>
	 * Searches for all {@link EObject}s directly or indirectly referenced, but not
	 * contained by {@code semanticElement} or its descendants and turns them into
	 * EMF proxies. If any of the proxies is contained within the resource
	 * {@code originalResourceUri}, only a local proxy URI is set. This comparison
	 * understands <i>fake resource identifiers</i>. The Java object identity of
	 * EObjects is never changed.
	 * </p>
	 *
	 * <p>
	 * As result, all references from within {@code semanticElement} or its
	 * descendants to the outside world are proxies. References within are
	 * maintained. Thus, {@code semanticElement} is now "self-contained" in the
	 * sense that it can be moved to the original {@link Resource}, and after
	 * resolving EMF proxies the model should be in the same state as if the
	 * modifications applied in the fake resource had been applied to the original
	 * resource.
	 * </p>
	 *
	 * @param semanticElement
	 *            Element to proxify.
	 * @param originalResourceUri
	 *            URI of the original Resource.
	 *
	 * @return Proxified {@code semanticElement}.
	 */
	public <T extends EObject> T proxify(final @NonNull T semanticElement, final @NonNull URI originalResourceUri) {
		final Set<EObject> allReferencedObjects = collectAllReferencedObjectsDeep(semanticElement)
				.collect(Collectors.toSet());

		final URI semanticResourceUri = originalResourceUri.trimFragment();

		for (final EObject next : allReferencedObjects) {
			if (!EcoreUtil.isAncestor(semanticElement, next)) {
				final URI targetUri = EcoreUtil.getURI(next);
				URI createURI = targetUri;
				if (equalsDisregardingSyntheticAndFileExtension(targetUri.trimFragment(), semanticResourceUri)) {
					final String fragment = targetUri.fragment();
					createURI = semanticResourceUri.appendFragment(fragment);
				}
				((InternalEObject) next).eSetProxyURI(createURI);
			}
		}

		return semanticElement;
	}

	protected boolean equalsDisregardingSyntheticAndFileExtension(final @NonNull URI a, final @NonNull URI b) {
		if (a.equals(b)) {
			return true;
		}
		
		final URI noSynthB = removeSynthetic(b);
		if (a.equals(noSynthB)) {
			return true;
		}
		
		final URI noSynthA = removeSynthetic(a);
		if (noSynthA.equals(b)) {
			return true;
		}
		
		return noSynthA.trimFileExtension().equals(noSynthB.trimFileExtension());
	}

	protected Stream<EObject> collectAllReferencedObjectsDeep(final @NonNull EObject base) {
		return Stream.concat(Stream.of(base), Streams.stream(EcoreUtil.getAllContents(base, false)))
				.flatMap(obj -> collectAllReferencedObjects(obj))
				.filter(Objects::nonNull);
	}

	protected Stream<EObject> collectAllReferencedObjects(final @NonNull EObject base) {
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
