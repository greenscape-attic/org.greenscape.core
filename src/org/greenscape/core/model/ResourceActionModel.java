package org.greenscape.core.model;

public interface ResourceActionModel {
	String MODEL_NAME = "ResourceAction";
	String NAME = "name";
	String ACTION_ID = "actionId";
	String BITWISE_VALUE = "bitwiseValue";

	/**
	 * Returns the name of this resource action.
	 *
	 * @return the name of this resource action
	 */
	public String getName();

	/**
	 * Sets the name of this resource action.
	 *
	 * @param name
	 *            the name of this resource action
	 */
	public ResourceActionModel setName(String name);

	/**
	 * Returns the action ID of this resource action.
	 *
	 * @return the action ID of this resource action
	 */
	public String getActionId();

	/**
	 * Sets the action ID of this resource action.
	 *
	 * @param actionId
	 *            the action ID of this resource action
	 */
	public ResourceActionModel setActionId(String actionId);

	/**
	 * Returns the bitwise value of this resource action.
	 *
	 * @return the bitwise value of this resource action
	 */
	public Long getBitwiseValue();

	/**
	 * Sets the bitwise value of this resource action.
	 *
	 * @param bitwiseValue
	 *            the bitwise value of this resource action
	 */
	public ResourceActionModel setBitwiseValue(Long bitwiseValue);
}
