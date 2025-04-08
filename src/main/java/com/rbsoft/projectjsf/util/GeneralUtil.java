package com.rbsoft.projectjsf.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class GeneralUtil {

	

	public static String  messagesValidationUser(String componente) {

	      FacesContext.getCurrentInstance().addMessage(componente,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario y/o Clave Correcto", ""));
	
	     return "Usuario o clave incorrecto ";
	
	}

}
