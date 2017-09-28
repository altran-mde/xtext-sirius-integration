package com.altran.general.integration.xtextsirius.style.ui.internal;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.sirius.diagram.description.tool.ToolPackage;
import org.eclipse.sirius.ui.business.api.featureExtensions.FeatureExtensionUI;
import org.eclipse.sirius.ui.business.api.featureExtensions.FeatureExtensionUIServices;

import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.DiagramxtextFactory;
import com.altran.general.integration.xtextsirius.model.diagram.diagramxtext.util.DiagramxtextAdapterFactory;

public class XtextFeatureExtensionUi implements FeatureExtensionUI {

	@Override
	public String getName() {
		return "XtextFeatureExtensionUi";
	}

	@Override
	public FeatureExtensionUIServices getServices() {
		return new FeatureExtensionUIServices() {

			@Override
			public Collection<CommandParameter> provideNewChildDescriptors() {
				return Collections.singleton(
						new CommandParameter(null, ToolPackage.eINSTANCE.getToolSection_OwnedTools(),
								DiagramxtextFactory.eINSTANCE.createXtextDirectEditValueDescription()));
			}

			@Override
			public AdapterFactory createAdapterFactory() {
				return new DiagramxtextAdapterFactory();
			}
		};
	}

}
