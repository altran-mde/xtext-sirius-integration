package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.util.EMerger
import org.junit.Test

import static org.junit.Assert.*
import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import java.util.Collection
import org.eclipse.emf.ecore.resource.Resource
import org.junit.Before
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.junit.BeforeClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.ecore.change.ChangePackage
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class TestEMergerReference extends TestAEMerger {
	var Resource editedResource
	var Resource existingResource
	
	@BeforeClass
	def static void registerEmf() {
		val packageRegistry = EPackage::Registry.INSTANCE;
		packageRegistry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		packageRegistry.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);

		val resourceFactory = new EcoreResourceFactoryImpl();
		val factoryRegistry = Resource.Factory.Registry.INSTANCE;
		factoryRegistry.getExtensionToFactoryMap().put("ecore", resourceFactory);
		factoryRegistry.getExtensionToFactoryMap().put("genmodel", resourceFactory);
		factoryRegistry.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		EcorePackage.eINSTANCE.getClass();
		EcoreFactory.eINSTANCE.getClass();

		ChangePackage.eINSTANCE.getClass();
	}
	
	@Before
	def void initResources() {
		this.editedResource = new ResourceSetImpl().createResource(URI.createURI("__synthetic__resourceName.xmi"))
		this.existingResource = new ResourceSetImpl().createResource(URI.createURI("resourceName.xmi"))
	}
	
	@Test
	def void singleNull_singleNew() {
		val edited = createElement => [
			changeableRef = null
		]
		
		val existing = createElement => [
			changeableRef = null
		]
		
		val result = new EMerger(existing, edited, emptySet, emptySet, URI.createURI("resourceName.xmi#/42")).merge()
		assertNull(result.changeableRef)
	}
	
	@Test
	def void singleNull_singleExisting() {
		val edited = createElement => [
			changeableRef = null
		]
		
		val existing = createElement => [
			changeableRef = newExisting(1, "")
		]
		
		val result = new EMerger(existing, edited, emptySet, emptySet, URI.createURI("resourceName.xmi#/42")).merge()
		assertNull(result.changeableRef)
	}
	
	@Test
	def void singleNonNull_singleNew() {
		val edited = createElement => [
			changeableRef = newEdited(1, "answer")
		]
		
		val existing = createElement => [
			changeableRef = null
		]
		
		val result = new EMerger(existing, edited, emptySet, emptySet, URI.createURI("resourceName.xmi#/42")).merge()
		assertNotNull(result.changeableRef)
		assertEquals("aanswer", result.changeableRef.changeableAttr)
	}
	
	@Test
	def void singleNonNull_singleExisting() {
		val edited = createElement => [
			changeableRef = newEdited(1, "answer")
		]
		
		val existing = createElement => [
			changeableRef = newExisting(1, "question")
		]
		
		val result = new EMerger(existing, edited, emptySet, emptySet, URI.createURI("resourceName.xmi#/42")).merge()
		assertEquals("aanswer", result.changeableRef.changeableAttr)
	}
	
	@Test
	def void bag_bagNew() {
		val edited = createElement => [
			changeableBagRef += #[newEdited(3, "3.14"), newEdited(2, "2.71")]
		]
		
		val existing = createElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(31, "31.337"), newExisting(1, "1.337")]
		]
		
		val result = new EMerger(existing, edited, emptySet, emptySet, URI.createURI("resourceName.xmi#")).merge()
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.exists("a3.14"))
		assertTrue(result.changeableBagRef.exists("a2.71"))
	}
	
	@Test
	def void bag_bagExisting() {
		val edited = createElement => [
			changeableBagRef += #[newEdited(3, "3.14"), newEdited(2, "2.71")]
		]
		
		val existing = createElement => [
			changeableBagRef += #[newExisting(1, "1.337"), newExisting(2, "2.71"), newExisting(31, "31.337"), newExisting(1, "1.337"), newExisting(2, "2.71")]
		]
		
		val result = new EMerger(existing, edited, emptySet, emptySet, URI.createURI("resourceName.xmi#/42")).merge()
		assertEquals(2, result.changeableBagRef.size)
		assertTrue(result.changeableBagRef.exists("a3.14"))
		assertTrue(result.changeableBagRef.exists("a2.71"))
	}
	
	@Test
	def void set_setNew() {
		val edited = createElement => [
			changeableSetRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = new EMerger(existing, edited, emptySet, emptySet, URI.createURI("resourceName.xmi#/42")).merge()
		assertEquals(2, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.exists("a3"))
		assertTrue(result.changeableSetRef.exists("a2"))
	}
	
	@Test
	def void set_setExisting() {
		val edited = createElement => [
			changeableSetRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createElement => [
			changeableSetRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = new EMerger(existing, edited, emptySet, emptySet, URI.createURI("resourceName.xmi#/42")).merge()
		assertEquals(2, result.changeableSetRef.size)
		assertTrue(result.changeableSetRef.exists("a3"))
		assertTrue(result.changeableSetRef.exists("a2"))
	}
	
	@Test
	def void list_listNew() {
		val edited = createElement => [
			changeableListRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(31, "31"), newExisting(1, "1")]
		]
		
		val result = new EMerger(existing, edited, emptySet, emptySet, URI.createURI("resourceName.xmi#/42")).merge()
		assertEquals(2, result.changeableListRef.size)
		assertTrue("a3" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("a2" == result.changeableListRef.get(1).changeableAttr)
	}
	
	@Test
	def void list_listExisting() {
		val edited = createElement => [
			changeableListRef += #[newEdited(3, "3"), newEdited(2, "2")]
		]
		
		val existing = createElement => [
			changeableListRef += #[newExisting(1, "1"), newExisting(2, "2"), newExisting(31, "31"), newExisting(1, "1"), newExisting(2, "2")]
		]
		
		val result = new EMerger(existing, edited, emptySet, emptySet, URI.createURI("resourceName.xmi#/42")).merge()
		assertEquals(2, result.changeableListRef.size)
		assertTrue("a3" == result.changeableListRef.get(0).changeableAttr)
		assertTrue("a2" == result.changeableListRef.get(1).changeableAttr)
	}
	
	protected def newEdited(int id, String attrValue) {
		val result = newElement(id, "a" + attrValue)
		this.editedResource.contents += result
		return result
	}

	protected def newExisting(int id, String attrValue) {
		val result = newElement(id, "q" + attrValue)
		this.existingResource.contents += result
		return result
	}

	protected def newElement(int id, String attrValue) {
		createElement => [
			changeableAttr = attrValue
		]
	}
	
	protected def exists(Collection<Element> elements, String attrValue) {
		elements.exists[changeableAttr == attrValue]
	}
}
