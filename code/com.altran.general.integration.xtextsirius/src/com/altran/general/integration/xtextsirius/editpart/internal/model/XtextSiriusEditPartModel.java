package com.altran.general.integration.xtextsirius.editpart.internal.model;

import java.util.Collection;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;

import com.altran.general.integration.xtextsirius.editpart.internal.AXtextSiriusEditPart;

public class XtextSiriusEditPartModel extends AXtextSiriusEditPart implements IXtextSiriusEditPartModel {
	private final Collection<@NonNull String> editableFeatures;
	private IParser parser;

	public XtextSiriusEditPartModel(final @NonNull EditPartDescriptorModel descriptor, final @NonNull View view) {
		super(descriptor, view);
		this.editableFeatures = descriptor.getEditableFeatures();
	}

	/**
	 * This value should never be used. Instead, use
	 * {@link #getSemanticElement()}.
	 */
	@Override
	public @NonNull String getEditText() {
		return "";
	}

	@Override
	protected void updateLabelText() {
		getFigure().setText(getLabelText());
		;
	}
	
	/*
	 * Stolen from org.eclipse.sirius.diagram.ui.internal.edit.parts.
	 * DNodeListElementEditPart
	 */
	@SuppressWarnings("restriction")
	public IParser getParser() {
		if (this.parser == null) {
			final String parserHint = ((View) getModel()).getType();
			final IAdaptable hintAdapter = new org.eclipse.sirius.diagram.ui.internal.providers.SiriusParserProvider.HintAdapter(
					getParserElementType(),
					getParserElement(), parserHint);
			this.parser = ParserService.getInstance().getParser(hintAdapter);
		}
		return this.parser;
	}

	/*
	 * Stolen from org.eclipse.sirius.diagram.ui.internal.edit.parts.
	 * DNodeListElementEditPart
	 */
	@SuppressWarnings("restriction")
	protected IElementType getParserElementType() {
		return org.eclipse.sirius.diagram.ui.internal.providers.SiriusElementTypes.DNodeListElement_3010;
	}

	/*
	 * Stolen from org.eclipse.sirius.diagram.ui.internal.edit.parts.
	 * DNodeListElementEditPart
	 */
	protected EObject getParserElement() {
		return resolveSemanticElement();
	}

	/*
	 * Stolen from org.eclipse.sirius.diagram.ui.internal.edit.parts.
	 * DNodeListElementEditPart
	 */
	protected String getLabelText() {
		final EObject element = resolveSemanticElement();
		if (element != null) {
			if (getParser() != null) {
				return getParser().getPrintString(new EObjectAdapter(element), ParserOptions.NONE.intValue());
			}
		}

		return null;
	}
	
	
	@Override
	protected @NonNull DirectEditManager createDirectEditManager() {
		return new XtextSiriusDirectEditManagerModel(this, getInjector(),
				translateToStyle(), isMultiLine(), getEditableFeatures());
	}

	@Override
	protected void setContext(final Resource res) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public @NonNull Collection<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}
}
