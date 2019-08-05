package com.altran.general.integration.xtextsirius.test.reflang;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.test.editor.ATestXtextSiriusModel;
import com.altran.general.integration.xtextsirius.test.reflang.RefLangStandaloneSetup;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Container;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.IContainerContent;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Leaf;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangFactory;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Reference;
import com.google.inject.Injector;
import java.util.Collection;
import java.util.Collections;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("all")
public class TestRefLang extends ATestXtextSiriusModel<Container> {
  @Extension
  private RefLangFactory _refLangFactory = RefLangFactory.eINSTANCE;
  
  private static Injector injector;
  
  @BeforeClass
  public static void loadEKeyDsl() {
    RefLangPackage.eINSTANCE.getNsPrefix();
    TestRefLang.injector = new RefLangStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  @Override
  protected CharSequence modelText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// 0");
    _builder.newLine();
    _builder.append("A");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// 1");
    _builder.newLine();
    _builder.append("B");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// 2");
    _builder.newLine();
    _builder.append("C");
    _builder.newLine();
    _builder.append("1 -> A");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// 3");
    _builder.newLine();
    _builder.append("D");
    _builder.newLine();
    _builder.append("1 -> A / B");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// 4");
    _builder.newLine();
    _builder.append("E");
    _builder.newLine();
    _builder.append("1 -> A / B -> B / A");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// 5");
    _builder.newLine();
    _builder.append("F");
    _builder.newLine();
    _builder.append("1 -> A -> A / A");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// 6");
    _builder.newLine();
    _builder.append("G");
    _builder.newLine();
    _builder.append("1 -> G");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// 7");
    _builder.newLine();
    _builder.append("H");
    _builder.newLine();
    _builder.append("1 -> A / G");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// 8");
    _builder.newLine();
    _builder.append("I");
    _builder.newLine();
    _builder.append("1 -> A / B");
    _builder.newLine();
    _builder.append("2 -> B / A");
    _builder.newLine();
    return _builder;
  }
  
  public IContainerContent A() {
    return this.model.getContents().get(0);
  }
  
  public IContainerContent B() {
    return this.model.getContents().get(1);
  }
  
  public IContainerContent C() {
    return this.model.getContents().get(2);
  }
  
  public IContainerContent D() {
    return this.model.getContents().get(3);
  }
  
  public IContainerContent E() {
    return this.model.getContents().get(4);
  }
  
  public IContainerContent F() {
    return this.model.getContents().get(5);
  }
  
  public IContainerContent G() {
    return this.model.getContents().get(6);
  }
  
  public IContainerContent H() {
    return this.model.getContents().get(7);
  }
  
  public IContainerContent I() {
    return this.model.getContents().get(8);
  }
  
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
  
  @Override
  protected void analyzeResult(final Object expectedResultElement, final Object result) {
    super.analyzeResult(expectedResultElement, result);
    Assert.assertTrue((result instanceof Leaf));
    final Leaf leaf = ((Leaf) result);
    final BiConsumer<EObject, Collection<EStructuralFeature.Setting>> _function = (EObject k, Collection<EStructuralFeature.Setting> v) -> {
      final Consumer<EStructuralFeature.Setting> _function_1 = (EStructuralFeature.Setting it) -> {
        final Object tgt = it.get(false);
        if ((tgt instanceof EObject)) {
          Assert.assertFalse(((EObject)tgt).eIsProxy());
          Assert.assertEquals(this.model.eResource(), ((EObject)tgt).eResource());
        }
      };
      v.forEach(_function_1);
    };
    EcoreUtil.CrossReferencer.find(Collections.<Object>unmodifiableSet(CollectionLiterals.<Object>newHashSet(leaf))).forEach(_function);
  }
  
  @Override
  protected String resourceName() {
    return "test.reflang";
  }
  
  @Override
  protected Injector getInjector() {
    return TestRefLang.injector;
  }
  
  @Override
  protected String getFeatureName() {
    return "";
  }
  
  @Override
  protected IXtextSiriusModelDescriptor createModelDescriptor() {
    XtextDirectEditModelDescription _createXtextDirectEditModelDescription = this.diagramFactory.createXtextDirectEditModelDescription();
    final Procedure1<XtextDirectEditModelDescription> _function = (XtextDirectEditModelDescription it) -> {
      EList<String> _ignoredNestedFeatures = it.getIgnoredNestedFeatures();
      _ignoredNestedFeatures.add("references.target2");
    };
    XtextDirectEditModelDescription _doubleArrow = ObjectExtensions.<XtextDirectEditModelDescription>operator_doubleArrow(_createXtextDirectEditModelDescription, _function);
    return new XtextSiriusModelDescriptor(TestRefLang.injector, _doubleArrow);
  }
}
