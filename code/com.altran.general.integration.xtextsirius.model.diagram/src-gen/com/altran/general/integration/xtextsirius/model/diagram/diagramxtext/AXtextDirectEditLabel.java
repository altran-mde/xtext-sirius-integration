/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext;

import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>AXtext Direct Edit Label</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextPackage#getAXtextDirectEditLabel()
 * @model abstract="true"
 * @generated
 */
public interface AXtextDirectEditLabel extends DirectEditLabel {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model kind="operation" unique="false" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='final <%org.eclipse.emf.ecore.resource.Resource%> r = this.eResource();\nif ((r == null))\n{\n\tthrow new <%java.lang.UnsupportedOperationException%>();\n}\nfinal <%org.eclipse.emf.ecore.util.ECrossReferenceAdapter%> crossReferencer = <%org.eclipse.emf.ecore.util.ECrossReferenceAdapter%>.getCrossReferenceAdapter(r);\nif ((crossReferencer == null))\n{\n\tthrow new <%java.lang.UnsupportedOperationException%>();\n}\nfinal <%java.util.ArrayList%><<%org.eclipse.sirius.diagram.description.DiagramElementMapping%>> diagramElementMappings = <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%org.eclipse.sirius.diagram.description.DiagramElementMapping%>>newArrayList();\nfinal <%java.util.Collection%><<%org.eclipse.emf.ecore.EStructuralFeature.Setting%>> settings = crossReferencer.getInverseReferences(this, true);\nfor (final <%org.eclipse.emf.ecore.EStructuralFeature.Setting%> setting : settings)\n{\n\t{\n\t\tfinal <%org.eclipse.emf.ecore.EObject%> eReferencer = setting.getEObject();\n\t\tfinal <%org.eclipse.emf.ecore.EStructuralFeature%> eFeature = setting.getEStructuralFeature();\n\t\tif (((eReferencer instanceof <%org.eclipse.sirius.diagram.description.DiagramElementMapping%>) && <%com.google.common.base.Objects%>.equal(eFeature, <%org.eclipse.sirius.diagram.description.DescriptionPackage%>.eINSTANCE.getDiagramElementMapping_LabelDirectEdit())))\n\t\t{\n\t\t\tdiagramElementMappings.add(((<%org.eclipse.sirius.diagram.description.DiagramElementMapping%>) eReferencer));\n\t\t}\n\t}\n}\nreturn new <%org.eclipse.emf.common.util.BasicEList%><<%org.eclipse.sirius.diagram.description.DiagramElementMapping%>>(diagramElementMappings);'"
	 * @generated
	 */
	@Override
	EList<DiagramElementMapping> getMapping();

} // AXtextDirectEditLabel
