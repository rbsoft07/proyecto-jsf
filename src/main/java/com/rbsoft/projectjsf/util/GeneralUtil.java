package com.rbsoft.projectjsf.util;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class GeneralUtil {

	public static String messagesValidationUser(String componente) {

		FacesContext.getCurrentInstance().addMessage(componente,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario y/o Clave Correcto", ""));

		return "Usuario o clave incorrecto ";

	}
	
	/**
	 * Metodo que permite redireccionar a una pantalla
	 * @param pagina {@link String } pagina a redireccionarse
	 * @throws IOException Excepcion en caso de error al no encontrar la pagina.
	 * */
	@SuppressWarnings("unused")
	public static void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

}
