package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModelBase;
import org.greenscape.persistence.annotations.Model;

@Model(name = PageModel.MODEL_NAME)
public class Page extends PersistedModelBase implements PageModel {
	private static final long serialVersionUID = -5167840270449559450L;

	@Override
	public String getName() {
		return (String) getProperty(PAGE_NAME);
	}

	@Override
	public PageModel setName(String name) {
		setProperty(PAGE_NAME, name);
		return this;
	}

	@Override
	public String getPathURL() {
		return (String) getProperty(PATH_URL);
	}

	@Override
	public PageModel setPathURL(String pathURL) {
		setProperty(PATH_URL, pathURL);
		return this;
	}

	@Override
	public String getLayoutURL() {
		return (String) getProperty(LAYOUT_URL);
	}

	@Override
	public PageModel setLayoutURL(String layoutURL) {
		setProperty(LAYOUT_URL, layoutURL);
		return this;
	}

	@Override
	public String getSiteId() {
		return (String) getProperty(SITE_ID);
	}

	@Override
	public PageModel setSiteId(String siteId) {
		setProperty(SITE_ID, siteId);
		return this;
	}

	@Override
	public Boolean isActive() {
		return (Boolean) getProperty(IS_ACTIVE);
	}

	@Override
	public PageModel setActive(Boolean active) {
		setProperty(IS_ACTIVE, active);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		builder.append("id:").append(getModelId());
		builder.append(",name:").append(getName());
		builder.append(",pathURL:").append(getPathURL());
		builder.append("}");
		return builder.toString();
	}
}
