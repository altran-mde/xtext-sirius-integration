package com.altran.general.integration.xtextsirius.style.ui.internal;

import org.eclipse.sirius.business.api.featureextensions.AbstractFeatureExtensionServices;
import org.eclipse.sirius.business.api.featureextensions.FeatureExtension;
import org.eclipse.sirius.business.api.featureextensions.FeatureExtensionServices;
import org.eclipse.sirius.viewpoint.DFeatureExtension;
import org.eclipse.sirius.viewpoint.description.FeatureExtensionDescription;

import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextDFeatureExtension;
import com.altran.general.integration.xtextsirius.model.viewpoint.viewpointxtext.XtextFeatureExtensionDescription;

public class XtextSiriusFeatureExtension implements FeatureExtension {

	@Override
	public String getName() {
		return "XtextSiriusFeatureExtension";
	}

	@Override
	public FeatureExtensionServices getServices() {
		return new AbstractFeatureExtensionServices() {

			@Override
			protected Class<? extends FeatureExtensionDescription> getFeatureExtensionDescriptionClass() {
				return XtextFeatureExtensionDescription.class;
			}

			@Override
			protected Class<? extends DFeatureExtension> getFeatureExtensionClass() {
				return XtextDFeatureExtension.class;
			}
		};
	}

}
