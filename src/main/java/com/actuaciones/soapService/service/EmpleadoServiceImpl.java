package com.actuaciones.soapService.service;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.actuaciones.soapService.entity.Empleado;

/**
 * Servico que gestiona el empleado
 * @author Julian
 *
 */
@Service("empleadoService")
//@Transactional
public class EmpleadoServiceImpl implements EmpleadoService{
	
	

	
	@Override	
	public Empleado save(Empleado empleado) {
		empleado.setIdEmpleado(1234);
		return empleado;
		//return empleadoRepository.saveAndFlush(empleado);
	}

}
