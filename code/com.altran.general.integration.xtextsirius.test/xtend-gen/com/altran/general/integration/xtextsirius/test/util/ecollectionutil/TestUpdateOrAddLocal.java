package com.altran.general.integration.xtextsirius.test.util.ecollectionutil;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.AFowlerdslTest;
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
    final Statemachine fakeModel = AFowlerdslTest.createFakeModel(model);
    final Event orgEvent = model.getEvents().get(3);
    final Event fakeEvent = fakeModel.getEvents().get(3);
    final Constant fakeConst = AFowlerdslTest.<Constant>findFirstTargetOfType(fakeEvent, Constant.class);
    final int eventCount = model.getEvents().size();
    final Event replacement = ECollectionUtil.getInstance().<Event>updateOrAddLocal(model.getEvents(), fakeEvent);
    Assert.assertSame(orgEvent, replacement);
    Assert.assertEquals(eventCount, model.getEvents().size());
    final Event replacedEvent = model.getEvents().get(3);
    final Constant replacedConst = AFowlerdslTest.<Constant>findFirstTargetOfType(replacedEvent, Constant.class);
    Assert.assertSame(orgEvent, replacedEvent);
    Assert.assertNotSame(fakeEvent, replacedEvent);
    Assert.assertSame(fakeConst, replacedConst);
  }
  
  @Test
  public void add() {
    final Statemachine model = this.getDefaultModel();
    final Statemachine fakeModel = AFowlerdslTest.createFakeModel(model);
    final Event orgEvent = model.getEvents().get(3);
    final Constant fakeConst = AFowlerdslTest.<Constant>findFirstTargetOfType(fakeModel.getEvents().get(3), Constant.class);
    Event _createEvent = AFowlerdslDefaultModelTest.statemachineFactory.createEvent();
    final Procedure1<Event> _function = (Event it) -> {
      it.setName("fakeEvent");
      it.setCode(666);
      ValueGuard _createValueGuard = AFowlerdslDefaultModelTest.statemachineFactory.createValueGuard();
      final Procedure1<ValueGuard> _function_1 = (ValueGuard it_1) -> {
        ConstantRef _createConstantRef = AFowlerdslDefaultModelTest.statemachineFactory.createConstantRef();
        final Procedure1<ConstantRef> _function_2 = (ConstantRef it_2) -> {
          it_2.setConstant(fakeConst);
        };
        ConstantRef _doubleArrow = ObjectExtensions.<ConstantRef>operator_doubleArrow(_createConstantRef, _function_2);
        it_1.setCond(_doubleArrow);
      };
      ValueGuard _doubleArrow = ObjectExtensions.<ValueGuard>operator_doubleArrow(_createValueGuard, _function_1);
      it.setGuard(_doubleArrow);
    };
    final Event fakeEvent = ObjectExtensions.<Event>operator_doubleArrow(_createEvent, _function);
    EList<Event> _events = fakeModel.getEvents();
    _events.add(fakeEvent);
    final int eventCount = model.getEvents().size();
    final Event replacement = ECollectionUtil.getInstance().<Event>updateOrAddLocal(model.getEvents(), fakeEvent);
    Assert.assertNull(replacement);
    Assert.assertNotEquals(eventCount, model.getEvents().size());
    final Event replacedEvent = IterableExtensions.<Event>last(model.getEvents());
    final Constant replacedConst = AFowlerdslTest.<Constant>findFirstTargetOfType(replacedEvent, Constant.class);
    Assert.assertNotSame(orgEvent, replacedEvent);
    Assert.assertSame(fakeEvent, replacedEvent);
    Assert.assertSame(fakeConst, replacedConst);
  }
}
