/**
 * 
 */
package com.rbsoft.projectjsf.conexion;

import java.util.List;

/**
 * 
 */
public interface CrudConexionDAO<T>{
	
	void persistir(T t);
	void merge(T t);
	void remove (Long id);
	T getById(Long id);
	List<T> getAll();
	
	
}
