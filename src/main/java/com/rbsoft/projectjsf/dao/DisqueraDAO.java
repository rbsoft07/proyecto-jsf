/**
 * 
 */
package com.rbsoft.projectjsf.dao;

import java.util.List;

import com.rbsoft.projectjsf.entity.Disquera;

/**
 * @author rbsoft
 * Interface para la transacciones CRUD para la tabla Disquera
 */
public interface DisqueraDAO {
	
	void guardar(Disquera disquera);
	void actulizar(Disquera disquera);
	void eliminar(Long idDisquera);
	List<Disquera> lstConlustas();
	Disquera consultarById(Long id);
	

}
