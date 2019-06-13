/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.editor.model;

import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusModelEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusValueEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;
import com.google.inject.Injector;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.junit.Assert;

@SuppressWarnings("all")
public abstract class TestXtextSiriusEditorCallbackAdapter implements IXtextSiriusEditorCallback, IXtextSiriusModelEditorCallback, IXtextSiriusValueEditorCallback {
  protected final XtextResource fakeResource;
  
  @Accessors
  protected EObject testSemanticElement;
  
  private String newContent;
  
  public TestXtextSiriusEditorCallbackAdapter(final Injector injector, final EObject model) {
    try {
      final URI uri = model.eResource().getURI();
      Resource _createResource = injector.<IResourceFactory>getInstance(IResourceFactory.class).createResource(uri);
      this.fakeResource = ((XtextResource) _createResource);
      final String text = NodeModelUtils.getNode(model).getRootNode().getText();
      StringInputStream _stringInputStream = new StringInputStream(text);
      this.fakeResource.load(_stringInputStream, Collections.<Object, Object>emptyMap());
      FakeResourceUtil.getInstance().updateFakeResourceUri(this.fakeResource, uri);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void callbackInitText(final String initialText, final int offset, final int length) {
    this.updateEditedText(initialText);
    final EObject element = this.getTestSemanticElement();
    Assert.assertNotNull("testSemanticElement is null", element);
    FakeResourceUtil.getInstance().updateFakeResourceUri(this.fakeResource, element.eResource().getURI());
  }
  
  @Override
  public String callbackGetText() {
    return this.newContent;
  }
  
  public void updateEditedText(final String newContent) {
    try {
      this.newContent = newContent;
      String _elvis = null;
      if (newContent != null) {
        _elvis = newContent;
      } else {
        _elvis = "";
      }
      this.fakeResource.reparse(_elvis);
      this.fakeResource.relink();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public IParseResult getXtextParseResult() {
    IParseResult _xblockexpression = null;
    {
      EcoreUtil2.resolveLazyCrossReferences(this.fakeResource, null);
      _xblockexpression = this.fakeResource.getParseResult();
    }
    return _xblockexpression;
  }
  
  @Override
  public TextRegion callbackGetVisibleRegion() {
    return new TextRegion(0, 0);
  }
  
  @Pure
  public EObject getTestSemanticElement() {
    return this.testSemanticElement;
  }
  
  public void setTestSemanticElement(final EObject testSemanticElement) {
    this.testSemanticElement = testSemanticElement;
  }
}
