/**
 * 
 */
package com.rbsoft.projectjsf.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

import com.rbsoft.projectjsf.util.GeneralUtil;

/**
 * 
 */
@ManagedBean
public class SessionClosedController {
	
	@PostConstruct
	public void init() {
		
		System.out.println("Cerrando Session..!!");
		
	}

	/**
	 * Metodo que permita cerrar la session y volver a la pantalla de login. 
	 * 
	 * */
	
	public void cerrarSession() {
		ExternalContext externalContex = FacesContext.getCurrentInstance().getExternalContext();
		externalContex.invalidateSession();
		try {
			GeneralUtil.redireccionar("login.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
