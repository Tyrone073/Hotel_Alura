package com.tyrone.hotel_alura.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "habitaciones")
public class ReservaDeHabitacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; // este va a ser el numero de habitacion
	
	@ManyToOne(fetch=FetchType.LAZY)//reelaciona a la clase pedido, el de arriba con el de producto y para cerrarlo se debe ir a la clase pedido
	private Reserva reserva;
	
	private int cantidadDeHabitaciones;
	private BigDecimal precioUnitario;
	
	private LocalDate diaInicio;
	private LocalDate diaFin;
	
	public ReservaDeHabitacion(int cantidadDeHabitaciones, LocalDate diaInicio, LocalDate diaFin, Reserva reserva ) {

		this.cantidadDeHabitaciones = cantidadDeHabitaciones;
		this.diaInicio = diaInicio;
		this.diaFin = diaFin;
		this.precioUnitario = precioUnitario;
	}

	public ReservaDeHabitacion() {
	}
	
	
}
