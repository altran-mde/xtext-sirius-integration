package com.altran.general.integration.xtextsirius.runtime.editor;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;
import com.altran.general.integration.xtextsirius.runtime.ignoredfeature.IgnoredFeatureAdapter;
import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.runtime.modelregion.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.runtime.util.EMerger;
import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;

public class XtextSiriusModelEditor extends AXtextSiriusEditor<IXtextSiriusModelEditorCallback> {
	private @Nullable SemanticElementLocation semanticElementLocation;
	private @Nullable TextRegion selectedRegion;

	@SuppressWarnings("null")
	public XtextSiriusModelEditor(final @NonNull IXtextSiriusModelDescriptor descriptor) {
		super(descriptor);
	}

	// private @NonNull URI resourceUri;
	private @Nullable EObject effectiveSemanticElement;
	private @NonNull EObject effectiveFallbackContainer;
	private @NonNull EStructuralFeature effectiveStructuralFeature;

	private boolean entryPointDetermined = false;

	// private @NonNull URI getEffectiveResourceUri() {
	// determineModelEntryPoint();
	// return this.resourceUri;
	// }

	private @Nullable EObject getEffectiveSemanticElement() {
		determineModelEntryPoint();
		return this.effectiveSemanticElement;
	}

	private @NonNull EObject getEffectiveFallbackContainer() {
		determineModelEntryPoint();
		return this.effectiveFallbackContainer;
	}

	private @NonNull EStructuralFeature getEffectiveStructuralFeature() {
		determineModelEntryPoint();
		return this.effectiveStructuralFeature;
	}

	private void determineModelEntryPoint() {
		if (this.entryPointDetermined) {
			return;
		}

		final EObject semanticElement = getSemanticElement();
		final EObject fallbackContainer = getFallbackContainer();
		if (!isValueFeatureDefined()) {
			if (semanticElement != null) {
				this.effectiveSemanticElement = semanticElement;
				this.effectiveFallbackContainer = getFallbackContainer();
				this.effectiveStructuralFeature = semanticElement.eContainingFeature();
				// this.resourceUri = semanticElement.eResource().getURI();
			} else {
				this.effectiveSemanticElement = fallbackContainer;
				this.effectiveFallbackContainer = eContainerIfExists(fallbackContainer);
				this.effectiveStructuralFeature = fallbackContainer.eContainingFeature();
				// this.resourceUri = fallbackContainer.eResource().getURI();
			}
		} else {
			final EStructuralFeature eStructuralFeature = fallbackContainer.eClass()
					.getEStructuralFeature(getValueFeatureName());
			if (eStructuralFeature != null) {
				final Object featureValue = fallbackContainer.eGet(eStructuralFeature);
				if (featureValue == null || featureValue instanceof EObject) {
					this.effectiveSemanticElement = (EObject) featureValue;
					this.effectiveFallbackContainer = fallbackContainer;
					this.effectiveStructuralFeature = eStructuralFeature;
					// if (featureValue != null) {
					// this.resourceUri = ((EObject)
					// featureValue).eResource().getURI();
					// } else {
					// this.resourceUri =
					// fallbackContainer.eResource().getURI();
					// }
				} else {
					this.effectiveSemanticElement = null;
					this.effectiveFallbackContainer = fallbackContainer;
					this.effectiveStructuralFeature = eStructuralFeature;
					// this.resourceUri =
					// fallbackContainer.eResource().getURI();
				}
			} else {
				// FIXME: Real Exception
				throw new RuntimeException("nix gut");
			}
		}

		this.entryPointDetermined = true;
	}

	public boolean isValueFeatureDefined() {
		return !StringUtils.isBlank(getValueFeatureName());
	}

	@Override
	public void initValue(final @Nullable Object initialValue) {
		assertState();

		final EObject effectiveSemanticElement = getEffectiveSemanticElement();
		final EObject effectiveFallbackContainer = getEffectiveFallbackContainer();
		final EStructuralFeature effectiveStructuralFeature = getEffectiveStructuralFeature();
		final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(getDescriptor(),
				effectiveSemanticElement, effectiveFallbackContainer, effectiveStructuralFeature);

		String text = preparer.getText();
		TextRegion textRegion = preparer.getTextRegion();

		// if (!isNoOp(initialValue)) {
		// this.noOp = false;
		// @Nullable
		// String textValue = null;
		//
		// final Optional<String> deletion = isDeletion(initialValue);
		// if (deletion.isPresent()) {
		// this.deleteEntry = true;
		// textValue = deletion.get();
		// } else {
		// this.deleteEntry = false;

		final String initialText = text.substring(textRegion.getOffset(),
				textRegion.getOffset() + textRegion.getLength());
		@Nullable
		final String textValue = initializeText(initialValue, initialText);
		// if (initialValue instanceof String) {
		// textValue = (String) initialValue;
		// }
		// }

		if (textValue != null) {
			text = StringUtils.overlay(text, textValue, textRegion.getOffset(),
					textRegion.getOffset() + textRegion.getLength());
			textRegion = new TextRegion(textRegion.getOffset(), textValue.length());
		}
		// } else {
		// this.noOp = true;
		// }
		;

		updateCallbackInitText(text, textRegion.getOffset(), textRegion.getLength());

		this.semanticElementLocation = preparer.getSemanticElementLocation();
		this.selectedRegion = preparer.getSelectedRegion();
	}

