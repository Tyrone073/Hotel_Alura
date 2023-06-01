package com.tyrone.hotel_alura.dao;

import com.tyrone.hotel_alura.modelo.DatosPersonalesClientes;
import com.tyrone.hotel_alura.modelo.Reserva;

import javax.persistence.EntityManager;

public class ReservaDao {
    private EntityManager em;

    public  ReservaDao(EntityManager em){
        this.em = em;
    }
    public void guadrar(Reserva reserva) {
        this.em.persist(reserva);
    }
}
