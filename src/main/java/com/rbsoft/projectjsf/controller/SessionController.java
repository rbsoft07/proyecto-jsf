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
	
	
	private UsuarioDTO usuarioDTO;
	
	@PostConstruct
	public void init() {
		
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
