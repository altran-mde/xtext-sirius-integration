package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import com.google.inject.Injector;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestPrepare extends AModelRegionEditorPreparer {
  @Test
  public void prepareOnlyOnce() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(0);
    Injector _injector = this.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _event_Guard = _statemachinePackage.getEvent_Guard();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(null, event, _injector, true, _emptyList, _event_Guard);
    boolean _isPrepared = preparer.isPrepared();
    Assert.assertFalse(_isPrepared);
    preparer.prepare();
    boolean _isPrepared_1 = preparer.isPrepared();
    Assert.assertTrue(_isPrepared_1);
  }
}
