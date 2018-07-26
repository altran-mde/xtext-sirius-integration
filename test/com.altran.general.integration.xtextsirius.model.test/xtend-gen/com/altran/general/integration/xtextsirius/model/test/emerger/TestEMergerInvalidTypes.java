package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMerger;
import java.util.Collections;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEMergerInvalidTypes extends ATestEMerger<Element> {
  @Test(expected = ClassCastException.class)
  public void singleAttr_single() {
    this.createEMerger(this.createRootElement(), this.xtextSiriusTestPackage.getIElement_ChangeableAttr()).merge(Integer.valueOf(42), this.xtextSiriusTestPackage.getIElement_ChangeableAttr());
  }
  
  @Test(expected = IllegalStateException.class)
  public void singleAttr_multi() {
    this.createEMerger(this.createRootElement(), this.xtextSiriusTestPackage.getIElement_ChangeableAttr()).merge(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("aaa", "bbb")), this.xtextSiriusTestPackage.getIElement_ChangeableAttr());
  }
  
  @Test(expected = ClassCastException.class)
  public void multiAttr_single() {
    this.createEMerger(this.createRootElement(), this.xtextSiriusTestPackage.getIElement_ChangeableListAttr()).merge(Integer.valueOf(42), this.xtextSiriusTestPackage.getIElement_ChangeableListAttr());
  }
  
  @Test(expected = ClassCastException.class)
  public void multiAttr_multi() {
    EDataType _createEDataType = EcoreFactory.eINSTANCE.createEDataType();
    this.createEMerger(this.createRootElement(), this.xtextSiriusTestPackage.getIElement_ChangeableListAttr()).merge(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(_createEDataType, Integer.valueOf(42))), this.xtextSiriusTestPackage.getIElement_ChangeableListAttr());
  }
  
  @Test(expected = ClassCastException.class)
  public void singleRef_single() {
    this.createEMerger(this.createRootElement(), this.xtextSiriusTestPackage.getAElement_ChangeableRef()).merge(Integer.valueOf(42), this.xtextSiriusTestPackage.getAElement_ChangeableRef());
  }
  
  @Test(expected = IllegalStateException.class)
  public void singleRef_multi() {
    Element _newElement = this.newElement(1, "1");
    Element _newElement_1 = this.newElement(2, "2");
    this.createEMerger(this.createRootElement(), this.xtextSiriusTestPackage.getAElement_ChangeableRef()).merge(Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newElement, _newElement_1)), this.xtextSiriusTestPackage.getAElement_ChangeableRef());
  }
  
  @Test(expected = ClassCastException.class)
  public void multiRef_single() {
    this.createEMerger(this.createRootElement(), this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(Integer.valueOf(42), this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
  }
  
  @Test(expected = ClassCastException.class)
  public void multiRef_multi() {
    EDataType _createEDataType = EcoreFactory.eINSTANCE.createEDataType();
    this.createEMerger(this.createRootElement(), this.xtextSiriusTestPackage.getAElement_ChangeableListRef()).merge(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(_createEDataType, Integer.valueOf(42))), this.xtextSiriusTestPackage.getAElement_ChangeableListRef());
  }
  
  @Test(expected = ClassCastException.class)
  public void singleCont_single() {
    this.createEMerger(this.createRootElement(), this.xtextSiriusTestPackage.getAElement_ChangeableCont()).merge(Integer.valueOf(42), this.xtextSiriusTestPackage.getAElement_ChangeableCont());
  }
  
  @Test(expected = IllegalStateException.class)
  public void singleCont_multi() {
    Element _newElement = this.newElement(1, "1");
    Element _newElement_1 = this.newElement(2, "2");
    this.createEMerger(this.createRootElement(), this.xtextSiriusTestPackage.getAElement_ChangeableCont()).merge(Collections.<Element>unmodifiableList(CollectionLiterals.<Element>newArrayList(_newElement, _newElement_1)), this.xtextSiriusTestPackage.getAElement_ChangeableCont());
  }
  
  @Test(expected = ClassCastException.class)
  public void multiCont_single() {
    this.createEMerger(this.createRootElement(), this.xtextSiriusTestPackage.getAElement_ChangeableUniqueListCont()).merge(Integer.valueOf(42), this.xtextSiriusTestPackage.getAElement_ChangeableUniqueListCont());
  }
  
  @Test(expected = ClassCastException.class)
  public void multiCont_multi() {
    EDataType _createEDataType = EcoreFactory.eINSTANCE.createEDataType();
    this.createEMerger(this.createRootElement(), this.xtextSiriusTestPackage.getAElement_ChangeableUniqueListCont()).merge(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(_createEDataType, Integer.valueOf(42))), this.xtextSiriusTestPackage.getAElement_ChangeableUniqueListCont());
  }
}
