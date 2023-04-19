package com.tyrone.hotel_alura.modelo;

import javax.persistence.Embeddable;

@Embeddable//esto es para injectar algo y se aconpaña con un @Embedded en la clase q se desea
public class DatosPersonales {

	private String nombre;
	private String dni;
	
	
	
	public DatosPersonales() {
		super();
	}
	
	public DatosPersonales(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
}
