package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import com.altran.general.integration.xtextsirius.test.util.fakeresourceutil.ATestFakeResourceUtil;
import com.altran.general.integration.xtextsirius.util.FakeResourceUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.ConstantRef;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Guard;
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
    final URI orgUri = model.eResource().getURI();
    FakeResourceUtil.getInstance().updateFakeResourceUri(fakeModel.eResource(), orgUri);
    final Event fakeEvent = fakeModel.getEvents().get(2);
    final Event proxified = FakeResourceUtil.getInstance().<Event>proxify(fakeEvent, orgUri);
    Assert.assertSame(fakeEvent, proxified);
    Assert.assertFalse(proxified.eIsProxy());
    Guard _guard = proxified.getGuard();
    final ValueGuard guard = ((ValueGuard) _guard);
    Assert.assertNotNull(guard);
    Assert.assertFalse(guard.eIsProxy());
    Value _cond = guard.getCond();
    final ConstantRef ref = ((ConstantRef) _cond);
    Assert.assertNotNull(ref);
    Assert.assertFalse(ref.eIsProxy());
    final Constant const_ = ref.getConstant();
    Assert.assertNotNull(const_);
    Assert.assertTrue(const_.eIsProxy());
    final URI proxyUri = ((InternalEObject) const_).eProxyURI();
    Assert.assertEquals(proxyUri, this.getAccessibleFakeResourceUtil().removeSynthetic(proxyUri));
    final Transition transition = fakeModel.getStates().get(2).getTransitions().get(1);
    Assert.assertNotNull(transition);
    Assert.assertFalse(transition.getEvent().eIsProxy());
  }
}
