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
	
	
	private Empleado selectEmpleado;

	private List<Empleado> lstEmpleadosFiltrados;
	/**
	 * Lista de empleados para el datatable
	 * 
	 */
	private List<Empleado> lstEmpleados;

	/**
	 * Servicio de empleados con la logica de negocio
	 * 
	 */
	private EmpleadoService objEmpleadoService = new EmpleadoService();

	@PostConstruct
	public void init() {
		this.consultarEmpleados();
		
	}
	
	/**
	 * Metodo que permite consultar los empleados.
	 * 
	 */
	public void consultarEmpleados() {
		setLstEmpleados(getObjEmpleadoService().consultarEmpleados());
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
	 * @return the objEmpleadoService
	 */
	public EmpleadoService getObjEmpleadoService() {
		return objEmpleadoService;
	}

	/**
	 * @param objEmpleadoService the objEmpleadoService to set
	 */
	public void setObjEmpleadoService(EmpleadoService objEmpleadoServoce) {
		this.objEmpleadoService = objEmpleadoServoce;
	}

	/**
	 * @return the selectEmpleado
	 */
	public Empleado getSelectEmpleado() {
		return selectEmpleado;
	}

	/**
	 * @param selectEmpleado the selectEmpleado to set
	 */
	public void setSelectEmpleado(Empleado selectEmpleado) {
		this.selectEmpleado = selectEmpleado;
	}

	public List<Empleado> getLstEmpleadosFiltrados() {
		return lstEmpleadosFiltrados;
	}

	public void setLstEmpleadosFiltrados(List<Empleado> lstEmpleadosFiltrados) {
		this.lstEmpleadosFiltrados = lstEmpleadosFiltrados;
	}
}
