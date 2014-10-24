package org.greenscape.core;

import java.util.EventObject;

import org.osgi.framework.Bundle;

/**
 * An event from the Framework describing a bundle resource change.
 * <p>
 * {@code ResourceEvent} objects are delivered to
 * {@code SynchronousBundleListener}s and {@code BundleListener}s when a change
 * occurs in a bundle's lifecycle. A type code is used to identify the event
 * type for future extendability.
 *
 * <p>
 *
 * @Immutable
 */

public class ResourceEvent extends EventObject {

	private static final long serialVersionUID = 2900070402491573923L;

	public static final String RESOURCE_NAME = "resource.name";
	public static final String RESOURCE_TYPE = "resource.type";

	/**
	 * Type of resource lifecycle change.
	 */
	private final int type;

	/**
	 * The resource has been registered.
	 *
	 */
	public final static int REGISTERED = 0x00000001;

	/**
	 * The resource has been updated.
	 */
	public final static int UPDATED = 0x00000002;

	/**
	 * The resource has been unregisterd.
	 */
	public final static int UNREGISTERED = 0x00000004;

	/**
	 * Creates a resource event of the specified type.
	 *
	 * @param type
	 *            The event type.
	 * @param origin
	 *            The bundle which is the origin of the event. For the event
	 *            type {@link #REGISTERED}, this is the bundle whose context was
	 *            used to install the bundle. Otherwise it is the bundle itself.
	 */
	public ResourceEvent(int type, Bundle source) {
		super(source);
		if (source == null) {
			throw new IllegalArgumentException("null source");
		}
		this.type = type;
	}

	/**
	 * Returns the type of lifecyle event. The type values are:
	 * <ul>
	 * <li>{@link #REGISTERED}
	 * <li>{@link #UPDATED}
	 * <li>{@link #UNREGISTERED}
	 * </ul>
	 *
	 * @return The type of lifecycle event.
	 */
	public int getType() {
		return type;
	}

}
