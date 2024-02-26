package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "clientes")
public class clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "dni")
	private String dni;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellidos")
	private String apellidos;
	@Column(name = "contacto")
	private String contacto;
	
	@ManyToMany
	//This annotation is determinates that this is the side that doesnt own the relation
	//and creates an additional table specifying this relation in the DB
	@JoinTable(name = "banco_clientes")
	private Set<bancos> bancos = new HashSet<>();
	
	//One to one relation owned by this table
	@OneToOne(mappedBy = "clientes")
	private cuentas cuenta;
	
	//One to many relation owned by this table
	@OneToMany(mappedBy = "clientes")
	private Set<prestamos> prestamos = new HashSet<>();

}
