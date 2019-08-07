package com.altran.general.integration.xtextsirius.test.reflang;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.test.reflang.ATestRefLang;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.IContainerContent;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Leaf;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Reference;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.SubContainer;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestRefLang extends ATestRefLang {
  @Test
  public void noEdit() {
    IContainerContent _E = this.E();
    Leaf _createLeaf = this._refLangFactory.createLeaf();
    final Procedure1<Leaf> _function = (Leaf it) -> {
      it.setName("E");
      EList<Reference> _references = it.getReferences();
      Reference _createReference = this._refLangFactory.createReference();
      final Procedure1<Reference> _function_1 = (Reference it_1) -> {
        it_1.setTarget(this.A());
        it_1.setTarget2(this.B());
      };
      Reference _doubleArrow = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_1);
      _references.add(_doubleArrow);
      EList<Reference> _references_1 = it.getReferences();
      Reference _createReference_1 = this._refLangFactory.createReference();
      final Procedure1<Reference> _function_2 = (Reference it_1) -> {
        it_1.setTarget(this.B());
        it_1.setTarget2(this.A());
      };
      Reference _doubleArrow_1 = ObjectExtensions.<Reference>operator_doubleArrow(_createReference_1, _function_2);
      _references_1.add(_doubleArrow_1);
    };
    Leaf _doubleArrow = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf, _function);
    this.assertModelEdit(_E, 
      this.model, 
      "E 1 -> A / B -> B / A", 
      "E 1 -> A / C -> B / D", _doubleArrow);
  }
  
  @Test
  public void edit() {
    IContainerContent _E = this.E();
    Leaf _createLeaf = this._refLangFactory.createLeaf();
    final Procedure1<Leaf> _function = (Leaf it) -> {
      it.setName("E");
      EList<Reference> _references = it.getReferences();
      Reference _createReference = this._refLangFactory.createReference();
      final Procedure1<Reference> _function_1 = (Reference it_1) -> {
        it_1.setTarget(this.B());
        it_1.setTarget2(this.B());
      };
      Reference _doubleArrow = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_1);
      _references.add(_doubleArrow);
      EList<Reference> _references_1 = it.getReferences();
      Reference _createReference_1 = this._refLangFactory.createReference();
      final Procedure1<Reference> _function_2 = (Reference it_1) -> {
        it_1.setTarget(this.A());
        it_1.setTarget2(this.A());
      };
      Reference _doubleArrow_1 = ObjectExtensions.<Reference>operator_doubleArrow(_createReference_1, _function_2);
      _references_1.add(_doubleArrow_1);
    };
    Leaf _doubleArrow = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf, _function);
    this.assertModelEdit(_E, 
      this.model, 
      "E 1 -> A / B -> B / A", 
      "E 1 -> B / C -> A / D", _doubleArrow);
  }
  
  @Test
  public void selfRef() {
    Leaf _createLeaf = this._refLangFactory.createLeaf();
    final Procedure1<Leaf> _function = (Leaf it) -> {
      it.setName("G");
      EList<Reference> _references = it.getReferences();
      Reference _createReference = this._refLangFactory.createReference();
      final Procedure1<Reference> _function_1 = (Reference it_1) -> {
        it_1.setTarget(this.A());
      };
      Reference _doubleArrow = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_1);
      _references.add(_doubleArrow);
      EList<Reference> _references_1 = it.getReferences();
      Reference _createReference_1 = this._refLangFactory.createReference();
      final Procedure1<Reference> _function_2 = (Reference it_1) -> {
        it_1.setTarget(this.B());
      };
      Reference _doubleArrow_1 = ObjectExtensions.<Reference>operator_doubleArrow(_createReference_1, _function_2);
      _references_1.add(_doubleArrow_1);
    };
    final Leaf expected = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf, _function);
    EList<Reference> _references2 = expected.getReferences2();
    Reference _createReference = this._refLangFactory.createReference();
    final Procedure1<Reference> _function_1 = (Reference it) -> {
      it.setTarget(expected);
    };
    Reference _doubleArrow = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_1);
    _references2.add(_doubleArrow);
    this.assertModelEdit(
      this.G(), 
      this.model, 
      "G 1 -> G", 
      "G 1 -> A -> B 2 -> G", expected);
  }
  
  @Test
  public void mixedRef() {
    Leaf _createLeaf = this._refLangFactory.createLeaf();
    final Procedure1<Leaf> _function = (Leaf it) -> {
      it.setName("K");
    };
    final Leaf sub = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf, _function);
    Leaf _createLeaf_1 = this._refLangFactory.createLeaf();
    final Procedure1<Leaf> _function_1 = (Leaf it) -> {
      it.setName("L");
    };
    final Leaf sub2 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_1, _function_1);
    SubContainer _createSubContainer = this._refLangFactory.createSubContainer();
    final Procedure1<SubContainer> _function_2 = (SubContainer it) -> {
      it.setName("I");
      EList<IContainerContent> _subContents = it.getSubContents();
      _subContents.add(sub);
      EList<IContainerContent> _subContents_1 = it.getSubContents();
      _subContents_1.add(sub2);
      EList<Reference> _references = it.getReferences();
      Reference _createReference = this._refLangFactory.createReference();
      final Procedure1<Reference> _function_3 = (Reference it_1) -> {
        it_1.setTarget(sub);
        it_1.setTarget2(this.B());
      };
      Reference _doubleArrow = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_3);
      _references.add(_doubleArrow);
      EList<Reference> _references_1 = it.getReferences();
      Reference _createReference_1 = this._refLangFactory.createReference();
      final Procedure1<Reference> _function_4 = (Reference it_1) -> {
        it_1.setTarget(sub2);
      };
      Reference _doubleArrow_1 = ObjectExtensions.<Reference>operator_doubleArrow(_createReference_1, _function_4);
      _references_1.add(_doubleArrow_1);
      EList<Reference> _references2 = it.getReferences2();
      Reference _createReference_2 = this._refLangFactory.createReference();
      final Procedure1<Reference> _function_5 = (Reference it_1) -> {
        it_1.setTarget(this.C());
        it_1.setTarget2(this.A());
      };
      Reference _doubleArrow_2 = ObjectExtensions.<Reference>operator_doubleArrow(_createReference_2, _function_5);
      _references2.add(_doubleArrow_2);
    };
    final SubContainer expected = ObjectExtensions.<SubContainer>operator_doubleArrow(_createSubContainer, _function_2);
    EList<Reference> _references2 = expected.getReferences2();
    Reference _createReference = this._refLangFactory.createReference();
    final Procedure1<Reference> _function_3 = (Reference it) -> {
      it.setTarget(expected);
    };
    Reference _doubleArrow = ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_3);
    _references2.add(_doubleArrow);
    this.assertModelEdit(
      this.I(), 
      this.model, 
      "I { \tJ L } 1 -> A / B -> J 2 -> B / A", 
      "I { K L } 1 -> K / B -> L 2 -> C / A -> I", expected);
  }
  
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
    return "";
  }
  
  @Override
  protected IXtextSiriusModelDescriptor createModelDescriptor() {
    Injector _injector = this.getInjector();
    XtextDirectEditModelDescription _createXtextDirectEditModelDescription = this.diagramFactory.createXtextDirectEditModelDescription();
    final Procedure1<XtextDirectEditModelDescription> _function = (XtextDirectEditModelDescription it) -> {
      EList<String> _ignoredNestedFeatures = it.getIgnoredNestedFeatures();
      _ignoredNestedFeatures.add("references.target2");
    };
    XtextDirectEditModelDescription _doubleArrow = ObjectExtensions.<XtextDirectEditModelDescription>operator_doubleArrow(_createXtextDirectEditModelDescription, _function);
    return new XtextSiriusModelDescriptor(_injector, _doubleArrow);
  }
  
  @Override
  protected void analyzeResult(final Object expectedResultElement, final Object result) {
    super.analyzeResult(expectedResultElement, result);
    Assert.assertTrue((result instanceof IContainerContent));
  }
}
