package com.altran.general.integration.xtextsirius.test.internal;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.util.SemanticElementLocation;
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
    final Event event = model.getEvents().get(1);
    final Guard guard = event.getGuard();
    final SemanticElementLocation location = new SemanticElementLocation(guard);
    Assert.assertSame(guard, location.resolve(model.eResource()));
  }
  
  @Test
  public void list_same() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(1);
    final SemanticElementLocation location = new SemanticElementLocation(event);
    Assert.assertSame(event, location.resolve(model.eResource()));
  }
  
  @Test
  public void single_other() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(1);
    final Guard guard = event.getGuard();
    final Statemachine modelClone = this.createFakeModel(model);
    final Event eventClone = modelClone.getEvents().get(1);
    final Guard guardClone = eventClone.getGuard();
    final SemanticElementLocation location = new SemanticElementLocation(guard);
    Assert.assertSame(guardClone, location.resolve(modelClone.eResource()));
  }
  
  @Test
  public void list_other() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(1);
    final Statemachine modelClone = this.createFakeModel(model);
    final Event eventClone = modelClone.getEvents().get(1);
    final SemanticElementLocation location = new SemanticElementLocation(event);
    Assert.assertSame(eventClone, location.resolve(modelClone.eResource()));
  }
  
  @Test
  public void single_rename() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(1);
    final Guard guard = event.getGuard();
    final Statemachine modelClone = this.createFakeModel(model);
    final Event eventClone = modelClone.getEvents().get(1);
    final Guard guardClone = eventClone.getGuard();
    eventClone.setName("someOtherName");
    final SemanticElementLocation location = new SemanticElementLocation(guard);
    Assert.assertSame(guardClone, location.resolve(modelClone.eResource()));
  }
  
  @Test
  public void list_rename() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(1);
    final Statemachine modelClone = this.createFakeModel(model);
    final Event eventClone = modelClone.getEvents().get(1);
    eventClone.setName("someOtherName");
    final SemanticElementLocation location = new SemanticElementLocation(event);
    Assert.assertSame(eventClone, location.resolve(modelClone.eResource()));
  }
}
