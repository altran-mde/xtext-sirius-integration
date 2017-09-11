package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.AFowlerdslTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.google.inject.Injector;
import java.util.List;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestPrepare extends AModelRegionEditorPreparer {
  @Test
  public void prepareOnlyOnce() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    Injector _injector = AFowlerdslTest.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    EReference _event_Guard = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard();
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = new AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer(null, event, _injector, true, _emptyList, _event_Guard);
    Assert.assertFalse(preparer.isPrepared());
    preparer.prepare();
    Assert.assertTrue(preparer.isPrepared());
  }
}
