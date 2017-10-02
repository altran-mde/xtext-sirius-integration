package com.altran.general.integration.xtextsirius.runtime.editpart.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.yakindu.base.xtext.utils.gmf.directedit.IXtextAwareEditPart;

public interface IXtextSiriusAwareLabelEditPart extends IXtextAwareEditPart {
	
	public @Nullable EObject getSemanticElement();
	
	public @NonNull EObject getClosestExistingSemanticElement();
	
}
