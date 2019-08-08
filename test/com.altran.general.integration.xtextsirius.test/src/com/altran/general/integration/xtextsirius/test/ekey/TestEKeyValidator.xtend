package com.altran.general.integration.xtextsirius.test.ekey

import com.altran.general.integration.xtextsirius.runtime.validator.DuplicateEKeyValidatorFast
import com.altran.general.integration.xtextsirius.runtime.validator.DuplicateEKeyValidatorNormal
import com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangFactory
import com.altran.general.integration.xtextsirius.test.EKeyLang.EKeyLangPackage
import org.espilce.commons.emf.testsupport.ATestValidator
import org.junit.Test

class TestEKeyValidator extends ATestValidator {
	extension EKeyLangFactory = EKeyLangFactory::eINSTANCE
	extension EKeyLangPackage = EKeyLangPackage::eINSTANCE

	@Test
	def void testBuiltInValidator() {
		val group = createGroup => [
			leafs += createLeaf => [name = "A"]
			leafs += createLeaf => [name = "B"]
			leafs += createLeaf => [name = "C"]
			leafs += createLeaf => [name = "B"]
			leafs += createLeaf => [name = "B"]
		]

		val container = createContainer => [
			contents += group
		]

		validateModel(container)

		assertErrorPresent(group, group_Leafs, null)
		group.leafs.forEach[assertNoErrors]
	}

	@Test
	def void testCustomValidatorFast() {
		val group = createGroup => [
			leafs += createLeaf => [name = "A"]
			leafs += createLeaf => [name = "B"]
			leafs += createLeaf => [name = "C"]
			leafs += createLeaf => [name = "B"]
			leafs += createLeaf => [name = "B"]
		]

		val container = createContainer => [
			contents += group
		]

		this.eValidatorRegistry.put(EKeyLangPackage, new DuplicateEKeyValidatorFast())

		validateModel(container)

		assertErrorPresent("Same key [name='B'] as elements in positions 3, 4", group, group_Leafs, 1)
		assertErrorPresent("Same key [name='B'] as elements in positions 1, 4", group, group_Leafs, 3)
		assertErrorPresent("Same key [name='B'] as elements in positions 1, 3", group, group_Leafs, 4)
	}
	
	@Test
	def void testCustomValidatorNormal() {
		val group = createGroup => [
			leafs += createLeaf => [name = "A"]
			leafs += createLeaf => [name = "B"]
			leafs += createLeaf => [name = "C"]
			leafs += createLeaf => [name = "B"]
			leafs += createLeaf => [name = "B"]
		]

		val container = createContainer => [
			contents += group
		]

		this.eValidatorRegistry.put(EKeyLangPackage, new DuplicateEKeyValidatorNormal())

		validateModel(container)

		assertErrorPresent("Same key [name='B'] as elements in positions 3, 4", group, group_Leafs, 1)
		assertErrorPresent("Same key [name='B'] as elements in positions 1, 4", group, group_Leafs, 3)
		assertErrorPresent("Same key [name='B'] as elements in positions 1, 3", group, group_Leafs, 4)
	}
}
