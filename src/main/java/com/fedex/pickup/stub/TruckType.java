/**
 * TruckType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class TruckType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TruckType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _DROP_TRAILER_AGREEMENT = "DROP_TRAILER_AGREEMENT";
    public static final String _LIFTGATE = "LIFTGATE";
    public static final String _TRACTOR_TRAILER_ACCESS = "TRACTOR_TRAILER_ACCESS";
    public static final TruckType DROP_TRAILER_AGREEMENT = new TruckType(_DROP_TRAILER_AGREEMENT);
    public static final TruckType LIFTGATE = new TruckType(_LIFTGATE);
    public static final TruckType TRACTOR_TRAILER_ACCESS = new TruckType(_TRACTOR_TRAILER_ACCESS);
    public String getValue() { return _value_;}
    public static TruckType fromValue(String value)
          throws IllegalArgumentException {
        TruckType enumeration = (TruckType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TruckType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(TruckType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "TruckType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
