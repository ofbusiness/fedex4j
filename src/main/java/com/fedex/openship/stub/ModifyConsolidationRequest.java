/**
 * ModifyConsolidationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ModifyConsolidationRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private WebAuthenticationDetail webAuthenticationDetail;

    private ClientDetail clientDetail;

    private TransactionDetail transactionDetail;

    private VersionId version;

    /* If provided, identifies the consolidation to which this open
     * shipment belongs. */
    private ConsolidationKey consolidationKey;

    private RequestedConsolidation requestedConsolidation;

    public ModifyConsolidationRequest() {
    }

    public ModifyConsolidationRequest(
           WebAuthenticationDetail webAuthenticationDetail,
           ClientDetail clientDetail,
           TransactionDetail transactionDetail,
           VersionId version,
           ConsolidationKey consolidationKey,
           RequestedConsolidation requestedConsolidation) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.consolidationKey = consolidationKey;
           this.requestedConsolidation = requestedConsolidation;
    }


    /**
     * Gets the webAuthenticationDetail value for this ModifyConsolidationRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this ModifyConsolidationRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this ModifyConsolidationRequest.
     * 
     * @return clientDetail
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this ModifyConsolidationRequest.
     * 
     * @param clientDetail
     */
    public void setClientDetail(ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this ModifyConsolidationRequest.
     * 
     * @return transactionDetail
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this ModifyConsolidationRequest.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this ModifyConsolidationRequest.
     * 
     * @return version
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ModifyConsolidationRequest.
     * 
     * @param version
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the consolidationKey value for this ModifyConsolidationRequest.
     * 
     * @return consolidationKey   * If provided, identifies the consolidation to which this open
     * shipment belongs.
     */
    public ConsolidationKey getConsolidationKey() {
        return consolidationKey;
    }


    /**
     * Sets the consolidationKey value for this ModifyConsolidationRequest.
     * 
     * @param consolidationKey   * If provided, identifies the consolidation to which this open
     * shipment belongs.
     */
    public void setConsolidationKey(ConsolidationKey consolidationKey) {
        this.consolidationKey = consolidationKey;
    }


    /**
     * Gets the requestedConsolidation value for this ModifyConsolidationRequest.
     * 
     * @return requestedConsolidation
     */
    public RequestedConsolidation getRequestedConsolidation() {
        return requestedConsolidation;
    }


    /**
     * Sets the requestedConsolidation value for this ModifyConsolidationRequest.
     * 
     * @param requestedConsolidation
     */
    public void setRequestedConsolidation(RequestedConsolidation requestedConsolidation) {
        this.requestedConsolidation = requestedConsolidation;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ModifyConsolidationRequest)) return false;
        ModifyConsolidationRequest other = (ModifyConsolidationRequest) obj;
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
            ((this.consolidationKey==null && other.getConsolidationKey()==null) || 
             (this.consolidationKey!=null &&
              this.consolidationKey.equals(other.getConsolidationKey()))) &&
            ((this.requestedConsolidation==null && other.getRequestedConsolidation()==null) || 
             (this.requestedConsolidation!=null &&
              this.requestedConsolidation.equals(other.getRequestedConsolidation())));
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
        if (getConsolidationKey() != null) {
            _hashCode += getConsolidationKey().hashCode();
        }
        if (getRequestedConsolidation() != null) {
            _hashCode += getRequestedConsolidation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyConsolidationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ModifyConsolidationRequest"));
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
        elemField.setFieldName("consolidationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedConsolidation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedConsolidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RequestedConsolidation"));
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
