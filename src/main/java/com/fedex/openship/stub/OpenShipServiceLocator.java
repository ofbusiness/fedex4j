/**
 * OpenShipServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class OpenShipServiceLocator extends org.apache.axis.client.Service implements OpenShipService {

    public OpenShipServiceLocator() {
    }


    public OpenShipServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OpenShipServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OpenShipServicePort
    private String OpenShipServicePort_address = "https://wsbeta.fedex.com:443/web-services/openship";

    public String getOpenShipServicePortAddress() {
        return OpenShipServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private String OpenShipServicePortWSDDServiceName = "OpenShipServicePort";

    public String getOpenShipServicePortWSDDServiceName() {
        return OpenShipServicePortWSDDServiceName;
    }

    public void setOpenShipServicePortWSDDServiceName(String name) {
        OpenShipServicePortWSDDServiceName = name;
    }

    public OpenShipPortType getOpenShipServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OpenShipServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOpenShipServicePort(endpoint);
    }

    public OpenShipPortType getOpenShipServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fedex.openship.stub.OpenShipServiceSoapBindingStub _stub = new com.fedex.openship.stub.OpenShipServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getOpenShipServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOpenShipServicePortEndpointAddress(String address) {
        OpenShipServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (OpenShipPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fedex.openship.stub.OpenShipServiceSoapBindingStub _stub = new com.fedex.openship.stub.OpenShipServiceSoapBindingStub(new java.net.URL(OpenShipServicePort_address), this);
                _stub.setPortName(getOpenShipServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("OpenShipServicePort".equals(inputPortName)) {
            return getOpenShipServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "OpenShipService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "OpenShipServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("OpenShipServicePort".equals(portName)) {
            setOpenShipServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
