package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import com.altran.general.integration.xtextsirius.test.util.fakeresourceutil.ATestFakeResourceUtil;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestInsertSynthetic extends ATestFakeResourceUtil {
  @Test
  public void simple() {
    final String uriString = "/proj/some.resource";
    final URI org = URI.createPlatformResourceURI(uriString, false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    final URI synth = _accessibleFakeResourceUtil.insertSynthetic(org);
    Assert.assertNotEquals(org, synth);
    List<String> _segmentsList = org.segmentsList();
    List<String> _front = this.<String>front(_segmentsList);
    Object[] _array = _front.toArray();
    List<String> _segmentsList_1 = synth.segmentsList();
    List<String> _front_1 = this.<String>front(_segmentsList_1);
    Object[] _array_1 = _front_1.toArray();
    Assert.assertArrayEquals(_array, _array_1);
    String _lastSegment = org.lastSegment();
    String _lastSegment_1 = synth.lastSegment();
    Assert.assertNotEquals(_lastSegment, _lastSegment_1);
  }
  
  @Test
  public void small() {
    final String uriString = "some.resource";
    final URI org = URI.createPlatformResourceURI(uriString, false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    final URI synth = _accessibleFakeResourceUtil.insertSynthetic(org);
    Assert.assertNotEquals(org, synth);
    List<String> _segmentsList = org.segmentsList();
    List<String> _front = this.<String>front(_segmentsList);
    Object[] _array = _front.toArray();
    List<String> _segmentsList_1 = synth.segmentsList();
    List<String> _front_1 = this.<String>front(_segmentsList_1);
    Object[] _array_1 = _front_1.toArray();
    Assert.assertArrayEquals(_array, _array_1);
    String _lastSegment = org.lastSegment();
    String _lastSegment_1 = synth.lastSegment();
    Assert.assertNotEquals(_lastSegment, _lastSegment_1);
  }
  
  @Test
  public void empty() {
    final String uriString = "";
    final URI org = URI.createURI(uriString, false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    final URI synth = _accessibleFakeResourceUtil.insertSynthetic(org);
    Assert.assertNotEquals(org, synth);
    List<String> _segmentsList = org.segmentsList();
    List<String> _front = this.<String>front(_segmentsList);
    Object[] _array = _front.toArray();
    List<String> _segmentsList_1 = synth.segmentsList();
    List<String> _front_1 = this.<String>front(_segmentsList_1);
    Object[] _array_1 = _front_1.toArray();
    Assert.assertArrayEquals(_array, _array_1);
    String _lastSegment = org.lastSegment();
    String _lastSegment_1 = synth.lastSegment();
    Assert.assertNotEquals(_lastSegment, _lastSegment_1);
  }
}
