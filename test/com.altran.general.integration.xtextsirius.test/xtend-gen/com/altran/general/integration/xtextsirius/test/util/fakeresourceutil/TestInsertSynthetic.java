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
import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestInsertSynthetic extends ATestFakeResourceUtil {
  @Test
  public void simple() {
    final String uriString = "/proj/some.resource";
    final URI org = URI.createPlatformResourceURI(uriString, false);
    final URI synth = this.getAccessibleFakeResourceUtil().insertSynthetic(org);
    Assert.assertNotEquals(org, synth);
    Assert.assertArrayEquals(this.<String>front(org.segmentsList()).toArray(), this.<String>front(synth.segmentsList()).toArray());
    Assert.assertNotEquals(org.lastSegment(), synth.lastSegment());
  }
  
  @Test
  public void small() {
    final String uriString = "some.resource";
    final URI org = URI.createPlatformResourceURI(uriString, false);
    final URI synth = this.getAccessibleFakeResourceUtil().insertSynthetic(org);
    Assert.assertNotEquals(org, synth);
    Assert.assertArrayEquals(this.<String>front(org.segmentsList()).toArray(), this.<String>front(synth.segmentsList()).toArray());
    Assert.assertNotEquals(org.lastSegment(), synth.lastSegment());
  }
  
  @Test
  public void empty() {
    final String uriString = "";
    final URI org = URI.createURI(uriString, false);
    final URI synth = this.getAccessibleFakeResourceUtil().insertSynthetic(org);
    Assert.assertNotEquals(org, synth);
    Assert.assertArrayEquals(this.<String>front(org.segmentsList()).toArray(), this.<String>front(synth.segmentsList()).toArray());
    Assert.assertNotEquals(org.lastSegment(), synth.lastSegment());
  }
}
