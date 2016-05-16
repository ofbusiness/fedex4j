/**
 * BuildingPartCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class BuildingPartCode implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BuildingPartCode(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _APARTMENT = "APARTMENT";
    public static final String _BUILDING = "BUILDING";
    public static final String _DEPARTMENT = "DEPARTMENT";
    public static final String _FLOOR = "FLOOR";
    public static final String _ROOM = "ROOM";
    public static final String _SUITE = "SUITE";
    public static final BuildingPartCode APARTMENT = new BuildingPartCode(_APARTMENT);
    public static final BuildingPartCode BUILDING = new BuildingPartCode(_BUILDING);
    public static final BuildingPartCode DEPARTMENT = new BuildingPartCode(_DEPARTMENT);
    public static final BuildingPartCode FLOOR = new BuildingPartCode(_FLOOR);
    public static final BuildingPartCode ROOM = new BuildingPartCode(_ROOM);
    public static final BuildingPartCode SUITE = new BuildingPartCode(_SUITE);
    public String getValue() { return _value_;}
    public static BuildingPartCode fromValue(String value)
          throws IllegalArgumentException {
        BuildingPartCode enumeration = (BuildingPartCode)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static BuildingPartCode fromString(String value)
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
        new org.apache.axis.description.TypeDesc(BuildingPartCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "BuildingPartCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
