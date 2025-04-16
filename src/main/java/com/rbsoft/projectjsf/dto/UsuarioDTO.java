package com.rbsoft.projectjsf.dto;


/**
 * Clase que permitira mantener la informcion del usuario en sesion
 * 
 * */
public class UsuarioDTO {
	
	private String usuario; 
	
	private String clave;

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
