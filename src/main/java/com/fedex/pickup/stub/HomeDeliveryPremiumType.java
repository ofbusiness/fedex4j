/**
 * HomeDeliveryPremiumType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class HomeDeliveryPremiumType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HomeDeliveryPremiumType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _APPOINTMENT = "APPOINTMENT";
    public static final String _DATE_CERTAIN = "DATE_CERTAIN";
    public static final String _EVENING = "EVENING";
    public static final HomeDeliveryPremiumType APPOINTMENT = new HomeDeliveryPremiumType(_APPOINTMENT);
    public static final HomeDeliveryPremiumType DATE_CERTAIN = new HomeDeliveryPremiumType(_DATE_CERTAIN);
    public static final HomeDeliveryPremiumType EVENING = new HomeDeliveryPremiumType(_EVENING);
    public String getValue() { return _value_;}
    public static HomeDeliveryPremiumType fromValue(String value)
          throws IllegalArgumentException {
        HomeDeliveryPremiumType enumeration = (HomeDeliveryPremiumType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static HomeDeliveryPremiumType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(HomeDeliveryPremiumType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "HomeDeliveryPremiumType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
