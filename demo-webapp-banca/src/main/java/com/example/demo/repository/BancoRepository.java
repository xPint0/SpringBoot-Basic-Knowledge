package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.bancos;

//Extends JpaRepository and the parameters "bancos"(entity to interact with) and "Long"(data type of the primary key of the entity)
public interface BancoRepository extends JpaRepository<bancos, Long> {

}
