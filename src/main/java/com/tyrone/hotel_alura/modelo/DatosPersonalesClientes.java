package com.tyrone.hotel_alura.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Setter
@Getter
@Embeddable//esto es para injectar algo y se aconpaña con un @Embedded en la clase q se desea
public class DatosPersonalesClientes {

	private String nombre;
	private String dni;
	public DatosPersonalesClientes() {

	}
	
	public DatosPersonalesClientes(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
//	public String getNombre() {
//		return nombre;
//	}
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//	public String getDni() {
//		return dni;
//	}
//	public void setDni(String dni) {
//		this.dni = dni;
//	}
}
