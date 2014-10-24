package org.greenscape.core.service;

import java.util.List;
import java.util.Map;

import org.greenscape.persistence.DocumentModel;

public interface Service {
	<M extends DocumentModel> List<M> find(String modelName);

	@Deprecated
	<M extends DocumentModel> List<M> find(Class<? extends DocumentModel> clazz);

	@Deprecated
	<M extends DocumentModel> List<M> find(String organizationId, Class<? extends DocumentModel> clazz);

	<M extends DocumentModel> M find(String modelName, String id);

	@Deprecated
	<M extends DocumentModel> M find(Class<? extends DocumentModel> clazz, String id);

	@Deprecated
	<M extends DocumentModel> M find(String organizationId, Class<? extends DocumentModel> clazz, String id);

	<M extends DocumentModel> List<M> find(String modelName, String propertyName, Object value);

	@Deprecated
	<M extends DocumentModel> List<M> find(Class<? extends DocumentModel> clazz, String propertyName, Object value);

	public <M extends DocumentModel> List<M> find(String organizationId, String modelName, String propertyName,
			Object value);

	@Deprecated
	<M extends DocumentModel> List<M> find(String organizationId, Class<? extends DocumentModel> clazz,
			String propertyName, Object value);

	<M extends DocumentModel> List<M> find(String modelName, Map<String, List<String>> properties);

	@Deprecated
	<M extends DocumentModel> List<M> find(Class<? extends DocumentModel> clazz, Map<String, List<String>> properties);

	@Deprecated
	<M extends DocumentModel> List<M> find(String organizationId, Class<? extends DocumentModel> clazz,
			Map<String, List<String>> properties);

	<M extends DocumentModel> M save(String modelName, M model);

	@Deprecated
	<M extends DocumentModel> M save(M model);

	<M extends DocumentModel> M update(String modelName, M model);

	@Deprecated
	<M extends DocumentModel> M update(M model);

	void delete(String modelName);

	@Deprecated
	void delete(Class<? extends DocumentModel> clazz);

	void delete(String modelName, String modelId);

	@Deprecated
	void delete(Class<? extends DocumentModel> clazz, String id);
}