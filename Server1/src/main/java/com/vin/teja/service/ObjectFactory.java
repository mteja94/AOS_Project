//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.10 at 03:59:46 PM EST 
//


package com.vin.teja.service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vin.teja.service package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vin.teja.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddRequest }
     * 
     */
    public AddRequest createAddRequest() {
        return new AddRequest();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link AliveResponse }
     * 
     */
    public AliveResponse createAliveResponse() {
        return new AliveResponse();
    }

    /**
     * Create an instance of {@link WhichResponse }
     * 
     */
    public WhichResponse createWhichResponse() {
        return new WhichResponse();
    }

    /**
     * Create an instance of {@link WhichRequest }
     * 
     */
    public WhichRequest createWhichRequest() {
        return new WhichRequest();
    }

    /**
     * Create an instance of {@link AliveRequest }
     * 
     */
    public AliveRequest createAliveRequest() {
        return new AliveRequest();
    }

    /**
     * Create an instance of {@link DeadResponse }
     * 
     */
    public DeadResponse createDeadResponse() {
        return new DeadResponse();
    }

    /**
     * Create an instance of {@link MinusRequest }
     * 
     */
    public MinusRequest createMinusRequest() {
        return new MinusRequest();
    }

    /**
     * Create an instance of {@link DeadRequest }
     * 
     */
    public DeadRequest createDeadRequest() {
        return new DeadRequest();
    }

}
