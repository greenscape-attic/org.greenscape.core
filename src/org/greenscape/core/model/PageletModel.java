package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModel;

public interface PageletModel extends PersistedModel {
	String MODEL_NAME = "Pagelet";
	String PAGE_ID = "pageId";
	String WEBLET_ID = "webletId";
	String TITLE = "title";
	String IS_ACTIVE = "active";
	String ROW = "row";
	String COLUMN = "column";
	String ORDER = "order";

	String getPageId();

	PageletModel setPageId(String pageId);

	String getWebletId();

	PageletModel setWebletId(String webletId);

	String getTitle();

	PageletModel setTitle(String title);

	Boolean isActive();

	PageletModel setActive(Boolean active);

	Integer getRow();

	PageletModel setRow(Integer row);

	Integer getColumn();

	PageletModel setColumn(Integer column);

	Integer getOrder();

	PageletModel setOrder(Integer order);
}
