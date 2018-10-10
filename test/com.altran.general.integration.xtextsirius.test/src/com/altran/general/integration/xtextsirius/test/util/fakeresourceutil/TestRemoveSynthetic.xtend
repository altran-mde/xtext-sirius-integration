package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil

import org.eclipse.emf.common.util.URI
import org.junit.Test

import static org.junit.Assert.*

class TestRemoveSynthetic extends ATestFakeResourceUtil {
	@Test
	def nonSynth_simple() {
		val uriString = "/proj/some.resource"
		val org = URI.createPlatformResourceURI(uriString, false)
		val unsynth = accessibleFakeResourceUtil.removeSynthetic(org)

		assertEquals(org, unsynth)
	}

	@Test
	def nonSynth_small() {
		val uriString = "some.resource"
		val org = URI.createPlatformResourceURI(uriString, false)
		val unsynth = accessibleFakeResourceUtil.removeSynthetic(org)

		assertEquals(org, unsynth)
	}

	@Test
	def nonSynth_empty() {
		val uriString = ""
		val org = URI.createURI(uriString, false)
		val unsynth = accessibleFakeResourceUtil.removeSynthetic(org)

		assertEquals(org, unsynth)
	}

	@Test
	def synth_simple() {
		val uriString = "/proj/some.resource"
		val org = URI.createPlatformResourceURI(uriString, false)
		val synth = accessibleFakeResourceUtil.insertSynthetic(org)
		val unsynth = accessibleFakeResourceUtil.removeSynthetic(org)

		assertNotEquals(org, synth)
		assertEquals(org, unsynth)
		assertArrayEquals(org.segmentsList.front.toArray, synth.segmentsList.front.toArray)
		assertNotEquals(org.lastSegment, synth.lastSegment)
	}

	@Test
	def synth_small() {
		val uriString = "some.resource"
		val org = URI.createPlatformResourceURI(uriString, false)
		val synth = accessibleFakeResourceUtil.insertSynthetic(org)
		val unsynth = accessibleFakeResourceUtil.removeSynthetic(org)

		assertNotEquals(org, synth)
		assertEquals(org, unsynth)
		assertArrayEquals(org.segmentsList.front.toArray, synth.segmentsList.front.toArray)
		assertNotEquals(org.lastSegment, synth.lastSegment)
	}

	@Test
	def synth_empty() {
		val uriString = ""
		val org = URI.createURI(uriString, false)
		val synth = accessibleFakeResourceUtil.insertSynthetic(org)
		val unsynth = accessibleFakeResourceUtil.removeSynthetic(org)

		assertNotEquals(org, synth)
		assertEquals(org, unsynth)
		assertArrayEquals(org.segmentsList.front.toArray, synth.segmentsList.front.toArray)
		assertNotEquals(org.lastSegment, synth.lastSegment)
	}
}
