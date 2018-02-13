package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil

import org.eclipse.emf.common.util.URI
import org.junit.Test

import static org.junit.Assert.*

class TestInsertSynthetic extends ATestFakeResourceUtil {
	@Test
	def simple() {
		val uriString = "/proj/some.resource"
		val org = URI.createPlatformResourceURI(uriString, false)
		val synth = accessibleFakeResourceUtil.insertSynthetic(org)

		assertNotEquals(org, synth)
		assertArrayEquals(org.segmentsList.front.toArray, synth.segmentsList.front.toArray)
		assertNotEquals(org.lastSegment, synth.lastSegment)
	}

	@Test
	def small() {
		val uriString = "some.resource"
		val org = URI.createPlatformResourceURI(uriString, false)
		val synth = accessibleFakeResourceUtil.insertSynthetic(org)

		assertNotEquals(org, synth)
		assertArrayEquals(org.segmentsList.front.toArray, synth.segmentsList.front.toArray)
		assertNotEquals(org.lastSegment, synth.lastSegment)
	}

	@Test
	def empty() {
		val uriString = ""
		val org = URI.createURI(uriString, false)
		val synth = accessibleFakeResourceUtil.insertSynthetic(org)

		assertNotEquals(org, synth)
		assertArrayEquals(org.segmentsList.front.toArray, synth.segmentsList.front.toArray)
		assertNotEquals(org.lastSegment, synth.lastSegment)
	}
}
