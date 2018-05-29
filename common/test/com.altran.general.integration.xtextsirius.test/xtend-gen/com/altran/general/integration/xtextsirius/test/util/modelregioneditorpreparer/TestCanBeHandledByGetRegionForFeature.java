package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.internal.AbstractSemanticRegionsFinder;
import org.junit.Assert;
import org.junit.Test;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;

@SuppressWarnings("all")
public class TestCanBeHandledByGetRegionForFeature extends AModelRegionEditorPreparer {
	protected static class TestSemanticRegionsFinder extends AbstractSemanticRegionsFinder {
		@Override
		protected ImmutableList<ISemanticRegion> findAll(final Predicate<ISemanticRegion> predicate) {
			throw new UnsupportedOperationException("TODO: auto-generated method stub");
		}
		
		@Override
		protected ISemanticRegion findFirst(final Predicate<ISemanticRegion> predicate) {
			throw new UnsupportedOperationException("TODO: auto-generated method stub");
		}
		
		@Override
		public void assertNoContainment(final EStructuralFeature feat) {
			super.assertNoContainment(feat);
		}
	}
	
	@Test
	public void eAttribute() {
		final EAttribute feature = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage()
				.getEvent_Code();
		new TestCanBeHandledByGetRegionForFeature.TestSemanticRegionsFinder().assertNoContainment(feature);
		Assert.assertTrue(getFakePreparer().canBeHandledByGetRegionForFeature(feature));
	}
	
	@Test
	public void eReferenceNoContainment() {
		final EReference feature = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage()
				.getConstantRef_Constant();
		new TestCanBeHandledByGetRegionForFeature.TestSemanticRegionsFinder().assertNoContainment(feature);
		Assert.assertTrue(getFakePreparer().canBeHandledByGetRegionForFeature(feature));
	}
	
	@Test(expected = IllegalStateException.class)
	public void eReferenceContainment() {
		final EReference feature = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage()
				.getEvent_Guard();
		Assert.assertFalse(getFakePreparer().canBeHandledByGetRegionForFeature(feature));
		new TestCanBeHandledByGetRegionForFeature.TestSemanticRegionsFinder().assertNoContainment(feature);
	}
}
