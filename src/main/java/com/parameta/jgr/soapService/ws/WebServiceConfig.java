package com.parameta.jgr.soapService.ws;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * Se crean las configuraciones para el servicio SOAP
 * @author Julian
 *
 */
@EnableWs
@Configuration
@EnableWebMvc
public class WebServiceConfig extends WsConfigurerAdapter {
	
	/**
	 * Metodo que registra el contexto que se usara
	 * @param context
	 * @return
	 */
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(messageDispatcherServlet,"/ws/*");
	}
	
	/**
	 * Metodoq que registra el schema a partir del xsd 
	 * @param empleadoSchema
	 * @return
	 */
	@Bean(name="empleado")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema empleadoSchema) {
		DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
		defaultWsdl11Definition.setPortTypeName("EmpleadoPort");
		defaultWsdl11Definition.setLocationUri("/ws");
		defaultWsdl11Definition.setTargetNamespace("http://www.example.org/Empleado");
		defaultWsdl11Definition.setSchema(empleadoSchema);
		return defaultWsdl11Definition;
	}
	
	@Bean
	public XsdSchema collaboratorSchema() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/Empleado.xsd"));
	}

}
