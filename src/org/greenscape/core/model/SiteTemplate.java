package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModelBase;
import org.greenscape.persistence.annotations.Model;

/**
 * 
 * @author Sheikh Sajid
 * 
 */
@Model(name = SiteTemplateModel.MODEL_NAME)
public class SiteTemplate extends PersistedModelBase implements SiteTemplateModel {
	private static final long serialVersionUID = 20966141678458407L;

	@Override
	public String getOrganizationId() {
		return (String) getProperty(ORGANIZATION_ID);
	}

	@Override
	public SiteTemplateModel setOrganizationId(String organizationId) {
		setProperty(ORGANIZATION_ID, organizationId);
		return this;
	}

	@Override
	public String getURL() {
		return (String) getProperty(URL);
	}

	@Override
	public SiteTemplateModel setURL(String URL) {
		setProperty(SiteTemplateModel.URL, URL.toLowerCase());
		return this;
	}

	@Override
	public String getHeaderURL() {
		return (String) getProperty(HEADER_URL);
	}

	@Override
	public SiteTemplateModel setHeaderURL(String headerURL) {
		setProperty(HEADER_URL, headerURL);
		return this;
	}

	@Override
	public String getFooterURL() {
		return (String) getProperty(FOOTER_URL);
	}

	@Override
	public SiteTemplateModel setFooterURL(String footerURL) {
		setProperty(FOOTER_URL, footerURL);
		return this;
	}
}
