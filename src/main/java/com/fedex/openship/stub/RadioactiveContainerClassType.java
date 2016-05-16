/**
 * RadioactiveContainerClassType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class RadioactiveContainerClassType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RadioactiveContainerClassType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _EXCEPTED_PACKAGE = "EXCEPTED_PACKAGE";
    public static final String _INDUSTRIAL_IP1 = "INDUSTRIAL_IP1";
    public static final String _INDUSTRIAL_IP2 = "INDUSTRIAL_IP2";
    public static final String _INDUSTRIAL_IP3 = "INDUSTRIAL_IP3";
    public static final String _TYPE_A = "TYPE_A";
    public static final String _TYPE_B_M = "TYPE_B_M";
    public static final String _TYPE_B_U = "TYPE_B_U";
    public static final String _TYPE_C = "TYPE_C";
    public static final RadioactiveContainerClassType EXCEPTED_PACKAGE = new RadioactiveContainerClassType(_EXCEPTED_PACKAGE);
    public static final RadioactiveContainerClassType INDUSTRIAL_IP1 = new RadioactiveContainerClassType(_INDUSTRIAL_IP1);
    public static final RadioactiveContainerClassType INDUSTRIAL_IP2 = new RadioactiveContainerClassType(_INDUSTRIAL_IP2);
    public static final RadioactiveContainerClassType INDUSTRIAL_IP3 = new RadioactiveContainerClassType(_INDUSTRIAL_IP3);
    public static final RadioactiveContainerClassType TYPE_A = new RadioactiveContainerClassType(_TYPE_A);
    public static final RadioactiveContainerClassType TYPE_B_M = new RadioactiveContainerClassType(_TYPE_B_M);
    public static final RadioactiveContainerClassType TYPE_B_U = new RadioactiveContainerClassType(_TYPE_B_U);
    public static final RadioactiveContainerClassType TYPE_C = new RadioactiveContainerClassType(_TYPE_C);
    public String getValue() { return _value_;}
    public static RadioactiveContainerClassType fromValue(String value)
          throws IllegalArgumentException {
        RadioactiveContainerClassType enumeration = (RadioactiveContainerClassType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static RadioactiveContainerClassType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(RadioactiveContainerClassType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RadioactiveContainerClassType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
