package com.tyrone.hotel_alura.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "reserva")
@Getter
@Setter
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded //este es para referirse q algo se esta injectando
    private DatosPersonalesClientes datosPersonalesClientes;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Reserva reserva;
    private LocalDate fechaDeLaReserva= LocalDate.now();//se ocupara para ver el dia q se genero la reserva

    private LocalDate fechaReservada;

    public Reserva(String nombre, String dni, LocalDate fechaReservada) {
        this.datosPersonalesClientes = new DatosPersonalesClientes(nombre, dni);
        this.fechaReservada= fechaReservada;
    }

    public Reserva() {///
    }




//    public Long getId() {
//        return id;
//    }
//
//    public String getNombre() {
//        return datosPersonales.getNombre();
//    }
//
//    public void setNombre(String nombre) {
//        this.datosPersonales.setNombre(nombre);
//    }
//
//    public String getDni() {
//        return datosPersonales.getDni();
//    }
//
//    public void setDni(String dni) {
//        this.datosPersonales.setDni(dni);
//    }


}
