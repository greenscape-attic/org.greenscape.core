package org.greenscape.core.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	private WebletBundleTracker bundleTracker;

	@Override
	public void start(BundleContext context) throws Exception {
		bundleTracker = new WebletBundleTracker(context);
		bundleTracker.open();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		bundleTracker.close();
	}

}
