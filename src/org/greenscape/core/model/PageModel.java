package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModel;

public interface PageModel extends PersistedModel {
	String MODEL_NAME = "Page";
	String PAGE_NAME = "name";
	String PATH_URL = "pathURL";
	String LAYOUT_URL = "layoutURL";
	String SITE_ID = "siteId";
	String IS_ACTIVE = "isActive";

	String getName();

	PageModel setName(String name);

	String getPathURL();

	PageModel setPathURL(String pathURL);

	String getLayoutURL();

	PageModel setLayoutURL(String layoutURL);

	String getSiteId();

	PageModel setSiteId(String siteId);

	Boolean isActive();

	PageModel setActive(Boolean active);
}