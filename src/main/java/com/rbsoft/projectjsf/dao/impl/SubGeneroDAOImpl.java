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

		try {
			et.begin();
			entityManager.persist(subGenero);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			entityManager.close();
		}

	}

	@Override
	public void actulizar(SubGenero subGenero) {
		try {
			et.begin();
			entityManager.merge(subGenero);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			entityManager.close();
		}

	}

	@Override
	public void eliminar(Long idSubGenero) {
		
		SubGenero objSubGenero = entityManager.find(SubGenero.class, idSubGenero);
		try {
			et.begin();
			entityManager.remove(objSubGenero);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();
		}finally {
			entityManager.close();
		}


	}

	@Override
	public List<SubGenero> lstConlustas() {
		@SuppressWarnings("unchecked")
		TypedQuery<SubGenero> query = (TypedQuery<SubGenero>) entityManager.createQuery("FROM SubGenero ORDER BY descripcion");
		return query.getResultList();
	}

	@Override
	public SubGenero consultarById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
