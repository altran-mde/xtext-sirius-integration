package com.altran.general.integration.xtextsirius.test.reflang;

import com.altran.general.integration.xtextsirius.test.editor.ATestXtextSiriusModel;
import com.altran.general.integration.xtextsirius.test.reflang.RefLangStandaloneSetup;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.Container;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.IContainerContent;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangFactory;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage;
import com.altran.general.integration.xtextsirius.test.reflang.refLang.SubContainer;
import com.google.inject.Injector;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.BeforeClass;

@SuppressWarnings("all")
public abstract class ATestRefLang extends ATestXtextSiriusModel<Container> {
  @Extension
  protected RefLangFactory _refLangFactory = RefLangFactory.eINSTANCE;
  
  private static Injector injector;
  
  @BeforeClass
  public static void loadEKeyDsl() {
    RefLangPackage.eINSTANCE.getNsPrefix();
    ATestRefLang.injector = new RefLangStandaloneSetup().createInjectorAndDoEMFRegistration();
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
    _builder.append("I {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("J L");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("1 -> A / B -> J");
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
  
  public SubContainer I() {
    IContainerContent _get = this.model.getContents().get(8);
    return ((SubContainer) _get);
  }
  
  @Override
  protected String resourceName() {
    return "test.reflang";
  }
  
  @Override
  protected Injector getInjector() {
    return ATestRefLang.injector;
  }
  
  @Override
  protected void analyzeResult(final Object expectedResultElement, final Object result) {
    super.analyzeResult(expectedResultElement, result);
    Collection<EObject> _switchResult = null;
    boolean _matched = false;
    if (result instanceof EObject) {
      _matched=true;
      _switchResult = Collections.<EObject>unmodifiableSet(CollectionLiterals.<EObject>newHashSet(((EObject)result)));
    }
    if (!_matched) {
      if (result instanceof List) {
        _matched=true;
        _switchResult = ((Collection<EObject>)result);
      }
    }
    final Collection<EObject> base = _switchResult;
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
    EcoreUtil.CrossReferencer.find(base).forEach(_function);
  }
}
