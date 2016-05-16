/**
 * PickupServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class PickupServiceLocator extends org.apache.axis.client.Service implements PickupService {

    public PickupServiceLocator() {
    }


    public PickupServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PickupServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PickupServicePort
    private String PickupServicePort_address = "https://wsbeta.fedex.com:443/web-services/pickup";

    public String getPickupServicePortAddress() {
        return PickupServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private String PickupServicePortWSDDServiceName = "PickupServicePort";

    public String getPickupServicePortWSDDServiceName() {
        return PickupServicePortWSDDServiceName;
    }

    public void setPickupServicePortWSDDServiceName(String name) {
        PickupServicePortWSDDServiceName = name;
    }

    public PickupPortType getPickupServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PickupServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPickupServicePort(endpoint);
    }

    public PickupPortType getPickupServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fedex.pickup.stub.PickupServiceSoapBindingStub _stub = new com.fedex.pickup.stub.PickupServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPickupServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPickupServicePortEndpointAddress(String address) {
        PickupServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PickupPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fedex.pickup.stub.PickupServiceSoapBindingStub _stub = new com.fedex.pickup.stub.PickupServiceSoapBindingStub(new java.net.URL(PickupServicePort_address), this);
                _stub.setPortName(getPickupServicePortWSDDServiceName());
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
        if ("PickupServicePort".equals(inputPortName)) {
            return getPickupServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("PickupServicePort".equals(portName)) {
            setPickupServicePortEndpointAddress(address);
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
