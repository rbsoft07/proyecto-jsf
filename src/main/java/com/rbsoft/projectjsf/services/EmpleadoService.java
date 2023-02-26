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
		Empleado empleadoPlazit = new Empleado();
		
		empleadoFB.setId( new Long (1254));
		empleadoFB.setNombre("Manuel");
		empleadoFB.setPrimerApellido("Carraño");
		empleadoFB.setSegundoApellido("Florentino");
		empleadoFB.setPuesto("Senior PHP Developer ");
		empleadoFB.setEstatus(true);
		empleadoFB.setLugarTrabajo("FaceBook");
		
		
		empleadoYoutube.setId( new Long (1255));
		empleadoYoutube.setNombre("Fred");
		empleadoYoutube.setPrimerApellido("Fria");
		empleadoYoutube.setSegundoApellido("Moquete");
		empleadoYoutube.setPuesto("Semi-Senior Angular FrontEnd ");
		empleadoYoutube.setEstatus(true);
		empleadoYoutube.setLugarTrabajo("Youtube");
		
		
		empleadoGoogle.setId(new Long (1256));
		empleadoGoogle.setNombre("Joel");
		empleadoGoogle.setPrimerApellido("Zazuga");
		empleadoGoogle.setSegundoApellido("Grax");
		empleadoGoogle.setPuesto("Manager IT Deparment");
		empleadoGoogle.setEstatus(true);
		empleadoGoogle.setLugarTrabajo("Google");;

		
		empleadoPlazit.setId(new Long (1257));
		empleadoPlazit.setNombre("Luis");
		empleadoPlazit.setPrimerApellido("Granderf");
		empleadoPlazit.setSegundoApellido("Simer");
		empleadoPlazit.setPuesto("Developer Senior Java");
		empleadoPlazit.setEstatus(false);
		empleadoPlazit.setLugarTrabajo("PLATZI");;
		
		
		lstEmpeados.add(empleadoFB);
		lstEmpeados.add(empleadoYoutube);
		lstEmpeados.add(empleadoGoogle);
		lstEmpeados.add(empleadoPlazit);
		
		
		return lstEmpeados;
		
	}
}
