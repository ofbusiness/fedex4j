/**
 * SmartPostIndiciaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class SmartPostIndiciaType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SmartPostIndiciaType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _MEDIA_MAIL = "MEDIA_MAIL";
    public static final String _PARCEL_RETURN = "PARCEL_RETURN";
    public static final String _PARCEL_SELECT = "PARCEL_SELECT";
    public static final String _PRESORTED_BOUND_PRINTED_MATTER = "PRESORTED_BOUND_PRINTED_MATTER";
    public static final String _PRESORTED_STANDARD = "PRESORTED_STANDARD";
    public static final SmartPostIndiciaType MEDIA_MAIL = new SmartPostIndiciaType(_MEDIA_MAIL);
    public static final SmartPostIndiciaType PARCEL_RETURN = new SmartPostIndiciaType(_PARCEL_RETURN);
    public static final SmartPostIndiciaType PARCEL_SELECT = new SmartPostIndiciaType(_PARCEL_SELECT);
    public static final SmartPostIndiciaType PRESORTED_BOUND_PRINTED_MATTER = new SmartPostIndiciaType(_PRESORTED_BOUND_PRINTED_MATTER);
    public static final SmartPostIndiciaType PRESORTED_STANDARD = new SmartPostIndiciaType(_PRESORTED_STANDARD);
    public String getValue() { return _value_;}
    public static SmartPostIndiciaType fromValue(String value)
          throws IllegalArgumentException {
        SmartPostIndiciaType enumeration = (SmartPostIndiciaType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static SmartPostIndiciaType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(SmartPostIndiciaType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "SmartPostIndiciaType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
