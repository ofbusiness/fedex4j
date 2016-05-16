/**
 * DropoffType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class DropoffType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DropoffType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BUSINESS_SERVICE_CENTER = "BUSINESS_SERVICE_CENTER";
    public static final String _DROP_BOX = "DROP_BOX";
    public static final String _REGULAR_PICKUP = "REGULAR_PICKUP";
    public static final String _REQUEST_COURIER = "REQUEST_COURIER";
    public static final String _STATION = "STATION";
    public static final DropoffType BUSINESS_SERVICE_CENTER = new DropoffType(_BUSINESS_SERVICE_CENTER);
    public static final DropoffType DROP_BOX = new DropoffType(_DROP_BOX);
    public static final DropoffType REGULAR_PICKUP = new DropoffType(_REGULAR_PICKUP);
    public static final DropoffType REQUEST_COURIER = new DropoffType(_REQUEST_COURIER);
    public static final DropoffType STATION = new DropoffType(_STATION);
    public String getValue() { return _value_;}
    public static DropoffType fromValue(String value)
          throws IllegalArgumentException {
        DropoffType enumeration = (DropoffType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static DropoffType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(DropoffType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "DropoffType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
