/**
 * RegulatoryControlType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class RegulatoryControlType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RegulatoryControlType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _EU_CIRCULATION = "EU_CIRCULATION";
    public static final String _FOOD_OR_PERISHABLE = "FOOD_OR_PERISHABLE";
    public static final String _NAFTA = "NAFTA";
    public static final String _NOT_APPLICABLE_FOR_LOW_CUSTOMS_VALUE_EXCEPTION = "NOT_APPLICABLE_FOR_LOW_CUSTOMS_VALUE_EXCEPTION";
    public static final RegulatoryControlType EU_CIRCULATION = new RegulatoryControlType(_EU_CIRCULATION);
    public static final RegulatoryControlType FOOD_OR_PERISHABLE = new RegulatoryControlType(_FOOD_OR_PERISHABLE);
    public static final RegulatoryControlType NAFTA = new RegulatoryControlType(_NAFTA);
    public static final RegulatoryControlType NOT_APPLICABLE_FOR_LOW_CUSTOMS_VALUE_EXCEPTION = new RegulatoryControlType(_NOT_APPLICABLE_FOR_LOW_CUSTOMS_VALUE_EXCEPTION);
    public String getValue() { return _value_;}
    public static RegulatoryControlType fromValue(String value)
          throws IllegalArgumentException {
        RegulatoryControlType enumeration = (RegulatoryControlType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static RegulatoryControlType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(RegulatoryControlType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "RegulatoryControlType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
