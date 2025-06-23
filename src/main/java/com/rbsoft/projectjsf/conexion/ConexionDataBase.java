package com.rbsoft.projectjsf.conexion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConexionDataBase {
	
	public EntityManagerFactory EMF;
	
	
	public ConexionDataBase() {
		EMF = Persistence.createEntityManagerFactory("con_ddbb_tienda");
	}

	
	public EntityManager getConnetion() {
		return EMF.createEntityManager();
	}
}
