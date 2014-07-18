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

	String getName();

	PermissionModel setName(String name);

	Integer getScope();

	PermissionModel setScope(Integer scope);

	// String getActionId();

	// Permission setActionId(String actionId);
}
