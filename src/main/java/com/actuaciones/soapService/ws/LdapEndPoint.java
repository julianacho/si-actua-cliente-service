package com.actuaciones.soapService.ws;

import java.text.SimpleDateFormat;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



import com.actuaciones.soapService.schema.ldap.LdapRequest;
import com.actuaciones.soapService.schema.ldap.LdapResponse;
import com.actuaciones.soapService.schema.ldap.ObjectFactory;
import com.actuaciones.soapService.service.EmpleadoServiceImpl;
/**
 * Clase que establece el endpoint del SOAP
 * @author Julian
 *
 * @param <empleadoResponse>
 */
@Endpoint
public class LdapEndPoint<ldapResponse>  {
	
	// Define el NameSpace a partir de lo definido en el xsd
		private static final String NAMESPACE_URI = "http://www.example.org/Ldap";

		
		// Se inyecta la implemnetacion del registro
//		@Autowired
//		EmpleadoServiceImpl empleadoServiceImpl;

		/**
		 * Metodo que permite almacenar el empleado
		 * @param request
		 * @return
		 */
		@PayloadRoot(namespace = NAMESPACE_URI, localPart = "ldapRequest")
		@ResponsePayload
		public JAXBElement<LdapResponse> saveEmpleado(@RequestPayload JAXBElement<LdapRequest> request) {

			ObjectFactory objectFactory = new ObjectFactory();
			LdapResponse ldapResponsefactory = objectFactory.createLdapResponse();// .createCollaboratorResponse();
			JAXBElement<LdapResponse> ldapResponse = objectFactory.createLdapResponse(ldapResponsefactory); // .createCollaboratorResponse(empleadoResponsefactory);
			
			System.out.println("Data: "+request.getValue().getUserName());
			LdapResponse rta=new LdapResponse();

			try {
				
				 rta.setDn("545");
				 rta.setGroup("Grpo 01");
				 rta.setIsError(false);
				 rta.setName("Julian");
				 rta.setUserName("desjgr");
				//Empleado emp = new Empleado();
//				emp.setApellidos(request.getValue().getApellidos());
//				emp.setCargo(request.getValue().getCargo());
//				emp.setEdadActual(request.getValue().getEdadActual());
//				emp.setFechaNacimiento(
//						new Date(request.getValue().getFechaNacimiento().toGregorianCalendar().getTime().getTime()));
//				emp.setFechaVinculacion(
//						new Date(request.getValue().getFechaVinculacion().toGregorianCalendar().getTime().getTime()));
//				emp.setNombres(request.getValue().getNombres());
//				emp.setSalario(request.getValue().getSalario());
//				emp.setTiempoVinculacion(request.getValue().getTiempoVinculacion());
//				emp.setTipoDocumento(request.getValue().getTipoDocumento());
	//
//				emp = empleadoServiceImpl.save(emp);

//				EmpleadoResponse rta = new EmpleadoResponse();
//				rta.setIdEmpleado(234);
//				rta.setMessage("Registro creado");

				ldapResponse.setValue(rta);

			} catch (Exception e) {
				 rta.setMessageError(e.getMessage());
				 rta.setIsError(true);
				 ldapResponse.setValue(rta);
				 
			
			}
			return ldapResponse;
		}

}
