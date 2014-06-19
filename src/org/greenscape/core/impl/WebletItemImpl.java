package org.greenscape.core.impl;

import java.util.Dictionary;

import org.greenscape.core.WebletItem;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.log.LogService;

@Component(name = WebletItemImpl.FACTORY_DS, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class WebletItemImpl implements WebletItem, ManagedService {
	public static final String FACTORY_DS = "org.greenscape.core.WebletItem.factory";

	private String id;
	private String groupId;
	private String name;
	private String title;
	private long bundleId;
	private Boolean instanceable;
	private Boolean system;
	private String viewURL;

	private LogService logService;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getGroupId() {
		return groupId;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public long getBundleId() {
		return bundleId;
	}

	@Override
	public Boolean isInstanceable() {
		return instanceable;
	}

	@Override
	public Boolean isSystem() {
		return system;
	}

	@Override
	public String getViewURL() {
		return viewURL;
	}

	@Override
	public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
		id = (String) properties.get("id");
		groupId = (String) properties.get("groupId");
		bundleId = (Long) properties.get("bundleId");
		name = (String) properties.get("weblet-name");
		title = (String) properties.get("title");
		instanceable = (Boolean) properties.get("instanceable");
		system = (Boolean) properties.get("system");
		viewURL = (String) properties.get("viewURL");
		if (logService != null) {
			logService.log(LogService.LOG_DEBUG, "Weblet Component updated: " + name);
		}
	}

	@Reference(cardinality = ReferenceCardinality.OPTIONAL, policy = ReferencePolicy.DYNAMIC)
	public void setLogService(LogService logService) {
		this.logService = logService;
	}

	public void unsetLogService(LogService logService) {
		this.logService = null;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{");
		builder.append("id:").append(id);
		builder.append(",name:").append(name);
		builder.append(",groupId:").append(groupId);
		builder.append("}");
		return builder.toString();
	}
}
