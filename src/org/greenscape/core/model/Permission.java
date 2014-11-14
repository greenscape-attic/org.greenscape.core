package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModelBase;

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

	@Override
	public String getOwnerId() {
		return (String) getProperty(OWNER_ID);
	}

	@Override
	public PermissionModel setOwnerId(String ownerId) {
		setProperty(OWNER_ID, ownerId);
		return this;
	}

	@Override
	public String getRoleId() {
		return (String) getProperty(ROLE_ID);
	}

	@Override
	public PermissionModel setRoleId(String roleId) {
		setProperty(ROLE_ID, roleId);
		return this;
	}

	@Override
	public String getTargetModelId() {
		return (String) getProperty(TARGET_MODEL_ID);
	}

	@Override
	public PermissionModel setTargetModelId(String targetModelId) {
		setProperty(TARGET_MODEL_ID, targetModelId);
		return this;
	}

	@Override
	public Long getActionIds() {
		return (Long) getProperty(ACTIONS_ID);
	}

	@Override
	public Permission setActionIds(Long actionIds) {
		setProperty(ACTIONS_ID, actionIds);
		return this;
	}
}
