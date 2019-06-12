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

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import com.altran.general.integration.xtextsirius.runtime.ignoredfeature.IgnoredFeatureAdapter;
import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.runtime.modelregion.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.runtime.util.EMerger;
import com.altran.general.integration.xtextsirius.runtime.util.EcoreNavigationUtil;
import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;
import com.google.common.collect.Lists;

public class XtextSiriusModelEditor extends AXtextSiriusEditor<IXtextSiriusModelEditorCallback> {
	private IModelAdjuster modelAdjuster;
	
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
		
		String text = preparer.getText();
		TextRegion textRegion = preparer.getTextRegion();
		
		final int textOffset = textRegion.getOffset();
		final int textLength = textRegion.getLength();
		final int textEndOffset = textOffset + textLength;
		
		final String initialText = text.substring(textOffset, textEndOffset);
		
		final @Nullable String textValue = initializeText(initialValue, initialText);
		
		if (textValue != null) {
			text = StringUtils.overlay(text, textValue, textOffset, textEndOffset);
			textRegion = new TextRegion(textOffset, textValue.length());
		}
		
		updateCallbackInitText(text, textOffset, textLength);
		
		this.semanticElementLocation = preparer.getSemanticElementLocation();
		this.selectedRegion = preparer.getSelectedRegion();
	}
	
	@Override
	public Object commit(final @NonNull EObject target) {
		try {
			assertState();

			EObject result = target;
			final String text = getCallback().callbackGetText();
			final FeatureAdjuster featureAdjuster = new FeatureAdjuster(getModelEntryPoint());

			if (isNoOp(text)) {
				return featureAdjuster.getValue(result);
			}

			final EStructuralFeature valueFeature = getModelAdjuster().getStructuralFeature(getModelEntryPoint());
			
			final Object valueToCommit;
			if (isDeletion(text)) {
				if (null != valueFeature && valueFeature.isMany()) {
					valueToCommit = ECollections.emptyEList();
				} else {
					valueToCommit = null;
				}
			} else {
				valueToCommit = getValueToCommit();
			}

			final EObject adjustedTarget = featureAdjuster.getTarget(target);
			final EMerger<EObject> merger = new EMerger<>(getDescriptor(), adjustedTarget,
					EcoreUtil.getURI(adjustedTarget));
			
			if (!isValueFeatureDefined() && valueToCommit instanceof EObject) {
				result = merger.merge((EObject) valueToCommit);
				EcoreUtil.resolveAll(result);
				return result;
			} else if (isValueFeatureDefined()) {
				result = merger.merge(valueToCommit, valueFeature);
				EcoreUtil.resolveAll(result);
				return result.eGet(valueFeature);
			}

			return result;
		} finally {
			removeAllIgnoredFeatureAdapters();
		}
	}
	
	@Override
	protected @Nullable Object getValueToCommit() throws AXtextSiriusIssueException {
		final SemanticElementLocation location = getSemanticElementLocation();
		if (location == null) {
			return null;
		}
		
		final IParseResult parseResult = getCallback().getXtextParseResult();
		if (parseResult.hasSyntaxErrors()) {
			final ArrayList<INode> syntaxErrors = Lists.newArrayList(parseResult.getSyntaxErrors());
			final String text = getCallback().callbackGetText();
			final TextRegion visibleRegion = getCallback().callbackGetVisibleRegion();
			throw new XtextSiriusSyntaxErrorException(text, visibleRegion, syntaxErrors);
		}
		
		final Object result = location.resolve(parseResult.getRootASTElement().eResource());
		if (result == null) {
			return null;
		}
		
		if (result instanceof EObject) {
			final EObject element = (EObject) result;
			if (containsUnresolvableProxies(element)) {
				throw new XtextSiriusErrorException("Entered text contains unresolvable references",
						getCallback().callbackGetText());
			}
			
			final EObject origElement = getModelAdjuster().getClosestElement(getModelEntryPoint());
			final ModelEntryPoint mep = new ModelEntryPoint(element, null, getValueFeatureName());
			final EObject closestElement = getModelAdjuster().getClosestElement(mep);
			return FakeResourceUtil.getInstance().proxify(closestElement, EcoreUtil.getURI(origElement));
			// TODO: proxify EObjects in List
		}
		
		return result;
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

	private boolean isValueFeatureDefined() {
		return getModelEntryPoint().hasValueFeature();
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
	
	private void initModelAdjuster() {
		if (this.modelAdjuster != null) {
			return;
		}
		
		this.modelAdjuster = determineModelAdjuster();
	}
	
	private @NonNull IModelAdjuster determineModelAdjuster() {
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
			
			// FIXME: Real Exception
			throw new RuntimeException("nix gut");
		}
		
		if (semanticElement != null) {
			return new ElementModelAdjuster();
		} else {
			return new FallbackModelAdjuster();
		}
	}
	
	private @NonNull IModelAdjuster getModelAdjuster() {
		initModelAdjuster();
		return this.modelAdjuster;
	}

	private @Nullable SemanticElementLocation getSemanticElementLocation() {
		return this.semanticElementLocation;
	}
}
