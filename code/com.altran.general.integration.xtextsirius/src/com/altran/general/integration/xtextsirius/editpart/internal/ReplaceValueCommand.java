package com.altran.general.integration.xtextsirius.editpart.internal;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DView;

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


			final Session session = SessionManager.INSTANCE.getSession(elementToEdit);
			final TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
			final CommandStack stack = domain.getCommandStack();
			for (final DView view : session.getOwnedViews()) {
				final org.eclipse.emf.common.command.Command cmd = new RefreshRepresentationsCommand(domain, null,
						view.getOwnedRepresentationDescriptors().stream()
								.map(d -> d.getRepresentation())
								.collect(Collectors.toList()));
				domain.getCommandStack().execute(cmd);
			}

			return CommandResult.newOKCommandResult();
		}

		return super.doExecuteWithResult(monitor, info);

	}
}