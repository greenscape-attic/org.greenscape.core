package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModelBase;

public class ResourceAction extends PersistedModelBase implements ResourceActionModel {
	private static final long serialVersionUID = -1284859774436774970L;

	@Override
	public String getName() {
		return (String) getProperty(NAME);
	}

	@Override
	public ResourceActionModel setName(String name) {
		setProperty(NAME, name);
		return this;
	}

	@Override
	public String getActionId() {
		return (String) getProperty(ACTION_ID);
	}

	@Override
	public ResourceActionModel setActionId(String actionId) {
		setProperty(ACTION_ID, actionId);
		return this;
	}

	@Override
	public Long getBitwiseValue() {
		return (Long) getProperty(BITWISE_VALUE);
	}

	@Override
	public ResourceActionModel setBitwiseValue(Long bitwiseValue) {
		setProperty(BITWISE_VALUE, bitwiseValue);
		return this;
	}

}
