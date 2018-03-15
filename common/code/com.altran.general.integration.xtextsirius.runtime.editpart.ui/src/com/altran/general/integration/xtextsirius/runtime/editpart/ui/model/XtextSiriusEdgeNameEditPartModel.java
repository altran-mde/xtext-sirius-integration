package com.altran.general.integration.xtextsirius.runtime.editpart.ui.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;
import org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeNameEditPart;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextDirectEditManager;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.EditPartHelper;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.XtextSiriusDirectEditPolicy;
import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.XtextSiriusModelDescriptor;

@SuppressWarnings("restriction")
public class XtextSiriusEdgeNameEditPartModel extends DEdgeNameEditPart implements IXtextSiriusEditPartModel {
	
	private final @NonNull XtextSiriusModelDescriptor descriptor;
	
	public XtextSiriusEdgeNameEditPartModel(
			final @NonNull XtextSiriusModelDescriptor descriptor,
			final @NonNull View view) {
		super(view);
		this.descriptor = descriptor;
	}
	
	/**
	 * This value should never be used. Instead, use
	 * {@link #getSemanticElement()}.
	 */
	@Override
	public String getEditText() {
		return "";
	}

	/**
	 * Copied from
	 * {@link org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart}
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
	
	/**
	 * Copied from
	 * {@link org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart}
	 */
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
								.get(RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR) instanceof Character) {
							final Character initialChar = (Character) theRequest.getExtendedData()
									.get(RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR);
							if (manager instanceof XtextDirectEditManager) {
								final XtextDirectEditManager xtextDirectEditManager = (XtextDirectEditManager) manager;
								xtextDirectEditManager.show(initialChar);
							} else if (manager instanceof TextDirectEditManager) {
								((TextDirectEditManager) manager).show(initialChar);
							}
						} else {
							manager.show();
						}
					}
				}
			});
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	protected @NonNull DirectEditManager createDirectEditManager() {
		return new XtextSiriusDirectEditManagerModel(this, getDescriptor(),
				translateToStyle());
	}
	
	protected int translateToStyle() {
		return EditPartHelper.getInstance().translateToStyle(getDescriptor().isMultiLine());
	}
	
	@Override
	public DSemanticDecorator resolveSemanticElement() {
		return (DSemanticDecorator) super.resolveSemanticElement();
	}
	
	@Override
	public @Nullable EObject getSemanticElement() {
		return resolveSemanticElement().getTarget();
	}

	@Override
	public @NonNull EObject getClosestExistingSemanticElement() {
		return EditPartHelper.getInstance().findClosestExistingSemanticElementRecursive(resolveSemanticElement());
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new XtextSiriusDirectEditPolicy());
	}
	
	@Override
	public @NonNull XtextSiriusModelDescriptor getDescriptor() {
		return this.descriptor;
	}
}
