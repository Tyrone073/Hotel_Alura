package com.tyrone.hotel_alura.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("hotel_alura");//este es para hacer la coneccion a la base de datos y se puede instanciar a las dema sc alases como EntityManagerFactory especialmente en las clases Dao

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

}
