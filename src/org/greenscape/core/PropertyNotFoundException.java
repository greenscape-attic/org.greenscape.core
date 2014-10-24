package org.greenscape.core;

public class PropertyNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 7838715493867553777L;

	public PropertyNotFoundException(String message) {
		super(message);
	}
}
