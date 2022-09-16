package com.billionpizzas.db;

/**
 *
 * @author Marcos Alcántara Hernández
 * @date 13/09/2022
 * @time 15:51:22
 */

import javax.persistence.Persistence;
import javax.persistence.EntityManager;

public class ConexionPU {
    private static final String PERSISTENCE_UNIT_NAME = "control_pizzeria_pu";
    private EntityManager entityManager;
    private static ConexionPU instance;
    
    private ConexionPU() {
        try {
            entityManager = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
            System.out.println("Conexion establecida con éxito através de una unidad de persistencia");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static ConexionPU getInstance(){
        if (instance == null) {
            instance = new ConexionPU();
        }
        return instance;
    }
    
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
