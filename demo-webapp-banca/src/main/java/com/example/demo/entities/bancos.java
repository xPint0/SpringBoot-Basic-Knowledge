package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

//Lombok annotation equivalent to getter setter and constructor of the class
@Data
//Annotation that marks the class as an entity
@Entity
//Annotation that specifies the primary table of the entity and its name
@Table(name = "bancos")
public class bancos {

	//Annotation that marks the next attribute as the primary key of the table
	@Id
	//Annotation that specifies the method of the id's generation
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//The different columns of the table and its names
	@Column(name = "cif")
	private String dni;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "domiciliofiscal")
	private String domiciliofiscal;
	
	//Many to many relation with the table 'clintes'
	//'Mapped by' means which table "owns" the relation
	@ManyToMany(mappedBy = "bancos")
	private Set<clientes> clientes = new HashSet<>();
	
}
