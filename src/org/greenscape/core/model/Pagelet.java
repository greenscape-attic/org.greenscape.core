package org.greenscape.core.model;

import org.greenscape.core.WebletResource;
import org.greenscape.persistence.PersistedModelBase;

public class Pagelet extends PersistedModelBase implements PageletModel {
	private static final long serialVersionUID = 2546793688926577230L;

	private WebletResource weblet;

	@Override
	public String getPageId() {
		return (String) getProperty(PAGE_ID);
	}

	@Override
	public PageletModel setPageId(String pageId) {
		setProperty(PAGE_ID, pageId);
		return this;
	}

	@Override
	public String getWebletId() {
		return (String) getProperty(WEBLET_ID);
	}

	@Override
	public PageletModel setWebletId(String webletId) {
		setProperty(WEBLET_ID, webletId);
		return this;
	}

	@Override
	public String getTitle() {
		return (String) getProperty(TITLE);
	}

	@Override
	public PageletModel setTitle(String title) {
		setProperty(TITLE, title);
		return this;
	}

	@Override
	public Boolean isActive() {
		return (Boolean) getProperty(IS_ACTIVE);
	}

	@Override
	public PageletModel setActive(Boolean active) {
		setProperty(IS_ACTIVE, active);
		return this;
	}

	@Override
	public Integer getRow() {
		return (Integer) getProperty(ROW);
	}

	@Override
	public PageletModel setRow(Integer row) {
		setProperty(ROW, row);
		return this;
	}

	@Override
	public Integer getColumn() {
		return (Integer) getProperty(COLUMN);
	}

	@Override
	public PageletModel setColumn(Integer column) {
		setProperty(COLUMN, column);
		return this;
	}

	@Override
	public Integer getOrder() {
		return (Integer) getProperty(ORDER);
	}

	@Override
	public PageletModel setOrder(Integer order) {
		setProperty(ORDER, order);
		return this;
	}

	public WebletResource getWeblet() {
		return weblet;
	}

	public void setWeblet(WebletResource weblet) {
		this.weblet = weblet;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		builder.append("id:").append(getModelId());
		builder.append(",title:").append(getTitle());
		builder.append(",pageId:").append(getPageId());
		builder.append(",row:").append(getRow());
		builder.append(",column:").append(getColumn());
		builder.append(",order:").append(getOrder());
		builder.append("}");
		return builder.toString();
	}
}
