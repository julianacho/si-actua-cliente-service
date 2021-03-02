package com.actuaciones.soapService.model;

import java.io.Serializable;

public class LdapRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1779193724186625343L;
	
	private String userName;
	private String Password;
	private String Dn;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getDn() {
		return Dn;
	}
	public void setDn(String dn) {
		Dn = dn;
	}
	

}
