package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import com.altran.general.integration.xtextsirius.test.AFowlerdslTest;
import com.altran.general.integration.xtextsirius.test.util.fakeresourceutil.ATestFakeResourceUtil;
import com.altran.general.integration.xtextsirius.util.FakeResourceUtil;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestUpdateFakeResourceUri extends ATestFakeResourceUtil {
  @Test
  public void update() {
    final Statemachine model = this.getDefaultModel();
    final Statemachine fakeModel = AFowlerdslTest.createFakeModel(model);
    final URI orgUri = model.eResource().getURI();
    final URI fakeUri = fakeModel.eResource().getURI();
    FakeResourceUtil.getInstance().updateFakeResourceUri(fakeModel.eResource(), orgUri);
    final URI newUri = fakeModel.eResource().getURI();
    final URI unsynthNewUri = this.getAccessibleFakeResourceUtil().removeSynthetic(newUri);
    Assert.assertNotEquals(orgUri, fakeUri);
    Assert.assertNotEquals(orgUri, newUri);
    Assert.assertNotEquals(fakeUri, newUri);
    Assert.assertEquals(orgUri, unsynthNewUri);
  }
}
