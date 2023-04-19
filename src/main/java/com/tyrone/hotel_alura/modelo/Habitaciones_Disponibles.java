package com.tyrone.hotel_alura.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;//es seleccionado este y no el otra ya q este es algo q se va a qdedar y  si se hjace un cambio de hiibeernate a otro no va a ver problema
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity//esto creo q se lllama mapear y sirve para referir tal cosa a la base de dato
@Table(name = "habitaciones_disponibles")
//@NamedQuery(name= "Producto.consultaDePrecio", query= "SELECT P.precio FROM Producto AS P WHERE P.nombre=:nombre")//siempre se debe poner el sobrenombre de la clase y despues el . y lo q se va a ejecutar
@Inheritance(strategy = InheritanceType.JOINED)// este es para agregarr una tabla q se han eredados los artibutos en otra clase, esta puede tener el .single_table q lo va a unir en una sola tabla y va a cargar mas rapido o en la q esta q lo divide en tablas pero demora en cargar
public class Habitaciones_Disponibles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDeHabitacion;
	
	private String descripcion;
	private BigDecimal precioPorDia;
	
	private LocalDate fechaDeRegistro = LocalDate.now();
	@ManyToOne//@Enumerated(EnumType.STRING)//este es para referirse a string en la clase enum// en manytoone es pàra importar muchos productos a uno solo
	private ReservaDeHabitacion reservaDeHabitacion;
	
	
	
	public Habitaciones_Disponibles( long idDeHabitacion, String descripcion, BigDecimal precioPorDia, ReservaDeHabitacion reservaDeHabitacion) {
		
		this.descripcion = descripcion;
		this.precioPorDia = precioPorDia;
		this.reservaDeHabitacion = reservaDeHabitacion;
	}
	
	

	public Habitaciones_Disponibles() {
		
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
}
