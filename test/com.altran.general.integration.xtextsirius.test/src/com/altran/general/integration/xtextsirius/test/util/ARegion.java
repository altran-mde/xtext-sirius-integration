package com.altran.general.integration.xtextsirius.test.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.serializer.impl.Serializer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;

public abstract class ARegion extends AFowlerdslDefaultModelTest {
	protected ITextRegionAccess getRootRegion(final EObject obj) {
		return ((Serializer) getInjector().getInstance(ISerializer.class))
				.serializeToRegions(EcoreUtil.getRootContainer(obj));
	}
	
	protected StringBuffer getAllText(final ITextRegionAccess rootRegion) {
		return new StringBuffer(rootRegion.regionForDocument().getText());
	}
	
}
