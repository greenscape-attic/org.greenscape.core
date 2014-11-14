package org.greenscape.core;

import java.util.List;

public interface ResourceRegistry {
	String TOPIC_RESOURCE_REGISTERED = "org/greenscape/core/ResourceEvent/REGISTERED";
	String TOPIC_RESOURCE_CONFIGURED = "org/greenscape/core/ResourceEvent/CONFIGURED";
	String TOPIC_RESOURCE_UNREGISTERED = "org/greenscape/core/ResourceEvent/UNREGISTERED";
	String TOPIC_RESOURCE_MODIFIED = "org/greenscape/core/ResourceEvent/MODIFIED";

	/**
	 * Gets all the resources that are registered
	 *
	 * @return the list of resources
	 * @see org.greenscape.core.Resource
	 */
	List<Resource> getResources();

	/**
	 * Gets the resources of the specified type
	 *
	 * @param resourceType
	 *            The type of resources to return. If the
	 *            <code>resourceType</code> is null, then this call behaves just
	 *            like getResources()
	 * @return the list of resources matching the type
	 */
	List<Resource> getResources(ResourceType resourceType);

	/**
	 * Gets the resources of the specified class type
	 *
	 * @param clazz
	 *            The class type of resources to return. If the
	 *            <code>clazz</code> is null, then this call behaves just like
	 *            getResources()
	 * @return the list of resources matching the type
	 */
	<M extends Resource> List<M> getResources(Class<M> clazz);

	/**
	 * Gets all resources registered by the bundle with specified id
	 *
	 * @param bundleId
	 *            the id of the bundle
	 * @return the list of resources registered by the bundle
	 */
	List<Resource> getResources(long bundleId);

	/**
	 * Gets all resources registered by the bundle with specified id and of the
	 * specified type
	 *
	 * @param bundleId
	 *            the id of the bundle
	 * @param resourceType
	 *            The type of resources to return. If the
	 *            <code>resourceType</code> is null, then this call behaves just
	 *            like getResources(int bundleId)
	 * @return the list of resources registered by the bundle
	 */
	List<Resource> getResources(long bundleId, ResourceType resourceType);

	/**
	 * Get a resource by its name
	 *
	 * @param name
	 *            the name of the resource
	 * @return the resource with the given name
	 */
	Resource getResource(String name);

	/**
	 * Get a resource by its unique remote name
	 *
	 * @param name
	 *            the remote name for the resource
	 * @return the resource with the given remote name
	 */
	ModelResource getResourceByRemoteName(String name);
}
