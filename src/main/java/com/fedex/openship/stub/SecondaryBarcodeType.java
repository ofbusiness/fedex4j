/**
 * SecondaryBarcodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class SecondaryBarcodeType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SecondaryBarcodeType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _COMMON_2D = "COMMON_2D";
    public static final String _NONE = "NONE";
    public static final String _SSCC_18 = "SSCC_18";
    public static final String _USPS = "USPS";
    public static final SecondaryBarcodeType COMMON_2D = new SecondaryBarcodeType(_COMMON_2D);
    public static final SecondaryBarcodeType NONE = new SecondaryBarcodeType(_NONE);
    public static final SecondaryBarcodeType SSCC_18 = new SecondaryBarcodeType(_SSCC_18);
    public static final SecondaryBarcodeType USPS = new SecondaryBarcodeType(_USPS);
    public String getValue() { return _value_;}
    public static SecondaryBarcodeType fromValue(String value)
          throws IllegalArgumentException {
        SecondaryBarcodeType enumeration = (SecondaryBarcodeType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static SecondaryBarcodeType fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecondaryBarcodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SecondaryBarcodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
