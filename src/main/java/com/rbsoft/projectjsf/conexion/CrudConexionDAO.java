/**
 * 
 */
package com.rbsoft.projectjsf.conexion;

import java.util.List;

/**
 * 
 */
public interface CrudConexionDAO <T>{
	
	void guardar(T t);
	void actualizar(T t);
	void eliminar (Long id);
	T obtenerPorId(Long id);
	List<T> ltsObtenerTodos();
	
	
}
