/**
 * Copyright (C) 2018 Altran Netherlands B.V.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import com.altran.general.integration.xtextsirius.runtime.util.FakeResourceUtil;
import com.altran.general.integration.xtextsirius.test.AFowlerdslDefaultModelTest;
import java.util.List;
import java.util.stream.Stream;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public abstract class ATestFakeResourceUtil extends AFowlerdslDefaultModelTest {
  protected static class AccessibleFakeResourceUtil extends FakeResourceUtil {
    @Override
    public URI insertSynthetic(final URI uri) {
      return super.insertSynthetic(uri);
    }
    
    @Override
    public URI removeSynthetic(final URI uri) {
      return super.removeSynthetic(uri);
    }
    
    @Override
    public boolean equalsDisregardingSyntheticAndFileExtension(final URI a, final URI b) {
      return super.equalsDisregardingSyntheticAndFileExtension(a, b);
    }
    
    @Override
    public Stream<EObject> collectAllReferencedObjectsDeep(final EObject base) {
      return super.collectAllReferencedObjectsDeep(base);
    }
    
    @Override
    public Stream<EObject> collectAllReferencedObjects(final EObject base) {
      return super.collectAllReferencedObjects(base);
    }
  }
  
  protected ATestFakeResourceUtil.AccessibleFakeResourceUtil getAccessibleFakeResourceUtil() {
    return new ATestFakeResourceUtil.AccessibleFakeResourceUtil();
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
}
