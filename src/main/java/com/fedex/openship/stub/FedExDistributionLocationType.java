/**
 * FedExDistributionLocationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class FedExDistributionLocationType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FedExDistributionLocationType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _CUSTOMER_SPECIFIED = "CUSTOMER_SPECIFIED";
    public static final String _FEDEX_EXPRESS_FREIGHT_RAMP = "FEDEX_EXPRESS_FREIGHT_RAMP";
    public static final String _FEDEX_EXPRESS_STATION = "FEDEX_EXPRESS_STATION";
    public static final String _FEDEX_GROUND_TERMINAL = "FEDEX_GROUND_TERMINAL";
    public static final FedExDistributionLocationType CUSTOMER_SPECIFIED = new FedExDistributionLocationType(_CUSTOMER_SPECIFIED);
    public static final FedExDistributionLocationType FEDEX_EXPRESS_FREIGHT_RAMP = new FedExDistributionLocationType(_FEDEX_EXPRESS_FREIGHT_RAMP);
    public static final FedExDistributionLocationType FEDEX_EXPRESS_STATION = new FedExDistributionLocationType(_FEDEX_EXPRESS_STATION);
    public static final FedExDistributionLocationType FEDEX_GROUND_TERMINAL = new FedExDistributionLocationType(_FEDEX_GROUND_TERMINAL);
    public String getValue() { return _value_;}
    public static FedExDistributionLocationType fromValue(String value)
          throws IllegalArgumentException {
        FedExDistributionLocationType enumeration = (FedExDistributionLocationType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static FedExDistributionLocationType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(FedExDistributionLocationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "FedExDistributionLocationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
