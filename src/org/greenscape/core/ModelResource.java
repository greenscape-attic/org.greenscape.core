package org.greenscape.core;

import java.util.List;
import java.util.Map;

public interface ModelResource extends Resource {
	Map<String, Property> getProperties();

	String getModelClass();

	boolean isAbstract();

	List<ModelResource> getParents();

	boolean isRemote();

	String getRemoteName();

	String getRemoteClass();

}
