/**
 * TaxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class TaxType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TaxType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _EXPORT = "EXPORT";
    public static final String _GST = "GST";
    public static final String _HST = "HST";
    public static final String _INTRACOUNTRY = "INTRACOUNTRY";
    public static final String _OTHER = "OTHER";
    public static final String _PST = "PST";
    public static final String _VAT = "VAT";
    public static final TaxType EXPORT = new TaxType(_EXPORT);
    public static final TaxType GST = new TaxType(_GST);
    public static final TaxType HST = new TaxType(_HST);
    public static final TaxType INTRACOUNTRY = new TaxType(_INTRACOUNTRY);
    public static final TaxType OTHER = new TaxType(_OTHER);
    public static final TaxType PST = new TaxType(_PST);
    public static final TaxType VAT = new TaxType(_VAT);
    public String getValue() { return _value_;}
    public static TaxType fromValue(String value)
          throws IllegalArgumentException {
        TaxType enumeration = (TaxType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TaxType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(TaxType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "TaxType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
