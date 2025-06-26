/**
 * 
 */
package com.rbsoft.projectjsf.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author RBSOFT Clase que representa a un empleado
 */

@Table(name = "empleado")
public class Empleado implements Serializable {

	private Long id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String puesto;
	private boolean estatus;
	private String lugarTrabajo;

	public Empleado() {

	}

	public Empleado( Long id, String nombre, String primerApellido, String segundoApellido, String puesto, boolean estatus , String lugarTrabajo) {
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.puesto = puesto;
		this.estatus = estatus;
		this.lugarTrabajo = lugarTrabajo;
	}

	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}	
	
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/**
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	/**
	 * @return the lugarTrabajo
	 */
	public String getLugarTrabajo() {
		return lugarTrabajo;
	}

	/**
	 * @param lugarTrabajo the lugarTrabajo to set
	 */
	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}


	
	
}
