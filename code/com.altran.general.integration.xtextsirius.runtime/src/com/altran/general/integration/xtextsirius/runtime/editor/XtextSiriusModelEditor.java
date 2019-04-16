package com.altran.general.integration.xtextsirius.runtime.editor;

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

	public XtextSiriusModelEditor(final @NonNull IXtextSiriusModelDescriptor descriptor) {
		super(descriptor);
	}

	@Override
	public void doSetValue(final @Nullable Object value, final @Nullable String valueFeatureName) {
		ModelRegionEditorPreparer preparer = null;
		URI resourceUri = null;

		EObject semanticElement;
		if (value instanceof EObject) {
			semanticElement = (EObject) value;
			preparer = new ModelRegionEditorPreparer(getDescriptor(), semanticElement);
			resourceUri = semanticElement.eResource().getURI();

		} else {
			semanticElement = getSemanticElement();
			if (semanticElement != null) {
				if (getFallbackContainer() != null) {
					final EStructuralFeature valueFeature = convertValueFeature(valueFeatureName);
					if (valueFeature != null) {
						preparer = new ModelRegionEditorPreparer(getDescriptor(), null, semanticElement, valueFeature);
						resourceUri = semanticElement.eResource().getURI();
					}
				}
				if (preparer == null) {
					preparer = new ModelRegionEditorPreparer(getDescriptor(), semanticElement);
					resourceUri = semanticElement.eResource().getURI();
				}
			}
		}

		if (preparer != null && resourceUri != null) {
			String text = preparer.getText();
			TextRegion textRegion = preparer.getTextRegion();

			if (value instanceof String) {
				final String str = (String) value;
				if (StringUtils.isNotBlank(str)) {
					text = StringUtils.overlay(text, str, textRegion.getOffset(),
							textRegion.getOffset() + textRegion.getLength());
					textRegion = new TextRegion(textRegion.getOffset(), str.length());
				}
			}

			super.updateCallbackSetValue(text, textRegion.getOffset(), textRegion.getLength());

			this.semanticElementLocation = preparer.getSemanticElementLocation();
			this.selectedRegion = preparer.getSelectedRegion();
		}
	}
	
	@Override
	protected @Nullable Object getValueToCommit() throws AXtextSiriusIssueException {
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
			}
		}
		
		return null;
	}

	@Override
	public Object commit(final @NonNull EObject target, final @Nullable String valueFeatureName) {
		try {
			final Object valueToCommit = getValueToCommit();
			final EObject adjustedTarget = adjustTarget(target, valueFeatureName);
			if (!StringUtils.isBlank(valueFeatureName) || !(valueToCommit instanceof EObject)) {
				final EStructuralFeature valueFeature = enforceValueFeature(target, valueFeatureName);
				final EMerger<EObject> merger = new EMerger<>(getDescriptor(), adjustedTarget, getUri(adjustedTarget));
				final EObject result = merger.merge(valueToCommit, valueFeature);
				EcoreUtil.resolveAll(result);
				if (result.eClass().getFeatureID(valueFeature) != -1) {
					return result;
				} else {
					return result.eGet(valueFeature);
				}
			} else {
				final EMerger<EObject> merger = new EMerger<>(getDescriptor(), target, getUri(target));
				final EObject result = merger.merge((EObject) valueToCommit);
				EcoreUtil.resolveAll(result);
				return result;
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
