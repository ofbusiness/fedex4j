/**
 * ReturnType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class ReturnType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReturnType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _FEDEX_TAG = "FEDEX_TAG";
    public static final String _NET_RETURN = "NET_RETURN";
    public static final String _PENDING = "PENDING";
    public static final String _PRINT_RETURN_LABEL = "PRINT_RETURN_LABEL";
    public static final String _VOICE_CALL_TAG = "VOICE_CALL_TAG";
    public static final ReturnType FEDEX_TAG = new ReturnType(_FEDEX_TAG);
    public static final ReturnType NET_RETURN = new ReturnType(_NET_RETURN);
    public static final ReturnType PENDING = new ReturnType(_PENDING);
    public static final ReturnType PRINT_RETURN_LABEL = new ReturnType(_PRINT_RETURN_LABEL);
    public static final ReturnType VOICE_CALL_TAG = new ReturnType(_VOICE_CALL_TAG);
    public String getValue() { return _value_;}
    public static ReturnType fromValue(String value)
          throws IllegalArgumentException {
        ReturnType enumeration = (ReturnType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static ReturnType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(ReturnType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "ReturnType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
