package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import com.altran.general.integration.xtextsirius.test.util.fakeresourceutil.ATestFakeResourceUtil;
import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEqualsDisregardingSyntheticAndFileExtension extends ATestFakeResourceUtil {
  @Test
  public void equal_nosynth() {
    final String uriString = "/proj/some.resource";
    final URI a = URI.createPlatformResourceURI(uriString, false);
    final URI b = URI.createPlatformResourceURI(uriString, false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertTrue(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void notEqual_nosynth() {
    final String uriString = "/proj/some.resource";
    final URI a = URI.createPlatformResourceURI(uriString, false);
    final URI b = URI.createPlatformResourceURI((uriString + "/other.file"), false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertFalse(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void equal_synth() {
    final String uriString = "/proj/some.resource";
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI(uriString, false);
    final URI a = _accessibleFakeResourceUtil.insertSynthetic(_createPlatformResourceURI);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil_1 = this.getAccessibleFakeResourceUtil();
    URI _createPlatformResourceURI_1 = URI.createPlatformResourceURI(uriString, false);
    final URI b = _accessibleFakeResourceUtil_1.insertSynthetic(_createPlatformResourceURI_1);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil_2 = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil_2.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertTrue(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void notEqual_synth() {
    final String uriString = "/proj/some.resource";
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI(uriString, false);
    final URI a = _accessibleFakeResourceUtil.insertSynthetic(_createPlatformResourceURI);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil_1 = this.getAccessibleFakeResourceUtil();
    URI _createPlatformResourceURI_1 = URI.createPlatformResourceURI((uriString + "/other.file"), false);
    final URI b = _accessibleFakeResourceUtil_1.insertSynthetic(_createPlatformResourceURI_1);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil_2 = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil_2.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertFalse(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void equal_synthA() {
    final String uriString = "/proj/some.resource";
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI(uriString, false);
    final URI a = _accessibleFakeResourceUtil.insertSynthetic(_createPlatformResourceURI);
    final URI b = URI.createPlatformResourceURI(uriString, false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil_1 = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil_1.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertTrue(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void notEqual_synthA() {
    final String uriString = "/proj/some.resource";
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI(uriString, false);
    final URI a = _accessibleFakeResourceUtil.insertSynthetic(_createPlatformResourceURI);
    final URI b = URI.createPlatformResourceURI((uriString + "/other.file"), false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil_1 = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil_1.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertFalse(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void equal_synthB() {
    final String uriString = "/proj/some.resource";
    final URI a = URI.createPlatformResourceURI(uriString, false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI(uriString, false);
    final URI b = _accessibleFakeResourceUtil.insertSynthetic(_createPlatformResourceURI);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil_1 = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil_1.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertTrue(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void notEqual_synthB() {
    final String uriString = "/proj/some.resource";
    final URI a = URI.createPlatformResourceURI(uriString, false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI((uriString + "/other.file"), false);
    final URI b = _accessibleFakeResourceUtil.insertSynthetic(_createPlatformResourceURI);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil_1 = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil_1.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertFalse(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void equal_ext() {
    final String uriString = "/proj/some";
    final URI a = URI.createPlatformResourceURI((uriString + ".resource"), false);
    final URI b = URI.createPlatformResourceURI((uriString + ".resourceOther"), false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertTrue(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void notEqual_ext() {
    final String uriString = "/proj/some";
    final URI a = URI.createPlatformResourceURI((uriString + ".resource"), false);
    final URI b = URI.createPlatformResourceURI((uriString + "x.resourceOther"), false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertFalse(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void notEqual_doubleExt() {
    final String uriString = "/proj/some";
    final URI a = URI.createPlatformResourceURI((uriString + ".resource"), false);
    final URI b = URI.createPlatformResourceURI((uriString + ".resource.x"), false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertFalse(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void equal_extSynthA() {
    final String uriString = "/proj/some";
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI((uriString + ".resource"), false);
    final URI a = _accessibleFakeResourceUtil.insertSynthetic(_createPlatformResourceURI);
    final URI b = URI.createPlatformResourceURI((uriString + ".resourceOther"), false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil_1 = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil_1.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertTrue(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void equal_extSynthB() {
    final String uriString = "/proj/some";
    final URI a = URI.createPlatformResourceURI((uriString + ".resource"), false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI((uriString + ".resourceOther"), false);
    final URI b = _accessibleFakeResourceUtil.insertSynthetic(_createPlatformResourceURI);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil_1 = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil_1.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertTrue(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void notEqual_extSynthA() {
    final String uriString = "/proj/some";
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI((uriString + "x.resource"), false);
    final URI a = _accessibleFakeResourceUtil.insertSynthetic(_createPlatformResourceURI);
    final URI b = URI.createPlatformResourceURI((uriString + ".resourceOther"), false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil_1 = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil_1.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertFalse(_equalsDisregardingSyntheticAndFileExtension);
  }
  
  @Test
  public void notEqual_extSynthB() {
    final String uriString = "/proj/some";
    final URI a = URI.createPlatformResourceURI((uriString + "x.resource"), false);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil = this.getAccessibleFakeResourceUtil();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI((uriString + ".resourceOther"), false);
    final URI b = _accessibleFakeResourceUtil.insertSynthetic(_createPlatformResourceURI);
    ATestFakeResourceUtil.AccessibleFakeResourceUtil _accessibleFakeResourceUtil_1 = this.getAccessibleFakeResourceUtil();
    boolean _equalsDisregardingSyntheticAndFileExtension = _accessibleFakeResourceUtil_1.equalsDisregardingSyntheticAndFileExtension(a, b);
    Assert.assertFalse(_equalsDisregardingSyntheticAndFileExtension);
  }
}
