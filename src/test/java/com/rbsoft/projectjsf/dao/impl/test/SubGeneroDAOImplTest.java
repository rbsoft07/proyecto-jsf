/**
 * 
 */
package com.rbsoft.projectjsf.dao.impl.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.rbsoft.projectjsf.dao.SubGeneroDAO;
import com.rbsoft.projectjsf.dao.impl.SubGeneroDAOImpl;
import com.rbsoft.projectjsf.entity.Genero;
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

	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.SubGeneroDAOImpl#guardar(com.rbsoft.projectjsf.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subGenero = new SubGenero();
		subGenero.setDescripcion("Dancehall");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setEstatus(true);
		
		Genero genero = new Genero();
		genero.setDescripcion("Reggea");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		
		subGenero.setGenero(genero);
		
		this.objSubGeneroDAO.guardar(subGenero);
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.SubGeneroDAOImpl#actulizar(com.rbsoft.projectjsf.entity.SubGenero)}.
	 */
	@Test
	void testActulizar() {
		SubGenero subGeneroConsultado = this.objSubGeneroDAO.consultarById(5L);
		subGeneroConsultado.setDescripcion("Rocksteady");
		subGeneroConsultado.getGenero().setDescripcion("ReggeaMusic");
		
		this.objSubGeneroDAO.actulizar(subGeneroConsultado);
		
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		this.objSubGeneroDAO.eliminar(4L);
	}

	/**
	 * Test method for {@link com.rbsoft.projectjsf.dao.impl.SubGeneroDAOImpl#lstConlustas()}.
	 */
	@Test
	void testLstConlustas() {
		List<SubGenero> lstSubGeneros = this.objSubGeneroDAO.lstConlustas();
		
		assertTrue(lstSubGeneros.size() > 0 );
		
		lstSubGeneros.forEach(sub -> { 
			System.out.println("Id SubGenero: " +  sub.getIdSubGenero()  
			+" SubGenero: " + sub.getDescripcion() 
			+ "  Genero: " + sub.getGenero().getDescripcion());
			
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
