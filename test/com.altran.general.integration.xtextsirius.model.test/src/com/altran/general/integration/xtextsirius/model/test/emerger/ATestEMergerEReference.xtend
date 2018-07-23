package com.altran.general.integration.xtextsirius.model.test.emerger

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.Element
import java.util.Collection
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.change.ChangePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.Before
import org.junit.BeforeClass

class ATestEMergerEReference extends ATestEMerger {
	protected var Resource editedResource
	protected var Resource existingResource
	
	@BeforeClass
	def static void registerEmf() {
		val packageRegistry = EPackage::Registry::INSTANCE;
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

	protected def exists(Collection<Element> elements, String attrValue) {
		elements.exists[changeableAttr == attrValue]
	}
}
