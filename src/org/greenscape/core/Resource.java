package org.greenscape.core;


public interface Resource {
	/**
	 * Name of this resource. The name is unique in the ResourceRegistry
	 *
	 * @return the resource's name
	 */
	String getName();

	/**
	 * Returns this resource's current state.
	 *
	 * <p>
	 * A resource can be in only one state at any time.
	 *
	 * @return An element of {@code REGISTERED},{@code CONFIGURED},
	 *         {@code UNREGISTERED}.
	 */
	ResourceType getType();

	ResourceState getState();

	ResourcePermission getPermission();

	long getBundleId();

}
