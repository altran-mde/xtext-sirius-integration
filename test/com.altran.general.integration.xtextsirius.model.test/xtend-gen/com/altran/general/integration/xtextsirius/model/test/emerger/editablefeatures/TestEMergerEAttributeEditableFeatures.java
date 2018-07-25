package com.altran.general.integration.xtextsirius.model.test.emerger.editablefeatures;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.emerger.TestEMergerEAttribute;
import com.altran.general.integration.xtextsirius.model.test.emerger.editablefeatures.EditableFeaturesExtension;
import com.altran.general.integration.xtextsirius.util.EMerger;
import java.util.Collections;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEMergerEAttributeEditableFeatures extends TestEMergerEAttribute {
  private final EditableFeaturesExtension<Element> editableFeaturesExtension = new EditableFeaturesExtension<Element>(this);
  
  @After
  public void checkUntouchedFeatures() {
    this.editableFeaturesExtension.checkUntouchedFeatures();
  }
  
  @Override
  protected EMerger<Element> createEMerger(final Element existing, final Element edited) {
    return this.editableFeaturesExtension.createEMerger(existing, edited);
  }
  
  @Override
  protected EMerger<Element> createEMerger(final Element existing, final EStructuralFeature feature) {
    return this.editableFeaturesExtension.createEMerger(existing, feature);
  }
  
  @Test
  @Override
  public void singleNull_singleNew() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.editableFeaturesExtension.createEMerger(existing, edited, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("changeableAttr"))).merge(edited);
    Assert.assertNull(result.getChangeableAttr());
  }
  
  @Test
  @Override
  public void singleNull_singleExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableAttr(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableAttr("Hello");
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.editableFeaturesExtension.createEMerger(existing, edited, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("changeableAttr"))).merge(edited);
    Assert.assertNull(result.getChangeableAttr());
  }
}
