package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.yakindu.base.xtext.utils.gmf.directedit.XtextDirectEditManager;

import com.altran.general.integration.xtextsirius.runtime.editpart.ui.descriptor.AXtextSiriusDescriptor;

/**
 * We had to move some code here because we need to adhere to several lines of
 * inheritance
 * ({@link org.eclipse.gmf.runtime.diagram.ui.editparts.CompartmentEditPart} vs.
 * {@link org.eclipse.sirius.diagram.ui.internal.edit.parts.DEdgeNameEditPart}).
 *
 * @author nstotz
 *
 */
@SuppressWarnings("restriction")
public class EditPartHelper {
	private static EditPartHelper INSTANCE;

	public static EditPartHelper getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new EditPartHelper();
		}

		return INSTANCE;
	}

	protected EditPartHelper() {

	}

	public @NonNull EObject findClosestExistingSemanticElementRecursive(
			final @NonNull DSemanticDecorator decorator) {
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

	/**
	 * Copied from
	 * {@link org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart}
	 */
	public void performDirectEditRequest(final IXtextSiriusAwareLabelEditPart editPart, final Request request, AXtextSiriusDescriptor descriptor) {
		final XtextDirectEditManager manager = createXtextDirectEditManager(editPart, descriptor);
		final Request theRequest = request;
		try {
			editPart.getEditingDomain().runExclusive(new Runnable() {

				@Override
				public void run() {
					if (editPart.isActive()) {
						if (theRequest.getExtendedData()
								.get(RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR) instanceof Character) {
							final Character initialChar = (Character) theRequest.getExtendedData()
									.get(RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR);
							manager.show(initialChar);
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

	/**
	 * Copied from
	 * {@link org.yakindu.base.xtext.utils.gmf.directedit.XtextLabelEditPart}
	 */
	public DragTracker getDragTracker(final IXtextSiriusAwareLabelEditPart editPart, final Request request, AXtextSiriusDescriptor descriptor) {
		return new DragEditPartsTrackerEx(editPart) {
			@Override
			protected boolean isMove() {
				return true;
			}
			
			@Override
			protected boolean handleDoubleClick(final int button) {
				performDirectEditRequest(editPart, request, descriptor);
				return true;
			}
		};
	}

	private XtextDirectEditManager createXtextDirectEditManager(final IXtextSiriusAwareLabelEditPart editPart, AXtextSiriusDescriptor descriptor) {
		return descriptor.createDirectEditManager(editPart);
	}
}
