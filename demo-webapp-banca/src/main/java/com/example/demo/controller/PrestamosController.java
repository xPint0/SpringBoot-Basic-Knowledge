package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.prestamos;
import com.example.demo.service.PrestamoService;

@RestController
public class PrestamosController {

	@Autowired
	PrestamoService prestamoService;
	
	@GetMapping("/prestamo/{id}")
	public prestamos getById(@PathVariable Long id){
		return prestamoService.findBydId(id);		
	}
	
	//HTTP DELETE request in the specified url
	@DeleteMapping("/prestamo/id")
	public void deletePrestamo(@PathVariable Long id) {
		prestamoService.delete(id);
	}
}
