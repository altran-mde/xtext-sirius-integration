package com.altran.general.integration.xtextsirius.test.editor;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory;
import com.altran.general.integration.xtextsirius.runtime.ModelEntryPoint;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.editor.modeladjust.MinimalModelAdjuster;
import com.altran.general.integration.xtextsirius.test.editor.model.AssertingXtextSiriusEditorCallback;
import com.altran.general.integration.xtextsirius.test.editor.model.TestXtextSiriusModelEditorAdapter;
import com.google.inject.Injector;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Extension;
import org.espilce.commons.emf.testsupport.AModelLoader;
import org.espilce.commons.emf.testsupport.AssertEmf;
import org.espilce.commons.text.StringUtils2;
import org.junit.After;
import org.junit.Before;

@SuppressWarnings("all")
public abstract class ATestXtextSiriusModel<M extends EObject> {
  @Extension
  protected DiagramxtextFactory diagramFactory = DiagramxtextFactory.eINSTANCE;
  
  @Extension
  protected AModelLoader modelLoader = new AModelLoader() {
    @Override
    public ResourceSet provideResourceSet() {
      return new ResourceSetImpl();
    }
  };
  
  protected M model;
  
  @Before
  public void loadModel() {
    this.model = this.parseModel();
  }
  
  @After
  public void unloadModel() {
    Resource _eResource = null;
    if (this.model!=null) {
      _eResource=this.model.eResource();
    }
    if (_eResource!=null) {
      _eResource.unload();
    }
  }
  
  protected abstract CharSequence modelText();
  
  protected abstract String resourceName();
  
  protected abstract Injector getInjector();
  
  protected abstract String getFeatureName();
  
  protected abstract IXtextSiriusModelDescriptor createModelDescriptor();
  
  protected M parseModel() {
    final String normalized = StringUtils2.normalizeNewline(this.modelText().toString());
    if ((null == normalized)) {
      return null;
    }
    final EObject result = this.modelLoader.parseModel(normalized, this.resourceName());
    EcoreUtil.resolveAll(result);
    return ((M) result);
  }
  
  protected void assertModelEdit(final EObject elementToEdit, final String expectedText, final String newText, final Object expectedResultElement) {
    this.assertModelEdit(elementToEdit, elementToEdit, this.getFeatureName(), expectedText, newText, expectedResultElement);
  }
  
  protected void assertModelEdit(final Object elementToEdit, final EObject fallbackContainer, final String expectedText, final String newText, final Object expectedResultElement) {
    this.assertModelEdit(elementToEdit, fallbackContainer, this.getFeatureName(), expectedText, newText, expectedResultElement);
  }
  
  protected void assertModelEdit(final Object elementToEdit, final EObject fallbackContainer, final String valueFeatureName, final String expectedText, final String newText, final Object expectedResultElement) {
    final IXtextSiriusModelDescriptor descriptor = this.createModelDescriptor();
    final TestXtextSiriusModelEditorAdapter editor = new TestXtextSiriusModelEditorAdapter(descriptor);
    Injector _injector = this.getInjector();
    String _normalizeNewline = StringUtils2.normalizeNewline(expectedText);
    AssertingXtextSiriusEditorCallback callback = new AssertingXtextSiriusEditorCallback(_injector, this.model, newText, _normalizeNewline);
    editor.setCallback(callback);
    EObject _xifexpression = null;
    if ((elementToEdit instanceof EObject)) {
      _xifexpression = ((EObject)elementToEdit);
    } else {
      _xifexpression = null;
    }
    final ModelEntryPoint mep = new ModelEntryPoint(_xifexpression, fallbackContainer, valueFeatureName);
    editor.setModelEntryPoint(mep);
    editor.initValue(elementToEdit);
    final EObject commitTarget = new MinimalModelAdjuster().getClosestElement(mep);
    final Object result = editor.commit(commitTarget);
    this.analyzeResult(expectedResultElement, result);
  }
  
  protected void analyzeResult(final Object expectedResultElement, final Object result) {
    if ((expectedResultElement instanceof EObject)) {
      AssertEmf.assertModelEquals(((EObject)expectedResultElement), ((EObject) result));
    } else {
      if ((expectedResultElement instanceof List)) {
        AssertEmf.assertModelEquals(((List<EObject>)expectedResultElement), ((List<EObject>) result));
      }
    }
  }
}
