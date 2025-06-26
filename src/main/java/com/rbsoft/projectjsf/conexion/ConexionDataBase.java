package com.rbsoft.projectjsf.conexion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConexionDataBase {
	

	public static EntityManager getEntityManagerCon() {
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("Persistence_PU");
		
		 EntityManager manager = factory.createEntityManager();
		 return manager;
	}
	
}
