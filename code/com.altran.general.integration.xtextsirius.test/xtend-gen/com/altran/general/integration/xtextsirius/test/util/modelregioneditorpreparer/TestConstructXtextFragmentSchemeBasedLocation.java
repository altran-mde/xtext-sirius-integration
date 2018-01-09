package com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.test.util.modelregioneditorpreparer.AccessibleModelRegionEditorPreparer;
import com.altran.general.integration.xtextsirius.util.SemanticElementLocation;
import com.google.inject.Injector;
import java.lang.reflect.Field;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Guard;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestConstructXtextFragmentSchemeBasedLocation extends AModelRegionEditorPreparer {
  @Test
  public void singleChild() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(2);
    final Guard guard = event.getGuard();
    final URI orgUri = EcoreUtil.getURI(guard);
    Injector _injector = this.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _event_Guard = _statemachinePackage.getEvent_Guard();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(null, event, _injector, true, _emptyList, _event_Guard);
    final SemanticElementLocation location = preparer.constructXtextFragmentSchemeBasedLocation();
    String _fragment = orgUri.fragment();
    String _extractUriFragment = this.extractUriFragment(location);
    Assert.assertEquals(_fragment, _extractUriFragment);
  }
  
  @Test
  public void firstChild() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(0);
    final URI orgUri = EcoreUtil.getURI(event);
    Injector _injector = this.getInjector();
    List<String> _emptyList = CollectionLiterals.<String>emptyList();
    StatemachinePackage _statemachinePackage = AFowlerdslDefaultModelTest.statemachineFactory.getStatemachinePackage();
    EReference _statemachine_Events = _statemachinePackage.getStatemachine_Events();
    final AccessibleModelRegionEditorPreparer preparer = new AccessibleModelRegionEditorPreparer(null, model, _injector, true, _emptyList, _statemachine_Events);
    final SemanticElementLocation location = preparer.constructXtextFragmentSchemeBasedLocation();
    String _fragment = orgUri.fragment();
    String _extractUriFragment = this.extractUriFragment(location);
    Assert.assertEquals(_fragment, _extractUriFragment);
  }
  
  protected String extractUriFragment(final SemanticElementLocation location) {
    try {
      Class<? extends SemanticElementLocation> _class = location.getClass();
      final Field field = _class.getDeclaredField("uriFragment");
      field.setAccessible(true);
      Object _get = field.get(location);
      return ((String) _get);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
