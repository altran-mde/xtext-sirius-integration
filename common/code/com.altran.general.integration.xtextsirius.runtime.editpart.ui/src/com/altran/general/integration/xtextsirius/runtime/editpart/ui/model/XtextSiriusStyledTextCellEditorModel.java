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
import com.altran.general.integration.xtextsirius.util.FakeResourceUtil;
import com.altran.general.integration.xtextsirius.util.ModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.util.SemanticElementLocation;

public class XtextSiriusStyledTextCellEditorModel extends AXtextSiriusStyledTextCellEditor {
	private SemanticElementLocation semanticElementLocation;
	
	public XtextSiriusStyledTextCellEditorModel(final @NonNull XtextSiriusModelDescriptor descriptor) {
		super(descriptor);
	}
	
	@Override
	protected void doSetValue(final Object value) {
		final EObject semanticElement = getSemanticElement();

		if (semanticElement == null) {
			return;
		}

		final ModelRegionEditorPreparer preparer = new ModelRegionEditorPreparer(semanticElement, getInjector(),
				isMultiLine(), getDescriptor().getEditableFeatures());

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
	}
	
	protected @Nullable SemanticElementLocation getSemanticElementLocation() {
		return this.semanticElementLocation;
	}

	@Override
	public @Nullable Object getValueToCommit() {
		final SemanticElementLocation location = getSemanticElementLocation();
		if (location != null) {
			final IParseResult parseResult = getXtextAdapter().getXtextParseResult();
			final EObject element = location.resolve(parseResult.getRootASTElement().eResource());
			if (element != null) {
				return FakeResourceUtil.getInstance().proxify(element, EcoreUtil.getURI(getSemanticElement()));
			}
		}
		
		return null;
	}

	@Override
	public @NonNull XtextSiriusModelDescriptor getDescriptor() {
		return (@NonNull XtextSiriusModelDescriptor) super.getDescriptor();
	}
}
