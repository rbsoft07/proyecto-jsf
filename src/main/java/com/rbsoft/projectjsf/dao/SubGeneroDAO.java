/**
 * 
 */
package com.rbsoft.projectjsf.dao;

import java.util.List;

import com.rbsoft.projectjsf.entity.SubGenero;



/**
 * 
 */
public interface SubGeneroDAO {

	void guardar(SubGenero subGenero);
	void actulizar(SubGenero subGenero);
	void eliminar(Long idSubGenero);
	List<SubGenero> lstConlustas();
	SubGenero consultarById(Long id);

}
