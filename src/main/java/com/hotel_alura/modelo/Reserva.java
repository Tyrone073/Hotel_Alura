package com.hotel_alura.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.hotel_alura.modelo.Cliente;

@Entity
@Table(name = "reservas")
public class Reserva {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate fechaDeLaReserva= LocalDate.now();//se ocupara para ver el dia q se genero la reserva
	
	@ManyToOne(fetch=FetchType.LAZY)//para q me traiga a los clientes si lo deseo
	private Cliente cliente;
	
	private LocalDate diaInicio;
	private LocalDate diaFin;
	
	public Reserva() {//y este es para llamar a todas las reservas
	}

	public Reserva(Cliente cliente) {// este es para llamar los datos del cliente y su reserva
		this.cliente = cliente;
	}

	public LocalDate getFechaDeLaReserva() {
		return fechaDeLaReserva;
	}

	public void setFechaDeLaReserva(LocalDate fecha) {
		this.fechaDeLaReserva = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public LocalDate getDiaInicio() {
		return diaInicio;
	}

	public void setDiaInicio(LocalDate diaInicio) {
		this.diaInicio = diaInicio;
	}

	public LocalDate getDiaFin() {
		return diaFin;
	}

	public void setDiaFin(LocalDate diaFin) {
		this.diaFin = diaFin;
	}

	public Long getId() {
		return id;
	}
	
}
