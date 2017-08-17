package com.altran.general.integration.xtextsirius.editpart.internal.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

public interface IXtextAwareEditPartModel extends IXtextAwareEditPart {
	public @NonNull EObject getSemanticElement();
}
