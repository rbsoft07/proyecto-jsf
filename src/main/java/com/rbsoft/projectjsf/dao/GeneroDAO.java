/**
 * 
 */
package com.rbsoft.projectjsf.dao;

import java.util.List;

import com.rbsoft.projectjsf.entity.Genero;



/**
 * 
 */
public interface GeneroDAO {

	void guardar(Genero genero);
	void actulizar(Genero genero);
	void eliminar(Long idGenero);
	List<Genero> lstConlustas();
	Genero consultarById(Long id);

}
