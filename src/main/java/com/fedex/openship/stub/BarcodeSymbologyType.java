/**
 * BarcodeSymbologyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class BarcodeSymbologyType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BarcodeSymbologyType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CODABAR = "CODABAR";
    public static final String _CODE128 = "CODE128";
    public static final String _CODE128B = "CODE128B";
    public static final String _CODE128C = "CODE128C";
    public static final String _CODE128_WIDEBAR = "CODE128_WIDEBAR";
    public static final String _CODE39 = "CODE39";
    public static final String _CODE93 = "CODE93";
    public static final String _I2OF5 = "I2OF5";
    public static final String _PDF417 = "PDF417";
    public static final String _POSTNET = "POSTNET";
    public static final String _QR_CODE = "QR_CODE";
    public static final String _UCC128 = "UCC128";
    public static final BarcodeSymbologyType CODABAR = new BarcodeSymbologyType(_CODABAR);
    public static final BarcodeSymbologyType CODE128 = new BarcodeSymbologyType(_CODE128);
    public static final BarcodeSymbologyType CODE128B = new BarcodeSymbologyType(_CODE128B);
    public static final BarcodeSymbologyType CODE128C = new BarcodeSymbologyType(_CODE128C);
    public static final BarcodeSymbologyType CODE128_WIDEBAR = new BarcodeSymbologyType(_CODE128_WIDEBAR);
    public static final BarcodeSymbologyType CODE39 = new BarcodeSymbologyType(_CODE39);
    public static final BarcodeSymbologyType CODE93 = new BarcodeSymbologyType(_CODE93);
    public static final BarcodeSymbologyType I2OF5 = new BarcodeSymbologyType(_I2OF5);
    public static final BarcodeSymbologyType PDF417 = new BarcodeSymbologyType(_PDF417);
    public static final BarcodeSymbologyType POSTNET = new BarcodeSymbologyType(_POSTNET);
    public static final BarcodeSymbologyType QR_CODE = new BarcodeSymbologyType(_QR_CODE);
    public static final BarcodeSymbologyType UCC128 = new BarcodeSymbologyType(_UCC128);
    public String getValue() { return _value_;}
    public static BarcodeSymbologyType fromValue(String value)
          throws IllegalArgumentException {
        BarcodeSymbologyType enumeration = (BarcodeSymbologyType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static BarcodeSymbologyType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(BarcodeSymbologyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "BarcodeSymbologyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
