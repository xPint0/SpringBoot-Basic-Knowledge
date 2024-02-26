package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.cuentas;
import com.example.demo.service.CuentaService;
import com.example.demo.service.CuentaServiceImpl;

@RestController
public class CuentaController {

	@Autowired
	private CuentaServiceImpl cuentaService;
	
	
	@PostMapping("/cuenta")
	public void createCuenta(@RequestBody cuentas cuenta) {
		cuentaService.save(cuenta);
	}
	
}
