package com.altran.general.integration.xtextsirius.model.test.emerger.editablefeatures;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element;
import com.altran.general.integration.xtextsirius.model.test.emerger.TestEMergerReference;
import com.altran.general.integration.xtextsirius.model.test.emerger.editablefeatures.EditableFeaturesExtension;
import com.altran.general.integration.xtextsirius.util.EMerger;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEMergerReferenceEditableFeatures extends TestEMergerReference {
  private final EditableFeaturesExtension<Element> editableFeaturesExtension = new EditableFeaturesExtension<Element>(this);
  
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
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableRef(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableRef(null);
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.editableFeaturesExtension.createEMerger(existing, edited, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("changeableRef"))).merge(edited);
    Assert.assertNull(result.getChangeableRef());
  }
  
  @Test
  @Override
  public void singleNull_singleExisting() {
    Element _createRootElement = this.createRootElement();
    final Procedure1<Element> _function = (Element it) -> {
      it.setChangeableRef(null);
    };
    final Element edited = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement, _function);
    Element _createRootElement_1 = this.createRootElement();
    final Procedure1<Element> _function_1 = (Element it) -> {
      it.setChangeableRef(this.newExisting(1, ""));
    };
    final Element existing = ObjectExtensions.<Element>operator_doubleArrow(_createRootElement_1, _function_1);
    final Element result = this.editableFeaturesExtension.createEMerger(existing, edited, Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("changeableRef"))).merge(edited);
    Assert.assertNull(result.getChangeableRef());
  }
}
