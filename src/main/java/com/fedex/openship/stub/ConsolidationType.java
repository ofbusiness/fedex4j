/**
 * ConsolidationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ConsolidationType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ConsolidationType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _INTERNATIONAL_DISTRIBUTION_FREIGHT = "INTERNATIONAL_DISTRIBUTION_FREIGHT";
    public static final String _INTERNATIONAL_ECONOMY_DISTRIBUTION = "INTERNATIONAL_ECONOMY_DISTRIBUTION";
    public static final String _INTERNATIONAL_GROUND_DIRECT_DISTRIBUTION = "INTERNATIONAL_GROUND_DIRECT_DISTRIBUTION";
    public static final String _INTERNATIONAL_GROUND_DISTRIBUTION = "INTERNATIONAL_GROUND_DISTRIBUTION";
    public static final String _INTERNATIONAL_PRIORITY_DISTRIBUTION = "INTERNATIONAL_PRIORITY_DISTRIBUTION";
    public static final String _TRANSBORDER_DISTRIBUTION = "TRANSBORDER_DISTRIBUTION";
    public static final ConsolidationType INTERNATIONAL_DISTRIBUTION_FREIGHT = new ConsolidationType(_INTERNATIONAL_DISTRIBUTION_FREIGHT);
    public static final ConsolidationType INTERNATIONAL_ECONOMY_DISTRIBUTION = new ConsolidationType(_INTERNATIONAL_ECONOMY_DISTRIBUTION);
    public static final ConsolidationType INTERNATIONAL_GROUND_DIRECT_DISTRIBUTION = new ConsolidationType(_INTERNATIONAL_GROUND_DIRECT_DISTRIBUTION);
    public static final ConsolidationType INTERNATIONAL_GROUND_DISTRIBUTION = new ConsolidationType(_INTERNATIONAL_GROUND_DISTRIBUTION);
    public static final ConsolidationType INTERNATIONAL_PRIORITY_DISTRIBUTION = new ConsolidationType(_INTERNATIONAL_PRIORITY_DISTRIBUTION);
    public static final ConsolidationType TRANSBORDER_DISTRIBUTION = new ConsolidationType(_TRANSBORDER_DISTRIBUTION);
    public String getValue() { return _value_;}
    public static ConsolidationType fromValue(String value)
          throws IllegalArgumentException {
        ConsolidationType enumeration = (ConsolidationType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ConsolidationType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ConsolidationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ConsolidationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
