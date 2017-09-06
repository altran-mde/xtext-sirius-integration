package com.altran.general.integration.xtextsirius.test.util.ecorehelper;

import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import com.altran.general.integration.xtextsirius.util.EcoreHelper;
import com.google.common.base.Objects;
import java.util.List;
import java.util.stream.Stream;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class ATestEcoreHelper extends AFowlerdslDefaultModelTest {
  protected static class AccessibleEcoreHelper extends EcoreHelper {
    public URI insertSyntheticA(final URI uri) {
      return EcoreHelper.insertSynthetic(uri);
    }
    
    public URI removeSyntheticA(final URI uri) {
      return EcoreHelper.removeSynthetic(uri);
    }
    
    public boolean equalsDisregardingSyntheticA(final URI a, final URI b) {
      return EcoreHelper.equalsDisregardingSynthetic(a, b);
    }
    
    public Stream<EObject> collectAllReferencedObjectsDeepA(final EObject base) {
      return EcoreHelper.collectAllReferencedObjectsDeep(base);
    }
    
    public Stream<EObject> collectAllReferencedObjectsA(final EObject base) {
      return EcoreHelper.collectAllReferencedObjects(base);
    }
  }
  
  protected ATestEcoreHelper.AccessibleEcoreHelper getAccessibleEcoreHelper() {
    return new ATestEcoreHelper.AccessibleEcoreHelper();
  }
  
  protected <T extends Object> List<T> front(final List<T> list) {
    List<T> _xblockexpression = null;
    {
      int _size = list.size();
      boolean _lessThan = (_size < 2);
      if (_lessThan) {
        return CollectionLiterals.<T>emptyList();
      }
      int _size_1 = list.size();
      int _minus = (_size_1 - 2);
      _xblockexpression = list.subList(0, _minus);
    }
    return _xblockexpression;
  }
  
  protected EObject findFirstByName(final List<EObject> list, final String name) {
    final Function1<EObject, Boolean> _function = (EObject it) -> {
      Object _eGet = it.eGet(it.eClass().getEStructuralFeature("name"));
      return Boolean.valueOf(Objects.equal(_eGet, name));
    };
    return IterableExtensions.<EObject>findFirst(list, _function);
  }
}
