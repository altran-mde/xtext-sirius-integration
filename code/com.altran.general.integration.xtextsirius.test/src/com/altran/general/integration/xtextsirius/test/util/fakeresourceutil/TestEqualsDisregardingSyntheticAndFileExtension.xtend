package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil

import org.eclipse.emf.common.util.URI
import org.junit.Test

import static org.junit.Assert.*

class TestEqualsDisregardingSyntheticAndFileExtension extends ATestFakeResourceUtil {
	@Test
	def equal_nosynth() {
		val uriString = "/proj/some.resource"

		val a = URI.createPlatformResourceURI(uriString, false)
		val b = URI.createPlatformResourceURI(uriString, false)

		assertTrue(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def notEqual_nosynth() {
		val uriString = "/proj/some.resource"

		val a = URI.createPlatformResourceURI(uriString, false)
		val b = URI.createPlatformResourceURI(uriString + "/other.file", false)

		assertFalse(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def equal_synth() {
		val uriString = "/proj/some.resource"

		val a = accessibleFakeResourceUtil.insertSynthetic(URI.createPlatformResourceURI(uriString, false))
		val b = accessibleFakeResourceUtil.insertSynthetic(URI.createPlatformResourceURI(uriString, false))

		assertTrue(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def notEqual_synth() {
		val uriString = "/proj/some.resource"

		val a = accessibleFakeResourceUtil.insertSynthetic(URI.createPlatformResourceURI(uriString, false))
		val b = accessibleFakeResourceUtil.insertSynthetic(URI.createPlatformResourceURI(uriString + "/other.file", false))

		assertFalse(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def equal_synthA() {
		val uriString = "/proj/some.resource"

		val a = accessibleFakeResourceUtil.insertSynthetic(URI.createPlatformResourceURI(uriString, false))
		val b = URI.createPlatformResourceURI(uriString, false)

		assertTrue(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def notEqual_synthA() {
		val uriString = "/proj/some.resource"

		val a = accessibleFakeResourceUtil.insertSynthetic(URI.createPlatformResourceURI(uriString, false))
		val b = URI.createPlatformResourceURI(uriString + "/other.file", false)

		assertFalse(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def equal_synthB() {
		val uriString = "/proj/some.resource"

		val a = URI.createPlatformResourceURI(uriString, false)
		val b = accessibleFakeResourceUtil.insertSynthetic(URI.createPlatformResourceURI(uriString, false))

		assertTrue(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def notEqual_synthB() {
		val uriString = "/proj/some.resource"

		val a = URI.createPlatformResourceURI(uriString, false)
		val b = accessibleFakeResourceUtil.insertSynthetic(URI.createPlatformResourceURI(uriString + "/other.file", false))

		assertFalse(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}
	
	@Test
	def equal_ext() {
		val uriString = "/proj/some"

		val a = URI.createPlatformResourceURI(uriString + ".resource", false)
		val b = URI.createPlatformResourceURI(uriString + ".resourceOther", false)
		
		assertTrue(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def notEqual_ext() {
		val uriString = "/proj/some"

		val a = URI.createPlatformResourceURI(uriString + ".resource", false)
		val b = URI.createPlatformResourceURI(uriString + "x.resourceOther", false)
		
		assertFalse(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def notEqual_doubleExt() {
		val uriString = "/proj/some"

		val a = URI.createPlatformResourceURI(uriString + ".resource", false)
		val b = URI.createPlatformResourceURI(uriString + ".resource.x", false)
		
		assertFalse(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def equal_extSynthA() {
		val uriString = "/proj/some"

		val a = accessibleFakeResourceUtil.insertSynthetic(URI.createPlatformResourceURI(uriString + ".resource", false))
		val b = URI.createPlatformResourceURI(uriString + ".resourceOther", false)
		
		assertTrue(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def equal_extSynthB() {
		val uriString = "/proj/some"

		val a = URI.createPlatformResourceURI(uriString + ".resource", false)
		val b = accessibleFakeResourceUtil.insertSynthetic(URI.createPlatformResourceURI(uriString + ".resourceOther", false))
		
		assertTrue(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def notEqual_extSynthA() {
		val uriString = "/proj/some"

		val a = accessibleFakeResourceUtil.insertSynthetic(URI.createPlatformResourceURI(uriString + "x.resource", false))
		val b = URI.createPlatformResourceURI(uriString + ".resourceOther", false)
		
		assertFalse(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

	@Test
	def notEqual_extSynthB() {
		val uriString = "/proj/some"

		val a = URI.createPlatformResourceURI(uriString + "x.resource", false)
		val b = accessibleFakeResourceUtil.insertSynthetic(URI.createPlatformResourceURI(uriString + ".resourceOther", false))
		
		assertFalse(accessibleFakeResourceUtil.equalsDisregardingSyntheticAndFileExtension(a, b))
	}

}
