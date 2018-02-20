package com.altran.general.integration.xtextsirius.runtime.converter.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class RuntimeConverterActivator implements BundleActivator {
	
	private static BundleContext context;
	
	static BundleContext getContext() {
		return context;
	}
	
	@Override
	public void start(final BundleContext bundleContext) throws Exception {
		RuntimeConverterActivator.context = bundleContext;
	}
	
	@Override
	public void stop(final BundleContext bundleContext) throws Exception {
		RuntimeConverterActivator.context = null;
	}
	
}
