/**
 * 
 */
package com.rbsoft.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.rbsoft.projectjsf.entity.Empleado;

/**
 * @author RBSOFT
 * Clase que permite realizar la logica de negocio para empleados. 
 *
 */
public class EmpleadoService {

	/**
	 * Metodo que permite consultar una lista de empleados de empresa de TI
	 * 
	 * @return {@link Empleado} lista de Empleados.
	 * */
	
	public List<Empleado> consultarEmpleados(){
		
		List<Empleado> lstEmpeados = new ArrayList<>();
		
		Empleado empleadoFB = new Empleado();
		Empleado empleadoYoutube = new Empleado();
		Empleado empleadoGoogle = new Empleado();
		
		empleadoFB.setNombre("Manuel");
		empleadoFB.setPrimerApellido("Carraño");
		empleadoFB.setSegundoApellido("Florentino");
		empleadoFB.setPuesto("Senior PHP Developer ");
		empleadoFB.setEstatus(true);
		
		empleadoYoutube.setNombre("Fred");
		empleadoYoutube.setPrimerApellido("Fria");
		empleadoYoutube.setSegundoApellido("Moquete");
		empleadoYoutube.setPuesto("Semi-Senior Angular FrontEnd ");
		empleadoYoutube.setEstatus(true);
		
		empleadoGoogle.setNombre("Joel");
		empleadoGoogle.setPrimerApellido("Zazuga");
		empleadoGoogle.setSegundoApellido("Grax");
		empleadoGoogle.setPuesto("Manager IT Deparment");
		empleadoGoogle.setEstatus(true);

		lstEmpeados.add(empleadoFB);
		lstEmpeados.add(empleadoYoutube);
		lstEmpeados.add(empleadoGoogle);
		
		return lstEmpeados;
		

	}
}
