package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

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
		Assert.assertTrue(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void notEqual_nosynth() {
		final String uriString = "/proj/some.resource";
		final URI a = URI.createPlatformResourceURI(uriString, false);
		final URI b = URI.createPlatformResourceURI((uriString + "/other.file"), false);
		Assert.assertFalse(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void equal_synth() {
		final String uriString = "/proj/some.resource";
		final URI a = getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI(uriString, false));
		final URI b = getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI(uriString, false));
		Assert.assertTrue(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void notEqual_synth() {
		final String uriString = "/proj/some.resource";
		final URI a = getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI(uriString, false));
		final URI b = getAccessibleFakeResourceUtil()
				.insertSynthetic(URI.createPlatformResourceURI((uriString + "/other.file"), false));
		Assert.assertFalse(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void equal_synthA() {
		final String uriString = "/proj/some.resource";
		final URI a = getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI(uriString, false));
		final URI b = URI.createPlatformResourceURI(uriString, false);
		Assert.assertTrue(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void notEqual_synthA() {
		final String uriString = "/proj/some.resource";
		final URI a = getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI(uriString, false));
		final URI b = URI.createPlatformResourceURI((uriString + "/other.file"), false);
		Assert.assertFalse(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void equal_synthB() {
		final String uriString = "/proj/some.resource";
		final URI a = URI.createPlatformResourceURI(uriString, false);
		final URI b = getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI(uriString, false));
		Assert.assertTrue(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void notEqual_synthB() {
		final String uriString = "/proj/some.resource";
		final URI a = URI.createPlatformResourceURI(uriString, false);
		final URI b = getAccessibleFakeResourceUtil()
				.insertSynthetic(URI.createPlatformResourceURI((uriString + "/other.file"), false));
		Assert.assertFalse(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void equal_ext() {
		final String uriString = "/proj/some";
		final URI a = URI.createPlatformResourceURI((uriString + ".resource"), false);
		final URI b = URI.createPlatformResourceURI((uriString + ".resourceOther"), false);
		Assert.assertTrue(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void notEqual_ext() {
		final String uriString = "/proj/some";
		final URI a = URI.createPlatformResourceURI((uriString + ".resource"), false);
		final URI b = URI.createPlatformResourceURI((uriString + "x.resourceOther"), false);
		Assert.assertFalse(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void notEqual_doubleExt() {
		final String uriString = "/proj/some";
		final URI a = URI.createPlatformResourceURI((uriString + ".resource"), false);
		final URI b = URI.createPlatformResourceURI((uriString + ".resource.x"), false);
		Assert.assertFalse(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void equal_extSynthA() {
		final String uriString = "/proj/some";
		final URI a = getAccessibleFakeResourceUtil()
				.insertSynthetic(URI.createPlatformResourceURI((uriString + ".resource"), false));
		final URI b = URI.createPlatformResourceURI((uriString + ".resourceOther"), false);
		Assert.assertTrue(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void equal_extSynthB() {
		final String uriString = "/proj/some";
		final URI a = URI.createPlatformResourceURI((uriString + ".resource"), false);
		final URI b = getAccessibleFakeResourceUtil()
				.insertSynthetic(URI.createPlatformResourceURI((uriString + ".resourceOther"), false));
		Assert.assertTrue(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void notEqual_extSynthA() {
		final String uriString = "/proj/some";
		final URI a = getAccessibleFakeResourceUtil()
				.insertSynthetic(URI.createPlatformResourceURI((uriString + "x.resource"), false));
		final URI b = URI.createPlatformResourceURI((uriString + ".resourceOther"), false);
		Assert.assertFalse(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
	
	@Test
	public void notEqual_extSynthB() {
		final String uriString = "/proj/some";
		final URI a = URI.createPlatformResourceURI((uriString + "x.resource"), false);
		final URI b = getAccessibleFakeResourceUtil()
				.insertSynthetic(URI.createPlatformResourceURI((uriString + ".resourceOther"), false));
		Assert.assertFalse(getAccessibleFakeResourceUtil().equalsDisregardingSyntheticAndFileExtension(a, b));
	}
}
