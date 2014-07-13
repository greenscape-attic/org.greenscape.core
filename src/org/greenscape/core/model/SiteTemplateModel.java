package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModel;

public interface SiteTemplateModel extends PersistedModel {
	String MODEL_NAME = "SiteTemplate";
	String URL = "URL";
	String HEADER_URL = "headerURL";
	String FOOTER_URL = "footerURL";

	public String getURL();

	public SiteTemplateModel setURL(String URL);

	public String getHeaderURL();

	public SiteTemplateModel setHeaderURL(String headerURL);

	public String getFooterURL();

	public SiteTemplateModel setFooterURL(String footerURL);

}