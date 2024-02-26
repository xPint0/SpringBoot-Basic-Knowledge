package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.bancos;

//Set of methods that will be used to interact with the entity "bancos"
public interface BancoService {

	List<bancos> findAll();
	void save(bancos banco);
	bancos findBydId(Long id);
	void delete(Long id);
	
}
