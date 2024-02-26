package com.example.demo.service;

import java.util.List;
import com.example.demo.entities.cuentas;

public interface CuentaService {

	List<cuentas> findAll();
	void save(cuentas cuenta);
	cuentas findBydId(Long id);
	void delete(Long id);
	
}
