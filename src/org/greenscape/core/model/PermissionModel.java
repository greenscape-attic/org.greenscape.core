/**
 *
 */
package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModel;

/**
 * @author Sheikh Sajid
 *
 */
public interface PermissionModel extends PersistedModel {

	String MODEL_NAME = "Permission";
	String NAME = "name";
	String SCOPE = "scope";
	String ROLE_ID = "roleId";
	String TARGET_MODEL_ID = "targetModelId";
	String OWNER_ID = "ownerId";
	String ACTIONS_ID = "actionIds";

	String getName();

	PermissionModel setName(String name);

	Integer getScope();

	PermissionModel setScope(Integer scope);

	/**
	 * Returns the role ID of this resource permission.
	 *
	 * @return the role ID of this resource permission
	 */
	String getRoleId();

	/**
	 * Sets the role ID of this resource permission.
	 *
	 * @param roleId
	 *            the role ID of this resource permission
	 */
	PermissionModel setRoleId(String roleId);

	String getTargetModelId();

	PermissionModel setTargetModelId(String targetModelId);

	/**
	 * Returns the owner ID of this resource permission.
	 *
	 * @return the owner ID of this resource permission
	 */
	String getOwnerId();

	/**
	 * Sets the owner ID of this resource permission.
	 *
	 * @param ownerId
	 *            the owner ID of this resource permission
	 */
	PermissionModel setOwnerId(String ownerId);

	Long getActionIds();

	PermissionModel setActionIds(Long actionIds);
}
