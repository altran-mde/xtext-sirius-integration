package com.altran.general.integration.xtextsirius.test.reflang;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.test.reflang.ATestRefLang;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Leaf;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Reference;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;

@SuppressWarnings("all")
public class TestRefLangList extends ATestRefLang {
  @Test
  public void editRefList() {
    Leaf _createLeaf = this._refLangFactory.createLeaf();
    final Procedure1<Leaf> _function = (Leaf it) -> {
      it.setName("K");
      EList<Reference> _references = it.getReferences();
      Reference _createReference = this._refLangFactory.createReference();
      final Procedure1<Reference> _function_1 = (Reference it_1) -> {
        it_1.setTarget(this.A());
      };
      Reference _doubleArrow = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_1);
      _references.add(_doubleArrow);
    };
    Leaf _doubleArrow = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf, _function);
    Leaf _createLeaf_1 = this._refLangFactory.createLeaf();
    final Procedure1<Leaf> _function_1 = (Leaf it) -> {
      it.setName("L");
    };
    Leaf _doubleArrow_1 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_1, _function_1);
    Leaf _createLeaf_2 = this._refLangFactory.createLeaf();
    final Procedure1<Leaf> _function_2 = (Leaf it) -> {
      it.setName("M");
      EList<Reference> _references = it.getReferences();
      Reference _createReference = this._refLangFactory.createReference();
      final Procedure1<Reference> _function_3 = (Reference it_1) -> {
        it_1.setTarget(this.B());
      };
      Reference _doubleArrow_2 = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_3);
      _references.add(_doubleArrow_2);
    };
    Leaf _doubleArrow_2 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_2, _function_2);
    final List<Leaf> expected = Collections.<Leaf>unmodifiableList(CollectionLiterals.<Leaf>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2));
    this.assertModelEdit(
      this.I().getSubContents(), 
      this.I(), 
      "J L", 
      "K 1 -> A L M 1 -> B", expected);
  }
  
  @Override
  protected String getFeatureName() {
    return "subContents";
  }
  
  @Override
  protected IXtextSiriusModelDescriptor createModelDescriptor() {
    Injector _injector = this.getInjector();
    XtextDirectEditModelDescription _createXtextDirectEditModelDescription = this.diagramFactory.createXtextDirectEditModelDescription();
    final Procedure1<XtextDirectEditModelDescription> _function = (XtextDirectEditModelDescription it) -> {
    };
    XtextDirectEditModelDescription _doubleArrow = ObjectExtensions.<XtextDirectEditModelDescription>operator_doubleArrow(_createXtextDirectEditModelDescription, _function);
    return new XtextSiriusModelDescriptor(_injector, _doubleArrow);
  }
}
