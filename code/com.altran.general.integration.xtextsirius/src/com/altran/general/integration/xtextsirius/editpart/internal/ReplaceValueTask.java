package com.altran.general.integration.xtextsirius.editpart.internal;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.business.api.helper.task.AbstractCommandTask;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.FeatureNotFoundException;
import org.eclipse.sirius.ecore.extender.business.api.accessor.exception.MetaClassNotFoundException;

import com.altran.general.integration.xtextsirius.util.ECollectionUtil;

@SuppressWarnings("restriction")
public class ReplaceValueTask extends AbstractCommandTask /*
															 * implements
															 * IModificationTask
															 */ {
	private final @NonNull ReplaceValueParameter parameter;

	public ReplaceValueTask(final @NonNull ReplaceValueParameter parameter) {
		this.parameter = parameter;
	}

	@Override
	public String getLabel() {
		return "Replace value";
	}

	@SuppressWarnings("unchecked")
	@Override
	public void execute() throws MetaClassNotFoundException, FeatureNotFoundException {
		final EObject elementToEdit = this.parameter.getElementToEdit();
		final EStructuralFeature feature = this.parameter.getFeature();
		final Object value = this.parameter.getValue();
		
		final boolean many = FeatureMapUtil.isMany(elementToEdit, feature);
		if (many) {
			@SuppressWarnings("rawtypes")
			final Collection collection = ((Collection) elementToEdit.eGet(feature));
			if (value instanceof List) {
				final List<?> values = (List<?>) value;
				collection.clear();
				collection.addAll(values);
			} else if (value instanceof EObject) {
				ECollectionUtil.replaceOrAddLocal(collection, (EObject) value);
			} else {
				collection.add(value);
			}
			return;
		} else {
			elementToEdit.eSet(feature, value);
		}
	}
	//
	// @Override
	// public Collection<EObject> getAffectedElements() {
	// return Collections.singletonList(this.parameter.getElementToEdit());
	// }
	//
	// @Override
	// public Collection<EObject> getCreatedReferences() {
	// return Collections.emptyList();
	// }
}