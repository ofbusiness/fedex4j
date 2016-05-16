/**
 * CompletedEtdDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class CompletedEtdDetail  implements java.io.Serializable {
    /* The identifier for all clearance documents associated with
     * this shipment. */
    private String folderId;

    private com.fedex.openship.stub.UploadDocumentReferenceDetail[] uploadDocumentReferenceDetails;

    public CompletedEtdDetail() {
    }

    public CompletedEtdDetail(
           String folderId,
           com.fedex.openship.stub.UploadDocumentReferenceDetail[] uploadDocumentReferenceDetails) {
           this.folderId = folderId;
           this.uploadDocumentReferenceDetails = uploadDocumentReferenceDetails;
    }


    /**
     * Gets the folderId value for this CompletedEtdDetail.
     * 
     * @return folderId   * The identifier for all clearance documents associated with
     * this shipment.
     */
    public String getFolderId() {
        return folderId;
    }


    /**
     * Sets the folderId value for this CompletedEtdDetail.
     * 
     * @param folderId   * The identifier for all clearance documents associated with
     * this shipment.
     */
    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }


    /**
     * Gets the uploadDocumentReferenceDetails value for this CompletedEtdDetail.
     * 
     * @return uploadDocumentReferenceDetails
     */
    public com.fedex.openship.stub.UploadDocumentReferenceDetail[] getUploadDocumentReferenceDetails() {
        return uploadDocumentReferenceDetails;
    }


    /**
     * Sets the uploadDocumentReferenceDetails value for this CompletedEtdDetail.
     * 
     * @param uploadDocumentReferenceDetails
     */
    public void setUploadDocumentReferenceDetails(com.fedex.openship.stub.UploadDocumentReferenceDetail[] uploadDocumentReferenceDetails) {
        this.uploadDocumentReferenceDetails = uploadDocumentReferenceDetails;
    }

    public com.fedex.openship.stub.UploadDocumentReferenceDetail getUploadDocumentReferenceDetails(int i) {
        return this.uploadDocumentReferenceDetails[i];
    }

    public void setUploadDocumentReferenceDetails(int i, com.fedex.openship.stub.UploadDocumentReferenceDetail _value) {
        this.uploadDocumentReferenceDetails[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CompletedEtdDetail)) return false;
        CompletedEtdDetail other = (CompletedEtdDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.folderId==null && other.getFolderId()==null) || 
             (this.folderId!=null &&
              this.folderId.equals(other.getFolderId()))) &&
            ((this.uploadDocumentReferenceDetails==null && other.getUploadDocumentReferenceDetails()==null) || 
             (this.uploadDocumentReferenceDetails!=null &&
              java.util.Arrays.equals(this.uploadDocumentReferenceDetails, other.getUploadDocumentReferenceDetails())));
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
        if (getFolderId() != null) {
            _hashCode += getFolderId().hashCode();
        }
        if (getUploadDocumentReferenceDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUploadDocumentReferenceDetails());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getUploadDocumentReferenceDetails(), i);
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
        new org.apache.axis.description.TypeDesc(CompletedEtdDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CompletedEtdDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FolderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadDocumentReferenceDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "UploadDocumentReferenceDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "UploadDocumentReferenceDetail"));
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
