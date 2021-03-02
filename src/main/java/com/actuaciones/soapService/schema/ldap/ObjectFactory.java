//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.01 at 09:12:55 p. m. COT 
//


package com.actuaciones.soapService.schema.ldap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.actuaciones.soapService.schema.ldap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LdapRequest_QNAME = new QName("http://www.example.org/Ldap", "ldapRequest");
    private final static QName _LdapFault_QNAME = new QName("http://www.example.org/Ldap", "ldapFault");
    private final static QName _LdapResponse_QNAME = new QName("http://www.example.org/Ldap", "ldapResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.actuaciones.soapService.schema.ldap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LdapRequest }
     * 
     */
    public LdapRequest createLdapRequest() {
        return new LdapRequest();
    }

    /**
     * Create an instance of {@link LdapResponse }
     * 
     */
    public LdapResponse createLdapResponse() {
        return new LdapResponse();
    }

    /**
     * Create an instance of {@link LdapFault }
     * 
     */
    public LdapFault createLdapFault() {
        return new LdapFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LdapRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Ldap", name = "ldapRequest")
    public JAXBElement<LdapRequest> createLdapRequest(LdapRequest value) {
        return new JAXBElement<LdapRequest>(_LdapRequest_QNAME, LdapRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LdapFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Ldap", name = "ldapFault")
    public JAXBElement<LdapFault> createLdapFault(LdapFault value) {
        return new JAXBElement<LdapFault>(_LdapFault_QNAME, LdapFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LdapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Ldap", name = "ldapResponse")
    public JAXBElement<LdapResponse> createLdapResponse(LdapResponse value) {
        return new JAXBElement<LdapResponse>(_LdapResponse_QNAME, LdapResponse.class, null, value);
    }

}