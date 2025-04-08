package com.rbsoft.projectjsf.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;

/**
 * @author RBSOFT Clase que permite controlar el funcionamiento de la pantalla
 *         de login.xhtml
 */


@RequestScoped
@ManagedBean
public class LoginController implements Serializable {

	// Usuario que ingresa en el login
	public String usuario;
	
	// Clave que ingresa en el login
	public String clave;

	public LoginController() {

	}

	//Validacion para ingreso de aplicacion
	public void ingresar() {
		System.out.println(" Usuario : " + getUsuario());
		System.out.println(" Clave   : " + getClave());

		if (usuario.equals("user") && clave.equals("1234")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("idFormLogin:txtIdUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "Pagina no encontrada!!", ""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("idFormLogin:txtIdUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o Clave incorrecta", ""));
		}
	}

	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

}
