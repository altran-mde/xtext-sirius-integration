/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;
import com.altran.general.integration.xtextsirius.test.InlineFowlerdslEnvironment;
import com.altran.general.integration.xtextsirius.test.util.fakeresourceutil.ATestFakeResourceUtil;
import com.google.inject.Injector;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestUpdateFakeResourceUri extends ATestFakeResourceUtil {
  @Test
  public void update() {
    final Statemachine model = this.getDefaultModel();
    final Statemachine fakeModel = this.createFakeModel(model);
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
  
  @Test
  public void differentFileExtension() {
    final Statemachine model = this.getDefaultModel();
    final Injector inlineInjector = InlineFowlerdslEnvironment.getInstance().getInjector();
    final XtextResourceSet fakeResourceSet = this.createResourceSet(inlineInjector);
    final Resource fakeResource = fakeResourceSet.createResource(URI.createPlatformResourceURI("/proj/fakeModel.statemachineInlineedit", false));
    final Statemachine fakeModel = this.parseAndLink(NodeModelUtils.getNode(model).getText(), fakeResource, inlineInjector);
    final URI orgUri = model.eResource().getURI();
    final URI fakeUri = fakeModel.eResource().getURI();
    FakeResourceUtil.getInstance().updateFakeResourceUri(fakeModel.eResource(), orgUri);
    final URI newUri = fakeModel.eResource().getURI();
    final URI unsynthNewUri = this.getAccessibleFakeResourceUtil().removeSynthetic(newUri);
    Assert.assertNotEquals(orgUri, fakeUri);
    Assert.assertNotEquals(orgUri, newUri);
    Assert.assertNotEquals(fakeUri, newUri);
    Assert.assertEquals(orgUri.trimFileExtension(), unsynthNewUri.trimFileExtension());
    Assert.assertNotEquals(orgUri.fileExtension(), unsynthNewUri.fileExtension());
    Assert.assertEquals("statemachineInlineedit", newUri.fileExtension());
    Assert.assertEquals("statemachineInlineedit", unsynthNewUri.fileExtension());
  }
}
