package com.actuaciones.soapService.ws;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.actuaciones.soapService.entity.Empleado;
import com.actuaciones.soapService.schema.EmpleadoRequest;
import com.actuaciones.soapService.schema.EmpleadoResponse;
import com.actuaciones.soapService.schema.ObjectFactory;
import com.actuaciones.soapService.service.EmpleadoServiceImpl;

/**
 * Clase que establece el endpoint del SOAP
 * @author Julian
 *
 * @param <empleadoResponse>
 */
@Endpoint
public class EmpleadoEndpoint<empleadoResponse> {

	// Define el NameSpace a partir de lo definido en el xsd
	private static final String NAMESPACE_URI = "http://www.example.org/Empleado";

	// Genera formato para casteo de fechas
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

	// Se inyecta la implemnetacion del registro
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;

	/**
	 * Metodo que permite almacenar el empleado
	 * @param request
	 * @return
	 */
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "empleadoRequest")
	@ResponsePayload
	public JAXBElement<EmpleadoResponse> saveEmpleado(@RequestPayload JAXBElement<EmpleadoRequest> request) {

		ObjectFactory objectFactory = new ObjectFactory();
		EmpleadoResponse empleadoResponsefactory = objectFactory.createEmpleadoResponse();// .createCollaboratorResponse();
		JAXBElement<EmpleadoResponse> empleadoResponse = objectFactory.createEmpleadoResponse(empleadoResponsefactory); // .createCollaboratorResponse(empleadoResponsefactory);
		
		System.out.println("Apellidos: "+request.getValue().getApellidos());

		try {
			Empleado emp = new Empleado();
//			emp.setApellidos(request.getValue().getApellidos());
//			emp.setCargo(request.getValue().getCargo());
//			emp.setEdadActual(request.getValue().getEdadActual());
//			emp.setFechaNacimiento(
//					new Date(request.getValue().getFechaNacimiento().toGregorianCalendar().getTime().getTime()));
//			emp.setFechaVinculacion(
//					new Date(request.getValue().getFechaVinculacion().toGregorianCalendar().getTime().getTime()));
//			emp.setNombres(request.getValue().getNombres());
//			emp.setSalario(request.getValue().getSalario());
//			emp.setTiempoVinculacion(request.getValue().getTiempoVinculacion());
//			emp.setTipoDocumento(request.getValue().getTipoDocumento());
//
//			emp = empleadoServiceImpl.save(emp);

			EmpleadoResponse rta = new EmpleadoResponse();
			rta.setIdEmpleado(234);
			rta.setMessage("Registro creado");

			empleadoResponse.setValue(rta);

		} catch (Exception e) {
			EmpleadoResponse rta = new EmpleadoResponse();		
			rta.setMessage("Error al crear el registro");
			e.printStackTrace();
			empleadoResponse.setValue(rta);
		}
		return empleadoResponse;
	}
	

}
