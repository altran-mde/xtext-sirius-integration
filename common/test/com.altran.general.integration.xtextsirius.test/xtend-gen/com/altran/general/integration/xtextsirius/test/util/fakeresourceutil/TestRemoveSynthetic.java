package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import com.altran.general.integration.xtextsirius.test.util.fakeresourceutil.ATestFakeResourceUtil;
import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestRemoveSynthetic extends ATestFakeResourceUtil {
  @Test
  public void nonSynth_simple() {
    final String uriString = "/proj/some.resource";
    final URI org = URI.createPlatformResourceURI(uriString, false);
    final URI unsynth = this.getAccessibleFakeResourceUtil().removeSynthetic(org);
    Assert.assertEquals(org, unsynth);
  }
  
  @Test
  public void nonSynth_small() {
    final String uriString = "some.resource";
    final URI org = URI.createPlatformResourceURI(uriString, false);
    final URI unsynth = this.getAccessibleFakeResourceUtil().removeSynthetic(org);
    Assert.assertEquals(org, unsynth);
  }
  
  @Test
  public void nonSynth_empty() {
    final String uriString = "";
    final URI org = URI.createURI(uriString, false);
    final URI unsynth = this.getAccessibleFakeResourceUtil().removeSynthetic(org);
    Assert.assertEquals(org, unsynth);
  }
  
  @Test
  public void synth_simple() {
    final String uriString = "/proj/some.resource";
    final URI org = URI.createPlatformResourceURI(uriString, false);
    final URI synth = this.getAccessibleFakeResourceUtil().insertSynthetic(org);
    final URI unsynth = this.getAccessibleFakeResourceUtil().removeSynthetic(org);
    Assert.assertNotEquals(org, synth);
    Assert.assertEquals(org, unsynth);
    Assert.assertArrayEquals(this.<String>front(org.segmentsList()).toArray(), this.<String>front(synth.segmentsList()).toArray());
    Assert.assertNotEquals(org.lastSegment(), synth.lastSegment());
  }
  
  @Test
  public void synth_small() {
    final String uriString = "some.resource";
    final URI org = URI.createPlatformResourceURI(uriString, false);
    final URI synth = this.getAccessibleFakeResourceUtil().insertSynthetic(org);
    final URI unsynth = this.getAccessibleFakeResourceUtil().removeSynthetic(org);
    Assert.assertNotEquals(org, synth);
    Assert.assertEquals(org, unsynth);
    Assert.assertArrayEquals(this.<String>front(org.segmentsList()).toArray(), this.<String>front(synth.segmentsList()).toArray());
    Assert.assertNotEquals(org.lastSegment(), synth.lastSegment());
  }
  
  @Test
  public void synth_empty() {
    final String uriString = "";
    final URI org = URI.createURI(uriString, false);
    final URI synth = this.getAccessibleFakeResourceUtil().insertSynthetic(org);
    final URI unsynth = this.getAccessibleFakeResourceUtil().removeSynthetic(org);
    Assert.assertNotEquals(org, synth);
    Assert.assertEquals(org, unsynth);
    Assert.assertArrayEquals(this.<String>front(org.segmentsList()).toArray(), this.<String>front(synth.segmentsList()).toArray());
    Assert.assertNotEquals(org.lastSegment(), synth.lastSegment());
  }
}
