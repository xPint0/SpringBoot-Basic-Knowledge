package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.prestamos;

public interface PrestamosRepository extends JpaRepository<prestamos, Long> {

}
