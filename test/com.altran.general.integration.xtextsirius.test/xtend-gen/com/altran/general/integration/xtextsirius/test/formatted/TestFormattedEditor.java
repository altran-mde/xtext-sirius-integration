package com.altran.general.integration.xtextsirius.test.formatted;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.test.editor.ATestXtextSiriusModel;
import com.example.ClassesStandaloneSetup;
import com.example.classes.Attribute;
import com.example.classes.ClassModel;
import com.example.classes.ClassesFactory;
import com.example.classes.ClassesPackage;
import com.example.classes.Content;
import com.example.classes.IntegerLiteral;
import com.example.classes.Visibility;
import com.google.inject.Injector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFormattedEditor extends ATestXtextSiriusModel<ClassModel> {
  @Extension
  private ClassesFactory _classesFactory = ClassesFactory.eINSTANCE;
  
  private static Injector injector;
  
  @BeforeClass
  public static void loadEKeyDsl() {
    ClassesPackage.eINSTANCE.getNsPrefix();
    TestFormattedEditor.injector = new ClassesStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  @Test
  public void noEdit() {
    Content _get = this.model.getContent().get(1);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class B { + attr : integer [2 ..5]}");
    com.example.classes.Class _createClass = this._classesFactory.createClass();
    final Procedure1<com.example.classes.Class> _function = (com.example.classes.Class it) -> {
      it.setName("B");
      EList<Attribute> _attributes = it.getAttributes();
      Attribute _createAttribute = this._classesFactory.createAttribute();
      final Procedure1<Attribute> _function_1 = (Attribute it_1) -> {
        it_1.setName("attr");
        it_1.setVisibility(Visibility.PUBLIC);
        it_1.setType(this._classesFactory.createIntegerType());
        IntegerLiteral _createIntegerLiteral = this._classesFactory.createIntegerLiteral();
        final Procedure1<IntegerLiteral> _function_2 = (IntegerLiteral it_2) -> {
          it_2.setValue(2);
        };
        IntegerLiteral _doubleArrow = ObjectExtensions.<IntegerLiteral>operator_doubleArrow(_createIntegerLiteral, _function_2);
        it_1.setLowerBound(_doubleArrow);
        IntegerLiteral _createIntegerLiteral_1 = this._classesFactory.createIntegerLiteral();
        final Procedure1<IntegerLiteral> _function_3 = (IntegerLiteral it_2) -> {
          it_2.setValue(5);
        };
        IntegerLiteral _doubleArrow_1 = ObjectExtensions.<IntegerLiteral>operator_doubleArrow(_createIntegerLiteral_1, _function_3);
        it_1.setUpperBound(_doubleArrow_1);
      };
      Attribute _doubleArrow = ObjectExtensions.<Attribute>operator_doubleArrow(_createAttribute, _function_1);
      _attributes.add(_doubleArrow);
    };
    com.example.classes.Class _doubleArrow = ObjectExtensions.<com.example.classes.Class>operator_doubleArrow(_createClass, _function);
    this.assertModelEdit(_get, 
      this.model, _builder.toString(), 
      null, _doubleArrow);
  }
  
  @Test
  public void pseudoEdit() {
    Content _get = this.model.getContent().get(1);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class B { + attr : integer [2 ..5]}");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class B {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("+ attr: integer [2..5]");
    _builder_1.newLine();
    _builder_1.append("}");
    com.example.classes.Class _createClass = this._classesFactory.createClass();
    final Procedure1<com.example.classes.Class> _function = (com.example.classes.Class it) -> {
      it.setName("B");
      EList<Attribute> _attributes = it.getAttributes();
      Attribute _createAttribute = this._classesFactory.createAttribute();
      final Procedure1<Attribute> _function_1 = (Attribute it_1) -> {
        it_1.setName("attr");
        it_1.setVisibility(Visibility.PUBLIC);
        it_1.setType(this._classesFactory.createIntegerType());
        IntegerLiteral _createIntegerLiteral = this._classesFactory.createIntegerLiteral();
        final Procedure1<IntegerLiteral> _function_2 = (IntegerLiteral it_2) -> {
          it_2.setValue(2);
        };
        IntegerLiteral _doubleArrow = ObjectExtensions.<IntegerLiteral>operator_doubleArrow(_createIntegerLiteral, _function_2);
        it_1.setLowerBound(_doubleArrow);
        IntegerLiteral _createIntegerLiteral_1 = this._classesFactory.createIntegerLiteral();
        final Procedure1<IntegerLiteral> _function_3 = (IntegerLiteral it_2) -> {
          it_2.setValue(5);
        };
        IntegerLiteral _doubleArrow_1 = ObjectExtensions.<IntegerLiteral>operator_doubleArrow(_createIntegerLiteral_1, _function_3);
        it_1.setUpperBound(_doubleArrow_1);
      };
      Attribute _doubleArrow = ObjectExtensions.<Attribute>operator_doubleArrow(_createAttribute, _function_1);
      _attributes.add(_doubleArrow);
    };
    com.example.classes.Class _doubleArrow = ObjectExtensions.<com.example.classes.Class>operator_doubleArrow(_createClass, _function);
    this.assertModelEdit(_get, 
      this.model, _builder.toString(), _builder_1.toString(), _doubleArrow);
  }
  
  @Test
  public void edit() {
    Content _get = this.model.getContent().get(1);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class B { + attr : integer [2 ..5]}");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class B {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("+ attr2: string [2 .. 4]");
    _builder_1.newLine();
    _builder_1.append("}");
    com.example.classes.Class _createClass = this._classesFactory.createClass();
    final Procedure1<com.example.classes.Class> _function = (com.example.classes.Class it) -> {
      it.setName("B");
      EList<Attribute> _attributes = it.getAttributes();
      Attribute _createAttribute = this._classesFactory.createAttribute();
      final Procedure1<Attribute> _function_1 = (Attribute it_1) -> {
        it_1.setName("attr2");
        it_1.setVisibility(Visibility.PUBLIC);
        it_1.setType(this._classesFactory.createStringType());
        IntegerLiteral _createIntegerLiteral = this._classesFactory.createIntegerLiteral();
        final Procedure1<IntegerLiteral> _function_2 = (IntegerLiteral it_2) -> {
          it_2.setValue(2);
        };
        IntegerLiteral _doubleArrow = ObjectExtensions.<IntegerLiteral>operator_doubleArrow(_createIntegerLiteral, _function_2);
        it_1.setLowerBound(_doubleArrow);
        IntegerLiteral _createIntegerLiteral_1 = this._classesFactory.createIntegerLiteral();
        final Procedure1<IntegerLiteral> _function_3 = (IntegerLiteral it_2) -> {
          it_2.setValue(4);
        };
        IntegerLiteral _doubleArrow_1 = ObjectExtensions.<IntegerLiteral>operator_doubleArrow(_createIntegerLiteral_1, _function_3);
        it_1.setUpperBound(_doubleArrow_1);
      };
      Attribute _doubleArrow = ObjectExtensions.<Attribute>operator_doubleArrow(_createAttribute, _function_1);
      _attributes.add(_doubleArrow);
    };
    com.example.classes.Class _doubleArrow = ObjectExtensions.<com.example.classes.Class>operator_doubleArrow(_createClass, _function);
    this.assertModelEdit(_get, 
      this.model, _builder.toString(), _builder_1.toString(), _doubleArrow);
  }
  
  @Override
  protected CharSequence modelText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class Aaaaa {}class B { + attr : integer [2 ..5]}association x Aaaaa --> B [ 1 .. 1]");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  protected String resourceName() {
    return "test.classes";
  }
  
  @Override
  protected Injector getInjector() {
    return TestFormattedEditor.injector;
  }
  
  @Override
  protected String getFeatureName() {
    return "";
  }
  
  @Override
  protected IXtextSiriusModelDescriptor createModelDescriptor() {
    XtextDirectEditModelDescription _createXtextDirectEditModelDescription = this.diagramFactory.createXtextDirectEditModelDescription();
    final Procedure1<XtextDirectEditModelDescription> _function = (XtextDirectEditModelDescription it) -> {
      it.setMultiLine(true);
    };
    XtextDirectEditModelDescription _doubleArrow = ObjectExtensions.<XtextDirectEditModelDescription>operator_doubleArrow(_createXtextDirectEditModelDescription, _function);
    return new XtextSiriusModelDescriptor(TestFormattedEditor.injector, _doubleArrow);
  }
}
