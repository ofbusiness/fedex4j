/**
 * LabelRotationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class LabelRotationType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LabelRotationType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _LEFT = "LEFT";
    public static final String _NONE = "NONE";
    public static final String _RIGHT = "RIGHT";
    public static final String _UPSIDE_DOWN = "UPSIDE_DOWN";
    public static final LabelRotationType LEFT = new LabelRotationType(_LEFT);
    public static final LabelRotationType NONE = new LabelRotationType(_NONE);
    public static final LabelRotationType RIGHT = new LabelRotationType(_RIGHT);
    public static final LabelRotationType UPSIDE_DOWN = new LabelRotationType(_UPSIDE_DOWN);
    public String getValue() { return _value_;}
    public static LabelRotationType fromValue(String value)
          throws IllegalArgumentException {
        LabelRotationType enumeration = (LabelRotationType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static LabelRotationType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(LabelRotationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelRotationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
