package com.altran.general.integration.xtextsirius.test.integration;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory;
import com.altran.general.integration.xtextsirius.test.FowlerdslEnvironment;
import com.altran.general.integration.xtextsirius.test.InlineFowlerdslEnvironment;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory;
import org.eclipse.xtext.xbase.lib.Extension;
import org.espilce.commons.emf.testsupport.AModelLoader;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

@SuppressWarnings("all")
public abstract class ATestFowlerdsl {
  @Extension
  protected AModelLoader modelLoader = new AModelLoader() {
    @Override
    public ResourceSet provideResourceSet() {
      return new ResourceSetImpl();
    }
  };
  
  @Extension
  protected DiagramxtextFactory diagramFactory = DiagramxtextFactory.eINSTANCE;
  
  @Extension
  protected StatemachineFactory statemachineFactory = StatemachineFactory.eINSTANCE;
  
  protected Statemachine model;
  
  @BeforeClass
  public static void loadFowlerds() {
    FowlerdslEnvironment.getInstance();
    InlineFowlerdslEnvironment.getInstance();
  }
  
  protected abstract String modelText();
  
  protected Statemachine parseModel() {
    EObject _parseModel = this.modelLoader.parseModel(this.modelText(), "test.statemachine");
    final Statemachine result = ((Statemachine) _parseModel);
    EcoreUtil.resolveAll(result);
    return result;
  }
  
  @Before
  public void loadModel() {
    this.model = this.parseModel();
  }
  
  @After
  public void unloadModel() {
    this.model.eResource().unload();
  }
  
  protected Injector getInjector() {
    return FowlerdslEnvironment.getInstance().getInjector();
  }
  
  protected Injector getInlineInjector() {
    return InlineFowlerdslEnvironment.getInstance().getInjector();
  }
}
