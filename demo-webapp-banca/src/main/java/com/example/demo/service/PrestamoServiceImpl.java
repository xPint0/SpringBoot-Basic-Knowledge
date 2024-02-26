package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.prestamos;
import com.example.demo.repository.PrestamosRepository;

@Service
public class PrestamoServiceImpl implements GenericService<prestamos> {

	@Autowired
	private PrestamosRepository prestamosRepository;
	
	@Override
	public List<prestamos> findAll() {
		// TODO Auto-generated method stub
		return prestamosRepository.findAll();
	}

	@Override
	public prestamos findById(Long id) {
		// TODO Auto-generated method stub
		Optional<prestamos> result = prestamosRepository.findById(id);
		prestamos objeto = null;
		if(result.isPresent()) {
			objeto = result.get();
		}
		return objeto;
	}

	@Override
	public void save(prestamos objeto) {
		// TODO Auto-generated method stub
		prestamosRepository.save(objeto);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		prestamosRepository.deleteById(id);
	}

	
	
}
