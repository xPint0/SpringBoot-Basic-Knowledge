package com.example.demo.service;

import java.util.List;

public interface GenericService<T> {

	List<T> findAll();
	T findById(Long id);
	void save(T objeto);
	void delete(Long id);
	
}
