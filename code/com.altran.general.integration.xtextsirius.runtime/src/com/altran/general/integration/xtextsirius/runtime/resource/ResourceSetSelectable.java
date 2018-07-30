package com.altran.general.integration.xtextsirius.runtime.resource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;

import com.google.common.collect.Iterables;

public class ResourceSetSelectable implements ISelectable {
	private final Iterable<ISelectable> allResourceDescription;
	
	ResourceSetSelectable(final Iterable<ISelectable> allResourceDescription) {
		this.allResourceDescription = allResourceDescription;
	}
	
	@Override
	public boolean isEmpty() {
		for (final ISelectable description : this.allResourceDescription) {
			if (!description.isEmpty()) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public Iterable<IEObjectDescription> getExportedObjectsByType(final EClass type) {
		return Iterables.concat(Iterables.transform(this.allResourceDescription,
				from -> from.getExportedObjectsByType(type)));
	}
	
	@Override
	public Iterable<IEObjectDescription> getExportedObjectsByObject(final EObject object) {
		return Iterables.concat(Iterables.transform(this.allResourceDescription,
				from -> from.getExportedObjectsByObject(object)));
	}
	
	@Override
	public Iterable<IEObjectDescription> getExportedObjects(final EClass type, final QualifiedName name,
			final boolean ignoreCase) {
		return Iterables.concat(Iterables.transform(this.allResourceDescription,
				from -> from.getExportedObjects(type, name, ignoreCase)));
	}
	
	@Override
	public Iterable<IEObjectDescription> getExportedObjects() {
		return Iterables.concat(Iterables.transform(this.allResourceDescription,
				from -> from.getExportedObjects()));
	}
}