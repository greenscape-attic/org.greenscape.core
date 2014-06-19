package org.greenscape.core.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.greenscape.core.WebletItem;
import org.greenscape.core.model.Weblet;
import org.greenscape.core.service.Service;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;

@Component
public class WebletManager {
	private final List<WebletItem> weblets = new ArrayList<WebletItem>();
	private Service service;

	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY)
	public void setWebletItem(WebletItem webletItem) {
		weblets.add(webletItem);
	}

	public void unsetWebletItem(WebletItem webletItem) {
		weblets.remove(webletItem);
	}

	@Reference(policy = ReferencePolicy.DYNAMIC)
	public void setService(Service service) {
		this.service = service;
	}

	public void unsetService(Service service) {
		this.service = service;
	}

	@Activate
	private void activate(ComponentContext ctx, Map<String, Object> properties) {
		manageWeblet(ctx);
	}

	@Modified
	private void modified(ComponentContext ctx, Map<String, Object> properties) {
		manageWeblet(ctx);
	}

	private void manageWeblet(ComponentContext ctx) {
		List<Weblet> savedWeblets = service.find(Weblet.class);
		for (WebletItem item : weblets) {
			boolean found = false;
			for (Weblet weblet : savedWeblets) {
				if (weblet.getName().equals(item.getName())) {
					found = true;
					break;
				}
			}
			if (!found) {
				Weblet weblet = new Weblet();
				weblet.setActive(true);
				weblet.setBundleName(ctx.getBundleContext().getBundle(item.getBundleId()).getSymbolicName());
				Date now = new Date();
				weblet.setCreateDate(now);
				weblet.setInstanceable(item.isInstanceable());
				weblet.setModifiedDate(now);
				weblet.setName(item.getName());
				weblet.setSystem(item.isSystem());
				weblet.setTitle(item.getTitle());
				service.save(weblet);
			}
		}
	}

}
