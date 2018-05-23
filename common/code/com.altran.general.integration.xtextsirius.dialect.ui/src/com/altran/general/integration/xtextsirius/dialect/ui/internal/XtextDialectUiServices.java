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
import org.eclipse.sirius.ui.business.api.dialect.DialectUIServices;
import org.eclipse.sirius.ui.business.api.dialect.ExportFormat;
import org.eclipse.sirius.ui.business.api.dialect.ExportResult;
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

public class XtextDialectUiServices implements DialectUIServices {
	@Override
	public void setSelection(final DialectEditor dialectEditor, final List<DRepresentationElement> selection) {
		return;
	}

	@Override
	public void selectAndReveal(final DialectEditor dialectEditor,
			final List<DRepresentationElement> selection) {
		return;
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
		throw new UnsupportedOperationException();
	}

	@Override
	public String getEditorName(final DRepresentation representation) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void export(final DRepresentation representation, final Session session, final IPath path,
			final ExportFormat format,
			final IProgressMonitor monitor) throws SizeTooLargeException {
		throw new UnsupportedOperationException();
	}

	@Override
	public ExportResult exportWithResult(DRepresentation representation, Session session, IPath path,
			ExportFormat format, IProgressMonitor monitor) throws SizeTooLargeException {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public AdapterFactory createAdapterFactory() {
		return new ComposedAdapterFactory();
	}

	@Override
	public String completeToolTipText(final String toolTipText, final EObject eObject,
			final EStructuralFeature feature) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String completeToolTipText(final String toolTipText, final EObject eObject) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean closeEditor(final IEditorPart editor, final boolean save) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean canHandleEditor(final IEditorPart editorPart) {
		return false;
	}

	@Override
	public boolean canHandle(final RepresentationExtensionDescription description) {
		return false;
	}

	@Override
	public boolean canHandle(final RepresentationDescription description) {
		return false;
	}

	@Override
	public boolean canHandle(final DRepresentationDescriptor representationDescriptor) {
		return false;
	}

	@Override
	public boolean canHandle(final DRepresentation representation) {
		return false;
	}

	@Override
	public boolean canExport(final ExportFormat format) {
		return false;
	}

	// @Override
	public void refreshEditor(final DialectEditor dialectEditor, final IProgressMonitor monitor) {
		throw new UnsupportedOperationException();
	}
}