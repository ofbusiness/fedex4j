/**
 * ConfirmConsolidationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ConfirmConsolidationRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private WebAuthenticationDetail webAuthenticationDetail;

    private ClientDetail clientDetail;

    private TransactionDetail transactionDetail;

    private VersionId version;

    /* This is used to specify processing options related to synchronous
     * or asynchronous processing. */
    private com.fedex.openship.stub.AsynchronousProcessingOptionsRequested asynchronousProcessingOptions;

    /* Identifies the consolidation containing the open shipment which
     * contains the desired package. */
    private ConsolidationKey consolidationKey;

    private LabelSpecification labelSpecification;

    /* Contains data used to create additional (non-label) shipping
     * documents. */
    private com.fedex.openship.stub.ShippingDocumentSpecification shippingDocumentSpecification;

    /* Contains data used to create additional (non-label) consolidation
     * documents. */
    private com.fedex.openship.stub.ConsolidationDocumentSpecification consolidationDocumentSpecification;

    /* Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer. */
    private RateRequestType[] rateRequestTypes;

    /* Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services. */
    private EdtRequestType edtRequestType;

    public ConfirmConsolidationRequest() {
    }

    public ConfirmConsolidationRequest(
           WebAuthenticationDetail webAuthenticationDetail,
           ClientDetail clientDetail,
           TransactionDetail transactionDetail,
           VersionId version,
           com.fedex.openship.stub.AsynchronousProcessingOptionsRequested asynchronousProcessingOptions,
           ConsolidationKey consolidationKey,
           LabelSpecification labelSpecification,
           com.fedex.openship.stub.ShippingDocumentSpecification shippingDocumentSpecification,
           com.fedex.openship.stub.ConsolidationDocumentSpecification consolidationDocumentSpecification,
           RateRequestType[] rateRequestTypes,
           EdtRequestType edtRequestType) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.asynchronousProcessingOptions = asynchronousProcessingOptions;
           this.consolidationKey = consolidationKey;
           this.labelSpecification = labelSpecification;
           this.shippingDocumentSpecification = shippingDocumentSpecification;
           this.consolidationDocumentSpecification = consolidationDocumentSpecification;
           this.rateRequestTypes = rateRequestTypes;
           this.edtRequestType = edtRequestType;
    }


    /**
     * Gets the webAuthenticationDetail value for this ConfirmConsolidationRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this ConfirmConsolidationRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this ConfirmConsolidationRequest.
     * 
     * @return clientDetail
     */
    public ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this ConfirmConsolidationRequest.
     * 
     * @param clientDetail
     */
    public void setClientDetail(ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this ConfirmConsolidationRequest.
     * 
     * @return transactionDetail
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this ConfirmConsolidationRequest.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this ConfirmConsolidationRequest.
     * 
     * @return version
     */
    public VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ConfirmConsolidationRequest.
     * 
     * @param version
     */
    public void setVersion(VersionId version) {
        this.version = version;
    }


    /**
     * Gets the asynchronousProcessingOptions value for this ConfirmConsolidationRequest.
     * 
     * @return asynchronousProcessingOptions   * This is used to specify processing options related to synchronous
     * or asynchronous processing.
     */
    public com.fedex.openship.stub.AsynchronousProcessingOptionsRequested getAsynchronousProcessingOptions() {
        return asynchronousProcessingOptions;
    }


    /**
     * Sets the asynchronousProcessingOptions value for this ConfirmConsolidationRequest.
     * 
     * @param asynchronousProcessingOptions   * This is used to specify processing options related to synchronous
     * or asynchronous processing.
     */
    public void setAsynchronousProcessingOptions(com.fedex.openship.stub.AsynchronousProcessingOptionsRequested asynchronousProcessingOptions) {
        this.asynchronousProcessingOptions = asynchronousProcessingOptions;
    }


    /**
     * Gets the consolidationKey value for this ConfirmConsolidationRequest.
     * 
     * @return consolidationKey   * Identifies the consolidation containing the open shipment which
     * contains the desired package.
     */
    public ConsolidationKey getConsolidationKey() {
        return consolidationKey;
    }


    /**
     * Sets the consolidationKey value for this ConfirmConsolidationRequest.
     * 
     * @param consolidationKey   * Identifies the consolidation containing the open shipment which
     * contains the desired package.
     */
    public void setConsolidationKey(ConsolidationKey consolidationKey) {
        this.consolidationKey = consolidationKey;
    }


    /**
     * Gets the labelSpecification value for this ConfirmConsolidationRequest.
     * 
     * @return labelSpecification
     */
    public LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }


    /**
     * Sets the labelSpecification value for this ConfirmConsolidationRequest.
     * 
     * @param labelSpecification
     */
    public void setLabelSpecification(LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
    }


    /**
     * Gets the shippingDocumentSpecification value for this ConfirmConsolidationRequest.
     * 
     * @return shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public com.fedex.openship.stub.ShippingDocumentSpecification getShippingDocumentSpecification() {
        return shippingDocumentSpecification;
    }


    /**
     * Sets the shippingDocumentSpecification value for this ConfirmConsolidationRequest.
     * 
     * @param shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public void setShippingDocumentSpecification(com.fedex.openship.stub.ShippingDocumentSpecification shippingDocumentSpecification) {
        this.shippingDocumentSpecification = shippingDocumentSpecification;
    }


    /**
     * Gets the consolidationDocumentSpecification value for this ConfirmConsolidationRequest.
     * 
     * @return consolidationDocumentSpecification   * Contains data used to create additional (non-label) consolidation
     * documents.
     */
    public com.fedex.openship.stub.ConsolidationDocumentSpecification getConsolidationDocumentSpecification() {
        return consolidationDocumentSpecification;
    }


    /**
     * Sets the consolidationDocumentSpecification value for this ConfirmConsolidationRequest.
     * 
     * @param consolidationDocumentSpecification   * Contains data used to create additional (non-label) consolidation
     * documents.
     */
    public void setConsolidationDocumentSpecification(com.fedex.openship.stub.ConsolidationDocumentSpecification consolidationDocumentSpecification) {
        this.consolidationDocumentSpecification = consolidationDocumentSpecification;
    }


    /**
     * Gets the rateRequestTypes value for this ConfirmConsolidationRequest.
     * 
     * @return rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public RateRequestType[] getRateRequestTypes() {
        return rateRequestTypes;
    }


    /**
     * Sets the rateRequestTypes value for this ConfirmConsolidationRequest.
     * 
     * @param rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public void setRateRequestTypes(RateRequestType[] rateRequestTypes) {
        this.rateRequestTypes = rateRequestTypes;
    }

    public RateRequestType getRateRequestTypes(int i) {
        return this.rateRequestTypes[i];
    }

    public void setRateRequestTypes(int i, RateRequestType _value) {
        this.rateRequestTypes[i] = _value;
    }


    /**
     * Gets the edtRequestType value for this ConfirmConsolidationRequest.
     * 
     * @return edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public EdtRequestType getEdtRequestType() {
        return edtRequestType;
    }


    /**
     * Sets the edtRequestType value for this ConfirmConsolidationRequest.
     * 
     * @param edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public void setEdtRequestType(EdtRequestType edtRequestType) {
        this.edtRequestType = edtRequestType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConfirmConsolidationRequest)) return false;
        ConfirmConsolidationRequest other = (ConfirmConsolidationRequest) obj;
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
            ((this.consolidationKey==null && other.getConsolidationKey()==null) || 
             (this.consolidationKey!=null &&
              this.consolidationKey.equals(other.getConsolidationKey()))) &&
            ((this.labelSpecification==null && other.getLabelSpecification()==null) || 
             (this.labelSpecification!=null &&
              this.labelSpecification.equals(other.getLabelSpecification()))) &&
            ((this.shippingDocumentSpecification==null && other.getShippingDocumentSpecification()==null) || 
             (this.shippingDocumentSpecification!=null &&
              this.shippingDocumentSpecification.equals(other.getShippingDocumentSpecification()))) &&
            ((this.consolidationDocumentSpecification==null && other.getConsolidationDocumentSpecification()==null) || 
             (this.consolidationDocumentSpecification!=null &&
              this.consolidationDocumentSpecification.equals(other.getConsolidationDocumentSpecification()))) &&
            ((this.rateRequestTypes==null && other.getRateRequestTypes()==null) || 
             (this.rateRequestTypes!=null &&
              java.util.Arrays.equals(this.rateRequestTypes, other.getRateRequestTypes()))) &&
            ((this.edtRequestType==null && other.getEdtRequestType()==null) || 
             (this.edtRequestType!=null &&
              this.edtRequestType.equals(other.getEdtRequestType())));
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
        if (getConsolidationKey() != null) {
            _hashCode += getConsolidationKey().hashCode();
        }
        if (getLabelSpecification() != null) {
            _hashCode += getLabelSpecification().hashCode();
        }
        if (getShippingDocumentSpecification() != null) {
            _hashCode += getShippingDocumentSpecification().hashCode();
        }
        if (getConsolidationDocumentSpecification() != null) {
            _hashCode += getConsolidationDocumentSpecification().hashCode();
        }
        if (getRateRequestTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRateRequestTypes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRateRequestTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEdtRequestType() != null) {
            _hashCode += getEdtRequestType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmConsolidationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConfirmConsolidationRequest"));
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
        elemField.setFieldName("consolidationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDocumentSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidationDocumentSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDocumentSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationDocumentSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateRequestTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateRequestTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edtRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "EdtRequestType"));
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
