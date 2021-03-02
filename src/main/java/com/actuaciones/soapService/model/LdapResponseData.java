package com.actuaciones.soapService.model;

import java.io.Serializable;

public class LdapResponseData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5628459369868516040L;
	private String userName;
	private String name;
	private String password;
	private String dn;
	private String group;
	public LdapResponseData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDn() {
		return dn;
	}
	public void setDn(String dn) {
		this.dn = dn;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	

}
