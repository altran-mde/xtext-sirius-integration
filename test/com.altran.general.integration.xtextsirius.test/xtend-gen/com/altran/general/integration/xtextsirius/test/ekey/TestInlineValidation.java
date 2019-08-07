package com.altran.general.integration.xtextsirius.test.ekey;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusSyntaxErrorException;
import com.altran.general.integration.xtextsirius.runtime.exception.XtextSiriusValidationErrorException;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Container;
import com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangFactory;
import com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Group;
import com.altran.general.integration.xtextsirius.test.EKeyLang.Leaf;
import com.altran.general.integration.xtextsirius.test.EKeyLangStandaloneSetup;
import com.altran.general.integration.xtextsirius.test.editor.ATestXtextSiriusModel;
import com.google.common.collect.Iterables;
import com.google.inject.Injector;
import java.util.Collections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("all")
public class TestInlineValidation extends ATestXtextSiriusModel<Container> {
  @Extension
  private EKeyLangFactory _eKeyLangFactory = EKeyLangFactory.eINSTANCE;
  
  private static Injector injector;
  
  @BeforeClass
  public static void loadEKeyDsl() {
    EKeyLangPackage.eINSTANCE.getNsPrefix();
    TestInlineValidation.injector = new EKeyLangStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  @Test
  public void validEdit() {
    final Group group = IterableExtensions.<Group>head(Iterables.<Group>filter(this.model.getContents(), Group.class));
    EList<Leaf> _leafs = group.getLeafs();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("c 4");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("d 0815");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("b 22");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("e 44");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("d 08155");
    Leaf _createLeaf = this._eKeyLangFactory.createLeaf();
    final Procedure1<Leaf> _function = (Leaf it) -> {
      it.setName("b");
      it.setNumber(22);
    };
    Leaf _doubleArrow = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf, _function);
    Leaf _createLeaf_1 = this._eKeyLangFactory.createLeaf();
    final Procedure1<Leaf> _function_1 = (Leaf it) -> {
      it.setName("e");
      it.setNumber(44);
    };
    Leaf _doubleArrow_1 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_1, _function_1);
    Leaf _createLeaf_2 = this._eKeyLangFactory.createLeaf();
    final Procedure1<Leaf> _function_2 = (Leaf it) -> {
      it.setName("d");
      it.setNumber(8155);
    };
    Leaf _doubleArrow_2 = ObjectExtensions.<Leaf>operator_doubleArrow(_createLeaf_2, _function_2);
    this.assertModelEdit(_leafs, group, _builder.toString(), _builder_1.toString(), 
      Collections.<Leaf>unmodifiableList(CollectionLiterals.<Leaf>newArrayList(_doubleArrow, _doubleArrow_1, _doubleArrow_2)));
  }
  
  @Test(expected = XtextSiriusValidationErrorException.class)
  public void invalidEdit() {
    final Group group = IterableExtensions.<Group>head(Iterables.<Group>filter(this.model.getContents(), Group.class));
    EList<Leaf> _leafs = group.getLeafs();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("c 4");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("d 0815");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("b 22");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("b 44");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("d 08155");
    this.assertModelEdit(_leafs, group, _builder.toString(), _builder_1.toString(), 
      null);
  }
  
  @Test(expected = XtextSiriusSyntaxErrorException.class)
  public void syntaxErrorEdit() {
    final Group group = IterableExtensions.<Group>head(Iterables.<Group>filter(this.model.getContents(), Group.class));
    EList<Leaf> _leafs = group.getLeafs();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("b 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("c 4");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("d 0815");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("whatever");
    this.assertModelEdit(_leafs, group, _builder.toString(), _builder_1.toString(), 
      null);
  }
  
  @Override
  protected CharSequence modelText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Container test");
    _builder.newLine();
    _builder.newLine();
    _builder.append("group1 {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("b 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("c 4");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("d 0815");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  protected String resourceName() {
    return "test.ekeylang";
  }
  
  @Override
  protected Injector getInjector() {
    return TestInlineValidation.injector;
  }
  
  @Override
  protected String getFeatureName() {
    return "leafs";
  }
  
  @Override
  protected IXtextSiriusModelDescriptor createModelDescriptor() {
    XtextDirectEditModelDescription _createXtextDirectEditModelDescription = this.diagramFactory.createXtextDirectEditModelDescription();
    final Procedure1<XtextDirectEditModelDescription> _function = (XtextDirectEditModelDescription it) -> {
      it.setMultiLine(true);
      it.setCancelOnValidationError(true);
    };
    XtextDirectEditModelDescription _doubleArrow = ObjectExtensions.<XtextDirectEditModelDescription>operator_doubleArrow(_createXtextDirectEditModelDescription, _function);
    return new XtextSiriusModelDescriptor(TestInlineValidation.injector, _doubleArrow);
  }
}
