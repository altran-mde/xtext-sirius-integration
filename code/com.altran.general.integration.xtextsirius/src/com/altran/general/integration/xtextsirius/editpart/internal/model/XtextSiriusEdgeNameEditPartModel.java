package com.altran.general.integration.xtextsirius.editpart.internal.model;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
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
import org.yakindu.base.xtext.utils.jface.viewers.XtextStyledTextCellEditor;

import com.altran.general.integration.xtextsirius.editpart.internal.EditPartHelper;
import com.altran.general.integration.xtextsirius.editpart.internal.XtextSiriusDirectEditPolicy;
import com.google.inject.Injector;

@SuppressWarnings("restriction")
public class XtextSiriusEdgeNameEditPartModel extends DEdgeNameEditPart implements IXtextSiriusEditPartModel {
	
	private final Injector injector;
	private final boolean multiLine;
	private final Collection<@NonNull String> editableFeatures;
	
	public XtextSiriusEdgeNameEditPartModel(
			final @NonNull EditPartDescriptorModel descriptor,
			final @NonNull View view) {
		super(view);
		this.injector = descriptor.getConfig().getInjector();
		this.multiLine = descriptor.isMultiLine();
		this.editableFeatures = descriptor.getEditableFeatures();
	}
	
	/**
	 * This value should never be used. Instead, use
	 * {@link #getSemanticElement()}.
	 */
	@Override
	public String getEditText() {
		return "";
	}

	@Override
	public String getLabelText() {
		final String labelText = super.getLabelText();
		return labelText;
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
						if (manager instanceof XtextDirectEditManager) {
							final XtextSiriusDirectEditManagerModel xtextDirectEditManager = (XtextSiriusDirectEditManagerModel) manager;
							final XtextStyledTextCellEditor cellEditor = xtextDirectEditManager.getCellEditor();
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
				translateToStyle(), isMultiLine(), getEditableFeatures());
	}
	
	protected void setContext(final Resource res) {
		// TODO Auto-generated method stub

	}
	
	protected int translateToStyle() {
		return EditPartHelper.translateToStyle(isMultiLine());
	}
	
	protected Injector getInjector() {
		return this.injector;
	}

	protected boolean isMultiLine() {
		return this.multiLine;
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
		return EditPartHelper.findClosestExistingSemanticElementRecursive(resolveSemanticElement());
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new XtextSiriusDirectEditPolicy());
	}
	
	@Override
	public @NonNull Collection<@NonNull String> getEditableFeatures() {
		return this.editableFeatures;
	}
}
