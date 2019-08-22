package com.altran.general.integration.xtextsirius.test.formatted;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.XtextDirectEditModelDescription;
import com.altran.general.integration.xtextsirius.runtime.descriptor.IXtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.runtime.descriptor.XtextSiriusModelDescriptor;
import com.altran.general.integration.xtextsirius.test.editor.ATestXtextSiriusModel;
import com.example.ClassesStandaloneSetup;
import com.example.classes.Attribute;
import com.example.classes.ClassModel;
import com.example.classes.ClassRef;
import com.example.classes.ClassesFactory;
import com.example.classes.ClassesPackage;
import com.example.classes.Content;
import com.example.classes.IntegerLiteral;
import com.example.classes.Visibility;
import com.google.inject.Injector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("all")
public class TestFormattedIgnoreNested extends ATestXtextSiriusModel<ClassModel> {
  @Extension
  private ClassesFactory _classesFactory = ClassesFactory.eINSTANCE;
  
  private static Injector injector;
  
  @BeforeClass
  public static void loadEKeyDsl() {
    ClassesPackage.eINSTANCE.getNsPrefix();
    TestFormattedIgnoreNested.injector = new ClassesStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  @Test
  public void changeNested() {
    Content _last = IterableExtensions.<Content>last(this.model.getContent());
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class D {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class A {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("class B {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("+ inB: C[0..1]");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("+ inA: C[0..1]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("class D {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("class A {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("class B {");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.append("+ inB: E[0..1]");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("+ inA: E[0..1]");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    com.example.classes.Class _createClass = this._classesFactory.createClass();
    final Procedure1<com.example.classes.Class> _function = (com.example.classes.Class it) -> {
      it.setName("D");
      EList<com.example.classes.Class> _subClasses = it.getSubClasses();
      com.example.classes.Class _createClass_1 = this._classesFactory.createClass();
      final Procedure1<com.example.classes.Class> _function_1 = (com.example.classes.Class it_1) -> {
        it_1.setName("A");
        EList<Attribute> _attributes = it_1.getAttributes();
        Attribute _createAttribute = this._classesFactory.createAttribute();
        final Procedure1<Attribute> _function_2 = (Attribute it_2) -> {
          it_2.setName("inA");
          it_2.setVisibility(Visibility.PUBLIC);
          ClassRef _createClassRef = this._classesFactory.createClassRef();
          final Procedure1<ClassRef> _function_3 = (ClassRef it_3) -> {
            Content _head = IterableExtensions.<Content>head(this.model.getContent());
            it_3.setTarget(((com.example.classes.Class) _head));
          };
          ClassRef _doubleArrow = ObjectExtensions.<ClassRef>operator_doubleArrow(_createClassRef, _function_3);
          it_2.setType(_doubleArrow);
          IntegerLiteral _createIntegerLiteral = this._classesFactory.createIntegerLiteral();
          final Procedure1<IntegerLiteral> _function_4 = (IntegerLiteral it_3) -> {
            it_3.setValue(0);
          };
          IntegerLiteral _doubleArrow_1 = ObjectExtensions.<IntegerLiteral>operator_doubleArrow(_createIntegerLiteral, _function_4);
          it_2.setLowerBound(_doubleArrow_1);
          IntegerLiteral _createIntegerLiteral_1 = this._classesFactory.createIntegerLiteral();
          final Procedure1<IntegerLiteral> _function_5 = (IntegerLiteral it_3) -> {
            it_3.setValue(1);
          };
          IntegerLiteral _doubleArrow_2 = ObjectExtensions.<IntegerLiteral>operator_doubleArrow(_createIntegerLiteral_1, _function_5);
          it_2.setUpperBound(_doubleArrow_2);
        };
        Attribute _doubleArrow = ObjectExtensions.<Attribute>operator_doubleArrow(_createAttribute, _function_2);
        _attributes.add(_doubleArrow);
        EList<com.example.classes.Class> _subClasses_1 = it_1.getSubClasses();
        com.example.classes.Class _createClass_2 = this._classesFactory.createClass();
        final Procedure1<com.example.classes.Class> _function_3 = (com.example.classes.Class it_2) -> {
          it_2.setName("B");
          EList<Attribute> _attributes_1 = it_2.getAttributes();
          Attribute _createAttribute_1 = this._classesFactory.createAttribute();
          final Procedure1<Attribute> _function_4 = (Attribute it_3) -> {
            it_3.setName("inB");
            it_3.setVisibility(Visibility.PUBLIC);
            ClassRef _createClassRef = this._classesFactory.createClassRef();
            final Procedure1<ClassRef> _function_5 = (ClassRef it_4) -> {
              Content _get = this.model.getContent().get(1);
              it_4.setTarget(((com.example.classes.Class) _get));
            };
            ClassRef _doubleArrow_1 = ObjectExtensions.<ClassRef>operator_doubleArrow(_createClassRef, _function_5);
            it_3.setType(_doubleArrow_1);
            IntegerLiteral _createIntegerLiteral = this._classesFactory.createIntegerLiteral();
            final Procedure1<IntegerLiteral> _function_6 = (IntegerLiteral it_4) -> {
              it_4.setValue(0);
            };
            IntegerLiteral _doubleArrow_2 = ObjectExtensions.<IntegerLiteral>operator_doubleArrow(_createIntegerLiteral, _function_6);
            it_3.setLowerBound(_doubleArrow_2);
            IntegerLiteral _createIntegerLiteral_1 = this._classesFactory.createIntegerLiteral();
            final Procedure1<IntegerLiteral> _function_7 = (IntegerLiteral it_4) -> {
              it_4.setValue(1);
            };
            IntegerLiteral _doubleArrow_3 = ObjectExtensions.<IntegerLiteral>operator_doubleArrow(_createIntegerLiteral_1, _function_7);
            it_3.setUpperBound(_doubleArrow_3);
          };
          Attribute _doubleArrow_1 = ObjectExtensions.<Attribute>operator_doubleArrow(_createAttribute_1, _function_4);
          _attributes_1.add(_doubleArrow_1);
        };
        com.example.classes.Class _doubleArrow_1 = ObjectExtensions.<com.example.classes.Class>operator_doubleArrow(_createClass_2, _function_3);
        _subClasses_1.add(_doubleArrow_1);
      };
      com.example.classes.Class _doubleArrow = ObjectExtensions.<com.example.classes.Class>operator_doubleArrow(_createClass_1, _function_1);
      _subClasses.add(_doubleArrow);
    };
    com.example.classes.Class _doubleArrow = ObjectExtensions.<com.example.classes.Class>operator_doubleArrow(_createClass, _function);
    this.assertModelEdit(_last, 
      this.model, _builder.toString(), _builder_1.toString(), _doubleArrow);
  }
  
  @Override
  protected CharSequence modelText() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class C {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class E {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class D {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("class A {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("class B {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("+ inB: C[0..1]");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("+ inA: C[0..1]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  protected String resourceName() {
    return "test.classes";
  }
  
  @Override
  protected Injector getInjector() {
    return TestFormattedIgnoreNested.injector;
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
      EList<String> _ignoredNestedFeatures = it.getIgnoredNestedFeatures();
      _ignoredNestedFeatures.add("subClasses.attributes");
    };
    XtextDirectEditModelDescription _doubleArrow = ObjectExtensions.<XtextDirectEditModelDescription>operator_doubleArrow(_createXtextDirectEditModelDescription, _function);
    return new XtextSiriusModelDescriptor(TestFormattedIgnoreNested.injector, _doubleArrow);
  }
}
