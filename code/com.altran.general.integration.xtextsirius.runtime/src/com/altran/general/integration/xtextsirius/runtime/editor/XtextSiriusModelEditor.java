package com.altran.general.integration.xtextsirius.runtime.editor;

import java.util.Optional;

import org.apache.commons.lang.StringUtils;
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
	private boolean deleteEntry;
	private boolean noOp;
	
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
		if (StringUtils.isBlank(getValueFeatureName())) {
			if (semanticElement != null) {
				this.effectiveSemanticElement = semanticElement;
				this.effectiveFallbackContainer = getFallbackContainer();
				this.effectiveStructuralFeature = semanticElement.eContainingFeature();
				// this.resourceUri = semanticElement.eResource().getURI();
			} else {
				this.effectiveSemanticElement = fallbackContainer;
				this.effectiveFallbackContainer = fallbackContainer.eContainer() != null
						? fallbackContainer.eContainer()
						: fallbackContainer;
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
	
	@Override
	public void setValue(final @Nullable Object value) {
		assertState();

		final EObject effectiveSemanticElement = getEffectiveSemanticElement();
		final EObject effectiveFallbackContainer = getEffectiveFallbackContainer();
		final EStructuralFeature effectiveStructuralFeature = getEffectiveStructuralFeature();
		final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(getDescriptor(),
				effectiveSemanticElement, effectiveFallbackContainer, effectiveStructuralFeature);
		
		String text = preparer.getText();
		TextRegion textRegion = preparer.getTextRegion();
		
		if (!isNoOp(value)) {
			this.noOp = false;
			@Nullable
			String textValue = null;
			
			final Optional<String> deletion = isDeletion(value);
			if (deletion.isPresent()) {
				this.deleteEntry = true;
				textValue = deletion.get();
			} else {
				this.deleteEntry = false;
				
				if (value instanceof String) {
					textValue = (String) value;
				}
			}

			if (textValue != null) {
				text = StringUtils.overlay(text, textValue, textRegion.getOffset(),
						textRegion.getOffset() + textRegion.getLength());
				textRegion = new TextRegion(textRegion.getOffset(), textValue.length());
			}
		} else {
			this.noOp = true;
		}
		
		updateCallbackSetValue(text, textRegion.getOffset(), textRegion.getLength());

		this.semanticElementLocation = preparer.getSemanticElementLocation();
		this.selectedRegion = preparer.getSelectedRegion();
	}
	
	@Override
	protected @Nullable EObject getValueToCommit() throws AXtextSiriusIssueException {
		if (this.deleteEntry) {
			return null;
		}
		
		final SemanticElementLocation location = getSemanticElementLocation();
		if (location != null) {
			final IParseResult parseResult = getCallback().getXtextParseResult();
			if (parseResult.hasSyntaxErrors()) {
				final XtextSiriusSyntaxErrorException ex = getCallback().handleSyntaxErrors(parseResult);
				throw ex;
			}
			final EObject element = location.resolve(parseResult.getRootASTElement().eResource());
			if (element != null) {
				if (containsUnresolvableProxies(element)) {
					final XtextSiriusErrorException ex = getCallback().handleUnresolvableProxies();
					throw ex;
				}
				return FakeResourceUtil.getInstance().proxify(element, EcoreUtil.getURI(getSemanticElement()));
				// return FakeResourceUtil.getInstance().proxify(element,
				// EcoreUtil.getURI(getEffectiveSemanticElement()));
			}
		}
		
		return null;
	}

	@Override
	public Object commit(final @NonNull EObject target) {
		assertState();
		try {
			EObject result = target;

			if (!this.noOp) {
				final EObject valueToCommit = getValueToCommit();
				final EObject adjustedTarget = adjustTarget(target, getValueFeatureName());
				if (!StringUtils.isBlank(getValueFeatureName())
						|| (valueToCommit != null && !(valueToCommit instanceof EObject))) {
					final EStructuralFeature valueFeature = enforceValueFeature(target, getValueFeatureName());
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

			final EStructuralFeature resultValueFeature = enforceValueFeature(result, getValueFeatureName());
			if (result.eClass().getFeatureID(resultValueFeature) == -1) {
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
