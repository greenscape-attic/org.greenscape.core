package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModelBase;
import org.greenscape.persistence.annotations.Model;

@Model(name = WebletModel.MODEL_NAME)
public class Weblet extends PersistedModelBase implements WebletModel {
	private static final long serialVersionUID = -1949538816210167663L;

	@Override
	public String getName() {
		return (String) getProperty(WEBLET_NAME);
	}

	@Override
	public WebletModel setName(String name) {
		setProperty(WEBLET_NAME, name);
		return this;
	}

	@Override
	public String getTitle() {
		return (String) getProperty(TITLE);
	}

	@Override
	public WebletModel setTitle(String title) {
		setProperty(TITLE, title);
		return this;
	}

	@Override
	public Boolean isInstanceable() {
		return (Boolean) getProperty(INSTANCEABLE);
	}

	@Override
	public WebletModel setInstanceable(Boolean instanceable) {
		setProperty(INSTANCEABLE, instanceable);
		return this;
	}

	@Override
	public Boolean isSystem() {
		return (Boolean) getProperty(SYSTEM);
	}

	@Override
	public WebletModel setSystem(Boolean system) {
		setProperty(SYSTEM, system);
		return this;
	}

	@Override
	public Boolean isActive() {
		return (Boolean) getProperty(IS_ACTIVE);
	}

	@Override
	public WebletModel setActive(Boolean active) {
		setProperty(IS_ACTIVE, active);
		return this;
	}

	@Override
	public String getBundleName() {
		return (String) getProperty(BUNDLE_NAME);
	}

	@Override
	public WebletModel setBundleName(String bundleName) {
		setProperty(BUNDLE_NAME, bundleName);
		return this;
	}
}
