package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.clientes;
import com.example.demo.service.ClienteService;

//Marks the class as a controller
@RestController
public class ClienteController {

	//inyects an instance of its service
	@Autowired
	ClienteService clienteService;
	
	
	//HTTP GET request in the specified url
	@GetMapping("/cliente/{id}")
	public clientes getById(@PathVariable Long id){
		return clienteService.findBydId(id);		
	}
	
	//HTTP POST request in the specified url
	@PostMapping("/cliente")
	public void createEstudiante(@RequestBody clientes cliente) {
		clienteService.save(cliente);
	}
	
	//HTTP PUT request in the specified url
	@PutMapping("/cliente/{id}")
	public String updateEstudiante(@PathVariable Long id, @RequestBody clientes c) {
		
		String msj = "";
		clientes updateCliente = clienteService.findBydId(id);
		if(updateCliente != null) {
			updateCliente.setNombre(c.getNombre());
			clienteService.save(updateCliente);
			msj = "Id " + id + " actualizado correctamente";
		}else {
			msj = "Id " + id + " no existe";
		}
		
		return null;
		
	}
}
