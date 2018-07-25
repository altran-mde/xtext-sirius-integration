package com.altran.general.integration.xtextsirius.model.test.emerger;

import com.altran.general.integration.xtextsirius.model.test.XtextSiriusTest.IElement;
import com.altran.general.integration.xtextsirius.model.test.emerger.ATestEMerger;
import com.google.common.base.Objects;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.change.ChangePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Before;
import org.junit.BeforeClass;

@SuppressWarnings("all")
public class ATestEMergerEReference<T extends IElement<?>> extends ATestEMerger<T> {
  protected Resource editedResource;
  
  protected Resource existingResource;
  
  @BeforeClass
  public static void registerEmf() {
    final EPackage.Registry packageRegistry = EPackage.Registry.INSTANCE;
    packageRegistry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
    packageRegistry.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
    final EcoreResourceFactoryImpl resourceFactory = new EcoreResourceFactoryImpl();
    final Resource.Factory.Registry factoryRegistry = Resource.Factory.Registry.INSTANCE;
    factoryRegistry.getExtensionToFactoryMap().put("ecore", resourceFactory);
    factoryRegistry.getExtensionToFactoryMap().put("genmodel", resourceFactory);
    Map<String, Object> _extensionToFactoryMap = factoryRegistry.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    EcorePackage.eINSTANCE.getClass();
    EcoreFactory.eINSTANCE.getClass();
    ChangePackage.eINSTANCE.getClass();
  }
  
  @Before
  public void initResources() {
    this.editedResource = new ResourceSetImpl().createResource(URI.createURI("__synthetic__resourceName.xmi"));
    this.existingResource = new ResourceSetImpl().createResource(URI.createURI("resourceName.xmi"));
  }
  
  protected T newEdited(final int id, final String attrValue) {
    final T result = this.newElement(id, ("a" + attrValue));
    EList<EObject> _contents = this.editedResource.getContents();
    _contents.add(result);
    return result;
  }
  
  protected T newExisting(final int id, final String attrValue) {
    final T result = this.newElement(id, ("q" + attrValue));
    EList<EObject> _contents = this.existingResource.getContents();
    _contents.add(result);
    return result;
  }
  
  protected boolean valueExists(final Collection<T> elements, final String attrValue) {
    final Function1<T, Boolean> _function = (T it) -> {
      String _changeableAttr = it.getChangeableAttr();
      return Boolean.valueOf(Objects.equal(_changeableAttr, attrValue));
    };
    return IterableExtensions.<T>exists(elements, _function);
  }
}
