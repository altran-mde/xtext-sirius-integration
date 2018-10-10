/**
 */
package com.altran.general.integration.xtextsirius.model.diagram.diagramxtext;

import org.eclipse.emf.common.util.EList;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>AXtext
 * Direct Edit Label</b></em>'. <!-- end-user-doc -->
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
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final
	 *        &lt;%org.eclipse.emf.ecore.resource.Resource%&gt; r =
	 *        this.eResource();\r\nif ((r == null))\r\n{\r\n\tthrow new
	 *        &lt;%java.lang.UnsupportedOperationException%&gt;();\r\n}\r\nfinal
	 *        &lt;%org.eclipse.emf.ecore.util.ECrossReferenceAdapter%&gt;
	 *        crossReferencer =
	 *        &lt;%org.eclipse.emf.ecore.util.ECrossReferenceAdapter%&gt;.getCrossReferenceAdapter(r);\r\nif
	 *        ((crossReferencer == null))\r\n{\r\n\tthrow new
	 *        &lt;%java.lang.UnsupportedOperationException%&gt;();\r\n}\r\nfinal
	 *        &lt;%java.util.ArrayList%&gt;&lt;&lt;%org.eclipse.sirius.diagram.description.DiagramElementMapping%&gt;&gt;
	 *        diagramElementMappings = new
	 *        &lt;%java.util.ArrayList%&gt;&lt;&gt;();\r\nfinal
	 *        &lt;%java.util.Collection%&gt;&lt;&lt;%org.eclipse.emf.ecore.EStructuralFeature.Setting%&gt;&gt;
	 *        settings = crossReferencer.getInverseReferences(this,
	 *        true);\r\nfor (final
	 *        &lt;%org.eclipse.emf.ecore.EStructuralFeature.Setting%&gt; setting
	 *        : settings)\r\n{\r\n\t{\r\n\t\tfinal
	 *        &lt;%org.eclipse.emf.ecore.EObject%&gt; eReferencer =
	 *        setting.getEObject();\r\n\t\tfinal
	 *        &lt;%org.eclipse.emf.ecore.EStructuralFeature%&gt; eFeature =
	 *        setting.getEStructuralFeature();\r\n\t\tif ((eReferencer
	 *        instanceof
	 *        &lt;%org.eclipse.sirius.diagram.description.DiagramElementMapping%&gt;)
	 *        &amp;&amp;
	 *        &lt;%org.eclipse.sirius.diagram.description.DescriptionPackage%&gt;.eINSTANCE.getDiagramElementMapping_LabelDirectEdit().equals(eFeature))\r\n\t\t{\r\n\t\t\tdiagramElementMappings.add(((&lt;%org.eclipse.sirius.diagram.description.DiagramElementMapping%&gt;)
	 *        eReferencer));\r\n\t\t}\r\n\t}\r\n}\r\nreturn new
	 *        &lt;%org.eclipse.emf.common.util.BasicEList%&gt;&lt;&lt;%org.eclipse.sirius.diagram.description.DiagramElementMapping%&gt;&gt;(diagramElementMappings);'"
	 * @generated
	 */
	@Override
	EList<DiagramElementMapping> getMapping();

} // AXtextDirectEditLabel
