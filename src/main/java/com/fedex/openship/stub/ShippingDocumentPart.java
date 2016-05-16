/**
 * ShippingDocumentPart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * A single part of a shipping document, such as one page of a multiple-page
 * document whose format requires a separate image per page.
 */
public class ShippingDocumentPart  implements java.io.Serializable {
    /* The one-origin position of this part within a document. */
    private org.apache.axis.types.PositiveInteger documentPartSequenceNumber;

    /* Graphic or printer commands for this image within a document. */
    private byte[] image;

    public ShippingDocumentPart() {
    }

    public ShippingDocumentPart(
           org.apache.axis.types.PositiveInteger documentPartSequenceNumber,
           byte[] image) {
           this.documentPartSequenceNumber = documentPartSequenceNumber;
           this.image = image;
    }


    /**
     * Gets the documentPartSequenceNumber value for this ShippingDocumentPart.
     * 
     * @return documentPartSequenceNumber   * The one-origin position of this part within a document.
     */
    public org.apache.axis.types.PositiveInteger getDocumentPartSequenceNumber() {
        return documentPartSequenceNumber;
    }


    /**
     * Sets the documentPartSequenceNumber value for this ShippingDocumentPart.
     * 
     * @param documentPartSequenceNumber   * The one-origin position of this part within a document.
     */
    public void setDocumentPartSequenceNumber(org.apache.axis.types.PositiveInteger documentPartSequenceNumber) {
        this.documentPartSequenceNumber = documentPartSequenceNumber;
    }


    /**
     * Gets the image value for this ShippingDocumentPart.
     * 
     * @return image   * Graphic or printer commands for this image within a document.
     */
    public byte[] getImage() {
        return image;
    }


    /**
     * Sets the image value for this ShippingDocumentPart.
     * 
     * @param image   * Graphic or printer commands for this image within a document.
     */
    public void setImage(byte[] image) {
        this.image = image;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ShippingDocumentPart)) return false;
        ShippingDocumentPart other = (ShippingDocumentPart) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentPartSequenceNumber==null && other.getDocumentPartSequenceNumber()==null) || 
             (this.documentPartSequenceNumber!=null &&
              this.documentPartSequenceNumber.equals(other.getDocumentPartSequenceNumber()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage())));
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
        if (getDocumentPartSequenceNumber() != null) {
            _hashCode += getDocumentPartSequenceNumber().hashCode();
        }
        if (getImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImage());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getImage(), i);
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
        new org.apache.axis.description.TypeDesc(ShippingDocumentPart.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ShippingDocumentPart"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentPartSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocumentPartSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
