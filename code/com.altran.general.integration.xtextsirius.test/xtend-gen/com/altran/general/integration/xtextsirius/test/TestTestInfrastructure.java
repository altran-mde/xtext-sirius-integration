package com.altran.general.integration.xtextsirius.test;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.test.AXtextTest;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Constant;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestTestInfrastructure extends AFowlerdslDefaultModelTest {
  @Test
  public void parseTest() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event1 111");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parse(_builder.toString());
    EList<Event> _events = model.getEvents();
    Event _head = IterableExtensions.<Event>head(_events);
    String _name = _head.getName();
    Assert.assertEquals("event1", _name);
  }
  
  @Test
  public void parseIntoResourceTest() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("events");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("event1 111");
    _builder.newLine();
    _builder.append("end");
    _builder.newLine();
    final Statemachine model = this.parseIntoResource(_builder.toString());
    EList<Event> _events = model.getEvents();
    Event _head = IterableExtensions.<Event>head(_events);
    String _name = _head.getName();
    Assert.assertEquals("event1", _name);
    Resource _eResource = model.eResource();
    Assert.assertNotNull(_eResource);
    Resource _eResource_1 = model.eResource();
    ResourceSet _resourceSet = _eResource_1.getResourceSet();
    Assert.assertNotNull(_resourceSet);
  }
  
  @Test
  public void findFirstTargetOfTypeTest() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    final Event event4 = _events.get(4);
    final Constant constant = AXtextTest.<Constant>findFirstTargetOfType(event4, Constant.class);
    String _name = constant.getName();
    Assert.assertEquals("constant3X", _name);
  }
  
  @Test
  public void defaultModelTest() {
    final Statemachine model = this.getDefaultModel();
    EList<Event> _events = model.getEvents();
    int _size = _events.size();
    Assert.assertEquals(5, _size);
    EList<Constant> _constants = model.getConstants();
    int _size_1 = _constants.size();
    Assert.assertEquals(3, _size_1);
    EList<Event> _events_1 = model.getEvents();
    final Event event4 = _events_1.get(3);
    final Constant constant = AXtextTest.<Constant>findFirstTargetOfType(event4, Constant.class);
    Resource _eResource = event4.eResource();
    Resource _eResource_1 = constant.eResource();
    Assert.assertNotEquals(_eResource, _eResource_1);
  }
  
  @Test
  public void fakeModelTest() {
    final Statemachine model = this.getDefaultModel();
    final Statemachine fakeModel = this.createFakeModel(model);
    Assert.assertNotEquals(model, fakeModel);
    Resource _eResource = model.eResource();
    Resource _eResource_1 = fakeModel.eResource();
    Assert.assertNotEquals(_eResource, _eResource_1);
    Resource _eResource_2 = model.eResource();
    ResourceSet _resourceSet = _eResource_2.getResourceSet();
    Resource _eResource_3 = fakeModel.eResource();
    ResourceSet _resourceSet_1 = _eResource_3.getResourceSet();
    Assert.assertNotEquals(_resourceSet, _resourceSet_1);
  }
}
