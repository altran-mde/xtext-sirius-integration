/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.exception.AXtextSiriusIssueException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;
import com.altran.general.integration.xtextsirius.runtime.ignoredfeature.IgnoredFeatureAdapter;
import com.altran.general.integration.xtextsirius.runtime.modelregion.ModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.runtime.modelregion.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;
import com.google.common.collect.Lists;

public class XtextSiriusStyledTextCellEditorModel extends AXtextSiriusStyledTextCellEditor {
	private SemanticElementLocation semanticElementLocation;
	private @Nullable TextRegion selectedRegion;

	public XtextSiriusStyledTextCellEditorModel(final @NonNull XtextSiriusModelDescriptor descriptor) {
		super(descriptor);
	}

	@Override
	protected void focusLost() {
		super.focusLost();
		removeAllIgnoredFeatureAdapters();
	}

	@Override
	protected void doSetValue(final Object value) {
		final EObject semanticElement = getSemanticElement();

		if (semanticElement == null) {
			return;
		}

		final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(getInjector(), semanticElement);
		preparer.setMultiLine(isMultiLine());
		preparer.setEditableFeatures(getDescriptor().getEditableFeatures());
		preparer.setIgnoredNestedFeatures(getDescriptor().getIgnoredNestedFeatures());
		preparer.setSelectedFeatures(getDescriptor().getSelectedFeatures());

		final String prefixText = interpret(getDescriptor().getPrefixTerminalsExpression());
		preparer.setPrefixText(prefixText);
		final String suffixText = interpret(getDescriptor().getSuffixTerminalsExpression());
		preparer.setSuffixText(suffixText);

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

		getXtextAdapter().resetVisibleRegion();
		super.doSetValue(text);

		this.semanticElementLocation = preparer.getSemanticElementLocation();

		getXtextAdapter().setVisibleRegion(textRegion.getOffset(), textRegion.getLength());
		this.selectedRegion = preparer.getSelectedRegion();
	}

	protected @Nullable SemanticElementLocation getSemanticElementLocation() {
		return this.semanticElementLocation;
	}

	public void updateSelectedRegion() {
		if (this.selectedRegion != null) {
			getXtextAdapter().getXtextSourceViewer().setSelectedRange(this.selectedRegion.getOffset(),
					this.selectedRegion.getLength());
		}
	}

	@Override
	public @Nullable Object getValueToCommit() throws AXtextSiriusIssueException {
		final SemanticElementLocation location = getSemanticElementLocation();
		if (location != null) {
			final IParseResult parseResult = getXtextAdapter().getXtextParseResult();
			if (parseResult.hasSyntaxErrors()) {
				final XtextSiriusSyntaxErrorException ex = handleSyntaxErrors(parseResult);
				throw ex;
			}
			final EObject element = location.resolve(parseResult.getRootASTElement().eResource());
			if (element != null) {
				if (containsUnresolvableProxies(element)) {
					final XtextSiriusErrorException ex = handleUnresolvableProxies();
					throw ex;
				}
				return FakeResourceUtil.getInstance().proxify(element, EcoreUtil.getURI(getSemanticElement()));
			}
		}

		return null;
	}

	protected boolean containsUnresolvableProxies(final EObject eObject) {
		return !EcoreUtil.UnresolvedProxyCrossReferencer.find(eObject).isEmpty();
	}

	protected XtextSiriusSyntaxErrorException handleSyntaxErrors(final IParseResult parseResult) {
		return new XtextSiriusSyntaxErrorException((String) getValue(), getXtextAdapter().getVisibleRegion(),
				Lists.newArrayList(parseResult.getSyntaxErrors()));
	}

	protected XtextSiriusErrorException handleUnresolvableProxies() {
		return new XtextSiriusErrorException("Entered text contains unresolvable references", (String) getValue());
	}

	@Override
	public @NonNull XtextSiriusModelDescriptor getDescriptor() {
		return (@NonNull XtextSiriusModelDescriptor) super.getDescriptor();
	}
	
	/** Must not be called before the merging is complete */
	protected void removeAllIgnoredFeatureAdapters() {
		if (getSemanticElement() == null) {
			return;
		}
		final EObject rootContainer = EcoreUtil.getRootContainer(getSemanticElement());
		rootContainer.eAllContents()
				.forEachRemaining(eObject -> eObject.eAdapters().removeIf(IgnoredFeatureAdapter.class::isInstance));
	}
}
