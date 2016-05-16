/**
 * PickupEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class PickupEventType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PickupEventType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _ASSIGNED_TO_DRIVER = "ASSIGNED_TO_DRIVER";
    public static final String _CANCELED = "CANCELED";
    public static final String _EXCEPTION = "EXCEPTION";
    public static final String _PICKED_UP = "PICKED_UP";
    public static final String _SCHEDULED = "SCHEDULED";
    public static final PickupEventType ASSIGNED_TO_DRIVER = new PickupEventType(_ASSIGNED_TO_DRIVER);
    public static final PickupEventType CANCELED = new PickupEventType(_CANCELED);
    public static final PickupEventType EXCEPTION = new PickupEventType(_EXCEPTION);
    public static final PickupEventType PICKED_UP = new PickupEventType(_PICKED_UP);
    public static final PickupEventType SCHEDULED = new PickupEventType(_SCHEDULED);
    public String getValue() { return _value_;}
    public static PickupEventType fromValue(String value)
          throws IllegalArgumentException {
        PickupEventType enumeration = (PickupEventType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static PickupEventType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(PickupEventType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupEventType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
