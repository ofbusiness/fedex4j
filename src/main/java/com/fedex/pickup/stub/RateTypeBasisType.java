/**
 * RateTypeBasisType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class RateTypeBasisType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RateTypeBasisType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _ACCOUNT = "ACCOUNT";
    public static final String _ACTUAL = "ACTUAL";
    public static final String _CURRENT = "CURRENT";
    public static final String _CUSTOM = "CUSTOM";
    public static final String _LIST = "LIST";
    public static final RateTypeBasisType ACCOUNT = new RateTypeBasisType(_ACCOUNT);
    public static final RateTypeBasisType ACTUAL = new RateTypeBasisType(_ACTUAL);
    public static final RateTypeBasisType CURRENT = new RateTypeBasisType(_CURRENT);
    public static final RateTypeBasisType CUSTOM = new RateTypeBasisType(_CUSTOM);
    public static final RateTypeBasisType LIST = new RateTypeBasisType(_LIST);
    public String getValue() { return _value_;}
    public static RateTypeBasisType fromValue(String value)
          throws IllegalArgumentException {
        RateTypeBasisType enumeration = (RateTypeBasisType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static RateTypeBasisType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(RateTypeBasisType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "RateTypeBasisType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
