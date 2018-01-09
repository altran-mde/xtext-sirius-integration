package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import com.altran.general.integration.xtextsirius.test.InlineFowlerdslEnvironment;
import com.altran.general.integration.xtextsirius.test.util.fakeresourceutil.ATestFakeResourceUtil;
import com.altran.general.integration.xtextsirius.util.FakeResourceUtil;
import com.google.inject.Injector;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.nodemodel.ICompositeNode;
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
    Resource _eResource = model.eResource();
    final URI orgUri = _eResource.getURI();
    Resource _eResource_1 = fakeModel.eResource();
    final URI fakeUri = _eResource_1.getURI();
    FakeResourceUtil _instance = FakeResourceUtil.getInstance();
    Resource _eResource_2 = fakeModel.eResource();
    _instance.updateFakeResourceUri(_eResource_2, orgUri);
    Resource _eResource_3 = fakeModel.eResource();
    final URI newUri = _eResource_3.getURI();
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    final URI unsynthNewUri = _accessibleFakeResourceUtil.removeSynthetic(newUri);
    Assert.assertNotEquals(orgUri, fakeUri);
    Assert.assertNotEquals(orgUri, newUri);
    Assert.assertNotEquals(fakeUri, newUri);
    Assert.assertEquals(orgUri, unsynthNewUri);
  }
  
  @Test
  public void differentFileExtension() {
    final Statemachine model = this.getDefaultModel();
    InlineFowlerdslEnvironment _instance = InlineFowlerdslEnvironment.getInstance();
    final Injector inlineInjector = _instance.getInjector();
    final XtextResourceSet fakeResourceSet = this.createResourceSet(inlineInjector);
    URI _createPlatformResourceURI = URI.createPlatformResourceURI("/proj/fakeModel.statemachineInlineedit", false);
    final Resource fakeResource = fakeResourceSet.createResource(_createPlatformResourceURI);
    ICompositeNode _node = NodeModelUtils.getNode(model);
    String _text = _node.getText();
    final Statemachine fakeModel = this.parseAndLink(_text, fakeResource, inlineInjector);
    Resource _eResource = model.eResource();
    final URI orgUri = _eResource.getURI();
    Resource _eResource_1 = fakeModel.eResource();
    final URI fakeUri = _eResource_1.getURI();
    FakeResourceUtil _instance_1 = FakeResourceUtil.getInstance();
    Resource _eResource_2 = fakeModel.eResource();
    _instance_1.updateFakeResourceUri(_eResource_2, orgUri);
    Resource _eResource_3 = fakeModel.eResource();
    final URI newUri = _eResource_3.getURI();
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    final URI unsynthNewUri = _accessibleFakeResourceUtil.removeSynthetic(newUri);
    Assert.assertNotEquals(orgUri, fakeUri);
    Assert.assertNotEquals(orgUri, newUri);
    Assert.assertNotEquals(fakeUri, newUri);
    URI _trimFileExtension = orgUri.trimFileExtension();
    URI _trimFileExtension_1 = unsynthNewUri.trimFileExtension();
    Assert.assertEquals(_trimFileExtension, _trimFileExtension_1);
    String _fileExtension = orgUri.fileExtension();
    String _fileExtension_1 = unsynthNewUri.fileExtension();
    Assert.assertNotEquals(_fileExtension, _fileExtension_1);
    String _fileExtension_2 = newUri.fileExtension();
    Assert.assertEquals("statemachineInlineedit", _fileExtension_2);
    String _fileExtension_3 = unsynthNewUri.fileExtension();
    Assert.assertEquals("statemachineInlineedit", _fileExtension_3);
  }
}
