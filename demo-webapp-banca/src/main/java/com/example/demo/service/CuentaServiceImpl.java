package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.cuentas;
import com.example.demo.repository.CuentaRepository;

@Service
public class CuentaServiceImpl implements GenericService<cuentas> {

	@Autowired
	CuentaRepository cuentaRepository;
	
	@Override
	public List<cuentas> findAll() {
		// TODO Auto-generated method stub
		return cuentaRepository.findAll();
	}

	@Override
	public cuentas findById(Long id) {
		// TODO Auto-generated method stub
		Optional<cuentas> result = cuentaRepository.findById(id);
		cuentas objeto  = null;
		if(result.isPresent()) {
			objeto = result.get();
		}
		return objeto;
	}

	@Override
	public void save(cuentas objeto) {
		// TODO Auto-generated method stub
		cuentaRepository.save(objeto);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cuentaRepository.deleteById(id);
	}

}
