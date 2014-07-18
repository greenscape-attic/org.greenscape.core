package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModelBase;
import org.greenscape.persistence.annotations.Model;

@Model(name = PermissionModel.MODEL_NAME)
public class Permission extends PersistedModelBase implements PermissionModel {
	private static final long serialVersionUID = -1951274511658270330L;

	@Override
	public String getName() {
		return (String) getProperty(NAME);
	}

	@Override
	public PermissionModel setName(String name) {
		setProperty(NAME, name);
		return this;
	}

	@Override
	public Integer getScope() {
		return (Integer) getProperty(SCOPE);
	}

	@Override
	public PermissionModel setScope(Integer scope) {
		setProperty(SCOPE, scope);
		return this;
	}

}
