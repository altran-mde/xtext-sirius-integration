package com.altran.general.integration.xtextsirius.test.integration;

import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusModelEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.editor.IXtextSiriusValueEditorCallback;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;
import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;
import com.google.inject.Injector;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

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
  public XtextSiriusSyntaxErrorException handleSyntaxErrors(final IParseResult parseResult) {
    final Function1<INode, SyntaxErrorMessage> _function = (INode it) -> {
      return it.getSyntaxErrorMessage();
    };
    Iterable<SyntaxErrorMessage> _map = IterableExtensions.<INode, SyntaxErrorMessage>map(parseResult.getSyntaxErrors(), _function);
    throw new AssertionError(_map);
  }
  
  @Override
  public XtextSiriusErrorException handleUnresolvableProxies() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Pure
  public EObject getTestSemanticElement() {
    return this.testSemanticElement;
  }
  
  public void setTestSemanticElement(final EObject testSemanticElement) {
    this.testSemanticElement = testSemanticElement;
  }
}
