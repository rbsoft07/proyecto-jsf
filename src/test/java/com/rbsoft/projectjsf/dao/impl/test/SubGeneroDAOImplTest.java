/**
 * 
 */
package com.rbsoft.projectjsf.dao.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.rbsoft.projectjsf.dao.SubGeneroDAO;
import com.rbsoft.projectjsf.dao.impl.SubGeneroDAOImpl;
import com.rbsoft.projectjsf.entity.SubGenero;

/**
 * 
 */
class SubGeneroDAOImplTest {

	private SubGeneroDAO objSubGeneroDAO = new SubGeneroDAOImpl();
	
	
	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.SubGeneroDAOImpl#SubGeneroDAOImpl()}.
	 */
	@Test
	void testSubGeneroDAOImpl() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.SubGeneroDAOImpl#guardar(com.rbsoft.projectjsf.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.SubGeneroDAOImpl#actulizar(com.rbsoft.projectjsf.entity.SubGenero)}.
	 */
	@Test
	void testActulizar() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.SubGeneroDAOImpl#lstConlustas()}.
	 */
	@Test
	void testLstConlustas() {
		List<SubGenero> lstSubGeneros = this.objSubGeneroDAO.lstConlustas();
		
		assertTrue(lstSubGeneros.size() > 0 );
		
		lstSubGeneros.forEach(sub -> { System.out.println("Id SubGenero: " +  sub.getIdSubGenero()  +"SubGenero: " + sub.getDescripcion());
			
		});
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.SubGeneroDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

}
