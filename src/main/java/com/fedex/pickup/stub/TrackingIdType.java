/**
 * TrackingIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class TrackingIdType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrackingIdType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _EXPRESS = "EXPRESS";
    public static final String _FEDEX = "FEDEX";
    public static final String _FREIGHT = "FREIGHT";
    public static final String _GROUND = "GROUND";
    public static final String _USPS = "USPS";
    public static final TrackingIdType EXPRESS = new TrackingIdType(_EXPRESS);
    public static final TrackingIdType FEDEX = new TrackingIdType(_FEDEX);
    public static final TrackingIdType FREIGHT = new TrackingIdType(_FREIGHT);
    public static final TrackingIdType GROUND = new TrackingIdType(_GROUND);
    public static final TrackingIdType USPS = new TrackingIdType(_USPS);
    public String getValue() { return _value_;}
    public static TrackingIdType fromValue(String value)
          throws IllegalArgumentException {
        TrackingIdType enumeration = (TrackingIdType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TrackingIdType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(TrackingIdType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TrackingIdType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
