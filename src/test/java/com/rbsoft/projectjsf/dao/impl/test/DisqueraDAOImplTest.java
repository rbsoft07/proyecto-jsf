/**
 * 
 */
package com.rbsoft.projectjsf.dao.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

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
		objDisquera.setFechaModificaion(LocalDateTime.now());
		objDisquera.setEstatus(true);
		
		this.disqueraDAO.guardar(objDisquera);
		
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.DisqueraDAOImpl#actulizar(com.rbsoft.projectjsf.entity.Disquera)}.
	 */
	@Test
	void testActulizar() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarById(4L);
		
		disqueraConsultada.setDescripcion("Disquera Romanof");
		
		this.disqueraDAO.actulizar(disqueraConsultada);
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.DisqueraDAOImpl#eliminar(com.rbsoft.projectjsf.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		Long id = 4L;
		this.disqueraDAO.eliminar(id);
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.DisqueraDAOImpl#lstConlustas(com.rbsoft.projectjsf.entity.Disquera)}.
	 */
	@Test
	void testLstConlustas() {
		List<Disquera> lstDisqueras = this.disqueraDAO.lstConlustas();
		
		assertTrue(lstDisqueras.size() >0 );
		lstDisqueras.forEach(disquera -> { 
			System.out.println("Disquera : " + disquera.getDescripcion());
		});
		
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.DisqueraDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		Disquera disquera = this.disqueraDAO.consultarById(4L);
		System.out.println("Disquera " + disquera.getDescripcion());
	}

}
