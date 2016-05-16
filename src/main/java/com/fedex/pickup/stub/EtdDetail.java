/**
 * EtdDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;


/**
 * Electronic Trade document references used with the ETD special
 * service.
 */
public class EtdDetail  implements java.io.Serializable {
    /* Specifies client's intent for whether all documents must be
     * confirmed before shipment processing. */
    private com.fedex.pickup.stub.EtdConfirmationType confirmation;

    /* Indicates the types of shipping documents produced for the
     * shipper by FedEx (see ShippingDocumentSpecification) which should
     * be copied back to the shipper in the shipment result data. */
    private com.fedex.pickup.stub.RequestedShippingDocumentType[] requestedDocumentCopies;

    private com.fedex.pickup.stub.UploadDocumentDetail[] documents;

    private com.fedex.pickup.stub.UploadDocumentReferenceDetail[] documentReferences;

    public EtdDetail() {
    }

    public EtdDetail(
           com.fedex.pickup.stub.EtdConfirmationType confirmation,
           com.fedex.pickup.stub.RequestedShippingDocumentType[] requestedDocumentCopies,
           com.fedex.pickup.stub.UploadDocumentDetail[] documents,
           com.fedex.pickup.stub.UploadDocumentReferenceDetail[] documentReferences) {
           this.confirmation = confirmation;
           this.requestedDocumentCopies = requestedDocumentCopies;
           this.documents = documents;
           this.documentReferences = documentReferences;
    }


    /**
     * Gets the confirmation value for this EtdDetail.
     * 
     * @return confirmation   * Specifies client's intent for whether all documents must be
     * confirmed before shipment processing.
     */
    public com.fedex.pickup.stub.EtdConfirmationType getConfirmation() {
        return confirmation;
    }


    /**
     * Sets the confirmation value for this EtdDetail.
     * 
     * @param confirmation   * Specifies client's intent for whether all documents must be
     * confirmed before shipment processing.
     */
    public void setConfirmation(com.fedex.pickup.stub.EtdConfirmationType confirmation) {
        this.confirmation = confirmation;
    }


    /**
     * Gets the requestedDocumentCopies value for this EtdDetail.
     * 
     * @return requestedDocumentCopies   * Indicates the types of shipping documents produced for the
     * shipper by FedEx (see ShippingDocumentSpecification) which should
     * be copied back to the shipper in the shipment result data.
     */
    public com.fedex.pickup.stub.RequestedShippingDocumentType[] getRequestedDocumentCopies() {
        return requestedDocumentCopies;
    }


    /**
     * Sets the requestedDocumentCopies value for this EtdDetail.
     * 
     * @param requestedDocumentCopies   * Indicates the types of shipping documents produced for the
     * shipper by FedEx (see ShippingDocumentSpecification) which should
     * be copied back to the shipper in the shipment result data.
     */
    public void setRequestedDocumentCopies(com.fedex.pickup.stub.RequestedShippingDocumentType[] requestedDocumentCopies) {
        this.requestedDocumentCopies = requestedDocumentCopies;
    }

    public com.fedex.pickup.stub.RequestedShippingDocumentType getRequestedDocumentCopies(int i) {
        return this.requestedDocumentCopies[i];
    }

    public void setRequestedDocumentCopies(int i, com.fedex.pickup.stub.RequestedShippingDocumentType _value) {
        this.requestedDocumentCopies[i] = _value;
    }


    /**
     * Gets the documents value for this EtdDetail.
     * 
     * @return documents
     */
    public com.fedex.pickup.stub.UploadDocumentDetail[] getDocuments() {
        return documents;
    }


    /**
     * Sets the documents value for this EtdDetail.
     * 
     * @param documents
     */
    public void setDocuments(com.fedex.pickup.stub.UploadDocumentDetail[] documents) {
        this.documents = documents;
    }

    public com.fedex.pickup.stub.UploadDocumentDetail getDocuments(int i) {
        return this.documents[i];
    }

    public void setDocuments(int i, com.fedex.pickup.stub.UploadDocumentDetail _value) {
        this.documents[i] = _value;
    }


    /**
     * Gets the documentReferences value for this EtdDetail.
     * 
     * @return documentReferences
     */
    public com.fedex.pickup.stub.UploadDocumentReferenceDetail[] getDocumentReferences() {
        return documentReferences;
    }


    /**
     * Sets the documentReferences value for this EtdDetail.
     * 
     * @param documentReferences
     */
    public void setDocumentReferences(com.fedex.pickup.stub.UploadDocumentReferenceDetail[] documentReferences) {
        this.documentReferences = documentReferences;
    }

    public com.fedex.pickup.stub.UploadDocumentReferenceDetail getDocumentReferences(int i) {
        return this.documentReferences[i];
    }

    public void setDocumentReferences(int i, com.fedex.pickup.stub.UploadDocumentReferenceDetail _value) {
        this.documentReferences[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EtdDetail)) return false;
        EtdDetail other = (EtdDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.confirmation==null && other.getConfirmation()==null) || 
             (this.confirmation!=null &&
              this.confirmation.equals(other.getConfirmation()))) &&
            ((this.requestedDocumentCopies==null && other.getRequestedDocumentCopies()==null) || 
             (this.requestedDocumentCopies!=null &&
              java.util.Arrays.equals(this.requestedDocumentCopies, other.getRequestedDocumentCopies()))) &&
            ((this.documents==null && other.getDocuments()==null) || 
             (this.documents!=null &&
              java.util.Arrays.equals(this.documents, other.getDocuments()))) &&
            ((this.documentReferences==null && other.getDocumentReferences()==null) || 
             (this.documentReferences!=null &&
              java.util.Arrays.equals(this.documentReferences, other.getDocumentReferences())));
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
        if (getConfirmation() != null) {
            _hashCode += getConfirmation().hashCode();
        }
        if (getRequestedDocumentCopies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestedDocumentCopies());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRequestedDocumentCopies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocuments());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentReferences());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDocumentReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EtdDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "EtdDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Confirmation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "EtdConfirmationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedDocumentCopies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "RequestedDocumentCopies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "RequestedShippingDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "Documents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "UploadDocumentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "DocumentReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "UploadDocumentReferenceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
