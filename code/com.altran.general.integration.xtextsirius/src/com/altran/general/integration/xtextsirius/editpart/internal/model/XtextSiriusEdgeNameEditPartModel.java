package com.altran.general.integration.xtextsirius.editpart.internal.model;

import static org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;
import org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeNameEditPart;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.SWT;
import org.eclipse.xtext.serializer.ISerializer;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextDirectEditManager;
import org.yakindu.base.xtext.utils.jface.viewers.XtextStyledTextCellEditor;

import com.altran.general.integration.xtextsirius.editpart.internal.AEditPartDescriptor;
import com.altran.general.integration.xtextsirius.editpart.internal.IXtextSiriusAwareLabelEditPart;
import com.altran.general.integration.xtextsirius.editpart.internal.XtextSiriusDirectEditPolicy;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class XtextSiriusEdgeNameEditPartModel extends DEdgeNameEditPart implements IXtextSiriusAwareLabelEditPart {
	
	private final Injector injector;
	private final boolean multiLine;
	
	public XtextSiriusEdgeNameEditPartModel(final @NonNull AEditPartDescriptor descriptor, final View view) {
		super(view);
		this.injector = descriptor.getConfig().getInjector();
		this.multiLine = descriptor.isMultiLine();
	}
	
	@Override
	public String getEditText() {
		final ISerializer serializer = getInjector().getInstance(ISerializer.class);
		final String text = serializer.serialize(getSemanticElement());
		return StringUtils.normalizeSpace(text);
	}

	@Override
	public String getLabelText() {
		final String labelText = super.getLabelText();
		return labelText;
	}

	// @Override
	// public void setLabelText(final String arg0) {
	// // TODO Auto-generated method stub
	//
	// }
	//
	/**
	 * Performs direct edit on double click
	 */
	@Override
	public DragTracker getDragTracker(final Request request) {
		return new DragEditPartsTrackerEx(this) {
			@Override
			protected boolean isMove() {
				return true;
			}
			
			@Override
			protected boolean handleDoubleClick(final int button) {
				performDirectEditRequest(request);
				return true;
			}
		};
	}
	
	@Override
	public void performDirectEditRequest(final Request request) {
		final DirectEditManager manager = createDirectEditManager();
		final Request theRequest = request;
		try {
			getEditingDomain().runExclusive(new Runnable() {
				
				@Override
				public void run() {
					if (isActive()) {
						if (theRequest.getExtendedData()
								.get(REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR) instanceof Character) {
							final Character initialChar = (Character) theRequest.getExtendedData()
									.get(REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR);
							if (manager instanceof XtextDirectEditManager) {
								final XtextDirectEditManager xtextDirectEditManager = (XtextDirectEditManager) manager;
								xtextDirectEditManager.show(initialChar);
							} else if (manager instanceof TextDirectEditManager) {
								((TextDirectEditManager) manager).show(initialChar);
							}
						} else {
							manager.show();
						}
						if (manager instanceof XtextDirectEditManager) {
							final XtextSiriusDirectEditManagerModel xtextDirectEditManager = (XtextSiriusDirectEditManagerModel) manager;
							final XtextStyledTextCellEditor cellEditor = (XtextStyledTextCellEditor) xtextDirectEditManager
									.getCellEditor();
							setContext(cellEditor.getXtextAdapter().getFakeResourceContext().getFakeResource());
						}
					}
				}
			});
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	protected @NonNull DirectEditManager createDirectEditManager() {
		return new XtextSiriusDirectEditManagerModel(this, getInjector(),
				translateToStyle(), isMultiLine());
	}
	
	protected void setContext(final Resource res) {
		// TODO Auto-generated method stub

	}
	
	protected int translateToStyle() {
		if (isMultiLine()) {
			return SWT.MULTI | SWT.WRAP;
		} else {
			return SWT.SINGLE;
		}
	}
	
	protected Injector getInjector() {
		return this.injector;
	}

	protected boolean isMultiLine() {
		return this.multiLine;
	}

	@Override
	public @Nullable EObject getSemanticElement() {
		return ((DSemanticDecorator) resolveSemanticElement()).getTarget();
	}

	@Override
	public @NonNull EObject getClosestExistingSemanticElement() {
		final EObject decorator = resolveSemanticElement();
		return findClosestExistingSemanticElementRecursive((DSemanticDecorator) decorator);
	}

	protected @NonNull EObject findClosestExistingSemanticElementRecursive(final DSemanticDecorator decorator) {
		final EObject target = decorator.getTarget();
		if (target != null) {
			return target;
		}
		
		final EObject eContainer = decorator.eContainer();
		if (eContainer instanceof DSemanticDecorator) {
			return findClosestExistingSemanticElementRecursive((DSemanticDecorator) eContainer);
		} else {
			throw new RuntimeException("cannot find any semantic element");
		}
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new XtextSiriusDirectEditPolicy());
	}
}