	@Override
	protected @Nullable Object getValueToCommit() throws AXtextSiriusIssueException {
		final SemanticElementLocation location = getSemanticElementLocation();
		if (location == null) {
			return null;
		}

		final IParseResult parseResult = getCallback().getXtextParseResult();
		if (parseResult.hasSyntaxErrors()) {
			final XtextSiriusSyntaxErrorException ex = getCallback().handleSyntaxErrors(parseResult);
			throw ex;
		}

		final Object result = location.resolve(parseResult.getRootASTElement().eResource());
		if (result == null) {
			return null;
		}

		if (result instanceof EObject) {
			final EObject element = (EObject) result;
			if (containsUnresolvableProxies(element)) {
				final XtextSiriusErrorException ex = getCallback().handleUnresolvableProxies();
				throw ex;
			}

			final EObject origElement = getEffectiveSemanticElement();
			if (origElement == null) {
				final EObject elementContainer = element.eContainer();
				if (elementContainer != null) {
					final EObject origFallbackContainer = getEffectiveFallbackContainer();
					final EObject merged = FakeResourceUtil.getInstance().proxify(elementContainer,
							EcoreUtil.getURI(origFallbackContainer));
					return merged.eGet(element.eContainmentFeature());
				}
			}

			return FakeResourceUtil.getInstance().proxify(element, EcoreUtil.getURI(origElement));
			// return
			// FakeResourceUtil.getInstance().proxify(element,
			// EcoreUtil.getURI(getEffectiveSemanticElement()));
			// TODO: proxify EObjects in List
		}

		return result;
	}

	@Override
	public Object commit(final @NonNull EObject target) {
		assertState();
		try {
			EObject result = target;

			final String text = getCallback().callbackGetText();
			
			if (!isNoOp(text)) {
				final Object valueToCommit;
				
				if (isDeletion(text)) {
					if (getEffectiveStructuralFeature().isMany()) {
						valueToCommit = ECollections.emptyEList();
					} else {
						valueToCommit = null;
					}
				} else {
					valueToCommit = getValueToCommit();
				}

				final EObject adjustedTarget = adjustTarget(target, getValueFeatureName());
				if (isValueFeatureDefined()
						|| (valueToCommit != null && !(valueToCommit instanceof EObject))) {
					final EStructuralFeature valueFeature = getEffectiveStructuralFeature();
					final EMerger<EObject> merger = new EMerger<>(getDescriptor(), adjustedTarget,
							getUri(adjustedTarget));
					result = merger.merge(valueToCommit, valueFeature);
					EcoreUtil.resolveAll(result);
					// return result;
				} else if (valueToCommit != null) {
					final EMerger<EObject> merger = new EMerger<>(getDescriptor(), target, getUri(target));
					result = merger.merge((EObject) valueToCommit);
					EcoreUtil.resolveAll(result);
					// return result;
				}
			}

			final EStructuralFeature resultValueFeature = convertValueFeature(result, getValueFeatureName());
			if (resultValueFeature == null || result.eClass().getFeatureID(resultValueFeature) == -1) {
				return result;
			} else {
				return result.eGet(resultValueFeature);
			}
		} finally {
			removeAllIgnoredFeatureAdapters();
		}
	}

	protected @Nullable URI getUri(final EObject adjustedTarget) {
		return adjustedTarget != null ? EcoreUtil.getURI(adjustedTarget) : null;
	}

	/** Must not be called before the merging is complete */
	public void removeAllIgnoredFeatureAdapters() {
		if (getSemanticElement() == null) {
			return;
		}
		final EObject rootContainer = EcoreUtil.getRootContainer(getSemanticElement());
		rootContainer.eAllContents()
				.forEachRemaining(eObject -> eObject.eAdapters().removeIf(IgnoredFeatureAdapter.class::isInstance));
	}

	public @Nullable TextRegion getSelectedRegion() {
		return this.selectedRegion;
	}

	@Override
	public IXtextSiriusModelDescriptor getDescriptor() {
		return (IXtextSiriusModelDescriptor) super.getDescriptor();
	}

	protected @Nullable SemanticElementLocation getSemanticElementLocation() {
		return this.semanticElementLocation;
	}

	protected boolean containsUnresolvableProxies(final @NonNull EObject eObject) {
		return !EcoreUtil.UnresolvedProxyCrossReferencer.find(eObject).isEmpty();
	}
}
