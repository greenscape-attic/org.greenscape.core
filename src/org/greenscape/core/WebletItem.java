package org.greenscape.core;

public interface WebletItem {
	String getId();

	String getGroupId();

	String getName();

	String getTitle();

	long getBundleId();

	Boolean isInstanceable();

	Boolean isSystem();

	String getViewURL();
}
