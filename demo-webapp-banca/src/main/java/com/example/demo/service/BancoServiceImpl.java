package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.bancos;
import com.example.demo.repository.BancoRepository;

//Marks the class as a service
@Service
//Implements its own set of methods specified in "BancoService"
public class BancoServiceImpl implements BancoService {

	//Marks a constructor field, which inyects an instance of its repository
	@Autowired
	private BancoRepository bancoRepository;
	
	//returns all the values of the table
	@Override
	public List<bancos> findAll() {
		// TODO Auto-generated method stub
		return bancoRepository.findAll();
	}

	//saves an object in the table
	@Override
	public void save(bancos banco) {
		// TODO Auto-generated method stub
		bancoRepository.save(banco);
	}

	//returns a specific object
	@Override
	public bancos findBydId(Long id) {
		// TODO Auto-generated method stub
		Optional<bancos> result = bancoRepository.findById(id);
		bancos objeto = null;
		if(result.isPresent()) {
			objeto = result.get();
		}
		return objeto;
	}

	//deletes a specific object
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		bancoRepository.deleteById(id);
	}

}
