package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "prestamos")
public class prestamos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "fecha")
	private String fecha;
	@Column(name = "cantidad")
	private int cantidad;
	@Column(name = "interes")
	private double interes;
	
	//Many to one
	@ManyToOne
	//Specifies the name of the column which will store the foreign key of this table in the related table
	@JoinColumn(name = "cliente_id")
	private clientes cliente;
	
}
