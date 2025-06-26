/**
 * 
 */
package com.rbsoft.projectjsf;

import java.time.LocalDateTime;

import com.rbsoft.projectjsf.dao.DisqueraDAO;
import com.rbsoft.projectjsf.dao.impl.DisqueraDAOImpl;
import com.rbsoft.projectjsf.entity.Disquera;

/**
 * 
 */
public class ProjectJsfApp {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {

		DisqueraDAO disqueraDAO = new DisqueraDAOImpl();
		Disquera objDisquera = new Disquera();
		objDisquera.setDescripcion("MegaForces");
		objDisquera.setFechaCreacion(LocalDateTime.now());
		objDisquera.setFechaModificaion(LocalDateTime.now());
		objDisquera.setEstatus(true);
		
		disqueraDAO.guardar(objDisquera);
		

	}

}
