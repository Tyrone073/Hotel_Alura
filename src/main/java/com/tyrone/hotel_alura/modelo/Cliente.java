package com.tyrone.hotel_alura.modelo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Embedded //este es para referirse q algo se esta injectando
	private DatosPersonales datosPersonales;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Reserva reserva;
	
	public Cliente(String nombre, String dni) {

		this.datosPersonales = new DatosPersonales(nombre,dni);
	}
	
	public Cliente() {///
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return datosPersonales.getNombre();
	}

	public void setNombre(String nombre) {
		this.datosPersonales.setNombre(nombre);
	}

	public String getDni() {
		return datosPersonales.getDni();
	}

	public void setDni(String dni) {
		this.datosPersonales.setDni(dni);
	}

	
}
