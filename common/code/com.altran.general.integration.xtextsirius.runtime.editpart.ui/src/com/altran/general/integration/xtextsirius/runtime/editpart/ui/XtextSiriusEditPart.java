package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.swt.custom.StyleRange;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.AXtextSiriusDescriptor;

public class XtextSiriusEditPart extends XtextLabelEditPart implements IXtextSiriusAwareLabelEditPart {
	private IParser parser;
	private @NonNull AXtextSiriusDescriptor descriptor;
	
	public XtextSiriusEditPart(final @NonNull AXtextSiriusDescriptor descriptor, final @NonNull View view) {
		super(view);
		this.descriptor = descriptor;
	}

	@Override
	public String getEditText() {
		return EditPartHelper.getInstance().getEditText(this);
	}

	@Override
	public DragTracker getDragTracker(final Request request) {
		return EditPartHelper.getInstance().getDragTracker(this, request, getDescriptor());
	}

	@Override
	public void performDirectEditRequest(final Request request) {
		EditPartHelper.getInstance().performDirectEditRequest(this, request, getDescriptor());
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		EditPartHelper.getInstance().createDefaultEditPolicies(this);
	}

	@Override
	public @NonNull AXtextSiriusDescriptor getDescriptor() {
		return this.descriptor;
	}
	
//	@Override
//	public @Nullable EObject getSemanticElement() {
//		return EditPartHelper.getInstance().getSemanticElement(this);
//	}
//
//	@Override
//	public @NonNull EObject getClosestExistingSemanticElement() {
//		return EditPartHelper.getInstance().findClosestExistingSemanticElementRecursive(resolveSemanticElement());
//	}

	@Override
	protected void handleNotificationEvent(final Notification notification) {
		if (notification.getFeature().equals(ViewpointPackage.eINSTANCE.getDRepresentationElement_Name())) {
			updateLabelText();
		}
		super.handleNotificationEvent(notification);
	}
	
	@Override
	protected void setContext(final Resource arg0) {
		// we don't use this API
	}

	@Override
	protected DirectEditManager createDirectEditManager() {
		return getDescriptor().createDirectEditManager(this);
	}
	
	@Override
	protected void updateLabelText() {
		getFigure().setText(getLabelText());
	}
	
	@Override
	protected void setLabelStyles() {
		getFigure().setRanges(new StyleRange[] {});
	}
	
	@SuppressWarnings("restriction")
	protected IParser getParser() {
		if (this.parser == null) {
			final String parserHint = ((View) getModel()).getType();
			final IAdaptable hintAdapter = new org.eclipse.sirius.diagram.ui.internal.providers.SiriusParserProvider.HintAdapter(
					getParserElementType(),
					getParserElement(), parserHint);
			this.parser = ParserService.getInstance().getParser(hintAdapter);
		}
		return this.parser;
	}
	
	@SuppressWarnings("restriction")
	protected IElementType getParserElementType() {
		return org.eclipse.sirius.diagram.ui.internal.providers.SiriusElementTypes.DNodeListElement_3010;
	}
	
	protected EObject getParserElement() {
		return resolveSemanticElement();
	}
	
	protected String getLabelText() {
		final EObject element = resolveSemanticElement();
		if (element != null) {
			if (getParser() != null) {
				return getParser().getPrintString(new EObjectAdapter(element), ParserOptions.NONE.intValue());
			}
		}

		return null;
	}
}
