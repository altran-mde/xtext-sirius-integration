package com.altran.general.integration.xtextsirius.style.ui.internal;

import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.IStyleConfigurationProvider;
import org.eclipse.sirius.diagram.ui.tools.api.graphical.edit.styles.StyleConfiguration;
import org.eclipse.sirius.viewpoint.Style;

public class XtextSiriusStyleConfigurationProvider implements IStyleConfigurationProvider {

	public XtextSiriusStyleConfigurationProvider() {
		System.out.println("something");
	}

	@Override
	public boolean provides(final DiagramElementMapping mapping, final Style style) {
		return mapping instanceof EdgeMapping;
	}

	@Override
	public StyleConfiguration createStyleConfiguration(final DiagramElementMapping mapping, final Style style) {
		if (mapping instanceof EdgeMapping) {
			return new XtextSiriusSimpleStyleConfiguration();
		}
		
		return null;
	}
	
}
