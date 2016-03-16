package com.rentabook.persistent.daos;

import java.util.List;

import com.rentabook.persistent.domain.DomainObject;

public interface GenaricDAO <T extends DomainObject>{
	T get(Long id);
	List<T> getAll();
	void save(T object);
	void delete(T object);
}
