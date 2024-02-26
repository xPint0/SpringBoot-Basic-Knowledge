package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.clientes;

public interface ClienteService {

	List<clientes> findAll();
	void save(clientes cliente);
	clientes findBydId(Long id);
	void delete(Long id);
	
}
