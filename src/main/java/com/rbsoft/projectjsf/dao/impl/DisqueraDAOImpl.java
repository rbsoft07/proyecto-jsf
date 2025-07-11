/**
 * 
 */
package com.rbsoft.projectjsf.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.rbsoft.projectjsf.conexion.ConexionDataBase;
import com.rbsoft.projectjsf.dao.DisqueraDAO;
import com.rbsoft.projectjsf.entity.Disquera;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

/**
 * @author rbsoft Clase que permite implementar los metodos para realizar las
 *         transacciones para la tabla Disquera
 */
public class DisqueraDAOImpl extends ConexionDataBase implements DisqueraDAO {

	private EntityManager entityManager;
	
	private EntityTransaction et;
	
	
	public DisqueraDAOImpl() {
		 entityManager = getEntityManager();
		 et = entityManager.getTransaction();
	}

	@Override
	public void guardar(Disquera disquera) {
		
		et.begin();

		try {
			entityManager.persist(disquera);
			et.commit();
		} catch (Exception e) {
			System.out.println("Error la guardar!");
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();

		} finally {
			entityManager.close();
		}

	}

	@Override
	public void actulizar(Disquera disquera) {


		et.begin();

		try {
			entityManager.merge(disquera);
			et.commit();
		} catch (Exception e) {
			System.out.println("Error al actulizar!");
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();

		} finally {
			entityManager.close();
		}

	}

	@Override
	public void eliminar(Long idDisquera) {


		Disquera disqueraConsulta = entityManager.find(Disquera.class, idDisquera);

		EntityTransaction et = entityManager.getTransaction();

		et.begin();

		try {

			entityManager.remove(disqueraConsulta);
			et.commit();

		} catch (Exception e) {
			System.out.println("Error al actulizar!");
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();

		} finally {
			entityManager.close();
		}
	}

	@Override
	public List<Disquera> lstConlustas() {


		@SuppressWarnings("unchecked")
		TypedQuery<Disquera> queryDisquera = (TypedQuery<Disquera>) entityManager
				.createQuery("FROM Disquera ORDER BY descripcion");

		return queryDisquera.getResultList();
	}

	@Override
	public Disquera consultarById(Long id) {

		Disquera objDisquera = entityManager.find(Disquera.class, id);

		if (objDisquera == null) {
			throw new EntityNotFoundException("La Disquera con el id " + id + " no se ha encontrado!");

		}
		return objDisquera;

	}

	@Override
	public Disquera consultaByDescriptionJPQL(String desc) {
		List<Disquera> disqueraByDesc = new ArrayList();

		@SuppressWarnings("unchecked")
		TypedQuery<Disquera> queryDisquera = (TypedQuery<Disquera>) entityManager
				.createQuery("FROM Disquera WHERE descripcion = :description");
		
		queryDisquera.setParameter("description", desc);
		
		disqueraByDesc  = queryDisquera.getResultList();
		
		
		return !disqueraByDesc.isEmpty() ? disqueraByDesc.get(0) : null;
		
	}

	@Override
	public Disquera consultaByDescriptionNative(String desc) {

		List<Disquera> disqueraByDesc = new ArrayList();

		@SuppressWarnings("unchecked")
		TypedQuery<Disquera> queryDisquera = (TypedQuery<Disquera>) entityManager
				.createNativeQuery("SELECT * FROM disquera WHERE descripcion = :description",Disquera.class);
		
		queryDisquera.setParameter("description", desc);
		
		disqueraByDesc  = queryDisquera.getResultList();
		
		
		return !disqueraByDesc.isEmpty() ? disqueraByDesc.get(0) : null;
	}

	
	
}
