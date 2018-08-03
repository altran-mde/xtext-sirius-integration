package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import org.eclipse.xtext.formatting2.regionaccess.ITextRegionAccess;
import org.eclipse.xtext.util.TextRegion;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.ARegion;

@SuppressWarnings({ "restriction" })
public abstract class AModelRegionEditorPreparer extends ARegion {
	protected AccessibleModelRegionEditorPreparer getFakePreparer() {
		return new AccessibleModelRegionEditorPreparer(getInjector(),
				AFowlerdslDefaultModelTest.statemachineFactory.createEvent());
	}
	
	protected String resolveRegion(final ITextRegionAccess rootRegion, final TextRegion region) {
		return rootRegion.regionForDocument().getText().substring(region.getOffset(),
				region.getOffset() + region.getLength());
	}
}
