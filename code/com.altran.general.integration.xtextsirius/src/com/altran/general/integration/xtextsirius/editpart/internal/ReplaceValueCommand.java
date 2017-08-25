package com.altran.general.integration.xtextsirius.editpart.internal;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import com.altran.general.integration.xtextsirius.util.ECollectionUtil;

public class ReplaceValueCommand extends SetValueCommand {
	private final EStructuralFeature feature;
	private final Object value;

	public ReplaceValueCommand(final SetRequest request) {
		super(request);
		this.feature = request.getFeature();
		this.value = request.getValue();
	}

	@Override
	protected CommandResult doExecuteWithResult(final IProgressMonitor monitor, final IAdaptable info)
			throws ExecutionException {
		if (this.value instanceof EObject) {
			final EObject elementToEdit = getElementToEdit();
			final boolean many = FeatureMapUtil.isMany(elementToEdit, this.feature);
			if (many) {
				final Collection collection = ((Collection) elementToEdit.eGet(this.feature));
				if (this.value instanceof List) {
					final List values = (List) this.value;
					collection.clear();
					collection.addAll(values);
				} else {
					ECollectionUtil.replaceOrAddLocal(collection, (EObject) this.value);
				}
			} else {
				getElementToEdit().eSet(this.feature, this.value);
			}
			return CommandResult.newOKCommandResult();
		}

		return super.doExecuteWithResult(monitor, info);

	}
}