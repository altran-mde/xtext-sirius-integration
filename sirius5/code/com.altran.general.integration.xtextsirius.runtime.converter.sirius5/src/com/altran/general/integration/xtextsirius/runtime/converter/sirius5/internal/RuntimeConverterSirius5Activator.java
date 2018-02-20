package com.altran.general.integration.xtextsirius.runtime.converter.sirius5.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class RuntimeConverterSirius5Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		RuntimeConverterSirius5Activator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		RuntimeConverterSirius5Activator.context = null;
	}

}
