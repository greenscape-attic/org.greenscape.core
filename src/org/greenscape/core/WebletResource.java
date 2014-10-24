package org.greenscape.core;

public interface WebletResource extends Resource {
	String getId();

	String getTitle();

	boolean isInstanceable();
}
