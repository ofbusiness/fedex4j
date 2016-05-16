/**
 * UploadDocumentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class UploadDocumentDetail  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger lineNumber;

    private String customerReference;

    private com.fedex.pickup.stub.UploadDocumentProducerType documentProducer;

    private UploadDocumentType documentType;

    private String fileName;

    private byte[] documentContent;

    /* Specifies the date until which the document is available */
    private java.util.Date expirationDate;

    public UploadDocumentDetail() {
    }

    public UploadDocumentDetail(
           org.apache.axis.types.NonNegativeInteger lineNumber,
           String customerReference,
           com.fedex.pickup.stub.UploadDocumentProducerType documentProducer,
           UploadDocumentType documentType,
           String fileName,
           byte[] documentContent,
           java.util.Date expirationDate) {
           this.lineNumber = lineNumber;
           this.customerReference = customerReference;
           this.documentProducer = documentProducer;
           this.documentType = documentType;
           this.fileName = fileName;
           this.documentContent = documentContent;
           this.expirationDate = expirationDate;
    }


    /**
     * Gets the lineNumber value for this UploadDocumentDetail.
     * 
     * @return lineNumber
     */
    public org.apache.axis.types.NonNegativeInteger getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this UploadDocumentDetail.
     * 
     * @param lineNumber
     */
    public void setLineNumber(org.apache.axis.types.NonNegativeInteger lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the customerReference value for this UploadDocumentDetail.
     * 
     * @return customerReference
     */
    public String getCustomerReference() {
        return customerReference;
    }


    /**
     * Sets the customerReference value for this UploadDocumentDetail.
     * 
     * @param customerReference
     */
    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }


    /**
     * Gets the documentProducer value for this UploadDocumentDetail.
     * 
     * @return documentProducer
     */
    public com.fedex.pickup.stub.UploadDocumentProducerType getDocumentProducer() {
        return documentProducer;
    }


    /**
     * Sets the documentProducer value for this UploadDocumentDetail.
     * 
     * @param documentProducer
     */
    public void setDocumentProducer(com.fedex.pickup.stub.UploadDocumentProducerType documentProducer) {
        this.documentProducer = documentProducer;
    }


    /**
     * Gets the documentType value for this UploadDocumentDetail.
     * 
     * @return documentType
     */
    public UploadDocumentType getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this UploadDocumentDetail.
     * 
     * @param documentType
     */
    public void setDocumentType(UploadDocumentType documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the fileName value for this UploadDocumentDetail.
     * 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this UploadDocumentDetail.
     * 
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the documentContent value for this UploadDocumentDetail.
     * 
     * @return documentContent
     */
    public byte[] getDocumentContent() {
        return documentContent;
    }


    /**
     * Sets the documentContent value for this UploadDocumentDetail.
     * 
     * @param documentContent
     */
    public void setDocumentContent(byte[] documentContent) {
        this.documentContent = documentContent;
    }


    /**
     * Gets the expirationDate value for this UploadDocumentDetail.
     * 
     * @return expirationDate   * Specifies the date until which the document is available
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this UploadDocumentDetail.
     * 
     * @param expirationDate   * Specifies the date until which the document is available
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UploadDocumentDetail)) return false;
        UploadDocumentDetail other = (UploadDocumentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lineNumber==null && other.getLineNumber()==null) || 
             (this.lineNumber!=null &&
              this.lineNumber.equals(other.getLineNumber()))) &&
            ((this.customerReference==null && other.getCustomerReference()==null) || 
             (this.customerReference!=null &&
              this.customerReference.equals(other.getCustomerReference()))) &&
            ((this.documentProducer==null && other.getDocumentProducer()==null) || 
             (this.documentProducer!=null &&
              this.documentProducer.equals(other.getDocumentProducer()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.documentContent==null && other.getDocumentContent()==null) || 
             (this.documentContent!=null &&
              java.util.Arrays.equals(this.documentContent, other.getDocumentContent()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate())));
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
        if (getLineNumber() != null) {
            _hashCode += getLineNumber().hashCode();
        }
        if (getCustomerReference() != null) {
            _hashCode += getCustomerReference().hashCode();
        }
        if (getDocumentProducer() != null) {
            _hashCode += getDocumentProducer().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getDocumentContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentContent());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDocumentContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadDocumentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "UploadDocumentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "LineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "CustomerReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentProducer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "DocumentProducer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "UploadDocumentProducerType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "DocumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "UploadDocumentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "DocumentContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
