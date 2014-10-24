package org.greenscape.core.impl;

import org.greenscape.core.ResourceType;
import org.greenscape.core.WebletResource;

public class WebletResourceImpl extends ResourceBase implements WebletResource {
	private String id;
	private String title;
	private boolean instanceable;

	public WebletResourceImpl(long bundleId, String name, ResourceType resourceType) {
		super(bundleId, name, resourceType);
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public boolean isInstanceable() {
		return instanceable;
	}

}
