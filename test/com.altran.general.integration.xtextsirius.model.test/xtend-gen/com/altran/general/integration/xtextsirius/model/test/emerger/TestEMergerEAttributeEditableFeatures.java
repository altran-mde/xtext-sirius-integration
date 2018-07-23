package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.emerger.EditableFeaturesExtension;
import com.altran.general.integration.xtextsirius.model.test.emerger.TestEMergerEAttribute;
import com.altran.general.integration.xtextsirius.util.EMerger;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEMergerEAttributeEditableFeatures extends TestEMergerEAttribute {
  private final EditableFeaturesExtension editableFeaturesExtension = new EditableFeaturesExtension(this);
  
  @After
  public void checkUntouchedFeatures() {
    this.editableFeaturesExtension.checkUntouchedFeatures();
  }
  
  @Override
  protected EMerger<Element> createEMerger(final Element existing, final Element edited) {
    return this.editableFeaturesExtension.createEMerger(existing, edited);
  }
  
  @Test
  @Override
  public void singleNull_singleNew() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.editableFeaturesExtension.createEMerger(existing, edited, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("changeableAttr"))).merge();
    Assert.assertNull(result.getChangeableAttr());
  }
  
  @Test
  @Override
  public void singleNull_singleExisting() {
    Element _createElement = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createElement, _function);
    Element _createElement_1 = this.xtextSiriusTestFactory.createElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableAttr("Hello");
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createElement_1, _function_1);
    final Element result = this.editableFeaturesExtension.createEMerger(existing, edited, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("changeableAttr"))).merge();
    Assert.assertNull(result.getChangeableAttr());
  }
}
