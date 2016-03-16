package com.rentabook.persistent.daos.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.rentabook.persistent.daos.GenaricDAO;
import com.rentabook.persistent.domain.DomainObject;

public class AbsractJPADAO<T extends DomainObject> implements GenaricDAO<T> {

	private Class<T> type;
	protected EntityManager entityManager;

	public AbsractJPADAO(Class<T> type) {
		this.type = type;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public T get(Long id) {
		return entityManager.find(type, id);
	}

	public List<T> getAll() {
		return entityManager.createQuery("select o from " + type.getName() + "o").getResultList();
	}

	public void save(T object) {
		entityManager.persist(object);
	}

	public void delete(T object) {
		entityManager.remove(object);
	}
}
