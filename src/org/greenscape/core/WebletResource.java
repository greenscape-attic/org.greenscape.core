package org.greenscape.core;

public interface WebletResource extends Resource {
	String getId();

	String getGroupId();

	String getTitle();

	String getIcon();

	Boolean isInstanceable();

	String getViewURL();

	String getHelpURL();

	String getLoadJS();

	String getLoadCSS();
}
