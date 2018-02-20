package com.altran.general.integration.xtextsirius.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.linking.ILinker;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.impl.ListBasedDiagnosticConsumer;
import org.junit.After;
import org.junit.Before;

import com.google.common.collect.Maps;
import com.google.inject.Injector;

public abstract class AXtextTest {
	
	private final Map<Injector, XtextResourceSet> xtextResourceSets = Maps.newLinkedHashMap();

	@Before
	@After
	public void deleteXtextResourceSet() {
		this.xtextResourceSets.clear();
	}

	protected abstract @NonNull Injector getInjector();

	@SuppressWarnings("unchecked")
	protected static <T> @Nullable T findFirstTargetOfType(final @NonNull EObject base, final @NonNull Class<T> type) {
		if (type.isInstance(base)) {
			return (T) base;
		}

		if (base.eIsProxy()) {
			return null;
		}
		
		for (final EReference ref : base.eClass().getEAllReferences()) {
			final Object target = base.eGet(ref, false);
			if (target instanceof EObject) {
				final T result = findFirstTargetOfType((EObject) target, type);
				if (result != null) {
					return result;
				}
			}
		}
		
		return null;
	}

	protected @NonNull Statemachine parse(final @NonNull String modelText) {
		return parse(modelText, getInjector());
	}

	protected @NonNull Statemachine parse(final @NonNull String modelText, final @NonNull Injector injector) {
		final IParser parser = injector.getInstance(IParser.class);
		final IParseResult parseResult = parser.parse(new StringReader(modelText));

		assertFalse(parseResult.getSyntaxErrors().toString(), parseResult.hasSyntaxErrors());
		
		final EObject model = parseResult.getRootASTElement();
		
		assertTrue("Root object in model is no statemachine", model instanceof Statemachine);

		return (Statemachine) model;
	}


	protected @NonNull Statemachine parseAndLink(final @NonNull String modelText, final @NonNull Resource resource) {
		return parseAndLink(modelText, resource, getInjector());
	}
	
	protected @NonNull Statemachine parseAndLink(final @NonNull String modelText, final @NonNull Resource resource,
			final @NonNull Injector injector) {
		final Statemachine result = parse(modelText, injector);

		resource.getContents().add(result);

		final ILinker linker = getInjector().getInstance(ILinker.class);
		final ListBasedDiagnosticConsumer diagnosticConsumer = new ListBasedDiagnosticConsumer();
		linker.linkModel(result, diagnosticConsumer);

		assertFalse(diagnosticConsumer.getResult(Severity.ERROR).toString(),
				diagnosticConsumer.hasConsumedDiagnostics(Severity.ERROR));

		EcoreUtil.resolveAll(result);

		return result;
	}

	protected @NonNull XtextResourceSet createResourceSet() {
		return createResourceSet(getInjector());
	}

	protected @NonNull XtextResourceSet createResourceSet(final @NonNull Injector injector) {
		return getInjector().getInstance(XtextResourceSet.class);
	}
	
	protected @NonNull Statemachine createFakeModel(final @NonNull Statemachine original) {
		final XtextResourceSet resourceSet = createResourceSet();
		final Resource resource = resourceSet
				.createResource(URI.createPlatformResourceURI("/proj/fakeModel.statemachine", false));
		
		return parseAndLink(NodeModelUtils.getNode(original).getText(), resource);
	}

	protected @NonNull Statemachine parseIntoResource(final @NonNull String modelText, final @NonNull String uri) {
		return parseIntoResource(modelText, uri, getInjector());
	}

	protected @NonNull Statemachine parseIntoResource(final @NonNull String modelText, final @NonNull String uri,
			final @NonNull Injector injector) {
		return parseAndLink(modelText, getOrCreateResource(URI.createPlatformResourceURI(uri, false)), injector);
	}
	
	protected @NonNull Statemachine parseIntoResource(final @NonNull String modelText) {
		return parseIntoResource(modelText, "proj/model.statemachine");
	}

	protected @NonNull XtextResource getOrCreateResource(final @NonNull URI uri) {
		return getOrCreateResource(uri, getInjector());
	}
	
	protected @NonNull XtextResource getOrCreateResource(final @NonNull URI uri, final @NonNull Injector injector) {
		final XtextResourceSet resourceSet = getOrCreateResourceSet(injector);
		XtextResource resource = (XtextResource) resourceSet.getURIResourceMap().get(uri);

		if (resource == null) {
			resource = (XtextResource) resourceSet.createResource(uri);
		}

		return resource;
	}

	protected @NonNull XtextResourceSet getOrCreateResourceSet() {
		return getOrCreateResourceSet(getInjector());
	}
	
	protected @NonNull XtextResourceSet getOrCreateResourceSet(final @NonNull Injector injector) {
		if (!this.xtextResourceSets.containsKey(injector)) {
			this.xtextResourceSets.put(injector, createResourceSet(injector));
		}

		return this.xtextResourceSets.get(injector);
	}

}
