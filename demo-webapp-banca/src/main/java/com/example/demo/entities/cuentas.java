package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cuentas")
public class cuentas {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "isbn")
	private String isbn;
	@Column(name = "saldo")
	private double saldo;
	
	//Specifies the relation between the primary keys (if this annotation is used @GeneratedValue should not be used)
	@MapsId
	//Specifies id this entity is loaded along the primary(owner) entity of the relation
	@OneToOne(fetch = FetchType.LAZY)
	private clientes cliente;
}
