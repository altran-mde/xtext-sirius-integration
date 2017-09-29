package com.altran.general.integration.xtextsirius.dialect.ui.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.description.tool.ToolPackage;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUI;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIServices;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat;
import org.eclipse.sirius.ui.tools.api.actions.export.SizeTooLargeException;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.RepresentationExtensionDescription;
import org.eclipse.ui.IEditorPart;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.ViewpointxtextFactory;
import com.google.common.collect.ImmutableList;

public class XtextDialectUi implements DialectUI {

	@Override
	public String getName() {
		return "XtextDialectUi";
	}

	@Override
	public DialectUIServices getServices() {
		return new DialectUIServices() {
			
			@Override
			public void setSelection(final DialectEditor dialectEditor, final List<DRepresentationElement> selection) {
				System.out.println("XtextDialectUi.getServices().new DialectUIServices() {...}.setSelection()");
			}
			
			@Override
			public void selectAndReveal(final DialectEditor dialectEditor,
					final List<DRepresentationElement> selection) {
				System.out.println("XtextDialectUi.getServices().new DialectUIServices() {...}.selectAndReveal()");
			}
			
			@Override
			public Collection<CommandParameter> provideTools(final EObject object) {
				return ImmutableList.of(
						createTool(DiagramxtextFactory.eINSTANCE.createXtextDirectEditModelDescription()),
						createTool(DiagramxtextFactory.eINSTANCE.createXtextDirectEditValueDescription()),

						createTool(ViewpointxtextFactory.eINSTANCE.createXtextEdgeLabelDirectEditModelDescription()),
						createTool(ViewpointxtextFactory.eINSTANCE.createXtextEdgeLabelDirectEditValueDescription()));
			}

			protected CommandParameter createTool(final Object value) {
				return new CommandParameter(null, ToolPackage.eINSTANCE.getToolSection_OwnedTools(), value);
			}
			
			@Override
			public Collection<CommandParameter> provideRepresentationNavigationToolDescriptors(final Object feature) {
				return Collections.emptySet();
			}
			
			@Override
			public Collection<CommandParameter> provideRepresentationCreationToolDescriptors(final Object feature) {
				return Collections.emptySet();
			}
			
			@Override
			public Collection<CommandParameter> provideNewChildDescriptors() {
				return Collections.emptySet();
			}
			
			@Override
			public Collection<CommandParameter> provideAdditionalMappings(final EObject object) {
				return Collections.emptySet();
			}
			
			@Override
			public IEditorPart openEditor(final Session session, final DRepresentation dRepresentation,
					final IProgressMonitor monitor) {
				System.out.println("XtextDialectUi.getServices().new DialectUIServices() {...}.openEditor()");
				return null;
			}
			
			@Override
			public boolean isRepresentationManagedByEditor(final DRepresentation representation,
					final IEditorPart editorPart) {
				return false;
			}
			
			@Override
			public boolean isRepresentationDescriptionManagedByEditor(
					final RepresentationDescription representationDescription,
					final IEditorPart editorPart) {
				return false;
			}
			
			@Override
			public Collection<DSemanticDecorator> getSelection(final DialectEditor editor) {
				return Collections.emptySet();
			}
			
			@Override
			public ILabelProvider getHierarchyLabelProvider(final ILabelProvider currentLabelProvider) {
				System.out.println(
						"XtextDialectUi.getServices().new DialectUIServices() {...}.getHierarchyLabelProvider()");
				return null;
			}
			
			@Override
			public String getEditorName(final DRepresentation representation) {
				System.out.println("XtextDialectUi.getServices().new DialectUIServices() {...}.getEditorName()");
				return null;
			}
			
			@Override
			public void export(final DRepresentation representation, final Session session, final IPath path,
					final ExportFormat format,
					final IProgressMonitor monitor) throws SizeTooLargeException {
				System.out.println("XtextDialectUi.getServices().new DialectUIServices() {...}.export()");
			}
			
			@Override
			public AdapterFactory createAdapterFactory() {
				return new ComposedAdapterFactory();
			}
			
			@Override
			public String completeToolTipText(final String toolTipText, final EObject eObject,
					final EStructuralFeature feature) {
				System.out.println("XtextDialectUi.getServices().new DialectUIServices() {...}.completeToolTipText()");
				return null;
			}
			
			@Override
			public String completeToolTipText(final String toolTipText, final EObject eObject) {
				System.out.println("XtextDialectUi.getServices().new DialectUIServices() {...}.completeToolTipText()");
				return null;
			}
			
			@Override
			public boolean closeEditor(final IEditorPart editor, final boolean save) {
				System.out.println("XtextDialectUi.getServices().new DialectUIServices() {...}.closeEditor()");
				return false;
			}
			
			@Override
			public boolean canHandleEditor(final IEditorPart editorPart) {
				return false;
			}
			
			@Override
			public boolean canHandle(final RepresentationExtensionDescription description) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean canHandle(final RepresentationDescription description) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean canHandle(final DRepresentationDescriptor representationDescriptor) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean canHandle(final DRepresentation representation) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean canExport(final ExportFormat format) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}
	
}
