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

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusModelEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.XtextSiriusModelEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.AXtextSiriusStyledTextCellEditor;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelEditpartDescriptor;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;
import com.google.common.collect.Lists;

public class XtextSiriusStyledTextCellEditorModel extends AXtextSiriusStyledTextCellEditor
implements IXtextSiriusModelEditorCallback {

	public XtextSiriusStyledTextCellEditorModel(final @NonNull XtextSiriusModelEditpartDescriptor descriptor) {
		super(descriptor, new XtextSiriusModelEditor(descriptor));
	}

	@Override
	protected void focusLost() {
		super.focusLost();
		getEditor().removeAllIgnoredFeatureAdapters();
	}

	public void updateSelectedRegion() {
		final TextRegion selectedRegion = getEditor().getSelectedRegion();
		if (selectedRegion != null) {
			getXtextAdapter().getXtextSourceViewer().setSelectedRange(selectedRegion.getOffset(),
					selectedRegion.getLength());
		}
	}

	@Override
	public IParseResult getXtextParseResult() {
		return getXtextAdapter().getXtextParseResult();
	}
	
	@Override
	public XtextSiriusSyntaxErrorException handleSyntaxErrors(final IParseResult parseResult) {
		final IRegion visibleRegionJFace = getXtextAdapter().getVisibleRegion();
		final TextRegion visibleRegion = new TextRegion(visibleRegionJFace.getOffset(), visibleRegionJFace.getLength());
		return new XtextSiriusSyntaxErrorException((String) getValue(), visibleRegion,
				Lists.newArrayList(parseResult.getSyntaxErrors()));
	}
	
	@Override
	public XtextSiriusErrorException handleUnresolvableProxies() {
		return new XtextSiriusErrorException("Entered text contains unresolvable references", (String) getValue());
	}
	
	@Override
	public @NonNull XtextSiriusModelEditpartDescriptor getDescriptor() {
		return (@NonNull XtextSiriusModelEditpartDescriptor) super.getDescriptor();
	}

	// @Override
	// public EStructuralFeature getValueFeature() {
	// EObject target = get.getTarget();
	// final String featureName = setValue.getFeatureName();
	//
	// final EStructuralFeature feature;
	//
	// if (StringUtils.isNotBlank(featureName)) {
	// feature = target.eClass().getEStructuralFeature(featureName);
	// } else {
	// feature = target.eContainingFeature();
	// target = target.eContainer();
	// }
	// }

	@Override
	protected XtextSiriusModelEditor getEditor() {
		return (XtextSiriusModelEditor) super.getEditor();
	}
}
