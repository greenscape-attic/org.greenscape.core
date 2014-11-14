package org.greenscape.core;

import java.util.List;

public interface ResourcePermission {
	List<Action> getSupports();

	List<Action> getGuestDefaults();
}
