package com.altran.general.integration.xtextsirius.test.util.ecorehelper;

import com.altran.general.integration.xtextsirius.test.util.ecorehelper.ATestEcoreHelper;
import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEqualsDisregardingSynthetic extends ATestEcoreHelper {
  @Test
  public void equal_nosynth() {
    final String uriString = "/proj/some.resource";
    final URI a = URI.createPlatformResourceURI(uriString, false);
    final URI b = URI.createPlatformResourceURI(uriString, false);
    Assert.assertTrue(this.getAccessibleEcoreHelper().equalsDisregardingSyntheticA(a, b));
  }
  
  @Test
  public void notEqual_nosynth() {
    final String uriString = "/proj/some.resource";
    final URI a = URI.createPlatformResourceURI(uriString, false);
    final URI b = URI.createPlatformResourceURI((uriString + "/other.file"), false);
    Assert.assertFalse(this.getAccessibleEcoreHelper().equalsDisregardingSyntheticA(a, b));
  }
  
  @Test
  public void equal_synth() {
    final String uriString = "/proj/some.resource";
    final URI a = this.getAccessibleEcoreHelper().insertSyntheticA(URI.createPlatformResourceURI(uriString, false));
    final URI b = this.getAccessibleEcoreHelper().insertSyntheticA(URI.createPlatformResourceURI(uriString, false));
    Assert.assertTrue(this.getAccessibleEcoreHelper().equalsDisregardingSyntheticA(a, b));
  }
  
  @Test
  public void notEqual_synth() {
    final String uriString = "/proj/some.resource";
    final URI a = this.getAccessibleEcoreHelper().insertSyntheticA(URI.createPlatformResourceURI(uriString, false));
    final URI b = this.getAccessibleEcoreHelper().insertSyntheticA(URI.createPlatformResourceURI((uriString + "/other.file"), false));
    Assert.assertFalse(this.getAccessibleEcoreHelper().equalsDisregardingSyntheticA(a, b));
  }
  
  @Test
  public void equal_synthA() {
    final String uriString = "/proj/some.resource";
    final URI a = this.getAccessibleEcoreHelper().insertSyntheticA(URI.createPlatformResourceURI(uriString, false));
    final URI b = URI.createPlatformResourceURI(uriString, false);
    Assert.assertTrue(this.getAccessibleEcoreHelper().equalsDisregardingSyntheticA(a, b));
  }
  
  @Test
  public void notEqual_synthA() {
    final String uriString = "/proj/some.resource";
    final URI a = this.getAccessibleEcoreHelper().insertSyntheticA(URI.createPlatformResourceURI(uriString, false));
    final URI b = URI.createPlatformResourceURI((uriString + "/other.file"), false);
    Assert.assertFalse(this.getAccessibleEcoreHelper().equalsDisregardingSyntheticA(a, b));
  }
  
  @Test
  public void equal_synthB() {
    final String uriString = "/proj/some.resource";
    final URI a = URI.createPlatformResourceURI(uriString, false);
    final URI b = this.getAccessibleEcoreHelper().insertSyntheticA(URI.createPlatformResourceURI(uriString, false));
    Assert.assertTrue(this.getAccessibleEcoreHelper().equalsDisregardingSyntheticA(a, b));
  }
  
  @Test
  public void notEqual_synthB() {
    final String uriString = "/proj/some.resource";
    final URI a = URI.createPlatformResourceURI(uriString, false);
    final URI b = this.getAccessibleEcoreHelper().insertSyntheticA(URI.createPlatformResourceURI((uriString + "/other.file"), false));
    Assert.assertFalse(this.getAccessibleEcoreHelper().equalsDisregardingSyntheticA(a, b));
  }
}
