/**
 * MinimumChargeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class MinimumChargeType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MinimumChargeType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CUSTOMER = "CUSTOMER";
    public static final String _CUSTOMER_FREIGHT_WEIGHT = "CUSTOMER_FREIGHT_WEIGHT";
    public static final String _EARNED_DISCOUNT = "EARNED_DISCOUNT";
    public static final String _MIXED = "MIXED";
    public static final String _RATE_SCALE = "RATE_SCALE";
    public static final MinimumChargeType CUSTOMER = new MinimumChargeType(_CUSTOMER);
    public static final MinimumChargeType CUSTOMER_FREIGHT_WEIGHT = new MinimumChargeType(_CUSTOMER_FREIGHT_WEIGHT);
    public static final MinimumChargeType EARNED_DISCOUNT = new MinimumChargeType(_EARNED_DISCOUNT);
    public static final MinimumChargeType MIXED = new MinimumChargeType(_MIXED);
    public static final MinimumChargeType RATE_SCALE = new MinimumChargeType(_RATE_SCALE);
    public String getValue() { return _value_;}
    public static MinimumChargeType fromValue(String value)
          throws IllegalArgumentException {
        MinimumChargeType enumeration = (MinimumChargeType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static MinimumChargeType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(MinimumChargeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "MinimumChargeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
