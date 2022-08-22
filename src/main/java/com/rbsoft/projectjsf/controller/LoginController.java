package com.rbsoft.projectjsf.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 * @author RBSOFT
 * Clase que permite controlar el funcionamiento de la pantalla de login.xhtml
 * */

@ManagedBean (name = "login")
@RequestScoped
public class LoginController implements Serializable{
	
	//Usuario que ingresa en el login
	public String usuario;
	//Clave que ingresa en el login
	public String clave;
	
	
	public LoginController() {
	
	}
	
	
	public void ingresar() {
		System.out.println(" Usuario : " + usuario);
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
