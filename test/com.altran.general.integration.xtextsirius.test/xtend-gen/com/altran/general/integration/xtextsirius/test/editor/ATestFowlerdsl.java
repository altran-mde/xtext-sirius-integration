/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.editor;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory;
import com.altran.general.integration.xtextsirius.test.FowlerdslEnvironment;
import com.altran.general.integration.xtextsirius.test.InlineFowlerdslEnvironment;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory;
import org.eclipse.xtext.xbase.lib.Extension;
import org.espilce.commons.emf.testsupport.AModelLoader;
import org.espilce.commons.lang.StringUtils2;
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
  public static void loadFowlerdsl() {
    FowlerdslEnvironment.getInstance();
    InlineFowlerdslEnvironment.getInstance();
  }
  
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
  
  protected String modelText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("eventSD 2 [ c2 .. c1 ]");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event2 3 [ 2 ]");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event4 3 [ c1 ]");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("event3 4 ");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("commands");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("cmd0 23");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("cmd1 42");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("constants");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("c1 23");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("c2 42");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("state A ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("description \"<p>This is a deschkriptschion</p>\\n\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event2 => A");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event2 => B");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("state B");
    _builder.newLine();
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("state C");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("description \"\"");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    _builder.newLine();
    _builder.append("state D");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("description \"  \"");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    return StringUtils2.normalizeNewline(_builder.toString());
  }
  
  protected abstract String getFeatureName();
  
  protected Statemachine parseModel() {
    EObject _parseModel = this.modelLoader.parseModel(this.modelText(), "test.statemachine");
    final Statemachine result = ((Statemachine) _parseModel);
    EcoreUtil.resolveAll(result);
    return result;
  }
  
  protected Injector getInjector() {
    return FowlerdslEnvironment.getInstance().getInjector();
  }
  
  protected Injector getInlineInjector() {
    return InlineFowlerdslEnvironment.getInstance().getInjector();
  }
}
