/**
 * AssociatedAccountNumberType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class AssociatedAccountNumberType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AssociatedAccountNumberType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _FEDEX_EXPRESS = "FEDEX_EXPRESS";
    public static final String _FEDEX_FREIGHT = "FEDEX_FREIGHT";
    public static final String _FEDEX_GROUND = "FEDEX_GROUND";
    public static final String _FEDEX_OFFICE = "FEDEX_OFFICE";
    public static final AssociatedAccountNumberType FEDEX_EXPRESS = new AssociatedAccountNumberType(_FEDEX_EXPRESS);
    public static final AssociatedAccountNumberType FEDEX_FREIGHT = new AssociatedAccountNumberType(_FEDEX_FREIGHT);
    public static final AssociatedAccountNumberType FEDEX_GROUND = new AssociatedAccountNumberType(_FEDEX_GROUND);
    public static final AssociatedAccountNumberType FEDEX_OFFICE = new AssociatedAccountNumberType(_FEDEX_OFFICE);
    public String getValue() { return _value_;}
    public static AssociatedAccountNumberType fromValue(String value)
          throws IllegalArgumentException {
        AssociatedAccountNumberType enumeration = (AssociatedAccountNumberType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static AssociatedAccountNumberType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(AssociatedAccountNumberType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v11", "AssociatedAccountNumberType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
