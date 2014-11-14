package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModelBase;

public class RoleEntity extends PersistedModelBase implements RoleModel {
	private static final long serialVersionUID = -6764247821891388151L;

	@Override
	public String getName() {
		return (String) getProperty(NAME);
	}

	@Override
	public RoleModel setName(String name) {
		setProperty(NAME, name);
		return this;
	}

	@Override
	public String getDescription() {
		return (String) getProperty(DESCRIPTION);
	}

	@Override
	public RoleModel setDescription(String description) {
		setProperty(DESCRIPTION, description);
		return this;
	}

}
