package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.formatting2.regionaccess.internal.AbstractSemanticRegionsFinder;
import org.junit.Assert;
import org.junit.Test;

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
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    final EAttribute feature = _statemachinePackage.getEvent_Code();
    TestCanBeHandledByGetRegionForFeature.TestSemanticRegionsFinder _testSemanticRegionsFinder = new TestCanBeHandledByGetRegionForFeature.TestSemanticRegionsFinder();
    _testSemanticRegionsFinder.assertNoContainment(feature);
    AccessibleModelRegionEditorPreparer _fakePreparer = this.getFakePreparer();
    boolean _canBeHandledByGetRegionForFeature = _fakePreparer.canBeHandledByGetRegionForFeature(feature);
    Assert.assertTrue(_canBeHandledByGetRegionForFeature);
  }
  
  @Test
  public void eReferenceNoContainment() {
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    final EReference feature = _statemachinePackage.getConstantRef_Constant();
    TestCanBeHandledByGetRegionForFeature.TestSemanticRegionsFinder _testSemanticRegionsFinder = new TestCanBeHandledByGetRegionForFeature.TestSemanticRegionsFinder();
    _testSemanticRegionsFinder.assertNoContainment(feature);
    AccessibleModelRegionEditorPreparer _fakePreparer = this.getFakePreparer();
    boolean _canBeHandledByGetRegionForFeature = _fakePreparer.canBeHandledByGetRegionForFeature(feature);
    Assert.assertTrue(_canBeHandledByGetRegionForFeature);
  }
  
  @Test(expected = IllegalStateException.class)
  public void eReferenceContainment() {
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    final EReference feature = _statemachinePackage.getEvent_Guard();
    AccessibleModelRegionEditorPreparer _fakePreparer = this.getFakePreparer();
    boolean _canBeHandledByGetRegionForFeature = _fakePreparer.canBeHandledByGetRegionForFeature(feature);
    Assert.assertFalse(_canBeHandledByGetRegionForFeature);
    TestCanBeHandledByGetRegionForFeature.TestSemanticRegionsFinder _testSemanticRegionsFinder = new TestCanBeHandledByGetRegionForFeature.TestSemanticRegionsFinder();
    _testSemanticRegionsFinder.assertNoContainment(feature);
  }
}
