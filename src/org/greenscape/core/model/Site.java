package org.greenscape.core.model;

import java.util.ArrayList;
import java.util.List;

import org.greenscape.persistence.PersistedModelBase;

/**
 *
 * @author Sheikh Sajid
 *
 */
public class Site extends PersistedModelBase implements SiteModel {
	private static final long serialVersionUID = -9043603752002266014L;

	private final List<PageModel> pages = new ArrayList<>();

	@Override
	public String getName() {
		return (String) getProperty(SITE_NAME);
	}

	@Override
	public SiteModel setName(String name) {
		setProperty(SITE_NAME, name);
		return this;
	}

	@Override
	public String getHomeURL() {
		return (String) getProperty(HOME_URL);
	}

	@Override
	public SiteModel setHomeURL(String homeURL) {
		setProperty(HOME_URL, homeURL.toLowerCase());
		return this;
	}

	@Override
	public String getParentSiteId() {
		return (String) getProperty(PARENT_SITE_ID);
	}

	@Override
	public SiteModel setParentSiteId(String parentSiteId) {
		setProperty(PARENT_SITE_ID, parentSiteId);
		return this;
	}

	@Override
	public Boolean isActive() {
		return (Boolean) getProperty(IS_ACTIVE);
	}

	@Override
	public SiteModel setActive(Boolean active) {
		setProperty(IS_ACTIVE, active);
		return this;
	}

	@Override
	public Boolean isDefault() {
		return (Boolean) getProperty(IS_DEFAULT);
	}

	@Override
	public SiteModel setDefault(Boolean isDefault) {
		setProperty(IS_DEFAULT, isDefault);
		return this;
	}

	@Override
	public SiteTemplateModel getSiteTemplate() {
		return (SiteTemplateModel) getProperty(SITE_TEMPLATE);
	}

	@Override
	public SiteModel setSiteTemplate(SiteTemplateModel siteTemplateModel) {
		setProperty(SITE_TEMPLATE, siteTemplateModel);
		return this;
	}

	@Override
	public List<PageModel> getPages() {
		return pages;
	}
}
