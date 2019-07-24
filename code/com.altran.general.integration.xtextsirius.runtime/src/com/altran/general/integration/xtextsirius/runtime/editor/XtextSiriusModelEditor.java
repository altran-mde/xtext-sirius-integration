/**
 * Copyright (C) 2019 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editor;

import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.ElementModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.FallbackModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.FeatureFallbackModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.FeatureNullModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.IModelAdjuster;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusValidationErrorException;
import com.altran.general.integration.xtextsirius.runtime.ignoredfeature.IgnoredFeatureAdapter;
import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.runtime.modelregion.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.runtime.modelregion.TextOverlayer;
import com.altran.general.integration.xtextsirius.runtime.util.EMerger;
import com.altran.general.integration.xtextsirius.runtime.util.EcoreNavigationUtil;
import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;
import com.google.common.collect.Lists;

public class XtextSiriusModelEditor extends AXtextSiriusEditor<IXtextSiriusModelEditorCallback> {
	private @Nullable SemanticElementLocation semanticElementLocation;
	private @Nullable TextRegion selectedRegion;
	
	public XtextSiriusModelEditor(final @NonNull IXtextSiriusModelDescriptor descriptor) {
		super(descriptor);
	}
	
	@Override
	public void initValue(final @Nullable Object initialValue) {
		assertState();
		
		final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(getDescriptor(),
				getModelAdjuster().adjust(getModelEntryPoint()));
		
		final TextOverlayer overlayer = new TextOverlayer(this, preparer, initialValue);
		
		updateCallbackInitText(overlayer);
		
		this.semanticElementLocation = preparer.getSemanticElementLocation();
		this.selectedRegion = preparer.getSelectedRegion();
	}
	
	@Override
	public Object commit(final @NonNull EObject target) {
		try {
			assertState();
			
			final String text = getCallback().callbackGetText();
			final FeatureAdjuster featureAdjuster = new FeatureAdjuster(getModelEntryPoint());
			
			if (isNoOp(text)) {
				return featureAdjuster.getValue(target);
			}
			
			if (isCancelOnValidationError()) {
				final Object valueToCommit = retrieveValueToCommit();
				
				final Diagnostic diagnostic;
				if (valueToCommit instanceof EObject) {
					diagnostic = Diagnostician.INSTANCE.validate((EObject) valueToCommit);
				} else if (valueToCommit instanceof EList<?>) {
					@SuppressWarnings("unchecked")
					final EList<EObject> values = (EList<EObject>) valueToCommit;
					final BasicDiagnostic diagnosticChain = new BasicDiagnostic();
					for (final EObject e : values) {
						Diagnostician.INSTANCE.validate(e, diagnosticChain);
					}
					diagnostic = diagnosticChain;
				} else {
					diagnostic = null;
				}
				
				if (diagnostic != null) {
					if (diagnostic.getSeverity() >= Diagnostic.ERROR) {
						final TextRegion visibleRegion = getCallback().callbackGetVisibleRegion();
						throw new XtextSiriusValidationErrorException(text, visibleRegion, diagnostic);
					}
				}
			}
			
			final EStructuralFeature valueFeature = getModelAdjuster().getStructuralFeature(getModelEntryPoint());
			
			final Object valueToCommit = adjustValueToCommitForDeletion(text, valueFeature);
			
			if (!(valueToCommit instanceof EObject)) {
				if (!isValueFeatureDefined()) {
					return target;
				}
			}
			
			final EObject adjustedTarget = featureAdjuster.getTarget(target);
			final EMerger<EObject> merger = new EMerger<>(getDescriptor(), adjustedTarget,
					EcoreUtil.getURI(adjustedTarget));
			
			if (valueToCommit instanceof EObject && !isValueFeatureDefined()) {
				final EObject result = merger.merge((EObject) valueToCommit);
				EcoreUtil.resolveAll(result);
				return result;
			}
			
			final EObject result = merger.merge(valueToCommit, valueFeature);
			EcoreUtil.resolveAll(result);
			return result.eGet(valueFeature);
			
		} finally {
			removeAllIgnoredFeatureAdapters();
		}
	}
	
	@Override
	protected @Nullable Object retrieveValueToCommit() throws AXtextSiriusIssueException {
		final SemanticElementLocation location = getSemanticElementLocation();
		if (location == null) {
			return null;
		}
		
		final IParseResult parseResult = getCallback().getXtextParseResult();
		if (parseResult.hasSyntaxErrors()) {
			throw createSyntaxErrorException(parseResult);
		}
		
		final Object result = location.resolve(parseResult.getRootASTElement().eResource());
		if (result == null) {
			return null;
		}
		
		if (result instanceof EObject) {
			return proxifyValueToCommit((EObject) result);
		} else if (result instanceof EList<?>) {
			return proxifyElistToCommit(result);
		}
		
		return result;
	}
	
	private Object adjustValueToCommitForDeletion(final String text, final EStructuralFeature valueFeature)
			throws AXtextSiriusIssueException {
		final Object valueToCommit;
		if (isDeletion(text)) {
			if (null != valueFeature && valueFeature.isMany()) {
				valueToCommit = ECollections.emptyEList();
			} else {
				valueToCommit = null;
			}
		} else {
			valueToCommit = retrieveValueToCommit();
		}
		return valueToCommit;
	}
	
	private Object proxifyElistToCommit(final Object result) {
		@SuppressWarnings("unchecked")
		final EList<EObject> eList = (EList<EObject>) result;
		final ArrayList<EObject> copy = new ArrayList<>(eList);
		for (int i = 0; i < copy.size(); i++) {
			final Object entry = eList.get(i);
			if (entry instanceof EObject) {
				// TODO: check if this actually works
				eList.set(i, proxifyResult((EObject) entry));
			}
		}
		return eList;
	}
	
	private XtextSiriusErrorException createUnresolvableProxiesException(final @NonNull EObject element) {
		return new XtextSiriusErrorException("Entered text contains unresolvable references",
				getCallback().callbackGetText());
	}
	
	private Object proxifyValueToCommit(final EObject element) {
		if (containsUnresolvableProxies(element)) {
			throw createUnresolvableProxiesException(element);
		}
		
		final ModelEntryPoint mep = new ModelEntryPoint(element, null, getValueFeatureName());
		final EObject closestElement = getModelAdjuster().getClosestElement(mep);
		return proxifyResult(closestElement);
	}
	
	private <P extends EObject> P proxifyResult(final P closestElement) {
		final EObject origElement = getModelAdjuster().getClosestElement(getModelEntryPoint());
		return FakeResourceUtil.getInstance().proxify(closestElement, EcoreUtil.getURI(origElement));
	}
	
	private XtextSiriusSyntaxErrorException createSyntaxErrorException(final IParseResult parseResult) {
		final ArrayList<INode> syntaxErrors = Lists.newArrayList(parseResult.getSyntaxErrors());
		final String text = getCallback().callbackGetText();
		final TextRegion visibleRegion = getCallback().callbackGetVisibleRegion();
		return new XtextSiriusSyntaxErrorException(text, visibleRegion, syntaxErrors);
	}
	
	public @Nullable TextRegion getSelectedRegion() {
		return this.selectedRegion;
	}
	
	@Override
	public IXtextSiriusModelDescriptor getDescriptor() {
		return (IXtextSiriusModelDescriptor) super.getDescriptor();
	}
	
	private boolean containsUnresolvableProxies(final @NonNull EObject eObject) {
		return !EcoreUtil.UnresolvedProxyCrossReferencer.find(eObject).isEmpty();
	}
	
	private void removeAllIgnoredFeatureAdapters() {
		if (getSemanticElement() == null) {
			return;
		}
		final EObject rootContainer = EcoreUtil
				.getRootContainer(getModelAdjuster().getClosestElement(getModelEntryPoint()));
		rootContainer.eAllContents()
				.forEachRemaining(eObject -> eObject.eAdapters().removeIf(IgnoredFeatureAdapter.class::isInstance));
	}
	
	private void updateCallbackInitText(final TextOverlayer overlayer) {
		updateCallbackInitText(overlayer.getText(), overlayer.getTextRegion().getOffset(),
				overlayer.getTextRegion().getLength());
	}
	
	@Override
	protected @NonNull IModelAdjuster determineModelAdjuster() {
		final EObject semanticElement = getSemanticElement();
		final EObject fallbackContainer = getFallbackContainer();
		
		if (isValueFeatureDefined()) {
			if (EcoreNavigationUtil.hasFeature(fallbackContainer, getValueFeatureName())) {
				final EStructuralFeature feature = fallbackContainer.eClass()
						.getEStructuralFeature(getValueFeatureName());
				final Object featureValue = fallbackContainer.eGet(feature);
				
				if (featureValue == null || featureValue instanceof EObject) {
					return new FeatureFallbackModelAdjuster();
				}
				
				return new FeatureNullModelAdjuster();
			}
			
			throw new IllegalStateException("Could not determine modelAdjuster: " + getModelEntryPoint());
		}
		
		if (semanticElement != null) {
			return new ElementModelAdjuster();
		} else {
			return new FallbackModelAdjuster();
		}
	}
	
	private @Nullable SemanticElementLocation getSemanticElementLocation() {
		return this.semanticElementLocation;
	}
}
