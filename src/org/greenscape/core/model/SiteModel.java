package org.greenscape.core.model;

import java.util.List;

import org.greenscape.persistence.PersistedModel;

public interface SiteModel extends PersistedModel {
	String MODEL_NAME = "Site";
	String SITE_NAME = "name";
	String HOME_URL = "homeURL";
	String PARENT_SITE_ID = "parentSiteId";
	String IS_ACTIVE = "isActive";
	String IS_DEFAULT = "isDefault";
	String SITE_TEMPLATE = "siteTemplate";

	String getName();

	SiteModel setName(String name);

	String getHomeURL();

	SiteModel setHomeURL(String homeURL);

	String getParentSiteId();

	SiteModel setParentSiteId(String parentSiteId);

	Boolean isActive();

	SiteModel setActive(Boolean active);

	Boolean isDefault();

	SiteModel setDefault(Boolean isDefault);

	SiteTemplateModel getSiteTemplate();

	SiteModel setSiteTemplate(SiteTemplateModel siteTemplateModel);

	List<PageModel> getPages();

}