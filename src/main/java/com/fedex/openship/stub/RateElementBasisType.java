/**
 * RateElementBasisType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class RateElementBasisType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RateElementBasisType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BASE_CHARGE = "BASE_CHARGE";
    public static final String _NET_CHARGE = "NET_CHARGE";
    public static final String _NET_CHARGE_EXCLUDING_TAXES = "NET_CHARGE_EXCLUDING_TAXES";
    public static final String _NET_FREIGHT = "NET_FREIGHT";
    public static final RateElementBasisType BASE_CHARGE = new RateElementBasisType(_BASE_CHARGE);
    public static final RateElementBasisType NET_CHARGE = new RateElementBasisType(_NET_CHARGE);
    public static final RateElementBasisType NET_CHARGE_EXCLUDING_TAXES = new RateElementBasisType(_NET_CHARGE_EXCLUDING_TAXES);
    public static final RateElementBasisType NET_FREIGHT = new RateElementBasisType(_NET_FREIGHT);
    public String getValue() { return _value_;}
    public static RateElementBasisType fromValue(String value)
          throws IllegalArgumentException {
        RateElementBasisType enumeration = (RateElementBasisType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static RateElementBasisType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(RateElementBasisType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RateElementBasisType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
