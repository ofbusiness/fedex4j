/**
 * BinaryBarcode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Each instance of this data type represents a barcode whose content
 * must be represented as binary data (i.e. not ASCII text).
 */
public class BinaryBarcode  implements java.io.Serializable {
    /* The kind of barcode data in this instance. */
    private com.fedex.openship.stub.BinaryBarcodeType type;

    /* The data content of this instance. */
    private byte[] value;

    public BinaryBarcode() {
    }

    public BinaryBarcode(
           com.fedex.openship.stub.BinaryBarcodeType type,
           byte[] value) {
           this.type = type;
           this.value = value;
    }


    /**
     * Gets the type value for this BinaryBarcode.
     * 
     * @return type   * The kind of barcode data in this instance.
     */
    public com.fedex.openship.stub.BinaryBarcodeType getType() {
        return type;
    }


    /**
     * Sets the type value for this BinaryBarcode.
     * 
     * @param type   * The kind of barcode data in this instance.
     */
    public void setType(com.fedex.openship.stub.BinaryBarcodeType type) {
        this.type = type;
    }


    /**
     * Gets the value value for this BinaryBarcode.
     * 
     * @return value   * The data content of this instance.
     */
    public byte[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this BinaryBarcode.
     * 
     * @param value   * The data content of this instance.
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BinaryBarcode)) return false;
        BinaryBarcode other = (BinaryBarcode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getValue(), i);
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
        new org.apache.axis.description.TypeDesc(BinaryBarcode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BinaryBarcode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BinaryBarcodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "Value"));
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
