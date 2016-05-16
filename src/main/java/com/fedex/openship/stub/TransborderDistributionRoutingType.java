/**
 * TransborderDistributionRoutingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class TransborderDistributionRoutingType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransborderDistributionRoutingType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BY_METER = "BY_METER";
    public static final String _BY_ORIGIN = "BY_ORIGIN";
    public static final String _CUSTOMER_SPECIFIED = "CUSTOMER_SPECIFIED";
    public static final TransborderDistributionRoutingType BY_METER = new TransborderDistributionRoutingType(_BY_METER);
    public static final TransborderDistributionRoutingType BY_ORIGIN = new TransborderDistributionRoutingType(_BY_ORIGIN);
    public static final TransborderDistributionRoutingType CUSTOMER_SPECIFIED = new TransborderDistributionRoutingType(_CUSTOMER_SPECIFIED);
    public String getValue() { return _value_;}
    public static TransborderDistributionRoutingType fromValue(String value)
          throws IllegalArgumentException {
        TransborderDistributionRoutingType enumeration = (TransborderDistributionRoutingType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TransborderDistributionRoutingType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(TransborderDistributionRoutingType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TransborderDistributionRoutingType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
