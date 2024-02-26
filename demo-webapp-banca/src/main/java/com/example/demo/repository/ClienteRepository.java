package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.clientes;

public interface ClienteRepository extends JpaRepository<clientes, Long>{

}
