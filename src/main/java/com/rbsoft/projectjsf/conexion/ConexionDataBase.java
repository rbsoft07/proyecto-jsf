package com.rbsoft.projectjsf.conexion;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConexionDataBase {
	
    public static final EntityManagerFactory emf  = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("Persistence_PU");
    }

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

	
}
