/**
 * 
 */
package com.rbsoft.projectjsf.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 */

@Entity
@Table (name = "disquera")
public class Disquera {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDisquera")
	private Long idDisquera;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion;
	
	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModificacion;
	
	@Column(name = "estatus")
	private boolean estatus;
	
	
	/**
	 * @return the idDisquera
	 */
	public Long getIdDisquera() {
		return idDisquera;
	}
	/**
	 * @param idDisquera the idDisquera to set
	 */
	public void setIdDisquera(Long idDisquera) {
		this.idDisquera = idDisquera;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the fechaCreacion
	 */
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the fechaModificaion
	 */
	public LocalDateTime getFechaModificaion() {
		return fechaModificacion;
	}
	/**
	 * @param fechaModificaion the fechaModificaion to set
	 */
	public void setFechaModificaion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
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
	
	
	

}
