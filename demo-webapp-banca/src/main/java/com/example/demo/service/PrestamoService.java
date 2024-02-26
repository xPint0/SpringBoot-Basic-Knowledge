package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.prestamos;

public interface PrestamoService {

	List<prestamos> findAll();
	void save(prestamos prestamo);
	prestamos findBydId(Long id);
	void delete(Long id);
	
}
