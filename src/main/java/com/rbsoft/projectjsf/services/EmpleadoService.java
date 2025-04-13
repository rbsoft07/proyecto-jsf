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
		
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoInstagram = new Empleado();
		Empleado empleadoTiktok = new Empleado();
		
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
		
		//////////////////////////////////////////////////
		empleadoOracle.setId(new Long (1257));
		empleadoOracle.setNombre("Manuel");
		empleadoOracle.setPrimerApellido("Granderf");
		empleadoOracle.setSegundoApellido("Simer");
		empleadoOracle.setPuesto("Developer Cloud java");
		empleadoOracle.setEstatus(true);
		empleadoOracle.setLugarTrabajo("ORACLE");;



		empleadoMicrosoft.setId(new Long (1258));
		empleadoMicrosoft.setNombre("Cristian");
		empleadoMicrosoft.setPrimerApellido("Grifo");
		empleadoMicrosoft.setSegundoApellido("Simer");
		empleadoMicrosoft.setPuesto("Developer .net core");
		empleadoMicrosoft.setEstatus(false);
		empleadoMicrosoft.setLugarTrabajo("Microsoft");;



		empleadoInstagram.setId(new Long (1259));
		empleadoInstagram.setNombre("Frank");
		empleadoInstagram.setPrimerApellido("Farmers");
		empleadoInstagram.setSegundoApellido("Simer");
		empleadoInstagram.setPuesto("Disegner UI/UX");
		empleadoInstagram.setEstatus(false);
		empleadoInstagram.setLugarTrabajo("Instagram");;


		empleadoTiktok.setId(new Long (1260));
		empleadoTiktok.setNombre("Vincent");	
		empleadoTiktok.setPrimerApellido("Grandest");
		empleadoTiktok.setSegundoApellido("Simer");
		empleadoTiktok.setPuesto("QA Automation");
		empleadoTiktok.setEstatus(false);
		empleadoTiktok.setLugarTrabajo("Tik Tok");;




		lstEmpeados.add(empleadoFB);
		lstEmpeados.add(empleadoYoutube);
		lstEmpeados.add(empleadoGoogle);
		lstEmpeados.add(empleadoPlazit);

		lstEmpeados.add(empleadoOracle);
		lstEmpeados.add(empleadoMicrosoft);
		lstEmpeados.add(empleadoInstagram);
		lstEmpeados.add(empleadoTiktok);
		
		
		return lstEmpeados;
		
	}
}
