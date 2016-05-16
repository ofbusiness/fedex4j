/**
 * ReturnedRateType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class ReturnedRateType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReturnedRateType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _INCENTIVE = "INCENTIVE";
    public static final String _PAYOR_ACCOUNT_PACKAGE = "PAYOR_ACCOUNT_PACKAGE";
    public static final String _PAYOR_ACCOUNT_SHIPMENT = "PAYOR_ACCOUNT_SHIPMENT";
    public static final String _PAYOR_LIST_PACKAGE = "PAYOR_LIST_PACKAGE";
    public static final String _PAYOR_LIST_SHIPMENT = "PAYOR_LIST_SHIPMENT";
    public static final String _PREFERRED_ACCOUNT_PACKAGE = "PREFERRED_ACCOUNT_PACKAGE";
    public static final String _PREFERRED_ACCOUNT_SHIPMENT = "PREFERRED_ACCOUNT_SHIPMENT";
    public static final String _PREFERRED_LIST_PACKAGE = "PREFERRED_LIST_PACKAGE";
    public static final String _PREFERRED_LIST_SHIPMENT = "PREFERRED_LIST_SHIPMENT";
    public static final ReturnedRateType INCENTIVE = new ReturnedRateType(_INCENTIVE);
    public static final ReturnedRateType PAYOR_ACCOUNT_PACKAGE = new ReturnedRateType(_PAYOR_ACCOUNT_PACKAGE);
    public static final ReturnedRateType PAYOR_ACCOUNT_SHIPMENT = new ReturnedRateType(_PAYOR_ACCOUNT_SHIPMENT);
    public static final ReturnedRateType PAYOR_LIST_PACKAGE = new ReturnedRateType(_PAYOR_LIST_PACKAGE);
    public static final ReturnedRateType PAYOR_LIST_SHIPMENT = new ReturnedRateType(_PAYOR_LIST_SHIPMENT);
    public static final ReturnedRateType PREFERRED_ACCOUNT_PACKAGE = new ReturnedRateType(_PREFERRED_ACCOUNT_PACKAGE);
    public static final ReturnedRateType PREFERRED_ACCOUNT_SHIPMENT = new ReturnedRateType(_PREFERRED_ACCOUNT_SHIPMENT);
    public static final ReturnedRateType PREFERRED_LIST_PACKAGE = new ReturnedRateType(_PREFERRED_LIST_PACKAGE);
    public static final ReturnedRateType PREFERRED_LIST_SHIPMENT = new ReturnedRateType(_PREFERRED_LIST_SHIPMENT);
    public String getValue() { return _value_;}
    public static ReturnedRateType fromValue(String value)
          throws IllegalArgumentException {
        ReturnedRateType enumeration = (ReturnedRateType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ReturnedRateType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ReturnedRateType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "ReturnedRateType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
