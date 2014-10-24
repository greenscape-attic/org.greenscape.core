package org.greenscape.core.impl.config.json;

public class WebletConfig extends ResourceConfig {
	public String name;

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("webletResource={").append("name=").append(name).append(",permissions=").append(permissions)
		.append("}");
		return string.toString();
	}
}
