package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import com.altran.general.integration.xtextsirius.test.util.fakeresourceutil.ATestFakeResourceUtil;
import com.altran.general.integration.xtextsirius.util.FakeResourceUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Guard;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Transition;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Value;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ValueGuard;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestProxify extends ATestFakeResourceUtil {
  @Test
  public void proxify() {
    final Statemachine model = this.getDefaultModel();
    final Statemachine fakeModel = this.createFakeModel(model);
    Resource _eResource = model.eResource();
    final URI orgUri = _eResource.getURI();
    FakeResourceUtil _instance = FakeResourceUtil.getInstance();
    Resource _eResource_1 = fakeModel.eResource();
    _instance.updateFakeResourceUri(_eResource_1, orgUri);
    EList<Event> _events = fakeModel.getEvents();
    final Event fakeEvent = _events.get(2);
    FakeResourceUtil _instance_1 = FakeResourceUtil.getInstance();
    final Event proxified = _instance_1.<Event>proxify(fakeEvent, orgUri);
    Assert.assertSame(fakeEvent, proxified);
    boolean _eIsProxy = proxified.eIsProxy();
    Assert.assertFalse(_eIsProxy);
    Guard _guard = proxified.getGuard();
    final ValueGuard guard = ((ValueGuard) _guard);
    Assert.assertNotNull(guard);
    boolean _eIsProxy_1 = guard.eIsProxy();
    Assert.assertFalse(_eIsProxy_1);
    Value _cond = guard.getCond();
    final ConstantRef ref = ((ConstantRef) _cond);
    Assert.assertNotNull(ref);
    boolean _eIsProxy_2 = ref.eIsProxy();
    Assert.assertFalse(_eIsProxy_2);
    final Constant const_ = ref.getConstant();
    Assert.assertNotNull(const_);
    boolean _eIsProxy_3 = const_.eIsProxy();
    Assert.assertTrue(_eIsProxy_3);
    final URI proxyUri = ((InternalEObject) const_).eProxyURI();
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    URI _removeSynthetic = _accessibleFakeResourceUtil.removeSynthetic(proxyUri);
    Assert.assertEquals(proxyUri, _removeSynthetic);
    EList<State> _states = fakeModel.getStates();
    State _get = _states.get(2);
    EList<Transition> _transitions = _get.getTransitions();
    final Transition transition = _transitions.get(1);
    Assert.assertNotNull(transition);
    Event _event = transition.getEvent();
    boolean _eIsProxy_4 = _event.eIsProxy();
    Assert.assertFalse(_eIsProxy_4);
  }
}
