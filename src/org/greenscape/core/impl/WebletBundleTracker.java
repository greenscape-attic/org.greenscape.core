package org.greenscape.core.impl;

import java.io.IOException;
import java.net.URL;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.util.tracker.BundleTracker;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WebletBundleTracker extends BundleTracker<String> {
	private static final String TITLE = "title";
	private static final String WEBLET_NAME = "weblet-name";
	private static final String GS_WEBLET = "GS-Weblet";

	public WebletBundleTracker(BundleContext context) {
		super(context, Bundle.ACTIVE, null);
	}

	@Override
	public String addingBundle(Bundle bundle, BundleEvent event) {
		Dictionary<String, String> headers = bundle.getHeaders();
		String headerValue = headers.get(GS_WEBLET);
		if (headerValue != null) {
			registerWeblet(bundle, headerValue);
		}
		return null;
	}

	@Override
	public void removedBundle(Bundle bundle, BundleEvent event, String object) {
		Dictionary<String, String> headers = bundle.getHeaders();
		String webletDef = headers.get(GS_WEBLET);
		if (webletDef != null) {
			unregisterWeblet(bundle.getBundleId());
		}
	}

	private void registerWeblet(Bundle bundle, String headerValue) {
		ServiceReference<ConfigurationAdmin> configAdminRef = context.getServiceReference(ConfigurationAdmin.class);
		if (configAdminRef != null) {
			ConfigurationAdmin confAdmin = context.getService(configAdminRef);
			Configuration[] configurations;

			try {
				configurations = confAdmin.listConfigurations("(service.factoryPid=" + WebletItemImpl.FACTORY_DS + ")");
				URL webletFile = bundle.getEntry(headerValue);
				ObjectMapper mapper = new ObjectMapper();
				Object root = mapper.readValue(webletFile, Object.class);
				if (root instanceof List) {
					@SuppressWarnings("unchecked")
					List<Object> objectArray = (List<Object>) root;
					for (Object obj : objectArray) {
						@SuppressWarnings("unchecked")
						Map<String, Object> objectMap = (Map<String, Object>) obj;
						String webletName = "";
						if (objectMap.containsKey(WEBLET_NAME)) {
							webletName = (String) objectMap.get(WEBLET_NAME);
						} else {
							// weblet name absent, discard the entry
							// TODO: log/ignore or throw error?
							continue;
						}
						boolean found = false;
						if (configurations != null) {
							for (Configuration config : configurations) {
								Dictionary<String, Object> properties = config.getProperties();
								String conf_webletName = (String) properties.get(WEBLET_NAME);
								if (webletName.equals(conf_webletName)) {
									found = true;
									break;
								}
							}
						}
						if (!found) {
							addConfig(bundle, confAdmin, objectMap);
						}
					}
				} else {
					@SuppressWarnings("unchecked")
					Map<String, Object> objectMap = (Map<String, Object>) root;
					if (objectMap.containsKey(WEBLET_NAME)) {
						addConfig(bundle, confAdmin, objectMap);
					} else {
						// weblet name absent, discard the entry
						// TODO: log/ignore or throw error?
					}
				}
			} catch (IOException | InvalidSyntaxException e) {
				e.printStackTrace();
			}
		}
	}

	private void unregisterWeblet(long bundleId) {
		ServiceReference<ConfigurationAdmin> configAdminRef = context.getServiceReference(ConfigurationAdmin.class);
		if (configAdminRef != null) {
			ConfigurationAdmin confAdmin = context.getService(configAdminRef);
			Configuration[] configurations;

			try {
				configurations = confAdmin.listConfigurations("(service.factoryPid=" + WebletItemImpl.FACTORY_DS + ")");
				if (configurations != null) {
					for (Configuration config : configurations) {
						Dictionary<String, Object> properties = config.getProperties();
						long bid = (Long) properties.get("bundleId");
						if (bundleId == bid) {
							config.delete();
						}
					}
				}
			} catch (IOException | InvalidSyntaxException e) {
				e.printStackTrace();
			}
		}
	}

	private void addConfig(Bundle bundle, ConfigurationAdmin confAdmin, Map<String, Object> objectMap)
			throws IOException {
		Configuration config = confAdmin.createFactoryConfiguration(WebletItemImpl.FACTORY_DS);
		Dictionary<String, Object> properties = new Hashtable<>();
		properties.put("id", bundle.getSymbolicName() + "." + objectMap.get(WEBLET_NAME));
		properties.put("groupId", bundle.getSymbolicName());
		properties.put(WEBLET_NAME, objectMap.get(WEBLET_NAME));
		properties.put(TITLE, objectMap.get(TITLE));
		properties.put("bundleId", bundle.getBundleId());
		Boolean instanceable = (Boolean) objectMap.get("instanceable");
		properties.put("instanceable", instanceable != null ? instanceable : true);
		Boolean system = (Boolean) objectMap.get("system");
		properties.put("system", system != null ? system : true);
		properties.put("viewURL", objectMap.get("viewURL"));
		config.update(properties);
	}

}
