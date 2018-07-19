package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.emerger.TestAEMerger;
import com.altran.general.integration.xtextsirius.util.EMerger;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.change.ChangePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEMergerReference extends TestAEMerger {
  private Resource editedResource;
  
  private Resource existingResource;
  
  @BeforeClass
  public static void registerEmf() {
    final EPackage.Registry packageRegistry = EPackage.Registry.INSTANCE;
    packageRegistry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
    packageRegistry.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
    final EcoreResourceFactoryImpl resourceFactory = new EcoreResourceFactoryImpl();
    final Resource.Factory.Registry factoryRegistry = Resource.Factory.Registry.INSTANCE;
    factoryRegistry.getExtensionToFactoryMap().put("ecore", resourceFactory);
    factoryRegistry.getExtensionToFactoryMap().put("genmodel", resourceFactory);
    Map<String, Object> _extensionToFactoryMap = factoryRegistry.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    EcorePackage.eINSTANCE.getClass();
    EcoreFactory.eINSTANCE.getClass();
    ChangePackage.eINSTANCE.getClass();
  }
  
  @Before
  public void initResources() {
    this.editedResource = new ResourceSetImpl().createResource(URI.createURI("__synthetic__resourceName.xmi"));
    this.existingResource = new ResourceSetImpl().createResource(URI.createURI("resourceName.xmi"));
  }
  
  @Test
  public void singleNull_singleNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableRef(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableRef(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1, _createURI).merge();
    Assert.assertNull(result.getChangeableRef());
  }
  
  @Test
  public void singleNull_singleExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableRef(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableRef(this.newExisting(1, ""));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1, _createURI).merge();
    Assert.assertNull(result.getChangeableRef());
  }
  
  @Test
  public void singleNonNull_singleNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableRef(this.newEdited(1, "answer"));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableRef(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1, _createURI).merge();
    Assert.assertNotNull(result.getChangeableRef());
    Assert.assertEquals("aanswer", result.getChangeableRef().getChangeableAttr());
  }
  
  @Test
  public void singleNonNull_singleExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableRef(this.newEdited(1, "answer"));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableRef(this.newExisting(1, "question"));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1, _createURI).merge();
    Assert.assertEquals("aanswer", result.getChangeableRef().getChangeableAttr());
  }
  
  @Test
  public void bag_bagNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Element _newEdited = this.newEdited(3, "3.14");
      Element _newEdited_1 = this.newEdited(2, "2.71");
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Element _newExisting = this.newExisting(1, "1.337");
      Element _newExisting_1 = this.newExisting(31, "31.337");
      Element _newExisting_2 = this.newExisting(1, "1.337");
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#");
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1, _createURI).merge();
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void bag_bagExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Element _newEdited = this.newEdited(3, "3.14");
      Element _newEdited_1 = this.newEdited(2, "2.71");
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableBagRef = it.getChangeableBagRef();
      Element _newExisting = this.newExisting(1, "1.337");
      Element _newExisting_1 = this.newExisting(2, "2.71");
      Element _newExisting_2 = this.newExisting(31, "31.337");
      Element _newExisting_3 = this.newExisting(1, "1.337");
      Element _newExisting_4 = this.newExisting(2, "2.71");
      Iterables.<Element>addAll(_changeableBagRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1, _createURI).merge();
    Assert.assertEquals(2, result.getChangeableBagRef().size());
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a3.14"));
    Assert.assertTrue(this.exists(result.getChangeableBagRef(), "a2.71"));
  }
  
  @Test
  public void set_setNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(31, "31");
      Element _newExisting_2 = this.newExisting(1, "1");
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1, _createURI).merge();
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a3"));
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a2"));
  }
  
  @Test
  public void set_setExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableSetRef = it.getChangeableSetRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableSetRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1, _createURI).merge();
    Assert.assertEquals(2, result.getChangeableSetRef().size());
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a3"));
    Assert.assertTrue(this.exists(result.getChangeableSetRef(), "a2"));
  }
  
  @Test
  public void list_listNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(31, "31");
      Element _newExisting_2 = this.newExisting(1, "1");
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1, _createURI).merge();
    Assert.assertEquals(2, result.getChangeableListRef().size());
    String _changeableAttr = result.getChangeableListRef().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("a3", _changeableAttr);
    Assert.assertTrue(_equals);
    String _changeableAttr_1 = result.getChangeableListRef().get(1).getChangeableAttr();
    boolean _equals_1 = Objects.equal("a2", _changeableAttr_1);
    Assert.assertTrue(_equals_1);
  }
  
  @Test
  public void list_listExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Element _newEdited = this.newEdited(3, "3");
      Element _newEdited_1 = this.newEdited(2, "2");
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newEdited, _newEdited_1)));
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      EList<Element> _changeableListRef = it.getChangeableListRef();
      Element _newExisting = this.newExisting(1, "1");
      Element _newExisting_1 = this.newExisting(2, "2");
      Element _newExisting_2 = this.newExisting(31, "31");
      Element _newExisting_3 = this.newExisting(1, "1");
      Element _newExisting_4 = this.newExisting(2, "2");
      Iterables.<Element>addAll(_changeableListRef, Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newExisting, _newExisting_1, _newExisting_2, _newExisting_3, _newExisting_4)));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    Set<String> _emptySet = CollectionLiterals.<String>emptySet();
    Set<String> _emptySet_1 = CollectionLiterals.<String>emptySet();
    URI _createURI = URI.createURI("resourceName.xmi#/42");
    final Element result = new EMerger<Element>(existing, edited, _emptySet, _emptySet_1, _createURI).merge();
    Assert.assertEquals(2, result.getChangeableListRef().size());
    String _changeableAttr = result.getChangeableListRef().get(0).getChangeableAttr();
    boolean _equals = Objects.equal("a3", _changeableAttr);
    Assert.assertTrue(_equals);
    String _changeableAttr_1 = result.getChangeableListRef().get(1).getChangeableAttr();
    boolean _equals_1 = Objects.equal("a2", _changeableAttr_1);
    Assert.assertTrue(_equals_1);
  }
  
  protected Element newEdited(final int id, final String attrValue) {
    final Element result = this.newElement(id, ("a" + attrValue));
    EList<EObject> _contents = this.editedResource.getContents();
    _contents.add(result);
    return result;
  }
  
  protected Element newExisting(final int id, final String attrValue) {
    final Element result = this.newElement(id, ("q" + attrValue));
    EList<EObject> _contents = this.existingResource.getContents();
    _contents.add(result);
    return result;
  }
  
  protected Element newElement(final int id, final String attrValue) {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr(attrValue);
    };
    return ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
  }
  
  protected boolean exists(final Collection<Element> elements, final String attrValue) {
    final Function1<Element, Boolean> _function = (Element it) -> {
      String _changeableAttr = it.getChangeableAttr();
      return Boolean.valueOf(Objects.equal(_changeableAttr, attrValue));
    };
    return IterableExtensions.<Element>exists(elements, _function);
  }
}
