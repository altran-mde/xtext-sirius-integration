package com.altran.general.integration.xtextsirius.test.util.ecorehelper

import org.eclipse.emf.common.util.URI
import org.junit.Test

import static org.junit.Assert.*

class TestEqualsDisregardingSynthetic extends ATestEcoreHelper {
	@Test
	def equal_nosynth() {
		val uriString = "/proj/some.resource"

		val a = URI.createPlatformResourceURI(uriString, false)
		val b = URI.createPlatformResourceURI(uriString, false)

		assertTrue(accessibleEcoreHelper.equalsDisregardingSynthetic(a, b))
	}

	@Test
	def notEqual_nosynth() {
		val uriString = "/proj/some.resource"

		val a = URI.createPlatformResourceURI(uriString, false)
		val b = URI.createPlatformResourceURI(uriString + "/other.file", false)

		assertFalse(accessibleEcoreHelper.equalsDisregardingSynthetic(a, b))
	}

	@Test
	def equal_synth() {
		val uriString = "/proj/some.resource"

		val a = accessibleEcoreHelper.insertSynthetic(URI.createPlatformResourceURI(uriString, false))
		val b = accessibleEcoreHelper.insertSynthetic(URI.createPlatformResourceURI(uriString, false))

		assertTrue(accessibleEcoreHelper.equalsDisregardingSynthetic(a, b))
	}

	@Test
	def notEqual_synth() {
		val uriString = "/proj/some.resource"

		val a = accessibleEcoreHelper.insertSynthetic(URI.createPlatformResourceURI(uriString, false))
		val b = accessibleEcoreHelper.insertSynthetic(URI.createPlatformResourceURI(uriString + "/other.file", false))

		assertFalse(accessibleEcoreHelper.equalsDisregardingSynthetic(a, b))
	}

	@Test
	def equal_synthA() {
		val uriString = "/proj/some.resource"

		val a = accessibleEcoreHelper.insertSynthetic(URI.createPlatformResourceURI(uriString, false))
		val b = URI.createPlatformResourceURI(uriString, false)

		assertTrue(accessibleEcoreHelper.equalsDisregardingSynthetic(a, b))
	}

	@Test
	def notEqual_synthA() {
		val uriString = "/proj/some.resource"

		val a = accessibleEcoreHelper.insertSynthetic(URI.createPlatformResourceURI(uriString, false))
		val b = URI.createPlatformResourceURI(uriString + "/other.file", false)

		assertFalse(accessibleEcoreHelper.equalsDisregardingSynthetic(a, b))
	}

	@Test
	def equal_synthB() {
		val uriString = "/proj/some.resource"

		val a = URI.createPlatformResourceURI(uriString, false)
		val b = accessibleEcoreHelper.insertSynthetic(URI.createPlatformResourceURI(uriString, false))

		assertTrue(accessibleEcoreHelper.equalsDisregardingSynthetic(a, b))
	}

	@Test
	def notEqual_synthB() {
		val uriString = "/proj/some.resource"

		val a = URI.createPlatformResourceURI(uriString, false)
		val b = accessibleEcoreHelper.insertSynthetic(URI.createPlatformResourceURI(uriString + "/other.file", false))

		assertFalse(accessibleEcoreHelper.equalsDisregardingSynthetic(a, b))
	}

}
