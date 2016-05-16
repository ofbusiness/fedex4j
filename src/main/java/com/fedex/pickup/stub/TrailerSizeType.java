/**
 * TrailerSizeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class TrailerSizeType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrailerSizeType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _TRAILER_28_FT = "TRAILER_28_FT";
    public static final String _TRAILER_48_FT = "TRAILER_48_FT";
    public static final String _TRAILER_53_FT = "TRAILER_53_FT";
    public static final TrailerSizeType TRAILER_28_FT = new TrailerSizeType(_TRAILER_28_FT);
    public static final TrailerSizeType TRAILER_48_FT = new TrailerSizeType(_TRAILER_48_FT);
    public static final TrailerSizeType TRAILER_53_FT = new TrailerSizeType(_TRAILER_53_FT);
    public String getValue() { return _value_;}
    public static TrailerSizeType fromValue(String value)
          throws IllegalArgumentException {
        TrailerSizeType enumeration = (TrailerSizeType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TrailerSizeType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(TrailerSizeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TrailerSizeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
