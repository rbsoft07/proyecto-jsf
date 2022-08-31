/**
 * 
 */
package com.rbsoft.projectjsf.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.rbsoft.projectjsf.entity.Empleado;
import com.rbsoft.projectjsf.services.EmpleadoService;

/**
 * @author RBSOFT Clase para manejar la informacion de la pantalla principal.
 *
 */
@ManagedBean
@ViewScoped
public class PrincipalController {

	/**
	 * Lista de empleados para el datatable
	 * 
	 */
	private List<Empleado> lstEmpleados;

	/**
	 * Servicio de empleados con la logica de negocio
	 * 
	 */
	private EmpleadoService objEmpleadoServoce = new EmpleadoService();

	@PostConstruct
	public void init() {
		this.consultarEmpleados();
		
	}
	
	/**
	 * Metodo que permite consultar los empleados.
	 * 
	 */
	public void consultarEmpleados() {
		setLstEmpleados(getObjEmpleadoServoce().consultarEmpleados());
	}

	/**
	 * @return the lstEmpleados
	 */
	public List<Empleado> getLstEmpleados() {
		return lstEmpleados;
	}

	/**
	 * @param lstEmpleados the lstEmpleados to set
	 */
	public void setLstEmpleados(List<Empleado> lstEmpleados) {
		this.lstEmpleados = lstEmpleados;
	}

	/**
	 * @return the objEmpleadoServoce
	 */
	public EmpleadoService getObjEmpleadoServoce() {
		return objEmpleadoServoce;
	}

	/**
	 * @param objEmpleadoServoce the objEmpleadoServoce to set
	 */
	public void setObjEmpleadoServoce(EmpleadoService objEmpleadoServoce) {
		this.objEmpleadoServoce = objEmpleadoServoce;
	}
	
	
	

}
