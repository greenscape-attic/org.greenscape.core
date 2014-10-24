package org.greenscape.core;

import java.util.List;

public interface Resource {
	String getName();

	ResourceType getType();

	List<ResourcePermission> getPermissions();

	long getBundleId();

}
