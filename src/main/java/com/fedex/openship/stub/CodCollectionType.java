/**
 * CodCollectionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class CodCollectionType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CodCollectionType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _ANY = "ANY";
    public static final String _CASH = "CASH";
    public static final String _COMPANY_CHECK = "COMPANY_CHECK";
    public static final String _GUARANTEED_FUNDS = "GUARANTEED_FUNDS";
    public static final String _PERSONAL_CHECK = "PERSONAL_CHECK";
    public static final CodCollectionType ANY = new CodCollectionType(_ANY);
    public static final CodCollectionType CASH = new CodCollectionType(_CASH);
    public static final CodCollectionType COMPANY_CHECK = new CodCollectionType(_COMPANY_CHECK);
    public static final CodCollectionType GUARANTEED_FUNDS = new CodCollectionType(_GUARANTEED_FUNDS);
    public static final CodCollectionType PERSONAL_CHECK = new CodCollectionType(_PERSONAL_CHECK);
    public String getValue() { return _value_;}
    public static CodCollectionType fromValue(String value)
          throws IllegalArgumentException {
        CodCollectionType enumeration = (CodCollectionType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static CodCollectionType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(CodCollectionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "CodCollectionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
