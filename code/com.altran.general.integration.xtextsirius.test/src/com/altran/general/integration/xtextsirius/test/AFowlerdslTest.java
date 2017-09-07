package com.altran.general.integration.xtextsirius.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;

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
import org.junit.BeforeClass;

import com.google.inject.Injector;

public abstract class AFowlerdslTest {
	private XtextResourceSet xtextResourceSet = null;

	@BeforeClass
	public static void loadFowlerds() {
		FowlerdslEnvironment.getInstance();
	}
	
	@Before
	@After
	public void deleteXtextResourceSet() {
		this.xtextResourceSet = null;
	}

	protected static Injector getInjector() {
		return FowlerdslEnvironment.getInstance().getInjector();
	}

	@SuppressWarnings("unchecked")
	protected static <T> @Nullable T findFirstTargetOfType(final @NonNull EObject base,
			final @NonNull Class<T> type) {
		if (type.isInstance(base)) {
			return (T) base;
		}
		
		if (base.eIsProxy()) {
			return null;
		}

		for (final EReference ref : base.eClass().getEAllReferences()) {
			final Object target = base.eGet(ref, false);
			if (target instanceof EObject) {
				@SuppressWarnings("null")
				final T result = findFirstTargetOfType((EObject) target, type);
				if (result != null) {
					return result;
				}
			}
		}

		return null;
	}

	protected static @NonNull Statemachine parse(final @NonNull String modelText) {
		final IParser parser = getInjector().getInstance(IParser.class);
		final IParseResult parseResult = parser.parse(new StringReader(modelText));
		
		assertFalse(parseResult.getSyntaxErrors().toString(), parseResult.hasSyntaxErrors());

		final EObject model = parseResult.getRootASTElement();

		assertTrue("Root object in model is no statemachine", model instanceof Statemachine);
		
		return (Statemachine) model;
	}

	protected static @NonNull Statemachine parseAndLink(final @NonNull String modelText,
			final @NonNull Resource resource) {
		final Statemachine result = parse(modelText);
		
		resource.getContents().add(result);
		
		final ILinker linker = getInjector().getInstance(ILinker.class);
		final ListBasedDiagnosticConsumer diagnosticConsumer = new ListBasedDiagnosticConsumer();
		linker.linkModel(result, diagnosticConsumer);
		
		assertFalse(diagnosticConsumer.getResult(Severity.ERROR).toString(),
				diagnosticConsumer.hasConsumedDiagnostics(Severity.ERROR));
		
		EcoreUtil.resolveAll(result);
		
		return result;
	}

	protected static @NonNull XtextResourceSet createResourceSet() {
		return getInjector().getInstance(XtextResourceSet.class);
	}
	
	protected static @NonNull Statemachine createFakeModel(final @NonNull Statemachine original) {
		final XtextResourceSet resourceSet = createResourceSet();
		final Resource resource = resourceSet
				.createResource(URI.createPlatformResourceURI("/proj/fakeModel.statemachine", false));

		return parseAndLink(NodeModelUtils.getNode(original).getText(), resource);
	}
	
	protected @NonNull Statemachine parseIntoResource(final @NonNull String modelText, final @NonNull String uri) {
		return parseAndLink(modelText, getOrCreateResource(URI.createPlatformResourceURI(uri, false)));
	}
	
	protected @NonNull Statemachine parseIntoResource(final @NonNull String modelText) {
		return parseIntoResource(modelText, "proj/model.statemachine");
	}
	
	protected @NonNull XtextResource getOrCreateResource(final @NonNull URI uri) {
		final XtextResourceSet resourceSet = getOrCreateResourceSet();
		XtextResource resource = (XtextResource) resourceSet.getURIResourceMap().get(uri);
		
		if (resource == null) {
			resource = (XtextResource) resourceSet.createResource(uri);
		}
		
		return resource;
	}
	
	protected @NonNull XtextResourceSet getOrCreateResourceSet() {
		if (this.xtextResourceSet == null) {
			this.xtextResourceSet = createResourceSet();
		}
		
		return this.xtextResourceSet;
	}
}
