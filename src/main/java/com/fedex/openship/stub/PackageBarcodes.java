/**
 * PackageBarcodes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;


/**
 * Each instance of this data type represents the set of barcodes
 * (of all types) which are associated with a specific package.
 */
public class PackageBarcodes  implements java.io.Serializable {
    /* Binary-style barcodes for this package. */
    private BinaryBarcode[] binaryBarcodes;

    /* String-style barcodes for this package. */
    private StringBarcode[] stringBarcodes;

    public PackageBarcodes() {
    }

    public PackageBarcodes(
           BinaryBarcode[] binaryBarcodes,
           StringBarcode[] stringBarcodes) {
           this.binaryBarcodes = binaryBarcodes;
           this.stringBarcodes = stringBarcodes;
    }


    /**
     * Gets the binaryBarcodes value for this PackageBarcodes.
     * 
     * @return binaryBarcodes   * Binary-style barcodes for this package.
     */
    public BinaryBarcode[] getBinaryBarcodes() {
        return binaryBarcodes;
    }


    /**
     * Sets the binaryBarcodes value for this PackageBarcodes.
     * 
     * @param binaryBarcodes   * Binary-style barcodes for this package.
     */
    public void setBinaryBarcodes(BinaryBarcode[] binaryBarcodes) {
        this.binaryBarcodes = binaryBarcodes;
    }

    public BinaryBarcode getBinaryBarcodes(int i) {
        return this.binaryBarcodes[i];
    }

    public void setBinaryBarcodes(int i, BinaryBarcode _value) {
        this.binaryBarcodes[i] = _value;
    }


    /**
     * Gets the stringBarcodes value for this PackageBarcodes.
     * 
     * @return stringBarcodes   * String-style barcodes for this package.
     */
    public StringBarcode[] getStringBarcodes() {
        return stringBarcodes;
    }


    /**
     * Sets the stringBarcodes value for this PackageBarcodes.
     * 
     * @param stringBarcodes   * String-style barcodes for this package.
     */
    public void setStringBarcodes(StringBarcode[] stringBarcodes) {
        this.stringBarcodes = stringBarcodes;
    }

    public StringBarcode getStringBarcodes(int i) {
        return this.stringBarcodes[i];
    }

    public void setStringBarcodes(int i, StringBarcode _value) {
        this.stringBarcodes[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PackageBarcodes)) return false;
        PackageBarcodes other = (PackageBarcodes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.binaryBarcodes==null && other.getBinaryBarcodes()==null) || 
             (this.binaryBarcodes!=null &&
              java.util.Arrays.equals(this.binaryBarcodes, other.getBinaryBarcodes()))) &&
            ((this.stringBarcodes==null && other.getStringBarcodes()==null) || 
             (this.stringBarcodes!=null &&
              java.util.Arrays.equals(this.stringBarcodes, other.getStringBarcodes())));
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
        if (getBinaryBarcodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinaryBarcodes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBinaryBarcodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStringBarcodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStringBarcodes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStringBarcodes(), i);
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
        new org.apache.axis.description.TypeDesc(PackageBarcodes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "PackageBarcodes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binaryBarcodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BinaryBarcodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BinaryBarcode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringBarcodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "StringBarcodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "StringBarcode"));
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
