package com.hotel_alura.clientes;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;

@Entity
@Table(name = "clientes")
public class clientes {

	private long id;
	private String nombre;
	private long celular;
	private LocalDate fechaOrigen ;//no se como crear algo q pida tiempo porq lo q le pongo este DateTimeAtCompleted
	private DateTimeAtCreation fechaFinal ;
	
	public clientes(long id, String nombre, long celular, LocalDate fechaOrigen,
			DateTimeAtCreation fechaFinal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.celular = celular;
		this.fechaOrigen = fechaOrigen;
		this.fechaFinal = fechaFinal;
	}
	
	
}
