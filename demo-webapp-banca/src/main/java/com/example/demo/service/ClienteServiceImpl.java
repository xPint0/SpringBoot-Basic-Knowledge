package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.clientes;
import com.example.demo.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public List<clientes> findAll() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

	@Override
	public void save(clientes cliente) {
		// TODO Auto-generated method stub
		clienteRepository.save(cliente);
	}

	@Override
	public clientes findBydId(Long id) {
		// TODO Auto-generated method stub
		Optional<clientes> result = clienteRepository.findById(id);
		clientes objeto = null;
		if(result.isPresent()) {
			objeto = result.get();
		}
		return objeto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(id);
	}

}
