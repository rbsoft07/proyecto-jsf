/**
 * 
 */
package com.rbsoft.projectjsf.dao.impl;

import java.util.List;

import com.rbsoft.projectjsf.conexion.ConexionDataBase;
import com.rbsoft.projectjsf.dao.SubGeneroDAO;
import com.rbsoft.projectjsf.entity.SubGenero;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;

/**
 * @author rbsoft
 * Clase para la gestion de las operaciones CRUD para la tabla subgenero
 */
public class SubGeneroDAOImpl extends ConexionDataBase implements SubGeneroDAO {

	private EntityManager entityManager;
	
	private EntityTransaction et;
	
	
	public SubGeneroDAOImpl() {
		 entityManager = getEntityManager();
		 et = entityManager.getTransaction();
	}

	
	@Override
	public void guardar(SubGenero subGenero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actulizar(SubGenero subGenero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Long idSubGenero) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<SubGenero> lstConlustas() {
		TypedQuery<SubGenero> query = (TypedQuery<SubGenero>) entityManager.createQuery("FROM SubGenero ORDER BY descripcion");
		return query.getResultList();
	}

	@Override
	public SubGenero consultarById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
