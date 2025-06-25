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
	/**
	 * Metodo que permite ejecutar consultas JPQL a la entidad Disquera por medio de la descripcion
	 * @param descripcion {@link String }  descripcion de la disquera
	 * @retun {@link Disquera} resultado de la disquera consultada
	 *
	 **/
	
	Disquera consultaByDescriptionJPQL(String desc);
		
	
	/**
	 * Metodo que permite ejecutar consultar de manera nativa la entidad Disquera por medio de la descripcion
	 * @param descripcion {@link String }  descripcion de la disquera
	 * @retun {@link Disquera} resultado de la disquera consultada
	 *
	 **/
	
	Disquera consultaByDescriptionNative(String desc);
	

}
