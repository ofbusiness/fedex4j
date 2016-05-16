/**
 * PickupBuildingLocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class PickupBuildingLocationType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PickupBuildingLocationType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _FRONT = "FRONT";
    public static final String _NONE = "NONE";
    public static final String _REAR = "REAR";
    public static final String _SIDE = "SIDE";
    public static final PickupBuildingLocationType FRONT = new PickupBuildingLocationType(_FRONT);
    public static final PickupBuildingLocationType NONE = new PickupBuildingLocationType(_NONE);
    public static final PickupBuildingLocationType REAR = new PickupBuildingLocationType(_REAR);
    public static final PickupBuildingLocationType SIDE = new PickupBuildingLocationType(_SIDE);
    public String getValue() { return _value_;}
    public static PickupBuildingLocationType fromValue(String value)
          throws IllegalArgumentException {
        PickupBuildingLocationType enumeration = (PickupBuildingLocationType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static PickupBuildingLocationType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(PickupBuildingLocationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "PickupBuildingLocationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
