/**
 * LabelStockType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.openship.stub;

public class LabelStockType implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LabelStockType(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _value1 = "PAPER_4X6";
    public static final String _value2 = "PAPER_4X8";
    public static final String _value3 = "PAPER_4X9";
    public static final String _value4 = "PAPER_6X4";
    public static final String _value5 = "PAPER_7X4.75";
    public static final String _value6 = "PAPER_8.5X11_BOTTOM_HALF_LABEL";
    public static final String _value7 = "PAPER_8.5X11_TOP_HALF_LABEL";
    public static final String _value8 = "PAPER_LETTER";
    public static final String _value9 = "STOCK_4X6";
    public static final String _value10 = "STOCK_4X6.75_LEADING_DOC_TAB";
    public static final String _value11 = "STOCK_4X6.75_TRAILING_DOC_TAB";
    public static final String _value12 = "STOCK_4X8";
    public static final String _value13 = "STOCK_4X9_LEADING_DOC_TAB";
    public static final String _value14 = "STOCK_4X9_TRAILING_DOC_TAB";
    public static final LabelStockType value1 = new LabelStockType(_value1);
    public static final LabelStockType value2 = new LabelStockType(_value2);
    public static final LabelStockType value3 = new LabelStockType(_value3);
    public static final LabelStockType value4 = new LabelStockType(_value4);
    public static final LabelStockType value5 = new LabelStockType(_value5);
    public static final LabelStockType value6 = new LabelStockType(_value6);
    public static final LabelStockType value7 = new LabelStockType(_value7);
    public static final LabelStockType value8 = new LabelStockType(_value8);
    public static final LabelStockType value9 = new LabelStockType(_value9);
    public static final LabelStockType value10 = new LabelStockType(_value10);
    public static final LabelStockType value11 = new LabelStockType(_value11);
    public static final LabelStockType value12 = new LabelStockType(_value12);
    public static final LabelStockType value13 = new LabelStockType(_value13);
    public static final LabelStockType value14 = new LabelStockType(_value14);
    public String getValue() { return _value_;}
    public static LabelStockType fromValue(String value)
          throws IllegalArgumentException {
        LabelStockType enumeration = (LabelStockType)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static LabelStockType fromString(String value)
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
        new org.apache.axis.description.TypeDesc(LabelStockType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/openship/v9", "LabelStockType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
