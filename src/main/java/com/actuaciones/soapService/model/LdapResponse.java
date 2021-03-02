package com.actuaciones.soapService.model;

import java.io.Serializable;

public class LdapResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6460936041972860798L;
	private Boolean isError;
	private String messageError;
	private LdapResponseData data;
	public Boolean getIsError() {
		return isError;
	}
	public void setIsError(Boolean isError) {
		this.isError = isError;
	}
	public String getMessageError() {
		return messageError;
	}
	public LdapResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setMessageError(String messageError) {
		this.messageError = messageError;
	}
	public LdapResponseData getData() {
		return data;
	}
	public void setData(LdapResponseData data) {
		this.data = data;
	}

	

}
