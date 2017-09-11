package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.internal.SemanticElementLocation;
import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.AFowlerdslTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.google.inject.Injector;
import java.lang.reflect.Field;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Guard;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestConstructXtextFragmentSchemeBasedLocation extends AModelRegionEditorPreparer {
  @Test
  public void singleChild() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(2);
    final Guard guard = event.getGuard();
    final URI orgUri = EcoreUtil.getURI(guard);
    Injector _injector = AFowlerdslTest.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    EReference _event_Guard = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getEvent_Guard();
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = new AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer(null, event, _injector, true, _emptyList, _event_Guard);
    final SemanticElementLocation location = preparer.constructXtextFragmentSchemeBasedLocation();
    Assert.assertEquals(orgUri.fragment(), this.extractUriFragment(location));
  }
  
  @Test
  public void firstChild() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    final URI orgUri = EcoreUtil.getURI(event);
    Injector _injector = AFowlerdslTest.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    EReference _statemachine_Events = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage().getStatemachine_Events();
    final AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer preparer = new AModelRegionEditorPreparer.AccessibleModelRegionEditorPreparer(null, model, _injector, true, _emptyList, _statemachine_Events);
    final SemanticElementLocation location = preparer.constructXtextFragmentSchemeBasedLocation();
    Assert.assertEquals(orgUri.fragment(), this.extractUriFragment(location));
  }
  
  protected String extractUriFragment(final SemanticElementLocation location) {
    try {
      final Field field = location.getClass().getDeclaredField("uriFragment");
      field.setAccessible(true);
      Object _get = field.get(location);
      return ((String) _get);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
