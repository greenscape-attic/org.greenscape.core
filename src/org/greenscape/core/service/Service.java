package org.greenscape.core.service;

import java.util.List;
import java.util.Map;

import org.greenscape.persistence.DocumentModel;

public interface Service {
	<M extends DocumentModel> List<M> find(Class<? extends DocumentModel> clazz);

	<M extends DocumentModel> M find(Class<? extends DocumentModel> clazz, String id);

	<M extends DocumentModel> List<M> find(Class<? extends DocumentModel> clazz, String propertyName, Object value);

	<M extends DocumentModel> List<M> find(Class<? extends DocumentModel> clazz, Map<String, List<String>> properties);

	<M extends DocumentModel> M save(M model);

	<M extends DocumentModel> M update(M model);

	void delete(Class<? extends DocumentModel> clazz);

	void delete(Class<? extends DocumentModel> clazz, String id);
}