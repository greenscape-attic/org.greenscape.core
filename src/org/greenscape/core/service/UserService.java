package org.greenscape.core.service;

import org.greenscape.core.model.UserModel;

public interface UserService {
	UserModel findById(String modelId);
}
