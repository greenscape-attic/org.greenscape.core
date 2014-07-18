/**
 * 
 */
package org.greenscape.core.model;

import org.greenscape.persistence.PersistedModel;

/**
 * @author Sheikh Sajid
 * 
 */
public interface RoleModel extends PersistedModel {
	String MODEL_NAME = "Role";
	String ROLE_ID = "roleId";
	String NAME = "name";
	String DESCRIPTION = "description";

	Long getRoleId();

	RoleModel setRoleId(Long roleId);

	String getName();

	RoleModel setName(String name);

	String getDescription();

	RoleModel setDescription(String description);
}
