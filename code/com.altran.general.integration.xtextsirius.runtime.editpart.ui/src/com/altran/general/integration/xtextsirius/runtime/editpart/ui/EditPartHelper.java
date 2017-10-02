package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.SWT;

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

	public int translateToStyle(final boolean multiLine) {
		if (multiLine) {
			return SWT.MULTI | SWT.WRAP;
		} else {
			return SWT.SINGLE;
		}
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

}
