package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestInsertSynthetic extends ATestFakeResourceUtil {
	@Test
	public void simple() {
		final String uriString = "/proj/some.resource";
		final URI org = URI.createPlatformResourceURI(uriString, false);
		final URI synth = getAccessibleFakeResourceUtil().insertSynthetic(org);
		Assert.assertNotEquals(org, synth);
		Assert.assertArrayEquals(this.<String> front(org.segmentsList()).toArray(),
				this.<String> front(synth.segmentsList()).toArray());
		Assert.assertNotEquals(org.lastSegment(), synth.lastSegment());
	}
	
	@Test
	public void small() {
		final String uriString = "some.resource";
		final URI org = URI.createPlatformResourceURI(uriString, false);
		final URI synth = getAccessibleFakeResourceUtil().insertSynthetic(org);
		Assert.assertNotEquals(org, synth);
		Assert.assertArrayEquals(this.<String> front(org.segmentsList()).toArray(),
				this.<String> front(synth.segmentsList()).toArray());
		Assert.assertNotEquals(org.lastSegment(), synth.lastSegment());
	}
	
	@Test
	public void empty() {
		final String uriString = "";
		final URI org = URI.createURI(uriString, false);
		final URI synth = getAccessibleFakeResourceUtil().insertSynthetic(org);
		Assert.assertNotEquals(org, synth);
		Assert.assertArrayEquals(this.<String> front(org.segmentsList()).toArray(),
				this.<String> front(synth.segmentsList()).toArray());
		Assert.assertNotEquals(org.lastSegment(), synth.lastSegment());
	}
}
