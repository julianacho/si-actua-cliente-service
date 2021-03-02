package com.actuaciones.soapService.ws;

import java.net.URI;

import javax.xml.bind.JAXBElement;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.actuaciones.soapService.schema.ldap.LdapRequest;
import com.actuaciones.soapService.schema.ldap.LdapResponse;
import com.actuaciones.soapService.schema.ldap.ObjectFactory;

/**
 * Clase que establece el endpoint del SOAP
 * 
 * @author Julian
 *
 * @param <empleadoResponse>
 */
@Endpoint
public class LdapEndPoint<ldapResponse> {

	// Define el NameSpace a partir de lo definido en el xsd
	private static final String NAMESPACE_URI = "http://www.example.org/Ldap";

	/**
	 * Metodo que permite almacenar el empleado
	 * 
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ldapRequest")
	@ResponsePayload
	public JAXBElement<LdapResponse> saveEmpleado(@RequestPayload JAXBElement<LdapRequest> request) {

		ObjectFactory objectFactory = new ObjectFactory();
		LdapResponse ldapResponsefactory = objectFactory.createLdapResponse();// .createCollaboratorResponse();
		JAXBElement<LdapResponse> ldapResponse = objectFactory.createLdapResponse(ldapResponsefactory); // .createCollaboratorResponse(empleadoResponsefactory);

		System.out.println("Data: " + request.getValue().getUserName());
		LdapResponse rta = new LdapResponse();

		try {

			com.actuaciones.soapService.model.LdapRequest requestLdap = new com.actuaciones.soapService.model.LdapRequest();
			requestLdap.setDn(request.getValue().getDn());
			requestLdap.setPassword(request.getValue().getPassword());
			requestLdap.setUserName(request.getValue().getUserName());

			RestTemplate restTemplate = new RestTemplate();
			final String baseUrl = request.getValue().getUrl();
			URI uri = new URI(baseUrl);

			HttpHeaders headers = new HttpHeaders();
			headers.set("x-api-key", request.getValue().getApyKey());
			HttpEntity<com.actuaciones.soapService.model.LdapRequest> requestRest = new HttpEntity<>(requestLdap,
					headers);
			ResponseEntity<com.actuaciones.soapService.model.LdapResponse> result = restTemplate.postForEntity(uri,
					requestRest, com.actuaciones.soapService.model.LdapResponse.class);
			if (result == null || result.getBody() == null) {
				rta.setMessageError("Error al consumir el servicio Ldap");
				rta.setIsError(true);
			} else {
				rta.setDn((result.getBody().getData() != null && result.getBody().getData().getDn() != null)
						? result.getBody().getData().getDn()
						: "");
				rta.setGroup((result.getBody().getData() != null && result.getBody().getData().getGroup() != null)
						? result.getBody().getData().getGroup()
						: "");
				rta.setName((result.getBody().getData() != null && result.getBody().getData().getName() != null)
						? result.getBody().getData().getName()
						: "");
				rta.setUserName((result.getBody().getData() != null && result.getBody().getData().getUserName() != null)
						? result.getBody().getData().getUserName()
						: "");
				rta.setPassword(
						(result.getBody().getIsError() != null) ? "" + result.getBody().getIsError() : "" + true);

			}
			ldapResponse.setValue(rta);

		} catch (Exception e) {
			rta.setMessageError(e.getMessage());
			rta.setIsError(true);
			ldapResponse.setValue(rta);

		}
		return ldapResponse;
	}

}
