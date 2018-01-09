package com.altran.general.integration.xtextsirius.test.util.ecollectionutil;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.AXtextTest;
import com.altran.general.integration.xtextsirius.util.ECollectionUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestUpdateOrAddLocal extends AFowlerdslDefaultModelTest {
  @Test
  public void update() {
    final Statemachine model = this.getDefaultModel();
    final Statemachine fakeModel = this.createFakeModel(model);
    EList<Event> _events = model.getEvents();
    final Event orgEvent = _events.get(3);
    EList<Event> _events_1 = fakeModel.getEvents();
    final Event fakeEvent = _events_1.get(3);
    final Constant fakeConst = AXtextTest.<Constant>findFirstTargetOfType(fakeEvent, Constant.class);
    EList<Event> _events_2 = model.getEvents();
    final int eventCount = _events_2.size();
    ECollectionUtil _instance = ECollectionUtil.getInstance();
    EList<Event> _events_3 = model.getEvents();
    final Event replacement = _instance.<Event>updateOrAddLocal(_events_3, fakeEvent);
    Assert.assertSame(orgEvent, replacement);
    EList<Event> _events_4 = model.getEvents();
    int _size = _events_4.size();
    Assert.assertEquals(eventCount, _size);
    EList<Event> _events_5 = model.getEvents();
    final Event replacedEvent = _events_5.get(3);
    final Constant replacedConst = AXtextTest.<Constant>findFirstTargetOfType(replacedEvent, Constant.class);
    Assert.assertSame(orgEvent, replacedEvent);
    Assert.assertNotSame(fakeEvent, replacedEvent);
    Assert.assertSame(fakeConst, replacedConst);
  }
  
  @Test
  public void add() {
    final Statemachine model = this.getDefaultModel();
    final Statemachine fakeModel = this.createFakeModel(model);
    EList<Event> _events = model.getEvents();
    final Event orgEvent = _events.get(3);
    EList<Event> _events_1 = fakeModel.getEvents();
    Event _get = _events_1.get(3);
    final Constant fakeConst = AXtextTest.<Constant>findFirstTargetOfType(_get, Constant.class);
    Event _createEvent = AFowlerdslDefaultModelTest.statemachineFactory.createEvent();
    final Procedure1<Event> _function = new Procedure1<Event>() {
      @Override
      public void apply(final Event it) {
        it.setName("fakeEvent");
        it.setCode(666);
        ValueGuard _createValueGuard = AFowlerdslDefaultModelTest.statemachineFactory.createValueGuard();
        final Procedure1<ValueGuard> _function = new Procedure1<ValueGuard>() {
          @Override
          public void apply(final ValueGuard it) {
            ConstantRef _createConstantRef = AFowlerdslDefaultModelTest.statemachineFactory.createConstantRef();
            final Procedure1<ConstantRef> _function = new Procedure1<ConstantRef>() {
              @Override
              public void apply(final ConstantRef it) {
                it.setConstant(fakeConst);
              }
            };
            ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function);
            it.setCond(_doubleArrow);
          }
        };
        ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function);
        it.setGuard(_doubleArrow);
      }
    };
    final Event fakeEvent = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    EList<Event> _events_2 = fakeModel.getEvents();
    _events_2.add(fakeEvent);
    EList<Event> _events_3 = model.getEvents();
    final int eventCount = _events_3.size();
    ECollectionUtil _instance = ECollectionUtil.getInstance();
    EList<Event> _events_4 = model.getEvents();
    final Event replacement = _instance.<Event>updateOrAddLocal(_events_4, fakeEvent);
    Assert.assertNull(replacement);
    EList<Event> _events_5 = model.getEvents();
    int _size = _events_5.size();
    Assert.assertNotEquals(eventCount, _size);
    EList<Event> _events_6 = model.getEvents();
    final Event replacedEvent = IterableExtensions.<Event>last(_events_6);
    final Constant replacedConst = AXtextTest.<Constant>findFirstTargetOfType(replacedEvent, Constant.class);
    Assert.assertNotSame(orgEvent, replacedEvent);
    Assert.assertSame(fakeEvent, replacedEvent);
    Assert.assertSame(fakeConst, replacedConst);
  }
}
