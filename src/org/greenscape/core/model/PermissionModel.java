/**
 *
 */
package org.greenscape.core.model;

/**
 * @author Sheikh Sajid
 *
 */
public interface PermissionModel {

	String MODEL_NAME = "Permission";
	String NAME = "name";
	String SCOPE = "scope";
	String ROLE_ID = "roleId";
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
	public String getRoleId();

	/**
	 * Sets the role ID of this resource permission.
	 *
	 * @param roleId
	 *            the role ID of this resource permission
	 */
	public PermissionModel setRoleId(String roleId);

	/**
	 * Returns the owner ID of this resource permission.
	 *
	 * @return the owner ID of this resource permission
	 */
	public String getOwnerId();

	/**
	 * Sets the owner ID of this resource permission.
	 *
	 * @param ownerId
	 *            the owner ID of this resource permission
	 */
	public PermissionModel setOwnerId(String ownerId);

	Long getActionIds();

	Permission setActionIds(Long actionIds);
}
