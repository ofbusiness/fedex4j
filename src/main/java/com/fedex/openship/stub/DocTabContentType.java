/**
 * DocTabContentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class DocTabContentType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DocTabContentType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BARCODED = "BARCODED";
    public static final String _CUSTOM = "CUSTOM";
    public static final String _MINIMUM = "MINIMUM";
    public static final String _STANDARD = "STANDARD";
    public static final String _ZONE001 = "ZONE001";
    public static final DocTabContentType BARCODED = new DocTabContentType(_BARCODED);
    public static final DocTabContentType CUSTOM = new DocTabContentType(_CUSTOM);
    public static final DocTabContentType MINIMUM = new DocTabContentType(_MINIMUM);
    public static final DocTabContentType STANDARD = new DocTabContentType(_STANDARD);
    public static final DocTabContentType ZONE001 = new DocTabContentType(_ZONE001);
    public String getValue() { return _value_;}
    public static DocTabContentType fromValue(String value)
          throws IllegalArgumentException {
        DocTabContentType enumeration = (DocTabContentType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static DocTabContentType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(DocTabContentType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DocTabContentType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
