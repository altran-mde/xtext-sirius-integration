package com.altran.general.integration.xtextsirius.internal;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class XtextSiriusUiPlugin extends AbstractUIPlugin {
	
	// The plug-in ID
	public static final String PLUGIN_ID = "com.altran.general.integration.xtextsirius"; //$NON-NLS-1$

	// The shared instance
	private static XtextSiriusUiPlugin plugin;
	
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(final BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static XtextSiriusUiPlugin getDefault() {
		return plugin;
	}

}