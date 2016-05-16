/**
 * ModifyOpenShipmentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ModifyOpenShipmentRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private WebAuthenticationDetail webAuthenticationDetail;

    private ClientDetail clientDetail;

    private TransactionDetail transactionDetail;

    private VersionId version;

    /* This is used to specify processing options related to synchronous
     * or asynchronous processing. */
    private com.fedex.openship.stub.AsynchronousProcessingOptionsRequested asynchronousProcessingOptions;

    /* Customer-assigned identifier for this shipment (must be unique
     * for stand-alone open shipments, or unique within consolidation if
     * consolidation key is provided). */
    private String index;

    /* Specifies optional actions to be performed during the processing
     * of this open shipment. */
    private com.fedex.openship.stub.CreateOpenShipmentActionType[] actions;

    private RequestedShipment requestedShipment;

    public ModifyOpenShipmentRequest() {
    }

    public ModifyOpenShipmentRequest(
           WebAuthenticationDetail webAuthenticationDetail,
           ClientDetail clientDetail,
           TransactionDetail transactionDetail,
           VersionId version,
           com.fedex.openship.stub.AsynchronousProcessingOptionsRequested asynchronousProcessingOptions,
           String index,
           com.fedex.openship.stub.CreateOpenShipmentActionType[] actions,
           RequestedShipment requestedShipment) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.asynchronousProcessingOptions = asynchronousProcessingOptions;
           this.index = index;
           this.actions = actions;
           this.requestedShipment = requestedShipment;
    }


    /**
     * Gets the webAuthenticationDetail value for this ModifyOpenShipmentRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this ModifyOpenShipmentRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this ModifyOpenShipmentRequest.
     * 
     * @return clientDetail
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this ModifyOpenShipmentRequest.
     * 
     * @param clientDetail
     */
    public void setClientDetail(ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this ModifyOpenShipmentRequest.
     * 
     * @return transactionDetail
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this ModifyOpenShipmentRequest.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this ModifyOpenShipmentRequest.
     * 
     * @return version
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ModifyOpenShipmentRequest.
     * 
     * @param version
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the asynchronousProcessingOptions value for this ModifyOpenShipmentRequest.
     * 
     * @return asynchronousProcessingOptions   * This is used to specify processing options related to synchronous
     * or asynchronous processing.
     */
    public com.fedex.openship.stub.AsynchronousProcessingOptionsRequested getAsynchronousProcessingOptions() {
        return asynchronousProcessingOptions;
    }


    /**
     * Sets the asynchronousProcessingOptions value for this ModifyOpenShipmentRequest.
     * 
     * @param asynchronousProcessingOptions   * This is used to specify processing options related to synchronous
     * or asynchronous processing.
     */
    public void setAsynchronousProcessingOptions(com.fedex.openship.stub.AsynchronousProcessingOptionsRequested asynchronousProcessingOptions) {
        this.asynchronousProcessingOptions = asynchronousProcessingOptions;
    }


    /**
     * Gets the index value for this ModifyOpenShipmentRequest.
     * 
     * @return index   * Customer-assigned identifier for this shipment (must be unique
     * for stand-alone open shipments, or unique within consolidation if
     * consolidation key is provided).
     */
    public String getIndex() {
        return index;
    }


    /**
     * Sets the index value for this ModifyOpenShipmentRequest.
     * 
     * @param index   * Customer-assigned identifier for this shipment (must be unique
     * for stand-alone open shipments, or unique within consolidation if
     * consolidation key is provided).
     */
    public void setIndex(String index) {
        this.index = index;
    }


    /**
     * Gets the actions value for this ModifyOpenShipmentRequest.
     * 
     * @return actions   * Specifies optional actions to be performed during the processing
     * of this open shipment.
     */
    public com.fedex.openship.stub.CreateOpenShipmentActionType[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this ModifyOpenShipmentRequest.
     * 
     * @param actions   * Specifies optional actions to be performed during the processing
     * of this open shipment.
     */
    public void setActions(com.fedex.openship.stub.CreateOpenShipmentActionType[] actions) {
        this.actions = actions;
    }

    public com.fedex.openship.stub.CreateOpenShipmentActionType getActions(int i) {
        return this.actions[i];
    }

    public void setActions(int i, com.fedex.openship.stub.CreateOpenShipmentActionType _value) {
        this.actions[i] = _value;
    }


    /**
     * Gets the requestedShipment value for this ModifyOpenShipmentRequest.
     * 
     * @return requestedShipment
     */
    public RequestedShipment getRequestedShipment() {
        return requestedShipment;
    }


    /**
     * Sets the requestedShipment value for this ModifyOpenShipmentRequest.
     * 
     * @param requestedShipment
     */
    public void setRequestedShipment(RequestedShipment requestedShipment) {
        this.requestedShipment = requestedShipment;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ModifyOpenShipmentRequest)) return false;
        ModifyOpenShipmentRequest other = (ModifyOpenShipmentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webAuthenticationDetail==null && other.getWebAuthenticationDetail()==null) || 
             (this.webAuthenticationDetail!=null &&
              this.webAuthenticationDetail.equals(other.getWebAuthenticationDetail()))) &&
            ((this.clientDetail==null && other.getClientDetail()==null) || 
             (this.clientDetail!=null &&
              this.clientDetail.equals(other.getClientDetail()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.asynchronousProcessingOptions==null && other.getAsynchronousProcessingOptions()==null) || 
             (this.asynchronousProcessingOptions!=null &&
              this.asynchronousProcessingOptions.equals(other.getAsynchronousProcessingOptions()))) &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex()))) &&
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions()))) &&
            ((this.requestedShipment==null && other.getRequestedShipment()==null) || 
             (this.requestedShipment!=null &&
              this.requestedShipment.equals(other.getRequestedShipment())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getWebAuthenticationDetail() != null) {
            _hashCode += getWebAuthenticationDetail().hashCode();
        }
        if (getClientDetail() != null) {
            _hashCode += getClientDetail().hashCode();
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getAsynchronousProcessingOptions() != null) {
            _hashCode += getAsynchronousProcessingOptions().hashCode();
        }
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        if (getActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActions());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getActions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestedShipment() != null) {
            _hashCode += getRequestedShipment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyOpenShipmentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyOpenShipmentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAuthenticationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "WebAuthenticationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "WebAuthenticationDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ClientDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ClientDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asynchronousProcessingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AsynchronousProcessingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "AsynchronousProcessingOptionsRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CreateOpenShipmentActionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedShipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedShipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedShipment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
