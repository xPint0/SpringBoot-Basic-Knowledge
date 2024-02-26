package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.cuentas;

public interface CuentaRepository extends JpaRepository<cuentas, Long>{

}
