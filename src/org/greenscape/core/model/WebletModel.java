package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModel;

public interface WebletModel extends PersistedModel {
	String MODEL_NAME = "Weblet";
	String WEBLET_NAME = "name";
	String TITLE = "title";
	String INSTANCEABLE = "instanceable";
	String SYSTEM = "system";
	String IS_ACTIVE = "active";
	String BUNDLE_NAME = "bundleName";

	String getName();

	WebletModel setName(String name);

	String getTitle();

	WebletModel setTitle(String title);

	Boolean isInstanceable();

	WebletModel setInstanceable(Boolean instanceable);

	Boolean isSystem();

	WebletModel setSystem(Boolean system);

	Boolean isActive();

	WebletModel setActive(Boolean active);

	String getBundleName();

	WebletModel setBundleName(String bundleName);
}
