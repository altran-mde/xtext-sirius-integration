package com.altran.general.integration.xtextsirius.test.internal;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.util.SemanticElementLocation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Guard;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestSemanticElementLocation extends AFowlerdslDefaultModelTest {
  @Test
  public void single_same() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(1);
    final Guard guard = event.getGuard();
    final SemanticElementLocation location = new SemanticElementLocation(guard);
    Resource _eResource = model.eResource();
    EObject _resolve = location.resolve(_eResource);
    Assert.assertSame(guard, _resolve);
  }
  
  @Test
  public void list_same() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(1);
    final SemanticElementLocation location = new SemanticElementLocation(event);
    Resource _eResource = model.eResource();
    EObject _resolve = location.resolve(_eResource);
    Assert.assertSame(event, _resolve);
  }
  
  @Test
  public void single_other() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(1);
    final Guard guard = event.getGuard();
    final Statemachine modelClone = this.createFakeModel(model);
    EList<Event> _events_1 = modelClone.getEvents();
    final Event eventClone = _events_1.get(1);
    final Guard guardClone = eventClone.getGuard();
    final SemanticElementLocation location = new SemanticElementLocation(guard);
    Resource _eResource = modelClone.eResource();
    EObject _resolve = location.resolve(_eResource);
    Assert.assertSame(guardClone, _resolve);
  }
  
  @Test
  public void list_other() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(1);
    final Statemachine modelClone = this.createFakeModel(model);
    EList<Event> _events_1 = modelClone.getEvents();
    final Event eventClone = _events_1.get(1);
    final SemanticElementLocation location = new SemanticElementLocation(event);
    Resource _eResource = modelClone.eResource();
    EObject _resolve = location.resolve(_eResource);
    Assert.assertSame(eventClone, _resolve);
  }
  
  @Test
  public void single_rename() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(1);
    final Guard guard = event.getGuard();
    final Statemachine modelClone = this.createFakeModel(model);
    EList<Event> _events_1 = modelClone.getEvents();
    final Event eventClone = _events_1.get(1);
    final Guard guardClone = eventClone.getGuard();
    eventClone.setName("someOtherName");
    final SemanticElementLocation location = new SemanticElementLocation(guard);
    Resource _eResource = modelClone.eResource();
    EObject _resolve = location.resolve(_eResource);
    Assert.assertSame(guardClone, _resolve);
  }
  
  @Test
  public void list_rename() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event = _events.get(1);
    final Statemachine modelClone = this.createFakeModel(model);
    EList<Event> _events_1 = modelClone.getEvents();
    final Event eventClone = _events_1.get(1);
    eventClone.setName("someOtherName");
    final SemanticElementLocation location = new SemanticElementLocation(event);
    Resource _eResource = modelClone.eResource();
    EObject _resolve = location.resolve(_eResource);
    Assert.assertSame(eventClone, _resolve);
  }
}
