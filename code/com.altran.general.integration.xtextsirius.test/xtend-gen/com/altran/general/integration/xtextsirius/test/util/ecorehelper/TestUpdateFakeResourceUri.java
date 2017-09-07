package com.altran.general.integration.xtextsirius.test.util.ecorehelper;

import com.altran.general.integration.xtextsirius.test.AFowlerdslTest;
import com.altran.general.integration.xtextsirius.test.util.ecorehelper.ATestEcoreHelper;
import com.altran.general.integration.xtextsirius.util.EcoreHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestUpdateFakeResourceUri extends ATestEcoreHelper {
  @Test
  public void update() {
    final Statemachine model = this.getDefaultModel();
    final Statemachine fakeModel = AFowlerdslTest.createFakeModel(model);
    final URI orgUri = model.eResource().getURI();
    final URI fakeUri = fakeModel.eResource().getURI();
    EcoreHelper.getInstance().updateFakeResourceUri(fakeModel.eResource(), orgUri);
    final URI newUri = fakeModel.eResource().getURI();
    final URI unsynthNewUri = this.getAccessibleEcoreHelper().removeSynthetic(newUri);
    Assert.assertNotEquals(orgUri, fakeUri);
    Assert.assertNotEquals(orgUri, newUri);
    Assert.assertNotEquals(fakeUri, newUri);
    Assert.assertEquals(orgUri, unsynthNewUri);
  }
}
