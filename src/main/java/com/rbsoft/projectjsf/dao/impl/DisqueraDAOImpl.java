/**
 * 
 */
package com.rbsoft.projectjsf.dao.impl;

import java.util.List;

import com.rbsoft.projectjsf.conexion.ConexionDataBase;
import com.rbsoft.projectjsf.dao.DisqueraDAO;
import com.rbsoft.projectjsf.entity.Disquera;

import jakarta.persistence.EntityTransaction;

/**
 *  @author rbsoft
 *  Clase que permite implementar los metodos para realizar las
 *  transacciones para la tabla Disquera
 */
public class DisqueraDAOImpl extends ConexionDataBase implements DisqueraDAO {

	@Override
	public void guardar(Disquera disquera) {
		// TODO Auto-generated method stub
		EntityTransaction et = getConnetion().getTransaction();

		et.begin();
				
		try {
			getConnetion().persist(disquera);
			et.commit();
		} catch (Exception e) {
			System.out.println("");
			if (et != null) {
				et.rollback();	
			}
			e.printStackTrace();
			
		}finally {
			getConnetion().close();
		}
		
		
		
	}

	@Override
	public void actulizar(Disquera disquera) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Disquera disquera) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Disquera> lstConlustas(Disquera disquera) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DisqueraDAO consultarById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
