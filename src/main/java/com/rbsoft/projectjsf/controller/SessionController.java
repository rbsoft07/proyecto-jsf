package com.rbsoft.projectjsf.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.rbsoft.projectjsf.dto.UsuarioDTO;

/*
 * Clase para manejar la informcion de usuario en el aplicativo 
 * por medio a session
 * 
 * */

@ManagedBean
@SessionScoped
public class SessionController {
	
	/**
	 * DTO que mantendra la informacion del usuario Logueado. 
	 * */
	
	private UsuarioDTO usuarioDTO;
	
	/**
	 * Inicializa la sesion del usuario.
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en la sesion.. ");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

}
