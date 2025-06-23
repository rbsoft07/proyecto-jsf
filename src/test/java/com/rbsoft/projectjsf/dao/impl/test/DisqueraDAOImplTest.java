/**
 * 
 */
package com.rbsoft.projectjsf.dao.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import com.rbsoft.projectjsf.dao.DisqueraDAO;
import com.rbsoft.projectjsf.dao.impl.DisqueraDAOImpl;
import com.rbsoft.projectjsf.entity.Disquera;

/**
 * 
 */
class DisqueraDAOImplTest {

	
	private DisqueraDAO disqueraDAO = new DisqueraDAOImpl();
	
	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.DisqueraDAOImpl#guardar(com.rbsoft.projectjsf.entity.Disquera)}.
	 */
	@Test
	void testGuardar() {
		
		Disquera objDisquera = new Disquera();
		objDisquera.setDescripcion("MegaForces");
		objDisquera.setFechaCreacion(LocalDateTime.now());
//		objDisquera.getFechaModificaion(LocalDateTime.now());
		this.disqueraDAO.guardar(null);
		
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.DisqueraDAOImpl#actulizar(com.rbsoft.projectjsf.entity.Disquera)}.
	 */
	@Test
	void testActulizar() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.DisqueraDAOImpl#eliminar(com.rbsoft.projectjsf.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.DisqueraDAOImpl#lstConlustas(com.rbsoft.projectjsf.entity.Disquera)}.
	 */
	@Test
	void testLstConlustas() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.DisqueraDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

}
