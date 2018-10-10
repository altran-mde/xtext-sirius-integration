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

import com.altran.general.integration.xtextsirius.test.util.fakeresourceutil.ATestFakeResourceUtil;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Guard;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestCollectAllReferencedObjects extends ATestFakeResourceUtil {
  @Test
  public void empty() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(0);
    final List<EObject> objects = this.getAccessibleFakeResourceUtil().collectAllReferencedObjects(event).collect(Collectors.<EObject>toList());
    Assert.assertEquals(0, objects.size());
  }
  
  @Test
  public void empty_shallow() {
    final Statemachine model = this.getDefaultModel();
    final Event event = model.getEvents().get(2);
    final List<EObject> objects = this.getAccessibleFakeResourceUtil().collectAllReferencedObjects(event).collect(Collectors.<EObject>toList());
    Assert.assertEquals(0, objects.size());
  }
  
  @Test
  public void simple() {
    final Statemachine model = this.getDefaultModel();
    final Guard guard = model.getEvents().get(4).getGuard();
    final List<EObject> objects = this.getAccessibleFakeResourceUtil().collectAllReferencedObjectsDeep(guard).collect(Collectors.<EObject>toList());
    Assert.assertEquals(objects.toString(), 2, objects.size());
    Assert.assertNotNull(this.<EObject>findFirstByName(objects, "constant2"));
    Assert.assertNotNull(this.<EObject>findFirstByName(objects, "constant3X"));
  }
}
