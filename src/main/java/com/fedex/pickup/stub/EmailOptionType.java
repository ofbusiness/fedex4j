/**
 * EmailOptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class EmailOptionType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EmailOptionType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _PRODUCE_PAPERLESS_SHIPPING_FORMAT = "PRODUCE_PAPERLESS_SHIPPING_FORMAT";
    public static final String _SUPPRESS_ACCESS_EMAILS = "SUPPRESS_ACCESS_EMAILS";
    public static final String _SUPPRESS_ADDITIONAL_LANGUAGES = "SUPPRESS_ADDITIONAL_LANGUAGES";
    public static final EmailOptionType PRODUCE_PAPERLESS_SHIPPING_FORMAT = new EmailOptionType(_PRODUCE_PAPERLESS_SHIPPING_FORMAT);
    public static final EmailOptionType SUPPRESS_ACCESS_EMAILS = new EmailOptionType(_SUPPRESS_ACCESS_EMAILS);
    public static final EmailOptionType SUPPRESS_ADDITIONAL_LANGUAGES = new EmailOptionType(_SUPPRESS_ADDITIONAL_LANGUAGES);
    public String getValue() { return _value_;}
    public static EmailOptionType fromValue(String value)
          throws IllegalArgumentException {
        EmailOptionType enumeration = (EmailOptionType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static EmailOptionType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(EmailOptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "EmailOptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
